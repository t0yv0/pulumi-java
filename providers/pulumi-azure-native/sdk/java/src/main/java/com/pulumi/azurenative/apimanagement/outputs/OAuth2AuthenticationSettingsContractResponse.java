// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OAuth2AuthenticationSettingsContractResponse {
    /**
     * @return OAuth authorization server identifier.
     * 
     */
    private final @Nullable String authorizationServerId;
    /**
     * @return operations scope.
     * 
     */
    private final @Nullable String scope;

    @CustomType.Constructor
    private OAuth2AuthenticationSettingsContractResponse(
        @CustomType.Parameter("authorizationServerId") @Nullable String authorizationServerId,
        @CustomType.Parameter("scope") @Nullable String scope) {
        this.authorizationServerId = authorizationServerId;
        this.scope = scope;
    }

    /**
     * @return OAuth authorization server identifier.
     * 
     */
    public Optional<String> authorizationServerId() {
        return Optional.ofNullable(this.authorizationServerId);
    }
    /**
     * @return operations scope.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuth2AuthenticationSettingsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationServerId;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuth2AuthenticationSettingsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationServerId = defaults.authorizationServerId;
    	      this.scope = defaults.scope;
        }

        public Builder authorizationServerId(@Nullable String authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }        public OAuth2AuthenticationSettingsContractResponse build() {
            return new OAuth2AuthenticationSettingsContractResponse(authorizationServerId, scope);
        }
    }
}
