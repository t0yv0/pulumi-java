// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storage.BlobContainerImmutabilityPolicyArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The ImmutabilityPolicy property of a blob container, including Id, resource name, resource type, Etag.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * ### CreateOrUpdateImmutabilityPolicy
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
 *         var blobContainerImmutabilityPolicy = new BlobContainerImmutabilityPolicy(&#34;blobContainerImmutabilityPolicy&#34;, BlobContainerImmutabilityPolicyArgs.builder()        
 *             .accountName(&#34;sto7069&#34;)
 *             .allowProtectedAppendWrites(true)
 *             .containerName(&#34;container6397&#34;)
 *             .immutabilityPeriodSinceCreationInDays(3)
 *             .immutabilityPolicyName(&#34;default&#34;)
 *             .resourceGroupName(&#34;res1782&#34;)
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
 * $ pulumi import azure-native:storage:BlobContainerImmutabilityPolicy default /subscriptions/{subscription-id}/resourceGroups/res1782/providers/Microsoft.Storage/storageAccounts/sto7069/blobServices/default/containers/container6397/immutabilityPolicies/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:BlobContainerImmutabilityPolicy")
public class BlobContainerImmutabilityPolicy extends com.pulumi.resources.CustomResource {
    /**
     * This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
     * 
     */
    @Export(name="allowProtectedAppendWrites", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowProtectedAppendWrites;

    /**
     * @return This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
     * 
     */
    public Output<Optional<Boolean>> allowProtectedAppendWrites() {
        return Codegen.optional(this.allowProtectedAppendWrites);
    }
    /**
     * Resource Etag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Resource Etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    @Export(name="immutabilityPeriodSinceCreationInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> immutabilityPeriodSinceCreationInDays;

    /**
     * @return The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    public Output<Optional<Integer>> immutabilityPeriodSinceCreationInDays() {
        return Codegen.optional(this.immutabilityPeriodSinceCreationInDays);
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
     * The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BlobContainerImmutabilityPolicy(String name) {
        this(name, BlobContainerImmutabilityPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BlobContainerImmutabilityPolicy(String name, BlobContainerImmutabilityPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BlobContainerImmutabilityPolicy(String name, BlobContainerImmutabilityPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobContainerImmutabilityPolicy", name, args == null ? BlobContainerImmutabilityPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BlobContainerImmutabilityPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:BlobContainerImmutabilityPolicy", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:storage/v20180201:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20180301preview:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20180701:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20181101:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190401:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20190601:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20200801preview:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210101:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210201:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210401:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210601:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210801:BlobContainerImmutabilityPolicy").build()),
                Output.of(Alias.builder().type("azure-native:storage/v20210901:BlobContainerImmutabilityPolicy").build())
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
    public static BlobContainerImmutabilityPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BlobContainerImmutabilityPolicy(name, id, options);
    }
}
