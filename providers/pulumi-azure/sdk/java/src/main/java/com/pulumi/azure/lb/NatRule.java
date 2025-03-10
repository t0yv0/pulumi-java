// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.lb.NatRuleArgs;
import com.pulumi.azure.lb.inputs.NatRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Load Balancer NAT Rule.
 * 
 * &gt; **NOTE:** This resource cannot be used with with virtual machine scale sets, instead use the `azure.lb.NatPool` resource.
 * 
 * &gt; **NOTE** When using this resource, the Load Balancer needs to have a FrontEnd IP Configuration Attached
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
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .allocationMethod(&#34;Static&#34;)
 *             .build());
 * 
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .frontendIpConfigurations(LoadBalancerFrontendIpConfiguration.builder()
 *                 .name(&#34;PublicIPAddress&#34;)
 *                 .publicIpAddressId(examplePublicIp.getId())
 *                 .build())
 *             .build());
 * 
 *         var exampleNatRule = new NatRule(&#34;exampleNatRule&#34;, NatRuleArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .loadbalancerId(exampleLoadBalancer.getId())
 *             .protocol(&#34;Tcp&#34;)
 *             .frontendPort(3389)
 *             .backendPort(3389)
 *             .frontendIpConfigurationName(&#34;PublicIPAddress&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load Balancer NAT Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:lb/natRule:NatRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/loadBalancers/lb1/inboundNatRules/rule1
 * ```
 * 
 */
@ResourceType(type="azure:lb/natRule:NatRule")
public class NatRule extends com.pulumi.resources.CustomResource {
    @Export(name="backendIpConfigurationId", type=String.class, parameters={})
    private Output<String> backendIpConfigurationId;

    public Output<String> backendIpConfigurationId() {
        return this.backendIpConfigurationId;
    }
    /**
     * The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
     * 
     */
    @Export(name="backendPort", type=Integer.class, parameters={})
    private Output<Integer> backendPort;

    /**
     * @return The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
     * 
     */
    public Output<Integer> backendPort() {
        return this.backendPort;
    }
    /**
     * Are the Floating IPs enabled for this Load Balancer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    @Export(name="enableFloatingIp", type=Boolean.class, parameters={})
    private Output<Boolean> enableFloatingIp;

    /**
     * @return Are the Floating IPs enabled for this Load Balancer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    public Output<Boolean> enableFloatingIp() {
        return this.enableFloatingIp;
    }
    /**
     * Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    @Export(name="enableTcpReset", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableTcpReset;

    /**
     * @return Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableTcpReset() {
        return Codegen.optional(this.enableTcpReset);
    }
    @Export(name="frontendIpConfigurationId", type=String.class, parameters={})
    private Output<String> frontendIpConfigurationId;

    public Output<String> frontendIpConfigurationId() {
        return this.frontendIpConfigurationId;
    }
    /**
     * The name of the frontend IP configuration exposing this rule.
     * 
     */
    @Export(name="frontendIpConfigurationName", type=String.class, parameters={})
    private Output<String> frontendIpConfigurationName;

    /**
     * @return The name of the frontend IP configuration exposing this rule.
     * 
     */
    public Output<String> frontendIpConfigurationName() {
        return this.frontendIpConfigurationName;
    }
    /**
     * The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
     * 
     */
    @Export(name="frontendPort", type=Integer.class, parameters={})
    private Output<Integer> frontendPort;

    /**
     * @return The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
     * 
     */
    public Output<Integer> frontendPort() {
        return this.frontendPort;
    }
    /**
     * Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
     * 
     */
    @Export(name="idleTimeoutInMinutes", type=Integer.class, parameters={})
    private Output<Integer> idleTimeoutInMinutes;

    /**
     * @return Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
     * 
     */
    public Output<Integer> idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }
    /**
     * The ID of the Load Balancer in which to create the NAT Rule.
     * 
     */
    @Export(name="loadbalancerId", type=String.class, parameters={})
    private Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the NAT Rule.
     * 
     */
    public Output<String> loadbalancerId() {
        return this.loadbalancerId;
    }
    /**
     * Specifies the name of the NAT Rule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the NAT Rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The transport protocol for the external endpoint. Possible values are `Udp`, `Tcp` or `All`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * The name of the resource group in which to create the resource.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the resource.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatRule(String name) {
        this(name, NatRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatRule(String name, NatRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatRule(String name, NatRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lb/natRule:NatRule", name, args == null ? NatRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NatRule(String name, Output<String> id, @Nullable NatRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:lb/natRule:NatRule", name, state, makeResourceOptions(options, id));
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
    public static NatRule get(String name, Output<String> id, @Nullable NatRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NatRule(name, id, state, options);
    }
}
