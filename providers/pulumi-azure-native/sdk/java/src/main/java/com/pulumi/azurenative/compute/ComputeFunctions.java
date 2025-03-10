// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.inputs.GetAvailabilitySetArgs;
import com.pulumi.azurenative.compute.inputs.GetCapacityReservationArgs;
import com.pulumi.azurenative.compute.inputs.GetCapacityReservationGroupArgs;
import com.pulumi.azurenative.compute.inputs.GetCloudServiceArgs;
import com.pulumi.azurenative.compute.inputs.GetDedicatedHostArgs;
import com.pulumi.azurenative.compute.inputs.GetDedicatedHostGroupArgs;
import com.pulumi.azurenative.compute.inputs.GetDiskAccessAPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.compute.inputs.GetDiskAccessArgs;
import com.pulumi.azurenative.compute.inputs.GetDiskArgs;
import com.pulumi.azurenative.compute.inputs.GetDiskEncryptionSetArgs;
import com.pulumi.azurenative.compute.inputs.GetGalleryApplicationArgs;
import com.pulumi.azurenative.compute.inputs.GetGalleryApplicationVersionArgs;
import com.pulumi.azurenative.compute.inputs.GetGalleryArgs;
import com.pulumi.azurenative.compute.inputs.GetGalleryImageArgs;
import com.pulumi.azurenative.compute.inputs.GetGalleryImageVersionArgs;
import com.pulumi.azurenative.compute.inputs.GetImageArgs;
import com.pulumi.azurenative.compute.inputs.GetLogAnalyticExportRequestRateByIntervalArgs;
import com.pulumi.azurenative.compute.inputs.GetLogAnalyticExportThrottledRequestsArgs;
import com.pulumi.azurenative.compute.inputs.GetProximityPlacementGroupArgs;
import com.pulumi.azurenative.compute.inputs.GetRestorePointArgs;
import com.pulumi.azurenative.compute.inputs.GetRestorePointCollectionArgs;
import com.pulumi.azurenative.compute.inputs.GetSnapshotArgs;
import com.pulumi.azurenative.compute.inputs.GetSshPublicKeyArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineExtensionArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineRunCommandByVirtualMachineArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetExtensionArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetVMArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetVMExtensionArgs;
import com.pulumi.azurenative.compute.inputs.GetVirtualMachineScaleSetVMRunCommandArgs;
import com.pulumi.azurenative.compute.outputs.GetAvailabilitySetResult;
import com.pulumi.azurenative.compute.outputs.GetCapacityReservationGroupResult;
import com.pulumi.azurenative.compute.outputs.GetCapacityReservationResult;
import com.pulumi.azurenative.compute.outputs.GetCloudServiceResult;
import com.pulumi.azurenative.compute.outputs.GetDedicatedHostGroupResult;
import com.pulumi.azurenative.compute.outputs.GetDedicatedHostResult;
import com.pulumi.azurenative.compute.outputs.GetDiskAccessAPrivateEndpointConnectionResult;
import com.pulumi.azurenative.compute.outputs.GetDiskAccessResult;
import com.pulumi.azurenative.compute.outputs.GetDiskEncryptionSetResult;
import com.pulumi.azurenative.compute.outputs.GetDiskResult;
import com.pulumi.azurenative.compute.outputs.GetGalleryApplicationResult;
import com.pulumi.azurenative.compute.outputs.GetGalleryApplicationVersionResult;
import com.pulumi.azurenative.compute.outputs.GetGalleryImageResult;
import com.pulumi.azurenative.compute.outputs.GetGalleryImageVersionResult;
import com.pulumi.azurenative.compute.outputs.GetGalleryResult;
import com.pulumi.azurenative.compute.outputs.GetImageResult;
import com.pulumi.azurenative.compute.outputs.GetLogAnalyticExportRequestRateByIntervalResult;
import com.pulumi.azurenative.compute.outputs.GetLogAnalyticExportThrottledRequestsResult;
import com.pulumi.azurenative.compute.outputs.GetProximityPlacementGroupResult;
import com.pulumi.azurenative.compute.outputs.GetRestorePointCollectionResult;
import com.pulumi.azurenative.compute.outputs.GetRestorePointResult;
import com.pulumi.azurenative.compute.outputs.GetSnapshotResult;
import com.pulumi.azurenative.compute.outputs.GetSshPublicKeyResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineExtensionResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineRunCommandByVirtualMachineResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetExtensionResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetVMExtensionResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetVMResult;
import com.pulumi.azurenative.compute.outputs.GetVirtualMachineScaleSetVMRunCommandResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ComputeFunctions {
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetAvailabilitySetResult> getAvailabilitySet(GetAvailabilitySetArgs args) {
        return getAvailabilitySet(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the availability set that the virtual machine should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes to maximize availability. For more information about availability sets, see [Manage the availability of virtual machines](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-manage-availability?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json). &lt;br&gt;&lt;br&gt; For more information on Azure planned maintenance, see [Planned maintenance for virtual machines in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-planned-maintenance?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json) &lt;br&gt;&lt;br&gt; Currently, a VM can only be added to availability set at creation time. An existing VM cannot be added to an availability set.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetAvailabilitySetResult> getAvailabilitySet(GetAvailabilitySetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getAvailabilitySet", TypeShape.of(GetAvailabilitySetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the capacity reservation.
     * API Version: 2021-04-01.
     * 
     */
    public static CompletableFuture<GetCapacityReservationResult> getCapacityReservation(GetCapacityReservationArgs args) {
        return getCapacityReservation(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the capacity reservation.
     * API Version: 2021-04-01.
     * 
     */
    public static CompletableFuture<GetCapacityReservationResult> getCapacityReservation(GetCapacityReservationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getCapacityReservation", TypeShape.of(GetCapacityReservationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the capacity reservation group that the capacity reservations should be assigned to. &lt;br&gt;&lt;br&gt; Currently, a capacity reservation can only be added to a capacity reservation group at creation time. An existing capacity reservation cannot be added or moved to another capacity reservation group.
     * API Version: 2021-04-01.
     * 
     */
    public static CompletableFuture<GetCapacityReservationGroupResult> getCapacityReservationGroup(GetCapacityReservationGroupArgs args) {
        return getCapacityReservationGroup(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the capacity reservation group that the capacity reservations should be assigned to. &lt;br&gt;&lt;br&gt; Currently, a capacity reservation can only be added to a capacity reservation group at creation time. An existing capacity reservation cannot be added or moved to another capacity reservation group.
     * API Version: 2021-04-01.
     * 
     */
    public static CompletableFuture<GetCapacityReservationGroupResult> getCapacityReservationGroup(GetCapacityReservationGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getCapacityReservationGroup", TypeShape.of(GetCapacityReservationGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes the cloud service.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetCloudServiceResult> getCloudService(GetCloudServiceArgs args) {
        return getCloudService(args, InvokeOptions.Empty);
    }
    /**
     * Describes the cloud service.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetCloudServiceResult> getCloudService(GetCloudServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getCloudService", TypeShape.of(GetCloudServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the Dedicated host.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDedicatedHostResult> getDedicatedHost(GetDedicatedHostArgs args) {
        return getDedicatedHost(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the Dedicated host.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDedicatedHostResult> getDedicatedHost(GetDedicatedHostArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDedicatedHost", TypeShape.of(GetDedicatedHostResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the dedicated host group that the dedicated hosts should be assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at creation time. An existing dedicated host cannot be added to another dedicated host group.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDedicatedHostGroupResult> getDedicatedHostGroup(GetDedicatedHostGroupArgs args) {
        return getDedicatedHostGroup(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the dedicated host group that the dedicated hosts should be assigned to. &lt;br&gt;&lt;br&gt; Currently, a dedicated host can only be added to a dedicated host group at creation time. An existing dedicated host cannot be added to another dedicated host group.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDedicatedHostGroupResult> getDedicatedHostGroup(GetDedicatedHostGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDedicatedHostGroup", TypeShape.of(GetDedicatedHostGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Disk resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskResult> getDisk(GetDiskArgs args) {
        return getDisk(args, InvokeOptions.Empty);
    }
    /**
     * Disk resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskResult> getDisk(GetDiskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDisk", TypeShape.of(GetDiskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * disk access resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskAccessResult> getDiskAccess(GetDiskAccessArgs args) {
        return getDiskAccess(args, InvokeOptions.Empty);
    }
    /**
     * disk access resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskAccessResult> getDiskAccess(GetDiskAccessArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDiskAccess", TypeShape.of(GetDiskAccessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskAccessAPrivateEndpointConnectionResult> getDiskAccessAPrivateEndpointConnection(GetDiskAccessAPrivateEndpointConnectionArgs args) {
        return getDiskAccessAPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskAccessAPrivateEndpointConnectionResult> getDiskAccessAPrivateEndpointConnection(GetDiskAccessAPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDiskAccessAPrivateEndpointConnection", TypeShape.of(GetDiskAccessAPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * disk encryption set resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskEncryptionSetResult> getDiskEncryptionSet(GetDiskEncryptionSetArgs args) {
        return getDiskEncryptionSet(args, InvokeOptions.Empty);
    }
    /**
     * disk encryption set resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDiskEncryptionSetResult> getDiskEncryptionSet(GetDiskEncryptionSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getDiskEncryptionSet", TypeShape.of(GetDiskEncryptionSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the Shared Image Gallery that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryResult> getGallery(GetGalleryArgs args) {
        return getGallery(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the Shared Image Gallery that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryResult> getGallery(GetGalleryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getGallery", TypeShape.of(GetGalleryResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the gallery Application Definition that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryApplicationResult> getGalleryApplication(GetGalleryApplicationArgs args) {
        return getGalleryApplication(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the gallery Application Definition that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryApplicationResult> getGalleryApplication(GetGalleryApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getGalleryApplication", TypeShape.of(GetGalleryApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the gallery Application Version that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryApplicationVersionResult> getGalleryApplicationVersion(GetGalleryApplicationVersionArgs args) {
        return getGalleryApplicationVersion(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the gallery Application Version that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryApplicationVersionResult> getGalleryApplicationVersion(GetGalleryApplicationVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getGalleryApplicationVersion", TypeShape.of(GetGalleryApplicationVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the gallery image definition that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryImageResult> getGalleryImage(GetGalleryImageArgs args) {
        return getGalleryImage(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the gallery image definition that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryImageResult> getGalleryImage(GetGalleryImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getGalleryImage", TypeShape.of(GetGalleryImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the gallery image version that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryImageVersionResult> getGalleryImageVersion(GetGalleryImageVersionArgs args) {
        return getGalleryImageVersion(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the gallery image version that you want to create or update.
     * API Version: 2020-09-30.
     * 
     */
    public static CompletableFuture<GetGalleryImageVersionResult> getGalleryImageVersion(GetGalleryImageVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getGalleryImageVersion", TypeShape.of(GetGalleryImageVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args) {
        return getImage(args, InvokeOptions.Empty);
    }
    /**
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetImageResult> getImage(GetImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getImage", TypeShape.of(GetImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * LogAnalytics operation status response
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetLogAnalyticExportRequestRateByIntervalResult> getLogAnalyticExportRequestRateByInterval(GetLogAnalyticExportRequestRateByIntervalArgs args) {
        return getLogAnalyticExportRequestRateByInterval(args, InvokeOptions.Empty);
    }
    /**
     * LogAnalytics operation status response
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetLogAnalyticExportRequestRateByIntervalResult> getLogAnalyticExportRequestRateByInterval(GetLogAnalyticExportRequestRateByIntervalArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getLogAnalyticExportRequestRateByInterval", TypeShape.of(GetLogAnalyticExportRequestRateByIntervalResult.class), args, Utilities.withVersion(options));
    }
    /**
     * LogAnalytics operation status response
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetLogAnalyticExportThrottledRequestsResult> getLogAnalyticExportThrottledRequests(GetLogAnalyticExportThrottledRequestsArgs args) {
        return getLogAnalyticExportThrottledRequests(args, InvokeOptions.Empty);
    }
    /**
     * LogAnalytics operation status response
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetLogAnalyticExportThrottledRequestsResult> getLogAnalyticExportThrottledRequests(GetLogAnalyticExportThrottledRequestsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getLogAnalyticExportThrottledRequests", TypeShape.of(GetLogAnalyticExportThrottledRequestsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the proximity placement group.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetProximityPlacementGroupResult> getProximityPlacementGroup(GetProximityPlacementGroupArgs args) {
        return getProximityPlacementGroup(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the proximity placement group.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetProximityPlacementGroupResult> getProximityPlacementGroup(GetProximityPlacementGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getProximityPlacementGroup", TypeShape.of(GetProximityPlacementGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Restore Point details.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetRestorePointResult> getRestorePoint(GetRestorePointArgs args) {
        return getRestorePoint(args, InvokeOptions.Empty);
    }
    /**
     * Restore Point details.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetRestorePointResult> getRestorePoint(GetRestorePointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getRestorePoint", TypeShape.of(GetRestorePointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create or update Restore Point collection parameters.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetRestorePointCollectionResult> getRestorePointCollection(GetRestorePointCollectionArgs args) {
        return getRestorePointCollection(args, InvokeOptions.Empty);
    }
    /**
     * Create or update Restore Point collection parameters.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetRestorePointCollectionResult> getRestorePointCollection(GetRestorePointCollectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getRestorePointCollection", TypeShape.of(GetRestorePointCollectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Snapshot resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshot(GetSnapshotArgs args) {
        return getSnapshot(args, InvokeOptions.Empty);
    }
    /**
     * Snapshot resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSnapshotResult> getSnapshot(GetSnapshotArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getSnapshot", TypeShape.of(GetSnapshotResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Specifies information about the SSH public key.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args) {
        return getSshPublicKey(args, InvokeOptions.Empty);
    }
    /**
     * Specifies information about the SSH public key.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetSshPublicKeyResult> getSshPublicKey(GetSshPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getSshPublicKey", TypeShape.of(GetSshPublicKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Virtual Machine.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args) {
        return getVirtualMachine(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Virtual Machine.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineResult> getVirtualMachine(GetVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachine", TypeShape.of(GetVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Virtual Machine Extension.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineExtensionResult> getVirtualMachineExtension(GetVirtualMachineExtensionArgs args) {
        return getVirtualMachineExtension(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Virtual Machine Extension.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineExtensionResult> getVirtualMachineExtension(GetVirtualMachineExtensionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineExtension", TypeShape.of(GetVirtualMachineExtensionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Virtual Machine run command.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineRunCommandByVirtualMachineResult> getVirtualMachineRunCommandByVirtualMachine(GetVirtualMachineRunCommandByVirtualMachineArgs args) {
        return getVirtualMachineRunCommandByVirtualMachine(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Virtual Machine run command.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineRunCommandByVirtualMachineResult> getVirtualMachineRunCommandByVirtualMachine(GetVirtualMachineRunCommandByVirtualMachineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineRunCommandByVirtualMachine", TypeShape.of(GetVirtualMachineRunCommandByVirtualMachineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Virtual Machine Scale Set.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetResult> getVirtualMachineScaleSet(GetVirtualMachineScaleSetArgs args) {
        return getVirtualMachineScaleSet(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Virtual Machine Scale Set.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetResult> getVirtualMachineScaleSet(GetVirtualMachineScaleSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSet", TypeShape.of(GetVirtualMachineScaleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Virtual Machine Scale Set Extension.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetExtensionResult> getVirtualMachineScaleSetExtension(GetVirtualMachineScaleSetExtensionArgs args) {
        return getVirtualMachineScaleSetExtension(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Virtual Machine Scale Set Extension.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetExtensionResult> getVirtualMachineScaleSetExtension(GetVirtualMachineScaleSetExtensionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSetExtension", TypeShape.of(GetVirtualMachineScaleSetExtensionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a virtual machine scale set virtual machine.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetVMResult> getVirtualMachineScaleSetVM(GetVirtualMachineScaleSetVMArgs args) {
        return getVirtualMachineScaleSetVM(args, InvokeOptions.Empty);
    }
    /**
     * Describes a virtual machine scale set virtual machine.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetVMResult> getVirtualMachineScaleSetVM(GetVirtualMachineScaleSetVMArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSetVM", TypeShape.of(GetVirtualMachineScaleSetVMResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a VMSS VM Extension.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetVMExtensionResult> getVirtualMachineScaleSetVMExtension(GetVirtualMachineScaleSetVMExtensionArgs args) {
        return getVirtualMachineScaleSetVMExtension(args, InvokeOptions.Empty);
    }
    /**
     * Describes a VMSS VM Extension.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetVMExtensionResult> getVirtualMachineScaleSetVMExtension(GetVirtualMachineScaleSetVMExtensionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSetVMExtension", TypeShape.of(GetVirtualMachineScaleSetVMExtensionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a Virtual Machine run command.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetVMRunCommandResult> getVirtualMachineScaleSetVMRunCommand(GetVirtualMachineScaleSetVMRunCommandArgs args) {
        return getVirtualMachineScaleSetVMRunCommand(args, InvokeOptions.Empty);
    }
    /**
     * Describes a Virtual Machine run command.
     * API Version: 2021-03-01.
     * 
     */
    public static CompletableFuture<GetVirtualMachineScaleSetVMRunCommandResult> getVirtualMachineScaleSetVMRunCommand(GetVirtualMachineScaleSetVMRunCommandArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:compute:getVirtualMachineScaleSetVMRunCommand", TypeShape.of(GetVirtualMachineScaleSetVMRunCommandResult.class), args, Utilities.withVersion(options));
    }
}
