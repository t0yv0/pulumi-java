// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.PublicIpArgs;
import com.pulumi.azure.network.inputs.PublicIpState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Public IP Address.
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
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .allocationMethod(&#34;Static&#34;)
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Public IPs can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/publicIp:PublicIp myPublicIp /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/publicIPAddresses/myPublicIpAddress1
 * ```
 * 
 */
@ResourceType(type="azure:network/publicIp:PublicIp")
public class PublicIp extends com.pulumi.resources.CustomResource {
    /**
     * Defines the allocation method for this IP address. Possible values are `Static` or `Dynamic`.
     * 
     */
    @Export(name="allocationMethod", type=String.class, parameters={})
    private Output<String> allocationMethod;

    /**
     * @return Defines the allocation method for this IP address. Possible values are `Static` or `Dynamic`.
     * 
     */
    public Output<String> allocationMethod() {
        return this.allocationMethod;
    }
    /**
     * Label for the Domain Name. Will be used to make up the FQDN.  If a domain name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     * 
     */
    @Export(name="domainNameLabel", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainNameLabel;

    /**
     * @return Label for the Domain Name. Will be used to make up the FQDN.  If a domain name label is specified, an A DNS record is created for the public IP in the Microsoft Azure DNS system.
     * 
     */
    public Output<Optional<String>> domainNameLabel() {
        return Codegen.optional(this.domainNameLabel);
    }
    /**
     * Specifies the Edge Zone within the Azure Region where this Public IP should exist. Changing this forces a new Public IP to be created.
     * 
     */
    @Export(name="edgeZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> edgeZone;

    /**
     * @return Specifies the Edge Zone within the Azure Region where this Public IP should exist. Changing this forces a new Public IP to be created.
     * 
     */
    public Output<Optional<String>> edgeZone() {
        return Codegen.optional(this.edgeZone);
    }
    /**
     * Fully qualified domain name of the A DNS record associated with the public IP. `domain_name_label` must be specified to get the `fqdn`. This is the concatenation of the `domain_name_label` and the regionalized DNS zone
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return Fully qualified domain name of the A DNS record associated with the public IP. `domain_name_label` must be specified to get the `fqdn`. This is the concatenation of the `domain_name_label` and the regionalized DNS zone
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * Specifies the timeout for the TCP idle connection. The value can be set between 4 and 30 minutes.
     * 
     */
    @Export(name="idleTimeoutInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> idleTimeoutInMinutes;

    /**
     * @return Specifies the timeout for the TCP idle connection. The value can be set between 4 and 30 minutes.
     * 
     */
    public Output<Optional<Integer>> idleTimeoutInMinutes() {
        return Codegen.optional(this.idleTimeoutInMinutes);
    }
    /**
     * The IP address value that was allocated.
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The IP address value that was allocated.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * A mapping of IP tags to assign to the public IP.
     * 
     */
    @Export(name="ipTags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> ipTags;

    /**
     * @return A mapping of IP tags to assign to the public IP.
     * 
     */
    public Output<Optional<Map<String,String>>> ipTags() {
        return Codegen.optional(this.ipTags);
    }
    /**
     * The IP Version to use, IPv6 or IPv4.
     * 
     */
    @Export(name="ipVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipVersion;

    /**
     * @return The IP Version to use, IPv6 or IPv4.
     * 
     */
    public Output<Optional<String>> ipVersion() {
        return Codegen.optional(this.ipVersion);
    }
    /**
     * Specifies the supported Azure location where the Public IP should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the Public IP should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Public IP. Changing this forces a new Public IP to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Public IP. Changing this forces a new Public IP to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * If specified then public IP address allocated will be provided from the public IP prefix resource.
     * 
     */
    @Export(name="publicIpPrefixId", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicIpPrefixId;

    /**
     * @return If specified then public IP address allocated will be provided from the public IP prefix resource.
     * 
     */
    public Output<Optional<String>> publicIpPrefixId() {
        return Codegen.optional(this.publicIpPrefixId);
    }
    /**
     * The name of the Resource Group where this Public IP should exist. Changing this forces a new Public IP to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where this Public IP should exist. Changing this forces a new Public IP to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     * 
     */
    @Export(name="reverseFqdn", type=String.class, parameters={})
    private Output</* @Nullable */ String> reverseFqdn;

    /**
     * @return A fully qualified domain name that resolves to this public IP address. If the reverseFqdn is specified, then a PTR DNS record is created pointing from the IP address in the in-addr.arpa domain to the reverse FQDN.
     * 
     */
    public Output<Optional<String>> reverseFqdn() {
        return Codegen.optional(this.reverseFqdn);
    }
    /**
     * The SKU of the Public IP. Accepted values are `Basic` and `Standard`. Defaults to `Basic`.
     * 
     */
    @Export(name="sku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sku;

    /**
     * @return The SKU of the Public IP. Accepted values are `Basic` and `Standard`. Defaults to `Basic`.
     * 
     */
    public Output<Optional<String>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * The SKU Tier that should be used for the Public IP. Possible values are `Regional` and `Global`. Defaults to `Regional`.
     * 
     */
    @Export(name="skuTier", type=String.class, parameters={})
    private Output</* @Nullable */ String> skuTier;

    /**
     * @return The SKU Tier that should be used for the Public IP. Possible values are `Regional` and `Global`. Defaults to `Regional`.
     * 
     */
    public Output<Optional<String>> skuTier() {
        return Codegen.optional(this.skuTier);
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
     * A collection containing the availability zone to allocate the Public IP in.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return A collection containing the availability zone to allocate the Public IP in.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicIp(String name) {
        this(name, PublicIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicIp(String name, PublicIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicIp(String name, PublicIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/publicIp:PublicIp", name, args == null ? PublicIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublicIp(String name, Output<String> id, @Nullable PublicIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/publicIp:PublicIp", name, state, makeResourceOptions(options, id));
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
    public static PublicIp get(String name, Output<String> id, @Nullable PublicIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublicIp(name, id, state, options);
    }
}
