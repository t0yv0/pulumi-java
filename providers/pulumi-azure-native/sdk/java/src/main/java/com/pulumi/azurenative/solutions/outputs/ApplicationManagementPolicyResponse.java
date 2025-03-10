// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.solutions.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationManagementPolicyResponse {
    /**
     * @return The managed application management mode.
     * 
     */
    private final @Nullable String mode;

    @CustomType.Constructor
    private ApplicationManagementPolicyResponse(@CustomType.Parameter("mode") @Nullable String mode) {
        this.mode = mode;
    }

    /**
     * @return The managed application management mode.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationManagementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationManagementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }        public ApplicationManagementPolicyResponse build() {
            return new ApplicationManagementPolicyResponse(mode);
        }
    }
}
