// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPolicyUser {
    /**
     * @return The AWS SSO ID of the user.
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private AccessPolicyUser(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * @return The AWS SSO ID of the user.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public AccessPolicyUser build() {
            return new AccessPolicyUser(id);
        }
    }
}
