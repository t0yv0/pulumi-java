// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.outputs;

import com.pulumi.awsnative.groundstation.enums.ConfigTrackingConfigAutotrack;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigTrackingConfig {
    private final @Nullable ConfigTrackingConfigAutotrack autotrack;

    @CustomType.Constructor
    private ConfigTrackingConfig(@CustomType.Parameter("autotrack") @Nullable ConfigTrackingConfigAutotrack autotrack) {
        this.autotrack = autotrack;
    }

    public Optional<ConfigTrackingConfigAutotrack> autotrack() {
        return Optional.ofNullable(this.autotrack);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigTrackingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigTrackingConfigAutotrack autotrack;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigTrackingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autotrack = defaults.autotrack;
        }

        public Builder autotrack(@Nullable ConfigTrackingConfigAutotrack autotrack) {
            this.autotrack = autotrack;
            return this;
        }        public ConfigTrackingConfig build() {
            return new ConfigTrackingConfig(autotrack);
        }
    }
}
