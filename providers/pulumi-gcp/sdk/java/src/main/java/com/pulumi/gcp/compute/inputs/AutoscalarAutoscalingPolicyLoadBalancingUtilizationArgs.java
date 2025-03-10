// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs Empty = new AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs();

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target", required=true)
    private Output<Double> target;

    /**
     * @return Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    public Output<Double> target() {
        return this.target;
    }

    private AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs() {}

    private AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs(AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs $) {
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs $;

        public Builder() {
            $ = new AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs();
        }

        public Builder(AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
            $ = new AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param target Fraction of backend capacity utilization (set in HTTP(s) load
         * balancing configuration) that autoscaler should maintain. Must
         * be a positive float value. If not defined, the default is 0.8.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<Double> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Fraction of backend capacity utilization (set in HTTP(s) load
         * balancing configuration) that autoscaler should maintain. Must
         * be a positive float value. If not defined, the default is 0.8.
         * 
         * @return builder
         * 
         */
        public Builder target(Double target) {
            return target(Output.of(target));
        }

        public AutoscalarAutoscalingPolicyLoadBalancingUtilizationArgs build() {
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
