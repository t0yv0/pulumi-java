// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.videoanalyzer.LivePipelineArgs;
import com.pulumi.azurenative.videoanalyzer.outputs.ParameterDefinitionResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Live pipeline represents a unique instance of a live topology, used for real-time ingestion, archiving and publishing of content for a unique RTSP camera.
 * API Version: 2021-11-01-preview.
 * 
 * ## Example Usage
 * ### Create or update a live pipeline
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var livePipeline = new LivePipeline(&#34;livePipeline&#34;, LivePipelineArgs.builder()        
 *             .accountName(&#34;testaccount2&#34;)
 *             .bitrateKbps(500)
 *             .description(&#34;Live Pipeline 1 Description&#34;)
 *             .livePipelineName(&#34;livePipeline1&#34;)
 *             .parameters(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;rtspUrlParameter&#34;),
 *                 Map.entry(&#34;value&#34;, &#34;rtsp://contoso.com/stream&#34;)
 *             ))
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .topologyName(&#34;pipelinetopology1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:videoanalyzer:LivePipeline livePipeline1 /subscriptions/591e76c3-3e97-44db-879c-3e2b12961b62/resourceGroups/testrg/providers/Microsoft.Media/videoAnalyzers/testaccount2/livePipelines/livePipeline1 
 * ```
 * 
 */
@ResourceType(type="azure-native:videoanalyzer:LivePipeline")
public class LivePipeline extends com.pulumi.resources.CustomResource {
    /**
     * Maximum bitrate capacity in Kbps reserved for the live pipeline. The allowed range is from 500 to 3000 Kbps in increments of 100 Kbps. If the RTSP camera exceeds this capacity, then the service will disconnect temporarily from the camera. It will retry to re-establish connection (with exponential backoff), checking to see if the camera bitrate is now below the reserved capacity. Doing so will ensure that one &#39;noisy neighbor&#39; does not affect other live pipelines in your account.
     * 
     */
    @Export(name="bitrateKbps", type=Integer.class, parameters={})
    private Output<Integer> bitrateKbps;

    /**
     * @return Maximum bitrate capacity in Kbps reserved for the live pipeline. The allowed range is from 500 to 3000 Kbps in increments of 100 Kbps. If the RTSP camera exceeds this capacity, then the service will disconnect temporarily from the camera. It will retry to re-establish connection (with exponential backoff), checking to see if the camera bitrate is now below the reserved capacity. Doing so will ensure that one &#39;noisy neighbor&#39; does not affect other live pipelines in your account.
     * 
     */
    public Output<Integer> bitrateKbps() {
        return this.bitrateKbps;
    }
    /**
     * An optional description for the pipeline.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for the pipeline.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    @Export(name="parameters", type=List.class, parameters={ParameterDefinitionResponse.class})
    private Output</* @Nullable */ List<ParameterDefinitionResponse>> parameters;

    /**
     * @return List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    public Output<Optional<List<ParameterDefinitionResponse>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * Current state of the pipeline (read-only).
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Current state of the pipeline (read-only).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The reference to an existing pipeline topology defined for real-time content processing. When activated, this live pipeline will process content according to the pipeline topology definition.
     * 
     */
    @Export(name="topologyName", type=String.class, parameters={})
    private Output<String> topologyName;

    /**
     * @return The reference to an existing pipeline topology defined for real-time content processing. When activated, this live pipeline will process content according to the pipeline topology definition.
     * 
     */
    public Output<String> topologyName() {
        return this.topologyName;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LivePipeline(String name) {
        this(name, LivePipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LivePipeline(String name, LivePipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LivePipeline(String name, LivePipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:LivePipeline", name, args == null ? LivePipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LivePipeline(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:videoanalyzer:LivePipeline", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:videoanalyzer/v20211101preview:LivePipeline").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LivePipeline get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LivePipeline(name, id, options);
    }
}
