// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.FirewallPolicyRuleCollectionGroupArgs;
import com.pulumi.azurenative.network.outputs.FirewallPolicyFilterRuleCollectionResponse;
import com.pulumi.azurenative.network.outputs.FirewallPolicyNatRuleCollectionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Rule Collection Group resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### Create FirewallPolicyNatRuleCollectionGroup
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
 *         var firewallPolicyRuleCollectionGroup = new FirewallPolicyRuleCollectionGroup(&#34;firewallPolicyRuleCollectionGroup&#34;, FirewallPolicyRuleCollectionGroupArgs.builder()        
 *             .firewallPolicyName(&#34;firewallPolicy&#34;)
 *             .priority(100)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .ruleCollectionGroupName(&#34;ruleCollectionGroup1&#34;)
 *             .ruleCollections(Map.ofEntries(
 *                 Map.entry(&#34;action&#34;, Map.of(&#34;type&#34;, &#34;DNAT&#34;)),
 *                 Map.entry(&#34;name&#34;, &#34;Example-Nat-Rule-Collection&#34;),
 *                 Map.entry(&#34;priority&#34;, 100),
 *                 Map.entry(&#34;ruleCollectionType&#34;, &#34;FirewallPolicyNatRuleCollection&#34;),
 *                 Map.entry(&#34;rules&#34;, Map.ofEntries(
 *                     Map.entry(&#34;destinationAddresses&#34;, &#34;152.23.32.23&#34;),
 *                     Map.entry(&#34;destinationPorts&#34;, &#34;8080&#34;),
 *                     Map.entry(&#34;ipProtocols&#34;,                     
 *                         &#34;TCP&#34;,
 *                         &#34;UDP&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;nat-rule1&#34;),
 *                     Map.entry(&#34;ruleType&#34;, &#34;NatRule&#34;),
 *                     Map.entry(&#34;sourceAddresses&#34;, &#34;2.2.2.2&#34;),
 *                     Map.entry(&#34;sourceIpGroups&#34;, ),
 *                     Map.entry(&#34;translatedFqdn&#34;, &#34;internalhttp.server.net&#34;),
 *                     Map.entry(&#34;translatedPort&#34;, &#34;8080&#34;)
 *                 ))
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create FirewallPolicyRuleCollectionGroup
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
 *         var firewallPolicyRuleCollectionGroup = new FirewallPolicyRuleCollectionGroup(&#34;firewallPolicyRuleCollectionGroup&#34;, FirewallPolicyRuleCollectionGroupArgs.builder()        
 *             .firewallPolicyName(&#34;firewallPolicy&#34;)
 *             .priority(100)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .ruleCollectionGroupName(&#34;ruleCollectionGroup1&#34;)
 *             .ruleCollections(Map.ofEntries(
 *                 Map.entry(&#34;action&#34;, Map.of(&#34;type&#34;, &#34;Deny&#34;)),
 *                 Map.entry(&#34;name&#34;, &#34;Example-Filter-Rule-Collection&#34;),
 *                 Map.entry(&#34;priority&#34;, 100),
 *                 Map.entry(&#34;ruleCollectionType&#34;, &#34;FirewallPolicyFilterRuleCollection&#34;),
 *                 Map.entry(&#34;rules&#34;, Map.ofEntries(
 *                     Map.entry(&#34;destinationAddresses&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;destinationPorts&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;ipProtocols&#34;, &#34;TCP&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;network-rule1&#34;),
 *                     Map.entry(&#34;ruleType&#34;, &#34;NetworkRule&#34;),
 *                     Map.entry(&#34;sourceAddresses&#34;, &#34;10.1.25.0/24&#34;)
 *                 ))
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create FirewallPolicyRuleCollectionGroup With IpGroups
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
 *         var firewallPolicyRuleCollectionGroup = new FirewallPolicyRuleCollectionGroup(&#34;firewallPolicyRuleCollectionGroup&#34;, FirewallPolicyRuleCollectionGroupArgs.builder()        
 *             .firewallPolicyName(&#34;firewallPolicy&#34;)
 *             .priority(110)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .ruleCollectionGroupName(&#34;ruleCollectionGroup1&#34;)
 *             .ruleCollections(Map.ofEntries(
 *                 Map.entry(&#34;action&#34;, Map.of(&#34;type&#34;, &#34;Deny&#34;)),
 *                 Map.entry(&#34;name&#34;, &#34;Example-Filter-Rule-Collection&#34;),
 *                 Map.entry(&#34;ruleCollectionType&#34;, &#34;FirewallPolicyFilterRuleCollection&#34;),
 *                 Map.entry(&#34;rules&#34;, Map.ofEntries(
 *                     Map.entry(&#34;destinationIpGroups&#34;, &#34;/subscriptions/subid/providers/Microsoft.Network/resourceGroup/rg1/ipGroups/ipGroups2&#34;),
 *                     Map.entry(&#34;destinationPorts&#34;, &#34;*&#34;),
 *                     Map.entry(&#34;ipProtocols&#34;, &#34;TCP&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;network-1&#34;),
 *                     Map.entry(&#34;ruleType&#34;, &#34;NetworkRule&#34;),
 *                     Map.entry(&#34;sourceIpGroups&#34;, &#34;/subscriptions/subid/providers/Microsoft.Network/resourceGroup/rg1/ipGroups/ipGroups1&#34;)
 *                 ))
 *             ))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create FirewallPolicyRuleCollectionGroup With Web Categories
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
 *         var firewallPolicyRuleCollectionGroup = new FirewallPolicyRuleCollectionGroup(&#34;firewallPolicyRuleCollectionGroup&#34;, FirewallPolicyRuleCollectionGroupArgs.builder()        
 *             .firewallPolicyName(&#34;firewallPolicy&#34;)
 *             .priority(110)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .ruleCollectionGroupName(&#34;ruleCollectionGroup1&#34;)
 *             .ruleCollections(Map.ofEntries(
 *                 Map.entry(&#34;action&#34;, Map.of(&#34;type&#34;, &#34;Deny&#34;)),
 *                 Map.entry(&#34;name&#34;, &#34;Example-Filter-Rule-Collection&#34;),
 *                 Map.entry(&#34;ruleCollectionType&#34;, &#34;FirewallPolicyFilterRuleCollection&#34;),
 *                 Map.entry(&#34;rules&#34;, Map.ofEntries(
 *                     Map.entry(&#34;description&#34;, &#34;Deny inbound rule&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;rule1&#34;),
 *                     Map.entry(&#34;protocols&#34;, Map.ofEntries(
 *                         Map.entry(&#34;port&#34;, 443),
 *                         Map.entry(&#34;protocolType&#34;, &#34;Https&#34;)
 *                     )),
 *                     Map.entry(&#34;ruleType&#34;, &#34;ApplicationRule&#34;),
 *                     Map.entry(&#34;sourceAddresses&#34;,                     
 *                         &#34;216.58.216.164&#34;,
 *                         &#34;10.0.0.0/24&#34;),
 *                     Map.entry(&#34;webCategories&#34;, &#34;Hacking&#34;)
 *                 ))
 *             ))
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
 * $ pulumi import azure-native:network:FirewallPolicyRuleCollectionGroup ruleCollectionGroup1 /subscriptions/e747cc13-97d4-4a79-b463-42d7f4e558f2/resourceGroups/rg1/providers/Microsoft.Network/firewallPolicies/firewallPolicy/ruleCollectionGroups/ruleCollectionGroup1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:FirewallPolicyRuleCollectionGroup")
public class FirewallPolicyRuleCollectionGroup extends com.pulumi.resources.CustomResource {
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Priority of the Firewall Policy Rule Collection Group resource.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Priority of the Firewall Policy Rule Collection Group resource.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The provisioning state of the firewall policy rule collection group resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the firewall policy rule collection group resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Group of Firewall Policy rule collections.
     * 
     */
    @Export(name="ruleCollections", type=List.class, parameters={Either.class})
    private Output</* @Nullable */ List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>>> ruleCollections;

    /**
     * @return Group of Firewall Policy rule collections.
     * 
     */
    public Output<Optional<List<Either<FirewallPolicyFilterRuleCollectionResponse,FirewallPolicyNatRuleCollectionResponse>>>> ruleCollections() {
        return Codegen.optional(this.ruleCollections);
    }
    /**
     * Rule Group type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Rule Group type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicyRuleCollectionGroup(String name) {
        this(name, FirewallPolicyRuleCollectionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicyRuleCollectionGroup(String name, FirewallPolicyRuleCollectionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicyRuleCollectionGroup(String name, FirewallPolicyRuleCollectionGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FirewallPolicyRuleCollectionGroup", name, args == null ? FirewallPolicyRuleCollectionGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallPolicyRuleCollectionGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:FirewallPolicyRuleCollectionGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200501:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:FirewallPolicyRuleCollectionGroup").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:FirewallPolicyRuleCollectionGroup").build())
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
    public static FirewallPolicyRuleCollectionGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicyRuleCollectionGroup(name, id, options);
    }
}
