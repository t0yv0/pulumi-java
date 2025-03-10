// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.assuredworkloads_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.assuredworkloads_v1.inputs.GetWorkloadArgs;
import com.pulumi.googlenative.assuredworkloads_v1.outputs.GetWorkloadResult;
import java.util.concurrent.CompletableFuture;

public final class Assuredworkloads_v1Functions {
    /**
     * Gets Assured Workload associated with a CRM Node
     * 
     */
    public static CompletableFuture<GetWorkloadResult> getWorkload(GetWorkloadArgs args) {
        return getWorkload(args, InvokeOptions.Empty);
    }
    /**
     * Gets Assured Workload associated with a CRM Node
     * 
     */
    public static CompletableFuture<GetWorkloadResult> getWorkload(GetWorkloadArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:assuredworkloads/v1:getWorkload", TypeShape.of(GetWorkloadResult.class), args, Utilities.withVersion(options));
    }
}
