// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.features;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.features.inputs.GetSubscriptionFeatureRegistrationArgs;
import com.pulumi.azurenative.features.outputs.GetSubscriptionFeatureRegistrationResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class FeaturesFunctions {
    /**
     * Subscription feature registration details
     * API Version: 2021-07-01.
     * 
     */
    public static CompletableFuture<GetSubscriptionFeatureRegistrationResult> getSubscriptionFeatureRegistration(GetSubscriptionFeatureRegistrationArgs args) {
        return getSubscriptionFeatureRegistration(args, InvokeOptions.Empty);
    }
    /**
     * Subscription feature registration details
     * API Version: 2021-07-01.
     * 
     */
    public static CompletableFuture<GetSubscriptionFeatureRegistrationResult> getSubscriptionFeatureRegistration(GetSubscriptionFeatureRegistrationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:features:getSubscriptionFeatureRegistration", TypeShape.of(GetSubscriptionFeatureRegistrationResult.class), args, Utilities.withVersion(options));
    }
}
