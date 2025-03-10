// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2transitgateway.MulticastGroupMemberArgs;
import com.pulumi.aws.ec2transitgateway.inputs.MulticastGroupMemberState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Registers members (network interfaces) with the transit gateway multicast group.
 * A member is a network interface associated with a supported EC2 instance that receives multicast traffic.
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
 *         var example = new MulticastGroupMember(&#34;example&#34;, MulticastGroupMemberArgs.builder()        
 *             .groupIpAddress(&#34;224.0.0.1&#34;)
 *             .networkInterfaceId(aws_network_interface.getExample().getId())
 *             .transitGatewayMulticastDomainId(aws_ec2_transit_gateway_multicast_domain.getExample().getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/multicastGroupMember:MulticastGroupMember")
public class MulticastGroupMember extends com.pulumi.resources.CustomResource {
    /**
     * The IP address assigned to the transit gateway multicast group.
     * 
     */
    @Export(name="groupIpAddress", type=String.class, parameters={})
    private Output<String> groupIpAddress;

    /**
     * @return The IP address assigned to the transit gateway multicast group.
     * 
     */
    public Output<String> groupIpAddress() {
        return this.groupIpAddress;
    }
    /**
     * The group members&#39; network interface ID to register with the transit gateway multicast group.
     * 
     */
    @Export(name="networkInterfaceId", type=String.class, parameters={})
    private Output<String> networkInterfaceId;

    /**
     * @return The group members&#39; network interface ID to register with the transit gateway multicast group.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The ID of the transit gateway multicast domain.
     * 
     */
    @Export(name="transitGatewayMulticastDomainId", type=String.class, parameters={})
    private Output<String> transitGatewayMulticastDomainId;

    /**
     * @return The ID of the transit gateway multicast domain.
     * 
     */
    public Output<String> transitGatewayMulticastDomainId() {
        return this.transitGatewayMulticastDomainId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MulticastGroupMember(String name) {
        this(name, MulticastGroupMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MulticastGroupMember(String name, MulticastGroupMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MulticastGroupMember(String name, MulticastGroupMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/multicastGroupMember:MulticastGroupMember", name, args == null ? MulticastGroupMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MulticastGroupMember(String name, Output<String> id, @Nullable MulticastGroupMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/multicastGroupMember:MulticastGroupMember", name, state, makeResourceOptions(options, id));
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
    public static MulticastGroupMember get(String name, Output<String> id, @Nullable MulticastGroupMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MulticastGroupMember(name, id, state, options);
    }
}
