// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.monitoring_v3.outputs.BasicSliResponse;
import com.pulumi.googlenative.monitoring_v3.outputs.RequestBasedSliResponse;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class PerformanceThresholdResponse {
    /**
     * @return BasicSli to evaluate to judge window quality.
     * 
     */
    private final BasicSliResponse basicSliPerformance;
    /**
     * @return RequestBasedSli to evaluate to judge window quality.
     * 
     */
    private final RequestBasedSliResponse performance;
    /**
     * @return If window performance &gt;= threshold, the window is counted as good.
     * 
     */
    private final Double threshold;

    @CustomType.Constructor
    private PerformanceThresholdResponse(
        @CustomType.Parameter("basicSliPerformance") BasicSliResponse basicSliPerformance,
        @CustomType.Parameter("performance") RequestBasedSliResponse performance,
        @CustomType.Parameter("threshold") Double threshold) {
        this.basicSliPerformance = basicSliPerformance;
        this.performance = performance;
        this.threshold = threshold;
    }

    /**
     * @return BasicSli to evaluate to judge window quality.
     * 
     */
    public BasicSliResponse basicSliPerformance() {
        return this.basicSliPerformance;
    }
    /**
     * @return RequestBasedSli to evaluate to judge window quality.
     * 
     */
    public RequestBasedSliResponse performance() {
        return this.performance;
    }
    /**
     * @return If window performance &gt;= threshold, the window is counted as good.
     * 
     */
    public Double threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceThresholdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicSliResponse basicSliPerformance;
        private RequestBasedSliResponse performance;
        private Double threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceThresholdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicSliPerformance = defaults.basicSliPerformance;
    	      this.performance = defaults.performance;
    	      this.threshold = defaults.threshold;
        }

        public Builder basicSliPerformance(BasicSliResponse basicSliPerformance) {
            this.basicSliPerformance = Objects.requireNonNull(basicSliPerformance);
            return this;
        }
        public Builder performance(RequestBasedSliResponse performance) {
            this.performance = Objects.requireNonNull(performance);
            return this;
        }
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }        public PerformanceThresholdResponse build() {
            return new PerformanceThresholdResponse(basicSliPerformance, performance, threshold);
        }
    }
}
