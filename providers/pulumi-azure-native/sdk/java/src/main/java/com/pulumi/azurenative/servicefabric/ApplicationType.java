// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicefabric.ApplicationTypeArgs;
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
 * The application type name resource
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * ### Put an application type
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
 *         var applicationType = new ApplicationType(&#34;applicationType&#34;, ApplicationTypeArgs.builder()        
 *             .applicationTypeName(&#34;myAppType&#34;)
 *             .clusterName(&#34;myCluster&#34;)
 *             .resourceGroupName(&#34;resRg&#34;)
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
 * $ pulumi import azure-native:servicefabric:ApplicationType myCluster /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resRg/providers/Microsoft.ServiceFabric/clusters/myCluster/applicationTypes/myAppType 
 * ```
 * 
 */
@ResourceType(type="azure-native:servicefabric:ApplicationType")
public class ApplicationType extends com.pulumi.resources.CustomResource {
    /**
     * Azure resource etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Azure resource etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return It will be deprecated in New API, resource location depends on the parent resource.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Azure resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Azure resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Azure resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Azure resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationType(String name) {
        this(name, ApplicationTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationType(String name, ApplicationTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationType(String name, ApplicationTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:ApplicationType", name, args == null ? ApplicationTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationType(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicefabric:ApplicationType", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:servicefabric/v20170701preview:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20190301:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20190301preview:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20190601preview:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20191101preview:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20200301:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20201201preview:ApplicationType").build()),
                Output.of(Alias.builder().type("azure-native:servicefabric/v20210601:ApplicationType").build())
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
    public static ApplicationType get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationType(name, id, options);
    }
}
