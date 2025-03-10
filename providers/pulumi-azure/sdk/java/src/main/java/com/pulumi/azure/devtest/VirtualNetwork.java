// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.devtest.VirtualNetworkArgs;
import com.pulumi.azure.devtest.inputs.VirtualNetworkState;
import com.pulumi.azure.devtest.outputs.VirtualNetworkSubnet;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Virtual Network within a DevTest Lab.
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
 *         var exampleLab = new Lab(&#34;exampleLab&#34;, LabArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tags(Map.of(&#34;Sydney&#34;, &#34;Australia&#34;))
 *             .build());
 * 
 *         var exampleVirtualNetwork = new VirtualNetwork(&#34;exampleVirtualNetwork&#34;, VirtualNetworkArgs.builder()        
 *             .labName(exampleLab.getName())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .subnet(VirtualNetworkSubnet.builder()
 *                 .usePublicIpAddress(&#34;Allow&#34;)
 *                 .useInVirtualMachineCreation(&#34;Allow&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * DevTest Virtual Networks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:devtest/virtualNetwork:VirtualNetwork network1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.DevTestLab/labs/lab1/virtualnetworks/network1
 * ```
 * 
 */
@ResourceType(type="azure:devtest/virtualNetwork:VirtualNetwork")
public class VirtualNetwork extends com.pulumi.resources.CustomResource {
    /**
     * A description for the Virtual Network.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the Virtual Network.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="labName", type=String.class, parameters={})
    private Output<String> labName;

    /**
     * @return Specifies the name of the Dev Test Lab in which the Virtual Network should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> labName() {
        return this.labName;
    }
    /**
     * Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Dev Test Virtual Network. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Dev Test Lab resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `subnet` block as defined below.
     * 
     */
    @Export(name="subnet", type=VirtualNetworkSubnet.class, parameters={})
    private Output<VirtualNetworkSubnet> subnet;

    /**
     * @return A `subnet` block as defined below.
     * 
     */
    public Output<VirtualNetworkSubnet> subnet() {
        return this.subnet;
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
     * The unique immutable identifier of the Dev Test Virtual Network.
     * 
     */
    @Export(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of the Dev Test Virtual Network.
     * 
     */
    public Output<String> uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetwork(String name) {
        this(name, VirtualNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetwork(String name, VirtualNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:devtest/virtualNetwork:VirtualNetwork", name, args == null ? VirtualNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetwork(String name, Output<String> id, @Nullable VirtualNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:devtest/virtualNetwork:VirtualNetwork", name, state, makeResourceOptions(options, id));
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
    public static VirtualNetwork get(String name, Output<String> id, @Nullable VirtualNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetwork(name, id, state, options);
    }
}
