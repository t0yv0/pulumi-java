// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.aadiam.PrivateLinkForAzureAdArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * PrivateLink Policy configuration object.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * ### privateLinkPolicyCreate
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
 *         var privateLinkForAzureAd = new PrivateLinkForAzureAd(&#34;privateLinkForAzureAd&#34;, PrivateLinkForAzureAdArgs.builder()        
 *             .allTenants(false)
 *             .name(&#34;myOrgPrivateLinkPolicy&#34;)
 *             .ownerTenantId(&#34;950f8bca-bf4d-4a41-ad10-034e792a243d&#34;)
 *             .policyName(&#34;ddb1&#34;)
 *             .resourceGroup(&#34;myOrgVnetRG&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .resourceName(&#34;myOrgVnetPrivateLink&#34;)
 *             .subscriptionId(&#34;57849194-ea1f-470b-abda-d195b25634c1&#34;)
 *             .tenants(            
 *                 &#34;3616657d-1c80-41ae-9d83-2a2776f2c9be&#34;,
 *                 &#34;727b6ef1-18ab-4627-ac95-3f9cd945ed87&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### privateLinkPolicyMinCreate
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
 *         var privateLinkForAzureAd = new PrivateLinkForAzureAd(&#34;privateLinkForAzureAd&#34;, PrivateLinkForAzureAdArgs.builder()        
 *             .allTenants(false)
 *             .name(&#34;myOrgPrivateLinkPolicy&#34;)
 *             .ownerTenantId(&#34;950f8bca-bf4d-4a41-ad10-034e792a243d&#34;)
 *             .policyName(&#34;ddb1&#34;)
 *             .resourceGroup(&#34;myOrgVnetRG&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .resourceName(&#34;myOrgVnetPrivateLink&#34;)
 *             .subscriptionId(&#34;57849194-ea1f-470b-abda-d195b25634c1&#34;)
 *             .tenants(            
 *                 &#34;3616657d-1c80-41ae-9d83-2a2776f2c9be&#34;,
 *                 &#34;727b6ef1-18ab-4627-ac95-3f9cd945ed87&#34;)
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
 * $ pulumi import azure-native:aadiam:privateLinkForAzureAd myOrgPrivateLinkPolicy /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/microsoft.aadiam/privateLinkForAzureAd/{policyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:aadiam:privateLinkForAzureAd")
public class PrivateLinkForAzureAd extends com.pulumi.resources.CustomResource {
    /**
     * Flag indicating whether all tenants are allowed
     * 
     */
    @Export(name="allTenants", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allTenants;

    /**
     * @return Flag indicating whether all tenants are allowed
     * 
     */
    public Output<Optional<Boolean>> allTenants() {
        return Codegen.optional(this.allTenants);
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Guid of the owner tenant
     * 
     */
    @Export(name="ownerTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerTenantId;

    /**
     * @return Guid of the owner tenant
     * 
     */
    public Output<Optional<String>> ownerTenantId() {
        return Codegen.optional(this.ownerTenantId);
    }
    /**
     * Name of the resource group
     * 
     */
    @Export(name="resourceGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroup;

    /**
     * @return Name of the resource group
     * 
     */
    public Output<Optional<String>> resourceGroup() {
        return Codegen.optional(this.resourceGroup);
    }
    /**
     * Name of the private link policy resource
     * 
     */
    @Export(name="resourceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceName;

    /**
     * @return Name of the private link policy resource
     * 
     */
    public Output<Optional<String>> resourceName() {
        return Codegen.optional(this.resourceName);
    }
    /**
     * Subscription Identifier
     * 
     */
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> subscriptionId;

    /**
     * @return Subscription Identifier
     * 
     */
    public Output<Optional<String>> subscriptionId() {
        return Codegen.optional(this.subscriptionId);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The list of tenantIds.
     * 
     */
    @Export(name="tenants", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tenants;

    /**
     * @return The list of tenantIds.
     * 
     */
    public Output<Optional<List<String>>> tenants() {
        return Codegen.optional(this.tenants);
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateLinkForAzureAd(String name) {
        this(name, PrivateLinkForAzureAdArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateLinkForAzureAd(String name, PrivateLinkForAzureAdArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateLinkForAzureAd(String name, PrivateLinkForAzureAdArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:privateLinkForAzureAd", name, args == null ? PrivateLinkForAzureAdArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PrivateLinkForAzureAd(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:privateLinkForAzureAd", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:aadiam/v20200301:privateLinkForAzureAd").build()),
                Output.of(Alias.builder().type("azure-native:aadiam/v20200301preview:privateLinkForAzureAd").build())
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
    public static PrivateLinkForAzureAd get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateLinkForAzureAd(name, id, options);
    }
}
