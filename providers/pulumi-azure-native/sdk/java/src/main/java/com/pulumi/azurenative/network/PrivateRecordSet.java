// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.PrivateRecordSetArgs;
import com.pulumi.azurenative.network.outputs.ARecordResponse;
import com.pulumi.azurenative.network.outputs.AaaaRecordResponse;
import com.pulumi.azurenative.network.outputs.CnameRecordResponse;
import com.pulumi.azurenative.network.outputs.MxRecordResponse;
import com.pulumi.azurenative.network.outputs.PtrRecordResponse;
import com.pulumi.azurenative.network.outputs.SoaRecordResponse;
import com.pulumi.azurenative.network.outputs.SrvRecordResponse;
import com.pulumi.azurenative.network.outputs.TxtRecordResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Describes a DNS record set (a collection of DNS records with the same name and type) in a Private DNS zone.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * ### PUT Private DNS Zone A Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .aRecords(Map.of(&#34;ipv4Address&#34;, &#34;1.2.3.4&#34;))
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;A&#34;)
 *             .relativeRecordSetName(&#34;recordA&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone AAAA Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .aaaaRecords(Map.of(&#34;ipv6Address&#34;, &#34;::1&#34;))
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;AAAA&#34;)
 *             .relativeRecordSetName(&#34;recordAAAA&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone CNAME Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .cnameRecord(Map.of(&#34;cname&#34;, &#34;contoso.com&#34;))
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;CNAME&#34;)
 *             .relativeRecordSetName(&#34;recordCNAME&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone MX Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .mxRecords(Map.ofEntries(
 *                 Map.entry(&#34;exchange&#34;, &#34;mail.privatezone1.com&#34;),
 *                 Map.entry(&#34;preference&#34;, 0)
 *             ))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;MX&#34;)
 *             .relativeRecordSetName(&#34;recordMX&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone PTR Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;0.0.127.in-addr.arpa&#34;)
 *             .ptrRecords(Map.of(&#34;ptrdname&#34;, &#34;localhost&#34;))
 *             .recordType(&#34;PTR&#34;)
 *             .relativeRecordSetName(&#34;1&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone SOA Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;SOA&#34;)
 *             .relativeRecordSetName(&#34;@&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .soaRecord(Map.ofEntries(
 *                 Map.entry(&#34;email&#34;, &#34;azureprivatedns-hostmaster.microsoft.com&#34;),
 *                 Map.entry(&#34;expireTime&#34;, 2419200),
 *                 Map.entry(&#34;host&#34;, &#34;azureprivatedns.net&#34;),
 *                 Map.entry(&#34;minimumTtl&#34;, 300),
 *                 Map.entry(&#34;refreshTime&#34;, 3600),
 *                 Map.entry(&#34;retryTime&#34;, 300),
 *                 Map.entry(&#34;serialNumber&#34;, 1)
 *             ))
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone SRV Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;SRV&#34;)
 *             .relativeRecordSetName(&#34;recordSRV&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .srvRecords(Map.ofEntries(
 *                 Map.entry(&#34;port&#34;, 80),
 *                 Map.entry(&#34;priority&#34;, 0),
 *                 Map.entry(&#34;target&#34;, &#34;contoso.com&#34;),
 *                 Map.entry(&#34;weight&#34;, 10)
 *             ))
 *             .ttl(3600)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### PUT Private DNS Zone TXT Record Set
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
 *         var privateRecordSet = new PrivateRecordSet(&#34;privateRecordSet&#34;, PrivateRecordSetArgs.builder()        
 *             .metadata(Map.of(&#34;key1&#34;, &#34;value1&#34;))
 *             .privateZoneName(&#34;privatezone1.com&#34;)
 *             .recordType(&#34;TXT&#34;)
 *             .relativeRecordSetName(&#34;recordTXT&#34;)
 *             .resourceGroupName(&#34;resourceGroup1&#34;)
 *             .ttl(3600)
 *             .txtRecords(Map.of(&#34;value&#34;,             
 *                 &#34;string1&#34;,
 *                 &#34;string2&#34;))
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
 * $ pulumi import azure-native:network:PrivateRecordSet recordtxt /subscriptions/subscriptionId/resourceGroups/resourceGroup1/providers/Microsoft.Network/privateDnsZones/privatezone1.com/TXT/recordtxt 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:PrivateRecordSet")
public class PrivateRecordSet extends com.pulumi.resources.CustomResource {
    /**
     * The list of A records in the record set.
     * 
     */
    @Export(name="aRecords", type=List.class, parameters={ARecordResponse.class})
    private Output</* @Nullable */ List<ARecordResponse>> aRecords;

    /**
     * @return The list of A records in the record set.
     * 
     */
    public Output<Optional<List<ARecordResponse>>> aRecords() {
        return Codegen.optional(this.aRecords);
    }
    /**
     * The list of AAAA records in the record set.
     * 
     */
    @Export(name="aaaaRecords", type=List.class, parameters={AaaaRecordResponse.class})
    private Output</* @Nullable */ List<AaaaRecordResponse>> aaaaRecords;

    /**
     * @return The list of AAAA records in the record set.
     * 
     */
    public Output<Optional<List<AaaaRecordResponse>>> aaaaRecords() {
        return Codegen.optional(this.aaaaRecords);
    }
    /**
     * The CNAME record in the record set.
     * 
     */
    @Export(name="cnameRecord", type=CnameRecordResponse.class, parameters={})
    private Output</* @Nullable */ CnameRecordResponse> cnameRecord;

    /**
     * @return The CNAME record in the record set.
     * 
     */
    public Output<Optional<CnameRecordResponse>> cnameRecord() {
        return Codegen.optional(this.cnameRecord);
    }
    /**
     * The ETag of the record set.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return The ETag of the record set.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * Fully qualified domain name of the record set.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return Fully qualified domain name of the record set.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * Is the record set auto-registered in the Private DNS zone through a virtual network link?
     * 
     */
    @Export(name="isAutoRegistered", type=Boolean.class, parameters={})
    private Output<Boolean> isAutoRegistered;

    /**
     * @return Is the record set auto-registered in the Private DNS zone through a virtual network link?
     * 
     */
    public Output<Boolean> isAutoRegistered() {
        return this.isAutoRegistered;
    }
    /**
     * The metadata attached to the record set.
     * 
     */
    @Export(name="metadata", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return The metadata attached to the record set.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The list of MX records in the record set.
     * 
     */
    @Export(name="mxRecords", type=List.class, parameters={MxRecordResponse.class})
    private Output</* @Nullable */ List<MxRecordResponse>> mxRecords;

    /**
     * @return The list of MX records in the record set.
     * 
     */
    public Output<Optional<List<MxRecordResponse>>> mxRecords() {
        return Codegen.optional(this.mxRecords);
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
     * The list of PTR records in the record set.
     * 
     */
    @Export(name="ptrRecords", type=List.class, parameters={PtrRecordResponse.class})
    private Output</* @Nullable */ List<PtrRecordResponse>> ptrRecords;

    /**
     * @return The list of PTR records in the record set.
     * 
     */
    public Output<Optional<List<PtrRecordResponse>>> ptrRecords() {
        return Codegen.optional(this.ptrRecords);
    }
    /**
     * The SOA record in the record set.
     * 
     */
    @Export(name="soaRecord", type=SoaRecordResponse.class, parameters={})
    private Output</* @Nullable */ SoaRecordResponse> soaRecord;

    /**
     * @return The SOA record in the record set.
     * 
     */
    public Output<Optional<SoaRecordResponse>> soaRecord() {
        return Codegen.optional(this.soaRecord);
    }
    /**
     * The list of SRV records in the record set.
     * 
     */
    @Export(name="srvRecords", type=List.class, parameters={SrvRecordResponse.class})
    private Output</* @Nullable */ List<SrvRecordResponse>> srvRecords;

    /**
     * @return The list of SRV records in the record set.
     * 
     */
    public Output<Optional<List<SrvRecordResponse>>> srvRecords() {
        return Codegen.optional(this.srvRecords);
    }
    /**
     * The TTL (time-to-live) of the records in the record set.
     * 
     */
    @Export(name="ttl", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> ttl;

    /**
     * @return The TTL (time-to-live) of the records in the record set.
     * 
     */
    public Output<Optional<Double>> ttl() {
        return Codegen.optional(this.ttl);
    }
    /**
     * The list of TXT records in the record set.
     * 
     */
    @Export(name="txtRecords", type=List.class, parameters={TxtRecordResponse.class})
    private Output</* @Nullable */ List<TxtRecordResponse>> txtRecords;

    /**
     * @return The list of TXT records in the record set.
     * 
     */
    public Output<Optional<List<TxtRecordResponse>>> txtRecords() {
        return Codegen.optional(this.txtRecords);
    }
    /**
     * The type of the resource. Example - &#39;Microsoft.Network/privateDnsZones&#39;.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Example - &#39;Microsoft.Network/privateDnsZones&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateRecordSet(String name) {
        this(name, PrivateRecordSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateRecordSet(String name, PrivateRecordSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateRecordSet(String name, PrivateRecordSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateRecordSet", name, args == null ? PrivateRecordSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateRecordSet(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:PrivateRecordSet", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180901:PrivateRecordSet").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200101:PrivateRecordSet").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:PrivateRecordSet").build())
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
    public static PrivateRecordSet get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateRecordSet(name, id, options);
    }
}
