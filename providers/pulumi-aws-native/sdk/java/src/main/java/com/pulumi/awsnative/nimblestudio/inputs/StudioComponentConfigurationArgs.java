// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.awsnative.nimblestudio.inputs.StudioComponentActiveDirectoryConfigurationArgs;
import com.pulumi.awsnative.nimblestudio.inputs.StudioComponentComputeFarmConfigurationArgs;
import com.pulumi.awsnative.nimblestudio.inputs.StudioComponentLicenseServiceConfigurationArgs;
import com.pulumi.awsnative.nimblestudio.inputs.StudioComponentSharedFileSystemConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;The configuration of the studio component, based on component type.&lt;/p&gt;
 * 
 */
public final class StudioComponentConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StudioComponentConfigurationArgs Empty = new StudioComponentConfigurationArgs();

    @Import(name="activeDirectoryConfiguration")
    private @Nullable Output<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration;

    public Optional<Output<StudioComponentActiveDirectoryConfigurationArgs>> activeDirectoryConfiguration() {
        return Optional.ofNullable(this.activeDirectoryConfiguration);
    }

    @Import(name="computeFarmConfiguration")
    private @Nullable Output<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration;

    public Optional<Output<StudioComponentComputeFarmConfigurationArgs>> computeFarmConfiguration() {
        return Optional.ofNullable(this.computeFarmConfiguration);
    }

    @Import(name="licenseServiceConfiguration")
    private @Nullable Output<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration;

    public Optional<Output<StudioComponentLicenseServiceConfigurationArgs>> licenseServiceConfiguration() {
        return Optional.ofNullable(this.licenseServiceConfiguration);
    }

    @Import(name="sharedFileSystemConfiguration")
    private @Nullable Output<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration;

    public Optional<Output<StudioComponentSharedFileSystemConfigurationArgs>> sharedFileSystemConfiguration() {
        return Optional.ofNullable(this.sharedFileSystemConfiguration);
    }

    private StudioComponentConfigurationArgs() {}

    private StudioComponentConfigurationArgs(StudioComponentConfigurationArgs $) {
        this.activeDirectoryConfiguration = $.activeDirectoryConfiguration;
        this.computeFarmConfiguration = $.computeFarmConfiguration;
        this.licenseServiceConfiguration = $.licenseServiceConfiguration;
        this.sharedFileSystemConfiguration = $.sharedFileSystemConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioComponentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioComponentConfigurationArgs $;

        public Builder() {
            $ = new StudioComponentConfigurationArgs();
        }

        public Builder(StudioComponentConfigurationArgs defaults) {
            $ = new StudioComponentConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder activeDirectoryConfiguration(@Nullable Output<StudioComponentActiveDirectoryConfigurationArgs> activeDirectoryConfiguration) {
            $.activeDirectoryConfiguration = activeDirectoryConfiguration;
            return this;
        }

        public Builder activeDirectoryConfiguration(StudioComponentActiveDirectoryConfigurationArgs activeDirectoryConfiguration) {
            return activeDirectoryConfiguration(Output.of(activeDirectoryConfiguration));
        }

        public Builder computeFarmConfiguration(@Nullable Output<StudioComponentComputeFarmConfigurationArgs> computeFarmConfiguration) {
            $.computeFarmConfiguration = computeFarmConfiguration;
            return this;
        }

        public Builder computeFarmConfiguration(StudioComponentComputeFarmConfigurationArgs computeFarmConfiguration) {
            return computeFarmConfiguration(Output.of(computeFarmConfiguration));
        }

        public Builder licenseServiceConfiguration(@Nullable Output<StudioComponentLicenseServiceConfigurationArgs> licenseServiceConfiguration) {
            $.licenseServiceConfiguration = licenseServiceConfiguration;
            return this;
        }

        public Builder licenseServiceConfiguration(StudioComponentLicenseServiceConfigurationArgs licenseServiceConfiguration) {
            return licenseServiceConfiguration(Output.of(licenseServiceConfiguration));
        }

        public Builder sharedFileSystemConfiguration(@Nullable Output<StudioComponentSharedFileSystemConfigurationArgs> sharedFileSystemConfiguration) {
            $.sharedFileSystemConfiguration = sharedFileSystemConfiguration;
            return this;
        }

        public Builder sharedFileSystemConfiguration(StudioComponentSharedFileSystemConfigurationArgs sharedFileSystemConfiguration) {
            return sharedFileSystemConfiguration(Output.of(sharedFileSystemConfiguration));
        }

        public StudioComponentConfigurationArgs build() {
            return $;
        }
    }

}
