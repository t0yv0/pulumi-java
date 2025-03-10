// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1beta;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.websecurityscanner_v1beta.inputs.GetScanConfigArgs;
import com.pulumi.googlenative.websecurityscanner_v1beta.outputs.GetScanConfigResult;
import java.util.concurrent.CompletableFuture;

public final class Websecurityscanner_v1betaFunctions {
    /**
     * Gets a ScanConfig.
     * 
     */
    public static CompletableFuture<GetScanConfigResult> getScanConfig(GetScanConfigArgs args) {
        return getScanConfig(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ScanConfig.
     * 
     */
    public static CompletableFuture<GetScanConfigResult> getScanConfig(GetScanConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:websecurityscanner/v1beta:getScanConfig", TypeShape.of(GetScanConfigResult.class), args, Utilities.withVersion(options));
    }
}
