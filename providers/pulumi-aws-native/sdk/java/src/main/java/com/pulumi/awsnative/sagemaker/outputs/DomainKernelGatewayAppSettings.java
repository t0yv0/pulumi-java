// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.DomainCustomImage;
import com.pulumi.awsnative.sagemaker.outputs.DomainResourceSpec;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainKernelGatewayAppSettings {
    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    private final @Nullable List<DomainCustomImage> customImages;
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    private final @Nullable DomainResourceSpec defaultResourceSpec;

    @CustomType.Constructor
    private DomainKernelGatewayAppSettings(
        @CustomType.Parameter("customImages") @Nullable List<DomainCustomImage> customImages,
        @CustomType.Parameter("defaultResourceSpec") @Nullable DomainResourceSpec defaultResourceSpec) {
        this.customImages = customImages;
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    public List<DomainCustomImage> customImages() {
        return this.customImages == null ? List.of() : this.customImages;
    }
    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    public Optional<DomainResourceSpec> defaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainKernelGatewayAppSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DomainCustomImage> customImages;
        private @Nullable DomainResourceSpec defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainKernelGatewayAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImages = defaults.customImages;
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder customImages(@Nullable List<DomainCustomImage> customImages) {
            this.customImages = customImages;
            return this;
        }
        public Builder customImages(DomainCustomImage... customImages) {
            return customImages(List.of(customImages));
        }
        public Builder defaultResourceSpec(@Nullable DomainResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = defaultResourceSpec;
            return this;
        }        public DomainKernelGatewayAppSettings build() {
            return new DomainKernelGatewayAppSettings(customImages, defaultResourceSpec);
        }
    }
}
