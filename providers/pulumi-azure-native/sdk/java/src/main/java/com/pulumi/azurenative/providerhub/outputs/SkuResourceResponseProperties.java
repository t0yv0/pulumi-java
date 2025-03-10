// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.azurenative.providerhub.outputs.SkuSettingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuResourceResponseProperties {
    private final @Nullable String provisioningState;
    private final List<SkuSettingResponse> skuSettings;

    @CustomType.Constructor
    private SkuResourceResponseProperties(
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("skuSettings") List<SkuSettingResponse> skuSettings) {
        this.provisioningState = provisioningState;
        this.skuSettings = skuSettings;
    }

    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public List<SkuSettingResponse> skuSettings() {
        return this.skuSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResourceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provisioningState;
        private List<SkuSettingResponse> skuSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResourceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.skuSettings = defaults.skuSettings;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder skuSettings(List<SkuSettingResponse> skuSettings) {
            this.skuSettings = Objects.requireNonNull(skuSettings);
            return this;
        }
        public Builder skuSettings(SkuSettingResponse... skuSettings) {
            return skuSettings(List.of(skuSettings));
        }        public SkuResourceResponseProperties build() {
            return new SkuResourceResponseProperties(provisioningState, skuSettings);
        }
    }
}
