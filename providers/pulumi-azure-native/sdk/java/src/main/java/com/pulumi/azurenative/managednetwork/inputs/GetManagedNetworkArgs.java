// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedNetworkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedNetworkArgs Empty = new GetManagedNetworkArgs();

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName", required=true)
    private String managedNetworkName;

    /**
     * @return The name of the Managed Network.
     * 
     */
    public String managedNetworkName() {
        return this.managedNetworkName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetManagedNetworkArgs() {}

    private GetManagedNetworkArgs(GetManagedNetworkArgs $) {
        this.managedNetworkName = $.managedNetworkName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedNetworkArgs $;

        public Builder() {
            $ = new GetManagedNetworkArgs();
        }

        public Builder(GetManagedNetworkArgs defaults) {
            $ = new GetManagedNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedNetworkName The name of the Managed Network.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkName(String managedNetworkName) {
            $.managedNetworkName = managedNetworkName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetManagedNetworkArgs build() {
            $.managedNetworkName = Objects.requireNonNull($.managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
