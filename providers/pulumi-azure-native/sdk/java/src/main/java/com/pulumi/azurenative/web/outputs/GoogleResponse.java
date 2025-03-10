// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.AllowedAudiencesValidationResponse;
import com.pulumi.azurenative.web.outputs.ClientRegistrationResponse;
import com.pulumi.azurenative.web.outputs.LoginScopesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GoogleResponse {
    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The configuration settings of the login flow.
     * 
     */
    private final @Nullable LoginScopesResponse login;
    /**
     * @return The configuration settings of the app registration for the Google provider.
     * 
     */
    private final @Nullable ClientRegistrationResponse registration;
    /**
     * @return The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    private final @Nullable AllowedAudiencesValidationResponse validation;

    @CustomType.Constructor
    private GoogleResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("login") @Nullable LoginScopesResponse login,
        @CustomType.Parameter("registration") @Nullable ClientRegistrationResponse registration,
        @CustomType.Parameter("validation") @Nullable AllowedAudiencesValidationResponse validation) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
        this.validation = validation;
    }

    /**
     * @return &lt;code&gt;false&lt;/code&gt; if the Google provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The configuration settings of the login flow.
     * 
     */
    public Optional<LoginScopesResponse> login() {
        return Optional.ofNullable(this.login);
    }
    /**
     * @return The configuration settings of the app registration for the Google provider.
     * 
     */
    public Optional<ClientRegistrationResponse> registration() {
        return Optional.ofNullable(this.registration);
    }
    /**
     * @return The configuration settings of the Azure Active Directory token validation flow.
     * 
     */
    public Optional<AllowedAudiencesValidationResponse> validation() {
        return Optional.ofNullable(this.validation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable LoginScopesResponse login;
        private @Nullable ClientRegistrationResponse registration;
        private @Nullable AllowedAudiencesValidationResponse validation;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder login(@Nullable LoginScopesResponse login) {
            this.login = login;
            return this;
        }
        public Builder registration(@Nullable ClientRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }
        public Builder validation(@Nullable AllowedAudiencesValidationResponse validation) {
            this.validation = validation;
            return this;
        }        public GoogleResponse build() {
            return new GoogleResponse(enabled, login, registration, validation);
        }
    }
}
