// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.videoanalyzer.inputs.GetAccessPolicyArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetEdgeModuleArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetLivePipelineArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetPipelineJobArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetPipelineTopologyArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetVideoAnalyzerArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.GetVideoArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.ListEdgeModuleProvisioningTokenArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.ListVideoContentTokenArgs;
import com.pulumi.azurenative.videoanalyzer.inputs.ListVideoStreamingTokenArgs;
import com.pulumi.azurenative.videoanalyzer.outputs.GetAccessPolicyResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetEdgeModuleResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetLivePipelineResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetPipelineJobResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetPipelineTopologyResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetVideoAnalyzerResult;
import com.pulumi.azurenative.videoanalyzer.outputs.GetVideoResult;
import com.pulumi.azurenative.videoanalyzer.outputs.ListEdgeModuleProvisioningTokenResult;
import com.pulumi.azurenative.videoanalyzer.outputs.ListVideoContentTokenResult;
import com.pulumi.azurenative.videoanalyzer.outputs.ListVideoStreamingTokenResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class VideoanalyzerFunctions {
    /**
     * Policy that determines how a video can be accessed.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetAccessPolicyResult> getAccessPolicy(GetAccessPolicyArgs args) {
        return getAccessPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Policy that determines how a video can be accessed.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetAccessPolicyResult> getAccessPolicy(GetAccessPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getAccessPolicy", TypeShape.of(GetAccessPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The representation of an edge module.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetEdgeModuleResult> getEdgeModule(GetEdgeModuleArgs args) {
        return getEdgeModule(args, InvokeOptions.Empty);
    }
    /**
     * The representation of an edge module.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetEdgeModuleResult> getEdgeModule(GetEdgeModuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getEdgeModule", TypeShape.of(GetEdgeModuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving and publishing of content for a unique RTSP camera.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetLivePipelineResult> getLivePipeline(GetLivePipelineArgs args) {
        return getLivePipeline(args, InvokeOptions.Empty);
    }
    /**
     * Live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving and publishing of content for a unique RTSP camera.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetLivePipelineResult> getLivePipeline(GetLivePipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getLivePipeline", TypeShape.of(GetLivePipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Pipeline job represents a unique instance of a batch topology, used for offline processing of selected portions of archived content.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPipelineJobResult> getPipelineJob(GetPipelineJobArgs args) {
        return getPipelineJob(args, InvokeOptions.Empty);
    }
    /**
     * Pipeline job represents a unique instance of a batch topology, used for offline processing of selected portions of archived content.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPipelineJobResult> getPipelineJob(GetPipelineJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getPipelineJob", TypeShape.of(GetPipelineJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Pipeline topology describes the processing steps to be applied when processing content for a particular outcome. The topology should be defined according to the scenario to be achieved and can be reused across many pipeline instances which share the same processing characteristics. For instance, a pipeline topology which captures content from a RTSP camera and archives the content can be reused across many different cameras, as long as the same processing is to be applied across all the cameras. Individual instance properties can be defined through the use of user-defined parameters, which allow for a topology to be parameterized. This allows  individual pipelines refer to different values, such as individual cameras&#39; RTSP endpoints and credentials. Overall a topology is composed of the following:
     * 
     *   - Parameters: list of user defined parameters that can be references across the topology nodes.
     *   - Sources: list of one or more data sources nodes such as an RTSP source which allows for content to be ingested from cameras.
     *   - Processors: list of nodes which perform data analysis or transformations.
     *   - Sinks: list of one or more data sinks which allow for data to be stored or exported to other destinations.
     *     API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPipelineTopologyResult> getPipelineTopology(GetPipelineTopologyArgs args) {
        return getPipelineTopology(args, InvokeOptions.Empty);
    }
    /**
     * Pipeline topology describes the processing steps to be applied when processing content for a particular outcome. The topology should be defined according to the scenario to be achieved and can be reused across many pipeline instances which share the same processing characteristics. For instance, a pipeline topology which captures content from a RTSP camera and archives the content can be reused across many different cameras, as long as the same processing is to be applied across all the cameras. Individual instance properties can be defined through the use of user-defined parameters, which allow for a topology to be parameterized. This allows  individual pipelines refer to different values, such as individual cameras&#39; RTSP endpoints and credentials. Overall a topology is composed of the following:
     * 
     *   - Parameters: list of user defined parameters that can be references across the topology nodes.
     *   - Sources: list of one or more data sources nodes such as an RTSP source which allows for content to be ingested from cameras.
     *   - Processors: list of nodes which perform data analysis or transformations.
     *   - Sinks: list of one or more data sinks which allow for data to be stored or exported to other destinations.
     *     API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPipelineTopologyResult> getPipelineTopology(GetPipelineTopologyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getPipelineTopology", TypeShape.of(GetPipelineTopologyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * The Private Endpoint Connection resource.
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The representation of a single video in a Video Analyzer account.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetVideoResult> getVideo(GetVideoArgs args) {
        return getVideo(args, InvokeOptions.Empty);
    }
    /**
     * The representation of a single video in a Video Analyzer account.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetVideoResult> getVideo(GetVideoArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getVideo", TypeShape.of(GetVideoResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Video Analyzer account.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetVideoAnalyzerResult> getVideoAnalyzer(GetVideoAnalyzerArgs args) {
        return getVideoAnalyzer(args, InvokeOptions.Empty);
    }
    /**
     * A Video Analyzer account.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<GetVideoAnalyzerResult> getVideoAnalyzer(GetVideoAnalyzerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:getVideoAnalyzer", TypeShape.of(GetVideoAnalyzerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provisioning token properties. A provisioning token allows for a single instance of Azure Video analyzer IoT edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake, the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge module in case the module state lost or reset.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<ListEdgeModuleProvisioningTokenResult> listEdgeModuleProvisioningToken(ListEdgeModuleProvisioningTokenArgs args) {
        return listEdgeModuleProvisioningToken(args, InvokeOptions.Empty);
    }
    /**
     * Provisioning token properties. A provisioning token allows for a single instance of Azure Video analyzer IoT edge module to be initialized and authorized to the cloud account. The provisioning token itself is short lived and it is only used for the initial handshake between IoT edge module and the cloud. After the initial handshake, the IoT edge module will agree on a set of authentication keys which will be auto-rotated as long as the module is able to periodically connect to the cloud. A new provisioning token can be generated for the same IoT edge module in case the module state lost or reset.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<ListEdgeModuleProvisioningTokenResult> listEdgeModuleProvisioningToken(ListEdgeModuleProvisioningTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listEdgeModuleProvisioningToken", TypeShape.of(ListEdgeModuleProvisioningTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * &#34;Video content token grants access to the video content URLs.&#34;
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<ListVideoContentTokenResult> listVideoContentToken(ListVideoContentTokenArgs args) {
        return listVideoContentToken(args, InvokeOptions.Empty);
    }
    /**
     * &#34;Video content token grants access to the video content URLs.&#34;
     * API Version: 2021-11-01-preview.
     * 
     */
    public static CompletableFuture<ListVideoContentTokenResult> listVideoContentToken(ListVideoContentTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listVideoContentToken", TypeShape.of(ListVideoContentTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Video streaming token grants access to the video streaming URLs which can be used by an compatible HLS or DASH player.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<ListVideoStreamingTokenResult> listVideoStreamingToken(ListVideoStreamingTokenArgs args) {
        return listVideoStreamingToken(args, InvokeOptions.Empty);
    }
    /**
     * Video streaming token grants access to the video streaming URLs which can be used by an compatible HLS or DASH player.
     * API Version: 2021-05-01-preview.
     * 
     */
    public static CompletableFuture<ListVideoStreamingTokenResult> listVideoStreamingToken(ListVideoStreamingTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:videoanalyzer:listVideoStreamingToken", TypeShape.of(ListVideoStreamingTokenResult.class), args, Utilities.withVersion(options));
    }
}
