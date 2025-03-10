// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.cloudfront.inputs.GetCachePolicyArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetCloudFrontOriginAccessIdentityArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetDistributionArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetFunctionArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetKeyGroupArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetOriginRequestPolicyArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetPublicKeyArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetRealtimeLogConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.GetResponseHeadersPolicyArgs;
import com.pulumi.awsnative.cloudfront.outputs.GetCachePolicyResult;
import com.pulumi.awsnative.cloudfront.outputs.GetCloudFrontOriginAccessIdentityResult;
import com.pulumi.awsnative.cloudfront.outputs.GetDistributionResult;
import com.pulumi.awsnative.cloudfront.outputs.GetFunctionResult;
import com.pulumi.awsnative.cloudfront.outputs.GetKeyGroupResult;
import com.pulumi.awsnative.cloudfront.outputs.GetOriginRequestPolicyResult;
import com.pulumi.awsnative.cloudfront.outputs.GetPublicKeyResult;
import com.pulumi.awsnative.cloudfront.outputs.GetRealtimeLogConfigResult;
import com.pulumi.awsnative.cloudfront.outputs.GetResponseHeadersPolicyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CloudfrontFunctions {
    /**
     * Resource Type definition for AWS::CloudFront::CachePolicy
     * 
     */
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy(GetCachePolicyArgs args) {
        return getCachePolicy(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::CachePolicy
     * 
     */
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy(GetCachePolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getCachePolicy", TypeShape.of(GetCachePolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::CloudFrontOriginAccessIdentity
     * 
     */
    public static CompletableFuture<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityArgs args) {
        return getCloudFrontOriginAccessIdentity(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::CloudFrontOriginAccessIdentity
     * 
     */
    public static CompletableFuture<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getCloudFrontOriginAccessIdentity", TypeShape.of(GetCloudFrontOriginAccessIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::Distribution
     * 
     */
    public static CompletableFuture<GetDistributionResult> getDistribution(GetDistributionArgs args) {
        return getDistribution(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::Distribution
     * 
     */
    public static CompletableFuture<GetDistributionResult> getDistribution(GetDistributionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getDistribution", TypeShape.of(GetDistributionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::Function
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args) {
        return getFunction(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::Function
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::KeyGroup
     * 
     */
    public static CompletableFuture<GetKeyGroupResult> getKeyGroup(GetKeyGroupArgs args) {
        return getKeyGroup(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::KeyGroup
     * 
     */
    public static CompletableFuture<GetKeyGroupResult> getKeyGroup(GetKeyGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getKeyGroup", TypeShape.of(GetKeyGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::OriginRequestPolicy
     * 
     */
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy(GetOriginRequestPolicyArgs args) {
        return getOriginRequestPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::OriginRequestPolicy
     * 
     */
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy(GetOriginRequestPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getOriginRequestPolicy", TypeShape.of(GetOriginRequestPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::PublicKey
     * 
     */
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args) {
        return getPublicKey(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::PublicKey
     * 
     */
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getPublicKey", TypeShape.of(GetPublicKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::RealtimeLogConfig
     * 
     */
    public static CompletableFuture<GetRealtimeLogConfigResult> getRealtimeLogConfig(GetRealtimeLogConfigArgs args) {
        return getRealtimeLogConfig(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::RealtimeLogConfig
     * 
     */
    public static CompletableFuture<GetRealtimeLogConfigResult> getRealtimeLogConfig(GetRealtimeLogConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getRealtimeLogConfig", TypeShape.of(GetRealtimeLogConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::CloudFront::ResponseHeadersPolicy
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy(GetResponseHeadersPolicyArgs args) {
        return getResponseHeadersPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::CloudFront::ResponseHeadersPolicy
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy(GetResponseHeadersPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:cloudfront:getResponseHeadersPolicy", TypeShape.of(GetResponseHeadersPolicyResult.class), args, Utilities.withVersion(options));
    }
}
