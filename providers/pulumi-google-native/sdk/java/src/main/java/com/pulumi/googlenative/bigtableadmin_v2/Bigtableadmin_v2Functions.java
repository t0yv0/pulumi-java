// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigtableadmin_v2;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetAppProfileArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetBackupArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetClusterArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetInstanceArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetInstanceClusterBackupIamPolicyArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetInstanceIamPolicyArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetInstanceTableIamPolicyArgs;
import com.pulumi.googlenative.bigtableadmin_v2.inputs.GetTableArgs;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetAppProfileResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetBackupResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetClusterResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetInstanceClusterBackupIamPolicyResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetInstanceIamPolicyResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetInstanceResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetInstanceTableIamPolicyResult;
import com.pulumi.googlenative.bigtableadmin_v2.outputs.GetTableResult;
import java.util.concurrent.CompletableFuture;

public final class Bigtableadmin_v2Functions {
    /**
     * Gets information about an app profile.
     * 
     */
    public static CompletableFuture<GetAppProfileResult> getAppProfile(GetAppProfileArgs args) {
        return getAppProfile(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about an app profile.
     * 
     */
    public static CompletableFuture<GetAppProfileResult> getAppProfile(GetAppProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getAppProfile", TypeShape.of(GetAppProfileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets metadata on a pending or completed Cloud Bigtable Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackup(GetBackupArgs args) {
        return getBackup(args, InvokeOptions.Empty);
    }
    /**
     * Gets metadata on a pending or completed Cloud Bigtable Backup.
     * 
     */
    public static CompletableFuture<GetBackupResult> getBackup(GetBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getBackup", TypeShape.of(GetBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about an instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about an instance.
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceClusterBackupIamPolicyResult> getInstanceClusterBackupIamPolicy(GetInstanceClusterBackupIamPolicyArgs args) {
        return getInstanceClusterBackupIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceClusterBackupIamPolicyResult> getInstanceClusterBackupIamPolicy(GetInstanceClusterBackupIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getInstanceClusterBackupIamPolicy", TypeShape.of(GetInstanceClusterBackupIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for an instance resource. Returns an empty policy if an instance exists but does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> getInstanceIamPolicy(GetInstanceIamPolicyArgs args) {
        return getInstanceIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for an instance resource. Returns an empty policy if an instance exists but does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceIamPolicyResult> getInstanceIamPolicy(GetInstanceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getInstanceIamPolicy", TypeShape.of(GetInstanceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceTableIamPolicyResult> getInstanceTableIamPolicy(GetInstanceTableIamPolicyArgs args) {
        return getInstanceTableIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a Table resource. Returns an empty policy if the resource exists but does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInstanceTableIamPolicyResult> getInstanceTableIamPolicy(GetInstanceTableIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getInstanceTableIamPolicy", TypeShape.of(GetInstanceTableIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets metadata information about the specified table.
     * 
     */
    public static CompletableFuture<GetTableResult> getTable(GetTableArgs args) {
        return getTable(args, InvokeOptions.Empty);
    }
    /**
     * Gets metadata information about the specified table.
     * 
     */
    public static CompletableFuture<GetTableResult> getTable(GetTableArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigtableadmin/v2:getTable", TypeShape.of(GetTableResult.class), args, Utilities.withVersion(options));
    }
}
