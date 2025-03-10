// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RouterNatArgs;
import com.pulumi.gcp.compute.inputs.RouterNatState;
import com.pulumi.gcp.compute.outputs.RouterNatLogConfig;
import com.pulumi.gcp.compute.outputs.RouterNatSubnetwork;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A NAT service created in a router.
 * 
 * To get more information about RouterNat, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
 * * How-to Guides
 *     * [Google Cloud Router](https://cloud.google.com/router/docs/)
 * 
 * ## Example Usage
 * ### Router Nat Basic
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
 *         var net = new Network(&#34;net&#34;);
 * 
 *         var subnet = new Subnetwork(&#34;subnet&#34;, SubnetworkArgs.builder()        
 *             .network(net.getId())
 *             .ipCidrRange(&#34;10.0.0.0/16&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var router = new Router(&#34;router&#34;, RouterArgs.builder()        
 *             .region(subnet.getRegion())
 *             .network(net.getId())
 *             .bgp(RouterBgp.builder()
 *                 .asn(64514)
 *                 .build())
 *             .build());
 * 
 *         var nat = new RouterNat(&#34;nat&#34;, RouterNatArgs.builder()        
 *             .router(router.getName())
 *             .region(router.getRegion())
 *             .natIpAllocateOption(&#34;AUTO_ONLY&#34;)
 *             .sourceSubnetworkIpRangesToNat(&#34;ALL_SUBNETWORKS_ALL_IP_RANGES&#34;)
 *             .logConfig(RouterNatLogConfig.builder()
 *                 .enable(true)
 *                 .filter(&#34;ERRORS_ONLY&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Router Nat Manual Ips
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.codegen.internal.KeyedValue;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var net = new Network(&#34;net&#34;);
 * 
 *         var subnet = new Subnetwork(&#34;subnet&#34;, SubnetworkArgs.builder()        
 *             .network(net.getId())
 *             .ipCidrRange(&#34;10.0.0.0/16&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *         var router = new Router(&#34;router&#34;, RouterArgs.builder()        
 *             .region(subnet.getRegion())
 *             .network(net.getId())
 *             .build());
 * 
 *         for (var i = 0; i &lt; 2; i++) {
 *             new Address(&#34;address-&#34; + i, AddressArgs.builder()            
 *                 .region(subnet.getRegion())
 *                 .build());
 * 
 *         
 * }
 *         var natManual = new RouterNat(&#34;natManual&#34;, RouterNatArgs.builder()        
 *             .router(router.getName())
 *             .region(router.getRegion())
 *             .natIpAllocateOption(&#34;MANUAL_ONLY&#34;)
 *             .natIps(address.stream().map(element -&gt; element.getSelfLink()).collect(toList()))
 *             .sourceSubnetworkIpRangesToNat(&#34;LIST_OF_SUBNETWORKS&#34;)
 *             .subnetworks(RouterNatSubnetwork.builder()
 *                 .name(subnet.getId())
 *                 .sourceIpRangesToNats(&#34;ALL_IP_RANGES&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * RouterNat can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default projects/{{project}}/regions/{{region}}/routers/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default {{project}}/{{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default {{region}}/{{router}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/routerNat:RouterNat default {{router}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/routerNat:RouterNat")
public class RouterNat extends com.pulumi.resources.CustomResource {
    /**
     * A list of URLs of the IP resources to be drained. These IPs must be
     * valid static external IPs that have been assigned to the NAT.
     * 
     */
    @Export(name="drainNatIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> drainNatIps;

    /**
     * @return A list of URLs of the IP resources to be drained. These IPs must be
     * valid static external IPs that have been assigned to the NAT.
     * 
     */
    public Output<Optional<List<String>>> drainNatIps() {
        return Codegen.optional(this.drainNatIps);
    }
    /**
     * Specifies if endpoint independent mapping is enabled. This is enabled by default. For more information
     * see the [official documentation](https://cloud.google.com/nat/docs/overview#specs-rfcs).
     * 
     */
    @Export(name="enableEndpointIndependentMapping", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableEndpointIndependentMapping;

    /**
     * @return Specifies if endpoint independent mapping is enabled. This is enabled by default. For more information
     * see the [official documentation](https://cloud.google.com/nat/docs/overview#specs-rfcs).
     * 
     */
    public Output<Optional<Boolean>> enableEndpointIndependentMapping() {
        return Codegen.optional(this.enableEndpointIndependentMapping);
    }
    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    @Export(name="icmpIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> icmpIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    public Output<Optional<Integer>> icmpIdleTimeoutSec() {
        return Codegen.optional(this.icmpIdleTimeoutSec);
    }
    /**
     * Configuration for logging on NAT
     * Structure is documented below.
     * 
     */
    @Export(name="logConfig", type=RouterNatLogConfig.class, parameters={})
    private Output</* @Nullable */ RouterNatLogConfig> logConfig;

    /**
     * @return Configuration for logging on NAT
     * Structure is documented below.
     * 
     */
    public Output<Optional<RouterNatLogConfig>> logConfig() {
        return Codegen.optional(this.logConfig);
    }
    /**
     * Minimum number of ports allocated to a VM from this NAT.
     * 
     */
    @Export(name="minPortsPerVm", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minPortsPerVm;

    /**
     * @return Minimum number of ports allocated to a VM from this NAT.
     * 
     */
    public Output<Optional<Integer>> minPortsPerVm() {
        return Codegen.optional(this.minPortsPerVm);
    }
    /**
     * Self-link of subnetwork to NAT
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Self-link of subnetwork to NAT
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * How external IPs should be allocated for this NAT. Valid values are
     * `AUTO_ONLY` for only allowing NAT IPs allocated by Google Cloud
     * Platform, or `MANUAL_ONLY` for only user-allocated NAT IP addresses.
     * Possible values are `MANUAL_ONLY` and `AUTO_ONLY`.
     * 
     */
    @Export(name="natIpAllocateOption", type=String.class, parameters={})
    private Output<String> natIpAllocateOption;

    /**
     * @return How external IPs should be allocated for this NAT. Valid values are
     * `AUTO_ONLY` for only allowing NAT IPs allocated by Google Cloud
     * Platform, or `MANUAL_ONLY` for only user-allocated NAT IP addresses.
     * Possible values are `MANUAL_ONLY` and `AUTO_ONLY`.
     * 
     */
    public Output<String> natIpAllocateOption() {
        return this.natIpAllocateOption;
    }
    /**
     * Self-links of NAT IPs. Only valid if natIpAllocateOption
     * is set to MANUAL_ONLY.
     * 
     */
    @Export(name="natIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> natIps;

    /**
     * @return Self-links of NAT IPs. Only valid if natIpAllocateOption
     * is set to MANUAL_ONLY.
     * 
     */
    public Output<Optional<List<String>>> natIps() {
        return Codegen.optional(this.natIps);
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
     * Region where the router and NAT reside.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the router and NAT reside.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The name of the Cloud Router in which this NAT will be configured.
     * 
     */
    @Export(name="router", type=String.class, parameters={})
    private Output<String> router;

    /**
     * @return The name of the Cloud Router in which this NAT will be configured.
     * 
     */
    public Output<String> router() {
        return this.router;
    }
    /**
     * How NAT should be configured per Subnetwork.
     * If `ALL_SUBNETWORKS_ALL_IP_RANGES`, all of the
     * IP ranges in every Subnetwork are allowed to Nat.
     * If `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, all of the primary IP
     * ranges in every Subnetwork are allowed to Nat.
     * `LIST_OF_SUBNETWORKS`: A list of Subnetworks are allowed to Nat
     * (specified in the field subnetwork below). Note that if this field
     * contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any
     * other RouterNat section in any Router for this network in this region.
     * Possible values are `ALL_SUBNETWORKS_ALL_IP_RANGES`, `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, and `LIST_OF_SUBNETWORKS`.
     * 
     */
    @Export(name="sourceSubnetworkIpRangesToNat", type=String.class, parameters={})
    private Output<String> sourceSubnetworkIpRangesToNat;

    /**
     * @return How NAT should be configured per Subnetwork.
     * If `ALL_SUBNETWORKS_ALL_IP_RANGES`, all of the
     * IP ranges in every Subnetwork are allowed to Nat.
     * If `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, all of the primary IP
     * ranges in every Subnetwork are allowed to Nat.
     * `LIST_OF_SUBNETWORKS`: A list of Subnetworks are allowed to Nat
     * (specified in the field subnetwork below). Note that if this field
     * contains ALL_SUBNETWORKS_ALL_IP_RANGES or
     * ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any
     * other RouterNat section in any Router for this network in this region.
     * Possible values are `ALL_SUBNETWORKS_ALL_IP_RANGES`, `ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES`, and `LIST_OF_SUBNETWORKS`.
     * 
     */
    public Output<String> sourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat;
    }
    /**
     * One or more subnetwork NAT configurations. Only used if
     * `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * 
     */
    @Export(name="subnetworks", type=List.class, parameters={RouterNatSubnetwork.class})
    private Output</* @Nullable */ List<RouterNatSubnetwork>> subnetworks;

    /**
     * @return One or more subnetwork NAT configurations. Only used if
     * `source_subnetwork_ip_ranges_to_nat` is set to `LIST_OF_SUBNETWORKS`
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<RouterNatSubnetwork>>> subnetworks() {
        return Codegen.optional(this.subnetworks);
    }
    /**
     * Timeout (in seconds) for TCP established connections.
     * Defaults to 1200s if not set.
     * 
     */
    @Export(name="tcpEstablishedIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tcpEstablishedIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for TCP established connections.
     * Defaults to 1200s if not set.
     * 
     */
    public Output<Optional<Integer>> tcpEstablishedIdleTimeoutSec() {
        return Codegen.optional(this.tcpEstablishedIdleTimeoutSec);
    }
    /**
     * Timeout (in seconds) for TCP transitory connections.
     * Defaults to 30s if not set.
     * 
     */
    @Export(name="tcpTransitoryIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tcpTransitoryIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for TCP transitory connections.
     * Defaults to 30s if not set.
     * 
     */
    public Output<Optional<Integer>> tcpTransitoryIdleTimeoutSec() {
        return Codegen.optional(this.tcpTransitoryIdleTimeoutSec);
    }
    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    @Export(name="udpIdleTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> udpIdleTimeoutSec;

    /**
     * @return Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    public Output<Optional<Integer>> udpIdleTimeoutSec() {
        return Codegen.optional(this.udpIdleTimeoutSec);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouterNat(String name) {
        this(name, RouterNatArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouterNat(String name, RouterNatArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouterNat(String name, RouterNatArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerNat:RouterNat", name, args == null ? RouterNatArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouterNat(String name, Output<String> id, @Nullable RouterNatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/routerNat:RouterNat", name, state, makeResourceOptions(options, id));
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
    public static RouterNat get(String name, Output<String> id, @Nullable RouterNatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouterNat(name, id, state, options);
    }
}
