// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.DataLakeGen2FilesystemArgs;
import com.pulumi.azure.storage.inputs.DataLakeGen2FilesystemState;
import com.pulumi.azure.storage.outputs.DataLakeGen2FilesystemAce;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Data Lake Gen2 File System within an Azure Storage Account.
 * 
 * &gt; **NOTE:** This resource requires some `Storage` specific roles which are not granted by default. Some of the built-ins roles that can be attributed are [`Storage Account Contributor`](https://docs.microsoft.com/en-us/azure/role-based-access-control/built-in-roles#storage-account-contributor), [`Storage Blob Data Owner`](https://docs.microsoft.com/en-us/azure/role-based-access-control/built-in-roles#storage-blob-data-owner), [`Storage Blob Data Contributor`](https://docs.microsoft.com/en-us/azure/role-based-access-control/built-in-roles#storage-blob-data-contributor), [`Storage Blob Data Reader`](https://docs.microsoft.com/en-us/azure/role-based-access-control/built-in-roles#storage-blob-data-reader).
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
 *             .accountKind(&#34;StorageV2&#34;)
 *             .isHnsEnabled(&#34;true&#34;)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .properties(Map.of(&#34;hello&#34;, &#34;aGVsbG8=&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Lake Gen2 File System&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/dataLakeGen2Filesystem:DataLakeGen2Filesystem queue1 https://account1.dfs.core.windows.net/fileSystem1
 * ```
 * 
 */
@ResourceType(type="azure:storage/dataLakeGen2Filesystem:DataLakeGen2Filesystem")
public class DataLakeGen2Filesystem extends com.pulumi.resources.CustomResource {
    /**
     * One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * 
     */
    @Export(name="aces", type=List.class, parameters={DataLakeGen2FilesystemAce.class})
    private Output<List<DataLakeGen2FilesystemAce>> aces;

    /**
     * @return One or more `ace` blocks as defined below to specify the entries for the ACL for the path.
     * 
     */
    public Output<List<DataLakeGen2FilesystemAce>> aces() {
        return this.aces;
    }
    /**
     * Specifies the Object ID of the Azure Active Directory Group to make the owning group of the root path (i.e. `/`). Possible values also include `$superuser`.
     * 
     */
    @Export(name="group", type=String.class, parameters={})
    private Output<String> group;

    /**
     * @return Specifies the Object ID of the Azure Active Directory Group to make the owning group of the root path (i.e. `/`). Possible values also include `$superuser`.
     * 
     */
    public Output<String> group() {
        return this.group;
    }
    /**
     * The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Data Lake Gen2 File System which should be created within the Storage Account. Must be unique within the storage account the queue is located. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the Object ID of the Azure Active Directory User to make the owning user of the root path (i.e. `/`). Possible values also include `$superuser`.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Specifies the Object ID of the Azure Active Directory User to make the owning user of the root path (i.e. `/`). Possible values also include `$superuser`.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * A mapping of Key to Base64-Encoded Values which should be assigned to this Data Lake Gen2 File System.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> properties;

    /**
     * @return A mapping of Key to Base64-Encoded Values which should be assigned to this Data Lake Gen2 File System.
     * 
     */
    public Output<Optional<Map<String,String>>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output<String> storageAccountId;

    /**
     * @return Specifies the ID of the Storage Account in which the Data Lake Gen2 File System should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataLakeGen2Filesystem(String name) {
        this(name, DataLakeGen2FilesystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataLakeGen2Filesystem(String name, DataLakeGen2FilesystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataLakeGen2Filesystem(String name, DataLakeGen2FilesystemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/dataLakeGen2Filesystem:DataLakeGen2Filesystem", name, args == null ? DataLakeGen2FilesystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataLakeGen2Filesystem(String name, Output<String> id, @Nullable DataLakeGen2FilesystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/dataLakeGen2Filesystem:DataLakeGen2Filesystem", name, state, makeResourceOptions(options, id));
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
    public static DataLakeGen2Filesystem get(String name, Output<String> id, @Nullable DataLakeGen2FilesystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataLakeGen2Filesystem(name, id, state, options);
    }
}
