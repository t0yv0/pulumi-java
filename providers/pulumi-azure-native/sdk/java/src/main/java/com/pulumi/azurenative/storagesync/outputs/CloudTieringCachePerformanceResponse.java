// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudTieringCachePerformanceResponse {
    /**
     * @return Count of bytes that were served from the local server
     * 
     */
    private final Double cacheHitBytes;
    /**
     * @return Percentage of total bytes (hit + miss) that were served from the local server
     * 
     */
    private final Integer cacheHitBytesPercent;
    /**
     * @return Count of bytes that were served from the cloud
     * 
     */
    private final Double cacheMissBytes;
    /**
     * @return Last updated timestamp
     * 
     */
    private final String lastUpdatedTimestamp;

    @CustomType.Constructor
    private CloudTieringCachePerformanceResponse(
        @CustomType.Parameter("cacheHitBytes") Double cacheHitBytes,
        @CustomType.Parameter("cacheHitBytesPercent") Integer cacheHitBytesPercent,
        @CustomType.Parameter("cacheMissBytes") Double cacheMissBytes,
        @CustomType.Parameter("lastUpdatedTimestamp") String lastUpdatedTimestamp) {
        this.cacheHitBytes = cacheHitBytes;
        this.cacheHitBytesPercent = cacheHitBytesPercent;
        this.cacheMissBytes = cacheMissBytes;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * @return Count of bytes that were served from the local server
     * 
     */
    public Double cacheHitBytes() {
        return this.cacheHitBytes;
    }
    /**
     * @return Percentage of total bytes (hit + miss) that were served from the local server
     * 
     */
    public Integer cacheHitBytesPercent() {
        return this.cacheHitBytesPercent;
    }
    /**
     * @return Count of bytes that were served from the cloud
     * 
     */
    public Double cacheMissBytes() {
        return this.cacheMissBytes;
    }
    /**
     * @return Last updated timestamp
     * 
     */
    public String lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudTieringCachePerformanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cacheHitBytes;
        private Integer cacheHitBytesPercent;
        private Double cacheMissBytes;
        private String lastUpdatedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudTieringCachePerformanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheHitBytes = defaults.cacheHitBytes;
    	      this.cacheHitBytesPercent = defaults.cacheHitBytesPercent;
    	      this.cacheMissBytes = defaults.cacheMissBytes;
    	      this.lastUpdatedTimestamp = defaults.lastUpdatedTimestamp;
        }

        public Builder cacheHitBytes(Double cacheHitBytes) {
            this.cacheHitBytes = Objects.requireNonNull(cacheHitBytes);
            return this;
        }
        public Builder cacheHitBytesPercent(Integer cacheHitBytesPercent) {
            this.cacheHitBytesPercent = Objects.requireNonNull(cacheHitBytesPercent);
            return this;
        }
        public Builder cacheMissBytes(Double cacheMissBytes) {
            this.cacheMissBytes = Objects.requireNonNull(cacheMissBytes);
            return this;
        }
        public Builder lastUpdatedTimestamp(String lastUpdatedTimestamp) {
            this.lastUpdatedTimestamp = Objects.requireNonNull(lastUpdatedTimestamp);
            return this;
        }        public CloudTieringCachePerformanceResponse build() {
            return new CloudTieringCachePerformanceResponse(cacheHitBytes, cacheHitBytesPercent, cacheMissBytes, lastUpdatedTimestamp);
        }
    }
}
