// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.storage.ManagementPolicyArgs;
import com.pulumi.azure.storage.inputs.ManagementPolicyState;
import com.pulumi.azure.storage.outputs.ManagementPolicyRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Azure Storage Account Management Policy.
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
 *             .accountKind(&#34;BlobStorage&#34;)
 *             .build());
 * 
 *         var exampleManagementPolicy = new ManagementPolicy(&#34;exampleManagementPolicy&#34;, ManagementPolicyArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .rules(            
 *                 ManagementPolicyRule.builder()
 *                     .name(&#34;rule1&#34;)
 *                     .enabled(true)
 *                     .filters(ManagementPolicyRuleFilters.builder()
 *                         .prefixMatches(&#34;container1/prefix1&#34;)
 *                         .blobTypes(&#34;blockBlob&#34;)
 *                         .matchBlobIndexTags(ManagementPolicyRuleFiltersMatchBlobIndexTag.builder()
 *                             .name(&#34;tag1&#34;)
 *                             .operation(&#34;==&#34;)
 *                             .value(&#34;val1&#34;)
 *                             .build())
 *                         .build())
 *                     .actions(ManagementPolicyRuleActions.builder()
 *                         .baseBlob(ManagementPolicyRuleActionsBaseBlob.builder()
 *                             .tierToCoolAfterDaysSinceModificationGreaterThan(10)
 *                             .tierToArchiveAfterDaysSinceModificationGreaterThan(50)
 *                             .deleteAfterDaysSinceModificationGreaterThan(100)
 *                             .build())
 *                         .snapshot(ManagementPolicyRuleActionsSnapshot.builder()
 *                             .deleteAfterDaysSinceCreationGreaterThan(30)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 ManagementPolicyRule.builder()
 *                     .name(&#34;rule2&#34;)
 *                     .enabled(false)
 *                     .filters(ManagementPolicyRuleFilters.builder()
 *                         .prefixMatches(                        
 *                             &#34;container2/prefix1&#34;,
 *                             &#34;container2/prefix2&#34;)
 *                         .blobTypes(&#34;blockBlob&#34;)
 *                         .build())
 *                     .actions(ManagementPolicyRuleActions.builder()
 *                         .baseBlob(ManagementPolicyRuleActionsBaseBlob.builder()
 *                             .tierToCoolAfterDaysSinceModificationGreaterThan(11)
 *                             .tierToArchiveAfterDaysSinceModificationGreaterThan(51)
 *                             .deleteAfterDaysSinceModificationGreaterThan(101)
 *                             .build())
 *                         .snapshot(ManagementPolicyRuleActionsSnapshot.builder()
 *                             .changeTierToArchiveAfterDaysSinceCreation(90)
 *                             .changeTierToCoolAfterDaysSinceCreation(23)
 *                             .deleteAfterDaysSinceCreationGreaterThan(31)
 *                             .build())
 *                         .version(ManagementPolicyRuleActionsVersion.builder()
 *                             .changeTierToArchiveAfterDaysSinceCreation(9)
 *                             .changeTierToCoolAfterDaysSinceCreation(90)
 *                             .deleteAfterDaysSinceCreation(3)
 *                             .build())
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Storage Account Management Policies can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:storage/managementPolicy:ManagementPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Storage/storageAccounts/myaccountname/managementPolicies/default
 * ```
 * 
 */
@ResourceType(type="azure:storage/managementPolicy:ManagementPolicy")
public class ManagementPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A `rule` block as documented below.
     * 
     */
    @Export(name="rules", type=List.class, parameters={ManagementPolicyRule.class})
    private Output</* @Nullable */ List<ManagementPolicyRule>> rules;

    /**
     * @return A `rule` block as documented below.
     * 
     */
    public Output<Optional<List<ManagementPolicyRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Specifies the id of the storage account to apply the management policy to.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output<String> storageAccountId;

    /**
     * @return Specifies the id of the storage account to apply the management policy to.
     * 
     */
    public Output<String> storageAccountId() {
        return this.storageAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementPolicy(String name) {
        this(name, ManagementPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementPolicy(String name, ManagementPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementPolicy(String name, ManagementPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/managementPolicy:ManagementPolicy", name, args == null ? ManagementPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementPolicy(String name, Output<String> id, @Nullable ManagementPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:storage/managementPolicy:ManagementPolicy", name, state, makeResourceOptions(options, id));
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
    public static ManagementPolicy get(String name, Output<String> id, @Nullable ManagementPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementPolicy(name, id, state, options);
    }
}
