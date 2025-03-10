// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicefabricmesh.inputs.GetApplicationArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.GetGatewayArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.GetNetworkArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.GetSecretArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.GetSecretValueArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.GetVolumeArgs;
import com.pulumi.azurenative.servicefabricmesh.inputs.ListSecretValueArgs;
import com.pulumi.azurenative.servicefabricmesh.outputs.GetApplicationResult;
import com.pulumi.azurenative.servicefabricmesh.outputs.GetGatewayResult;
import com.pulumi.azurenative.servicefabricmesh.outputs.GetNetworkResult;
import com.pulumi.azurenative.servicefabricmesh.outputs.GetSecretResult;
import com.pulumi.azurenative.servicefabricmesh.outputs.GetSecretValueResult;
import com.pulumi.azurenative.servicefabricmesh.outputs.GetVolumeResult;
import com.pulumi.azurenative.servicefabricmesh.outputs.ListSecretValueResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicefabricmeshFunctions {
    /**
     * This type describes an application resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * This type describes an application resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This type describes a gateway resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args) {
        return getGateway(args, InvokeOptions.Empty);
    }
    /**
     * This type describes a gateway resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetGatewayResult> getGateway(GetGatewayArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getGateway", TypeShape.of(GetGatewayResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This type describes a network resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetNetworkResult> getNetwork(GetNetworkArgs args) {
        return getNetwork(args, InvokeOptions.Empty);
    }
    /**
     * This type describes a network resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetNetworkResult> getNetwork(GetNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getNetwork", TypeShape.of(GetNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This type describes a secret resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    /**
     * This type describes a secret resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This type describes a value of a secret resource. The name of this resource is the version identifier corresponding to this secret value.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSecretValueResult> getSecretValue(GetSecretValueArgs args) {
        return getSecretValue(args, InvokeOptions.Empty);
    }
    /**
     * This type describes a value of a secret resource. The name of this resource is the version identifier corresponding to this secret value.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSecretValueResult> getSecretValue(GetSecretValueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getSecretValue", TypeShape.of(GetSecretValueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This type describes a volume resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetVolumeResult> getVolume(GetVolumeArgs args) {
        return getVolume(args, InvokeOptions.Empty);
    }
    /**
     * This type describes a volume resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetVolumeResult> getVolume(GetVolumeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getVolume", TypeShape.of(GetVolumeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This type represents the unencrypted value of the secret.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<ListSecretValueResult> listSecretValue(ListSecretValueArgs args) {
        return listSecretValue(args, InvokeOptions.Empty);
    }
    /**
     * This type represents the unencrypted value of the secret.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<ListSecretValueResult> listSecretValue(ListSecretValueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:listSecretValue", TypeShape.of(ListSecretValueResult.class), args, Utilities.withVersion(options));
    }
}
