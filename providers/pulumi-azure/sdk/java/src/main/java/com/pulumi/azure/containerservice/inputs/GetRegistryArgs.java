// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryArgs Empty = new GetRegistryArgs();

    /**
     * The name of the Container Registry.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the Container Registry.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where this Container Registry exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Name of the Resource Group where this Container Registry exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetRegistryArgs() {}

    private GetRegistryArgs(GetRegistryArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryArgs $;

        public Builder() {
            $ = new GetRegistryArgs();
        }

        public Builder(GetRegistryArgs defaults) {
            $ = new GetRegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Container Registry.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where this Container Registry exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetRegistryArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
