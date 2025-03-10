// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mypkg;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.mypkg.Utilities;
import com.pulumi.mypkg.inputs.GetAmiIdsArgs;
import com.pulumi.mypkg.inputs.ListStorageAccountKeysArgs;
import com.pulumi.mypkg.outputs.GetAmiIdsResult;
import com.pulumi.mypkg.outputs.ListStorageAccountKeysResult;
import java.util.concurrent.CompletableFuture;

public final class MypkgFunctions {
    /**
     * Taken from pulumi-AWS to regress an issue
     * 
     * @deprecated
     * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
     * 
     */
    @Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args) {
        return getAmiIds(args, InvokeOptions.Empty);
    }
    /**
     * Taken from pulumi-AWS to regress an issue
     * 
     * @deprecated
     * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
     * 
     */
    @Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("mypkg::getAmiIds", TypeShape.of(GetAmiIdsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response from the ListKeys operation.
     * API Version: 2021-02-01.
     * 
     */
    public static CompletableFuture<ListStorageAccountKeysResult> listStorageAccountKeys(ListStorageAccountKeysArgs args) {
        return listStorageAccountKeys(args, InvokeOptions.Empty);
    }
    /**
     * The response from the ListKeys operation.
     * API Version: 2021-02-01.
     * 
     */
    public static CompletableFuture<ListStorageAccountKeysResult> listStorageAccountKeys(ListStorageAccountKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("mypkg::listStorageAccountKeys", TypeShape.of(ListStorageAccountKeysResult.class), args, Utilities.withVersion(options));
    }
}
