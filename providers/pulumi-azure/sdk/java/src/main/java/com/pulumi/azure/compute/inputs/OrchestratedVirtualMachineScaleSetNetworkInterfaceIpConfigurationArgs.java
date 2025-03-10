// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs Empty = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs();

    @Import(name="applicationGatewayBackendAddressPoolIds")
    private @Nullable Output<List<String>> applicationGatewayBackendAddressPoolIds;

    public Optional<Output<List<String>>> applicationGatewayBackendAddressPoolIds() {
        return Optional.ofNullable(this.applicationGatewayBackendAddressPoolIds);
    }

    @Import(name="applicationSecurityGroupIds")
    private @Nullable Output<List<String>> applicationSecurityGroupIds;

    public Optional<Output<List<String>>> applicationSecurityGroupIds() {
        return Optional.ofNullable(this.applicationSecurityGroupIds);
    }

    @Import(name="loadBalancerBackendAddressPoolIds")
    private @Nullable Output<List<String>> loadBalancerBackendAddressPoolIds;

    public Optional<Output<List<String>>> loadBalancerBackendAddressPoolIds() {
        return Optional.ofNullable(this.loadBalancerBackendAddressPoolIds);
    }

    /**
     * The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="primary")
    private @Nullable Output<Boolean> primary;

    public Optional<Output<Boolean>> primary() {
        return Optional.ofNullable(this.primary);
    }

    @Import(name="publicIpAddresses")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs>> publicIpAddresses;

    public Optional<Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs>>> publicIpAddresses() {
        return Optional.ofNullable(this.publicIpAddresses);
    }

    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs() {}

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs $) {
        this.applicationGatewayBackendAddressPoolIds = $.applicationGatewayBackendAddressPoolIds;
        this.applicationSecurityGroupIds = $.applicationSecurityGroupIds;
        this.loadBalancerBackendAddressPoolIds = $.loadBalancerBackendAddressPoolIds;
        this.name = $.name;
        this.primary = $.primary;
        this.publicIpAddresses = $.publicIpAddresses;
        this.subnetId = $.subnetId;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationGatewayBackendAddressPoolIds(@Nullable Output<List<String>> applicationGatewayBackendAddressPoolIds) {
            $.applicationGatewayBackendAddressPoolIds = applicationGatewayBackendAddressPoolIds;
            return this;
        }

        public Builder applicationGatewayBackendAddressPoolIds(List<String> applicationGatewayBackendAddressPoolIds) {
            return applicationGatewayBackendAddressPoolIds(Output.of(applicationGatewayBackendAddressPoolIds));
        }

        public Builder applicationGatewayBackendAddressPoolIds(String... applicationGatewayBackendAddressPoolIds) {
            return applicationGatewayBackendAddressPoolIds(List.of(applicationGatewayBackendAddressPoolIds));
        }

        public Builder applicationSecurityGroupIds(@Nullable Output<List<String>> applicationSecurityGroupIds) {
            $.applicationSecurityGroupIds = applicationSecurityGroupIds;
            return this;
        }

        public Builder applicationSecurityGroupIds(List<String> applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(Output.of(applicationSecurityGroupIds));
        }

        public Builder applicationSecurityGroupIds(String... applicationSecurityGroupIds) {
            return applicationSecurityGroupIds(List.of(applicationSecurityGroupIds));
        }

        public Builder loadBalancerBackendAddressPoolIds(@Nullable Output<List<String>> loadBalancerBackendAddressPoolIds) {
            $.loadBalancerBackendAddressPoolIds = loadBalancerBackendAddressPoolIds;
            return this;
        }

        public Builder loadBalancerBackendAddressPoolIds(List<String> loadBalancerBackendAddressPoolIds) {
            return loadBalancerBackendAddressPoolIds(Output.of(loadBalancerBackendAddressPoolIds));
        }

        public Builder loadBalancerBackendAddressPoolIds(String... loadBalancerBackendAddressPoolIds) {
            return loadBalancerBackendAddressPoolIds(List.of(loadBalancerBackendAddressPoolIds));
        }

        /**
         * @param name The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder primary(@Nullable Output<Boolean> primary) {
            $.primary = primary;
            return this;
        }

        public Builder primary(Boolean primary) {
            return primary(Output.of(primary));
        }

        public Builder publicIpAddresses(@Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs>> publicIpAddresses) {
            $.publicIpAddresses = publicIpAddresses;
            return this;
        }

        public Builder publicIpAddresses(List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs> publicIpAddresses) {
            return publicIpAddresses(Output.of(publicIpAddresses));
        }

        public Builder publicIpAddresses(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs... publicIpAddresses) {
            return publicIpAddresses(List.of(publicIpAddresses));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
