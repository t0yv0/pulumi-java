// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AuthorizationActionMappingResponse {
    private final @Nullable String desired;
    private final @Nullable String original;

    @CustomType.Constructor
    private AuthorizationActionMappingResponse(
        @CustomType.Parameter("desired") @Nullable String desired,
        @CustomType.Parameter("original") @Nullable String original) {
        this.desired = desired;
        this.original = original;
    }

    public Optional<String> desired() {
        return Optional.ofNullable(this.desired);
    }
    public Optional<String> original() {
        return Optional.ofNullable(this.original);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationActionMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String desired;
        private @Nullable String original;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationActionMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desired = defaults.desired;
    	      this.original = defaults.original;
        }

        public Builder desired(@Nullable String desired) {
            this.desired = desired;
            return this;
        }
        public Builder original(@Nullable String original) {
            this.original = original;
            return this;
        }        public AuthorizationActionMappingResponse build() {
            return new AuthorizationActionMappingResponse(desired, original);
        }
    }
}
