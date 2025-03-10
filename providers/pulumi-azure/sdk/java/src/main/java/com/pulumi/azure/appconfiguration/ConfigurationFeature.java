// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs;
import com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState;
import com.pulumi.azure.appconfiguration.outputs.ConfigurationFeatureTargetingFilter;
import com.pulumi.azure.appconfiguration.outputs.ConfigurationFeatureTimewindowFilter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure App Configuration Feature.
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
 *         var rg = new ResourceGroup(&#34;rg&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var appconf = new ConfigurationStore(&#34;appconf&#34;, ConfigurationStoreArgs.builder()        
 *             .resourceGroupName(rg.getName())
 *             .location(rg.getLocation())
 *             .build());
 * 
 *         var test = new ConfigurationFeature(&#34;test&#34;, ConfigurationFeatureArgs.builder()        
 *             .configurationStoreId(appconf.getId())
 *             .description(&#34;test description&#34;)
 *             .label(&#34;acctest-ackeylabel-%d&#34;)
 *             .enabled(true)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Configuration Features can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appconfiguration/configurationFeature:ConfigurationFeature test /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resourceGroup1/providers/Microsoft.AppConfiguration/configurationStores/appConf1/AppConfigurationFeature/appConfFeature1/Label/label1
 * ```
 * 
 *  If you wish to import a key with an empty label then sustitute the label&#39;s name with `%00`, like this
 * 
 * ```sh
 *  $ pulumi import azure:appconfiguration/configurationFeature:ConfigurationFeature test /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/resourceGroup1/providers/Microsoft.AppConfiguration/configurationStores/appConf1/AppConfigurationFeature/appConfFeature1/Label/%00
 * ```
 * 
 */
@ResourceType(type="azure:appconfiguration/configurationFeature:ConfigurationFeature")
public class ConfigurationFeature extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the id of the App Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="configurationStoreId", type=String.class, parameters={})
    private Output<String> configurationStoreId;

    /**
     * @return Specifies the id of the App Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> configurationStoreId() {
        return this.configurationStoreId;
    }
    /**
     * The description of the App Configuration Feature.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the App Configuration Feature.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The status of the App Configuration Feature. By default, this is set to false.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The status of the App Configuration Feature. By default, this is set to false.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The label of the App Configuration Feature.  Changing this forces a new resource to be created.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output</* @Nullable */ String> label;

    /**
     * @return The label of the App Configuration Feature.  Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> label() {
        return Codegen.optional(this.label);
    }
    /**
     * Should this App Configuration Feature be Locked to prevent changes?
     * 
     */
    @Export(name="locked", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> locked;

    /**
     * @return Should this App Configuration Feature be Locked to prevent changes?
     * 
     */
    public Output<Optional<Boolean>> locked() {
        return Codegen.optional(this.locked);
    }
    /**
     * The name of the App Configuration Feature. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the App Configuration Feature. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of one or more numbers representing the value of the percentage required to enable this feature.
     * 
     */
    @Export(name="percentageFilterValue", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> percentageFilterValue;

    /**
     * @return A list of one or more numbers representing the value of the percentage required to enable this feature.
     * 
     */
    public Output<Optional<Integer>> percentageFilterValue() {
        return Codegen.optional(this.percentageFilterValue);
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A `targeting_filter` block as defined below.
     * 
     */
    @Export(name="targetingFilters", type=List.class, parameters={ConfigurationFeatureTargetingFilter.class})
    private Output</* @Nullable */ List<ConfigurationFeatureTargetingFilter>> targetingFilters;

    /**
     * @return A `targeting_filter` block as defined below.
     * 
     */
    public Output<Optional<List<ConfigurationFeatureTargetingFilter>>> targetingFilters() {
        return Codegen.optional(this.targetingFilters);
    }
    /**
     * A `targeting_filter` block `timewindow_filter` as defined below.
     * 
     */
    @Export(name="timewindowFilters", type=List.class, parameters={ConfigurationFeatureTimewindowFilter.class})
    private Output</* @Nullable */ List<ConfigurationFeatureTimewindowFilter>> timewindowFilters;

    /**
     * @return A `targeting_filter` block `timewindow_filter` as defined below.
     * 
     */
    public Output<Optional<List<ConfigurationFeatureTimewindowFilter>>> timewindowFilters() {
        return Codegen.optional(this.timewindowFilters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConfigurationFeature(String name) {
        this(name, ConfigurationFeatureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConfigurationFeature(String name, ConfigurationFeatureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConfigurationFeature(String name, ConfigurationFeatureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appconfiguration/configurationFeature:ConfigurationFeature", name, args == null ? ConfigurationFeatureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConfigurationFeature(String name, Output<String> id, @Nullable ConfigurationFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appconfiguration/configurationFeature:ConfigurationFeature", name, state, makeResourceOptions(options, id));
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
    public static ConfigurationFeature get(String name, Output<String> id, @Nullable ConfigurationFeatureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationFeature(name, id, state, options);
    }
}
