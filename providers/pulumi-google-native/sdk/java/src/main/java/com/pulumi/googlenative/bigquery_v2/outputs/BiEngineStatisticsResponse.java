// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.BiEngineReasonResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BiEngineStatisticsResponse {
    /**
     * @return Specifies which mode of BI Engine acceleration was performed (if any).
     * 
     */
    private final String biEngineMode;
    /**
     * @return In case of DISABLED or PARTIAL bi_engine_mode, these contain the explanatory reasons as to why BI Engine could not accelerate. In case the full query was accelerated, this field is not populated.
     * 
     */
    private final List<BiEngineReasonResponse> biEngineReasons;

    @CustomType.Constructor
    private BiEngineStatisticsResponse(
        @CustomType.Parameter("biEngineMode") String biEngineMode,
        @CustomType.Parameter("biEngineReasons") List<BiEngineReasonResponse> biEngineReasons) {
        this.biEngineMode = biEngineMode;
        this.biEngineReasons = biEngineReasons;
    }

    /**
     * @return Specifies which mode of BI Engine acceleration was performed (if any).
     * 
     */
    public String biEngineMode() {
        return this.biEngineMode;
    }
    /**
     * @return In case of DISABLED or PARTIAL bi_engine_mode, these contain the explanatory reasons as to why BI Engine could not accelerate. In case the full query was accelerated, this field is not populated.
     * 
     */
    public List<BiEngineReasonResponse> biEngineReasons() {
        return this.biEngineReasons;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BiEngineStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String biEngineMode;
        private List<BiEngineReasonResponse> biEngineReasons;

        public Builder() {
    	      // Empty
        }

        public Builder(BiEngineStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biEngineMode = defaults.biEngineMode;
    	      this.biEngineReasons = defaults.biEngineReasons;
        }

        public Builder biEngineMode(String biEngineMode) {
            this.biEngineMode = Objects.requireNonNull(biEngineMode);
            return this;
        }
        public Builder biEngineReasons(List<BiEngineReasonResponse> biEngineReasons) {
            this.biEngineReasons = Objects.requireNonNull(biEngineReasons);
            return this;
        }
        public Builder biEngineReasons(BiEngineReasonResponse... biEngineReasons) {
            return biEngineReasons(List.of(biEngineReasons));
        }        public BiEngineStatisticsResponse build() {
            return new BiEngineStatisticsResponse(biEngineMode, biEngineReasons);
        }
    }
}
