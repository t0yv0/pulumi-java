// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_beta.PacketMirroringArgs;
import com.pulumi.googlenative.compute_beta.outputs.PacketMirroringFilterResponse;
import com.pulumi.googlenative.compute_beta.outputs.PacketMirroringForwardingRuleInfoResponse;
import com.pulumi.googlenative.compute_beta.outputs.PacketMirroringMirroredResourceInfoResponse;
import com.pulumi.googlenative.compute_beta.outputs.PacketMirroringNetworkInfoResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a PacketMirroring resource in the specified project and region using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:PacketMirroring")
public class PacketMirroring extends com.pulumi.resources.CustomResource {
    /**
     * The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    @Export(name="collectorIlb", type=PacketMirroringForwardingRuleInfoResponse.class, parameters={})
    private Output<PacketMirroringForwardingRuleInfoResponse> collectorIlb;

    /**
     * @return The Forwarding Rule resource of type loadBalancingScheme=INTERNAL that will be used as collector for mirrored traffic. The specified forwarding rule must have isMirroringCollector set to true.
     * 
     */
    public Output<PacketMirroringForwardingRuleInfoResponse> collectorIlb() {
        return this.collectorIlb;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    @Export(name="enable", type=String.class, parameters={})
    private Output<String> enable;

    /**
     * @return Indicates whether or not this packet mirroring takes effect. If set to FALSE, this packet mirroring policy will not be enforced on the network. The default is TRUE.
     * 
     */
    public Output<String> enable() {
        return this.enable;
    }
    /**
     * Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    @Export(name="filter", type=PacketMirroringFilterResponse.class, parameters={})
    private Output<PacketMirroringFilterResponse> filter;

    /**
     * @return Filter for mirrored traffic. If unspecified, all traffic is mirrored.
     * 
     */
    public Output<PacketMirroringFilterResponse> filter() {
        return this.filter;
    }
    /**
     * Type of the resource. Always compute#packetMirroring for packet mirrorings.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#packetMirroring for packet mirrorings.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    @Export(name="mirroredResources", type=PacketMirroringMirroredResourceInfoResponse.class, parameters={})
    private Output<PacketMirroringMirroredResourceInfoResponse> mirroredResources;

    /**
     * @return PacketMirroring mirroredResourceInfos. MirroredResourceInfo specifies a set of mirrored VM instances, subnetworks and/or tags for which traffic from/to all VM instances will be mirrored.
     * 
     */
    public Output<PacketMirroringMirroredResourceInfoResponse> mirroredResources() {
        return this.mirroredResources;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    @Export(name="network", type=PacketMirroringNetworkInfoResponse.class, parameters={})
    private Output<PacketMirroringNetworkInfoResponse> network;

    /**
     * @return Specifies the mirrored VPC network. Only packets in this network will be mirrored. All mirrored VMs should have a NIC in the given network. All mirrored subnetworks should belong to the given network.
     * 
     */
    public Output<PacketMirroringNetworkInfoResponse> network() {
        return this.network;
    }
    /**
     * The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of applying this configuration. Priority is used to break ties in cases where there is more than one matching rule. In the case of two rules that apply for a given Instance, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * URI of the region where the packetMirroring resides.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URI of the region where the packetMirroring resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PacketMirroring(String name) {
        this(name, PacketMirroringArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PacketMirroring(String name, PacketMirroringArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PacketMirroring(String name, PacketMirroringArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:PacketMirroring", name, args == null ? PacketMirroringArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PacketMirroring(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:PacketMirroring", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PacketMirroring get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PacketMirroring(name, id, options);
    }
}
