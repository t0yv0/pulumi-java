// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AddressSpaceResponse;
import com.pulumi.azurenative.network.outputs.RoutingConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class P2SConnectionConfigurationResponse {
    /**
     * @return Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    private final @Nullable Boolean enableInternetSecurity;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The provisioning state of the P2SConnectionConfiguration resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    private final @Nullable RoutingConfigurationResponse routingConfiguration;
    /**
     * @return The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    private final @Nullable AddressSpaceResponse vpnClientAddressPool;

    @CustomType.Constructor
    private P2SConnectionConfigurationResponse(
        @CustomType.Parameter("enableInternetSecurity") @Nullable Boolean enableInternetSecurity,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routingConfiguration") @Nullable RoutingConfigurationResponse routingConfiguration,
        @CustomType.Parameter("vpnClientAddressPool") @Nullable AddressSpaceResponse vpnClientAddressPool) {
        this.enableInternetSecurity = enableInternetSecurity;
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.routingConfiguration = routingConfiguration;
        this.vpnClientAddressPool = vpnClientAddressPool;
    }

    /**
     * @return Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     * 
     */
    public Optional<Boolean> enableInternetSecurity() {
        return Optional.ofNullable(this.enableInternetSecurity);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The provisioning state of the P2SConnectionConfiguration resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The Routing Configuration indicating the associated and propagated route tables on this connection.
     * 
     */
    public Optional<RoutingConfigurationResponse> routingConfiguration() {
        return Optional.ofNullable(this.routingConfiguration);
    }
    /**
     * @return The reference to the address space resource which represents Address space for P2S VpnClient.
     * 
     */
    public Optional<AddressSpaceResponse> vpnClientAddressPool() {
        return Optional.ofNullable(this.vpnClientAddressPool);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(P2SConnectionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableInternetSecurity;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable RoutingConfigurationResponse routingConfiguration;
        private @Nullable AddressSpaceResponse vpnClientAddressPool;

        public Builder() {
    	      // Empty
        }

        public Builder(P2SConnectionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInternetSecurity = defaults.enableInternetSecurity;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingConfiguration = defaults.routingConfiguration;
    	      this.vpnClientAddressPool = defaults.vpnClientAddressPool;
        }

        public Builder enableInternetSecurity(@Nullable Boolean enableInternetSecurity) {
            this.enableInternetSecurity = enableInternetSecurity;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder routingConfiguration(@Nullable RoutingConfigurationResponse routingConfiguration) {
            this.routingConfiguration = routingConfiguration;
            return this;
        }
        public Builder vpnClientAddressPool(@Nullable AddressSpaceResponse vpnClientAddressPool) {
            this.vpnClientAddressPool = vpnClientAddressPool;
            return this;
        }        public P2SConnectionConfigurationResponse build() {
            return new P2SConnectionConfigurationResponse(enableInternetSecurity, etag, id, name, provisioningState, routingConfiguration, vpnClientAddressPool);
        }
    }
}
