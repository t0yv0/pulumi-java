// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.awsnative.applicationinsights.outputs.ApplicationConfigurationDetails;
import com.pulumi.awsnative.applicationinsights.outputs.ApplicationSubComponentTypeConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationComponentConfiguration {
    /**
     * @return The configuration settings
     * 
     */
    private final @Nullable ApplicationConfigurationDetails configurationDetails;
    /**
     * @return Sub component configurations of the component.
     * 
     */
    private final @Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations;

    @CustomType.Constructor
    private ApplicationComponentConfiguration(
        @CustomType.Parameter("configurationDetails") @Nullable ApplicationConfigurationDetails configurationDetails,
        @CustomType.Parameter("subComponentTypeConfigurations") @Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations) {
        this.configurationDetails = configurationDetails;
        this.subComponentTypeConfigurations = subComponentTypeConfigurations;
    }

    /**
     * @return The configuration settings
     * 
     */
    public Optional<ApplicationConfigurationDetails> configurationDetails() {
        return Optional.ofNullable(this.configurationDetails);
    }
    /**
     * @return Sub component configurations of the component.
     * 
     */
    public List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations() {
        return this.subComponentTypeConfigurations == null ? List.of() : this.subComponentTypeConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationComponentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationConfigurationDetails configurationDetails;
        private @Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationComponentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationDetails = defaults.configurationDetails;
    	      this.subComponentTypeConfigurations = defaults.subComponentTypeConfigurations;
        }

        public Builder configurationDetails(@Nullable ApplicationConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            return this;
        }
        public Builder subComponentTypeConfigurations(@Nullable List<ApplicationSubComponentTypeConfiguration> subComponentTypeConfigurations) {
            this.subComponentTypeConfigurations = subComponentTypeConfigurations;
            return this;
        }
        public Builder subComponentTypeConfigurations(ApplicationSubComponentTypeConfiguration... subComponentTypeConfigurations) {
            return subComponentTypeConfigurations(List.of(subComponentTypeConfigurations));
        }        public ApplicationComponentConfiguration build() {
            return new ApplicationComponentConfiguration(configurationDetails, subComponentTypeConfigurations);
        }
    }
}
