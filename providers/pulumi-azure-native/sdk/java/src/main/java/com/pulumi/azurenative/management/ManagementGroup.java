// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.management;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.management.ManagementGroupArgs;
import com.pulumi.azurenative.management.outputs.ManagementGroupChildInfoResponse;
import com.pulumi.azurenative.management.outputs.ManagementGroupDetailsResponse;
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
 * The management group details.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * ### PutManagementGroup
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
 *         var managementGroup = new ManagementGroup(&#34;managementGroup&#34;, ManagementGroupArgs.builder()        
 *             .details(Map.of(&#34;parent&#34;, Map.of(&#34;id&#34;, &#34;/providers/Microsoft.Management/managementGroups/RootGroup&#34;)))
 *             .displayName(&#34;ChildGroup&#34;)
 *             .groupId(&#34;ChildGroup&#34;)
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
 * $ pulumi import azure-native:management:ManagementGroup ChildGroup /providers/Microsoft.Management/managementGroups/ChildGroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:management:ManagementGroup")
public class ManagementGroup extends com.pulumi.resources.CustomResource {
    /**
     * The list of children.
     * 
     */
    @Export(name="children", type=List.class, parameters={ManagementGroupChildInfoResponse.class})
    private Output</* @Nullable */ List<ManagementGroupChildInfoResponse>> children;

    /**
     * @return The list of children.
     * 
     */
    public Output<Optional<List<ManagementGroupChildInfoResponse>>> children() {
        return Codegen.optional(this.children);
    }
    /**
     * The details of a management group.
     * 
     */
    @Export(name="details", type=ManagementGroupDetailsResponse.class, parameters={})
    private Output</* @Nullable */ ManagementGroupDetailsResponse> details;

    /**
     * @return The details of a management group.
     * 
     */
    public Output<Optional<ManagementGroupDetailsResponse>> details() {
        return Codegen.optional(this.details);
    }
    /**
     * The friendly name of the management group.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The friendly name of the management group.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> tenantId;

    /**
     * @return The AAD Tenant ID associated with the management group. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public Output<Optional<String>> tenantId() {
        return Codegen.optional(this.tenantId);
    }
    /**
     * The type of the resource.  For example, Microsoft.Management/managementGroups
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.  For example, Microsoft.Management/managementGroups
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementGroup(String name) {
        this(name, ManagementGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementGroup(String name, @Nullable ManagementGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementGroup(String name, @Nullable ManagementGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:management:ManagementGroup", name, args == null ? ManagementGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:management:ManagementGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:management/v20171101preview:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20180101preview:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20180301preview:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20191101:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20200201:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20200501:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20201001:ManagementGroup").build()),
                Output.of(Alias.builder().type("azure-native:management/v20210401:ManagementGroup").build())
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
    public static ManagementGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementGroup(name, id, options);
    }
}
