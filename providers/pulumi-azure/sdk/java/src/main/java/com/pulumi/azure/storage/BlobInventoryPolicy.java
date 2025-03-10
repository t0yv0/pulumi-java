// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.BlobInventoryPolicyArgs;
import com.pulumi.azure.storage.inputs.BlobInventoryPolicyState;
import com.pulumi.azure.storage.outputs.BlobInventoryPolicyRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Storage Blob Inventory Policy.
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .blobProperties(AccountBlobProperties.builder()
 *                 .versioningEnabled(true)
 *                 .build())
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.getName())
 *             .containerAccessType(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleBlobInventoryPolicy = new BlobInventoryPolicy(&#34;exampleBlobInventoryPolicy&#34;, BlobInventoryPolicyArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .rules(BlobInventoryPolicyRule.builder()
 *                 .name(&#34;rule1&#34;)
 *                 .storageContainerName(exampleContainer.getName())
 *                 .format(&#34;Csv&#34;)
 *                 .schedule(&#34;Daily&#34;)
 *                 .scope(&#34;Container&#34;)
 *                 .schemaFields(                
 *                     &#34;Name&#34;,
 *                     &#34;Last-Modified&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage Blob Inventory Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/blobInventoryPolicy:BlobInventoryPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Storage/storageAccounts/storageAccount1/inventoryPolicies/inventoryPolicy1
 * ```
 * 
 */
@ResourceType(type="azure:storage/blobInventoryPolicy:BlobInventoryPolicy")
public class BlobInventoryPolicy extends com.pulumi.resources.CustomResource {
    /**
     * One or more `rules` blocks as defined below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={BlobInventoryPolicyRule.class})
    private Output<List<BlobInventoryPolicyRule>> rules;

    /**
     * @return One or more `rules` blocks as defined below.
     * 
     */
    public Output<List<BlobInventoryPolicyRule>> rules() {
        return this.rules;
    }
    /**
     * The ID of the storage account to apply this Blob Inventory Policy to. Changing this forces a new Storage Blob Inventory Policy to be created.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output<String> storageAccountId;

    /**
     * @return The ID of the storage account to apply this Blob Inventory Policy to. Changing this forces a new Storage Blob Inventory Policy to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BlobInventoryPolicy(String name) {
        this(name, BlobInventoryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobInventoryPolicy(String name, BlobInventoryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobInventoryPolicy(String name, BlobInventoryPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/blobInventoryPolicy:BlobInventoryPolicy", name, args == null ? BlobInventoryPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BlobInventoryPolicy(String name, Output<String> id, @Nullable BlobInventoryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/blobInventoryPolicy:BlobInventoryPolicy", name, state, makeResourceOptions(options, id));
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
    public static BlobInventoryPolicy get(String name, Output<String> id, @Nullable BlobInventoryPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BlobInventoryPolicy(name, id, state, options);
    }
}
