// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datafusion_v1.inputs.GetInstanceArgs;
import com.pulumi.googlenative.datafusion_v1.inputs.GetInstanceIamPolicyArgs;
import com.pulumi.googlenative.datafusion_v1.outputs.GetInstanceIamPolicyResult;
import com.pulumi.googlenative.datafusion_v1.outputs.GetInstanceResult;
import java.util.concurrent.CompletableFuture;

public final class Datafusion_v1Functions {
    /**
     * Gets details of a single Data Fusion instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Data Fusion instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datafusion/v1:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> getInstanceIamPolicy(GetInstanceIamPolicyArgs args) {
        return getInstanceIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> getInstanceIamPolicy(GetInstanceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:datafusion/v1:getInstanceIamPolicy", TypeShape.of(GetInstanceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
