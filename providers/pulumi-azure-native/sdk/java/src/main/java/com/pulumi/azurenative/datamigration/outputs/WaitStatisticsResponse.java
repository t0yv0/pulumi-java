// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WaitStatisticsResponse {
    /**
     * @return Total no. of waits
     * 
     */
    private final Double waitCount;
    /**
     * @return Total wait time in millisecond(s)
     * 
     */
    private final Double waitTimeMs;
    /**
     * @return Type of the Wait
     * 
     */
    private final String waitType;

    @CustomType.Constructor
    private WaitStatisticsResponse(
        @CustomType.Parameter("waitCount") Double waitCount,
        @CustomType.Parameter("waitTimeMs") Double waitTimeMs,
        @CustomType.Parameter("waitType") String waitType) {
        this.waitCount = waitCount;
        this.waitTimeMs = waitTimeMs;
        this.waitType = waitType;
    }

    /**
     * @return Total no. of waits
     * 
     */
    public Double waitCount() {
        return this.waitCount;
    }
    /**
     * @return Total wait time in millisecond(s)
     * 
     */
    public Double waitTimeMs() {
        return this.waitTimeMs;
    }
    /**
     * @return Type of the Wait
     * 
     */
    public String waitType() {
        return this.waitType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double waitCount;
        private Double waitTimeMs;
        private String waitType;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.waitCount = defaults.waitCount;
    	      this.waitTimeMs = defaults.waitTimeMs;
    	      this.waitType = defaults.waitType;
        }

        public Builder waitCount(Double waitCount) {
            this.waitCount = Objects.requireNonNull(waitCount);
            return this;
        }
        public Builder waitTimeMs(Double waitTimeMs) {
            this.waitTimeMs = Objects.requireNonNull(waitTimeMs);
            return this;
        }
        public Builder waitType(String waitType) {
            this.waitType = Objects.requireNonNull(waitType);
            return this;
        }        public WaitStatisticsResponse build() {
            return new WaitStatisticsResponse(waitCount, waitTimeMs, waitType);
        }
    }
}
