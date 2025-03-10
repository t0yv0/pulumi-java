// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.chatbot;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.chatbot.inputs.GetSlackChannelConfigurationArgs;
import com.pulumi.awsnative.chatbot.outputs.GetSlackChannelConfigurationResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ChatbotFunctions {
    /**
     * Resource schema for AWS::Chatbot::SlackChannelConfiguration.
     * 
     */
    public static CompletableFuture<GetSlackChannelConfigurationResult> getSlackChannelConfiguration(GetSlackChannelConfigurationArgs args) {
        return getSlackChannelConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::Chatbot::SlackChannelConfiguration.
     * 
     */
    public static CompletableFuture<GetSlackChannelConfigurationResult> getSlackChannelConfiguration(GetSlackChannelConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:chatbot:getSlackChannelConfiguration", TypeShape.of(GetSlackChannelConfigurationResult.class), args, Utilities.withVersion(options));
    }
}
