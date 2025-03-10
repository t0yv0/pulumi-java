// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.NicIpConfigurationResourceSettingsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInterfaceResourceSettingsResponse {
    /**
     * @return Gets or sets a value indicating whether accelerated networking is enabled.
     * 
     */
    private final @Nullable Boolean enableAcceleratedNetworking;
    /**
     * @return Gets or sets the IP configurations of the NIC.
     * 
     */
    private final @Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations;
    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/networkInterfaces&#39;.
     * 
     */
    private final String resourceType;
    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;

    @CustomType.Constructor
    private NetworkInterfaceResourceSettingsResponse(
        @CustomType.Parameter("enableAcceleratedNetworking") @Nullable Boolean enableAcceleratedNetworking,
        @CustomType.Parameter("ipConfigurations") @Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("targetResourceName") String targetResourceName) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        this.ipConfigurations = ipConfigurations;
        this.resourceType = resourceType;
        this.targetResourceName = targetResourceName;
    }

    /**
     * @return Gets or sets a value indicating whether accelerated networking is enabled.
     * 
     */
    public Optional<Boolean> enableAcceleratedNetworking() {
        return Optional.ofNullable(this.enableAcceleratedNetworking);
    }
    /**
     * @return Gets or sets the IP configurations of the NIC.
     * 
     */
    public List<NicIpConfigurationResourceSettingsResponse> ipConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }
    /**
     * @return The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/networkInterfaces&#39;.
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return Gets or sets the target Resource name.
     * 
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableAcceleratedNetworking;
        private @Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations;
        private String resourceType;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAcceleratedNetworking = defaults.enableAcceleratedNetworking;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder enableAcceleratedNetworking(@Nullable Boolean enableAcceleratedNetworking) {
            this.enableAcceleratedNetworking = enableAcceleratedNetworking;
            return this;
        }
        public Builder ipConfigurations(@Nullable List<NicIpConfigurationResourceSettingsResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }
        public Builder ipConfigurations(NicIpConfigurationResourceSettingsResponse... ipConfigurations) {
            return ipConfigurations(List.of(ipConfigurations));
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }        public NetworkInterfaceResourceSettingsResponse build() {
            return new NetworkInterfaceResourceSettingsResponse(enableAcceleratedNetworking, ipConfigurations, resourceType, targetResourceName);
        }
    }
}
