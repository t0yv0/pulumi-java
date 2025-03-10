// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistryCredentialsResult {
    /**
     * @return The administrator password.
     * 
     */
    private final @Nullable String password;
    /**
     * @return The administrator username.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private GetRegistryCredentialsResult(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * @return The administrator password.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The administrator username.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryCredentialsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryCredentialsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public GetRegistryCredentialsResult build() {
            return new GetRegistryCredentialsResult(password, username);
        }
    }
}
