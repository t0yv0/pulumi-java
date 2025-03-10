// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric;

import com.pulumi.azurenative.servicefabric.inputs.EndpointRangeDescriptionArgs;
import com.pulumi.azurenative.servicefabric.inputs.VMSSExtensionArgs;
import com.pulumi.azurenative.servicefabric.inputs.VaultSecretGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeTypeArgs Empty = new NodeTypeArgs();

    /**
     * The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    @Import(name="applicationPorts")
    private @Nullable Output<EndpointRangeDescriptionArgs> applicationPorts;

    /**
     * @return The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    public Optional<Output<EndpointRangeDescriptionArgs>> applicationPorts() {
        return Optional.ofNullable(this.applicationPorts);
    }

    /**
     * The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    @Import(name="capacities")
    private @Nullable Output<Map<String,String>> capacities;

    /**
     * @return The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    public Optional<Output<Map<String,String>>> capacities() {
        return Optional.ofNullable(this.capacities);
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster resource.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Disk size for each vm in the node type in GBs.
     * 
     */
    @Import(name="dataDiskSizeGB", required=true)
    private Output<Integer> dataDiskSizeGB;

    /**
     * @return Disk size for each vm in the node type in GBs.
     * 
     */
    public Output<Integer> dataDiskSizeGB() {
        return this.dataDiskSizeGB;
    }

    /**
     * The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    @Import(name="ephemeralPorts")
    private @Nullable Output<EndpointRangeDescriptionArgs> ephemeralPorts;

    /**
     * @return The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    public Optional<Output<EndpointRangeDescriptionArgs>> ephemeralPorts() {
        return Optional.ofNullable(this.ephemeralPorts);
    }

    /**
     * The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    @Import(name="isPrimary", required=true)
    private Output<Boolean> isPrimary;

    /**
     * @return The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    public Output<Boolean> isPrimary() {
        return this.isPrimary;
    }

    /**
     * The name of the node type.
     * 
     */
    @Import(name="nodeTypeName")
    private @Nullable Output<String> nodeTypeName;

    /**
     * @return The name of the node type.
     * 
     */
    public Optional<Output<String>> nodeTypeName() {
        return Optional.ofNullable(this.nodeTypeName);
    }

    /**
     * The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    @Import(name="placementProperties")
    private @Nullable Output<Map<String,String>> placementProperties;

    /**
     * @return The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    public Optional<Output<Map<String,String>>> placementProperties() {
        return Optional.ofNullable(this.placementProperties);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Set of extensions that should be installed onto the virtual machines.
     * 
     */
    @Import(name="vmExtensions")
    private @Nullable Output<List<VMSSExtensionArgs>> vmExtensions;

    /**
     * @return Set of extensions that should be installed onto the virtual machines.
     * 
     */
    public Optional<Output<List<VMSSExtensionArgs>>> vmExtensions() {
        return Optional.ofNullable(this.vmExtensions);
    }

    /**
     * The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
     * 
     */
    @Import(name="vmImageOffer")
    private @Nullable Output<String> vmImageOffer;

    /**
     * @return The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
     * 
     */
    public Optional<Output<String>> vmImageOffer() {
        return Optional.ofNullable(this.vmImageOffer);
    }

    /**
     * The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    @Import(name="vmImagePublisher")
    private @Nullable Output<String> vmImagePublisher;

    /**
     * @return The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    public Optional<Output<String>> vmImagePublisher() {
        return Optional.ofNullable(this.vmImagePublisher);
    }

    /**
     * The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
     * 
     */
    @Import(name="vmImageSku")
    private @Nullable Output<String> vmImageSku;

    /**
     * @return The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
     * 
     */
    public Optional<Output<String>> vmImageSku() {
        return Optional.ofNullable(this.vmImageSku);
    }

    /**
     * The version of the Azure Virtual Machines Marketplace image. A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
     * 
     */
    @Import(name="vmImageVersion")
    private @Nullable Output<String> vmImageVersion;

    /**
     * @return The version of the Azure Virtual Machines Marketplace image. A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
     * 
     */
    public Optional<Output<String>> vmImageVersion() {
        return Optional.ofNullable(this.vmImageVersion);
    }

    /**
     * The number of nodes in the node type.
     * 
     */
    @Import(name="vmInstanceCount", required=true)
    private Output<Integer> vmInstanceCount;

    /**
     * @return The number of nodes in the node type.
     * 
     */
    public Output<Integer> vmInstanceCount() {
        return this.vmInstanceCount;
    }

    /**
     * The secrets to install in the virtual machines.
     * 
     */
    @Import(name="vmSecrets")
    private @Nullable Output<List<VaultSecretGroupArgs>> vmSecrets;

    /**
     * @return The secrets to install in the virtual machines.
     * 
     */
    public Optional<Output<List<VaultSecretGroupArgs>>> vmSecrets() {
        return Optional.ofNullable(this.vmSecrets);
    }

    /**
     * The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
     * 
     */
    @Import(name="vmSize")
    private @Nullable Output<String> vmSize;

    /**
     * @return The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
     * 
     */
    public Optional<Output<String>> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    private NodeTypeArgs() {}

    private NodeTypeArgs(NodeTypeArgs $) {
        this.applicationPorts = $.applicationPorts;
        this.capacities = $.capacities;
        this.clusterName = $.clusterName;
        this.dataDiskSizeGB = $.dataDiskSizeGB;
        this.ephemeralPorts = $.ephemeralPorts;
        this.isPrimary = $.isPrimary;
        this.nodeTypeName = $.nodeTypeName;
        this.placementProperties = $.placementProperties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.vmExtensions = $.vmExtensions;
        this.vmImageOffer = $.vmImageOffer;
        this.vmImagePublisher = $.vmImagePublisher;
        this.vmImageSku = $.vmImageSku;
        this.vmImageVersion = $.vmImageVersion;
        this.vmInstanceCount = $.vmInstanceCount;
        this.vmSecrets = $.vmSecrets;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeTypeArgs $;

        public Builder() {
            $ = new NodeTypeArgs();
        }

        public Builder(NodeTypeArgs defaults) {
            $ = new NodeTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationPorts The range of ports from which cluster assigned port to Service Fabric applications.
         * 
         * @return builder
         * 
         */
        public Builder applicationPorts(@Nullable Output<EndpointRangeDescriptionArgs> applicationPorts) {
            $.applicationPorts = applicationPorts;
            return this;
        }

        /**
         * @param applicationPorts The range of ports from which cluster assigned port to Service Fabric applications.
         * 
         * @return builder
         * 
         */
        public Builder applicationPorts(EndpointRangeDescriptionArgs applicationPorts) {
            return applicationPorts(Output.of(applicationPorts));
        }

        /**
         * @param capacities The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
         * 
         * @return builder
         * 
         */
        public Builder capacities(@Nullable Output<Map<String,String>> capacities) {
            $.capacities = capacities;
            return this;
        }

        /**
         * @param capacities The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
         * 
         * @return builder
         * 
         */
        public Builder capacities(Map<String,String> capacities) {
            return capacities(Output.of(capacities));
        }

        /**
         * @param clusterName The name of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param dataDiskSizeGB Disk size for each vm in the node type in GBs.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskSizeGB(Output<Integer> dataDiskSizeGB) {
            $.dataDiskSizeGB = dataDiskSizeGB;
            return this;
        }

        /**
         * @param dataDiskSizeGB Disk size for each vm in the node type in GBs.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskSizeGB(Integer dataDiskSizeGB) {
            return dataDiskSizeGB(Output.of(dataDiskSizeGB));
        }

        /**
         * @param ephemeralPorts The range of ephemeral ports that nodes in this node type should be configured with.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralPorts(@Nullable Output<EndpointRangeDescriptionArgs> ephemeralPorts) {
            $.ephemeralPorts = ephemeralPorts;
            return this;
        }

        /**
         * @param ephemeralPorts The range of ephemeral ports that nodes in this node type should be configured with.
         * 
         * @return builder
         * 
         */
        public Builder ephemeralPorts(EndpointRangeDescriptionArgs ephemeralPorts) {
            return ephemeralPorts(Output.of(ephemeralPorts));
        }

        /**
         * @param isPrimary The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
         * 
         * @return builder
         * 
         */
        public Builder isPrimary(Output<Boolean> isPrimary) {
            $.isPrimary = isPrimary;
            return this;
        }

        /**
         * @param isPrimary The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
         * 
         * @return builder
         * 
         */
        public Builder isPrimary(Boolean isPrimary) {
            return isPrimary(Output.of(isPrimary));
        }

        /**
         * @param nodeTypeName The name of the node type.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeName(@Nullable Output<String> nodeTypeName) {
            $.nodeTypeName = nodeTypeName;
            return this;
        }

        /**
         * @param nodeTypeName The name of the node type.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeName(String nodeTypeName) {
            return nodeTypeName(Output.of(nodeTypeName));
        }

        /**
         * @param placementProperties The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
         * 
         * @return builder
         * 
         */
        public Builder placementProperties(@Nullable Output<Map<String,String>> placementProperties) {
            $.placementProperties = placementProperties;
            return this;
        }

        /**
         * @param placementProperties The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
         * 
         * @return builder
         * 
         */
        public Builder placementProperties(Map<String,String> placementProperties) {
            return placementProperties(Output.of(placementProperties));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags Azure resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Azure resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vmExtensions Set of extensions that should be installed onto the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensions(@Nullable Output<List<VMSSExtensionArgs>> vmExtensions) {
            $.vmExtensions = vmExtensions;
            return this;
        }

        /**
         * @param vmExtensions Set of extensions that should be installed onto the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensions(List<VMSSExtensionArgs> vmExtensions) {
            return vmExtensions(Output.of(vmExtensions));
        }

        /**
         * @param vmExtensions Set of extensions that should be installed onto the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmExtensions(VMSSExtensionArgs... vmExtensions) {
            return vmExtensions(List.of(vmExtensions));
        }

        /**
         * @param vmImageOffer The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
         * 
         * @return builder
         * 
         */
        public Builder vmImageOffer(@Nullable Output<String> vmImageOffer) {
            $.vmImageOffer = vmImageOffer;
            return this;
        }

        /**
         * @param vmImageOffer The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
         * 
         * @return builder
         * 
         */
        public Builder vmImageOffer(String vmImageOffer) {
            return vmImageOffer(Output.of(vmImageOffer));
        }

        /**
         * @param vmImagePublisher The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
         * 
         * @return builder
         * 
         */
        public Builder vmImagePublisher(@Nullable Output<String> vmImagePublisher) {
            $.vmImagePublisher = vmImagePublisher;
            return this;
        }

        /**
         * @param vmImagePublisher The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
         * 
         * @return builder
         * 
         */
        public Builder vmImagePublisher(String vmImagePublisher) {
            return vmImagePublisher(Output.of(vmImagePublisher));
        }

        /**
         * @param vmImageSku The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
         * 
         * @return builder
         * 
         */
        public Builder vmImageSku(@Nullable Output<String> vmImageSku) {
            $.vmImageSku = vmImageSku;
            return this;
        }

        /**
         * @param vmImageSku The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
         * 
         * @return builder
         * 
         */
        public Builder vmImageSku(String vmImageSku) {
            return vmImageSku(Output.of(vmImageSku));
        }

        /**
         * @param vmImageVersion The version of the Azure Virtual Machines Marketplace image. A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder vmImageVersion(@Nullable Output<String> vmImageVersion) {
            $.vmImageVersion = vmImageVersion;
            return this;
        }

        /**
         * @param vmImageVersion The version of the Azure Virtual Machines Marketplace image. A value of &#39;latest&#39; can be specified to select the latest version of an image. If omitted, the default is &#39;latest&#39;.
         * 
         * @return builder
         * 
         */
        public Builder vmImageVersion(String vmImageVersion) {
            return vmImageVersion(Output.of(vmImageVersion));
        }

        /**
         * @param vmInstanceCount The number of nodes in the node type.
         * 
         * @return builder
         * 
         */
        public Builder vmInstanceCount(Output<Integer> vmInstanceCount) {
            $.vmInstanceCount = vmInstanceCount;
            return this;
        }

        /**
         * @param vmInstanceCount The number of nodes in the node type.
         * 
         * @return builder
         * 
         */
        public Builder vmInstanceCount(Integer vmInstanceCount) {
            return vmInstanceCount(Output.of(vmInstanceCount));
        }

        /**
         * @param vmSecrets The secrets to install in the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmSecrets(@Nullable Output<List<VaultSecretGroupArgs>> vmSecrets) {
            $.vmSecrets = vmSecrets;
            return this;
        }

        /**
         * @param vmSecrets The secrets to install in the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmSecrets(List<VaultSecretGroupArgs> vmSecrets) {
            return vmSecrets(Output.of(vmSecrets));
        }

        /**
         * @param vmSecrets The secrets to install in the virtual machines.
         * 
         * @return builder
         * 
         */
        public Builder vmSecrets(VaultSecretGroupArgs... vmSecrets) {
            return vmSecrets(List.of(vmSecrets));
        }

        /**
         * @param vmSize The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(@Nullable Output<String> vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        /**
         * @param vmSize The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
         * 
         * @return builder
         * 
         */
        public Builder vmSize(String vmSize) {
            return vmSize(Output.of(vmSize));
        }

        public NodeTypeArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.dataDiskSizeGB = Objects.requireNonNull($.dataDiskSizeGB, "expected parameter 'dataDiskSizeGB' to be non-null");
            $.isPrimary = Objects.requireNonNull($.isPrimary, "expected parameter 'isPrimary' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vmInstanceCount = Objects.requireNonNull($.vmInstanceCount, "expected parameter 'vmInstanceCount' to be non-null");
            return $;
        }
    }

}
