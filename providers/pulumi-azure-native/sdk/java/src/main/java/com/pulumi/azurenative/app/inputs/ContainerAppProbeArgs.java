// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.azurenative.app.enums.Type;
import com.pulumi.azurenative.app.inputs.ContainerAppProbeHttpGetArgs;
import com.pulumi.azurenative.app.inputs.ContainerAppProbeTcpSocketArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
public final class ContainerAppProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerAppProbeArgs Empty = new ContainerAppProbeArgs();

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Maximum value is 10.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Maximum value is 10.
     * 
     */
    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * HTTPGet specifies the http request to perform.
     * 
     */
    @Import(name="httpGet")
    private @Nullable Output<ContainerAppProbeHttpGetArgs> httpGet;

    /**
     * @return HTTPGet specifies the http request to perform.
     * 
     */
    public Optional<Output<ContainerAppProbeHttpGetArgs>> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }

    /**
     * Number of seconds after the container has started before liveness probes are initiated. Minimum value is 1. Maximum value is 60.
     * 
     */
    @Import(name="initialDelaySeconds")
    private @Nullable Output<Integer> initialDelaySeconds;

    /**
     * @return Number of seconds after the container has started before liveness probes are initiated. Minimum value is 1. Maximum value is 60.
     * 
     */
    public Optional<Output<Integer>> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 240.
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Output<Integer> periodSeconds;

    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 240.
     * 
     */
    public Optional<Output<Integer>> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Maximum value is 10.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Integer> successThreshold;

    /**
     * @return Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Maximum value is 10.
     * 
     */
    public Optional<Output<Integer>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
     * 
     */
    @Import(name="tcpSocket")
    private @Nullable Output<ContainerAppProbeTcpSocketArgs> tcpSocket;

    /**
     * @return TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
     * 
     */
    public Optional<Output<ContainerAppProbeTcpSocketArgs>> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. Maximum value is 3600 seconds (1 hour)
     * 
     */
    @Import(name="terminationGracePeriodSeconds")
    private @Nullable Output<Double> terminationGracePeriodSeconds;

    /**
     * @return Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. Maximum value is 3600 seconds (1 hour)
     * 
     */
    public Optional<Output<Double>> terminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 240.
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 240.
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    /**
     * The type of probe.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,Type>> type;

    /**
     * @return The type of probe.
     * 
     */
    public Optional<Output<Either<String,Type>>> type() {
        return Optional.ofNullable(this.type);
    }

    private ContainerAppProbeArgs() {}

    private ContainerAppProbeArgs(ContainerAppProbeArgs $) {
        this.failureThreshold = $.failureThreshold;
        this.httpGet = $.httpGet;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.successThreshold = $.successThreshold;
        this.tcpSocket = $.tcpSocket;
        this.terminationGracePeriodSeconds = $.terminationGracePeriodSeconds;
        this.timeoutSeconds = $.timeoutSeconds;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerAppProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerAppProbeArgs $;

        public Builder() {
            $ = new ContainerAppProbeArgs();
        }

        public Builder(ContainerAppProbeArgs defaults) {
            $ = new ContainerAppProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Maximum value is 10.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. Maximum value is 10.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        /**
         * @param httpGet HTTPGet specifies the http request to perform.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(@Nullable Output<ContainerAppProbeHttpGetArgs> httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        /**
         * @param httpGet HTTPGet specifies the http request to perform.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(ContainerAppProbeHttpGetArgs httpGet) {
            return httpGet(Output.of(httpGet));
        }

        /**
         * @param initialDelaySeconds Number of seconds after the container has started before liveness probes are initiated. Minimum value is 1. Maximum value is 60.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * @param initialDelaySeconds Number of seconds after the container has started before liveness probes are initiated. Minimum value is 1. Maximum value is 60.
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            return initialDelaySeconds(Output.of(initialDelaySeconds));
        }

        /**
         * @param periodSeconds How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 240.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param periodSeconds How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value is 240.
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        /**
         * @param successThreshold Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Maximum value is 10.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        /**
         * @param successThreshold Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness and startup. Minimum value is 1. Maximum value is 10.
         * 
         * @return builder
         * 
         */
        public Builder successThreshold(Integer successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        /**
         * @param tcpSocket TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
         * 
         * @return builder
         * 
         */
        public Builder tcpSocket(@Nullable Output<ContainerAppProbeTcpSocketArgs> tcpSocket) {
            $.tcpSocket = tcpSocket;
            return this;
        }

        /**
         * @param tcpSocket TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported.
         * 
         * @return builder
         * 
         */
        public Builder tcpSocket(ContainerAppProbeTcpSocketArgs tcpSocket) {
            return tcpSocket(Output.of(tcpSocket));
        }

        /**
         * @param terminationGracePeriodSeconds Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. Maximum value is 3600 seconds (1 hour)
         * 
         * @return builder
         * 
         */
        public Builder terminationGracePeriodSeconds(@Nullable Output<Double> terminationGracePeriodSeconds) {
            $.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * @param terminationGracePeriodSeconds Optional duration in seconds the pod needs to terminate gracefully upon probe failure. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. If this value is nil, the pod&#39;s terminationGracePeriodSeconds will be used. Otherwise, this value overrides the value provided by the pod spec. Value must be non-negative integer. The value zero indicates stop immediately via the kill signal (no opportunity to shut down). This is an alpha field and requires enabling ProbeTerminationGracePeriod feature gate. Maximum value is 3600 seconds (1 hour)
         * 
         * @return builder
         * 
         */
        public Builder terminationGracePeriodSeconds(Double terminationGracePeriodSeconds) {
            return terminationGracePeriodSeconds(Output.of(terminationGracePeriodSeconds));
        }

        /**
         * @param timeoutSeconds Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 240.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 240.
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        /**
         * @param type The type of probe.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,Type>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of probe.
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,Type> type) {
            return type(Output.of(type));
        }

        /**
         * @param type The type of probe.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type The type of probe.
         * 
         * @return builder
         * 
         */
        public Builder type(Type type) {
            return type(Either.ofRight(type));
        }

        public ContainerAppProbeArgs build() {
            return $;
        }
    }

}
