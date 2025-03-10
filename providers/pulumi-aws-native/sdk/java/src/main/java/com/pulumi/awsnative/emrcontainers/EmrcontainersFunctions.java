// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.emrcontainers;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.emrcontainers.inputs.GetVirtualClusterArgs;
import com.pulumi.awsnative.emrcontainers.outputs.GetVirtualClusterResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EmrcontainersFunctions {
    /**
     * Resource Schema of AWS::EMRContainers::VirtualCluster Type
     * 
     */
    public static CompletableFuture<GetVirtualClusterResult> getVirtualCluster(GetVirtualClusterArgs args) {
        return getVirtualCluster(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema of AWS::EMRContainers::VirtualCluster Type
     * 
     */
    public static CompletableFuture<GetVirtualClusterResult> getVirtualCluster(GetVirtualClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:emrcontainers:getVirtualCluster", TypeShape.of(GetVirtualClusterResult.class), args, Utilities.withVersion(options));
    }
}
