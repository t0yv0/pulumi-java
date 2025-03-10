// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.managednetwork.ManagedNetworkGroupArgs;
import com.pulumi.azurenative.managednetwork.outputs.ResourceIdResponse;
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
 * The Managed Network Group resource
 * API Version: 2019-06-01-preview.
 * 
 * ## Example Usage
 * ### ManagementNetworkGroupsPut
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
 *         var managedNetworkGroup = new ManagedNetworkGroup(&#34;managedNetworkGroup&#34;, ManagedNetworkGroupArgs.builder()        
 *             .managedNetworkGroupName(&#34;myManagedNetworkGroup1&#34;)
 *             .managedNetworkName(&#34;myManagedNetwork&#34;)
 *             .managementGroups()
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .subnets(Map.of(&#34;id&#34;, &#34;/subscriptionB/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/VnetA/subnets/subnetA&#34;))
 *             .subscriptions()
 *             .virtualNetworks(            
 *                 Map.of(&#34;id&#34;, &#34;/subscriptionB/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/VnetA&#34;),
 *                 Map.of(&#34;id&#34;, &#34;/subscriptionB/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/VnetB&#34;))
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
 * $ pulumi import azure-native:managednetwork:ManagedNetworkGroup myManagedNetworkGroup1 /subscriptionB/resourceGroups/myResourceGroup/providers/Microsoft.ManagedNetwork/managedNetworks/myManagedNetwork/managedNetworkGroups/myManagedNetworkGroup1 
 * ```
 * 
 */
@ResourceType(type="azure-native:managednetwork:ManagedNetworkGroup")
public class ManagedNetworkGroup extends com.pulumi.resources.CustomResource {
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
     * Responsibility role under which this Managed Network Group will be created
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Responsibility role under which this Managed Network Group will be created
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @Export(name="managementGroups", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> managementGroups;

    /**
     * @return The collection of management groups covered by the Managed Network
     * 
     */
    public Output<Optional<List<ResourceIdResponse>>> managementGroups() {
        return Codegen.optional(this.managementGroups);
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
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the ManagedNetwork resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @Export(name="subnets", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> subnets;

    /**
     * @return The collection of  subnets covered by the Managed Network
     * 
     */
    public Output<Optional<List<ResourceIdResponse>>> subnets() {
        return Codegen.optional(this.subnets);
    }
    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @Export(name="subscriptions", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> subscriptions;

    /**
     * @return The collection of subscriptions covered by the Managed Network
     * 
     */
    public Output<Optional<List<ResourceIdResponse>>> subscriptions() {
        return Codegen.optional(this.subscriptions);
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @Export(name="virtualNetworks", type=List.class, parameters={ResourceIdResponse.class})
    private Output</* @Nullable */ List<ResourceIdResponse>> virtualNetworks;

    /**
     * @return The collection of virtual nets covered by the Managed Network
     * 
     */
    public Output<Optional<List<ResourceIdResponse>>> virtualNetworks() {
        return Codegen.optional(this.virtualNetworks);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedNetworkGroup(String name) {
        this(name, ManagedNetworkGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedNetworkGroup(String name, ManagedNetworkGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedNetworkGroup(String name, ManagedNetworkGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managednetwork:ManagedNetworkGroup", name, args == null ? ManagedNetworkGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagedNetworkGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managednetwork:ManagedNetworkGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:managednetwork/v20190601preview:ManagedNetworkGroup").build())
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
    public static ManagedNetworkGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagedNetworkGroup(name, id, options);
    }
}
