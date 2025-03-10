// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.privatedns.MxRecordArgs;
import com.pulumi.azure.privatedns.inputs.MxRecordState;
import com.pulumi.azure.privatedns.outputs.MxRecordRecord;
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
 * Enables you to manage DNS MX Records within Azure Private DNS.
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
 *         var exampleZone = new Zone(&#34;exampleZone&#34;, ZoneArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleMxRecord = new MxRecord(&#34;exampleMxRecord&#34;, MxRecordArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .zoneName(exampleZone.getName())
 *             .ttl(300)
 *             .records(            
 *                 MxRecordRecord.builder()
 *                     .preference(10)
 *                     .exchange(&#34;mx1.contoso.com&#34;)
 *                     .build(),
 *                 MxRecordRecord.builder()
 *                     .preference(20)
 *                     .exchange(&#34;backupmx.contoso.com&#34;)
 *                     .build())
 *             .tags(Map.of(&#34;Environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Private DNS MX Records can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:privatedns/mxRecord:MxRecord example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Network/privateDnsZones/contoso.com/MX/@
 * ```
 * 
 */
@ResourceType(type="azure:privatedns/mxRecord:MxRecord")
public class MxRecord extends com.pulumi.resources.CustomResource {
    /**
     * The FQDN of the DNS MX Record.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return The FQDN of the DNS MX Record.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * The name of the DNS MX Record. Changing this forces a new resource to be created. Default to &#39;@&#39; for root zone entry.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the DNS MX Record. Changing this forces a new resource to be created. Default to &#39;@&#39; for root zone entry.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `record` blocks as defined below.
     * 
     */
    @Export(name="records", type=List.class, parameters={MxRecordRecord.class})
    private Output<List<MxRecordRecord>> records;

    /**
     * @return One or more `record` blocks as defined below.
     * 
     */
    public Output<List<MxRecordRecord>> records() {
        return this.records;
    }
    /**
     * Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
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
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output<Integer> ttl;

    public Output<Integer> ttl() {
        return this.ttl;
    }
    /**
     * Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="zoneName", type=String.class, parameters={})
    private Output<String> zoneName;

    /**
     * @return Specifies the Private DNS Zone where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MxRecord(String name) {
        this(name, MxRecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MxRecord(String name, MxRecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MxRecord(String name, MxRecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/mxRecord:MxRecord", name, args == null ? MxRecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MxRecord(String name, Output<String> id, @Nullable MxRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:privatedns/mxRecord:MxRecord", name, state, makeResourceOptions(options, id));
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
    public static MxRecord get(String name, Output<String> id, @Nullable MxRecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MxRecord(name, id, state, options);
    }
}
