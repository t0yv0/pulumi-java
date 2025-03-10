// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigGuestAcceleratorArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigGuestAcceleratorArgs Empty = new NodePoolNodeConfigGuestAcceleratorArgs();

    @Import(name="count", required=true)
    private Output<Integer> count;

    public Output<Integer> count() {
        return this.count;
    }

    @Import(name="gpuPartitionSize")
    private @Nullable Output<String> gpuPartitionSize;

    public Optional<Output<String>> gpuPartitionSize() {
        return Optional.ofNullable(this.gpuPartitionSize);
    }

    /**
     * The type of the policy. Supports a single value: COMPACT.
     * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
     * physical proximity in order to reduce network latency between nodes.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the policy. Supports a single value: COMPACT.
     * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
     * physical proximity in order to reduce network latency between nodes.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private NodePoolNodeConfigGuestAcceleratorArgs() {}

    private NodePoolNodeConfigGuestAcceleratorArgs(NodePoolNodeConfigGuestAcceleratorArgs $) {
        this.count = $.count;
        this.gpuPartitionSize = $.gpuPartitionSize;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigGuestAcceleratorArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigGuestAcceleratorArgs();
        }

        public Builder(NodePoolNodeConfigGuestAcceleratorArgs defaults) {
            $ = new NodePoolNodeConfigGuestAcceleratorArgs(Objects.requireNonNull(defaults));
        }

        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        public Builder gpuPartitionSize(@Nullable Output<String> gpuPartitionSize) {
            $.gpuPartitionSize = gpuPartitionSize;
            return this;
        }

        public Builder gpuPartitionSize(String gpuPartitionSize) {
            return gpuPartitionSize(Output.of(gpuPartitionSize));
        }

        /**
         * @param type The type of the policy. Supports a single value: COMPACT.
         * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
         * physical proximity in order to reduce network latency between nodes.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the policy. Supports a single value: COMPACT.
         * Specifying COMPACT placement policy type places node pool&#39;s nodes in a closer
         * physical proximity in order to reduce network latency between nodes.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NodePoolNodeConfigGuestAcceleratorArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
