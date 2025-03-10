// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComputeEnvironmentEc2ConfigurationObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentEc2ConfigurationObjectArgs Empty = new ComputeEnvironmentEc2ConfigurationObjectArgs();

    @Import(name="imageIdOverride")
    private @Nullable Output<String> imageIdOverride;

    public Optional<Output<String>> imageIdOverride() {
        return Optional.ofNullable(this.imageIdOverride);
    }

    @Import(name="imageType", required=true)
    private Output<String> imageType;

    public Output<String> imageType() {
        return this.imageType;
    }

    private ComputeEnvironmentEc2ConfigurationObjectArgs() {}

    private ComputeEnvironmentEc2ConfigurationObjectArgs(ComputeEnvironmentEc2ConfigurationObjectArgs $) {
        this.imageIdOverride = $.imageIdOverride;
        this.imageType = $.imageType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeEnvironmentEc2ConfigurationObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEnvironmentEc2ConfigurationObjectArgs $;

        public Builder() {
            $ = new ComputeEnvironmentEc2ConfigurationObjectArgs();
        }

        public Builder(ComputeEnvironmentEc2ConfigurationObjectArgs defaults) {
            $ = new ComputeEnvironmentEc2ConfigurationObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageIdOverride(@Nullable Output<String> imageIdOverride) {
            $.imageIdOverride = imageIdOverride;
            return this;
        }

        public Builder imageIdOverride(String imageIdOverride) {
            return imageIdOverride(Output.of(imageIdOverride));
        }

        public Builder imageType(Output<String> imageType) {
            $.imageType = imageType;
            return this;
        }

        public Builder imageType(String imageType) {
            return imageType(Output.of(imageType));
        }

        public ComputeEnvironmentEc2ConfigurationObjectArgs build() {
            $.imageType = Objects.requireNonNull($.imageType, "expected parameter 'imageType' to be non-null");
            return $;
        }
    }

}
