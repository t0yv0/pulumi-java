// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2EvaluationConfigSmartComposeConfigResponse {
    /**
     * @return The allowlist document resource name. Format: `projects//knowledgeBases//documents/`. Only used for smart compose model.
     * 
     */
    private final String allowlistDocument;
    /**
     * @return The model to be evaluated can return multiple results with confidence score on each query. These results will be sorted by the descending order of the scores and we only keep the first max_result_count results as the final results to evaluate.
     * 
     */
    private final Integer maxResultCount;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2EvaluationConfigSmartComposeConfigResponse(
        @CustomType.Parameter("allowlistDocument") String allowlistDocument,
        @CustomType.Parameter("maxResultCount") Integer maxResultCount) {
        this.allowlistDocument = allowlistDocument;
        this.maxResultCount = maxResultCount;
    }

    /**
     * @return The allowlist document resource name. Format: `projects//knowledgeBases//documents/`. Only used for smart compose model.
     * 
     */
    public String allowlistDocument() {
        return this.allowlistDocument;
    }
    /**
     * @return The model to be evaluated can return multiple results with confidence score on each query. These results will be sorted by the descending order of the scores and we only keep the first max_result_count results as the final results to evaluate.
     * 
     */
    public Integer maxResultCount() {
        return this.maxResultCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2EvaluationConfigSmartComposeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allowlistDocument;
        private Integer maxResultCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2EvaluationConfigSmartComposeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlistDocument = defaults.allowlistDocument;
    	      this.maxResultCount = defaults.maxResultCount;
        }

        public Builder allowlistDocument(String allowlistDocument) {
            this.allowlistDocument = Objects.requireNonNull(allowlistDocument);
            return this;
        }
        public Builder maxResultCount(Integer maxResultCount) {
            this.maxResultCount = Objects.requireNonNull(maxResultCount);
            return this;
        }        public GoogleCloudDialogflowV2EvaluationConfigSmartComposeConfigResponse build() {
            return new GoogleCloudDialogflowV2EvaluationConfigSmartComposeConfigResponse(allowlistDocument, maxResultCount);
        }
    }
}
