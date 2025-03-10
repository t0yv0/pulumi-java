// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networkmanagement_v1beta1.inputs.GetConnectivityTestArgs;
import com.pulumi.googlenative.networkmanagement_v1beta1.inputs.GetConnectivityTestIamPolicyArgs;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.GetConnectivityTestIamPolicyResult;
import com.pulumi.googlenative.networkmanagement_v1beta1.outputs.GetConnectivityTestResult;
import java.util.concurrent.CompletableFuture;

public final class Networkmanagement_v1beta1Functions {
    /**
     * Gets the details of a specific Connectivity Test.
     * 
     */
    public static CompletableFuture<GetConnectivityTestResult> getConnectivityTest(GetConnectivityTestArgs args) {
        return getConnectivityTest(args, InvokeOptions.Empty);
    }
    /**
     * Gets the details of a specific Connectivity Test.
     * 
     */
    public static CompletableFuture<GetConnectivityTestResult> getConnectivityTest(GetConnectivityTestArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkmanagement/v1beta1:getConnectivityTest", TypeShape.of(GetConnectivityTestResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectivityTestIamPolicyResult> getConnectivityTestIamPolicy(GetConnectivityTestIamPolicyArgs args) {
        return getConnectivityTestIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectivityTestIamPolicyResult> getConnectivityTestIamPolicy(GetConnectivityTestIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkmanagement/v1beta1:getConnectivityTestIamPolicy", TypeShape.of(GetConnectivityTestIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
