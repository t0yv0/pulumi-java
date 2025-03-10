// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.machinelearningservices.MachineLearningDatasetArgs;
import com.pulumi.azurenative.machinelearningservices.outputs.DatasetResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Machine Learning dataset object wrapped into ARM resource envelope.
 * API Version: 2020-05-01-preview.
 * 
 * ## Example Usage
 * ### Create Dataset
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
 *         var machineLearningDataset = new MachineLearningDataset(&#34;machineLearningDataset&#34;, MachineLearningDatasetArgs.builder()        
 *             .datasetName(&#34;datasetName123&#34;)
 *             .datasetType(&#34;file&#34;)
 *             .parameters(Map.of(&#34;path&#34;, Map.of(&#34;dataPath&#34;, Map.ofEntries(
 *                 Map.entry(&#34;datastoreName&#34;, &#34;testblobfromarm&#34;),
 *                 Map.entry(&#34;relativePath&#34;, &#34;UI/03-26-2020_083359_UTC/latin1encoding.csv&#34;)
 *             ))))
 *             .registration(Map.ofEntries(
 *                 Map.entry(&#34;description&#34;, &#34;test description&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;datasetName123&#34;)
 *             ))
 *             .resourceGroupName(&#34;acjain-mleastUS2&#34;)
 *             .skipValidation(false)
 *             .workspaceName(&#34;acjain-mleastUS2&#34;)
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
 * $ pulumi import azure-native:machinelearningservices:MachineLearningDataset datasetName123 /subscriptions/35f16a99-532a-4a47-9e93-00305f6c40f2/resourceGroups/acjain-mleastUS2/providers/Microsoft.MachineLearningServices/workspaces/acjain-mleastUS2/datasets/datasetName123 
 * ```
 * 
 */
@ResourceType(type="azure-native:machinelearningservices:MachineLearningDataset")
public class MachineLearningDataset extends com.pulumi.resources.CustomResource {
    /**
     * The identity of the resource.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output<Optional<IdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Specifies the location of the resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Dataset properties
     * 
     */
    @Export(name="properties", type=DatasetResponse.class, parameters={})
    private Output<DatasetResponse> properties;

    /**
     * @return Dataset properties
     * 
     */
    public Output<DatasetResponse> properties() {
        return this.properties;
    }
    /**
     * The sku of the workspace.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The sku of the workspace.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Contains resource tags defined as key/value pairs.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Specifies the type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineLearningDataset(String name) {
        this(name, MachineLearningDatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineLearningDataset(String name, MachineLearningDatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineLearningDataset(String name, MachineLearningDatasetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningDataset", name, args == null ? MachineLearningDatasetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MachineLearningDataset(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:machinelearningservices:MachineLearningDataset", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:machinelearningservices/v20200501preview:MachineLearningDataset").build())
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
    public static MachineLearningDataset get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MachineLearningDataset(name, id, options);
    }
}
