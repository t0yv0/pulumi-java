// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Functions;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Functions.inputs.GetApplicationArgs;
import com.pulumi.oci.Functions.inputs.GetApplicationsArgs;
import com.pulumi.oci.Functions.inputs.GetFunctionArgs;
import com.pulumi.oci.Functions.inputs.GetFunctionsArgs;
import com.pulumi.oci.Functions.outputs.GetApplicationResult;
import com.pulumi.oci.Functions.outputs.GetApplicationsResult;
import com.pulumi.oci.Functions.outputs.GetFunctionResult;
import com.pulumi.oci.Functions.outputs.GetFunctionsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class FunctionsFunctions {
    /**
     * This data source provides details about a specific Application resource in Oracle Cloud Infrastructure Functions service.
     * 
     * Retrieves an application.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Application resource in Oracle Cloud Infrastructure Functions service.
     * 
     * Retrieves an application.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Functions/getApplication:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Applications in Oracle Cloud Infrastructure Functions service.
     * 
     * Lists applications for a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApplicationsResult> getApplications(GetApplicationsArgs args) {
        return getApplications(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Applications in Oracle Cloud Infrastructure Functions service.
     * 
     * Lists applications for a compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetApplicationsResult> getApplications(GetApplicationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Functions/getApplications:getApplications", TypeShape.of(GetApplicationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Function resource in Oracle Cloud Infrastructure Functions service.
     * 
     * Retrieves a function.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args) {
        return getFunction(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Function resource in Oracle Cloud Infrastructure Functions service.
     * 
     * Retrieves a function.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Functions/getFunction:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Functions in Oracle Cloud Infrastructure Functions service.
     * 
     * Lists functions for an application.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFunctionsResult> getFunctions(GetFunctionsArgs args) {
        return getFunctions(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Functions in Oracle Cloud Infrastructure Functions service.
     * 
     * Lists functions for an application.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetFunctionsResult> getFunctions(GetFunctionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Functions/getFunctions:getFunctions", TypeShape.of(GetFunctionsResult.class), args, Utilities.withVersion(options));
    }
}
