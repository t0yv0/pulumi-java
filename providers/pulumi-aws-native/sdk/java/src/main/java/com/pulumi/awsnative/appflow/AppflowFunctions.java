// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.appflow.inputs.GetConnectorProfileArgs;
import com.pulumi.awsnative.appflow.inputs.GetFlowArgs;
import com.pulumi.awsnative.appflow.outputs.GetConnectorProfileResult;
import com.pulumi.awsnative.appflow.outputs.GetFlowResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppflowFunctions {
    /**
     * Resource Type definition for AWS::AppFlow::ConnectorProfile
     * 
     */
    public static CompletableFuture<GetConnectorProfileResult> getConnectorProfile(GetConnectorProfileArgs args) {
        return getConnectorProfile(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::AppFlow::ConnectorProfile
     * 
     */
    public static CompletableFuture<GetConnectorProfileResult> getConnectorProfile(GetConnectorProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appflow:getConnectorProfile", TypeShape.of(GetConnectorProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for AWS::AppFlow::Flow.
     * 
     */
    public static CompletableFuture<GetFlowResult> getFlow(GetFlowArgs args) {
        return getFlow(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::AppFlow::Flow.
     * 
     */
    public static CompletableFuture<GetFlowResult> getFlow(GetFlowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:appflow:getFlow", TypeShape.of(GetFlowResult.class), args, Utilities.withVersion(options));
    }
}
