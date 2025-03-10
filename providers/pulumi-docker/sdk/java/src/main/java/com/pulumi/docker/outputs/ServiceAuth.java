// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceAuth {
    /**
     * @return The password
     * 
     */
    private final @Nullable String password;
    /**
     * @return The address of the server for the authentication
     * 
     */
    private final String serverAddress;
    /**
     * @return The username
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private ServiceAuth(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("serverAddress") String serverAddress,
        @CustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.serverAddress = serverAddress;
        this.username = username;
    }

    /**
     * @return The password
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return The address of the server for the authentication
     * 
     */
    public String serverAddress() {
        return this.serverAddress;
    }
    /**
     * @return The username
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String serverAddress;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.serverAddress = defaults.serverAddress;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder serverAddress(String serverAddress) {
            this.serverAddress = Objects.requireNonNull(serverAddress);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public ServiceAuth build() {
            return new ServiceAuth(password, serverAddress, username);
        }
    }
}
