// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkInterfaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkInterfaceArgs Empty = new GetNetworkInterfaceArgs();

    /**
     * Specifies the name of the Network Interface.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Specifies the name of the Network Interface.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Specifies the name of the resource group the Network Interface is located in.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the name of the resource group the Network Interface is located in.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetNetworkInterfaceArgs() {}

    private GetNetworkInterfaceArgs(GetNetworkInterfaceArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkInterfaceArgs $;

        public Builder() {
            $ = new GetNetworkInterfaceArgs();
        }

        public Builder(GetNetworkInterfaceArgs defaults) {
            $ = new GetNetworkInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the Network Interface.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group the Network Interface is located in.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetNetworkInterfaceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
