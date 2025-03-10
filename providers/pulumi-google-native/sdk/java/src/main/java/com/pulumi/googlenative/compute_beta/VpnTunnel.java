// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_beta.VpnTunnelArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a VpnTunnel resource in the specified project and region using the data included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:VpnTunnel")
public class VpnTunnel extends com.pulumi.resources.CustomResource {
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
     * Detailed status message for the VPN tunnel.
     * 
     */
    @Export(name="detailedStatus", type=String.class, parameters={})
    private Output<String> detailedStatus;

    /**
     * @return Detailed status message for the VPN tunnel.
     * 
     */
    public Output<String> detailedStatus() {
        return this.detailedStatus;
    }
    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    @Export(name="ikeVersion", type=Integer.class, parameters={})
    private Output<Integer> ikeVersion;

    /**
     * @return IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    public Output<Integer> ikeVersion() {
        return this.ikeVersion;
    }
    /**
     * Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of resource. Always compute#vpnTunnel for VPN tunnels.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return A fingerprint for the labels being applied to this VpnTunnel, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a VpnTunnel.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    @Export(name="localTrafficSelector", type=List.class, parameters={String.class})
    private Output<List<String>> localTrafficSelector;

    /**
     * @return Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    public Output<List<String>> localTrafficSelector() {
        return this.localTrafficSelector;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    @Export(name="peerExternalGateway", type=String.class, parameters={})
    private Output<String> peerExternalGateway;

    /**
     * @return URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    public Output<String> peerExternalGateway() {
        return this.peerExternalGateway;
    }
    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    @Export(name="peerExternalGatewayInterface", type=Integer.class, parameters={})
    private Output<Integer> peerExternalGatewayInterface;

    /**
     * @return The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Output<Integer> peerExternalGatewayInterface() {
        return this.peerExternalGatewayInterface;
    }
    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    @Export(name="peerGcpGateway", type=String.class, parameters={})
    private Output<String> peerGcpGateway;

    /**
     * @return URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    public Output<String> peerGcpGateway() {
        return this.peerGcpGateway;
    }
    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    @Export(name="peerIp", type=String.class, parameters={})
    private Output<String> peerIp;

    /**
     * @return IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    public Output<String> peerIp() {
        return this.peerIp;
    }
    /**
     * URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the VPN tunnel resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    @Export(name="remoteTrafficSelector", type=List.class, parameters={String.class})
    private Output<List<String>> remoteTrafficSelector;

    /**
     * @return Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    public Output<List<String>> remoteTrafficSelector() {
        return this.remoteTrafficSelector;
    }
    /**
     * URL of the router resource to be used for dynamic routing.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return URL of the router resource to be used for dynamic routing.
     * 
     */
    public Output<String> router() {
        return this.router;
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
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    @Export(name="sharedSecret", type=String.class, parameters={})
    private Output<String> sharedSecret;

    /**
     * @return Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    public Output<String> sharedSecret() {
        return this.sharedSecret;
    }
    /**
     * Hash of the shared secret.
     * 
     */
    @Export(name="sharedSecretHash", type=String.class, parameters={})
    private Output<String> sharedSecretHash;

    /**
     * @return Hash of the shared secret.
     * 
     */
    public Output<String> sharedSecretHash() {
        return this.sharedSecretHash;
    }
    /**
     * The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the VPN tunnel, which can be one of the following: - PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used. - NO_INCOMING_PACKETS: No incoming packets from peer. - REJECTED: Tunnel configuration was rejected, can be result of being denied access. - ALLOCATING_RESOURCES: Cloud VPN is in the process of allocating all required resources. - STOPPED: Tunnel is stopped due to its Forwarding Rules being deleted for Classic VPN tunnels or the project is in frozen state. - PEER_IDENTITY_MISMATCH: Peer identity does not match peer IP, probably behind NAT. - TS_NARROWING_NOT_ALLOWED: Traffic selector narrowing not allowed for an HA-VPN tunnel.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    @Export(name="targetVpnGateway", type=String.class, parameters={})
    private Output<String> targetVpnGateway;

    /**
     * @return URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Output<String> targetVpnGateway() {
        return this.targetVpnGateway;
    }
    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    @Export(name="vpnGateway", type=String.class, parameters={})
    private Output<String> vpnGateway;

    /**
     * @return URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    public Output<String> vpnGateway() {
        return this.vpnGateway;
    }
    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @Export(name="vpnGatewayInterface", type=Integer.class, parameters={})
    private Output<Integer> vpnGatewayInterface;

    /**
     * @return The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    public Output<Integer> vpnGatewayInterface() {
        return this.vpnGatewayInterface;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnTunnel(String name) {
        this(name, VpnTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnTunnel(String name, VpnTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnTunnel(String name, VpnTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:VpnTunnel", name, args == null ? VpnTunnelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnTunnel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:VpnTunnel", name, null, makeResourceOptions(options, id));
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
    public static VpnTunnel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpnTunnel(name, id, options);
    }
}
