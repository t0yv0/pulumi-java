// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse {
    @CustomType.Constructor
    private GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse build() {
            return new GoogleCloudDatalabelingV1beta1OperatorFeedbackMetadataResponse();
        }
    }
}
