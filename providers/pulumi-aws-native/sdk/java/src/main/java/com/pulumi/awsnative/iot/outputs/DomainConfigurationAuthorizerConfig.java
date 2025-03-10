// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainConfigurationAuthorizerConfig {
    private final @Nullable Boolean allowAuthorizerOverride;
    private final @Nullable String defaultAuthorizerName;

    @CustomType.Constructor
    private DomainConfigurationAuthorizerConfig(
        @CustomType.Parameter("allowAuthorizerOverride") @Nullable Boolean allowAuthorizerOverride,
        @CustomType.Parameter("defaultAuthorizerName") @Nullable String defaultAuthorizerName) {
        this.allowAuthorizerOverride = allowAuthorizerOverride;
        this.defaultAuthorizerName = defaultAuthorizerName;
    }

    public Optional<Boolean> allowAuthorizerOverride() {
        return Optional.ofNullable(this.allowAuthorizerOverride);
    }
    public Optional<String> defaultAuthorizerName() {
        return Optional.ofNullable(this.defaultAuthorizerName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainConfigurationAuthorizerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowAuthorizerOverride;
        private @Nullable String defaultAuthorizerName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainConfigurationAuthorizerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAuthorizerOverride = defaults.allowAuthorizerOverride;
    	      this.defaultAuthorizerName = defaults.defaultAuthorizerName;
        }

        public Builder allowAuthorizerOverride(@Nullable Boolean allowAuthorizerOverride) {
            this.allowAuthorizerOverride = allowAuthorizerOverride;
            return this;
        }
        public Builder defaultAuthorizerName(@Nullable String defaultAuthorizerName) {
            this.defaultAuthorizerName = defaultAuthorizerName;
            return this;
        }        public DomainConfigurationAuthorizerConfig build() {
            return new DomainConfigurationAuthorizerConfig(allowAuthorizerOverride, defaultAuthorizerName);
        }
    }
}
