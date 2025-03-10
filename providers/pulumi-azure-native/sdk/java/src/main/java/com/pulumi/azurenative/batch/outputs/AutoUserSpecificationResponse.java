// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoUserSpecificationResponse {
    /**
     * @return The default value is nonAdmin.
     * 
     */
    private final @Nullable String elevationLevel;
    /**
     * @return The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    private final @Nullable String scope;

    @CustomType.Constructor
    private AutoUserSpecificationResponse(
        @CustomType.Parameter("elevationLevel") @Nullable String elevationLevel,
        @CustomType.Parameter("scope") @Nullable String scope) {
        this.elevationLevel = elevationLevel;
        this.scope = scope;
    }

    /**
     * @return The default value is nonAdmin.
     * 
     */
    public Optional<String> elevationLevel() {
        return Optional.ofNullable(this.elevationLevel);
    }
    /**
     * @return The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoUserSpecificationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String elevationLevel;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoUserSpecificationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.scope = defaults.scope;
        }

        public Builder elevationLevel(@Nullable String elevationLevel) {
            this.elevationLevel = elevationLevel;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }        public AutoUserSpecificationResponse build() {
            return new AutoUserSpecificationResponse(elevationLevel, scope);
        }
    }
}
