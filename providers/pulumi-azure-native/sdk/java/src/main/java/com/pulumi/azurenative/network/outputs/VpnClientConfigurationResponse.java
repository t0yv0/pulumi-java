// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.RadiusServerResponse;
import com.pulumi.azurenative.network.outputs.VpnClientRevokedCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnClientRootCertificateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnClientConfigurationResponse {
    /**
     * @return The AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    private final @Nullable String aadAudience;
    /**
     * @return The AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    private final @Nullable String aadIssuer;
    /**
     * @return The AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    private final @Nullable String aadTenant;
    /**
     * @return The radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    private final @Nullable String radiusServerAddress;
    /**
     * @return The radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    private final @Nullable String radiusServerSecret;
    /**
     * @return The radiusServers property for multiple radius server configuration.
     * 
     */
    private final @Nullable List<RadiusServerResponse> radiusServers;
    /**
     * @return VPN authentication types for the virtual network gateway..
     * 
     */
    private final @Nullable List<String> vpnAuthenticationTypes;
    /**
     * @return The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    private final @Nullable AddressSpaceResponse vpnClientAddressPool;
    /**
     * @return VpnClientIpsecPolicies for virtual network gateway P2S client.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies;
    /**
     * @return VpnClientProtocols for Virtual network gateway.
     * 
     */
    private final @Nullable List<String> vpnClientProtocols;
    /**
     * @return VpnClientRevokedCertificate for Virtual network gateway.
     * 
     */
    private final @Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates;
    /**
     * @return VpnClientRootCertificate for virtual network gateway.
     * 
     */
    private final @Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates;

    @CustomType.Constructor
    private VpnClientConfigurationResponse(
        @CustomType.Parameter("aadAudience") @Nullable String aadAudience,
        @CustomType.Parameter("aadIssuer") @Nullable String aadIssuer,
        @CustomType.Parameter("aadTenant") @Nullable String aadTenant,
        @CustomType.Parameter("radiusServerAddress") @Nullable String radiusServerAddress,
        @CustomType.Parameter("radiusServerSecret") @Nullable String radiusServerSecret,
        @CustomType.Parameter("radiusServers") @Nullable List<RadiusServerResponse> radiusServers,
        @CustomType.Parameter("vpnAuthenticationTypes") @Nullable List<String> vpnAuthenticationTypes,
        @CustomType.Parameter("vpnClientAddressPool") @Nullable AddressSpaceResponse vpnClientAddressPool,
        @CustomType.Parameter("vpnClientIpsecPolicies") @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies,
        @CustomType.Parameter("vpnClientProtocols") @Nullable List<String> vpnClientProtocols,
        @CustomType.Parameter("vpnClientRevokedCertificates") @Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates,
        @CustomType.Parameter("vpnClientRootCertificates") @Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerSecret = radiusServerSecret;
        this.radiusServers = radiusServers;
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        this.vpnClientAddressPool = vpnClientAddressPool;
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnClientProtocols = vpnClientProtocols;
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        this.vpnClientRootCertificates = vpnClientRootCertificates;
    }

    /**
     * @return The AADAudience property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    public Optional<String> aadAudience() {
        return Optional.ofNullable(this.aadAudience);
    }
    /**
     * @return The AADIssuer property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    public Optional<String> aadIssuer() {
        return Optional.ofNullable(this.aadIssuer);
    }
    /**
     * @return The AADTenant property of the VirtualNetworkGateway resource for vpn client connection used for AAD authentication.
     * 
     */
    public Optional<String> aadTenant() {
        return Optional.ofNullable(this.aadTenant);
    }
    /**
     * @return The radius server address property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    public Optional<String> radiusServerAddress() {
        return Optional.ofNullable(this.radiusServerAddress);
    }
    /**
     * @return The radius secret property of the VirtualNetworkGateway resource for vpn client connection.
     * 
     */
    public Optional<String> radiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }
    /**
     * @return The radiusServers property for multiple radius server configuration.
     * 
     */
    public List<RadiusServerResponse> radiusServers() {
        return this.radiusServers == null ? List.of() : this.radiusServers;
    }
    /**
     * @return VPN authentication types for the virtual network gateway..
     * 
     */
    public List<String> vpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? List.of() : this.vpnAuthenticationTypes;
    }
    /**
     * @return The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    public Optional<AddressSpaceResponse> vpnClientAddressPool() {
        return Optional.ofNullable(this.vpnClientAddressPool);
    }
    /**
     * @return VpnClientIpsecPolicies for virtual network gateway P2S client.
     * 
     */
    public List<IpsecPolicyResponse> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? List.of() : this.vpnClientIpsecPolicies;
    }
    /**
     * @return VpnClientProtocols for Virtual network gateway.
     * 
     */
    public List<String> vpnClientProtocols() {
        return this.vpnClientProtocols == null ? List.of() : this.vpnClientProtocols;
    }
    /**
     * @return VpnClientRevokedCertificate for Virtual network gateway.
     * 
     */
    public List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? List.of() : this.vpnClientRevokedCertificates;
    }
    /**
     * @return VpnClientRootCertificate for virtual network gateway.
     * 
     */
    public List<VpnClientRootCertificateResponse> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? List.of() : this.vpnClientRootCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aadAudience;
        private @Nullable String aadIssuer;
        private @Nullable String aadTenant;
        private @Nullable String radiusServerAddress;
        private @Nullable String radiusServerSecret;
        private @Nullable List<RadiusServerResponse> radiusServers;
        private @Nullable List<String> vpnAuthenticationTypes;
        private @Nullable AddressSpaceResponse vpnClientAddressPool;
        private @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies;
        private @Nullable List<String> vpnClientProtocols;
        private @Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates;
        private @Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAudience = defaults.aadAudience;
    	      this.aadIssuer = defaults.aadIssuer;
    	      this.aadTenant = defaults.aadTenant;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServers = defaults.radiusServers;
    	      this.vpnAuthenticationTypes = defaults.vpnAuthenticationTypes;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnClientProtocols = defaults.vpnClientProtocols;
    	      this.vpnClientRevokedCertificates = defaults.vpnClientRevokedCertificates;
    	      this.vpnClientRootCertificates = defaults.vpnClientRootCertificates;
        }

        public Builder aadAudience(@Nullable String aadAudience) {
            this.aadAudience = aadAudience;
            return this;
        }
        public Builder aadIssuer(@Nullable String aadIssuer) {
            this.aadIssuer = aadIssuer;
            return this;
        }
        public Builder aadTenant(@Nullable String aadTenant) {
            this.aadTenant = aadTenant;
            return this;
        }
        public Builder radiusServerAddress(@Nullable String radiusServerAddress) {
            this.radiusServerAddress = radiusServerAddress;
            return this;
        }
        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }
        public Builder radiusServers(@Nullable List<RadiusServerResponse> radiusServers) {
            this.radiusServers = radiusServers;
            return this;
        }
        public Builder radiusServers(RadiusServerResponse... radiusServers) {
            return radiusServers(List.of(radiusServers));
        }
        public Builder vpnAuthenticationTypes(@Nullable List<String> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = vpnAuthenticationTypes;
            return this;
        }
        public Builder vpnAuthenticationTypes(String... vpnAuthenticationTypes) {
            return vpnAuthenticationTypes(List.of(vpnAuthenticationTypes));
        }
        public Builder vpnClientAddressPool(@Nullable AddressSpaceResponse vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }
        public Builder vpnClientIpsecPolicies(@Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }
        public Builder vpnClientIpsecPolicies(IpsecPolicyResponse... vpnClientIpsecPolicies) {
            return vpnClientIpsecPolicies(List.of(vpnClientIpsecPolicies));
        }
        public Builder vpnClientProtocols(@Nullable List<String> vpnClientProtocols) {
            this.vpnClientProtocols = vpnClientProtocols;
            return this;
        }
        public Builder vpnClientProtocols(String... vpnClientProtocols) {
            return vpnClientProtocols(List.of(vpnClientProtocols));
        }
        public Builder vpnClientRevokedCertificates(@Nullable List<VpnClientRevokedCertificateResponse> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }
        public Builder vpnClientRevokedCertificates(VpnClientRevokedCertificateResponse... vpnClientRevokedCertificates) {
            return vpnClientRevokedCertificates(List.of(vpnClientRevokedCertificates));
        }
        public Builder vpnClientRootCertificates(@Nullable List<VpnClientRootCertificateResponse> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }
        public Builder vpnClientRootCertificates(VpnClientRootCertificateResponse... vpnClientRootCertificates) {
            return vpnClientRootCertificates(List.of(vpnClientRootCertificates));
        }        public VpnClientConfigurationResponse build() {
            return new VpnClientConfigurationResponse(aadAudience, aadIssuer, aadTenant, radiusServerAddress, radiusServerSecret, radiusServers, vpnAuthenticationTypes, vpnClientAddressPool, vpnClientIpsecPolicies, vpnClientProtocols, vpnClientRevokedCertificates, vpnClientRootCertificates);
        }
    }
}
