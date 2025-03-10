// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.SecretObjectResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomRegistryCredentialsResponse {
    /**
     * @return Indicates the managed identity assigned to the custom credential. If a user-assigned identity
     * this value is the Client ID. If a system-assigned identity, the value will be `system`. In
     * the case of a system-assigned identity, the Client ID will be determined by the runner. This
     * identity may be used to authenticate to key vault to retrieve credentials or it may be the only
     * source of authentication used for accessing the registry.
     * 
     */
    private final @Nullable String identity;
    /**
     * @return The password for logging into the custom registry. The password is a secret
     * object that allows multiple ways of providing the value for it.
     * 
     */
    private final @Nullable SecretObjectResponse password;
    /**
     * @return The username for logging into the custom registry.
     * 
     */
    private final @Nullable SecretObjectResponse userName;

    @CustomType.Constructor
    private CustomRegistryCredentialsResponse(
        @CustomType.Parameter("identity") @Nullable String identity,
        @CustomType.Parameter("password") @Nullable SecretObjectResponse password,
        @CustomType.Parameter("userName") @Nullable SecretObjectResponse userName) {
        this.identity = identity;
        this.password = password;
        this.userName = userName;
    }

    /**
     * @return Indicates the managed identity assigned to the custom credential. If a user-assigned identity
     * this value is the Client ID. If a system-assigned identity, the value will be `system`. In
     * the case of a system-assigned identity, the Client ID will be determined by the runner. This
     * identity may be used to authenticate to key vault to retrieve credentials or it may be the only
     * source of authentication used for accessing the registry.
     * 
     */
    public Optional<String> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return The password for logging into the custom registry. The password is a secret
     * object that allows multiple ways of providing the value for it.
     * 
     */
    public Optional<SecretObjectResponse> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The username for logging into the custom registry.
     * 
     */
    public Optional<SecretObjectResponse> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identity;
        private @Nullable SecretObjectResponse password;
        private @Nullable SecretObjectResponse userName;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        public Builder identity(@Nullable String identity) {
            this.identity = identity;
            return this;
        }
        public Builder password(@Nullable SecretObjectResponse password) {
            this.password = password;
            return this;
        }
        public Builder userName(@Nullable SecretObjectResponse userName) {
            this.userName = userName;
            return this;
        }        public CustomRegistryCredentialsResponse build() {
            return new CustomRegistryCredentialsResponse(identity, password, userName);
        }
    }
}
