// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RangePartitioningRangeResponse {
    /**
     * @return [TrustedTester] [Required] The end of range partitioning, exclusive.
     * 
     */
    private final String end;
    /**
     * @return [TrustedTester] [Required] The width of each interval.
     * 
     */
    private final String interval;
    /**
     * @return [TrustedTester] [Required] The start of range partitioning, inclusive.
     * 
     */
    private final String start;

    @CustomType.Constructor
    private RangePartitioningRangeResponse(
        @CustomType.Parameter("end") String end,
        @CustomType.Parameter("interval") String interval,
        @CustomType.Parameter("start") String start) {
        this.end = end;
        this.interval = interval;
        this.start = start;
    }

    /**
     * @return [TrustedTester] [Required] The end of range partitioning, exclusive.
     * 
     */
    public String end() {
        return this.end;
    }
    /**
     * @return [TrustedTester] [Required] The width of each interval.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return [TrustedTester] [Required] The start of range partitioning, inclusive.
     * 
     */
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RangePartitioningRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String end;
        private String interval;
        private String start;

        public Builder() {
    	      // Empty
        }

        public Builder(RangePartitioningRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.interval = defaults.interval;
    	      this.start = defaults.start;
        }

        public Builder end(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }        public RangePartitioningRangeResponse build() {
            return new RangePartitioningRangeResponse(end, interval, start);
        }
    }
}
