// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetDataDiskArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetExtensionArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetIdentityArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsDiskArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetOsProfileArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetPlanArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs;
import com.pulumi.azure.compute.inputs.OrchestratedVirtualMachineScaleSetTerminationNotificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrchestratedVirtualMachineScaleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrchestratedVirtualMachineScaleSetArgs Empty = new OrchestratedVirtualMachineScaleSetArgs();

    @Import(name="automaticInstanceRepair")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs> automaticInstanceRepair;

    public Optional<Output<OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs>> automaticInstanceRepair() {
        return Optional.ofNullable(this.automaticInstanceRepair);
    }

    @Import(name="bootDiagnostics")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs> bootDiagnostics;

    public Optional<Output<OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs>> bootDiagnostics() {
        return Optional.ofNullable(this.bootDiagnostics);
    }

    @Import(name="dataDisks")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetDataDiskArgs>> dataDisks;

    public Optional<Output<List<OrchestratedVirtualMachineScaleSetDataDiskArgs>>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    @Import(name="encryptionAtHostEnabled")
    private @Nullable Output<Boolean> encryptionAtHostEnabled;

    public Optional<Output<Boolean>> encryptionAtHostEnabled() {
        return Optional.ofNullable(this.encryptionAtHostEnabled);
    }

    @Import(name="evictionPolicy")
    private @Nullable Output<String> evictionPolicy;

    public Optional<Output<String>> evictionPolicy() {
        return Optional.ofNullable(this.evictionPolicy);
    }

    @Import(name="extensions")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetExtensionArgs>> extensions;

    public Optional<Output<List<OrchestratedVirtualMachineScaleSetExtensionArgs>>> extensions() {
        return Optional.ofNullable(this.extensions);
    }

    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M).
     * 
     */
    @Import(name="extensionsTimeBudget")
    private @Nullable Output<String> extensionsTimeBudget;

    /**
     * @return Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M).
     * 
     */
    public Optional<Output<String>> extensionsTimeBudget() {
        return Optional.ofNullable(this.extensionsTimeBudget);
    }

    @Import(name="identity")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetIdentityArgs> identity;

    public Optional<Output<OrchestratedVirtualMachineScaleSetIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The number of Virtual Machines in the Orcestrated Virtual Machine Scale Set.
     * 
     */
    @Import(name="instances")
    private @Nullable Output<Integer> instances;

    /**
     * @return The number of Virtual Machines in the Orcestrated Virtual Machine Scale Set.
     * 
     */
    public Optional<Output<Integer>> instances() {
        return Optional.ofNullable(this.instances);
    }

    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * The Azure location where the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure location where the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="maxBidPrice")
    private @Nullable Output<Double> maxBidPrice;

    public Optional<Output<Double>> maxBidPrice() {
        return Optional.ofNullable(this.maxBidPrice);
    }

    /**
     * The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="networkInterfaces")
    private @Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs>> networkInterfaces;

    public Optional<Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs>>> networkInterfaces() {
        return Optional.ofNullable(this.networkInterfaces);
    }

    @Import(name="osDisk")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetOsDiskArgs> osDisk;

    public Optional<Output<OrchestratedVirtualMachineScaleSetOsDiskArgs>> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    @Import(name="osProfile")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetOsProfileArgs> osProfile;

    public Optional<Output<OrchestratedVirtualMachineScaleSetOsProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    @Import(name="plan")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetPlanArgs> plan;

    public Optional<Output<OrchestratedVirtualMachineScaleSetPlanArgs>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * Specifies the number of fault domains that are used by this Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="platformFaultDomainCount", required=true)
    private Output<Integer> platformFaultDomainCount;

    /**
     * @return Specifies the number of fault domains that are used by this Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<Integer> platformFaultDomainCount() {
        return this.platformFaultDomainCount;
    }

    @Import(name="priority")
    private @Nullable Output<String> priority;

    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The ID of the Proximity Placement Group which the Orchestrated Virtual Machine should be assigned to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="proximityPlacementGroupId")
    private @Nullable Output<String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group which the Orchestrated Virtual Machine should be assigned to. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> proximityPlacementGroupId() {
        return Optional.ofNullable(this.proximityPlacementGroupId);
    }

    /**
     * The name of the Resource Group in which the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="skuName")
    private @Nullable Output<String> skuName;

    public Optional<Output<String>> skuName() {
        return Optional.ofNullable(this.skuName);
    }

    @Import(name="sourceImageId")
    private @Nullable Output<String> sourceImageId;

    public Optional<Output<String>> sourceImageId() {
        return Optional.ofNullable(this.sourceImageId);
    }

    /**
     * A `source_image_reference` block as defined below.
     * 
     */
    @Import(name="sourceImageReference")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs> sourceImageReference;

    /**
     * @return A `source_image_reference` block as defined below.
     * 
     */
    public Optional<Output<OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs>> sourceImageReference() {
        return Optional.ofNullable(this.sourceImageReference);
    }

    /**
     * A mapping of tags which should be assigned to this Orchestrated Virtual Machine Scale Set.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to this Orchestrated Virtual Machine Scale Set.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="terminationNotification")
    private @Nullable Output<OrchestratedVirtualMachineScaleSetTerminationNotificationArgs> terminationNotification;

    public Optional<Output<OrchestratedVirtualMachineScaleSetTerminationNotificationArgs>> terminationNotification() {
        return Optional.ofNullable(this.terminationNotification);
    }

    @Import(name="zoneBalance")
    private @Nullable Output<Boolean> zoneBalance;

    public Optional<Output<Boolean>> zoneBalance() {
        return Optional.ofNullable(this.zoneBalance);
    }

    /**
     * Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    /**
     * @return Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
     * 
     */
    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private OrchestratedVirtualMachineScaleSetArgs() {}

    private OrchestratedVirtualMachineScaleSetArgs(OrchestratedVirtualMachineScaleSetArgs $) {
        this.automaticInstanceRepair = $.automaticInstanceRepair;
        this.bootDiagnostics = $.bootDiagnostics;
        this.dataDisks = $.dataDisks;
        this.encryptionAtHostEnabled = $.encryptionAtHostEnabled;
        this.evictionPolicy = $.evictionPolicy;
        this.extensions = $.extensions;
        this.extensionsTimeBudget = $.extensionsTimeBudget;
        this.identity = $.identity;
        this.instances = $.instances;
        this.licenseType = $.licenseType;
        this.location = $.location;
        this.maxBidPrice = $.maxBidPrice;
        this.name = $.name;
        this.networkInterfaces = $.networkInterfaces;
        this.osDisk = $.osDisk;
        this.osProfile = $.osProfile;
        this.plan = $.plan;
        this.platformFaultDomainCount = $.platformFaultDomainCount;
        this.priority = $.priority;
        this.proximityPlacementGroupId = $.proximityPlacementGroupId;
        this.resourceGroupName = $.resourceGroupName;
        this.skuName = $.skuName;
        this.sourceImageId = $.sourceImageId;
        this.sourceImageReference = $.sourceImageReference;
        this.tags = $.tags;
        this.terminationNotification = $.terminationNotification;
        this.zoneBalance = $.zoneBalance;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrchestratedVirtualMachineScaleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrchestratedVirtualMachineScaleSetArgs $;

        public Builder() {
            $ = new OrchestratedVirtualMachineScaleSetArgs();
        }

        public Builder(OrchestratedVirtualMachineScaleSetArgs defaults) {
            $ = new OrchestratedVirtualMachineScaleSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder automaticInstanceRepair(@Nullable Output<OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs> automaticInstanceRepair) {
            $.automaticInstanceRepair = automaticInstanceRepair;
            return this;
        }

        public Builder automaticInstanceRepair(OrchestratedVirtualMachineScaleSetAutomaticInstanceRepairArgs automaticInstanceRepair) {
            return automaticInstanceRepair(Output.of(automaticInstanceRepair));
        }

        public Builder bootDiagnostics(@Nullable Output<OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs> bootDiagnostics) {
            $.bootDiagnostics = bootDiagnostics;
            return this;
        }

        public Builder bootDiagnostics(OrchestratedVirtualMachineScaleSetBootDiagnosticsArgs bootDiagnostics) {
            return bootDiagnostics(Output.of(bootDiagnostics));
        }

        public Builder dataDisks(@Nullable Output<List<OrchestratedVirtualMachineScaleSetDataDiskArgs>> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        public Builder dataDisks(List<OrchestratedVirtualMachineScaleSetDataDiskArgs> dataDisks) {
            return dataDisks(Output.of(dataDisks));
        }

        public Builder dataDisks(OrchestratedVirtualMachineScaleSetDataDiskArgs... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        public Builder encryptionAtHostEnabled(@Nullable Output<Boolean> encryptionAtHostEnabled) {
            $.encryptionAtHostEnabled = encryptionAtHostEnabled;
            return this;
        }

        public Builder encryptionAtHostEnabled(Boolean encryptionAtHostEnabled) {
            return encryptionAtHostEnabled(Output.of(encryptionAtHostEnabled));
        }

        public Builder evictionPolicy(@Nullable Output<String> evictionPolicy) {
            $.evictionPolicy = evictionPolicy;
            return this;
        }

        public Builder evictionPolicy(String evictionPolicy) {
            return evictionPolicy(Output.of(evictionPolicy));
        }

        public Builder extensions(@Nullable Output<List<OrchestratedVirtualMachineScaleSetExtensionArgs>> extensions) {
            $.extensions = extensions;
            return this;
        }

        public Builder extensions(List<OrchestratedVirtualMachineScaleSetExtensionArgs> extensions) {
            return extensions(Output.of(extensions));
        }

        public Builder extensions(OrchestratedVirtualMachineScaleSetExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }

        /**
         * @param extensionsTimeBudget Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M).
         * 
         * @return builder
         * 
         */
        public Builder extensionsTimeBudget(@Nullable Output<String> extensionsTimeBudget) {
            $.extensionsTimeBudget = extensionsTimeBudget;
            return this;
        }

        /**
         * @param extensionsTimeBudget Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M).
         * 
         * @return builder
         * 
         */
        public Builder extensionsTimeBudget(String extensionsTimeBudget) {
            return extensionsTimeBudget(Output.of(extensionsTimeBudget));
        }

        public Builder identity(@Nullable Output<OrchestratedVirtualMachineScaleSetIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(OrchestratedVirtualMachineScaleSetIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param instances The number of Virtual Machines in the Orcestrated Virtual Machine Scale Set.
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<Integer> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances The number of Virtual Machines in the Orcestrated Virtual Machine Scale Set.
         * 
         * @return builder
         * 
         */
        public Builder instances(Integer instances) {
            return instances(Output.of(instances));
        }

        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param location The Azure location where the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure location where the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder maxBidPrice(@Nullable Output<Double> maxBidPrice) {
            $.maxBidPrice = maxBidPrice;
            return this;
        }

        public Builder maxBidPrice(Double maxBidPrice) {
            return maxBidPrice(Output.of(maxBidPrice));
        }

        /**
         * @param name The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
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

        public Builder networkInterfaces(@Nullable Output<List<OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs>> networkInterfaces) {
            $.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(List<OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs> networkInterfaces) {
            return networkInterfaces(Output.of(networkInterfaces));
        }

        public Builder networkInterfaces(OrchestratedVirtualMachineScaleSetNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }

        public Builder osDisk(@Nullable Output<OrchestratedVirtualMachineScaleSetOsDiskArgs> osDisk) {
            $.osDisk = osDisk;
            return this;
        }

        public Builder osDisk(OrchestratedVirtualMachineScaleSetOsDiskArgs osDisk) {
            return osDisk(Output.of(osDisk));
        }

        public Builder osProfile(@Nullable Output<OrchestratedVirtualMachineScaleSetOsProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        public Builder osProfile(OrchestratedVirtualMachineScaleSetOsProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        public Builder plan(@Nullable Output<OrchestratedVirtualMachineScaleSetPlanArgs> plan) {
            $.plan = plan;
            return this;
        }

        public Builder plan(OrchestratedVirtualMachineScaleSetPlanArgs plan) {
            return plan(Output.of(plan));
        }

        /**
         * @param platformFaultDomainCount Specifies the number of fault domains that are used by this Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomainCount(Output<Integer> platformFaultDomainCount) {
            $.platformFaultDomainCount = platformFaultDomainCount;
            return this;
        }

        /**
         * @param platformFaultDomainCount Specifies the number of fault domains that are used by this Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomainCount(Integer platformFaultDomainCount) {
            return platformFaultDomainCount(Output.of(platformFaultDomainCount));
        }

        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param proximityPlacementGroupId The ID of the Proximity Placement Group which the Orchestrated Virtual Machine should be assigned to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder proximityPlacementGroupId(@Nullable Output<String> proximityPlacementGroupId) {
            $.proximityPlacementGroupId = proximityPlacementGroupId;
            return this;
        }

        /**
         * @param proximityPlacementGroupId The ID of the Proximity Placement Group which the Orchestrated Virtual Machine should be assigned to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder proximityPlacementGroupId(String proximityPlacementGroupId) {
            return proximityPlacementGroupId(Output.of(proximityPlacementGroupId));
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group in which the Orchestrated Virtual Machine Scale Set should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder skuName(@Nullable Output<String> skuName) {
            $.skuName = skuName;
            return this;
        }

        public Builder skuName(String skuName) {
            return skuName(Output.of(skuName));
        }

        public Builder sourceImageId(@Nullable Output<String> sourceImageId) {
            $.sourceImageId = sourceImageId;
            return this;
        }

        public Builder sourceImageId(String sourceImageId) {
            return sourceImageId(Output.of(sourceImageId));
        }

        /**
         * @param sourceImageReference A `source_image_reference` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sourceImageReference(@Nullable Output<OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs> sourceImageReference) {
            $.sourceImageReference = sourceImageReference;
            return this;
        }

        /**
         * @param sourceImageReference A `source_image_reference` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder sourceImageReference(OrchestratedVirtualMachineScaleSetSourceImageReferenceArgs sourceImageReference) {
            return sourceImageReference(Output.of(sourceImageReference));
        }

        /**
         * @param tags A mapping of tags which should be assigned to this Orchestrated Virtual Machine Scale Set.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags which should be assigned to this Orchestrated Virtual Machine Scale Set.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder terminationNotification(@Nullable Output<OrchestratedVirtualMachineScaleSetTerminationNotificationArgs> terminationNotification) {
            $.terminationNotification = terminationNotification;
            return this;
        }

        public Builder terminationNotification(OrchestratedVirtualMachineScaleSetTerminationNotificationArgs terminationNotification) {
            return terminationNotification(Output.of(terminationNotification));
        }

        public Builder zoneBalance(@Nullable Output<Boolean> zoneBalance) {
            $.zoneBalance = zoneBalance;
            return this;
        }

        public Builder zoneBalance(Boolean zoneBalance) {
            return zoneBalance(Output.of(zoneBalance));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        /**
         * @param zones Specifies a list of Availability Zones in which this Orchestrated Virtual Machine should be located. Changing this forces a new Orchestrated Virtual Machine to be created.
         * 
         * @return builder
         * 
         */
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public OrchestratedVirtualMachineScaleSetArgs build() {
            $.platformFaultDomainCount = Objects.requireNonNull($.platformFaultDomainCount, "expected parameter 'platformFaultDomainCount' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
