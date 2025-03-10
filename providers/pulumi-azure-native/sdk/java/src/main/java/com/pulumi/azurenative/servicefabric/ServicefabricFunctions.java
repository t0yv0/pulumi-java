// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicefabric.inputs.GetApplicationArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetApplicationTypeArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetApplicationTypeVersionArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetClusterArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetManagedClusterArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetNodeTypeArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetServiceArgs;
import com.pulumi.azurenative.servicefabric.inputs.GetmanagedAzResiliencyStatusArgs;
import com.pulumi.azurenative.servicefabric.inputs.ListListUpgradableVersionPostArgs;
import com.pulumi.azurenative.servicefabric.outputs.GetApplicationResult;
import com.pulumi.azurenative.servicefabric.outputs.GetApplicationTypeResult;
import com.pulumi.azurenative.servicefabric.outputs.GetApplicationTypeVersionResult;
import com.pulumi.azurenative.servicefabric.outputs.GetClusterResult;
import com.pulumi.azurenative.servicefabric.outputs.GetManagedClusterResult;
import com.pulumi.azurenative.servicefabric.outputs.GetNodeTypeResult;
import com.pulumi.azurenative.servicefabric.outputs.GetServiceResult;
import com.pulumi.azurenative.servicefabric.outputs.GetmanagedAzResiliencyStatusResult;
import com.pulumi.azurenative.servicefabric.outputs.ListListUpgradableVersionPostResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicefabricFunctions {
    /**
     * The application resource.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * The application resource.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The application type name resource
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetApplicationTypeResult> getApplicationType(GetApplicationTypeArgs args) {
        return getApplicationType(args, InvokeOptions.Empty);
    }
    /**
     * The application type name resource
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetApplicationTypeResult> getApplicationType(GetApplicationTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getApplicationType", TypeShape.of(GetApplicationTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An application type version resource for the specified application type name resource.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetApplicationTypeVersionResult> getApplicationTypeVersion(GetApplicationTypeVersionArgs args) {
        return getApplicationTypeVersion(args, InvokeOptions.Empty);
    }
    /**
     * An application type version resource for the specified application type name resource.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetApplicationTypeVersionResult> getApplicationTypeVersion(GetApplicationTypeVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getApplicationTypeVersion", TypeShape.of(GetApplicationTypeVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The cluster resource
     * 
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * The cluster resource
     * 
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The manged cluster resource
     * 
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedClusterResult> getManagedCluster(GetManagedClusterArgs args) {
        return getManagedCluster(args, InvokeOptions.Empty);
    }
    /**
     * The manged cluster resource
     * 
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedClusterResult> getManagedCluster(GetManagedClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getManagedCluster", TypeShape.of(GetManagedClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a node type in the cluster, each node type represents sub set of nodes in the cluster.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNodeTypeResult> getNodeType(GetNodeTypeArgs args) {
        return getNodeType(args, InvokeOptions.Empty);
    }
    /**
     * Describes a node type in the cluster, each node type represents sub set of nodes in the cluster.
     * API Version: 2020-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNodeTypeResult> getNodeType(GetNodeTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getNodeType", TypeShape.of(GetNodeTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The service resource.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * The service resource.
     * API Version: 2020-03-01.
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes the result of the request to list Managed VM Sizes for Service Fabric Managed Clusters.
     * API Version: 2022-02-01-preview.
     * 
     */
    public static CompletableFuture<GetmanagedAzResiliencyStatusResult> getmanagedAzResiliencyStatus(GetmanagedAzResiliencyStatusArgs args) {
        return getmanagedAzResiliencyStatus(args, InvokeOptions.Empty);
    }
    /**
     * Describes the result of the request to list Managed VM Sizes for Service Fabric Managed Clusters.
     * API Version: 2022-02-01-preview.
     * 
     */
    public static CompletableFuture<GetmanagedAzResiliencyStatusResult> getmanagedAzResiliencyStatus(GetmanagedAzResiliencyStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:getmanagedAzResiliencyStatus", TypeShape.of(GetmanagedAzResiliencyStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of intermediate cluster code versions for an upgrade or downgrade. Or minimum and maximum upgradable version if no target was given
     * API Version: 2020-12-01-preview.
     * 
     */
    public static CompletableFuture<ListListUpgradableVersionPostResult> listListUpgradableVersionPost(ListListUpgradableVersionPostArgs args) {
        return listListUpgradableVersionPost(args, InvokeOptions.Empty);
    }
    /**
     * The list of intermediate cluster code versions for an upgrade or downgrade. Or minimum and maximum upgradable version if no target was given
     * API Version: 2020-12-01-preview.
     * 
     */
    public static CompletableFuture<ListListUpgradableVersionPostResult> listListUpgradableVersionPost(ListListUpgradableVersionPostArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabric:listListUpgradableVersionPost", TypeShape.of(ListListUpgradableVersionPostResult.class), args, Utilities.withVersion(options));
    }
}
