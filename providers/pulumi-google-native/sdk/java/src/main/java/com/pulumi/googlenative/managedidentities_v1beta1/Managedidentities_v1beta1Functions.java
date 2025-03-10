// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.managedidentities_v1beta1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.managedidentities_v1beta1.inputs.GetBackupArgs;
import com.pulumi.googlenative.managedidentities_v1beta1.inputs.GetDomainArgs;
import com.pulumi.googlenative.managedidentities_v1beta1.inputs.GetDomainBackupIamPolicyArgs;
import com.pulumi.googlenative.managedidentities_v1beta1.inputs.GetDomainIamPolicyArgs;
import com.pulumi.googlenative.managedidentities_v1beta1.inputs.GetPeeringArgs;
import com.pulumi.googlenative.managedidentities_v1beta1.inputs.GetPeeringIamPolicyArgs;
import com.pulumi.googlenative.managedidentities_v1beta1.outputs.GetBackupResult;
import com.pulumi.googlenative.managedidentities_v1beta1.outputs.GetDomainBackupIamPolicyResult;
import com.pulumi.googlenative.managedidentities_v1beta1.outputs.GetDomainIamPolicyResult;
import com.pulumi.googlenative.managedidentities_v1beta1.outputs.GetDomainResult;
import com.pulumi.googlenative.managedidentities_v1beta1.outputs.GetPeeringIamPolicyResult;
import com.pulumi.googlenative.managedidentities_v1beta1.outputs.GetPeeringResult;
import java.util.concurrent.CompletableFuture;

public final class Managedidentities_v1beta1Functions {
    /**
     * Gets details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a domain.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a domain.
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicy(GetDomainBackupIamPolicyArgs args) {
        return getDomainBackupIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainBackupIamPolicyResult> getDomainBackupIamPolicy(GetDomainBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getDomainBackupIamPolicy", TypeShape.of(GetDomainBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> getDomainIamPolicy(GetDomainIamPolicyArgs args) {
        return getDomainIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetDomainIamPolicyResult> getDomainIamPolicy(GetDomainIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getDomainIamPolicy", TypeShape.of(GetDomainIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static CompletableFuture<GetPeeringResult> getPeering(GetPeeringArgs args) {
        return getPeering(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Peering.
     * 
     */
    public static CompletableFuture<GetPeeringResult> getPeering(GetPeeringArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getPeering", TypeShape.of(GetPeeringResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPeeringIamPolicyResult> getPeeringIamPolicy(GetPeeringIamPolicyArgs args) {
        return getPeeringIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetPeeringIamPolicyResult> getPeeringIamPolicy(GetPeeringIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:managedidentities/v1beta1:getPeeringIamPolicy", TypeShape.of(GetPeeringIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
