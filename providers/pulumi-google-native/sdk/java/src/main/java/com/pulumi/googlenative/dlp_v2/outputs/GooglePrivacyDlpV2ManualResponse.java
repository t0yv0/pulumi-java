// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ManualResponse {
    @CustomType.Constructor
    private GooglePrivacyDlpV2ManualResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ManualResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ManualResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GooglePrivacyDlpV2ManualResponse build() {
            return new GooglePrivacyDlpV2ManualResponse();
        }
    }
}
