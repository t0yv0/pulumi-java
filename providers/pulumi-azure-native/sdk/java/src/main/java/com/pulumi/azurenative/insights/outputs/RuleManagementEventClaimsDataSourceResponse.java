// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleManagementEventClaimsDataSourceResponse {
    /**
     * @return the email address.
     * 
     */
    private final @Nullable String emailAddress;

    @CustomType.Constructor
    private RuleManagementEventClaimsDataSourceResponse(@CustomType.Parameter("emailAddress") @Nullable String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the email address.
     * 
     */
    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleManagementEventClaimsDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleManagementEventClaimsDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }        public RuleManagementEventClaimsDataSourceResponse build() {
            return new RuleManagementEventClaimsDataSourceResponse(emailAddress);
        }
    }
}
