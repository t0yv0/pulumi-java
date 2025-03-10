// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.GetAuthorizationPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.GetAuthorizationPolicyIamPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.GetClientTlsPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.GetClientTlsPolicyIamPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.GetServerTlsPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.inputs.GetServerTlsPolicyIamPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GetAuthorizationPolicyIamPolicyResult;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GetAuthorizationPolicyResult;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GetClientTlsPolicyIamPolicyResult;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GetClientTlsPolicyResult;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GetServerTlsPolicyIamPolicyResult;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GetServerTlsPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Networksecurity_v1beta1Functions {
    /**
     * Gets details of a single AuthorizationPolicy.
     * 
     */
    public static CompletableFuture<GetAuthorizationPolicyResult> getAuthorizationPolicy(GetAuthorizationPolicyArgs args) {
        return getAuthorizationPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single AuthorizationPolicy.
     * 
     */
    public static CompletableFuture<GetAuthorizationPolicyResult> getAuthorizationPolicy(GetAuthorizationPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getAuthorizationPolicy", TypeShape.of(GetAuthorizationPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetAuthorizationPolicyIamPolicyResult> getAuthorizationPolicyIamPolicy(GetAuthorizationPolicyIamPolicyArgs args) {
        return getAuthorizationPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetAuthorizationPolicyIamPolicyResult> getAuthorizationPolicyIamPolicy(GetAuthorizationPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getAuthorizationPolicyIamPolicy", TypeShape.of(GetAuthorizationPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ClientTlsPolicy.
     * 
     */
    public static CompletableFuture<GetClientTlsPolicyResult> getClientTlsPolicy(GetClientTlsPolicyArgs args) {
        return getClientTlsPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ClientTlsPolicy.
     * 
     */
    public static CompletableFuture<GetClientTlsPolicyResult> getClientTlsPolicy(GetClientTlsPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getClientTlsPolicy", TypeShape.of(GetClientTlsPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetClientTlsPolicyIamPolicyResult> getClientTlsPolicyIamPolicy(GetClientTlsPolicyIamPolicyArgs args) {
        return getClientTlsPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetClientTlsPolicyIamPolicyResult> getClientTlsPolicyIamPolicy(GetClientTlsPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getClientTlsPolicyIamPolicy", TypeShape.of(GetClientTlsPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single ServerTlsPolicy.
     * 
     */
    public static CompletableFuture<GetServerTlsPolicyResult> getServerTlsPolicy(GetServerTlsPolicyArgs args) {
        return getServerTlsPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single ServerTlsPolicy.
     * 
     */
    public static CompletableFuture<GetServerTlsPolicyResult> getServerTlsPolicy(GetServerTlsPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getServerTlsPolicy", TypeShape.of(GetServerTlsPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServerTlsPolicyIamPolicyResult> getServerTlsPolicyIamPolicy(GetServerTlsPolicyIamPolicyArgs args) {
        return getServerTlsPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServerTlsPolicyIamPolicyResult> getServerTlsPolicyIamPolicy(GetServerTlsPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networksecurity/v1beta1:getServerTlsPolicyIamPolicy", TypeShape.of(GetServerTlsPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
