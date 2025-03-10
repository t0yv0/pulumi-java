// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dynamics365fraudprotection;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dynamics365fraudprotection.inputs.GetInstanceDetailsArgs;
import com.pulumi.azurenative.dynamics365fraudprotection.outputs.GetInstanceDetailsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Dynamics365fraudprotectionFunctions {
    /**
     * Represents an instance of a DFP instance resource.
     * API Version: 2021-02-01-preview.
     * 
     */
    public static CompletableFuture<GetInstanceDetailsResult> getInstanceDetails(GetInstanceDetailsArgs args) {
        return getInstanceDetails(args, InvokeOptions.Empty);
    }
    /**
     * Represents an instance of a DFP instance resource.
     * API Version: 2021-02-01-preview.
     * 
     */
    public static CompletableFuture<GetInstanceDetailsResult> getInstanceDetails(GetInstanceDetailsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dynamics365fraudprotection:getInstanceDetails", TypeShape.of(GetInstanceDetailsResult.class), args, Utilities.withVersion(options));
    }
}
