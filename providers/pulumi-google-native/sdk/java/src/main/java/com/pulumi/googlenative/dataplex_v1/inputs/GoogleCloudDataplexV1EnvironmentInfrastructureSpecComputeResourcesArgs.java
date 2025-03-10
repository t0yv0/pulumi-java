// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Compute resources associated with the analyze interactive workloads.
 * 
 */
public final class GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs Empty = new GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs();

    /**
     * Optional. Size in GB of the disk. Default is 100 GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return Optional. Size in GB of the disk. Default is 100 GB.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Optional. Max configurable nodes. If max_node_count &gt; node_count, then auto-scaling is enabled.
     * 
     */
    @Import(name="maxNodeCount")
    private @Nullable Output<Integer> maxNodeCount;

    /**
     * @return Optional. Max configurable nodes. If max_node_count &gt; node_count, then auto-scaling is enabled.
     * 
     */
    public Optional<Output<Integer>> maxNodeCount() {
        return Optional.ofNullable(this.maxNodeCount);
    }

    /**
     * Optional. Total number of nodes in the sessions created for this environment.
     * 
     */
    @Import(name="nodeCount")
    private @Nullable Output<Integer> nodeCount;

    /**
     * @return Optional. Total number of nodes in the sessions created for this environment.
     * 
     */
    public Optional<Output<Integer>> nodeCount() {
        return Optional.ofNullable(this.nodeCount);
    }

    private GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs() {}

    private GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs(GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs $) {
        this.diskSizeGb = $.diskSizeGb;
        this.maxNodeCount = $.maxNodeCount;
        this.nodeCount = $.nodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs();
        }

        public Builder(GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs defaults) {
            $ = new GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskSizeGb Optional. Size in GB of the disk. Default is 100 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Optional. Size in GB of the disk. Default is 100 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param maxNodeCount Optional. Max configurable nodes. If max_node_count &gt; node_count, then auto-scaling is enabled.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeCount(@Nullable Output<Integer> maxNodeCount) {
            $.maxNodeCount = maxNodeCount;
            return this;
        }

        /**
         * @param maxNodeCount Optional. Max configurable nodes. If max_node_count &gt; node_count, then auto-scaling is enabled.
         * 
         * @return builder
         * 
         */
        public Builder maxNodeCount(Integer maxNodeCount) {
            return maxNodeCount(Output.of(maxNodeCount));
        }

        /**
         * @param nodeCount Optional. Total number of nodes in the sessions created for this environment.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(@Nullable Output<Integer> nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        /**
         * @param nodeCount Optional. Total number of nodes in the sessions created for this environment.
         * 
         * @return builder
         * 
         */
        public Builder nodeCount(Integer nodeCount) {
            return nodeCount(Output.of(nodeCount));
        }

        public GoogleCloudDataplexV1EnvironmentInfrastructureSpecComputeResourcesArgs build() {
            return $;
        }
    }

}
