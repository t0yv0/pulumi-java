// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.DefaultUserRuleArgs;
import com.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import com.pulumi.azurenative.network.outputs.SystemDataResponse;
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
 * Network security default user rule.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * ### Create a default user rule
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
 *         var defaultUserRule = new DefaultUserRule(&#34;defaultUserRule&#34;, DefaultUserRuleArgs.builder()        
 *             .configurationName(&#34;myTestSecurityConfig&#34;)
 *             .flag(&#34;AllowVnetInbound&#34;)
 *             .kind(&#34;Default&#34;)
 *             .networkManagerName(&#34;testNetworkManager&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .ruleCollectionName(&#34;testRuleCollection&#34;)
 *             .ruleName(&#34;SampleDefaultUserRule&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a user rule
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
 *         var defaultUserRule = new DefaultUserRule(&#34;defaultUserRule&#34;, DefaultUserRuleArgs.builder()        
 *             .configurationName(&#34;myTestSecurityConfig&#34;)
 *             .networkManagerName(&#34;testNetworkManager&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .ruleCollectionName(&#34;testRuleCollection&#34;)
 *             .ruleName(&#34;SampleUserRule&#34;)
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
 * $ pulumi import azure-native:network:DefaultUserRule SampleUserRule /subscriptions/subId/resourceGroups/rg1/providers/Microsoft.Network/networkManagers/testNetworkManager/securityUserConfigurations/myTestSecurityConfig/ruleCollections/testRuleCollection/rules/SampleUserRule 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:DefaultUserRule")
public class DefaultUserRule extends com.pulumi.resources.CustomResource {
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The destination port ranges.
     * 
     */
    @Export(name="destinationPortRanges", type=List.class, parameters={String.class})
    private Output<List<String>> destinationPortRanges;

    /**
     * @return The destination port ranges.
     * 
     */
    public Output<List<String>> destinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @Export(name="destinations", type=List.class, parameters={AddressPrefixItemResponse.class})
    private Output<List<AddressPrefixItemResponse>> destinations;

    /**
     * @return The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public Output<List<AddressPrefixItemResponse>> destinations() {
        return this.destinations;
    }
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    @Export(name="direction", type=String.class, parameters={})
    private Output<String> direction;

    /**
     * @return Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }
    /**
     * A friendly name for the rule.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A friendly name for the rule.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Default rule flag.
     * 
     */
    @Export(name="flag", type=String.class, parameters={})
    private Output</* @Nullable */ String> flag;

    /**
     * @return Default rule flag.
     * 
     */
    public Output<Optional<String>> flag() {
        return Codegen.optional(this.flag);
    }
    /**
     * Whether the rule is custom or default.
     * Expected value is &#39;Default&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Whether the rule is custom or default.
     * Expected value is &#39;Default&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
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
     * Network protocol this rule applies to.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return Network protocol this rule applies to.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the security configuration user rule resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the security configuration user rule resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The source port ranges.
     * 
     */
    @Export(name="sourcePortRanges", type=List.class, parameters={String.class})
    private Output<List<String>> sourcePortRanges;

    /**
     * @return The source port ranges.
     * 
     */
    public Output<List<String>> sourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * The CIDR or source IP ranges.
     * 
     */
    @Export(name="sources", type=List.class, parameters={AddressPrefixItemResponse.class})
    private Output<List<AddressPrefixItemResponse>> sources;

    /**
     * @return The CIDR or source IP ranges.
     * 
     */
    public Output<List<AddressPrefixItemResponse>> sources() {
        return this.sources;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
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
    public DefaultUserRule(String name) {
        this(name, DefaultUserRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultUserRule(String name, DefaultUserRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultUserRule(String name, DefaultUserRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DefaultUserRule", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultUserRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:DefaultUserRule", name, null, makeResourceOptions(options, id));
    }

    private static DefaultUserRuleArgs makeArgs(DefaultUserRuleArgs args) {
        var builder = args == null ? DefaultUserRuleArgs.builder() : DefaultUserRuleArgs.builder(args);
        return builder
            .kind("Default")
            .build();
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20210201preview:DefaultUserRule").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501preview:DefaultUserRule").build()),
                Output.of(Alias.builder().type("azure-native:network/v20220201preview:DefaultUserRule").build())
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
    public static DefaultUserRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultUserRule(name, id, options);
    }
}
