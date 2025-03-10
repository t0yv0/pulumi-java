// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.outputs;

import com.pulumi.awsnative.cloudwatch.outputs.MetricStreamStatisticsMetric;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetricStreamStatisticsConfiguration {
    /**
     * @return The additional statistics to stream for the metrics listed in IncludeMetrics.
     * 
     */
    private final List<String> additionalStatistics;
    /**
     * @return An array that defines the metrics that are to have additional statistics streamed.
     * 
     */
    private final List<MetricStreamStatisticsMetric> includeMetrics;

    @CustomType.Constructor
    private MetricStreamStatisticsConfiguration(
        @CustomType.Parameter("additionalStatistics") List<String> additionalStatistics,
        @CustomType.Parameter("includeMetrics") List<MetricStreamStatisticsMetric> includeMetrics) {
        this.additionalStatistics = additionalStatistics;
        this.includeMetrics = includeMetrics;
    }

    /**
     * @return The additional statistics to stream for the metrics listed in IncludeMetrics.
     * 
     */
    public List<String> additionalStatistics() {
        return this.additionalStatistics;
    }
    /**
     * @return An array that defines the metrics that are to have additional statistics streamed.
     * 
     */
    public List<MetricStreamStatisticsMetric> includeMetrics() {
        return this.includeMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamStatisticsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalStatistics;
        private List<MetricStreamStatisticsMetric> includeMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamStatisticsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalStatistics = defaults.additionalStatistics;
    	      this.includeMetrics = defaults.includeMetrics;
        }

        public Builder additionalStatistics(List<String> additionalStatistics) {
            this.additionalStatistics = Objects.requireNonNull(additionalStatistics);
            return this;
        }
        public Builder additionalStatistics(String... additionalStatistics) {
            return additionalStatistics(List.of(additionalStatistics));
        }
        public Builder includeMetrics(List<MetricStreamStatisticsMetric> includeMetrics) {
            this.includeMetrics = Objects.requireNonNull(includeMetrics);
            return this;
        }
        public Builder includeMetrics(MetricStreamStatisticsMetric... includeMetrics) {
            return includeMetrics(List.of(includeMetrics));
        }        public MetricStreamStatisticsConfiguration build() {
            return new MetricStreamStatisticsConfiguration(additionalStatistics, includeMetrics);
        }
    }
}
