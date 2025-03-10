// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.appplatform.inputs.BuildpackBindingPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildpackBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildpackBindingArgs Empty = new BuildpackBindingArgs();

    /**
     * The name of the build service resource.
     * 
     */
    @Import(name="buildServiceName", required=true)
    private Output<String> buildServiceName;

    /**
     * @return The name of the build service resource.
     * 
     */
    public Output<String> buildServiceName() {
        return this.buildServiceName;
    }

    /**
     * The name of the builder resource.
     * 
     */
    @Import(name="builderName", required=true)
    private Output<String> builderName;

    /**
     * @return The name of the builder resource.
     * 
     */
    public Output<String> builderName() {
        return this.builderName;
    }

    /**
     * The name of the Buildpack Binding Name
     * 
     */
    @Import(name="buildpackBindingName")
    private @Nullable Output<String> buildpackBindingName;

    /**
     * @return The name of the Buildpack Binding Name
     * 
     */
    public Optional<Output<String>> buildpackBindingName() {
        return Optional.ofNullable(this.buildpackBindingName);
    }

    /**
     * Properties of a buildpack binding
     * 
     */
    @Import(name="properties")
    private @Nullable Output<BuildpackBindingPropertiesArgs> properties;

    /**
     * @return Properties of a buildpack binding
     * 
     */
    public Optional<Output<BuildpackBindingPropertiesArgs>> properties() {
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

    private BuildpackBindingArgs() {}

    private BuildpackBindingArgs(BuildpackBindingArgs $) {
        this.buildServiceName = $.buildServiceName;
        this.builderName = $.builderName;
        this.buildpackBindingName = $.buildpackBindingName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildpackBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildpackBindingArgs $;

        public Builder() {
            $ = new BuildpackBindingArgs();
        }

        public Builder(BuildpackBindingArgs defaults) {
            $ = new BuildpackBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildServiceName The name of the build service resource.
         * 
         * @return builder
         * 
         */
        public Builder buildServiceName(Output<String> buildServiceName) {
            $.buildServiceName = buildServiceName;
            return this;
        }

        /**
         * @param buildServiceName The name of the build service resource.
         * 
         * @return builder
         * 
         */
        public Builder buildServiceName(String buildServiceName) {
            return buildServiceName(Output.of(buildServiceName));
        }

        /**
         * @param builderName The name of the builder resource.
         * 
         * @return builder
         * 
         */
        public Builder builderName(Output<String> builderName) {
            $.builderName = builderName;
            return this;
        }

        /**
         * @param builderName The name of the builder resource.
         * 
         * @return builder
         * 
         */
        public Builder builderName(String builderName) {
            return builderName(Output.of(builderName));
        }

        /**
         * @param buildpackBindingName The name of the Buildpack Binding Name
         * 
         * @return builder
         * 
         */
        public Builder buildpackBindingName(@Nullable Output<String> buildpackBindingName) {
            $.buildpackBindingName = buildpackBindingName;
            return this;
        }

        /**
         * @param buildpackBindingName The name of the Buildpack Binding Name
         * 
         * @return builder
         * 
         */
        public Builder buildpackBindingName(String buildpackBindingName) {
            return buildpackBindingName(Output.of(buildpackBindingName));
        }

        /**
         * @param properties Properties of a buildpack binding
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<BuildpackBindingPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Properties of a buildpack binding
         * 
         * @return builder
         * 
         */
        public Builder properties(BuildpackBindingPropertiesArgs properties) {
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

        public BuildpackBindingArgs build() {
            $.buildServiceName = Objects.requireNonNull($.buildServiceName, "expected parameter 'buildServiceName' to be non-null");
            $.builderName = Objects.requireNonNull($.builderName, "expected parameter 'builderName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
