// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteTableRoute {
    /**
     * @return The destination to which the route applies. Can be CIDR (such as `10.1.0.0/16`) or [Azure Service Tag](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview) (such as `ApiManagement`, `AzureBackup` or `AzureMonitor`) format.
     * 
     */
    private final String addressPrefix;
    /**
     * @return The name of the route.(Required) The destination to which the route applies. Can be CIDR (such as `10.1.0.0/16`) or [Azure Service Tag](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview) (such as `ApiManagement`, `AzureBackup` or `AzureMonitor`) format.
     * 
     */
    private final String name;
    /**
     * @return Contains the IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is `VirtualAppliance`.
     * 
     */
    private final @Nullable String nextHopInIpAddress;
    /**
     * @return The type of Azure hop the packet should be sent to. Possible values are `VirtualNetworkGateway`, `VnetLocal`, `Internet`, `VirtualAppliance` and `None`.
     * 
     */
    private final String nextHopType;

    @CustomType.Constructor
    private RouteTableRoute(
        @CustomType.Parameter("addressPrefix") String addressPrefix,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nextHopInIpAddress") @Nullable String nextHopInIpAddress,
        @CustomType.Parameter("nextHopType") String nextHopType) {
        this.addressPrefix = addressPrefix;
        this.name = name;
        this.nextHopInIpAddress = nextHopInIpAddress;
        this.nextHopType = nextHopType;
    }

    /**
     * @return The destination to which the route applies. Can be CIDR (such as `10.1.0.0/16`) or [Azure Service Tag](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview) (such as `ApiManagement`, `AzureBackup` or `AzureMonitor`) format.
     * 
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }
    /**
     * @return The name of the route.(Required) The destination to which the route applies. Can be CIDR (such as `10.1.0.0/16`) or [Azure Service Tag](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview) (such as `ApiManagement`, `AzureBackup` or `AzureMonitor`) format.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Contains the IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is `VirtualAppliance`.
     * 
     */
    public Optional<String> nextHopInIpAddress() {
        return Optional.ofNullable(this.nextHopInIpAddress);
    }
    /**
     * @return The type of Azure hop the packet should be sent to. Possible values are `VirtualNetworkGateway`, `VnetLocal`, `Internet`, `VirtualAppliance` and `None`.
     * 
     */
    public String nextHopType() {
        return this.nextHopType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressPrefix;
        private String name;
        private @Nullable String nextHopInIpAddress;
        private String nextHopType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.name = defaults.name;
    	      this.nextHopInIpAddress = defaults.nextHopInIpAddress;
    	      this.nextHopType = defaults.nextHopType;
        }

        public Builder addressPrefix(String addressPrefix) {
            this.addressPrefix = Objects.requireNonNull(addressPrefix);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nextHopInIpAddress(@Nullable String nextHopInIpAddress) {
            this.nextHopInIpAddress = nextHopInIpAddress;
            return this;
        }
        public Builder nextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }        public RouteTableRoute build() {
            return new RouteTableRoute(addressPrefix, name, nextHopInIpAddress, nextHopType);
        }
    }
}
