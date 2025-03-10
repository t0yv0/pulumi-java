// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedPrivateEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedPrivateEndpointArgs Empty = new GetManagedPrivateEndpointArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * Managed private endpoint name
     * 
     */
    @Import(name="managedPrivateEndpointName", required=true)
    private String managedPrivateEndpointName;

    /**
     * @return Managed private endpoint name
     * 
     */
    public String managedPrivateEndpointName() {
        return this.managedPrivateEndpointName;
    }

    /**
     * Managed virtual network name
     * 
     */
    @Import(name="managedVirtualNetworkName", required=true)
    private String managedVirtualNetworkName;

    /**
     * @return Managed virtual network name
     * 
     */
    public String managedVirtualNetworkName() {
        return this.managedVirtualNetworkName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedPrivateEndpointArgs() {}

    private GetManagedPrivateEndpointArgs(GetManagedPrivateEndpointArgs $) {
        this.factoryName = $.factoryName;
        this.managedPrivateEndpointName = $.managedPrivateEndpointName;
        this.managedVirtualNetworkName = $.managedVirtualNetworkName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedPrivateEndpointArgs $;

        public Builder() {
            $ = new GetManagedPrivateEndpointArgs();
        }

        public Builder(GetManagedPrivateEndpointArgs defaults) {
            $ = new GetManagedPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param managedPrivateEndpointName Managed private endpoint name
         * 
         * @return builder
         * 
         */
        public Builder managedPrivateEndpointName(String managedPrivateEndpointName) {
            $.managedPrivateEndpointName = managedPrivateEndpointName;
            return this;
        }

        /**
         * @param managedVirtualNetworkName Managed virtual network name
         * 
         * @return builder
         * 
         */
        public Builder managedVirtualNetworkName(String managedVirtualNetworkName) {
            $.managedVirtualNetworkName = managedVirtualNetworkName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedPrivateEndpointArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.managedPrivateEndpointName = Objects.requireNonNull($.managedPrivateEndpointName, "expected parameter 'managedPrivateEndpointName' to be non-null");
            $.managedVirtualNetworkName = Objects.requireNonNull($.managedVirtualNetworkName, "expected parameter 'managedVirtualNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
