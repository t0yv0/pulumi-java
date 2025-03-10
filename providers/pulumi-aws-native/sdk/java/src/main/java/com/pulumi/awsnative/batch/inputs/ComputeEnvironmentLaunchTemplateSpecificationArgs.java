// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.batch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComputeEnvironmentLaunchTemplateSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentLaunchTemplateSpecificationArgs Empty = new ComputeEnvironmentLaunchTemplateSpecificationArgs();

    @Import(name="launchTemplateId")
    private @Nullable Output<String> launchTemplateId;

    public Optional<Output<String>> launchTemplateId() {
        return Optional.ofNullable(this.launchTemplateId);
    }

    @Import(name="launchTemplateName")
    private @Nullable Output<String> launchTemplateName;

    public Optional<Output<String>> launchTemplateName() {
        return Optional.ofNullable(this.launchTemplateName);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private ComputeEnvironmentLaunchTemplateSpecificationArgs() {}

    private ComputeEnvironmentLaunchTemplateSpecificationArgs(ComputeEnvironmentLaunchTemplateSpecificationArgs $) {
        this.launchTemplateId = $.launchTemplateId;
        this.launchTemplateName = $.launchTemplateName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputeEnvironmentLaunchTemplateSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputeEnvironmentLaunchTemplateSpecificationArgs $;

        public Builder() {
            $ = new ComputeEnvironmentLaunchTemplateSpecificationArgs();
        }

        public Builder(ComputeEnvironmentLaunchTemplateSpecificationArgs defaults) {
            $ = new ComputeEnvironmentLaunchTemplateSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder launchTemplateId(@Nullable Output<String> launchTemplateId) {
            $.launchTemplateId = launchTemplateId;
            return this;
        }

        public Builder launchTemplateId(String launchTemplateId) {
            return launchTemplateId(Output.of(launchTemplateId));
        }

        public Builder launchTemplateName(@Nullable Output<String> launchTemplateName) {
            $.launchTemplateName = launchTemplateName;
            return this;
        }

        public Builder launchTemplateName(String launchTemplateName) {
            return launchTemplateName(Output.of(launchTemplateName));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ComputeEnvironmentLaunchTemplateSpecificationArgs build() {
            return $;
        }
    }

}
