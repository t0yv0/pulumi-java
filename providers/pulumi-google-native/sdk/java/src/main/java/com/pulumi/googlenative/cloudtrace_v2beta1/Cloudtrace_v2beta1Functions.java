// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtrace_v2beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudtrace_v2beta1.inputs.GetTraceSinkArgs;
import com.pulumi.googlenative.cloudtrace_v2beta1.outputs.GetTraceSinkResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudtrace_v2beta1Functions {
    /**
     * Get a trace sink by name under the parent resource (GCP project).
     * 
     */
    public static CompletableFuture<GetTraceSinkResult> getTraceSink(GetTraceSinkArgs args) {
        return getTraceSink(args, InvokeOptions.Empty);
    }
    /**
     * Get a trace sink by name under the parent resource (GCP project).
     * 
     */
    public static CompletableFuture<GetTraceSinkResult> getTraceSink(GetTraceSinkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtrace/v2beta1:getTraceSink", TypeShape.of(GetTraceSinkResult.class), args, Utilities.withVersion(options));
    }
}
