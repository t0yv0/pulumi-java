// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecurityPolicyRecaptchaOptionsConfigResponse {
    /**
     * @return An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used.
     * 
     */
    private final String redirectSiteKey;

    @CustomType.Constructor
    private SecurityPolicyRecaptchaOptionsConfigResponse(@CustomType.Parameter("redirectSiteKey") String redirectSiteKey) {
        this.redirectSiteKey = redirectSiteKey;
    }

    /**
     * @return An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used.
     * 
     */
    public String redirectSiteKey() {
        return this.redirectSiteKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRecaptchaOptionsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String redirectSiteKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRecaptchaOptionsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectSiteKey = defaults.redirectSiteKey;
        }

        public Builder redirectSiteKey(String redirectSiteKey) {
            this.redirectSiteKey = Objects.requireNonNull(redirectSiteKey);
            return this;
        }        public SecurityPolicyRecaptchaOptionsConfigResponse build() {
            return new SecurityPolicyRecaptchaOptionsConfigResponse(redirectSiteKey);
        }
    }
}
