// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.media.AssetFilterArgs;
import com.pulumi.azurenative.media.outputs.FilterTrackSelectionResponse;
import com.pulumi.azurenative.media.outputs.FirstQualityResponse;
import com.pulumi.azurenative.media.outputs.PresentationTimeRangeResponse;
import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Asset Filter.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * ### Create an Asset Filter
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
 *         var assetFilter = new AssetFilter(&#34;assetFilter&#34;, AssetFilterArgs.builder()        
 *             .accountName(&#34;contosomedia&#34;)
 *             .assetName(&#34;ClimbingMountRainer&#34;)
 *             .filterName(&#34;newAssetFilter&#34;)
 *             .firstQuality(Map.of(&#34;bitrate&#34;, 128000))
 *             .presentationTimeRange(Map.ofEntries(
 *                 Map.entry(&#34;endTimestamp&#34;, 170000000),
 *                 Map.entry(&#34;forceEndTimestamp&#34;, false),
 *                 Map.entry(&#34;liveBackoffDuration&#34;, 0),
 *                 Map.entry(&#34;presentationWindowDuration&#34;, 9223372036854774784),
 *                 Map.entry(&#34;startTimestamp&#34;, 0),
 *                 Map.entry(&#34;timescale&#34;, 10000000)
 *             ))
 *             .resourceGroupName(&#34;contoso&#34;)
 *             .tracks(            
 *                 Map.of(&#34;trackSelections&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;operation&#34;, &#34;Equal&#34;),
 *                         Map.entry(&#34;property&#34;, &#34;Type&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;Audio&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;operation&#34;, &#34;NotEqual&#34;),
 *                         Map.entry(&#34;property&#34;, &#34;Language&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;en&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;operation&#34;, &#34;NotEqual&#34;),
 *                         Map.entry(&#34;property&#34;, &#34;FourCC&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;EC-3&#34;)
 *                     )),
 *                 Map.of(&#34;trackSelections&#34;,                 
 *                     Map.ofEntries(
 *                         Map.entry(&#34;operation&#34;, &#34;Equal&#34;),
 *                         Map.entry(&#34;property&#34;, &#34;Type&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;Video&#34;)
 *                     ),
 *                     Map.ofEntries(
 *                         Map.entry(&#34;operation&#34;, &#34;Equal&#34;),
 *                         Map.entry(&#34;property&#34;, &#34;Bitrate&#34;),
 *                         Map.entry(&#34;value&#34;, &#34;3000000-5000000&#34;)
 *                     )))
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
 * $ pulumi import azure-native:media:AssetFilter newAssetFilter /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso/providers/Microsoft.Media/mediaservices/contosomedia/assets/ClimbingMountRainer/assetFilters/newAssetFilter 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:AssetFilter")
public class AssetFilter extends com.pulumi.resources.CustomResource {
    /**
     * The first quality.
     * 
     */
    @Export(name="firstQuality", type=FirstQualityResponse.class, parameters={})
    private Output</* @Nullable */ FirstQualityResponse> firstQuality;

    /**
     * @return The first quality.
     * 
     */
    public Output<Optional<FirstQualityResponse>> firstQuality() {
        return Codegen.optional(this.firstQuality);
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
     * The presentation time range.
     * 
     */
    @Export(name="presentationTimeRange", type=PresentationTimeRangeResponse.class, parameters={})
    private Output</* @Nullable */ PresentationTimeRangeResponse> presentationTimeRange;

    /**
     * @return The presentation time range.
     * 
     */
    public Output<Optional<PresentationTimeRangeResponse>> presentationTimeRange() {
        return Codegen.optional(this.presentationTimeRange);
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The tracks selection conditions.
     * 
     */
    @Export(name="tracks", type=List.class, parameters={FilterTrackSelectionResponse.class})
    private Output</* @Nullable */ List<FilterTrackSelectionResponse>> tracks;

    /**
     * @return The tracks selection conditions.
     * 
     */
    public Output<Optional<List<FilterTrackSelectionResponse>>> tracks() {
        return Codegen.optional(this.tracks);
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
    public AssetFilter(String name) {
        this(name, AssetFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AssetFilter(String name, AssetFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AssetFilter(String name, AssetFilterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:AssetFilter", name, args == null ? AssetFilterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AssetFilter(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:AssetFilter", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20180701:AssetFilter").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200501:AssetFilter").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:AssetFilter").build()),
                Output.of(Alias.builder().type("azure-native:media/v20211101:AssetFilter").build())
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
    public static AssetFilter get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AssetFilter(name, id, options);
    }
}
