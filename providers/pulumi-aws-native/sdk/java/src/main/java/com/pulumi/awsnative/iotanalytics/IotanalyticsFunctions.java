// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotanalytics.inputs.GetChannelArgs;
import com.pulumi.awsnative.iotanalytics.inputs.GetDatasetArgs;
import com.pulumi.awsnative.iotanalytics.inputs.GetDatastoreArgs;
import com.pulumi.awsnative.iotanalytics.inputs.GetPipelineArgs;
import com.pulumi.awsnative.iotanalytics.outputs.GetChannelResult;
import com.pulumi.awsnative.iotanalytics.outputs.GetDatasetResult;
import com.pulumi.awsnative.iotanalytics.outputs.GetDatastoreResult;
import com.pulumi.awsnative.iotanalytics.outputs.GetPipelineResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IotanalyticsFunctions {
    /**
     * Resource Type definition for AWS::IoTAnalytics::Channel
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args) {
        return getChannel(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Channel
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotanalytics:getChannel", TypeShape.of(GetChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Dataset
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args) {
        return getDataset(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Dataset
     * 
     */
    public static CompletableFuture<GetDatasetResult> getDataset(GetDatasetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotanalytics:getDataset", TypeShape.of(GetDatasetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Datastore
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastore(GetDatastoreArgs args) {
        return getDatastore(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Datastore
     * 
     */
    public static CompletableFuture<GetDatastoreResult> getDatastore(GetDatastoreArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotanalytics:getDatastore", TypeShape.of(GetDatastoreResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Pipeline
     * 
     */
    public static CompletableFuture<GetPipelineResult> getPipeline(GetPipelineArgs args) {
        return getPipeline(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::IoTAnalytics::Pipeline
     * 
     */
    public static CompletableFuture<GetPipelineResult> getPipeline(GetPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotanalytics:getPipeline", TypeShape.of(GetPipelineResult.class), args, Utilities.withVersion(options));
    }
}
