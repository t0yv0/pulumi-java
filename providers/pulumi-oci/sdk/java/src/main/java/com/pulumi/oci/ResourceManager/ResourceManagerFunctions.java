// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ResourceManager;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.ResourceManager.inputs.GetStackArgs;
import com.pulumi.oci.ResourceManager.inputs.GetStackTfStateArgs;
import com.pulumi.oci.ResourceManager.inputs.GetStacksArgs;
import com.pulumi.oci.ResourceManager.outputs.GetStackResult;
import com.pulumi.oci.ResourceManager.outputs.GetStackTfStateResult;
import com.pulumi.oci.ResourceManager.outputs.GetStacksResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class ResourceManagerFunctions {
    /**
     * This data source provides details about a specific Stack resource in Oracle Cloud Infrastructure Resource Manager service.
     * 
     * Gets a stack using the stack ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStackResult> getStack(GetStackArgs args) {
        return getStack(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Stack resource in Oracle Cloud Infrastructure Resource Manager service.
     * 
     * Gets a stack using the stack ID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStackResult> getStack(GetStackArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ResourceManager/getStack:getStack", TypeShape.of(GetStackResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStackTfStateResult> getStackTfState(GetStackTfStateArgs args) {
        return getStackTfState(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStackTfStateResult> getStackTfState(GetStackTfStateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ResourceManager/getStackTfState:getStackTfState", TypeShape.of(GetStackTfStateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Stacks in Oracle Cloud Infrastructure Resource Manager service.
     * 
     * Returns a list of stacks.
     * - If called using the compartment ID, returns all stacks in the specified compartment.
     * - If called using the stack ID, returns the specified stack.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStacksResult> getStacks(GetStacksArgs args) {
        return getStacks(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Stacks in Oracle Cloud Infrastructure Resource Manager service.
     * 
     * Returns a list of stacks.
     * - If called using the compartment ID, returns all stacks in the specified compartment.
     * - If called using the stack ID, returns the specified stack.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetStacksResult> getStacks(GetStacksArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ResourceManager/getStacks:getStacks", TypeShape.of(GetStacksResult.class), args, Utilities.withVersion(options));
    }
}
