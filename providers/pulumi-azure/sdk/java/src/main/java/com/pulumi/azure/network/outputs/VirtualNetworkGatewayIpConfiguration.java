// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkGatewayIpConfiguration {
    /**
     * @return A user-defined name of the IP configuration. Defaults to
     * `vnetGatewayConfig`.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Defines how the private IP address
     * of the gateways virtual interface is assigned. Valid options are `Static` or
     * `Dynamic`. Defaults to `Dynamic`.
     * 
     */
    private final @Nullable String privateIpAddressAllocation;
    /**
     * @return The ID of the public IP address to associate
     * with the Virtual Network Gateway.
     * 
     */
    private final String publicIpAddressId;
    /**
     * @return The ID of the gateway subnet of a virtual network in
     * which the virtual network gateway will be created. It is mandatory that
     * the associated subnet is named `GatewaySubnet`. Therefore, each virtual
     * network can contain at most a single Virtual Network Gateway.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private VirtualNetworkGatewayIpConfiguration(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("privateIpAddressAllocation") @Nullable String privateIpAddressAllocation,
        @CustomType.Parameter("publicIpAddressId") String publicIpAddressId,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.name = name;
        this.privateIpAddressAllocation = privateIpAddressAllocation;
        this.publicIpAddressId = publicIpAddressId;
        this.subnetId = subnetId;
    }

    /**
     * @return A user-defined name of the IP configuration. Defaults to
     * `vnetGatewayConfig`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Defines how the private IP address
     * of the gateways virtual interface is assigned. Valid options are `Static` or
     * `Dynamic`. Defaults to `Dynamic`.
     * 
     */
    public Optional<String> privateIpAddressAllocation() {
        return Optional.ofNullable(this.privateIpAddressAllocation);
    }
    /**
     * @return The ID of the public IP address to associate
     * with the Virtual Network Gateway.
     * 
     */
    public String publicIpAddressId() {
        return this.publicIpAddressId;
    }
    /**
     * @return The ID of the gateway subnet of a virtual network in
     * which the virtual network gateway will be created. It is mandatory that
     * the associated subnet is named `GatewaySubnet`. Therefore, each virtual
     * network can contain at most a single Virtual Network Gateway.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayIpConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String privateIpAddressAllocation;
        private String publicIpAddressId;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.privateIpAddressAllocation = defaults.privateIpAddressAllocation;
    	      this.publicIpAddressId = defaults.publicIpAddressId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateIpAddressAllocation(@Nullable String privateIpAddressAllocation) {
            this.privateIpAddressAllocation = privateIpAddressAllocation;
            return this;
        }
        public Builder publicIpAddressId(String publicIpAddressId) {
            this.publicIpAddressId = Objects.requireNonNull(publicIpAddressId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public VirtualNetworkGatewayIpConfiguration build() {
            return new VirtualNetworkGatewayIpConfiguration(name, privateIpAddressAllocation, publicIpAddressId, subnetId);
        }
    }
}
