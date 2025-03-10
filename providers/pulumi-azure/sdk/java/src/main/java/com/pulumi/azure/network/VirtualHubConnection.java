// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VirtualHubConnectionArgs;
import com.pulumi.azure.network.inputs.VirtualHubConnectionState;
import com.pulumi.azure.network.outputs.VirtualHubConnectionRouting;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Connection for a Virtual Hub.
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
 *             .addressSpaces(&#34;172.0.0.0/16&#34;)
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleVirtualWan = new VirtualWan(&#34;exampleVirtualWan&#34;, VirtualWanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .build());
 * 
 *         var exampleVirtualHub = new VirtualHub(&#34;exampleVirtualHub&#34;, VirtualHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .virtualWanId(exampleVirtualWan.getId())
 *             .addressPrefix(&#34;10.0.1.0/24&#34;)
 *             .build());
 * 
 *         var exampleVirtualHubConnection = new VirtualHubConnection(&#34;exampleVirtualHubConnection&#34;, VirtualHubConnectionArgs.builder()        
 *             .virtualHubId(exampleVirtualHub.getId())
 *             .remoteVirtualNetworkId(exampleVirtualNetwork.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Virtual Hub Connection&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/virtualHubConnection:VirtualHubConnection example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualHubs/hub1/hubVirtualNetworkConnections/connection1
 * ```
 * 
 */
@ResourceType(type="azure:network/virtualHubConnection:VirtualHubConnection")
public class VirtualHubConnection extends com.pulumi.resources.CustomResource {
    /**
     * Should Internet Security be enabled to secure internet traffic? Defaults to `false`.
     * 
     */
    @Export(name="internetSecurityEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> internetSecurityEnabled;

    /**
     * @return Should Internet Security be enabled to secure internet traffic? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> internetSecurityEnabled() {
        return Codegen.optional(this.internetSecurityEnabled);
    }
    /**
     * The Name which should be used for this Connection, which must be unique within the Virtual Hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The Name which should be used for this Connection, which must be unique within the Virtual Hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the Virtual Network which the Virtual Hub should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="remoteVirtualNetworkId", type=String.class, parameters={})
    private Output<String> remoteVirtualNetworkId;

    /**
     * @return The ID of the Virtual Network which the Virtual Hub should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> remoteVirtualNetworkId() {
        return this.remoteVirtualNetworkId;
    }
    /**
     * A `routing` block as defined below.
     * 
     */
    @Export(name="routing", type=VirtualHubConnectionRouting.class, parameters={})
    private Output<VirtualHubConnectionRouting> routing;

    /**
     * @return A `routing` block as defined below.
     * 
     */
    public Output<VirtualHubConnectionRouting> routing() {
        return this.routing;
    }
    /**
     * The ID of the Virtual Hub within which this connection should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="virtualHubId", type=String.class, parameters={})
    private Output<String> virtualHubId;

    /**
     * @return The ID of the Virtual Hub within which this connection should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> virtualHubId() {
        return this.virtualHubId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHubConnection(String name) {
        this(name, VirtualHubConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHubConnection(String name, VirtualHubConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHubConnection(String name, VirtualHubConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualHubConnection:VirtualHubConnection", name, args == null ? VirtualHubConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualHubConnection(String name, Output<String> id, @Nullable VirtualHubConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/virtualHubConnection:VirtualHubConnection", name, state, makeResourceOptions(options, id));
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
    public static VirtualHubConnection get(String name, Output<String> id, @Nullable VirtualHubConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHubConnection(name, id, state, options);
    }
}
