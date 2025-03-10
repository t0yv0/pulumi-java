// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.avs.AddonArgs;
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
 * An addon resource
 * API Version: 2020-07-17-preview.
 * 
 * ## Example Usage
 * ### Addons_CreateOrUpdate
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
 *         var addon = new Addon(&#34;addon&#34;, AddonArgs.builder()        
 *             .addonName(&#34;srm&#34;)
 *             .addonType(&#34;SRM&#34;)
 *             .licenseKey(&#34;41915178-A8FF-4A4D-B683-6D735AF5E3F5&#34;)
 *             .privateCloudName(&#34;cloud1&#34;)
 *             .resourceGroupName(&#34;group1&#34;)
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
 * $ pulumi import azure-native:avs:Addon srm /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/addons/srm 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:Addon")
public class Addon extends com.pulumi.resources.CustomResource {
    /**
     * The type of private cloud addon
     * 
     */
    @Export(name="addonType", type=String.class, parameters={})
    private Output</* @Nullable */ String> addonType;

    /**
     * @return The type of private cloud addon
     * 
     */
    public Output<Optional<String>> addonType() {
        return Codegen.optional(this.addonType);
    }
    /**
     * The SRM license
     * 
     */
    @Export(name="licenseKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseKey;

    /**
     * @return The SRM license
     * 
     */
    public Output<Optional<String>> licenseKey() {
        return Codegen.optional(this.licenseKey);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The state of the addon provisioning
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The state of the addon provisioning
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Addon(String name) {
        this(name, AddonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Addon(String name, AddonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Addon(String name, AddonArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:Addon", name, args == null ? AddonArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Addon(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:Addon", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:avs/v20200717preview:Addon").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20210101preview:Addon").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20210601:Addon").build()),
                Output.of(Alias.builder().type("azure-native:avs/v20211201:Addon").build())
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
    public static Addon get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Addon(name, id, options);
    }
}
