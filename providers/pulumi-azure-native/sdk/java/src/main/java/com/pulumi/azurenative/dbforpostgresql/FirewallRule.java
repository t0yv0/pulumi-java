// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbforpostgresql.FirewallRuleArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a server firewall rule.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * ### FirewallRuleCreate
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
 *         var firewallRule = new FirewallRule(&#34;firewallRule&#34;, FirewallRuleArgs.builder()        
 *             .endIpAddress(&#34;255.255.255.255&#34;)
 *             .firewallRuleName(&#34;rule1&#34;)
 *             .resourceGroupName(&#34;TestGroup&#34;)
 *             .serverName(&#34;testserver&#34;)
 *             .startIpAddress(&#34;0.0.0.0&#34;)
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
 * $ pulumi import azure-native:dbforpostgresql:FirewallRule rule1 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.DBforPostgreSQL/servers/testserver/firewallRules/rule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:FirewallRule")
public class FirewallRule extends com.pulumi.resources.CustomResource {
    /**
     * The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    @Export(name="endIpAddress", type=String.class, parameters={})
    private Output<String> endIpAddress;

    /**
     * @return The end IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    public Output<String> endIpAddress() {
        return this.endIpAddress;
    }
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
     * The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    @Export(name="startIpAddress", type=String.class, parameters={})
    private Output<String> startIpAddress;

    /**
     * @return The start IP address of the server firewall rule. Must be IPv4 format.
     * 
     */
    public Output<String> startIpAddress() {
        return this.startIpAddress;
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
    public FirewallRule(String name) {
        this(name, FirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRule(String name, FirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRule(String name, FirewallRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:FirewallRule", name, args == null ? FirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallRule(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:FirewallRule", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20171201:FirewallRule").build()),
                Output.of(Alias.builder().type("azure-native:dbforpostgresql/v20171201preview:FirewallRule").build())
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
    public static FirewallRule get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallRule(name, id, options);
    }
}
