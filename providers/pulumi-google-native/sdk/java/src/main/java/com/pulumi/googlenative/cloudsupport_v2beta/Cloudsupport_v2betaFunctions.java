// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsupport_v2beta;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudsupport_v2beta.inputs.GetCaseArgs;
import com.pulumi.googlenative.cloudsupport_v2beta.outputs.GetCaseResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudsupport_v2betaFunctions {
    /**
     * Retrieve the specified case.
     * 
     */
    public static CompletableFuture<GetCaseResult> getCase(GetCaseArgs args) {
        return getCase(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve the specified case.
     * 
     */
    public static CompletableFuture<GetCaseResult> getCase(GetCaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudsupport/v2beta:getCase", TypeShape.of(GetCaseResult.class), args, Utilities.withVersion(options));
    }
}
