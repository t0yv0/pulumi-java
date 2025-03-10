// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.network.inputs.VirtualNetworkGatewayBgpSettingsArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayCustomRouteArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayIpConfigurationArgs;
import com.pulumi.azure.network.inputs.VirtualNetworkGatewayVpnClientConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayArgs Empty = new VirtualNetworkGatewayArgs();

    /**
     * If `true`, an active-active Virtual Network Gateway
     * will be created. An active-active gateway requires a `HighPerformance` or an
     * `UltraPerformance` SKU. If `false`, an active-standby gateway will be created.
     * Defaults to `false`.
     * 
     */
    @Import(name="activeActive")
    private @Nullable Output<Boolean> activeActive;

    /**
     * @return If `true`, an active-active Virtual Network Gateway
     * will be created. An active-active gateway requires a `HighPerformance` or an
     * `UltraPerformance` SKU. If `false`, an active-standby gateway will be created.
     * Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> activeActive() {
        return Optional.ofNullable(this.activeActive);
    }

    /**
     * A block of `bgp_settings`.
     * 
     */
    @Import(name="bgpSettings")
    private @Nullable Output<VirtualNetworkGatewayBgpSettingsArgs> bgpSettings;

    /**
     * @return A block of `bgp_settings`.
     * 
     */
    public Optional<Output<VirtualNetworkGatewayBgpSettingsArgs>> bgpSettings() {
        return Optional.ofNullable(this.bgpSettings);
    }

    @Import(name="customRoute")
    private @Nullable Output<VirtualNetworkGatewayCustomRouteArgs> customRoute;

    public Optional<Output<VirtualNetworkGatewayCustomRouteArgs>> customRoute() {
        return Optional.ofNullable(this.customRoute);
    }

    /**
     * The ID of the local network gateway
     * through which outbound Internet traffic from the virtual network in which the
     * gateway is created will be routed (*forced tunnelling*). Refer to the
     * [Azure documentation on forced tunnelling](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-forced-tunneling-rm).
     * If not specified, forced tunnelling is disabled.
     * 
     */
    @Import(name="defaultLocalNetworkGatewayId")
    private @Nullable Output<String> defaultLocalNetworkGatewayId;

    /**
     * @return The ID of the local network gateway
     * through which outbound Internet traffic from the virtual network in which the
     * gateway is created will be routed (*forced tunnelling*). Refer to the
     * [Azure documentation on forced tunnelling](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-forced-tunneling-rm).
     * If not specified, forced tunnelling is disabled.
     * 
     */
    public Optional<Output<String>> defaultLocalNetworkGatewayId() {
        return Optional.ofNullable(this.defaultLocalNetworkGatewayId);
    }

    /**
     * Specifies the Edge Zone within the Azure Region where this Virtual Network Gateway should exist. Changing this forces a new Virtual Network Gateway to be created.
     * 
     */
    @Import(name="edgeZone")
    private @Nullable Output<String> edgeZone;

    /**
     * @return Specifies the Edge Zone within the Azure Region where this Virtual Network Gateway should exist. Changing this forces a new Virtual Network Gateway to be created.
     * 
     */
    public Optional<Output<String>> edgeZone() {
        return Optional.ofNullable(this.edgeZone);
    }

    /**
     * If `true`, BGP (Border Gateway Protocol) will be enabled
     * for this Virtual Network Gateway. Defaults to `false`.
     * 
     */
    @Import(name="enableBgp")
    private @Nullable Output<Boolean> enableBgp;

    /**
     * @return If `true`, BGP (Border Gateway Protocol) will be enabled
     * for this Virtual Network Gateway. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }

    /**
     * The Generation of the Virtual Network gateway. Possible values include `Generation1`, `Generation2` or `None`.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return The Generation of the Virtual Network gateway. Possible values include `Generation1`, `Generation2` or `None`.
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * One, two or three `ip_configuration` blocks documented below.
     * An active-standby gateway requires exactly one `ip_configuration` block,
     * an active-active gateway requires exactly two `ip_configuration` blocks whereas
     * an active-active zone redundant gateway with P2S configuration requires exactly three `ip_configuration` blocks.
     * 
     */
    @Import(name="ipConfigurations", required=true)
    private Output<List<VirtualNetworkGatewayIpConfigurationArgs>> ipConfigurations;

    /**
     * @return One, two or three `ip_configuration` blocks documented below.
     * An active-standby gateway requires exactly one `ip_configuration` block,
     * an active-active gateway requires exactly two `ip_configuration` blocks whereas
     * an active-active zone redundant gateway with P2S configuration requires exactly three `ip_configuration` blocks.
     * 
     */
    public Output<List<VirtualNetworkGatewayIpConfigurationArgs>> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * The location/region where the Virtual Network Gateway is
     * located. Changing the location/region forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location/region where the Virtual Network Gateway is
     * located. Changing the location/region forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A user-defined name of the IP configuration. Defaults to
     * `vnetGatewayConfig`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-defined name of the IP configuration. Defaults to
     * `vnetGatewayConfig`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Should private IP be enabled on this gateway for connections? Changing this forces a new resource to be created.
     * 
     */
    @Import(name="privateIpAddressEnabled")
    private @Nullable Output<Boolean> privateIpAddressEnabled;

    /**
     * @return Should private IP be enabled on this gateway for connections? Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> privateIpAddressEnabled() {
        return Optional.ofNullable(this.privateIpAddressEnabled);
    }

    /**
     * The name of the resource group in which to
     * create the Virtual Network Gateway. Changing the resource group name forces
     * a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to
     * create the Virtual Network Gateway. Changing the resource group name forces
     * a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Configuration of the size and capacity of the virtual network
     * gateway. Valid options are `Basic`, `Standard`, `HighPerformance`, `UltraPerformance`,
     * `ErGw1AZ`, `ErGw2AZ`, `ErGw3AZ`, `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw4`,`VpnGw5`, `VpnGw1AZ`,
     * `VpnGw2AZ`, `VpnGw3AZ`,`VpnGw4AZ` and `VpnGw5AZ` and depend on the `type`, `vpn_type` and
     * `generation` arguments.
     * A `PolicyBased` gateway only supports the `Basic` SKU. Further, the `UltraPerformance`
     * SKU is only supported by an `ExpressRoute` gateway.
     * 
     */
    @Import(name="sku", required=true)
    private Output<String> sku;

    /**
     * @return Configuration of the size and capacity of the virtual network
     * gateway. Valid options are `Basic`, `Standard`, `HighPerformance`, `UltraPerformance`,
     * `ErGw1AZ`, `ErGw2AZ`, `ErGw3AZ`, `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw4`,`VpnGw5`, `VpnGw1AZ`,
     * `VpnGw2AZ`, `VpnGw3AZ`,`VpnGw4AZ` and `VpnGw5AZ` and depend on the `type`, `vpn_type` and
     * `generation` arguments.
     * A `PolicyBased` gateway only supports the `Basic` SKU. Further, the `UltraPerformance`
     * SKU is only supported by an `ExpressRoute` gateway.
     * 
     */
    public Output<String> sku() {
        return this.sku;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the Virtual Network Gateway. Valid options are
     * `Vpn` or `ExpressRoute`. Changing the type forces a new resource to be created.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the Virtual Network Gateway. Valid options are
     * `Vpn` or `ExpressRoute`. Changing the type forces a new resource to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * A `vpn_client_configuration` block which
     * is documented below. In this block the Virtual Network Gateway can be configured
     * to accept IPSec point-to-site connections.
     * 
     */
    @Import(name="vpnClientConfiguration")
    private @Nullable Output<VirtualNetworkGatewayVpnClientConfigurationArgs> vpnClientConfiguration;

    /**
     * @return A `vpn_client_configuration` block which
     * is documented below. In this block the Virtual Network Gateway can be configured
     * to accept IPSec point-to-site connections.
     * 
     */
    public Optional<Output<VirtualNetworkGatewayVpnClientConfigurationArgs>> vpnClientConfiguration() {
        return Optional.ofNullable(this.vpnClientConfiguration);
    }

    /**
     * The routing type of the Virtual Network Gateway. Valid
     * options are `RouteBased` or `PolicyBased`. Defaults to `RouteBased`.
     * 
     */
    @Import(name="vpnType")
    private @Nullable Output<String> vpnType;

    /**
     * @return The routing type of the Virtual Network Gateway. Valid
     * options are `RouteBased` or `PolicyBased`. Defaults to `RouteBased`.
     * 
     */
    public Optional<Output<String>> vpnType() {
        return Optional.ofNullable(this.vpnType);
    }

    private VirtualNetworkGatewayArgs() {}

    private VirtualNetworkGatewayArgs(VirtualNetworkGatewayArgs $) {
        this.activeActive = $.activeActive;
        this.bgpSettings = $.bgpSettings;
        this.customRoute = $.customRoute;
        this.defaultLocalNetworkGatewayId = $.defaultLocalNetworkGatewayId;
        this.edgeZone = $.edgeZone;
        this.enableBgp = $.enableBgp;
        this.generation = $.generation;
        this.ipConfigurations = $.ipConfigurations;
        this.location = $.location;
        this.name = $.name;
        this.privateIpAddressEnabled = $.privateIpAddressEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.type = $.type;
        this.vpnClientConfiguration = $.vpnClientConfiguration;
        this.vpnType = $.vpnType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkGatewayArgs $;

        public Builder() {
            $ = new VirtualNetworkGatewayArgs();
        }

        public Builder(VirtualNetworkGatewayArgs defaults) {
            $ = new VirtualNetworkGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activeActive If `true`, an active-active Virtual Network Gateway
         * will be created. An active-active gateway requires a `HighPerformance` or an
         * `UltraPerformance` SKU. If `false`, an active-standby gateway will be created.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder activeActive(@Nullable Output<Boolean> activeActive) {
            $.activeActive = activeActive;
            return this;
        }

        /**
         * @param activeActive If `true`, an active-active Virtual Network Gateway
         * will be created. An active-active gateway requires a `HighPerformance` or an
         * `UltraPerformance` SKU. If `false`, an active-standby gateway will be created.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder activeActive(Boolean activeActive) {
            return activeActive(Output.of(activeActive));
        }

        /**
         * @param bgpSettings A block of `bgp_settings`.
         * 
         * @return builder
         * 
         */
        public Builder bgpSettings(@Nullable Output<VirtualNetworkGatewayBgpSettingsArgs> bgpSettings) {
            $.bgpSettings = bgpSettings;
            return this;
        }

        /**
         * @param bgpSettings A block of `bgp_settings`.
         * 
         * @return builder
         * 
         */
        public Builder bgpSettings(VirtualNetworkGatewayBgpSettingsArgs bgpSettings) {
            return bgpSettings(Output.of(bgpSettings));
        }

        public Builder customRoute(@Nullable Output<VirtualNetworkGatewayCustomRouteArgs> customRoute) {
            $.customRoute = customRoute;
            return this;
        }

        public Builder customRoute(VirtualNetworkGatewayCustomRouteArgs customRoute) {
            return customRoute(Output.of(customRoute));
        }

        /**
         * @param defaultLocalNetworkGatewayId The ID of the local network gateway
         * through which outbound Internet traffic from the virtual network in which the
         * gateway is created will be routed (*forced tunnelling*). Refer to the
         * [Azure documentation on forced tunnelling](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-forced-tunneling-rm).
         * If not specified, forced tunnelling is disabled.
         * 
         * @return builder
         * 
         */
        public Builder defaultLocalNetworkGatewayId(@Nullable Output<String> defaultLocalNetworkGatewayId) {
            $.defaultLocalNetworkGatewayId = defaultLocalNetworkGatewayId;
            return this;
        }

        /**
         * @param defaultLocalNetworkGatewayId The ID of the local network gateway
         * through which outbound Internet traffic from the virtual network in which the
         * gateway is created will be routed (*forced tunnelling*). Refer to the
         * [Azure documentation on forced tunnelling](https://docs.microsoft.com/en-us/azure/vpn-gateway/vpn-gateway-forced-tunneling-rm).
         * If not specified, forced tunnelling is disabled.
         * 
         * @return builder
         * 
         */
        public Builder defaultLocalNetworkGatewayId(String defaultLocalNetworkGatewayId) {
            return defaultLocalNetworkGatewayId(Output.of(defaultLocalNetworkGatewayId));
        }

        /**
         * @param edgeZone Specifies the Edge Zone within the Azure Region where this Virtual Network Gateway should exist. Changing this forces a new Virtual Network Gateway to be created.
         * 
         * @return builder
         * 
         */
        public Builder edgeZone(@Nullable Output<String> edgeZone) {
            $.edgeZone = edgeZone;
            return this;
        }

        /**
         * @param edgeZone Specifies the Edge Zone within the Azure Region where this Virtual Network Gateway should exist. Changing this forces a new Virtual Network Gateway to be created.
         * 
         * @return builder
         * 
         */
        public Builder edgeZone(String edgeZone) {
            return edgeZone(Output.of(edgeZone));
        }

        /**
         * @param enableBgp If `true`, BGP (Border Gateway Protocol) will be enabled
         * for this Virtual Network Gateway. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBgp(@Nullable Output<Boolean> enableBgp) {
            $.enableBgp = enableBgp;
            return this;
        }

        /**
         * @param enableBgp If `true`, BGP (Border Gateway Protocol) will be enabled
         * for this Virtual Network Gateway. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableBgp(Boolean enableBgp) {
            return enableBgp(Output.of(enableBgp));
        }

        /**
         * @param generation The Generation of the Virtual Network gateway. Possible values include `Generation1`, `Generation2` or `None`.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation The Generation of the Virtual Network gateway. Possible values include `Generation1`, `Generation2` or `None`.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param ipConfigurations One, two or three `ip_configuration` blocks documented below.
         * An active-standby gateway requires exactly one `ip_configuration` block,
         * an active-active gateway requires exactly two `ip_configuration` blocks whereas
         * an active-active zone redundant gateway with P2S configuration requires exactly three `ip_configuration` blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(Output<List<VirtualNetworkGatewayIpConfigurationArgs>> ipConfigurations) {
            $.ipConfigurations = ipConfigurations;
            return this;
        }

        /**
         * @param ipConfigurations One, two or three `ip_configuration` blocks documented below.
         * An active-standby gateway requires exactly one `ip_configuration` block,
         * an active-active gateway requires exactly two `ip_configuration` blocks whereas
         * an active-active zone redundant gateway with P2S configuration requires exactly three `ip_configuration` blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(List<VirtualNetworkGatewayIpConfigurationArgs> ipConfigurations) {
            return ipConfigurations(Output.of(ipConfigurations));
        }

        /**
         * @param ipConfigurations One, two or three `ip_configuration` blocks documented below.
         * An active-standby gateway requires exactly one `ip_configuration` block,
         * an active-active gateway requires exactly two `ip_configuration` blocks whereas
         * an active-active zone redundant gateway with P2S configuration requires exactly three `ip_configuration` blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigurations(VirtualNetworkGatewayIpConfigurationArgs... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }

        /**
         * @param location The location/region where the Virtual Network Gateway is
         * located. Changing the location/region forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location/region where the Virtual Network Gateway is
         * located. Changing the location/region forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name A user-defined name of the IP configuration. Defaults to
         * `vnetGatewayConfig`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-defined name of the IP configuration. Defaults to
         * `vnetGatewayConfig`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateIpAddressEnabled Should private IP be enabled on this gateway for connections? Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressEnabled(@Nullable Output<Boolean> privateIpAddressEnabled) {
            $.privateIpAddressEnabled = privateIpAddressEnabled;
            return this;
        }

        /**
         * @param privateIpAddressEnabled Should private IP be enabled on this gateway for connections? Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddressEnabled(Boolean privateIpAddressEnabled) {
            return privateIpAddressEnabled(Output.of(privateIpAddressEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the Virtual Network Gateway. Changing the resource group name forces
         * a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to
         * create the Virtual Network Gateway. Changing the resource group name forces
         * a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Configuration of the size and capacity of the virtual network
         * gateway. Valid options are `Basic`, `Standard`, `HighPerformance`, `UltraPerformance`,
         * `ErGw1AZ`, `ErGw2AZ`, `ErGw3AZ`, `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw4`,`VpnGw5`, `VpnGw1AZ`,
         * `VpnGw2AZ`, `VpnGw3AZ`,`VpnGw4AZ` and `VpnGw5AZ` and depend on the `type`, `vpn_type` and
         * `generation` arguments.
         * A `PolicyBased` gateway only supports the `Basic` SKU. Further, the `UltraPerformance`
         * SKU is only supported by an `ExpressRoute` gateway.
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Configuration of the size and capacity of the virtual network
         * gateway. Valid options are `Basic`, `Standard`, `HighPerformance`, `UltraPerformance`,
         * `ErGw1AZ`, `ErGw2AZ`, `ErGw3AZ`, `VpnGw1`, `VpnGw2`, `VpnGw3`, `VpnGw4`,`VpnGw5`, `VpnGw1AZ`,
         * `VpnGw2AZ`, `VpnGw3AZ`,`VpnGw4AZ` and `VpnGw5AZ` and depend on the `type`, `vpn_type` and
         * `generation` arguments.
         * A `PolicyBased` gateway only supports the `Basic` SKU. Further, the `UltraPerformance`
         * SKU is only supported by an `ExpressRoute` gateway.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type The type of the Virtual Network Gateway. Valid options are
         * `Vpn` or `ExpressRoute`. Changing the type forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the Virtual Network Gateway. Valid options are
         * `Vpn` or `ExpressRoute`. Changing the type forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vpnClientConfiguration A `vpn_client_configuration` block which
         * is documented below. In this block the Virtual Network Gateway can be configured
         * to accept IPSec point-to-site connections.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientConfiguration(@Nullable Output<VirtualNetworkGatewayVpnClientConfigurationArgs> vpnClientConfiguration) {
            $.vpnClientConfiguration = vpnClientConfiguration;
            return this;
        }

        /**
         * @param vpnClientConfiguration A `vpn_client_configuration` block which
         * is documented below. In this block the Virtual Network Gateway can be configured
         * to accept IPSec point-to-site connections.
         * 
         * @return builder
         * 
         */
        public Builder vpnClientConfiguration(VirtualNetworkGatewayVpnClientConfigurationArgs vpnClientConfiguration) {
            return vpnClientConfiguration(Output.of(vpnClientConfiguration));
        }

        /**
         * @param vpnType The routing type of the Virtual Network Gateway. Valid
         * options are `RouteBased` or `PolicyBased`. Defaults to `RouteBased`.
         * 
         * @return builder
         * 
         */
        public Builder vpnType(@Nullable Output<String> vpnType) {
            $.vpnType = vpnType;
            return this;
        }

        /**
         * @param vpnType The routing type of the Virtual Network Gateway. Valid
         * options are `RouteBased` or `PolicyBased`. Defaults to `RouteBased`.
         * 
         * @return builder
         * 
         */
        public Builder vpnType(String vpnType) {
            return vpnType(Output.of(vpnType));
        }

        public VirtualNetworkGatewayArgs build() {
            $.ipConfigurations = Objects.requireNonNull($.ipConfigurations, "expected parameter 'ipConfigurations' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
