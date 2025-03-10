// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resiliencehub;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.resiliencehub.inputs.GetAppArgs;
import com.pulumi.awsnative.resiliencehub.inputs.GetResiliencyPolicyArgs;
import com.pulumi.awsnative.resiliencehub.outputs.GetAppResult;
import com.pulumi.awsnative.resiliencehub.outputs.GetResiliencyPolicyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ResiliencehubFunctions {
    /**
     * Resource Type Definition for AWS::ResilienceHub::App.
     * 
     */
    public static CompletableFuture<GetAppResult> getApp(GetAppArgs args) {
        return getApp(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type Definition for AWS::ResilienceHub::App.
     * 
     */
    public static CompletableFuture<GetAppResult> getApp(GetAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:resiliencehub:getApp", TypeShape.of(GetAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type Definition for Resiliency Policy.
     * 
     */
    public static CompletableFuture<GetResiliencyPolicyResult> getResiliencyPolicy(GetResiliencyPolicyArgs args) {
        return getResiliencyPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type Definition for Resiliency Policy.
     * 
     */
    public static CompletableFuture<GetResiliencyPolicyResult> getResiliencyPolicy(GetResiliencyPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:resiliencehub:getResiliencyPolicy", TypeShape.of(GetResiliencyPolicyResult.class), args, Utilities.withVersion(options));
    }
}
