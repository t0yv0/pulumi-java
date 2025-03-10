// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultKeyResponseAttributes {
    /**
     * @return When the key was created.
     * 
     */
    private final @Nullable Double created;
    /**
     * @return Whether the key is enabled or not.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return When the key was updated.
     * 
     */
    private final @Nullable Double updated;

    @CustomType.Constructor
    private KeyVaultKeyResponseAttributes(
        @CustomType.Parameter("created") @Nullable Double created,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("updated") @Nullable Double updated) {
        this.created = created;
        this.enabled = enabled;
        this.updated = updated;
    }

    /**
     * @return When the key was created.
     * 
     */
    public Optional<Double> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * @return Whether the key is enabled or not.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return When the key was updated.
     * 
     */
    public Optional<Double> updated() {
        return Optional.ofNullable(this.updated);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyResponseAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double created;
        private @Nullable Boolean enabled;
        private @Nullable Double updated;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyResponseAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.updated = defaults.updated;
        }

        public Builder created(@Nullable Double created) {
            this.created = created;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder updated(@Nullable Double updated) {
            this.updated = updated;
            return this;
        }        public KeyVaultKeyResponseAttributes build() {
            return new KeyVaultKeyResponseAttributes(created, enabled, updated);
        }
    }
}
