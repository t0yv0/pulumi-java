// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.maintenance;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.maintenance.ConfigurationArgs;
import com.pulumi.azure.maintenance.inputs.ConfigurationState;
import com.pulumi.azure.maintenance.outputs.ConfigurationWindow;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a maintenance configuration.
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
 *         var exampleConfiguration = new Configuration(&#34;exampleConfiguration&#34;, ConfigurationArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .scope(&#34;All&#34;)
 *             .tags(Map.of(&#34;Env&#34;, &#34;prod&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Maintenance Configuration can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:maintenance/configuration:Configuration example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/microsoft.maintenance/maintenanceconfigurations/example-mc
 * ```
 * 
 */
@ResourceType(type="azure:maintenance/configuration:Configuration")
public class Configuration extends com.pulumi.resources.CustomResource {
    /**
     * Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specified the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Maintenance Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Maintenance Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping of properties to assign to the resource.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> properties;

    /**
     * @return A mapping of properties to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * The name of the Resource Group where the Maintenance Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Maintenance Configuration should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The scope of the Maintenance Configuration. Possible values are `All`, `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` or `SQLManagedInstance`. Defaults to `All`.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of the Maintenance Configuration. Possible values are `All`, `Extension`, `Host`, `InGuestPatch`, `OSImage`, `SQLDB` or `SQLManagedInstance`. Defaults to `All`.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * A mapping of tags to assign to the resource. The key could not contain upper case letter.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. The key could not contain upper case letter.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The visibility of the Maintenance Configuration. The only allowable value is `Custom`.
     * 
     */
    @Export(name="visibility", type=String.class, parameters={})
    private Output</* @Nullable */ String> visibility;

    /**
     * @return The visibility of the Maintenance Configuration. The only allowable value is `Custom`.
     * 
     */
    public Output<Optional<String>> visibility() {
        return Codegen.optional(this.visibility);
    }
    /**
     * A `window` block as defined below.
     * 
     */
    @Export(name="window", type=ConfigurationWindow.class, parameters={})
    private Output</* @Nullable */ ConfigurationWindow> window;

    /**
     * @return A `window` block as defined below.
     * 
     */
    public Output<Optional<ConfigurationWindow>> window() {
        return Codegen.optional(this.window);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:maintenance/configuration:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Configuration(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:maintenance/configuration:Configuration", name, state, makeResourceOptions(options, id));
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
    public static Configuration get(String name, Output<String> id, @Nullable ConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, state, options);
    }
}
