// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import com.pulumi.azurenative.network.inputs.RoutingConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * P2SConnectionConfiguration Resource.
 * 
 */
public final class P2SConnectionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final P2SConnectionConfigurationArgs Empty = new P2SConnectionConfigurationArgs();

    /**
     * Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    @Import(name="enableInternetSecurity")
    private @Nullable Output<Boolean> enableInternetSecurity;

    /**
     * @return Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    public Optional<Output<Boolean>> enableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    @Import(name="routingConfiguration")
    private @Nullable Output<RoutingConfigurationArgs> routingConfiguration;

    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Optional<Output<RoutingConfigurationArgs>> routingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }

    /**
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    @Import(name="vpnClientAddressPool")
    private @Nullable Output<AddressSpaceArgs> vpnClientAddressPool;

    /**
     * @return The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    public Optional<Output<AddressSpaceArgs>> vpnClientAddressPool() {
        return Optional.ofNullable(this.vpnClientAddressPool);
    }

    private P2SConnectionConfigurationArgs() {}

    private P2SConnectionConfigurationArgs(P2SConnectionConfigurationArgs $) {
        this.enableInternetSecurity = $.enableInternetSecurity;
        this.id = $.id;
        this.name = $.name;
        this.routingConfiguration = $.routingConfiguration;
        this.vpnClientAddressPool = $.vpnClientAddressPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(P2SConnectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private P2SConnectionConfigurationArgs $;

        public Builder() {
            $ = new P2SConnectionConfigurationArgs();
        }

        public Builder(P2SConnectionConfigurationArgs defaults) {
            $ = new P2SConnectionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableInternetSecurity Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
         * 
         * @return builder
         * 
         */
        public Builder enableInternetSecurity(@Nullable Output<Boolean> enableInternetSecurity) {
            $.enableInternetSecurity = enableInternetSecurity;
            return this;
        }

        /**
         * @param enableInternetSecurity Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
         * 
         * @return builder
         * 
         */
        public Builder enableInternetSecurity(Boolean enableInternetSecurity) {
            return enableInternetSecurity(Output.of(enableInternetSecurity));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routingConfiguration The Routing Configuration indicating the associated and propagated route tables on this connection.
         * 
         * @return builder
         * 
         */
        public Builder routingConfiguration(@Nullable Output<RoutingConfigurationArgs> routingConfiguration) {
            $.routingConfiguration = routingConfiguration;
            return this;
        }

        /**
         * @param routingConfiguration The Routing Configuration indicating the associated and propagated route tables on this connection.
         * 
         * @return builder
         * 
         */
        public Builder routingConfiguration(RoutingConfigurationArgs routingConfiguration) {
            return routingConfiguration(Output.of(routingConfiguration));
        }

        /**
         * @param vpnClientAddressPool The reference to the address space resource which represents Address space for P2S VpnClient.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientAddressPool(@Nullable Output<AddressSpaceArgs> vpnClientAddressPool) {
            $.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }

        /**
         * @param vpnClientAddressPool The reference to the address space resource which represents Address space for P2S VpnClient.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientAddressPool(AddressSpaceArgs vpnClientAddressPool) {
            return vpnClientAddressPool(Output.of(vpnClientAddressPool));
        }

        public P2SConnectionConfigurationArgs build() {
            return $;
        }
    }

}
