// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.batch;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.batch.AccountArgs;
import com.pulumi.azure.batch.inputs.AccountState;
import com.pulumi.azure.batch.outputs.AccountEncryption;
import com.pulumi.azure.batch.outputs.AccountIdentity;
import com.pulumi.azure.batch.outputs.AccountKeyVaultReference;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Batch account.
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
 *             .build());
 * 
 *         var exampleBatch_accountAccount = new Account(&#34;exampleBatch/accountAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .poolAllocationMode(&#34;BatchService&#34;)
 *             .storageAccountId(exampleAccount.getId())
 *             .tags(Map.of(&#34;env&#34;, &#34;test&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Batch Account can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:batch/account:Account example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Batch/batchAccounts/account1
 * ```
 * 
 */
@ResourceType(type="azure:batch/account:Account")
public class Account extends com.pulumi.resources.CustomResource {
    /**
     * The account endpoint used to interact with the Batch service.
     * 
     */
    @Export(name="accountEndpoint", type=String.class, parameters={})
    private Output<String> accountEndpoint;

    /**
     * @return The account endpoint used to interact with the Batch service.
     * 
     */
    public Output<String> accountEndpoint() {
        return this.accountEndpoint;
    }
    /**
     * Specifies if customer managed key encryption should be used to encrypt batch account data.
     * 
     */
    @Export(name="encryption", type=AccountEncryption.class, parameters={})
    private Output</* @Nullable */ AccountEncryption> encryption;

    /**
     * @return Specifies if customer managed key encryption should be used to encrypt batch account data.
     * 
     */
    public Output<Optional<AccountEncryption>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=AccountIdentity.class, parameters={})
    private Output</* @Nullable */ AccountIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<AccountIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * A `key_vault_reference` block that describes the Azure KeyVault reference to use when deploying the Azure Batch account using the `UserSubscription` pool allocation mode.
     * 
     */
    @Export(name="keyVaultReference", type=AccountKeyVaultReference.class, parameters={})
    private Output</* @Nullable */ AccountKeyVaultReference> keyVaultReference;

    /**
     * @return A `key_vault_reference` block that describes the Azure KeyVault reference to use when deploying the Azure Batch account using the `UserSubscription` pool allocation mode.
     * 
     */
    public Output<Optional<AccountKeyVaultReference>> keyVaultReference() {
        return Codegen.optional(this.keyVaultReference);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the Batch account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Batch account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the mode to use for pool allocation. Possible values are `BatchService` or `UserSubscription`. Defaults to `BatchService`.
     * 
     */
    @Export(name="poolAllocationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> poolAllocationMode;

    /**
     * @return Specifies the mode to use for pool allocation. Possible values are `BatchService` or `UserSubscription`. Defaults to `BatchService`.
     * 
     */
    public Output<Optional<String>> poolAllocationMode() {
        return Codegen.optional(this.poolAllocationMode);
    }
    /**
     * The Batch account primary access key.
     * 
     */
    @Export(name="primaryAccessKey", type=String.class, parameters={})
    private Output<String> primaryAccessKey;

    /**
     * @return The Batch account primary access key.
     * 
     */
    public Output<String> primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * Whether public network access is allowed for this server. Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether public network access is allowed for this server. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Batch account. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Batch account secondary access key.
     * 
     */
    @Export(name="secondaryAccessKey", type=String.class, parameters={})
    private Output<String> secondaryAccessKey;

    /**
     * @return The Batch account secondary access key.
     * 
     */
    public Output<String> secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    /**
     * Specifies the storage account to use for the Batch account. If not specified, Azure Batch will manage the storage.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output<String> storageAccountId;

    /**
     * @return Specifies the storage account to use for the Batch account. If not specified, Azure Batch will manage the storage.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
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

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Account(String name) {
        this(name, AccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Account(String name, AccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Account(String name, AccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:batch/account:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Account(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:batch/account:Account", name, state, makeResourceOptions(options, id));
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
    public static Account get(String name, Output<String> id, @Nullable AccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, state, options);
    }
}
