// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs Empty = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs();

    @Import(name="domainNameLabel")
    private @Nullable Output<String> domainNameLabel;

    public Optional<Output<String>> domainNameLabel() {
        return Optional.ofNullable(this.domainNameLabel);
    }

    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    @Import(name="ipTags")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs>> ipTags;

    public Optional<Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs>>> ipTags() {
        return Optional.ofNullable(this.ipTags);
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

    @Import(name="publicIpPrefixId")
    private @Nullable Output<String> publicIpPrefixId;

    public Optional<Output<String>> publicIpPrefixId() {
        return Optional.ofNullable(this.publicIpPrefixId);
    }

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs() {}

    private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs $) {
        this.domainNameLabel = $.domainNameLabel;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.ipTags = $.ipTags;
        this.name = $.name;
        this.publicIpPrefixId = $.publicIpPrefixId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainNameLabel(@Nullable Output<String> domainNameLabel) {
            $.domainNameLabel = domainNameLabel;
            return this;
        }

        public Builder domainNameLabel(String domainNameLabel) {
            return domainNameLabel(Output.of(domainNameLabel));
        }

        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        public Builder ipTags(@Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs>> ipTags) {
            $.ipTags = ipTags;
            return this;
        }

        public Builder ipTags(List<OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs> ipTags) {
            return ipTags(Output.of(ipTags));
        }

        public Builder ipTags(OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressIpTagArgs... ipTags) {
            return ipTags(List.of(ipTags));
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

        public Builder publicIpPrefixId(@Nullable Output<String> publicIpPrefixId) {
            $.publicIpPrefixId = publicIpPrefixId;
            return this;
        }

        public Builder publicIpPrefixId(String publicIpPrefixId) {
            return publicIpPrefixId(Output.of(publicIpPrefixId));
        }

        public OrchestratedVirtualMachineScaleSetNetworkInterfaceIpConfigurationPublicIpAddressArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
