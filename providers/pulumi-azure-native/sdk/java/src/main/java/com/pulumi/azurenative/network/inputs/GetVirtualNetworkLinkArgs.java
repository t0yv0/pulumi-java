// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkLinkArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkLinkArgs Empty = new GetVirtualNetworkLinkArgs();

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @Import(name="privateZoneName", required=true)
    private String privateZoneName;

    /**
     * @return The name of the Private DNS zone (without a terminating dot).
     * 
     */
    public String privateZoneName() {
        return this.privateZoneName;
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

    /**
     * The name of the virtual network link.
     * 
     */
    @Import(name="virtualNetworkLinkName", required=true)
    private String virtualNetworkLinkName;

    /**
     * @return The name of the virtual network link.
     * 
     */
    public String virtualNetworkLinkName() {
        return this.virtualNetworkLinkName;
    }

    private GetVirtualNetworkLinkArgs() {}

    private GetVirtualNetworkLinkArgs(GetVirtualNetworkLinkArgs $) {
        this.privateZoneName = $.privateZoneName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkLinkName = $.virtualNetworkLinkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkLinkArgs $;

        public Builder() {
            $ = new GetVirtualNetworkLinkArgs();
        }

        public Builder(GetVirtualNetworkLinkArgs defaults) {
            $ = new GetVirtualNetworkLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateZoneName(String privateZoneName) {
            $.privateZoneName = privateZoneName;
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

        /**
         * @param virtualNetworkLinkName The name of the virtual network link.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkLinkName(String virtualNetworkLinkName) {
            $.virtualNetworkLinkName = virtualNetworkLinkName;
            return this;
        }

        public GetVirtualNetworkLinkArgs build() {
            $.privateZoneName = Objects.requireNonNull($.privateZoneName, "expected parameter 'privateZoneName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkLinkName = Objects.requireNonNull($.virtualNetworkLinkName, "expected parameter 'virtualNetworkLinkName' to be non-null");
            return $;
        }
    }

}
