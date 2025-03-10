// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cdn.AFDEndpointArgs;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration information such as origin, protocol, content caching and delivery behavior. The AzureFrontDoor endpoint uses the URL format &lt;endpointname&gt;.azureedge.net.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### AFDEndpoints_Create
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
 *         var afdEndpoint = new AFDEndpoint(&#34;afdEndpoint&#34;, AFDEndpointArgs.builder()        
 *             .enabledState(&#34;Enabled&#34;)
 *             .endpointName(&#34;endpoint1&#34;)
 *             .location(&#34;CentralUs&#34;)
 *             .originResponseTimeoutSeconds(30)
 *             .profileName(&#34;profile1&#34;)
 *             .resourceGroupName(&#34;RG&#34;)
 *             .tags()
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
 * $ pulumi import azure-native:cdn:AFDEndpoint endpoint1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/afdEndpoints/endpoint1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:AFDEndpoint")
public class AFDEndpoint extends com.pulumi.resources.CustomResource {
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
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     * 
     */
    public Output<String> hostName() {
        return this.hostName;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
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
     * Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
     */
    @Export(name="originResponseTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> originResponseTimeoutSeconds;

    /**
     * @return Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
     */
    public Output<Optional<Integer>> originResponseTimeoutSeconds() {
        return Codegen.optional(this.originResponseTimeoutSeconds);
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
    public AFDEndpoint(String name) {
        this(name, AFDEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AFDEndpoint(String name, AFDEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AFDEndpoint(String name, AFDEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDEndpoint", name, args == null ? AFDEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AFDEndpoint(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:AFDEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cdn/v20200901:AFDEndpoint").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20210601:AFDEndpoint").build())
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
    public static AFDEndpoint get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AFDEndpoint(name, id, options);
    }
}
