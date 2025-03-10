// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquerydatatransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class EmailPreferencesResponse {
    /**
     * @return If true, email notifications will be sent on transfer run failures.
     * 
     */
    private final Boolean enableFailureEmail;

    @CustomType.Constructor
    private EmailPreferencesResponse(@CustomType.Parameter("enableFailureEmail") Boolean enableFailureEmail) {
        this.enableFailureEmail = enableFailureEmail;
    }

    /**
     * @return If true, email notifications will be sent on transfer run failures.
     * 
     */
    public Boolean enableFailureEmail() {
        return this.enableFailureEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableFailureEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableFailureEmail = defaults.enableFailureEmail;
        }

        public Builder enableFailureEmail(Boolean enableFailureEmail) {
            this.enableFailureEmail = Objects.requireNonNull(enableFailureEmail);
            return this;
        }        public EmailPreferencesResponse build() {
            return new EmailPreferencesResponse(enableFailureEmail);
        }
    }
}
