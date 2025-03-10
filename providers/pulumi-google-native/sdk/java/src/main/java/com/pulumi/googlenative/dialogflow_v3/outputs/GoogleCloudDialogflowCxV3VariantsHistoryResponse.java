// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3VersionVariantsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3VariantsHistoryResponse {
    /**
     * @return Update time of the variants.
     * 
     */
    private final String updateTime;
    /**
     * @return The flow versions as the variants.
     * 
     */
    private final GoogleCloudDialogflowCxV3VersionVariantsResponse versionVariants;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3VariantsHistoryResponse(
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("versionVariants") GoogleCloudDialogflowCxV3VersionVariantsResponse versionVariants) {
        this.updateTime = updateTime;
        this.versionVariants = versionVariants;
    }

    /**
     * @return Update time of the variants.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * @return The flow versions as the variants.
     * 
     */
    public GoogleCloudDialogflowCxV3VersionVariantsResponse versionVariants() {
        return this.versionVariants;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VariantsHistoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateTime;
        private GoogleCloudDialogflowCxV3VersionVariantsResponse versionVariants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VariantsHistoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateTime = defaults.updateTime;
    	      this.versionVariants = defaults.versionVariants;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder versionVariants(GoogleCloudDialogflowCxV3VersionVariantsResponse versionVariants) {
            this.versionVariants = Objects.requireNonNull(versionVariants);
            return this;
        }        public GoogleCloudDialogflowCxV3VariantsHistoryResponse build() {
            return new GoogleCloudDialogflowCxV3VariantsHistoryResponse(updateTime, versionVariants);
        }
    }
}
