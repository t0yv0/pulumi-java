// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GoogleMonitoringV3RangeResponse {
    /**
     * @return Range maximum.
     * 
     */
    private final Double max;
    /**
     * @return Range minimum.
     * 
     */
    private final Double min;

    @CustomType.Constructor
    private GoogleMonitoringV3RangeResponse(
        @CustomType.Parameter("max") Double max,
        @CustomType.Parameter("min") Double min) {
        this.max = max;
        this.min = min;
    }

    /**
     * @return Range maximum.
     * 
     */
    public Double max() {
        return this.max;
    }
    /**
     * @return Range minimum.
     * 
     */
    public Double min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleMonitoringV3RangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double max;
        private Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleMonitoringV3RangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(Double max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        public Builder min(Double min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }        public GoogleMonitoringV3RangeResponse build() {
            return new GoogleMonitoringV3RangeResponse(max, min);
        }
    }
}
