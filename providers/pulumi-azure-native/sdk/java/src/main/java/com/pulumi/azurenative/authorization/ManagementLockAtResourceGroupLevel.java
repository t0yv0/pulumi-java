// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.authorization.ManagementLockAtResourceGroupLevelArgs;
import com.pulumi.azurenative.authorization.outputs.ManagementLockOwnerResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The lock information.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * ### Create management lock at resource group level
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
 *         var managementLockAtResourceGroupLevel = new ManagementLockAtResourceGroupLevel(&#34;managementLockAtResourceGroupLevel&#34;, ManagementLockAtResourceGroupLevelArgs.builder()        
 *             .level(&#34;ReadOnly&#34;)
 *             .lockName(&#34;testlock&#34;)
 *             .resourceGroupName(&#34;resourcegroupname&#34;)
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
 * $ pulumi import azure-native:authorization:ManagementLockAtResourceGroupLevel testlock /subscriptions/subscriptionId/resourceGroups/resourcegroupname/providers/Microsoft.Authorization/locks/testlock 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:ManagementLockAtResourceGroupLevel")
public class ManagementLockAtResourceGroupLevel extends com.pulumi.resources.CustomResource {
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can&#39;t modify or delete it.
     * 
     */
    @Export(name="level", type=String.class, parameters={})
    private Output<String> level;

    /**
     * @return The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can&#39;t modify or delete it.
     * 
     */
    public Output<String> level() {
        return this.level;
    }
    /**
     * The name of the lock.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lock.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @Export(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return Notes about the lock. Maximum of 512 characters.
     * 
     */
    public Output<Optional<String>> notes() {
        return Codegen.optional(this.notes);
    }
    /**
     * The owners of the lock.
     * 
     */
    @Export(name="owners", type=List.class, parameters={ManagementLockOwnerResponse.class})
    private Output</* @Nullable */ List<ManagementLockOwnerResponse>> owners;

    /**
     * @return The owners of the lock.
     * 
     */
    public Output<Optional<List<ManagementLockOwnerResponse>>> owners() {
        return Codegen.optional(this.owners);
    }
    /**
     * The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementLockAtResourceGroupLevel(String name) {
        this(name, ManagementLockAtResourceGroupLevelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementLockAtResourceGroupLevel(String name, ManagementLockAtResourceGroupLevelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementLockAtResourceGroupLevel(String name, ManagementLockAtResourceGroupLevelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockAtResourceGroupLevel", name, args == null ? ManagementLockAtResourceGroupLevelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementLockAtResourceGroupLevel(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockAtResourceGroupLevel", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20150101:ManagementLockAtResourceGroupLevel").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20160901:ManagementLockAtResourceGroupLevel").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20170401:ManagementLockAtResourceGroupLevel").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200501:ManagementLockAtResourceGroupLevel").build())
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
    public static ManagementLockAtResourceGroupLevel get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementLockAtResourceGroupLevel(name, id, options);
    }
}
