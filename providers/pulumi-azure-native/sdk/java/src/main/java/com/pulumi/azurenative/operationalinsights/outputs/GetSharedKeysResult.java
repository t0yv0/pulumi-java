// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSharedKeysResult {
    /**
     * @return The primary shared key of a workspace.
     * 
     */
    private final @Nullable String primarySharedKey;
    /**
     * @return The secondary shared key of a workspace.
     * 
     */
    private final @Nullable String secondarySharedKey;

    @CustomType.Constructor
    private GetSharedKeysResult(
        @CustomType.Parameter("primarySharedKey") @Nullable String primarySharedKey,
        @CustomType.Parameter("secondarySharedKey") @Nullable String secondarySharedKey) {
        this.primarySharedKey = primarySharedKey;
        this.secondarySharedKey = secondarySharedKey;
    }

    /**
     * @return The primary shared key of a workspace.
     * 
     */
    public Optional<String> primarySharedKey() {
        return Optional.ofNullable(this.primarySharedKey);
    }
    /**
     * @return The secondary shared key of a workspace.
     * 
     */
    public Optional<String> secondarySharedKey() {
        return Optional.ofNullable(this.secondarySharedKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primarySharedKey;
        private @Nullable String secondarySharedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSharedKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primarySharedKey = defaults.primarySharedKey;
    	      this.secondarySharedKey = defaults.secondarySharedKey;
        }

        public Builder primarySharedKey(@Nullable String primarySharedKey) {
            this.primarySharedKey = primarySharedKey;
            return this;
        }
        public Builder secondarySharedKey(@Nullable String secondarySharedKey) {
            this.secondarySharedKey = secondarySharedKey;
            return this;
        }        public GetSharedKeysResult build() {
            return new GetSharedKeysResult(primarySharedKey, secondarySharedKey);
        }
    }
}
