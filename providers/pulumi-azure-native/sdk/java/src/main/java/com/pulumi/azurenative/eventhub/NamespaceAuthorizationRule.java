// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventhub.NamespaceAuthorizationRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Single item in a List or Get AuthorizationRule operation
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * ### NameSpaceAuthorizationRuleCreate
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
 *         var namespaceAuthorizationRule = new NamespaceAuthorizationRule(&#34;namespaceAuthorizationRule&#34;, NamespaceAuthorizationRuleArgs.builder()        
 *             .authorizationRuleName(&#34;sdk-Authrules-1746&#34;)
 *             .namespaceName(&#34;sdk-Namespace-2702&#34;)
 *             .resourceGroupName(&#34;ArunMonocle&#34;)
 *             .rights(            
 *                 &#34;Listen&#34;,
 *                 &#34;Send&#34;)
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
 * $ pulumi import azure-native:eventhub:NamespaceAuthorizationRule sdk-Authrules-1746 /subscriptions/5f750a97-50d9-4e36-8081-c9ee4c0210d4/resourceGroups/ArunMonocle/providers/Microsoft.EventHub/namespaces/sdk-Namespace-2702/AuthorizationRules/sdk-Authrules-1746 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:NamespaceAuthorizationRule")
public class NamespaceAuthorizationRule extends com.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The rights associated with the rule.
     * 
     */
    @Export(name="rights", type=List.class, parameters={String.class})
    private Output<List<String>> rights;

    /**
     * @return The rights associated with the rule.
     * 
     */
    public Output<List<String>> rights() {
        return this.rights;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceAuthorizationRule(String name) {
        this(name, NamespaceAuthorizationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceAuthorizationRule(String name, NamespaceAuthorizationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceAuthorizationRule", name, args == null ? NamespaceAuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceAuthorizationRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:NamespaceAuthorizationRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventhub/v20140901:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20150801:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20170401:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20180101preview:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210101preview:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20210601preview:NamespaceAuthorizationRule").build()),
                Output.of(Alias.builder().type("azure-native:eventhub/v20211101:NamespaceAuthorizationRule").build())
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
    public static NamespaceAuthorizationRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceAuthorizationRule(name, id, options);
    }
}
