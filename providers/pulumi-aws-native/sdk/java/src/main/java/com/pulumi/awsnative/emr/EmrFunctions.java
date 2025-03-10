// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emr;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.emr.inputs.GetStudioArgs;
import com.pulumi.awsnative.emr.inputs.GetStudioSessionMappingArgs;
import com.pulumi.awsnative.emr.outputs.GetStudioResult;
import com.pulumi.awsnative.emr.outputs.GetStudioSessionMappingResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EmrFunctions {
    /**
     * Resource schema for AWS::EMR::Studio
     * 
     */
    public static CompletableFuture<GetStudioResult> getStudio(GetStudioArgs args) {
        return getStudio(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::EMR::Studio
     * 
     */
    public static CompletableFuture<GetStudioResult> getStudio(GetStudioArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:emr:getStudio", TypeShape.of(GetStudioResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetStudioSessionMappingResult> getStudioSessionMapping(GetStudioSessionMappingArgs args) {
        return getStudioSessionMapping(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetStudioSessionMappingResult> getStudioSessionMapping(GetStudioSessionMappingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:emr:getStudioSessionMapping", TypeShape.of(GetStudioSessionMappingResult.class), args, Utilities.withVersion(options));
    }
}
