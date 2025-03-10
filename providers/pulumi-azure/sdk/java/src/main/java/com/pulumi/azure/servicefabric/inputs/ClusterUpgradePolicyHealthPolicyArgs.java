// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterUpgradePolicyHealthPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterUpgradePolicyHealthPolicyArgs Empty = new ClusterUpgradePolicyHealthPolicyArgs();

    @Import(name="maxUnhealthyApplicationsPercent")
    private @Nullable Output<Integer> maxUnhealthyApplicationsPercent;

    public Optional<Output<Integer>> maxUnhealthyApplicationsPercent() {
        return Optional.ofNullable(this.maxUnhealthyApplicationsPercent);
    }

    @Import(name="maxUnhealthyNodesPercent")
    private @Nullable Output<Integer> maxUnhealthyNodesPercent;

    public Optional<Output<Integer>> maxUnhealthyNodesPercent() {
        return Optional.ofNullable(this.maxUnhealthyNodesPercent);
    }

    private ClusterUpgradePolicyHealthPolicyArgs() {}

    private ClusterUpgradePolicyHealthPolicyArgs(ClusterUpgradePolicyHealthPolicyArgs $) {
        this.maxUnhealthyApplicationsPercent = $.maxUnhealthyApplicationsPercent;
        this.maxUnhealthyNodesPercent = $.maxUnhealthyNodesPercent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterUpgradePolicyHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterUpgradePolicyHealthPolicyArgs $;

        public Builder() {
            $ = new ClusterUpgradePolicyHealthPolicyArgs();
        }

        public Builder(ClusterUpgradePolicyHealthPolicyArgs defaults) {
            $ = new ClusterUpgradePolicyHealthPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxUnhealthyApplicationsPercent(@Nullable Output<Integer> maxUnhealthyApplicationsPercent) {
            $.maxUnhealthyApplicationsPercent = maxUnhealthyApplicationsPercent;
            return this;
        }

        public Builder maxUnhealthyApplicationsPercent(Integer maxUnhealthyApplicationsPercent) {
            return maxUnhealthyApplicationsPercent(Output.of(maxUnhealthyApplicationsPercent));
        }

        public Builder maxUnhealthyNodesPercent(@Nullable Output<Integer> maxUnhealthyNodesPercent) {
            $.maxUnhealthyNodesPercent = maxUnhealthyNodesPercent;
            return this;
        }

        public Builder maxUnhealthyNodesPercent(Integer maxUnhealthyNodesPercent) {
            return maxUnhealthyNodesPercent(Output.of(maxUnhealthyNodesPercent));
        }

        public ClusterUpgradePolicyHealthPolicyArgs build() {
            return $;
        }
    }

}
