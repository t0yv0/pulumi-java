// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.DomainCustomImageArgs;
import com.pulumi.awsnative.sagemaker.inputs.DomainResourceSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The kernel gateway app settings.
 * 
 */
public final class DomainKernelGatewayAppSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainKernelGatewayAppSettingsArgs Empty = new DomainKernelGatewayAppSettingsArgs();

    /**
     * A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    @Import(name="customImages")
    private @Nullable Output<List<DomainCustomImageArgs>> customImages;

    /**
     * @return A list of custom SageMaker images that are configured to run as a KernelGateway app.
     * 
     */
    public Optional<Output<List<DomainCustomImageArgs>>> customImages() {
        return Optional.ofNullable(this.customImages);
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    @Import(name="defaultResourceSpec")
    private @Nullable Output<DomainResourceSpecArgs> defaultResourceSpec;

    /**
     * @return The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
     * 
     */
    public Optional<Output<DomainResourceSpecArgs>> defaultResourceSpec() {
        return Optional.ofNullable(this.defaultResourceSpec);
    }

    private DomainKernelGatewayAppSettingsArgs() {}

    private DomainKernelGatewayAppSettingsArgs(DomainKernelGatewayAppSettingsArgs $) {
        this.customImages = $.customImages;
        this.defaultResourceSpec = $.defaultResourceSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainKernelGatewayAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainKernelGatewayAppSettingsArgs $;

        public Builder() {
            $ = new DomainKernelGatewayAppSettingsArgs();
        }

        public Builder(DomainKernelGatewayAppSettingsArgs defaults) {
            $ = new DomainKernelGatewayAppSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customImages A list of custom SageMaker images that are configured to run as a KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder customImages(@Nullable Output<List<DomainCustomImageArgs>> customImages) {
            $.customImages = customImages;
            return this;
        }

        /**
         * @param customImages A list of custom SageMaker images that are configured to run as a KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder customImages(List<DomainCustomImageArgs> customImages) {
            return customImages(Output.of(customImages));
        }

        /**
         * @param customImages A list of custom SageMaker images that are configured to run as a KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder customImages(DomainCustomImageArgs... customImages) {
            return customImages(List.of(customImages));
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(@Nullable Output<DomainResourceSpecArgs> defaultResourceSpec) {
            $.defaultResourceSpec = defaultResourceSpec;
            return this;
        }

        /**
         * @param defaultResourceSpec The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.
         * 
         * @return builder
         * 
         */
        public Builder defaultResourceSpec(DomainResourceSpecArgs defaultResourceSpec) {
            return defaultResourceSpec(Output.of(defaultResourceSpec));
        }

        public DomainKernelGatewayAppSettingsArgs build() {
            return $;
        }
    }

}
