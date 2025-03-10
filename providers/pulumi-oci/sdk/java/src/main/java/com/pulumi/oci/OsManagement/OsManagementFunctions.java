// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsManagement;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstanceArgs;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstanceEventReportArgs;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstanceGroupArgs;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstanceGroupsArgs;
import com.pulumi.oci.OsManagement.inputs.GetManagedInstancesArgs;
import com.pulumi.oci.OsManagement.inputs.GetSoftwareSourceArgs;
import com.pulumi.oci.OsManagement.inputs.GetSoftwareSourcesArgs;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceEventReportResult;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceGroupResult;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceGroupsResult;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstanceResult;
import com.pulumi.oci.OsManagement.outputs.GetManagedInstancesResult;
import com.pulumi.oci.OsManagement.outputs.GetSoftwareSourceResult;
import com.pulumi.oci.OsManagement.outputs.GetSoftwareSourcesResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class OsManagementFunctions {
    /**
     * This data source provides details about a specific Managed Instance resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a specific Managed Instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceResult> getManagedInstance(GetManagedInstanceArgs args) {
        return getManagedInstance(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Managed Instance resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a specific Managed Instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceResult> getManagedInstance(GetManagedInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getManagedInstance:getManagedInstance", TypeShape.of(GetManagedInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Managed Instance Event Report resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Get summary information about events on this instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceEventReportResult> getManagedInstanceEventReport(GetManagedInstanceEventReportArgs args) {
        return getManagedInstanceEventReport(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Managed Instance Event Report resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Get summary information about events on this instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceEventReportResult> getManagedInstanceEventReport(GetManagedInstanceEventReportArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getManagedInstanceEventReport:getManagedInstanceEventReport", TypeShape.of(GetManagedInstanceEventReportResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Managed Instance Group resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a specific Managed Instance Group.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceGroupResult> getManagedInstanceGroup(GetManagedInstanceGroupArgs args) {
        return getManagedInstanceGroup(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Managed Instance Group resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a specific Managed Instance Group.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceGroupResult> getManagedInstanceGroup(GetManagedInstanceGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getManagedInstanceGroup:getManagedInstanceGroup", TypeShape.of(GetManagedInstanceGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Managed Instance Groups in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a list of all Managed Instance Groups.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceGroupsResult> getManagedInstanceGroups(GetManagedInstanceGroupsArgs args) {
        return getManagedInstanceGroups(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Managed Instance Groups in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a list of all Managed Instance Groups.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstanceGroupsResult> getManagedInstanceGroups(GetManagedInstanceGroupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getManagedInstanceGroups:getManagedInstanceGroups", TypeShape.of(GetManagedInstanceGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Managed Instances in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a list of all Managed Instances.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstancesResult> getManagedInstances(GetManagedInstancesArgs args) {
        return getManagedInstances(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Managed Instances in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a list of all Managed Instances.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetManagedInstancesResult> getManagedInstances(GetManagedInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getManagedInstances:getManagedInstances", TypeShape.of(GetManagedInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Software Source resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a specific Software Source.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSoftwareSourceResult> getSoftwareSource(GetSoftwareSourceArgs args) {
        return getSoftwareSource(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Software Source resource in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a specific Software Source.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSoftwareSourceResult> getSoftwareSource(GetSoftwareSourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getSoftwareSource:getSoftwareSource", TypeShape.of(GetSoftwareSourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Software Sources in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a list of all Software Sources.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSoftwareSourcesResult> getSoftwareSources(GetSoftwareSourcesArgs args) {
        return getSoftwareSources(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Software Sources in Oracle Cloud Infrastructure OS Management service.
     * 
     * Returns a list of all Software Sources.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetSoftwareSourcesResult> getSoftwareSources(GetSoftwareSourcesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:OsManagement/getSoftwareSources:getSoftwareSources", TypeShape.of(GetSoftwareSourcesResult.class), args, Utilities.withVersion(options));
    }
}
