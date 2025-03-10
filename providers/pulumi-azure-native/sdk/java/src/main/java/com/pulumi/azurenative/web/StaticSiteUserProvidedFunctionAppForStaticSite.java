// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.web.StaticSiteUserProvidedFunctionAppForStaticSiteArgs;
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
 * Static Site User Provided Function App ARM resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### Register a user provided function app with a static site
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
 *         var staticSiteUserProvidedFunctionAppForStaticSite = new StaticSiteUserProvidedFunctionAppForStaticSite(&#34;staticSiteUserProvidedFunctionAppForStaticSite&#34;, StaticSiteUserProvidedFunctionAppForStaticSiteArgs.builder()        
 *             .functionAppName(&#34;testFunctionApp&#34;)
 *             .functionAppRegion(&#34;West US 2&#34;)
 *             .functionAppResourceId(&#34;/subscription/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/functionRG/providers/Microsoft.Web/sites/testFunctionApp&#34;)
 *             .isForced(true)
 *             .name(&#34;testStaticSite0&#34;)
 *             .resourceGroupName(&#34;rg&#34;)
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
 * $ pulumi import azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite testFunctionApp /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/rg/providers/Microsoft.Web/staticSites/testStaticSite0/builds/default/userProvidedFunctionApps/testFunctionApp 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite")
public class StaticSiteUserProvidedFunctionAppForStaticSite extends com.pulumi.resources.CustomResource {
    /**
     * The date and time on which the function app was registered with the static site.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date and time on which the function app was registered with the static site.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * The region of the function app registered with the static site
     * 
     */
    @Export(name="functionAppRegion", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppRegion;

    /**
     * @return The region of the function app registered with the static site
     * 
     */
    public Output<Optional<String>> functionAppRegion() {
        return Codegen.optional(this.functionAppRegion);
    }
    /**
     * The resource id of the function app registered with the static site
     * 
     */
    @Export(name="functionAppResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> functionAppResourceId;

    /**
     * @return The resource id of the function app registered with the static site
     * 
     */
    public Output<Optional<String>> functionAppResourceId() {
        return Codegen.optional(this.functionAppResourceId);
    }
    /**
     * Kind of resource.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> name() {
        return this.name;
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
    public StaticSiteUserProvidedFunctionAppForStaticSite(String name) {
        this(name, StaticSiteUserProvidedFunctionAppForStaticSiteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticSiteUserProvidedFunctionAppForStaticSite(String name, StaticSiteUserProvidedFunctionAppForStaticSiteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticSiteUserProvidedFunctionAppForStaticSite(String name, StaticSiteUserProvidedFunctionAppForStaticSiteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite", name, args == null ? StaticSiteUserProvidedFunctionAppForStaticSiteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticSiteUserProvidedFunctionAppForStaticSite(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:StaticSiteUserProvidedFunctionAppForStaticSite", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:web/v20201201:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210101:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210115:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210201:StaticSiteUserProvidedFunctionAppForStaticSite").build()),
                Output.of(Alias.builder().type("azure-native:web/v20210301:StaticSiteUserProvidedFunctionAppForStaticSite").build())
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
    public static StaticSiteUserProvidedFunctionAppForStaticSite get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticSiteUserProvidedFunctionAppForStaticSite(name, id, options);
    }
}
