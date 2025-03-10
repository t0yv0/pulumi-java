// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scvmm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMMServerPropertiesResponseCredentials {
    /**
     * @return Username to use to connect to VMMServer.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private VMMServerPropertiesResponseCredentials(@CustomType.Parameter("username") @Nullable String username) {
        this.username = username;
    }

    /**
     * @return Username to use to connect to VMMServer.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMMServerPropertiesResponseCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(VMMServerPropertiesResponseCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public VMMServerPropertiesResponseCredentials build() {
            return new VMMServerPropertiesResponseCredentials(username);
        }
    }
}
