// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class AutoscalingPolicyLoadBalancingUtilizationResponse {
    /**
     * @return Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    private final Double utilizationTarget;

    @CustomType.Constructor
    private AutoscalingPolicyLoadBalancingUtilizationResponse(@CustomType.Parameter("utilizationTarget") Double utilizationTarget) {
        this.utilizationTarget = utilizationTarget;
    }

    /**
     * @return Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    public Double utilizationTarget() {
        return this.utilizationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyLoadBalancingUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyLoadBalancingUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder utilizationTarget(Double utilizationTarget) {
            this.utilizationTarget = Objects.requireNonNull(utilizationTarget);
            return this;
        }        public AutoscalingPolicyLoadBalancingUtilizationResponse build() {
            return new AutoscalingPolicyLoadBalancingUtilizationResponse(utilizationTarget);
        }
    }
}
