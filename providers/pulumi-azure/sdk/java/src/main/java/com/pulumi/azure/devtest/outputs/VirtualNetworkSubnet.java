// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkSubnet {
    /**
     * @return Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Can this subnet be used for creating Virtual Machines? Possible values are `Allow`, `Default` and `Deny`.
     * 
     */
    private final @Nullable String useInVirtualMachineCreation;
    /**
     * @return Can Virtual Machines in this Subnet use Public IP Addresses? Possible values are `Allow`, `Default` and `Deny`.
     * 
     */
    private final @Nullable String usePublicIpAddress;

    @CustomType.Constructor
    private VirtualNetworkSubnet(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("useInVirtualMachineCreation") @Nullable String useInVirtualMachineCreation,
        @CustomType.Parameter("usePublicIpAddress") @Nullable String usePublicIpAddress) {
        this.name = name;
        this.useInVirtualMachineCreation = useInVirtualMachineCreation;
        this.usePublicIpAddress = usePublicIpAddress;
    }

    /**
     * @return Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Can this subnet be used for creating Virtual Machines? Possible values are `Allow`, `Default` and `Deny`.
     * 
     */
    public Optional<String> useInVirtualMachineCreation() {
        return Optional.ofNullable(this.useInVirtualMachineCreation);
    }
    /**
     * @return Can Virtual Machines in this Subnet use Public IP Addresses? Possible values are `Allow`, `Default` and `Deny`.
     * 
     */
    public Optional<String> usePublicIpAddress() {
        return Optional.ofNullable(this.usePublicIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkSubnet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String useInVirtualMachineCreation;
        private @Nullable String usePublicIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkSubnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.useInVirtualMachineCreation = defaults.useInVirtualMachineCreation;
    	      this.usePublicIpAddress = defaults.usePublicIpAddress;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder useInVirtualMachineCreation(@Nullable String useInVirtualMachineCreation) {
            this.useInVirtualMachineCreation = useInVirtualMachineCreation;
            return this;
        }
        public Builder usePublicIpAddress(@Nullable String usePublicIpAddress) {
            this.usePublicIpAddress = usePublicIpAddress;
            return this;
        }        public VirtualNetworkSubnet build() {
            return new VirtualNetworkSubnet(name, useInVirtualMachineCreation, usePublicIpAddress);
        }
    }
}
