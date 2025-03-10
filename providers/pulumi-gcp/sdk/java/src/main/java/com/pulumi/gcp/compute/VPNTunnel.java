// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.VPNTunnelArgs;
import com.pulumi.gcp.compute.inputs.VPNTunnelState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * VPN tunnel resource.
 * 
 * To get more information about VpnTunnel, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/vpnTunnels)
 * * How-to Guides
 *     * [Cloud VPN Overview](https://cloud.google.com/vpn/docs/concepts/overview)
 *     * [Networks and Tunnel Routing](https://cloud.google.com/vpn/docs/concepts/choosing-networks-routing)
 * 
 * &gt; **Warning:** All arguments including `shared_secret` will be stored in the raw
 * state as plain-text.
 * 
 * ## Example Usage
 * ### Vpn Tunnel Basic
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
 *         var network1 = new Network(&#34;network1&#34;);
 * 
 *         var targetGateway = new VPNGateway(&#34;targetGateway&#34;, VPNGatewayArgs.builder()        
 *             .network(network1.getId())
 *             .build());
 * 
 *         var vpnStaticIp = new Address(&#34;vpnStaticIp&#34;);
 * 
 *         var frEsp = new ForwardingRule(&#34;frEsp&#34;, ForwardingRuleArgs.builder()        
 *             .ipProtocol(&#34;ESP&#34;)
 *             .ipAddress(vpnStaticIp.getAddress())
 *             .target(targetGateway.getId())
 *             .build());
 * 
 *         var frUdp500 = new ForwardingRule(&#34;frUdp500&#34;, ForwardingRuleArgs.builder()        
 *             .ipProtocol(&#34;UDP&#34;)
 *             .portRange(&#34;500&#34;)
 *             .ipAddress(vpnStaticIp.getAddress())
 *             .target(targetGateway.getId())
 *             .build());
 * 
 *         var frUdp4500 = new ForwardingRule(&#34;frUdp4500&#34;, ForwardingRuleArgs.builder()        
 *             .ipProtocol(&#34;UDP&#34;)
 *             .portRange(&#34;4500&#34;)
 *             .ipAddress(vpnStaticIp.getAddress())
 *             .target(targetGateway.getId())
 *             .build());
 * 
 *         var tunnel1 = new VPNTunnel(&#34;tunnel1&#34;, VPNTunnelArgs.builder()        
 *             .peerIp(&#34;15.0.0.120&#34;)
 *             .sharedSecret(&#34;a secret message&#34;)
 *             .targetVpnGateway(targetGateway.getId())
 *             .build());
 * 
 *         var route1 = new Route(&#34;route1&#34;, RouteArgs.builder()        
 *             .network(network1.getName())
 *             .destRange(&#34;15.0.0.0/24&#34;)
 *             .priority(1000)
 *             .nextHopVpnTunnel(tunnel1.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Vpn Tunnel Beta
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
 *         var network1 = new Network(&#34;network1&#34;);
 * 
 *         var targetGateway = new VPNGateway(&#34;targetGateway&#34;, VPNGatewayArgs.builder()        
 *             .network(network1.getId())
 *             .build());
 * 
 *         var vpnStaticIp = new Address(&#34;vpnStaticIp&#34;);
 * 
 *         var frEsp = new ForwardingRule(&#34;frEsp&#34;, ForwardingRuleArgs.builder()        
 *             .ipProtocol(&#34;ESP&#34;)
 *             .ipAddress(vpnStaticIp.getAddress())
 *             .target(targetGateway.getId())
 *             .build());
 * 
 *         var frUdp500 = new ForwardingRule(&#34;frUdp500&#34;, ForwardingRuleArgs.builder()        
 *             .ipProtocol(&#34;UDP&#34;)
 *             .portRange(&#34;500&#34;)
 *             .ipAddress(vpnStaticIp.getAddress())
 *             .target(targetGateway.getId())
 *             .build());
 * 
 *         var frUdp4500 = new ForwardingRule(&#34;frUdp4500&#34;, ForwardingRuleArgs.builder()        
 *             .ipProtocol(&#34;UDP&#34;)
 *             .portRange(&#34;4500&#34;)
 *             .ipAddress(vpnStaticIp.getAddress())
 *             .target(targetGateway.getId())
 *             .build());
 * 
 *         var tunnel1 = new VPNTunnel(&#34;tunnel1&#34;, VPNTunnelArgs.builder()        
 *             .peerIp(&#34;15.0.0.120&#34;)
 *             .sharedSecret(&#34;a secret message&#34;)
 *             .targetVpnGateway(targetGateway.getId())
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         var route1 = new Route(&#34;route1&#34;, RouteArgs.builder()        
 *             .network(network1.getName())
 *             .destRange(&#34;15.0.0.0/24&#34;)
 *             .priority(1000)
 *             .nextHopVpnTunnel(tunnel1.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * VpnTunnel can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/vPNTunnel:VPNTunnel default projects/{{project}}/regions/{{region}}/vpnTunnels/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/vPNTunnel:VPNTunnel default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/vPNTunnel:VPNTunnel default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/vPNTunnel:VPNTunnel default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/vPNTunnel:VPNTunnel")
public class VPNTunnel extends com.pulumi.resources.CustomResource {
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
     * An optional description of this resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
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
     * IKE protocol version to use when establishing the VPN tunnel with
     * peer VPN gateway.
     * Acceptable IKE versions are 1 or 2. Default version is 2.
     * 
     */
    @Export(name="ikeVersion", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ikeVersion;

    /**
     * @return IKE protocol version to use when establishing the VPN tunnel with
     * peer VPN gateway.
     * Acceptable IKE versions are 1 or 2. Default version is 2.
     * 
     */
    public Output<Optional<Integer>> ikeVersion() {
        return Codegen.optional(this.ikeVersion);
    }
    /**
     * The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    @Export(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    /**
     * @return The fingerprint used for optimistic locking of this resource. Used internally during updates.
     * 
     */
    public Output<String> labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this VpnTunnel.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels to apply to this VpnTunnel.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Local traffic selector to use when establishing the VPN tunnel with
     * peer VPN gateway. The value should be a CIDR formatted string,
     * for example `192.168.0.0/16`. The ranges should be disjoint.
     * Only IPv4 is supported.
     * 
     */
    @Export(name="localTrafficSelectors", type=List.class, parameters={String.class})
    private Output<List<String>> localTrafficSelectors;

    /**
     * @return Local traffic selector to use when establishing the VPN tunnel with
     * peer VPN gateway. The value should be a CIDR formatted string,
     * for example `192.168.0.0/16`. The ranges should be disjoint.
     * Only IPv4 is supported.
     * 
     */
    public Output<List<String>> localTrafficSelectors() {
        return this.localTrafficSelectors;
    }
    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63
     * characters long and match the regular expression
     * `a-z?` which means the first character
     * must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63
     * characters long and match the regular expression
     * `a-z?` which means the first character
     * must be a lowercase letter, and all following characters must
     * be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected.
     * 
     */
    @Export(name="peerExternalGateway", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerExternalGateway;

    /**
     * @return URL of the peer side external VPN gateway to which this VPN tunnel is connected.
     * 
     */
    public Output<Optional<String>> peerExternalGateway() {
        return Codegen.optional(this.peerExternalGateway);
    }
    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected.
     * 
     */
    @Export(name="peerExternalGatewayInterface", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> peerExternalGatewayInterface;

    /**
     * @return The interface ID of the external VPN gateway to which this VPN tunnel is connected.
     * 
     */
    public Output<Optional<Integer>> peerExternalGatewayInterface() {
        return Codegen.optional(this.peerExternalGatewayInterface);
    }
    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected.
     * If provided, the VPN tunnel will automatically use the same vpn_gateway_interface
     * ID in the peer GCP VPN gateway.
     * This field must reference a `gcp.compute.HaVpnGateway` resource.
     * 
     */
    @Export(name="peerGcpGateway", type=String.class, parameters={})
    private Output</* @Nullable */ String> peerGcpGateway;

    /**
     * @return URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected.
     * If provided, the VPN tunnel will automatically use the same vpn_gateway_interface
     * ID in the peer GCP VPN gateway.
     * This field must reference a `gcp.compute.HaVpnGateway` resource.
     * 
     */
    public Output<Optional<String>> peerGcpGateway() {
        return Codegen.optional(this.peerGcpGateway);
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
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The region where the tunnel is located. If unset, is set to the region of `target_vpn_gateway`.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return The region where the tunnel is located. If unset, is set to the region of `target_vpn_gateway`.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Remote traffic selector to use when establishing the VPN tunnel with
     * peer VPN gateway. The value should be a CIDR formatted string,
     * for example `192.168.0.0/16`. The ranges should be disjoint.
     * Only IPv4 is supported.
     * 
     */
    @Export(name="remoteTrafficSelectors", type=List.class, parameters={String.class})
    private Output<List<String>> remoteTrafficSelectors;

    /**
     * @return Remote traffic selector to use when establishing the VPN tunnel with
     * peer VPN gateway. The value should be a CIDR formatted string,
     * for example `192.168.0.0/16`. The ranges should be disjoint.
     * Only IPv4 is supported.
     * 
     */
    public Output<List<String>> remoteTrafficSelectors() {
        return this.remoteTrafficSelectors;
    }
    /**
     * URL of router resource to be used for dynamic routing.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output</* @Nullable */ String> router;

    /**
     * @return URL of router resource to be used for dynamic routing.
     * 
     */
    public Output<Optional<String>> router() {
        return Codegen.optional(this.router);
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Shared secret used to set the secure session between the Cloud VPN
     * gateway and the peer VPN gateway.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="sharedSecret", type=String.class, parameters={})
    private Output<String> sharedSecret;

    /**
     * @return Shared secret used to set the secure session between the Cloud VPN
     * gateway and the peer VPN gateway.
     * **Note**: This property is sensitive and will not be displayed in the plan.
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
     * URL of the Target VPN gateway with which this VPN tunnel is
     * associated.
     * 
     */
    @Export(name="targetVpnGateway", type=String.class, parameters={})
    private Output</* @Nullable */ String> targetVpnGateway;

    /**
     * @return URL of the Target VPN gateway with which this VPN tunnel is
     * associated.
     * 
     */
    public Output<Optional<String>> targetVpnGateway() {
        return Codegen.optional(this.targetVpnGateway);
    }
    /**
     * The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    @Export(name="tunnelId", type=String.class, parameters={})
    private Output<String> tunnelId;

    /**
     * @return The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    public Output<String> tunnelId() {
        return this.tunnelId;
    }
    /**
     * URL of the VPN gateway with which this VPN tunnel is associated.
     * This must be used if a High Availability VPN gateway resource is created.
     * This field must reference a `gcp.compute.HaVpnGateway` resource.
     * 
     */
    @Export(name="vpnGateway", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnGateway;

    /**
     * @return URL of the VPN gateway with which this VPN tunnel is associated.
     * This must be used if a High Availability VPN gateway resource is created.
     * This field must reference a `gcp.compute.HaVpnGateway` resource.
     * 
     */
    public Output<Optional<String>> vpnGateway() {
        return Codegen.optional(this.vpnGateway);
    }
    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @Export(name="vpnGatewayInterface", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> vpnGatewayInterface;

    /**
     * @return The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    public Output<Optional<Integer>> vpnGatewayInterface() {
        return Codegen.optional(this.vpnGatewayInterface);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VPNTunnel(String name) {
        this(name, VPNTunnelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VPNTunnel(String name, VPNTunnelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VPNTunnel(String name, VPNTunnelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/vPNTunnel:VPNTunnel", name, args == null ? VPNTunnelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VPNTunnel(String name, Output<String> id, @Nullable VPNTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/vPNTunnel:VPNTunnel", name, state, makeResourceOptions(options, id));
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
    public static VPNTunnel get(String name, Output<String> id, @Nullable VPNTunnelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VPNTunnel(name, id, state, options);
    }
}
