// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceDnsSettingsResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import com.pulumi.azurenative.network.outputs.NetworkInterfaceTapConfigurationResponse;
import com.pulumi.azurenative.network.outputs.NetworkSecurityGroupResponse;
import com.pulumi.azurenative.network.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.network.outputs.PrivateLinkServiceResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInterfaceResponse {
    /**
     * @return The DNS settings in network interface.
     * 
     */
    private final @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings;
    /**
     * @return A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    private final SubResourceResponse dscpConfiguration;
    /**
     * @return If the network interface is accelerated networking enabled.
     * 
     */
    private final @Nullable Boolean enableAcceleratedNetworking;
    /**
     * @return Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    private final @Nullable Boolean enableIPForwarding;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return The extended location of the network interface.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * @return A list of references to linked BareMetal resources.
     * 
     */
    private final List<String> hostedWorkloads;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return A list of IPConfigurations of the network interface.
     * 
     */
    private final @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The MAC address of the network interface.
     * 
     */
    private final String macAddress;
    /**
     * @return Migration phase of Network Interface resource.
     * 
     */
    private final @Nullable String migrationPhase;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return The reference to the NetworkSecurityGroup resource.
     * 
     */
    private final @Nullable NetworkSecurityGroupResponse networkSecurityGroup;
    /**
     * @return Type of Network Interface resource.
     * 
     */
    private final @Nullable String nicType;
    /**
     * @return Whether this is a primary network interface on a virtual machine.
     * 
     */
    private final Boolean primary;
    /**
     * @return A reference to the private endpoint to which the network interface is linked.
     * 
     */
    private final PrivateEndpointResponse privateEndpoint;
    /**
     * @return Privatelinkservice of the network interface resource.
     * 
     */
    private final @Nullable PrivateLinkServiceResponse privateLinkService;
    /**
     * @return The provisioning state of the network interface resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return The resource GUID property of the network interface resource.
     * 
     */
    private final String resourceGuid;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return A list of TapConfigurations of the network interface.
     * 
     */
    private final List<NetworkInterfaceTapConfigurationResponse> tapConfigurations;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return The reference to a virtual machine.
     * 
     */
    private final SubResourceResponse virtualMachine;

    @CustomType.Constructor
    private NetworkInterfaceResponse(
        @CustomType.Parameter("dnsSettings") @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings,
        @CustomType.Parameter("dscpConfiguration") SubResourceResponse dscpConfiguration,
        @CustomType.Parameter("enableAcceleratedNetworking") @Nullable Boolean enableAcceleratedNetworking,
        @CustomType.Parameter("enableIPForwarding") @Nullable Boolean enableIPForwarding,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("hostedWorkloads") List<String> hostedWorkloads,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipConfigurations") @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("macAddress") String macAddress,
        @CustomType.Parameter("migrationPhase") @Nullable String migrationPhase,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkSecurityGroup") @Nullable NetworkSecurityGroupResponse networkSecurityGroup,
        @CustomType.Parameter("nicType") @Nullable String nicType,
        @CustomType.Parameter("primary") Boolean primary,
        @CustomType.Parameter("privateEndpoint") PrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkService") @Nullable PrivateLinkServiceResponse privateLinkService,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceGuid") String resourceGuid,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tapConfigurations") List<NetworkInterfaceTapConfigurationResponse> tapConfigurations,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualMachine") SubResourceResponse virtualMachine) {
        this.dnsSettings = dnsSettings;
        this.dscpConfiguration = dscpConfiguration;
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.enableIPForwarding = enableIPForwarding;
        this.etag = etag;
        this.extendedLocation = extendedLocation;
        this.hostedWorkloads = hostedWorkloads;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.macAddress = macAddress;
        this.migrationPhase = migrationPhase;
        this.name = name;
        this.networkSecurityGroup = networkSecurityGroup;
        this.nicType = nicType;
        this.primary = primary;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkService = privateLinkService;
        this.provisioningState = provisioningState;
        this.resourceGuid = resourceGuid;
        this.tags = tags;
        this.tapConfigurations = tapConfigurations;
        this.type = type;
        this.virtualMachine = virtualMachine;
    }

    /**
     * @return The DNS settings in network interface.
     * 
     */
    public Optional<NetworkInterfaceDnsSettingsResponse> dnsSettings() {
        return Optional.ofNullable(this.dnsSettings);
    }
    /**
     * @return A reference to the dscp configuration to which the network interface is linked.
     * 
     */
    public SubResourceResponse dscpConfiguration() {
        return this.dscpConfiguration;
    }
    /**
     * @return If the network interface is accelerated networking enabled.
     * 
     */
    public Optional<Boolean> enableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }
    /**
     * @return Indicates whether IP forwarding is enabled on this network interface.
     * 
     */
    public Optional<Boolean> enableIPForwarding() {
        return Optional.ofNullable(this.enableIPForwarding);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The extended location of the network interface.
     * 
     */
    public Optional<ExtendedLocationResponse> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * @return A list of references to linked BareMetal resources.
     * 
     */
    public List<String> hostedWorkloads() {
        return this.hostedWorkloads;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return A list of IPConfigurations of the network interface.
     * 
     */
    public List<NetworkInterfaceIPConfigurationResponse> ipConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The MAC address of the network interface.
     * 
     */
    public String macAddress() {
        return this.macAddress;
    }
    /**
     * @return Migration phase of Network Interface resource.
     * 
     */
    public Optional<String> migrationPhase() {
        return Optional.ofNullable(this.migrationPhase);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The reference to the NetworkSecurityGroup resource.
     * 
     */
    public Optional<NetworkSecurityGroupResponse> networkSecurityGroup() {
        return Optional.ofNullable(this.networkSecurityGroup);
    }
    /**
     * @return Type of Network Interface resource.
     * 
     */
    public Optional<String> nicType() {
        return Optional.ofNullable(this.nicType);
    }
    /**
     * @return Whether this is a primary network interface on a virtual machine.
     * 
     */
    public Boolean primary() {
        return this.primary;
    }
    /**
     * @return A reference to the private endpoint to which the network interface is linked.
     * 
     */
    public PrivateEndpointResponse privateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * @return Privatelinkservice of the network interface resource.
     * 
     */
    public Optional<PrivateLinkServiceResponse> privateLinkService() {
        return Optional.ofNullable(this.privateLinkService);
    }
    /**
     * @return The provisioning state of the network interface resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The resource GUID property of the network interface resource.
     * 
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return A list of TapConfigurations of the network interface.
     * 
     */
    public List<NetworkInterfaceTapConfigurationResponse> tapConfigurations() {
        return this.tapConfigurations;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The reference to a virtual machine.
     * 
     */
    public SubResourceResponse virtualMachine() {
        return this.virtualMachine;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInterfaceDnsSettingsResponse dnsSettings;
        private SubResourceResponse dscpConfiguration;
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable Boolean enableIPForwarding;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private List<String> hostedWorkloads;
        private @Nullable String id;
        private @Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations;
        private @Nullable String location;
        private String macAddress;
        private @Nullable String migrationPhase;
        private String name;
        private @Nullable NetworkSecurityGroupResponse networkSecurityGroup;
        private @Nullable String nicType;
        private Boolean primary;
        private PrivateEndpointResponse privateEndpoint;
        private @Nullable PrivateLinkServiceResponse privateLinkService;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private List<NetworkInterfaceTapConfigurationResponse> tapConfigurations;
        private String type;
        private SubResourceResponse virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.dscpConfiguration = defaults.dscpConfiguration;
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.enableIPForwarding = defaults.enableIPForwarding;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hostedWorkloads = defaults.hostedWorkloads;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.macAddress = defaults.macAddress;
    	      this.migrationPhase = defaults.migrationPhase;
    	      this.name = defaults.name;
    	      this.networkSecurityGroup = defaults.networkSecurityGroup;
    	      this.nicType = defaults.nicType;
    	      this.primary = defaults.primary;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkService = defaults.privateLinkService;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.tapConfigurations = defaults.tapConfigurations;
    	      this.type = defaults.type;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder dnsSettings(@Nullable NetworkInterfaceDnsSettingsResponse dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }
        public Builder dscpConfiguration(SubResourceResponse dscpConfiguration) {
            this.dscpConfiguration = Objects.requireNonNull(dscpConfiguration);
            return this;
        }
        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }
        public Builder enableIPForwarding(@Nullable Boolean enableIPForwarding) {
            this.enableIPForwarding = enableIPForwarding;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder hostedWorkloads(List<String> hostedWorkloads) {
            this.hostedWorkloads = Objects.requireNonNull(hostedWorkloads);
            return this;
        }
        public Builder hostedWorkloads(String... hostedWorkloads) {
            return hostedWorkloads(List.of(hostedWorkloads));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<NetworkInterfaceIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(NetworkInterfaceIPConfigurationResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }
        public Builder migrationPhase(@Nullable String migrationPhase) {
            this.migrationPhase = migrationPhase;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkSecurityGroup(@Nullable NetworkSecurityGroupResponse networkSecurityGroup) {
            this.networkSecurityGroup = networkSecurityGroup;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder primary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        public Builder privateEndpoint(PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }
        public Builder privateLinkService(@Nullable PrivateLinkServiceResponse privateLinkService) {
            this.privateLinkService = privateLinkService;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tapConfigurations(List<NetworkInterfaceTapConfigurationResponse> tapConfigurations) {
            this.tapConfigurations = Objects.requireNonNull(tapConfigurations);
            return this;
        }
        public Builder tapConfigurations(NetworkInterfaceTapConfigurationResponse... tapConfigurations) {
            return tapConfigurations(List.of(tapConfigurations));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualMachine(SubResourceResponse virtualMachine) {
            this.virtualMachine = Objects.requireNonNull(virtualMachine);
            return this;
        }        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(dnsSettings, dscpConfiguration, enableAcceleratedNetworking, enableIPForwarding, etag, extendedLocation, hostedWorkloads, id, ipConfigurations, location, macAddress, migrationPhase, name, networkSecurityGroup, nicType, primary, privateEndpoint, privateLinkService, provisioningState, resourceGuid, tags, tapConfigurations, type, virtualMachine);
        }
    }
}
