// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNetworkConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNetworkConfigArgs Empty = new NodePoolNetworkConfigArgs();

    @Import(name="createPodRange")
    private @Nullable Output<Boolean> createPodRange;

    public Optional<Output<Boolean>> createPodRange() {
        return Optional.ofNullable(this.createPodRange);
    }

    @Import(name="podIpv4CidrBlock")
    private @Nullable Output<String> podIpv4CidrBlock;

    public Optional<Output<String>> podIpv4CidrBlock() {
        return Optional.ofNullable(this.podIpv4CidrBlock);
    }

    @Import(name="podRange", required=true)
    private Output<String> podRange;

    public Output<String> podRange() {
        return this.podRange;
    }

    private NodePoolNetworkConfigArgs() {}

    private NodePoolNetworkConfigArgs(NodePoolNetworkConfigArgs $) {
        this.createPodRange = $.createPodRange;
        this.podIpv4CidrBlock = $.podIpv4CidrBlock;
        this.podRange = $.podRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNetworkConfigArgs $;

        public Builder() {
            $ = new NodePoolNetworkConfigArgs();
        }

        public Builder(NodePoolNetworkConfigArgs defaults) {
            $ = new NodePoolNetworkConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder createPodRange(@Nullable Output<Boolean> createPodRange) {
            $.createPodRange = createPodRange;
            return this;
        }

        public Builder createPodRange(Boolean createPodRange) {
            return createPodRange(Output.of(createPodRange));
        }

        public Builder podIpv4CidrBlock(@Nullable Output<String> podIpv4CidrBlock) {
            $.podIpv4CidrBlock = podIpv4CidrBlock;
            return this;
        }

        public Builder podIpv4CidrBlock(String podIpv4CidrBlock) {
            return podIpv4CidrBlock(Output.of(podIpv4CidrBlock));
        }

        public Builder podRange(Output<String> podRange) {
            $.podRange = podRange;
            return this;
        }

        public Builder podRange(String podRange) {
            return podRange(Output.of(podRange));
        }

        public NodePoolNetworkConfigArgs build() {
            $.podRange = Objects.requireNonNull($.podRange, "expected parameter 'podRange' to be non-null");
            return $;
        }
    }

}
