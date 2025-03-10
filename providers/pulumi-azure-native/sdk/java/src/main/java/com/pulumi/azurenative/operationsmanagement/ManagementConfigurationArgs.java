// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement;

import com.pulumi.azurenative.operationsmanagement.inputs.ManagementConfigurationPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagementConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagementConfigurationArgs Empty = new ManagementConfigurationArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * User Management Configuration Name.
     * 
     */
    @Import(name="managementConfigurationName")
    private @Nullable Output<String> managementConfigurationName;

    /**
     * @return User Management Configuration Name.
     * 
     */
    public Optional<Output<String>> managementConfigurationName() {
        return Optional.ofNullable(this.managementConfigurationName);
    }

    /**
     * Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ManagementConfigurationPropertiesArgs> properties;

    /**
     * @return Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
     * 
     */
    public Optional<Output<ManagementConfigurationPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to get. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ManagementConfigurationArgs() {}

    private ManagementConfigurationArgs(ManagementConfigurationArgs $) {
        this.location = $.location;
        this.managementConfigurationName = $.managementConfigurationName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagementConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagementConfigurationArgs $;

        public Builder() {
            $ = new ManagementConfigurationArgs();
        }

        public Builder(ManagementConfigurationArgs defaults) {
            $ = new ManagementConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managementConfigurationName User Management Configuration Name.
         * 
         * @return builder
         * 
         */
        public Builder managementConfigurationName(@Nullable Output<String> managementConfigurationName) {
            $.managementConfigurationName = managementConfigurationName;
            return this;
        }

        /**
         * @param managementConfigurationName User Management Configuration Name.
         * 
         * @return builder
         * 
         */
        public Builder managementConfigurationName(String managementConfigurationName) {
            return managementConfigurationName(Output.of(managementConfigurationName));
        }

        /**
         * @param properties Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<ManagementConfigurationPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties for ManagementConfiguration object supported by the OperationsManagement resource provider.
         * 
         * @return builder
         * 
         */
        public Builder properties(ManagementConfigurationPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ManagementConfigurationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
