// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.delegatednetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.delegatednetwork.inputs.GetControllerDetailsArgs;
import com.pulumi.azurenative.delegatednetwork.inputs.GetDelegatedSubnetServiceDetailsArgs;
import com.pulumi.azurenative.delegatednetwork.inputs.GetOrchestratorInstanceServiceDetailsArgs;
import com.pulumi.azurenative.delegatednetwork.outputs.GetControllerDetailsResult;
import com.pulumi.azurenative.delegatednetwork.outputs.GetDelegatedSubnetServiceDetailsResult;
import com.pulumi.azurenative.delegatednetwork.outputs.GetOrchestratorInstanceServiceDetailsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DelegatednetworkFunctions {
    /**
     * Represents an instance of a DNC controller.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetControllerDetailsResult> getControllerDetails(GetControllerDetailsArgs args) {
        return getControllerDetails(args, InvokeOptions.Empty);
    }
    /**
     * Represents an instance of a DNC controller.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetControllerDetailsResult> getControllerDetails(GetControllerDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getControllerDetails", TypeShape.of(GetControllerDetailsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an instance of a orchestrator.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetDelegatedSubnetServiceDetailsResult> getDelegatedSubnetServiceDetails(GetDelegatedSubnetServiceDetailsArgs args) {
        return getDelegatedSubnetServiceDetails(args, InvokeOptions.Empty);
    }
    /**
     * Represents an instance of a orchestrator.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetDelegatedSubnetServiceDetailsResult> getDelegatedSubnetServiceDetails(GetDelegatedSubnetServiceDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getDelegatedSubnetServiceDetails", TypeShape.of(GetDelegatedSubnetServiceDetailsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an instance of a orchestrator.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetOrchestratorInstanceServiceDetailsResult> getOrchestratorInstanceServiceDetails(GetOrchestratorInstanceServiceDetailsArgs args) {
        return getOrchestratorInstanceServiceDetails(args, InvokeOptions.Empty);
    }
    /**
     * Represents an instance of a orchestrator.
     * API Version: 2021-03-15.
     * 
     */
    public static CompletableFuture<GetOrchestratorInstanceServiceDetailsResult> getOrchestratorInstanceServiceDetails(GetOrchestratorInstanceServiceDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getOrchestratorInstanceServiceDetails", TypeShape.of(GetOrchestratorInstanceServiceDetailsResult.class), args, Utilities.withVersion(options));
    }
}
