// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cdn.RouteArgs;
import com.pulumi.azurenative.cdn.outputs.CompressionSettingsResponse;
import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
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
 * Friendly Routes name mapping to the any Routes or secret related information.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### Routes_Create
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
 *         var route = new Route(&#34;route&#34;, RouteArgs.builder()        
 *             .compressionSettings(Map.ofEntries(
 *                 Map.entry(&#34;contentTypesToCompress&#34;,                 
 *                     &#34;text/html&#34;,
 *                     &#34;application/octet-stream&#34;),
 *                 Map.entry(&#34;isCompressionEnabled&#34;, true)
 *             ))
 *             .customDomains(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/customDomains/domain1&#34;))
 *             .enabledState(&#34;Enabled&#34;)
 *             .endpointName(&#34;endpoint1&#34;)
 *             .forwardingProtocol(&#34;MatchRequest&#34;)
 *             .httpsRedirect(&#34;Enabled&#34;)
 *             .linkToDefaultDomain(&#34;Enabled&#34;)
 *             .originGroup(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/originGroups/originGroup1&#34;))
 *             .patternsToMatch(&#34;/*&#34;)
 *             .profileName(&#34;profile1&#34;)
 *             .queryStringCachingBehavior(&#34;IgnoreQueryString&#34;)
 *             .resourceGroupName(&#34;RG&#34;)
 *             .routeName(&#34;route1&#34;)
 *             .ruleSets(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/ruleSets/ruleSet1&#34;))
 *             .supportedProtocols(            
 *                 &#34;Https&#34;,
 *                 &#34;Http&#34;)
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
 * $ pulumi import azure-native:cdn:Route route1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/afdendpoints/endpoint1/routes/route1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:Route")
public class Route extends com.pulumi.resources.CustomResource {
    /**
     * compression settings.
     * 
     */
    @Export(name="compressionSettings", type=CompressionSettingsResponse.class, parameters={})
    private Output</* @Nullable */ CompressionSettingsResponse> compressionSettings;

    /**
     * @return compression settings.
     * 
     */
    public Output<Optional<CompressionSettingsResponse>> compressionSettings() {
        return Codegen.optional(this.compressionSettings);
    }
    /**
     * Domains referenced by this endpoint.
     * 
     */
    @Export(name="customDomains", type=List.class, parameters={ResourceReferenceResponse.class})
    private Output</* @Nullable */ List<ResourceReferenceResponse>> customDomains;

    /**
     * @return Domains referenced by this endpoint.
     * 
     */
    public Output<Optional<List<ResourceReferenceResponse>>> customDomains() {
        return Codegen.optional(this.customDomains);
    }
    @Export(name="deploymentStatus", type=String.class, parameters={})
    private Output<String> deploymentStatus;

    public Output<String> deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Export(name="enabledState", type=String.class, parameters={})
    private Output</* @Nullable */ String> enabledState;

    /**
     * @return Whether to enable use of this rule. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Output<Optional<String>> enabledState() {
        return Codegen.optional(this.enabledState);
    }
    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    @Export(name="forwardingProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> forwardingProtocol;

    /**
     * @return Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    public Output<Optional<String>> forwardingProtocol() {
        return Codegen.optional(this.forwardingProtocol);
    }
    /**
     * Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this is a easy way to set up this rule and it will be the first rule that gets executed.
     * 
     */
    @Export(name="httpsRedirect", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpsRedirect;

    /**
     * @return Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this is a easy way to set up this rule and it will be the first rule that gets executed.
     * 
     */
    public Output<Optional<String>> httpsRedirect() {
        return Codegen.optional(this.httpsRedirect);
    }
    /**
     * whether this route will be linked to the default endpoint domain.
     * 
     */
    @Export(name="linkToDefaultDomain", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkToDefaultDomain;

    /**
     * @return whether this route will be linked to the default endpoint domain.
     * 
     */
    public Output<Optional<String>> linkToDefaultDomain() {
        return Codegen.optional(this.linkToDefaultDomain);
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
     * A reference to the origin group.
     * 
     */
    @Export(name="originGroup", type=ResourceReferenceResponse.class, parameters={})
    private Output<ResourceReferenceResponse> originGroup;

    /**
     * @return A reference to the origin group.
     * 
     */
    public Output<ResourceReferenceResponse> originGroup() {
        return this.originGroup;
    }
    /**
     * A directory path on the origin that AzureFrontDoor can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    @Export(name="originPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> originPath;

    /**
     * @return A directory path on the origin that AzureFrontDoor can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    public Output<Optional<String>> originPath() {
        return Codegen.optional(this.originPath);
    }
    /**
     * The route patterns of the rule.
     * 
     */
    @Export(name="patternsToMatch", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> patternsToMatch;

    /**
     * @return The route patterns of the rule.
     * 
     */
    public Output<Optional<List<String>>> patternsToMatch() {
        return Codegen.optional(this.patternsToMatch);
    }
    /**
     * Provisioning status
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    @Export(name="queryStringCachingBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> queryStringCachingBehavior;

    /**
     * @return Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    public Output<Optional<String>> queryStringCachingBehavior() {
        return Codegen.optional(this.queryStringCachingBehavior);
    }
    /**
     * rule sets referenced by this endpoint.
     * 
     */
    @Export(name="ruleSets", type=List.class, parameters={ResourceReferenceResponse.class})
    private Output</* @Nullable */ List<ResourceReferenceResponse>> ruleSets;

    /**
     * @return rule sets referenced by this endpoint.
     * 
     */
    public Output<Optional<List<ResourceReferenceResponse>>> ruleSets() {
        return Codegen.optional(this.ruleSets);
    }
    /**
     * List of supported protocols for this route.
     * 
     */
    @Export(name="supportedProtocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedProtocols;

    /**
     * @return List of supported protocols for this route.
     * 
     */
    public Output<Optional<List<String>>> supportedProtocols() {
        return Codegen.optional(this.supportedProtocols);
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
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
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:Route", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cdn/v20200901:Route").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20210601:Route").build())
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
    public static Route get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, options);
    }
}
