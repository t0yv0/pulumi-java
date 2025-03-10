// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.apimanagement.NamedValueArgs;
import com.pulumi.azure.apimanagement.inputs.NamedValueState;
import com.pulumi.azure.apimanagement.outputs.NamedValueValueFromKeyVault;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an API Management Named Value.
 * 
 * ## Example Usage
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .publisherName(&#34;pub1&#34;)
 *             .publisherEmail(&#34;pub1@email.com&#34;)
 *             .skuName(&#34;Developer_1&#34;)
 *             .build());
 * 
 *         var exampleNamedValue = new NamedValue(&#34;exampleNamedValue&#34;, NamedValueArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .apiManagementName(exampleService.getName())
 *             .displayName(&#34;ExampleProperty&#34;)
 *             .value(&#34;Example Value&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Management Properties can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:apimanagement/namedValue:NamedValue example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.ApiManagement/service/example-apim/namedValues/example-apimp
 * ```
 * 
 */
@ResourceType(type="azure:apimanagement/namedValue:NamedValue")
public class NamedValue extends com.pulumi.resources.CustomResource {
    /**
     * The name of the API Management Service in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="apiManagementName", type=String.class, parameters={})
    private Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> apiManagementName() {
        return this.apiManagementName;
    }
    /**
     * The display name of this API Management Named Value.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of this API Management Named Value.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The name of the API Management Named Value. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the API Management Named Value. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group in which the API Management Named Value should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Specifies whether the API Management Named Value is secret. Valid values are `true` or `false`. The default value is `false`.
     * 
     */
    @Export(name="secret", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> secret;

    /**
     * @return Specifies whether the API Management Named Value is secret. Valid values are `true` or `false`. The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> secret() {
        return Codegen.optional(this.secret);
    }
    /**
     * A list of tags to be applied to the API Management Named Value.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of tags to be applied to the API Management Named Value.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The value of this API Management Named Value.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return The value of this API Management Named Value.
     * 
     */
    public Output<Optional<String>> value() {
        return Codegen.optional(this.value);
    }
    /**
     * A `value_from_key_vault` block as defined below.
     * 
     */
    @Export(name="valueFromKeyVault", type=NamedValueValueFromKeyVault.class, parameters={})
    private Output</* @Nullable */ NamedValueValueFromKeyVault> valueFromKeyVault;

    /**
     * @return A `value_from_key_vault` block as defined below.
     * 
     */
    public Output<Optional<NamedValueValueFromKeyVault>> valueFromKeyVault() {
        return Codegen.optional(this.valueFromKeyVault);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamedValue(String name) {
        this(name, NamedValueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamedValue(String name, NamedValueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamedValue(String name, NamedValueArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/namedValue:NamedValue", name, args == null ? NamedValueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamedValue(String name, Output<String> id, @Nullable NamedValueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:apimanagement/namedValue:NamedValue", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NamedValue get(String name, Output<String> id, @Nullable NamedValueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamedValue(name, id, state, options);
    }
}
