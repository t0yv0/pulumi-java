// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.certificatemanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.certificatemanager.inputs.GetAccountArgs;
import com.pulumi.awsnative.certificatemanager.outputs.GetAccountResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CertificatemanagerFunctions {
    /**
     * Resource schema for AWS::CertificateManager::Account.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::CertificateManager::Account.
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:certificatemanager:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
}
