// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventhub.ClusterArgs;
import com.pulumi.azurenative.eventhub.outputs.ClusterSkuResponse;
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
 * Single Event Hubs Cluster resource in List or Get operations.
 * API Version: 2018-01-01-preview.
 * 
 * ## Example Usage
 * ### ClusterPut
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
 *         var cluster = new Cluster(&#34;cluster&#34;, ClusterArgs.builder()        
 *             .clusterName(&#34;testCluster&#34;)
 *             .location(&#34;South Central US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;capacity&#34;, 1),
 *                 Map.entry(&#34;name&#34;, &#34;Dedicated&#34;)
 *             ))
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;tag1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;tag2&#34;, &#34;value2&#34;)
 *             ))
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
 * $ pulumi import azure-native:eventhub:Cluster testCluster /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/myResourceGroup/providers/Microsoft.EventHub/clusters/testCluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The UTC time when the Event Hubs Cluster was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The UTC time when the Event Hubs Cluster was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The metric ID of the cluster resource. Provided by the service and not modifiable by the user.
     * 
     */
    @Export(name="metricId", type=String.class, parameters={})
    private Output<String> metricId;

    /**
     * @return The metric ID of the cluster resource. Provided by the service and not modifiable by the user.
     * 
     */
    public Output<String> metricId() {
        return this.metricId;
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
     * Properties of the cluster SKU.
     * 
     */
    @Export(name="sku", type=ClusterSkuResponse.class, parameters={})
    private Output</* @Nullable */ ClusterSkuResponse> sku;

    /**
     * @return Properties of the cluster SKU.
     * 
     */
    public Output<Optional<ClusterSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Status of the Cluster resource
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the Cluster resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
     * The UTC time when the Event Hubs Cluster was last updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The UTC time when the Event Hubs Cluster was last updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210601preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20211101:Cluster").build())
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
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
