// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LDiversityEquivalenceClassResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2LDiversityHistogramBucketResponse {
    /**
     * @return Total number of equivalence classes in this bucket.
     * 
     */
    private final String bucketSize;
    /**
     * @return Total number of distinct equivalence classes in this bucket.
     * 
     */
    private final String bucketValueCount;
    /**
     * @return Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    private final List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues;
    /**
     * @return Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    private final String sensitiveValueFrequencyLowerBound;
    /**
     * @return Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    private final String sensitiveValueFrequencyUpperBound;

    @CustomType.Constructor
    private GooglePrivacyDlpV2LDiversityHistogramBucketResponse(
        @CustomType.Parameter("bucketSize") String bucketSize,
        @CustomType.Parameter("bucketValueCount") String bucketValueCount,
        @CustomType.Parameter("bucketValues") List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues,
        @CustomType.Parameter("sensitiveValueFrequencyLowerBound") String sensitiveValueFrequencyLowerBound,
        @CustomType.Parameter("sensitiveValueFrequencyUpperBound") String sensitiveValueFrequencyUpperBound) {
        this.bucketSize = bucketSize;
        this.bucketValueCount = bucketValueCount;
        this.bucketValues = bucketValues;
        this.sensitiveValueFrequencyLowerBound = sensitiveValueFrequencyLowerBound;
        this.sensitiveValueFrequencyUpperBound = sensitiveValueFrequencyUpperBound;
    }

    /**
     * @return Total number of equivalence classes in this bucket.
     * 
     */
    public String bucketSize() {
        return this.bucketSize;
    }
    /**
     * @return Total number of distinct equivalence classes in this bucket.
     * 
     */
    public String bucketValueCount() {
        return this.bucketValueCount;
    }
    /**
     * @return Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    public List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues() {
        return this.bucketValues;
    }
    /**
     * @return Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    public String sensitiveValueFrequencyLowerBound() {
        return this.sensitiveValueFrequencyLowerBound;
    }
    /**
     * @return Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    public String sensitiveValueFrequencyUpperBound() {
        return this.sensitiveValueFrequencyUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues;
        private String sensitiveValueFrequencyLowerBound;
        private String sensitiveValueFrequencyUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LDiversityHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.sensitiveValueFrequencyLowerBound = defaults.sensitiveValueFrequencyLowerBound;
    	      this.sensitiveValueFrequencyUpperBound = defaults.sensitiveValueFrequencyUpperBound;
        }

        public Builder bucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }
        public Builder bucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }
        public Builder bucketValues(List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }
        public Builder bucketValues(GooglePrivacyDlpV2LDiversityEquivalenceClassResponse... bucketValues) {
            return bucketValues(List.of(bucketValues));
        }
        public Builder sensitiveValueFrequencyLowerBound(String sensitiveValueFrequencyLowerBound) {
            this.sensitiveValueFrequencyLowerBound = Objects.requireNonNull(sensitiveValueFrequencyLowerBound);
            return this;
        }
        public Builder sensitiveValueFrequencyUpperBound(String sensitiveValueFrequencyUpperBound) {
            this.sensitiveValueFrequencyUpperBound = Objects.requireNonNull(sensitiveValueFrequencyUpperBound);
            return this;
        }        public GooglePrivacyDlpV2LDiversityHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2LDiversityHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, sensitiveValueFrequencyLowerBound, sensitiveValueFrequencyUpperBound);
        }
    }
}
