// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.media.inputs.GetAccountFilterArgs;
import com.pulumi.azurenative.media.inputs.GetAssetArgs;
import com.pulumi.azurenative.media.inputs.GetAssetEncryptionKeyArgs;
import com.pulumi.azurenative.media.inputs.GetAssetFilterArgs;
import com.pulumi.azurenative.media.inputs.GetContentKeyPolicyArgs;
import com.pulumi.azurenative.media.inputs.GetContentKeyPolicyPropertiesWithSecretsArgs;
import com.pulumi.azurenative.media.inputs.GetJobArgs;
import com.pulumi.azurenative.media.inputs.GetLiveEventArgs;
import com.pulumi.azurenative.media.inputs.GetLiveOutputArgs;
import com.pulumi.azurenative.media.inputs.GetMediaGraphArgs;
import com.pulumi.azurenative.media.inputs.GetMediaServiceArgs;
import com.pulumi.azurenative.media.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.media.inputs.GetStreamingEndpointArgs;
import com.pulumi.azurenative.media.inputs.GetStreamingLocatorArgs;
import com.pulumi.azurenative.media.inputs.GetStreamingPolicyArgs;
import com.pulumi.azurenative.media.inputs.GetTrackArgs;
import com.pulumi.azurenative.media.inputs.GetTransformArgs;
import com.pulumi.azurenative.media.inputs.ListAssetContainerSasArgs;
import com.pulumi.azurenative.media.inputs.ListAssetStreamingLocatorsArgs;
import com.pulumi.azurenative.media.inputs.ListMediaServiceEdgePoliciesArgs;
import com.pulumi.azurenative.media.inputs.ListMediaServiceKeysArgs;
import com.pulumi.azurenative.media.inputs.ListStreamingLocatorContentKeysArgs;
import com.pulumi.azurenative.media.inputs.ListStreamingLocatorPathsArgs;
import com.pulumi.azurenative.media.outputs.GetAccountFilterResult;
import com.pulumi.azurenative.media.outputs.GetAssetEncryptionKeyResult;
import com.pulumi.azurenative.media.outputs.GetAssetFilterResult;
import com.pulumi.azurenative.media.outputs.GetAssetResult;
import com.pulumi.azurenative.media.outputs.GetContentKeyPolicyPropertiesWithSecretsResult;
import com.pulumi.azurenative.media.outputs.GetContentKeyPolicyResult;
import com.pulumi.azurenative.media.outputs.GetJobResult;
import com.pulumi.azurenative.media.outputs.GetLiveEventResult;
import com.pulumi.azurenative.media.outputs.GetLiveOutputResult;
import com.pulumi.azurenative.media.outputs.GetMediaGraphResult;
import com.pulumi.azurenative.media.outputs.GetMediaServiceResult;
import com.pulumi.azurenative.media.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.media.outputs.GetStreamingEndpointResult;
import com.pulumi.azurenative.media.outputs.GetStreamingLocatorResult;
import com.pulumi.azurenative.media.outputs.GetStreamingPolicyResult;
import com.pulumi.azurenative.media.outputs.GetTrackResult;
import com.pulumi.azurenative.media.outputs.GetTransformResult;
import com.pulumi.azurenative.media.outputs.ListAssetContainerSasResult;
import com.pulumi.azurenative.media.outputs.ListAssetStreamingLocatorsResult;
import com.pulumi.azurenative.media.outputs.ListMediaServiceEdgePoliciesResult;
import com.pulumi.azurenative.media.outputs.ListMediaServiceKeysResult;
import com.pulumi.azurenative.media.outputs.ListStreamingLocatorContentKeysResult;
import com.pulumi.azurenative.media.outputs.ListStreamingLocatorPathsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MediaFunctions {
    /**
     * An Account Filter.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAccountFilterResult> getAccountFilter(GetAccountFilterArgs args) {
        return getAccountFilter(args, InvokeOptions.Empty);
    }
    /**
     * An Account Filter.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAccountFilterResult> getAccountFilter(GetAccountFilterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getAccountFilter", TypeShape.of(GetAccountFilterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Asset.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAssetResult> getAsset(GetAssetArgs args) {
        return getAsset(args, InvokeOptions.Empty);
    }
    /**
     * An Asset.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAssetResult> getAsset(GetAssetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getAsset", TypeShape.of(GetAssetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Data needed to decrypt asset files encrypted with legacy storage encryption.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAssetEncryptionKeyResult> getAssetEncryptionKey(GetAssetEncryptionKeyArgs args) {
        return getAssetEncryptionKey(args, InvokeOptions.Empty);
    }
    /**
     * Data needed to decrypt asset files encrypted with legacy storage encryption.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAssetEncryptionKeyResult> getAssetEncryptionKey(GetAssetEncryptionKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getAssetEncryptionKey", TypeShape.of(GetAssetEncryptionKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Asset Filter.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAssetFilterResult> getAssetFilter(GetAssetFilterArgs args) {
        return getAssetFilter(args, InvokeOptions.Empty);
    }
    /**
     * An Asset Filter.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetAssetFilterResult> getAssetFilter(GetAssetFilterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getAssetFilter", TypeShape.of(GetAssetFilterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Content Key Policy resource.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetContentKeyPolicyResult> getContentKeyPolicy(GetContentKeyPolicyArgs args) {
        return getContentKeyPolicy(args, InvokeOptions.Empty);
    }
    /**
     * A Content Key Policy resource.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetContentKeyPolicyResult> getContentKeyPolicy(GetContentKeyPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getContentKeyPolicy", TypeShape.of(GetContentKeyPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The properties of the Content Key Policy.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetContentKeyPolicyPropertiesWithSecretsResult> getContentKeyPolicyPropertiesWithSecrets(GetContentKeyPolicyPropertiesWithSecretsArgs args) {
        return getContentKeyPolicyPropertiesWithSecrets(args, InvokeOptions.Empty);
    }
    /**
     * The properties of the Content Key Policy.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetContentKeyPolicyPropertiesWithSecretsResult> getContentKeyPolicyPropertiesWithSecrets(GetContentKeyPolicyPropertiesWithSecretsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getContentKeyPolicyPropertiesWithSecrets", TypeShape.of(GetContentKeyPolicyPropertiesWithSecretsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args) {
        return getJob(args, InvokeOptions.Empty);
    }
    /**
     * A Job resource type. The progress and state can be obtained by polling a Job or subscribing to events using EventGrid.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetJobResult> getJob(GetJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getJob", TypeShape.of(GetJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The live event.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetLiveEventResult> getLiveEvent(GetLiveEventArgs args) {
        return getLiveEvent(args, InvokeOptions.Empty);
    }
    /**
     * The live event.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetLiveEventResult> getLiveEvent(GetLiveEventArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getLiveEvent", TypeShape.of(GetLiveEventResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Live Output.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetLiveOutputResult> getLiveOutput(GetLiveOutputArgs args) {
        return getLiveOutput(args, InvokeOptions.Empty);
    }
    /**
     * The Live Output.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetLiveOutputResult> getLiveOutput(GetLiveOutputArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getLiveOutput", TypeShape.of(GetLiveOutputResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Media Graph.
     * API Version: 2020-02-01-preview.
     * 
     */
    public static CompletableFuture<GetMediaGraphResult> getMediaGraph(GetMediaGraphArgs args) {
        return getMediaGraph(args, InvokeOptions.Empty);
    }
    /**
     * The Media Graph.
     * API Version: 2020-02-01-preview.
     * 
     */
    public static CompletableFuture<GetMediaGraphResult> getMediaGraph(GetMediaGraphArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getMediaGraph", TypeShape.of(GetMediaGraphResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Media Services account.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetMediaServiceResult> getMediaService(GetMediaServiceArgs args) {
        return getMediaService(args, InvokeOptions.Empty);
    }
    /**
     * A Media Services account.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetMediaServiceResult> getMediaService(GetMediaServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getMediaService", TypeShape.of(GetMediaServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The streaming endpoint.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetStreamingEndpointResult> getStreamingEndpoint(GetStreamingEndpointArgs args) {
        return getStreamingEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * The streaming endpoint.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetStreamingEndpointResult> getStreamingEndpoint(GetStreamingEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getStreamingEndpoint", TypeShape.of(GetStreamingEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Streaming Locator resource
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetStreamingLocatorResult> getStreamingLocator(GetStreamingLocatorArgs args) {
        return getStreamingLocator(args, InvokeOptions.Empty);
    }
    /**
     * A Streaming Locator resource
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetStreamingLocatorResult> getStreamingLocator(GetStreamingLocatorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getStreamingLocator", TypeShape.of(GetStreamingLocatorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Streaming Policy resource
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetStreamingPolicyResult> getStreamingPolicy(GetStreamingPolicyArgs args) {
        return getStreamingPolicy(args, InvokeOptions.Empty);
    }
    /**
     * A Streaming Policy resource
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetStreamingPolicyResult> getStreamingPolicy(GetStreamingPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getStreamingPolicy", TypeShape.of(GetStreamingPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An Asset Track resource.
     * API Version: 2021-11-01.
     * 
     */
    public static CompletableFuture<GetTrackResult> getTrack(GetTrackArgs args) {
        return getTrack(args, InvokeOptions.Empty);
    }
    /**
     * An Asset Track resource.
     * API Version: 2021-11-01.
     * 
     */
    public static CompletableFuture<GetTrackResult> getTrack(GetTrackArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getTrack", TypeShape.of(GetTrackResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Transform encapsulates the rules or instructions for generating desired outputs from input media, such as by transcoding or by extracting insights. After the Transform is created, it can be applied to input media by creating Jobs.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetTransformResult> getTransform(GetTransformArgs args) {
        return getTransform(args, InvokeOptions.Empty);
    }
    /**
     * A Transform encapsulates the rules or instructions for generating desired outputs from input media, such as by transcoding or by extracting insights. After the Transform is created, it can be applied to input media by creating Jobs.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<GetTransformResult> getTransform(GetTransformArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getTransform", TypeShape.of(GetTransformResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Asset Storage container SAS URLs.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListAssetContainerSasResult> listAssetContainerSas(ListAssetContainerSasArgs args) {
        return listAssetContainerSas(args, InvokeOptions.Empty);
    }
    /**
     * The Asset Storage container SAS URLs.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListAssetContainerSasResult> listAssetContainerSas(ListAssetContainerSasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listAssetContainerSas", TypeShape.of(ListAssetContainerSasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Streaming Locators associated with this Asset.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListAssetStreamingLocatorsResult> listAssetStreamingLocators(ListAssetStreamingLocatorsArgs args) {
        return listAssetStreamingLocators(args, InvokeOptions.Empty);
    }
    /**
     * The Streaming Locators associated with this Asset.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListAssetStreamingLocatorsResult> listAssetStreamingLocators(ListAssetStreamingLocatorsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listAssetStreamingLocators", TypeShape.of(ListAssetStreamingLocatorsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListMediaServiceEdgePoliciesResult> listMediaServiceEdgePolicies(ListMediaServiceEdgePoliciesArgs args) {
        return listMediaServiceEdgePolicies(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListMediaServiceEdgePoliciesResult> listMediaServiceEdgePolicies(ListMediaServiceEdgePoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listMediaServiceEdgePolicies", TypeShape.of(ListMediaServiceEdgePoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response body for a ListKeys API.
     * API Version: 2015-10-01.
     * 
     */
    public static CompletableFuture<ListMediaServiceKeysResult> listMediaServiceKeys(ListMediaServiceKeysArgs args) {
        return listMediaServiceKeys(args, InvokeOptions.Empty);
    }
    /**
     * The response body for a ListKeys API.
     * API Version: 2015-10-01.
     * 
     */
    public static CompletableFuture<ListMediaServiceKeysResult> listMediaServiceKeys(ListMediaServiceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listMediaServiceKeys", TypeShape.of(ListMediaServiceKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class of response for listContentKeys action
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListStreamingLocatorContentKeysResult> listStreamingLocatorContentKeys(ListStreamingLocatorContentKeysArgs args) {
        return listStreamingLocatorContentKeys(args, InvokeOptions.Empty);
    }
    /**
     * Class of response for listContentKeys action
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListStreamingLocatorContentKeysResult> listStreamingLocatorContentKeys(ListStreamingLocatorContentKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listStreamingLocatorContentKeys", TypeShape.of(ListStreamingLocatorContentKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class of response for listPaths action
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListStreamingLocatorPathsResult> listStreamingLocatorPaths(ListStreamingLocatorPathsArgs args) {
        return listStreamingLocatorPaths(args, InvokeOptions.Empty);
    }
    /**
     * Class of response for listPaths action
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListStreamingLocatorPathsResult> listStreamingLocatorPaths(ListStreamingLocatorPathsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listStreamingLocatorPaths", TypeShape.of(ListStreamingLocatorPathsResult.class), args, Utilities.withVersion(options));
    }
}
