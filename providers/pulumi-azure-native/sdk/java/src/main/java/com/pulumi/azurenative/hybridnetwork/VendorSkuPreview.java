// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hybridnetwork.VendorSkuPreviewArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Customer subscription which can use a sku.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * ### Create or update preview subscription of vendor sku sub resource
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
 *         var vendorSkuPreview = new VendorSkuPreview(&#34;vendorSkuPreview&#34;, VendorSkuPreviewArgs.builder()        
 *             .previewSubscription(&#34;previewSub&#34;)
 *             .skuName(&#34;TestSku&#34;)
 *             .vendorName(&#34;TestVendor&#34;)
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
 * $ pulumi import azure-native:hybridnetwork:VendorSkuPreview previewSub /subscriptions/subid/providers/Microsoft.HybridNetwork/vendors/TestVendor/vendorskus/TestSku/previewsubscriptions/previewSub 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybridnetwork:VendorSkuPreview")
public class VendorSkuPreview extends com.pulumi.resources.CustomResource {
    /**
     * The preview subscription ID.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The preview subscription ID.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VendorSkuPreview(String name) {
        this(name, VendorSkuPreviewArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VendorSkuPreview(String name, VendorSkuPreviewArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VendorSkuPreview(String name, VendorSkuPreviewArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkuPreview", name, args == null ? VendorSkuPreviewArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VendorSkuPreview(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybridnetwork:VendorSkuPreview", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20200101preview:VendorSkuPreview").build()),
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20210501:VendorSkuPreview").build()),
                Output.of(Alias.builder().type("azure-native:hybridnetwork/v20220101preview:VendorSkuPreview").build())
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
    public static VendorSkuPreview get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VendorSkuPreview(name, id, options);
    }
}
