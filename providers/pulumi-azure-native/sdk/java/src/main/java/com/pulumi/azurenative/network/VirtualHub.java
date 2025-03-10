// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.VirtualHubArgs;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.azurenative.network.outputs.VirtualHubRouteTableResponse;
import com.pulumi.azurenative.network.outputs.VirtualHubRouteTableV2Response;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * VirtualHub Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### VirtualHubPut
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
 *         var virtualHub = new VirtualHub(&#34;virtualHub&#34;, VirtualHubArgs.builder()        
 *             .addressPrefix(&#34;10.168.0.0/24&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .sku(&#34;Basic&#34;)
 *             .tags(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .virtualHubName(&#34;virtualHub2&#34;)
 *             .virtualWan(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualWans/virtualWan1&#34;))
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
 * $ pulumi import azure-native:network:VirtualHub virtualHub2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/virtualHub2 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualHub")
public class VirtualHub extends com.pulumi.resources.CustomResource {
    /**
     * Address-prefix for this VirtualHub.
     * 
     */
    @Export(name="addressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressPrefix;

    /**
     * @return Address-prefix for this VirtualHub.
     * 
     */
    public Output<Optional<String>> addressPrefix() {
        return Codegen.optional(this.addressPrefix);
    }
    /**
     * Flag to control transit for VirtualRouter hub.
     * 
     */
    @Export(name="allowBranchToBranchTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowBranchToBranchTraffic;

    /**
     * @return Flag to control transit for VirtualRouter hub.
     * 
     */
    public Output<Optional<Boolean>> allowBranchToBranchTraffic() {
        return Codegen.optional(this.allowBranchToBranchTraffic);
    }
    /**
     * The azureFirewall associated with this VirtualHub.
     * 
     */
    @Export(name="azureFirewall", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> azureFirewall;

    /**
     * @return The azureFirewall associated with this VirtualHub.
     * 
     */
    public Output<Optional<SubResourceResponse>> azureFirewall() {
        return Codegen.optional(this.azureFirewall);
    }
    /**
     * List of references to Bgp Connections.
     * 
     */
    @Export(name="bgpConnections", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> bgpConnections;

    /**
     * @return List of references to Bgp Connections.
     * 
     */
    public Output<List<SubResourceResponse>> bgpConnections() {
        return this.bgpConnections;
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
     * The expressRouteGateway associated with this VirtualHub.
     * 
     */
    @Export(name="expressRouteGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> expressRouteGateway;

    /**
     * @return The expressRouteGateway associated with this VirtualHub.
     * 
     */
    public Output<Optional<SubResourceResponse>> expressRouteGateway() {
        return Codegen.optional(this.expressRouteGateway);
    }
    /**
     * List of references to IpConfigurations.
     * 
     */
    @Export(name="ipConfigurations", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> ipConfigurations;

    /**
     * @return List of references to IpConfigurations.
     * 
     */
    public Output<List<SubResourceResponse>> ipConfigurations() {
        return this.ipConfigurations;
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
     * The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    @Export(name="p2SVpnGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> p2SVpnGateway;

    /**
     * @return The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    public Output<Optional<SubResourceResponse>> p2SVpnGateway() {
        return Codegen.optional(this.p2SVpnGateway);
    }
    /**
     * The provisioning state of the virtual hub resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual hub resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The routeTable associated with this virtual hub.
     * 
     */
    @Export(name="routeTable", type=VirtualHubRouteTableResponse.class, parameters={})
    private Output</* @Nullable */ VirtualHubRouteTableResponse> routeTable;

    /**
     * @return The routeTable associated with this virtual hub.
     * 
     */
    public Output<Optional<VirtualHubRouteTableResponse>> routeTable() {
        return Codegen.optional(this.routeTable);
    }
    /**
     * The routing state.
     * 
     */
    @Export(name="routingState", type=String.class, parameters={})
    private Output<String> routingState;

    /**
     * @return The routing state.
     * 
     */
    public Output<String> routingState() {
        return this.routingState;
    }
    /**
     * The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    @Export(name="securityPartnerProvider", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> securityPartnerProvider;

    /**
     * @return The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    public Output<Optional<SubResourceResponse>> securityPartnerProvider() {
        return Codegen.optional(this.securityPartnerProvider);
    }
    /**
     * The Security Provider name.
     * 
     */
    @Export(name="securityProviderName", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityProviderName;

    /**
     * @return The Security Provider name.
     * 
     */
    public Output<Optional<String>> securityProviderName() {
        return Codegen.optional(this.securityProviderName);
    }
    /**
     * The sku of this VirtualHub.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return The sku of this VirtualHub.
     * 
     */
    public Output<Optional<String>> sku() {
        return Codegen.optional(this.sku);
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
     * List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    @Export(name="virtualHubRouteTableV2s", type=List.class, parameters={VirtualHubRouteTableV2Response.class})
    private Output</* @Nullable */ List<VirtualHubRouteTableV2Response>> virtualHubRouteTableV2s;

    /**
     * @return List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    public Output<Optional<List<VirtualHubRouteTableV2Response>>> virtualHubRouteTableV2s() {
        return Codegen.optional(this.virtualHubRouteTableV2s);
    }
    /**
     * VirtualRouter ASN.
     * 
     */
    @Export(name="virtualRouterAsn", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> virtualRouterAsn;

    /**
     * @return VirtualRouter ASN.
     * 
     */
    public Output<Optional<Double>> virtualRouterAsn() {
        return Codegen.optional(this.virtualRouterAsn);
    }
    /**
     * VirtualRouter IPs.
     * 
     */
    @Export(name="virtualRouterIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> virtualRouterIps;

    /**
     * @return VirtualRouter IPs.
     * 
     */
    public Output<Optional<List<String>>> virtualRouterIps() {
        return Codegen.optional(this.virtualRouterIps);
    }
    /**
     * The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    @Export(name="virtualWan", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> virtualWan;

    /**
     * @return The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    public Output<Optional<SubResourceResponse>> virtualWan() {
        return Codegen.optional(this.virtualWan);
    }
    /**
     * The VpnGateway associated with this VirtualHub.
     * 
     */
    @Export(name="vpnGateway", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> vpnGateway;

    /**
     * @return The VpnGateway associated with this VirtualHub.
     * 
     */
    public Output<Optional<SubResourceResponse>> vpnGateway() {
        return Codegen.optional(this.vpnGateway);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHub(String name) {
        this(name, VirtualHubArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHub(String name, VirtualHubArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHub(String name, VirtualHubArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHub", name, args == null ? VirtualHubArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualHub(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHub", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180401:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualHub").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:VirtualHub").build())
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
    public static VirtualHub get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHub(name, id, options);
    }
}
