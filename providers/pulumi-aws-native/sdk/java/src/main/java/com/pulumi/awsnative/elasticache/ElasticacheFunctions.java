// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.elasticache.inputs.GetGlobalReplicationGroupArgs;
import com.pulumi.awsnative.elasticache.inputs.GetUserArgs;
import com.pulumi.awsnative.elasticache.inputs.GetUserGroupArgs;
import com.pulumi.awsnative.elasticache.outputs.GetGlobalReplicationGroupResult;
import com.pulumi.awsnative.elasticache.outputs.GetUserGroupResult;
import com.pulumi.awsnative.elasticache.outputs.GetUserResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ElasticacheFunctions {
    /**
     * The AWS::ElastiCache::GlobalReplicationGroup resource creates an Amazon ElastiCache Global Replication Group.
     * 
     */
    public static CompletableFuture<GetGlobalReplicationGroupResult> getGlobalReplicationGroup(GetGlobalReplicationGroupArgs args) {
        return getGlobalReplicationGroup(args, InvokeOptions.Empty);
    }
    /**
     * The AWS::ElastiCache::GlobalReplicationGroup resource creates an Amazon ElastiCache Global Replication Group.
     * 
     */
    public static CompletableFuture<GetGlobalReplicationGroupResult> getGlobalReplicationGroup(GetGlobalReplicationGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticache:getGlobalReplicationGroup", TypeShape.of(GetGlobalReplicationGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::ElastiCache::User
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::ElastiCache::User
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticache:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::ElastiCache::UserGroup
     * 
     */
    public static CompletableFuture<GetUserGroupResult> getUserGroup(GetUserGroupArgs args) {
        return getUserGroup(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::ElastiCache::UserGroup
     * 
     */
    public static CompletableFuture<GetUserGroupResult> getUserGroup(GetUserGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:elasticache:getUserGroup", TypeShape.of(GetUserGroupResult.class), args, Utilities.withVersion(options));
    }
}
