// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse {
    /**
     * @return Number of records within these probability bounds.
     * 
     */
    private final String bucketSize;
    /**
     * @return Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    private final String bucketValueCount;
    /**
     * @return Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    private final List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues;
    /**
     * @return Always greater than or equal to min_probability.
     * 
     */
    private final Double maxProbability;
    /**
     * @return Between 0 and 1.
     * 
     */
    private final Double minProbability;

    @CustomType.Constructor
    private GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse(
        @CustomType.Parameter("bucketSize") String bucketSize,
        @CustomType.Parameter("bucketValueCount") String bucketValueCount,
        @CustomType.Parameter("bucketValues") List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues,
        @CustomType.Parameter("maxProbability") Double maxProbability,
        @CustomType.Parameter("minProbability") Double minProbability) {
        this.bucketSize = bucketSize;
        this.bucketValueCount = bucketValueCount;
        this.bucketValues = bucketValues;
        this.maxProbability = maxProbability;
        this.minProbability = minProbability;
    }

    /**
     * @return Number of records within these probability bounds.
     * 
     */
    public String bucketSize() {
        return this.bucketSize;
    }
    /**
     * @return Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    public String bucketValueCount() {
        return this.bucketValueCount;
    }
    /**
     * @return Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    public List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues() {
        return this.bucketValues;
    }
    /**
     * @return Always greater than or equal to min_probability.
     * 
     */
    public Double maxProbability() {
        return this.maxProbability;
    }
    /**
     * @return Between 0 and 1.
     * 
     */
    public Double minProbability() {
        return this.minProbability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues;
        private Double maxProbability;
        private Double minProbability;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.maxProbability = defaults.maxProbability;
    	      this.minProbability = defaults.minProbability;
        }

        public Builder bucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }
        public Builder bucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }
        public Builder bucketValues(List<GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }
        public Builder bucketValues(GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse... bucketValues) {
            return bucketValues(List.of(bucketValues));
        }
        public Builder maxProbability(Double maxProbability) {
            this.maxProbability = Objects.requireNonNull(maxProbability);
            return this;
        }
        public Builder minProbability(Double minProbability) {
            this.minProbability = Objects.requireNonNull(minProbability);
            return this;
        }        public GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, maxProbability, minProbability);
        }
    }
}
