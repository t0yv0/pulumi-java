package io.pulumi.scala

import com.google.protobuf.struct.Value.Kind.NumberValue
import com.google.protobuf.struct.{Struct, Value}
import pulumirpc.resource.{
  RegisterResourceOutputsRequest,
  RegisterResourceRequest,
  RegisterResourceResponse
}

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.io.Source
import scala.util.{Failure, Success}

object netty {
  object channel {

    import io.grpc.ManagedChannel
    import io.grpc.netty.NettyChannelBuilder
    import io.netty.channel.epoll.{
      Epoll,
      EpollDomainSocketChannel,
      EpollEventLoopGroup
    }
    import io.netty.channel.kqueue.{
      KQueue,
      KQueueDomainSocketChannel,
      KQueueEventLoopGroup
    }
    import io.netty.channel.unix.DomainSocketAddress

    import java.io.IOException

    @throws[IOException]
    def builder(url: String): NettyChannelBuilder =
      url match {
        case url if url.startsWith("unix:") =>
          val address = new DomainSocketAddress(url.replaceFirst("^unix:", ""))
          val builder = NettyChannelBuilder.forAddress(address)
          if (Epoll.isAvailable)
            builder
              .channelType(classOf[EpollDomainSocketChannel])
              .eventLoopGroup(new EpollEventLoopGroup)
          else if (KQueue.isAvailable)
            builder
              .channelType(classOf[KQueueDomainSocketChannel])
              .eventLoopGroup(new KQueueEventLoopGroup)
          else
            throw new IOException(
              "Unix domain sockets are unsupported on this platform"
            )
        case url => NettyChannelBuilder.forTarget(url)
      }

    // MaxRpcMessageSizeInBytes raises the gRPC Max Message size from `4194304` (4mb) to `419430400` (400mb)
    val MaxRpcMessageSizeInBytes: Int = 400 * 1024 * 1024

    @throws[IOException]
    def build(url: String): ManagedChannel = builder(url)
      .usePlaintext() // disable TLS
      .maxInboundMessageSize(MaxRpcMessageSizeInBytes)
      .build()
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    import io.grpc.ManagedChannel
    import pulumirpc.resource.ResourceMonitorGrpc

    import scala.concurrent.ExecutionContext.Implicits.global

    val project = sys.env("PULUMI_PROJECT")
    val stack = sys.env("PULUMI_STACK")
    val monitorTarget = sys.env("PULUMI_MONITOR")
    println("PULUMI_MONITOR=" + monitorTarget)

    val randomVersion =
      Source.fromResource("io/pulumi/random/version.txt").mkString
    println("randomVersion=" + randomVersion)

    def urn(project: String, stack: String, `type`: String, name: String) =
      s"urn:pulumi:$stack::$project::${`type`}::$name"

    val rootStackType = s"pulumi:pulumi:Stack"
    val rootStackName = s"$project-$stack"

    val channel: ManagedChannel = netty.channel.build(monitorTarget)
//    val stub = ResourceMonitorGrpc.stub(channel)
    val stub = ResourceMonitorGrpc.blockingStub(channel)
    val request = RegisterResourceRequest(
      `type` = "random:index/randomInteger:RandomInteger",
      name = "my-int",
      version = randomVersion,
      custom = true,
      `object` = Some(
        Struct.of(
          Map(
            "min" -> Value.of(NumberValue(0)),
            "max" -> Value.of(NumberValue(10))
          )
        )
      )
    )
//    val f: Future[RegisterResourceResponse] = stub.registerResource(request)
//    f.onComplete {
//      case Success(r) => println("RegisterResourceResponse="+r)
//      case Failure(t) => throw new IllegalStateException(t)
//    }
    println("RegisterResourceRequest=" + request)
    val r: RegisterResourceResponse = stub.registerResource(request)
    println("RegisterResourceResponse=" + r)

    val r2 = stub.registerResourceOutputs(
      RegisterResourceOutputsRequest(
//        urn = urn(project, stack, rootStackType, rootStackName),
        urn = r.urn,
        outputs = r.`object`
      )
    )
    println("RegisterResourceOutputsRequest=" + r2)
  }
}
