// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual Network ACL Rule object
 * 
 */
public final class VirtualNetworkRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    @Import(name="ignoreMissingVNetServiceEndpoint")
    private @Nullable Output<Boolean> ignoreMissingVNetServiceEndpoint;

    /**
     * @return Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    public Optional<Output<Boolean>> ignoreMissingVNetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVNetServiceEndpoint);
    }

    private VirtualNetworkRuleArgs() {}

    private VirtualNetworkRuleArgs(VirtualNetworkRuleArgs $) {
        this.id = $.id;
        this.ignoreMissingVNetServiceEndpoint = $.ignoreMissingVNetServiceEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkRuleArgs $;

        public Builder() {
            $ = new VirtualNetworkRuleArgs();
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
            $ = new VirtualNetworkRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param ignoreMissingVNetServiceEndpoint Create firewall rule before the virtual network has vnet service endpoint enabled.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVNetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVNetServiceEndpoint) {
            $.ignoreMissingVNetServiceEndpoint = ignoreMissingVNetServiceEndpoint;
            return this;
        }

        /**
         * @param ignoreMissingVNetServiceEndpoint Create firewall rule before the virtual network has vnet service endpoint enabled.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMissingVNetServiceEndpoint(Boolean ignoreMissingVNetServiceEndpoint) {
            return ignoreMissingVNetServiceEndpoint(Output.of(ignoreMissingVNetServiceEndpoint));
        }

        public VirtualNetworkRuleArgs build() {
            return $;
        }
    }

}
