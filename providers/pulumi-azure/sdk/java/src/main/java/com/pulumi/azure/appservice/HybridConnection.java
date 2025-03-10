// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.HybridConnectionArgs;
import com.pulumi.azure.appservice.inputs.HybridConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * This example provisions an App Service, a Relay Hybrid Connection, and a Service Bus using their outputs to create the App Service Hybrid Connection.
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
 *         var examplePlan = new Plan(&#34;examplePlan&#34;, PlanArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(PlanSku.builder()
 *                 .tier(&#34;Standard&#34;)
 *                 .size(&#34;S1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleAppService = new AppService(&#34;exampleAppService&#34;, AppServiceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .appServicePlanId(examplePlan.getId())
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .skuName(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleHybridConnection = new HybridConnection(&#34;exampleHybridConnection&#34;, HybridConnectionArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .relayNamespaceName(exampleNamespace.getName())
 *             .userMetadata(&#34;examplemetadata&#34;)
 *             .build());
 * 
 *         var exampleAppservice_hybridConnectionHybridConnection = new HybridConnection(&#34;exampleAppservice/hybridConnectionHybridConnection&#34;, HybridConnectionArgs.builder()        
 *             .appServiceName(exampleAppService.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .relayId(exampleHybridConnection.getId())
 *             .hostname(&#34;testhostname.example&#34;)
 *             .port(8080)
 *             .sendKeyName(&#34;exampleSharedAccessKey&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Service Hybrid Connections can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/hybridConnection:HybridConnection example /subscriptions/00000000-0000-0000-0000-00000000000/resourceGroups/exampleResourceGroup1/providers/Microsoft.Web/sites/exampleAppService1/hybridConnectionNamespaces/exampleRN1/relays/exampleRHC1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/hybridConnection:HybridConnection")
public class HybridConnection extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the name of the App Service. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="appServiceName", type=String.class, parameters={})
    private Output<String> appServiceName;

    /**
     * @return Specifies the name of the App Service. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> appServiceName() {
        return this.appServiceName;
    }
    /**
     * The hostname of the endpoint.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return The hostname of the endpoint.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The name of the Relay Namespace.
     * 
     */
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    /**
     * @return The name of the Relay Namespace.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The port of the endpoint.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port of the endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the Service Bus Relay. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="relayId", type=String.class, parameters={})
    private Output<String> relayId;

    /**
     * @return The ID of the Service Bus Relay. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> relayId() {
        return this.relayId;
    }
    @Export(name="relayName", type=String.class, parameters={})
    private Output<String> relayName;

    public Output<String> relayName() {
        return this.relayName;
    }
    /**
     * The name of the resource group in which to create the App Service.  Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the App Service.  Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of the Service Bus key which has Send permissions. Defaults to `RootManageSharedAccessKey`.
     * 
     */
    @Export(name="sendKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyName;

    /**
     * @return The name of the Service Bus key which has Send permissions. Defaults to `RootManageSharedAccessKey`.
     * 
     */
    public Output<Optional<String>> sendKeyName() {
        return Codegen.optional(this.sendKeyName);
    }
    /**
     * The value of the Service Bus Primary Access key.
     * 
     */
    @Export(name="sendKeyValue", type=String.class, parameters={})
    private Output<String> sendKeyValue;

    /**
     * @return The value of the Service Bus Primary Access key.
     * 
     */
    public Output<String> sendKeyValue() {
        return this.sendKeyValue;
    }
    /**
     * The name of the Service Bus namespace.
     * 
     */
    @Export(name="serviceBusNamespace", type=String.class, parameters={})
    private Output<String> serviceBusNamespace;

    /**
     * @return The name of the Service Bus namespace.
     * 
     */
    public Output<String> serviceBusNamespace() {
        return this.serviceBusNamespace;
    }
    /**
     * The suffix for the service bus endpoint.
     * 
     */
    @Export(name="serviceBusSuffix", type=String.class, parameters={})
    private Output<String> serviceBusSuffix;

    /**
     * @return The suffix for the service bus endpoint.
     * 
     */
    public Output<String> serviceBusSuffix() {
        return this.serviceBusSuffix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridConnection(String name) {
        this(name, HybridConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridConnection(String name, HybridConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridConnection(String name, HybridConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/hybridConnection:HybridConnection", name, args == null ? HybridConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridConnection(String name, Output<String> id, @Nullable HybridConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/hybridConnection:HybridConnection", name, state, makeResourceOptions(options, id));
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
    public static HybridConnection get(String name, Output<String> id, @Nullable HybridConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HybridConnection(name, id, state, options);
    }
}
