// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.azure.network.outputs.GetGatewayConnectionIpsecPolicy;
import com.pulumi.azure.network.outputs.GetGatewayConnectionTrafficSelectorPolicy;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGatewayConnectionResult {
    /**
     * @return The authorization key associated with the
     * Express Route Circuit. This field is present only if the type is an
     * ExpressRoute connection.
     * 
     */
    private final String authorizationKey;
    private final String connectionProtocol;
    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    private final Integer dpdTimeoutSeconds;
    private final Integer egressBytesTransferred;
    /**
     * @return If `true`, BGP (Border Gateway Protocol) is enabled
     * for this connection.
     * 
     */
    private final Boolean enableBgp;
    /**
     * @return The ID of the Express Route Circuit
     * (i.e. when `type` is `ExpressRoute`).
     * 
     */
    private final String expressRouteCircuitId;
    /**
     * @return If `true`, data packets will bypass ExpressRoute Gateway for data forwarding. This is only valid for ExpressRoute connections.
     * 
     */
    private final Boolean expressRouteGatewayBypass;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Integer ingressBytesTransferred;
    private final List<GetGatewayConnectionIpsecPolicy> ipsecPolicies;
    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    private final Boolean localAzureIpAddressEnabled;
    /**
     * @return The ID of the local network gateway
     * when a Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    private final String localNetworkGatewayId;
    /**
     * @return The location/region where the connection is
     * located.
     * 
     */
    private final String location;
    private final String name;
    /**
     * @return The ID of the peer virtual
     * network gateway when a VNet-to-VNet connection (i.e. when `type`
     * is `Vnet2Vnet`).
     * 
     */
    private final String peerVirtualNetworkGatewayId;
    private final String resourceGroupName;
    private final String resourceGuid;
    /**
     * @return The routing weight.
     * 
     */
    private final Integer routingWeight;
    /**
     * @return The shared IPSec key.
     * 
     */
    private final String sharedKey;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private final Map<String,String> tags;
    private final List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies;
    /**
     * @return The type of connection. Valid options are `IPsec`
     * (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet).
     * 
     */
    private final String type;
    /**
     * @return If `true`, policy-based traffic
     * selectors are enabled for this connection. Enabling policy-based traffic
     * selectors requires an `ipsec_policy` block.
     * 
     */
    private final Boolean usePolicyBasedTrafficSelectors;
    /**
     * @return The ID of the Virtual Network Gateway
     * in which the connection is created.
     * 
     */
    private final String virtualNetworkGatewayId;

    @CustomType.Constructor
    private GetGatewayConnectionResult(
        @CustomType.Parameter("authorizationKey") String authorizationKey,
        @CustomType.Parameter("connectionProtocol") String connectionProtocol,
        @CustomType.Parameter("dpdTimeoutSeconds") Integer dpdTimeoutSeconds,
        @CustomType.Parameter("egressBytesTransferred") Integer egressBytesTransferred,
        @CustomType.Parameter("enableBgp") Boolean enableBgp,
        @CustomType.Parameter("expressRouteCircuitId") String expressRouteCircuitId,
        @CustomType.Parameter("expressRouteGatewayBypass") Boolean expressRouteGatewayBypass,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ingressBytesTransferred") Integer ingressBytesTransferred,
        @CustomType.Parameter("ipsecPolicies") List<GetGatewayConnectionIpsecPolicy> ipsecPolicies,
        @CustomType.Parameter("localAzureIpAddressEnabled") Boolean localAzureIpAddressEnabled,
        @CustomType.Parameter("localNetworkGatewayId") String localNetworkGatewayId,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peerVirtualNetworkGatewayId") String peerVirtualNetworkGatewayId,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("routingWeight") Integer routingWeight,
        @CustomType.Parameter("sharedKey") String sharedKey,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("trafficSelectorPolicies") List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("usePolicyBasedTrafficSelectors") Boolean usePolicyBasedTrafficSelectors,
        @CustomType.Parameter("virtualNetworkGatewayId") String virtualNetworkGatewayId) {
        this.authorizationKey = authorizationKey;
        this.connectionProtocol = connectionProtocol;
        this.dpdTimeoutSeconds = dpdTimeoutSeconds;
        this.egressBytesTransferred = egressBytesTransferred;
        this.enableBgp = enableBgp;
        this.expressRouteCircuitId = expressRouteCircuitId;
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        this.id = id;
        this.ingressBytesTransferred = ingressBytesTransferred;
        this.ipsecPolicies = ipsecPolicies;
        this.localAzureIpAddressEnabled = localAzureIpAddressEnabled;
        this.localNetworkGatewayId = localNetworkGatewayId;
        this.location = location;
        this.name = name;
        this.peerVirtualNetworkGatewayId = peerVirtualNetworkGatewayId;
        this.resourceGroupName = resourceGroupName;
        this.resourceGuid = resourceGuid;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.tags = tags;
        this.trafficSelectorPolicies = trafficSelectorPolicies;
        this.type = type;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.virtualNetworkGatewayId = virtualNetworkGatewayId;
    }

    /**
     * @return The authorization key associated with the
     * Express Route Circuit. This field is present only if the type is an
     * ExpressRoute connection.
     * 
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }
    public String connectionProtocol() {
        return this.connectionProtocol;
    }
    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    public Integer dpdTimeoutSeconds() {
        return this.dpdTimeoutSeconds;
    }
    public Integer egressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * @return If `true`, BGP (Border Gateway Protocol) is enabled
     * for this connection.
     * 
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }
    /**
     * @return The ID of the Express Route Circuit
     * (i.e. when `type` is `ExpressRoute`).
     * 
     */
    public String expressRouteCircuitId() {
        return this.expressRouteCircuitId;
    }
    /**
     * @return If `true`, data packets will bypass ExpressRoute Gateway for data forwarding. This is only valid for ExpressRoute connections.
     * 
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Integer ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    public List<GetGatewayConnectionIpsecPolicy> ipsecPolicies() {
        return this.ipsecPolicies;
    }
    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    public Boolean localAzureIpAddressEnabled() {
        return this.localAzureIpAddressEnabled;
    }
    /**
     * @return The ID of the local network gateway
     * when a Site-to-Site connection (i.e. when `type` is `IPsec`).
     * 
     */
    public String localNetworkGatewayId() {
        return this.localNetworkGatewayId;
    }
    /**
     * @return The location/region where the connection is
     * located.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the peer virtual
     * network gateway when a VNet-to-VNet connection (i.e. when `type`
     * is `Vnet2Vnet`).
     * 
     */
    public String peerVirtualNetworkGatewayId() {
        return this.peerVirtualNetworkGatewayId;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return The routing weight.
     * 
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }
    /**
     * @return The shared IPSec key.
     * 
     */
    public String sharedKey() {
        return this.sharedKey;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    public List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.trafficSelectorPolicies;
    }
    /**
     * @return The type of connection. Valid options are `IPsec`
     * (Site-to-Site), `ExpressRoute` (ExpressRoute), and `Vnet2Vnet` (VNet-to-VNet).
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return If `true`, policy-based traffic
     * selectors are enabled for this connection. Enabling policy-based traffic
     * selectors requires an `ipsec_policy` block.
     * 
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.usePolicyBasedTrafficSelectors;
    }
    /**
     * @return The ID of the Virtual Network Gateway
     * in which the connection is created.
     * 
     */
    public String virtualNetworkGatewayId() {
        return this.virtualNetworkGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationKey;
        private String connectionProtocol;
        private Integer dpdTimeoutSeconds;
        private Integer egressBytesTransferred;
        private Boolean enableBgp;
        private String expressRouteCircuitId;
        private Boolean expressRouteGatewayBypass;
        private String id;
        private Integer ingressBytesTransferred;
        private List<GetGatewayConnectionIpsecPolicy> ipsecPolicies;
        private Boolean localAzureIpAddressEnabled;
        private String localNetworkGatewayId;
        private String location;
        private String name;
        private String peerVirtualNetworkGatewayId;
        private String resourceGroupName;
        private String resourceGuid;
        private Integer routingWeight;
        private String sharedKey;
        private Map<String,String> tags;
        private List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies;
        private String type;
        private Boolean usePolicyBasedTrafficSelectors;
        private String virtualNetworkGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.connectionProtocol = defaults.connectionProtocol;
    	      this.dpdTimeoutSeconds = defaults.dpdTimeoutSeconds;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.enableBgp = defaults.enableBgp;
    	      this.expressRouteCircuitId = defaults.expressRouteCircuitId;
    	      this.expressRouteGatewayBypass = defaults.expressRouteGatewayBypass;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.localAzureIpAddressEnabled = defaults.localAzureIpAddressEnabled;
    	      this.localNetworkGatewayId = defaults.localNetworkGatewayId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peerVirtualNetworkGatewayId = defaults.peerVirtualNetworkGatewayId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.tags = defaults.tags;
    	      this.trafficSelectorPolicies = defaults.trafficSelectorPolicies;
    	      this.type = defaults.type;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.virtualNetworkGatewayId = defaults.virtualNetworkGatewayId;
        }

        public Builder authorizationKey(String authorizationKey) {
            this.authorizationKey = Objects.requireNonNull(authorizationKey);
            return this;
        }
        public Builder connectionProtocol(String connectionProtocol) {
            this.connectionProtocol = Objects.requireNonNull(connectionProtocol);
            return this;
        }
        public Builder dpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
            this.dpdTimeoutSeconds = Objects.requireNonNull(dpdTimeoutSeconds);
            return this;
        }
        public Builder egressBytesTransferred(Integer egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }
        public Builder enableBgp(Boolean enableBgp) {
            this.enableBgp = Objects.requireNonNull(enableBgp);
            return this;
        }
        public Builder expressRouteCircuitId(String expressRouteCircuitId) {
            this.expressRouteCircuitId = Objects.requireNonNull(expressRouteCircuitId);
            return this;
        }
        public Builder expressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
            this.expressRouteGatewayBypass = Objects.requireNonNull(expressRouteGatewayBypass);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ingressBytesTransferred(Integer ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }
        public Builder ipsecPolicies(List<GetGatewayConnectionIpsecPolicy> ipsecPolicies) {
            this.ipsecPolicies = Objects.requireNonNull(ipsecPolicies);
            return this;
        }
        public Builder ipsecPolicies(GetGatewayConnectionIpsecPolicy... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
        }
        public Builder localAzureIpAddressEnabled(Boolean localAzureIpAddressEnabled) {
            this.localAzureIpAddressEnabled = Objects.requireNonNull(localAzureIpAddressEnabled);
            return this;
        }
        public Builder localNetworkGatewayId(String localNetworkGatewayId) {
            this.localNetworkGatewayId = Objects.requireNonNull(localNetworkGatewayId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peerVirtualNetworkGatewayId(String peerVirtualNetworkGatewayId) {
            this.peerVirtualNetworkGatewayId = Objects.requireNonNull(peerVirtualNetworkGatewayId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder routingWeight(Integer routingWeight) {
            this.routingWeight = Objects.requireNonNull(routingWeight);
            return this;
        }
        public Builder sharedKey(String sharedKey) {
            this.sharedKey = Objects.requireNonNull(sharedKey);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder trafficSelectorPolicies(List<GetGatewayConnectionTrafficSelectorPolicy> trafficSelectorPolicies) {
            this.trafficSelectorPolicies = Objects.requireNonNull(trafficSelectorPolicies);
            return this;
        }
        public Builder trafficSelectorPolicies(GetGatewayConnectionTrafficSelectorPolicy... trafficSelectorPolicies) {
            return trafficSelectorPolicies(List.of(trafficSelectorPolicies));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder usePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = Objects.requireNonNull(usePolicyBasedTrafficSelectors);
            return this;
        }
        public Builder virtualNetworkGatewayId(String virtualNetworkGatewayId) {
            this.virtualNetworkGatewayId = Objects.requireNonNull(virtualNetworkGatewayId);
            return this;
        }        public GetGatewayConnectionResult build() {
            return new GetGatewayConnectionResult(authorizationKey, connectionProtocol, dpdTimeoutSeconds, egressBytesTransferred, enableBgp, expressRouteCircuitId, expressRouteGatewayBypass, id, ingressBytesTransferred, ipsecPolicies, localAzureIpAddressEnabled, localNetworkGatewayId, location, name, peerVirtualNetworkGatewayId, resourceGroupName, resourceGuid, routingWeight, sharedKey, tags, trafficSelectorPolicies, type, usePolicyBasedTrafficSelectors, virtualNetworkGatewayId);
        }
    }
}
