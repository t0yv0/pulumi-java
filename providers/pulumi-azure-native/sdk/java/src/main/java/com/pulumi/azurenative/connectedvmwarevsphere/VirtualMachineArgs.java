// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere;

import com.pulumi.azurenative.connectedvmwarevsphere.enums.FirmwareType;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.HardwareProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.IdentityArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.NetworkProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.OsProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.PlacementProfileArgs;
import com.pulumi.azurenative.connectedvmwarevsphere.inputs.StorageProfileArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineArgs Empty = new VirtualMachineArgs();

    /**
     * Gets or sets the extended location.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return Gets or sets the extended location.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Firmware type
     * 
     */
    @Import(name="firmwareType")
    private @Nullable Output<Either<String,FirmwareType>> firmwareType;

    /**
     * @return Firmware type
     * 
     */
    public Optional<Output<Either<String,FirmwareType>>> firmwareType() {
        return Optional.ofNullable(this.firmwareType);
    }

    /**
     * Hardware properties.
     * 
     */
    @Import(name="hardwareProfile")
    private @Nullable Output<HardwareProfileArgs> hardwareProfile;

    /**
     * @return Hardware properties.
     * 
     */
    public Optional<Output<HardwareProfileArgs>> hardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityArgs> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Optional<Output<IdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    @Import(name="inventoryItemId")
    private @Nullable Output<String> inventoryItemId;

    /**
     * @return Gets or sets the inventory Item ID for the virtual machine.
     * 
     */
    public Optional<Output<String>> inventoryItemId() {
        return Optional.ofNullable(this.inventoryItemId);
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Gets or sets the location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    @Import(name="moRefId")
    private @Nullable Output<String> moRefId;

    /**
     * @return Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
     * 
     */
    public Optional<Output<String>> moRefId() {
        return Optional.ofNullable(this.moRefId);
    }

    /**
     * Network properties.
     * 
     */
    @Import(name="networkProfile")
    private @Nullable Output<NetworkProfileArgs> networkProfile;

    /**
     * @return Network properties.
     * 
     */
    public Optional<Output<NetworkProfileArgs>> networkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }

    /**
     * OS properties.
     * 
     */
    @Import(name="osProfile")
    private @Nullable Output<OsProfileArgs> osProfile;

    /**
     * @return OS properties.
     * 
     */
    public Optional<Output<OsProfileArgs>> osProfile() {
        return Optional.ofNullable(this.osProfile);
    }

    /**
     * Placement properties.
     * 
     */
    @Import(name="placementProfile")
    private @Nullable Output<PlacementProfileArgs> placementProfile;

    /**
     * @return Placement properties.
     * 
     */
    public Optional<Output<PlacementProfileArgs>> placementProfile() {
        return Optional.ofNullable(this.placementProfile);
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    @Import(name="resourcePoolId")
    private @Nullable Output<String> resourcePoolId;

    /**
     * @return Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
     * deploy.
     * 
     */
    public Optional<Output<String>> resourcePoolId() {
        return Optional.ofNullable(this.resourcePoolId);
    }

    /**
     * Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    @Import(name="smbiosUuid")
    private @Nullable Output<String> smbiosUuid;

    /**
     * @return Gets or sets the SMBIOS UUID of the vm.
     * 
     */
    public Optional<Output<String>> smbiosUuid() {
        return Optional.ofNullable(this.smbiosUuid);
    }

    /**
     * Storage properties.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<StorageProfileArgs> storageProfile;

    /**
     * @return Storage properties.
     * 
     */
    public Optional<Output<StorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Gets or sets the Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    @Import(name="templateId")
    private @Nullable Output<String> templateId;

    /**
     * @return Gets or sets the ARM Id of the template resource to deploy the virtual machine.
     * 
     */
    public Optional<Output<String>> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    /**
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    @Import(name="vCenterId")
    private @Nullable Output<String> vCenterId;

    /**
     * @return Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     * 
     */
    public Optional<Output<String>> vCenterId() {
        return Optional.ofNullable(this.vCenterId);
    }

    /**
     * Name of the virtual machine resource.
     * 
     */
    @Import(name="virtualMachineName")
    private @Nullable Output<String> virtualMachineName;

    /**
     * @return Name of the virtual machine resource.
     * 
     */
    public Optional<Output<String>> virtualMachineName() {
        return Optional.ofNullable(this.virtualMachineName);
    }

    private VirtualMachineArgs() {}

    private VirtualMachineArgs(VirtualMachineArgs $) {
        this.extendedLocation = $.extendedLocation;
        this.firmwareType = $.firmwareType;
        this.hardwareProfile = $.hardwareProfile;
        this.identity = $.identity;
        this.inventoryItemId = $.inventoryItemId;
        this.kind = $.kind;
        this.location = $.location;
        this.moRefId = $.moRefId;
        this.networkProfile = $.networkProfile;
        this.osProfile = $.osProfile;
        this.placementProfile = $.placementProfile;
        this.resourceGroupName = $.resourceGroupName;
        this.resourcePoolId = $.resourcePoolId;
        this.smbiosUuid = $.smbiosUuid;
        this.storageProfile = $.storageProfile;
        this.tags = $.tags;
        this.templateId = $.templateId;
        this.vCenterId = $.vCenterId;
        this.virtualMachineName = $.virtualMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineArgs $;

        public Builder() {
            $ = new VirtualMachineArgs();
        }

        public Builder(VirtualMachineArgs defaults) {
            $ = new VirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extendedLocation Gets or sets the extended location.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation Gets or sets the extended location.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param firmwareType Firmware type
         * 
         * @return builder
         * 
         */
        public Builder firmwareType(@Nullable Output<Either<String,FirmwareType>> firmwareType) {
            $.firmwareType = firmwareType;
            return this;
        }

        /**
         * @param firmwareType Firmware type
         * 
         * @return builder
         * 
         */
        public Builder firmwareType(Either<String,FirmwareType> firmwareType) {
            return firmwareType(Output.of(firmwareType));
        }

        /**
         * @param firmwareType Firmware type
         * 
         * @return builder
         * 
         */
        public Builder firmwareType(String firmwareType) {
            return firmwareType(Either.ofLeft(firmwareType));
        }

        /**
         * @param firmwareType Firmware type
         * 
         * @return builder
         * 
         */
        public Builder firmwareType(FirmwareType firmwareType) {
            return firmwareType(Either.ofRight(firmwareType));
        }

        /**
         * @param hardwareProfile Hardware properties.
         * 
         * @return builder
         * 
         */
        public Builder hardwareProfile(@Nullable Output<HardwareProfileArgs> hardwareProfile) {
            $.hardwareProfile = hardwareProfile;
            return this;
        }

        /**
         * @param hardwareProfile Hardware properties.
         * 
         * @return builder
         * 
         */
        public Builder hardwareProfile(HardwareProfileArgs hardwareProfile) {
            return hardwareProfile(Output.of(hardwareProfile));
        }

        /**
         * @param identity The identity of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param inventoryItemId Gets or sets the inventory Item ID for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder inventoryItemId(@Nullable Output<String> inventoryItemId) {
            $.inventoryItemId = inventoryItemId;
            return this;
        }

        /**
         * @param inventoryItemId Gets or sets the inventory Item ID for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder inventoryItemId(String inventoryItemId) {
            return inventoryItemId(Output.of(inventoryItemId));
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Gets or sets the location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Gets or sets the location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param moRefId Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder moRefId(@Nullable Output<String> moRefId) {
            $.moRefId = moRefId;
            return this;
        }

        /**
         * @param moRefId Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder moRefId(String moRefId) {
            return moRefId(Output.of(moRefId));
        }

        /**
         * @param networkProfile Network properties.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(@Nullable Output<NetworkProfileArgs> networkProfile) {
            $.networkProfile = networkProfile;
            return this;
        }

        /**
         * @param networkProfile Network properties.
         * 
         * @return builder
         * 
         */
        public Builder networkProfile(NetworkProfileArgs networkProfile) {
            return networkProfile(Output.of(networkProfile));
        }

        /**
         * @param osProfile OS properties.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(@Nullable Output<OsProfileArgs> osProfile) {
            $.osProfile = osProfile;
            return this;
        }

        /**
         * @param osProfile OS properties.
         * 
         * @return builder
         * 
         */
        public Builder osProfile(OsProfileArgs osProfile) {
            return osProfile(Output.of(osProfile));
        }

        /**
         * @param placementProfile Placement properties.
         * 
         * @return builder
         * 
         */
        public Builder placementProfile(@Nullable Output<PlacementProfileArgs> placementProfile) {
            $.placementProfile = placementProfile;
            return this;
        }

        /**
         * @param placementProfile Placement properties.
         * 
         * @return builder
         * 
         */
        public Builder placementProfile(PlacementProfileArgs placementProfile) {
            return placementProfile(Output.of(placementProfile));
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourcePoolId Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
         * deploy.
         * 
         * @return builder
         * 
         */
        public Builder resourcePoolId(@Nullable Output<String> resourcePoolId) {
            $.resourcePoolId = resourcePoolId;
            return this;
        }

        /**
         * @param resourcePoolId Gets or sets the ARM Id of the resourcePool resource on which this virtual machine will
         * deploy.
         * 
         * @return builder
         * 
         */
        public Builder resourcePoolId(String resourcePoolId) {
            return resourcePoolId(Output.of(resourcePoolId));
        }

        /**
         * @param smbiosUuid Gets or sets the SMBIOS UUID of the vm.
         * 
         * @return builder
         * 
         */
        public Builder smbiosUuid(@Nullable Output<String> smbiosUuid) {
            $.smbiosUuid = smbiosUuid;
            return this;
        }

        /**
         * @param smbiosUuid Gets or sets the SMBIOS UUID of the vm.
         * 
         * @return builder
         * 
         */
        public Builder smbiosUuid(String smbiosUuid) {
            return smbiosUuid(Output.of(smbiosUuid));
        }

        /**
         * @param storageProfile Storage properties.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(@Nullable Output<StorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        /**
         * @param storageProfile Storage properties.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(StorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        /**
         * @param tags Gets or sets the Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Gets or sets the Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param templateId Gets or sets the ARM Id of the template resource to deploy the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder templateId(@Nullable Output<String> templateId) {
            $.templateId = templateId;
            return this;
        }

        /**
         * @param templateId Gets or sets the ARM Id of the template resource to deploy the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder templateId(String templateId) {
            return templateId(Output.of(templateId));
        }

        /**
         * @param vCenterId Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
         * 
         * @return builder
         * 
         */
        public Builder vCenterId(@Nullable Output<String> vCenterId) {
            $.vCenterId = vCenterId;
            return this;
        }

        /**
         * @param vCenterId Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
         * 
         * @return builder
         * 
         */
        public Builder vCenterId(String vCenterId) {
            return vCenterId(Output.of(vCenterId));
        }

        /**
         * @param virtualMachineName Name of the virtual machine resource.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineName(@Nullable Output<String> virtualMachineName) {
            $.virtualMachineName = virtualMachineName;
            return this;
        }

        /**
         * @param virtualMachineName Name of the virtual machine resource.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineName(String virtualMachineName) {
            return virtualMachineName(Output.of(virtualMachineName));
        }

        public VirtualMachineArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
