// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Azure Container Registry.
 * 
 */
public final class ContainerRegistryPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerRegistryPropertiesArgs Empty = new ContainerRegistryPropertiesArgs();

    /**
     * ARM resource ID of the Azure Container Registry used to store Docker images for web services in the cluster. If not provided one will be created. This cannot be changed once the cluster is created.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return ARM resource ID of the Azure Container Registry used to store Docker images for web services in the cluster. If not provided one will be created. This cannot be changed once the cluster is created.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private ContainerRegistryPropertiesArgs() {}

    private ContainerRegistryPropertiesArgs(ContainerRegistryPropertiesArgs $) {
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerRegistryPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerRegistryPropertiesArgs $;

        public Builder() {
            $ = new ContainerRegistryPropertiesArgs();
        }

        public Builder(ContainerRegistryPropertiesArgs defaults) {
            $ = new ContainerRegistryPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceId ARM resource ID of the Azure Container Registry used to store Docker images for web services in the cluster. If not provided one will be created. This cannot be changed once the cluster is created.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId ARM resource ID of the Azure Container Registry used to store Docker images for web services in the cluster. If not provided one will be created. This cannot be changed once the cluster is created.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public ContainerRegistryPropertiesArgs build() {
            return $;
        }
    }

}
