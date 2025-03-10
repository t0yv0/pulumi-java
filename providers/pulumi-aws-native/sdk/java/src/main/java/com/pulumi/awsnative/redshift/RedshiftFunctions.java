// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.redshift.inputs.GetClusterArgs;
import com.pulumi.awsnative.redshift.inputs.GetEndpointAccessArgs;
import com.pulumi.awsnative.redshift.inputs.GetEndpointAuthorizationArgs;
import com.pulumi.awsnative.redshift.inputs.GetEventSubscriptionArgs;
import com.pulumi.awsnative.redshift.inputs.GetScheduledActionArgs;
import com.pulumi.awsnative.redshift.outputs.GetClusterResult;
import com.pulumi.awsnative.redshift.outputs.GetEndpointAccessResult;
import com.pulumi.awsnative.redshift.outputs.GetEndpointAuthorizationResult;
import com.pulumi.awsnative.redshift.outputs.GetEventSubscriptionResult;
import com.pulumi.awsnative.redshift.outputs.GetScheduledActionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class RedshiftFunctions {
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * An example resource schema demonstrating some basic constructs and validation rules.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource schema for a Redshift-managed VPC endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointAccessResult> getEndpointAccess(GetEndpointAccessArgs args) {
        return getEndpointAccess(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for a Redshift-managed VPC endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointAccessResult> getEndpointAccess(GetEndpointAccessArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getEndpointAccess", TypeShape.of(GetEndpointAccessResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a cluster across AWS accounts.
     * 
     */
    public static CompletableFuture<GetEndpointAuthorizationResult> getEndpointAuthorization(GetEndpointAuthorizationArgs args) {
        return getEndpointAuthorization(args, InvokeOptions.Empty);
    }
    /**
     * Describes an endpoint authorization for authorizing Redshift-managed VPC endpoint access to a cluster across AWS accounts.
     * 
     */
    public static CompletableFuture<GetEndpointAuthorizationResult> getEndpointAuthorization(GetEndpointAuthorizationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getEndpointAuthorization", TypeShape.of(GetEndpointAuthorizationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The `AWS::Redshift::EventSubscription` resource creates an Amazon Redshift Event Subscription.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> getEventSubscription(GetEventSubscriptionArgs args) {
        return getEventSubscription(args, InvokeOptions.Empty);
    }
    /**
     * The `AWS::Redshift::EventSubscription` resource creates an Amazon Redshift Event Subscription.
     * 
     */
    public static CompletableFuture<GetEventSubscriptionResult> getEventSubscription(GetEventSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getEventSubscription", TypeShape.of(GetEventSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The `AWS::Redshift::ScheduledAction` resource creates an Amazon Redshift Scheduled Action.
     * 
     */
    public static CompletableFuture<GetScheduledActionResult> getScheduledAction(GetScheduledActionArgs args) {
        return getScheduledAction(args, InvokeOptions.Empty);
    }
    /**
     * The `AWS::Redshift::ScheduledAction` resource creates an Amazon Redshift Scheduled Action.
     * 
     */
    public static CompletableFuture<GetScheduledActionResult> getScheduledAction(GetScheduledActionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:redshift:getScheduledAction", TypeShape.of(GetScheduledActionResult.class), args, Utilities.withVersion(options));
    }
}
