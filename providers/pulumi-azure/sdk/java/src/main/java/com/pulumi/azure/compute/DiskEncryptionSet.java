// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.compute.DiskEncryptionSetArgs;
import com.pulumi.azure.compute.inputs.DiskEncryptionSetState;
import com.pulumi.azure.compute.outputs.DiskEncryptionSetIdentity;
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
 * Manages a Disk Encryption Set.
 * 
 * &gt; **NOTE:** At this time the Key Vault used to store the Active Key for this Disk Encryption Set must have both Soft Delete &amp; Purge Protection enabled - which are not yet supported by this provider.
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .skuName(&#34;premium&#34;)
 *             .enabledForDiskEncryption(true)
 *             .purgeProtectionEnabled(true)
 *             .build());
 * 
 *         var example_user = new AccessPolicy(&#34;example-user&#34;, AccessPolicyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.getId())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .objectId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getObjectId()))
 *             .keyPermissions(            
 *                 &#34;get&#34;,
 *                 &#34;create&#34;,
 *                 &#34;delete&#34;)
 *             .build());
 * 
 *         var exampleKey = new Key(&#34;exampleKey&#34;, KeyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.getId())
 *             .keyType(&#34;RSA&#34;)
 *             .keySize(2048)
 *             .keyOpts(            
 *                 &#34;decrypt&#34;,
 *                 &#34;encrypt&#34;,
 *                 &#34;sign&#34;,
 *                 &#34;unwrapKey&#34;,
 *                 &#34;verify&#34;,
 *                 &#34;wrapKey&#34;)
 *             .build());
 * 
 *         var exampleDiskEncryptionSet = new DiskEncryptionSet(&#34;exampleDiskEncryptionSet&#34;, DiskEncryptionSetArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .keyVaultKeyId(exampleKey.getId())
 *             .identity(DiskEncryptionSetIdentity.builder()
 *                 .type(&#34;SystemAssigned&#34;)
 *                 .build())
 *             .build());
 * 
 *         var example_disk = new AccessPolicy(&#34;example-disk&#34;, AccessPolicyArgs.builder()        
 *             .keyVaultId(exampleKeyVault.getId())
 *             .tenantId(exampleDiskEncryptionSet.getIdentity().apply(identity -&gt; identity.getTenantId()))
 *             .objectId(exampleDiskEncryptionSet.getIdentity().apply(identity -&gt; identity.getPrincipalId()))
 *             .keyPermissions(            
 *                 &#34;Get&#34;,
 *                 &#34;WrapKey&#34;,
 *                 &#34;UnwrapKey&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Disk Encryption Sets can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:compute/diskEncryptionSet:DiskEncryptionSet example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Compute/diskEncryptionSets/encryptionSet1
 * ```
 * 
 */
@ResourceType(type="azure:compute/diskEncryptionSet:DiskEncryptionSet")
public class DiskEncryptionSet extends com.pulumi.resources.CustomResource {
    /**
     * Boolean flag to specify whether Azure Disk Encryption Set automatically rotates encryption Key to latest version. Defaults to `false`.
     * 
     */
    @Export(name="autoKeyRotationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoKeyRotationEnabled;

    /**
     * @return Boolean flag to specify whether Azure Disk Encryption Set automatically rotates encryption Key to latest version. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> autoKeyRotationEnabled() {
        return Codegen.optional(this.autoKeyRotationEnabled);
    }
    /**
     * The type of key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerKey` and `EncryptionAtRestWithPlatformAndCustomerKeys`. Defaults to `EncryptionAtRestWithCustomerKey`.
     * 
     */
    @Export(name="encryptionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionType;

    /**
     * @return The type of key used to encrypt the data of the disk. Possible values are `EncryptionAtRestWithCustomerKey` and `EncryptionAtRestWithPlatformAndCustomerKeys`. Defaults to `EncryptionAtRestWithCustomerKey`.
     * 
     */
    public Output<Optional<String>> encryptionType() {
        return Codegen.optional(this.encryptionType);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=DiskEncryptionSetIdentity.class, parameters={})
    private Output<DiskEncryptionSetIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<DiskEncryptionSetIdentity> identity() {
        return this.identity;
    }
    /**
     * Specifies the URL to a Key Vault Key (either from a Key Vault Key, or the Key URL for the Key Vault Secret).
     * 
     */
    @Export(name="keyVaultKeyId", type=String.class, parameters={})
    private Output<String> keyVaultKeyId;

    /**
     * @return Specifies the URL to a Key Vault Key (either from a Key Vault Key, or the Key URL for the Key Vault Secret).
     * 
     */
    public Output<String> keyVaultKeyId() {
        return this.keyVaultKeyId;
    }
    /**
     * Specifies the Azure Region where the Disk Encryption Set exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the Azure Region where the Disk Encryption Set exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the Disk Encryption Set. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Disk Encryption Set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the Resource Group where the Disk Encryption Set should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group where the Disk Encryption Set should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags to assign to the Disk Encryption Set.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the Disk Encryption Set.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiskEncryptionSet(String name) {
        this(name, DiskEncryptionSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiskEncryptionSet(String name, DiskEncryptionSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiskEncryptionSet(String name, DiskEncryptionSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskEncryptionSet:DiskEncryptionSet", name, args == null ? DiskEncryptionSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiskEncryptionSet(String name, Output<String> id, @Nullable DiskEncryptionSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:compute/diskEncryptionSet:DiskEncryptionSet", name, state, makeResourceOptions(options, id));
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
    public static DiskEncryptionSet get(String name, Output<String> id, @Nullable DiskEncryptionSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiskEncryptionSet(name, id, state, options);
    }
}
