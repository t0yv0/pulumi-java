// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.appplatform.inputs.CustomDomainPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomDomainArgs Empty = new CustomDomainArgs();

    /**
     * The name of the App resource.
     * 
     */
    @Import(name="appName", required=true)
    private Output<String> appName;

    /**
     * @return The name of the App resource.
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }

    /**
     * The name of the custom domain resource.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The name of the custom domain resource.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * Properties of the custom domain resource.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<CustomDomainPropertiesArgs> properties;

    /**
     * @return Properties of the custom domain resource.
     * 
     */
    public Optional<Output<CustomDomainPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private CustomDomainArgs() {}

    private CustomDomainArgs(CustomDomainArgs $) {
        this.appName = $.appName;
        this.domainName = $.domainName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainArgs $;

        public Builder() {
            $ = new CustomDomainArgs();
        }

        public Builder(CustomDomainArgs defaults) {
            $ = new CustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appName The name of the App resource.
         * 
         * @return builder
         * 
         */
        public Builder appName(Output<String> appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appName The name of the App resource.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        /**
         * @param domainName The name of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param properties Properties of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<CustomDomainPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of the custom domain resource.
         * 
         * @return builder
         * 
         */
        public Builder properties(CustomDomainPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public CustomDomainArgs build() {
            $.appName = Objects.requireNonNull($.appName, "expected parameter 'appName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
