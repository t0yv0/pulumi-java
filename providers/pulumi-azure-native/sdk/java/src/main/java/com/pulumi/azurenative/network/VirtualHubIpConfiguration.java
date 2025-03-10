// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.VirtualHubIpConfigurationArgs;
import com.pulumi.azurenative.network.outputs.PublicIPAddressResponse;
import com.pulumi.azurenative.network.outputs.SubnetResponse;
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
 * IpConfigurations.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### VirtualHubIpConfigurationPut
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
 *         var virtualHubIpConfiguration = new VirtualHubIpConfiguration(&#34;virtualHubIpConfiguration&#34;, VirtualHubIpConfigurationArgs.builder()        
 *             .ipConfigName(&#34;ipconfig1&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .subnet(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/subnet1&#34;))
 *             .virtualHubName(&#34;hub1&#34;)
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
 * $ pulumi import azure-native:network:VirtualHubIpConfiguration ipconfig1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1/ipConfigurations/ipconfig1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualHubIpConfiguration")
public class VirtualHubIpConfiguration extends com.pulumi.resources.CustomResource {
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
     * Name of the Ip Configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of the Ip Configuration.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The private IP address of the IP configuration.
     * 
     */
    @Export(name="privateIPAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIPAddress;

    /**
     * @return The private IP address of the IP configuration.
     * 
     */
    public Output<Optional<String>> privateIPAddress() {
        return Codegen.optional(this.privateIPAddress);
    }
    /**
     * The private IP address allocation method.
     * 
     */
    @Export(name="privateIPAllocationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateIPAllocationMethod;

    /**
     * @return The private IP address allocation method.
     * 
     */
    public Output<Optional<String>> privateIPAllocationMethod() {
        return Codegen.optional(this.privateIPAllocationMethod);
    }
    /**
     * The provisioning state of the IP configuration resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the IP configuration resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the public IP resource.
     * 
     */
    @Export(name="publicIPAddress", type=PublicIPAddressResponse.class, parameters={})
    private Output</* @Nullable */ PublicIPAddressResponse> publicIPAddress;

    /**
     * @return The reference to the public IP resource.
     * 
     */
    public Output<Optional<PublicIPAddressResponse>> publicIPAddress() {
        return Codegen.optional(this.publicIPAddress);
    }
    /**
     * The reference to the subnet resource.
     * 
     */
    @Export(name="subnet", type=SubnetResponse.class, parameters={})
    private Output</* @Nullable */ SubnetResponse> subnet;

    /**
     * @return The reference to the subnet resource.
     * 
     */
    public Output<Optional<SubnetResponse>> subnet() {
        return Codegen.optional(this.subnet);
    }
    /**
     * Ipconfiguration type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Ipconfiguration type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualHubIpConfiguration(String name) {
        this(name, VirtualHubIpConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualHubIpConfiguration(String name, VirtualHubIpConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualHubIpConfiguration(String name, VirtualHubIpConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubIpConfiguration", name, args == null ? VirtualHubIpConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualHubIpConfiguration(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualHubIpConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualHubIpConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:VirtualHubIpConfiguration").build())
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
    public static VirtualHubIpConfiguration get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualHubIpConfiguration(name, id, options);
    }
}
