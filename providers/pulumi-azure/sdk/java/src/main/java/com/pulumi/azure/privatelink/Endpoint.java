// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatelink;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.privatelink.EndpointArgs;
import com.pulumi.azure.privatelink.inputs.EndpointState;
import com.pulumi.azure.privatelink.outputs.EndpointCustomDnsConfig;
import com.pulumi.azure.privatelink.outputs.EndpointNetworkInterface;
import com.pulumi.azure.privatelink.outputs.EndpointPrivateDnsZoneConfig;
import com.pulumi.azure.privatelink.outputs.EndpointPrivateDnsZoneGroup;
import com.pulumi.azure.privatelink.outputs.EndpointPrivateServiceConnection;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Private Endpoint.
 * 
 * Azure Private Endpoint is a network interface that connects you privately and securely to a service powered by Azure Private Link. Private Endpoint uses a private IP address from your VNet, effectively bringing the service into your VNet. The service could be an Azure service such as Azure Storage, SQL, etc. or your own Private Link Service.
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
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .addressSpaces(&#34;10.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var service = new Subnet(&#34;service&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.1.0/24&#34;)
 *             .enforcePrivateLinkServiceNetworkPolicies(true)
 *             .build());
 * 
 *         var endpoint = new Subnet(&#34;endpoint&#34;, SubnetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualNetworkName(exampleVirtualNetwork.getName())
 *             .addressPrefixes(&#34;10.0.2.0/24&#34;)
 *             .enforcePrivateLinkEndpointNetworkPolicies(true)
 *             .build());
 * 
 *         var examplePublicIp = new PublicIp(&#34;examplePublicIp&#34;, PublicIpArgs.builder()        
 *             .sku(&#34;Standard&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .allocationMethod(&#34;Static&#34;)
 *             .build());
 * 
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .sku(&#34;Standard&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .frontendIpConfigurations(LoadBalancerFrontendIpConfiguration.builder()
 *                 .name(examplePublicIp.getName())
 *                 .publicIpAddressId(examplePublicIp.getId())
 *                 .build())
 *             .build());
 * 
 *         var exampleLinkService = new LinkService(&#34;exampleLinkService&#34;, LinkServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .natIpConfigurations(LinkServiceNatIpConfiguration.builder()
 *                 .name(examplePublicIp.getName())
 *                 .primary(true)
 *                 .subnetId(service.getId())
 *                 .build())
 *             .loadBalancerFrontendIpConfigurationIds(exampleLoadBalancer.getFrontendIpConfigurations().apply(frontendIpConfigurations -&gt; frontendIpConfigurations[0].getId()))
 *             .build());
 * 
 *         var exampleEndpoint = new Endpoint(&#34;exampleEndpoint&#34;, EndpointArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .subnetId(endpoint.getId())
 *             .privateServiceConnection(EndpointPrivateServiceConnection.builder()
 *                 .name(&#34;example-privateserviceconnection&#34;)
 *                 .privateConnectionResourceId(exampleLinkService.getId())
 *                 .isManualConnection(false)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * Using a Private Link Service Alias with existing resources:
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
 *         final var rg = Output.of(CoreFunctions.getResourceGroup(GetBudgetResourceGroupArgs.builder()
 *             .name(&#34;example-resources&#34;)
 *             .build()));
 * 
 *         final var vnet = Output.of(NetworkFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
 *             .name(&#34;example-network&#34;)
 *             .resourceGroupName(rg.apply(getBudgetResourceGroupResult -&gt; getBudgetResourceGroupResult.getName()))
 *             .build()));
 * 
 *         final var subnet = Output.of(NetworkFunctions.getSubnet(GetSubnetArgs.builder()
 *             .name(&#34;default&#34;)
 *             .virtualNetworkName(vnet.apply(getVirtualNetworkResult -&gt; getVirtualNetworkResult.getName()))
 *             .resourceGroupName(rg.apply(getBudgetResourceGroupResult -&gt; getBudgetResourceGroupResult.getName()))
 *             .build()));
 * 
 *         var example = new Endpoint(&#34;example&#34;, EndpointArgs.builder()        
 *             .location(rg.apply(getBudgetResourceGroupResult -&gt; getBudgetResourceGroupResult.getLocation()))
 *             .resourceGroupName(rg.apply(getBudgetResourceGroupResult -&gt; getBudgetResourceGroupResult.getName()))
 *             .subnetId(subnet.apply(getSubnetResult -&gt; getSubnetResult.getId()))
 *             .privateServiceConnection(EndpointPrivateServiceConnection.builder()
 *                 .name(&#34;example-privateserviceconnection&#34;)
 *                 .privateConnectionResourceAlias(&#34;example-privatelinkservice.d20286c8-4ea5-11eb-9584-8f53157226c6.centralus.azure.privatelinkservice&#34;)
 *                 .isManualConnection(true)
 *                 .requestMessage(&#34;PL&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private Endpoints can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:privatelink/endpoint:Endpoint example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/privateEndpoints/endpoint1
 * ```
 * 
 */
@ResourceType(type="azure:privatelink/endpoint:Endpoint")
public class Endpoint extends com.pulumi.resources.CustomResource {
    @Export(name="customDnsConfigs", type=List.class, parameters={EndpointCustomDnsConfig.class})
    private Output<List<EndpointCustomDnsConfig>> customDnsConfigs;

    public Output<List<EndpointCustomDnsConfig>> customDnsConfigs() {
        return this.customDnsConfigs;
    }
    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the Name of the Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the Name of the Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="networkInterfaces", type=List.class, parameters={EndpointNetworkInterface.class})
    private Output<List<EndpointNetworkInterface>> networkInterfaces;

    public Output<List<EndpointNetworkInterface>> networkInterfaces() {
        return this.networkInterfaces;
    }
    @Export(name="privateDnsZoneConfigs", type=List.class, parameters={EndpointPrivateDnsZoneConfig.class})
    private Output<List<EndpointPrivateDnsZoneConfig>> privateDnsZoneConfigs;

    public Output<List<EndpointPrivateDnsZoneConfig>> privateDnsZoneConfigs() {
        return this.privateDnsZoneConfigs;
    }
    /**
     * A `private_dns_zone_group` block as defined below.
     * 
     */
    @Export(name="privateDnsZoneGroup", type=EndpointPrivateDnsZoneGroup.class, parameters={})
    private Output</* @Nullable */ EndpointPrivateDnsZoneGroup> privateDnsZoneGroup;

    /**
     * @return A `private_dns_zone_group` block as defined below.
     * 
     */
    public Output<Optional<EndpointPrivateDnsZoneGroup>> privateDnsZoneGroup() {
        return Codegen.optional(this.privateDnsZoneGroup);
    }
    /**
     * A `private_service_connection` block as defined below.
     * 
     */
    @Export(name="privateServiceConnection", type=EndpointPrivateServiceConnection.class, parameters={})
    private Output<EndpointPrivateServiceConnection> privateServiceConnection;

    /**
     * @return A `private_service_connection` block as defined below.
     * 
     */
    public Output<EndpointPrivateServiceConnection> privateServiceConnection() {
        return this.privateServiceConnection;
    }
    /**
     * Specifies the Name of the Resource Group within which the Private Endpoint should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the Name of the Resource Group within which the Private Endpoint should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Subnet from which Private IP Addresses will be allocated for this Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="subnetId", type=String.class, parameters={})
    private Output<String> subnetId;

    /**
     * @return The ID of the Subnet from which Private IP Addresses will be allocated for this Private Endpoint. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Endpoint(String name) {
        this(name, EndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Endpoint(String name, EndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Endpoint(String name, EndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatelink/endpoint:Endpoint", name, args == null ? EndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Endpoint(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatelink/endpoint:Endpoint", name, state, makeResourceOptions(options, id));
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
    public static Endpoint get(String name, Output<String> id, @Nullable EndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Endpoint(name, id, state, options);
    }
}
