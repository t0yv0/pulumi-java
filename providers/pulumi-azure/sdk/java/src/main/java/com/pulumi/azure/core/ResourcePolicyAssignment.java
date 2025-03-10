// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.core.ResourcePolicyAssignmentArgs;
import com.pulumi.azure.core.inputs.ResourcePolicyAssignmentState;
import com.pulumi.azure.core.outputs.ResourcePolicyAssignmentIdentity;
import com.pulumi.azure.core.outputs.ResourcePolicyAssignmentNonComplianceMessage;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Policy Assignment to a Resource.
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
 *         final var exampleVirtualNetwork = Output.of(NetworkFunctions.getVirtualNetwork(GetVirtualNetworkArgs.builder()
 *             .name(&#34;production&#34;)
 *             .resourceGroupName(&#34;networking&#34;)
 *             .build()));
 * 
 *         var exampleDefinition = new Definition(&#34;exampleDefinition&#34;, DefinitionArgs.builder()        
 *             .policyType(&#34;Custom&#34;)
 *             .mode(&#34;All&#34;)
 *             .policyRule(&#34;&#34;&#34;
 * 	{
 *     &#34;if&#34;: {
 *       &#34;not&#34;: {
 *         &#34;field&#34;: &#34;location&#34;,
 *         &#34;equals&#34;: &#34;westeurope&#34;
 *       }
 *     },
 *     &#34;then&#34;: {
 *       &#34;effect&#34;: &#34;Deny&#34;
 *     }
 *   }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleResourcePolicyAssignment = new ResourcePolicyAssignment(&#34;exampleResourcePolicyAssignment&#34;, ResourcePolicyAssignmentArgs.builder()        
 *             .resourceId(exampleVirtualNetwork.apply(getVirtualNetworkResult -&gt; getVirtualNetworkResult.getId()))
 *             .policyDefinitionId(exampleDefinition.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Resource Policy Assignments can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:core/resourcePolicyAssignment:ResourcePolicyAssignment example &#34;{resource}/providers/Microsoft.Authorization/policyAssignments/assignment1&#34;
 * ```
 * 
 *  where `{resource}` is a Resource ID in the form `/subscriptions/00000000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Network/virtualNetworks/network1`.
 * 
 */
@ResourceType(type="azure:core/resourcePolicyAssignment:ResourcePolicyAssignment")
public class ResourcePolicyAssignment extends com.pulumi.resources.CustomResource {
    /**
     * A description which should be used for this Policy Assignment.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description which should be used for this Policy Assignment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Display Name for this Policy Assignment.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The Display Name for this Policy Assignment.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Specifies if this Policy should be enforced or not?
     * 
     */
    @Export(name="enforce", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enforce;

    /**
     * @return Specifies if this Policy should be enforced or not?
     * 
     */
    public Output<Optional<Boolean>> enforce() {
        return Codegen.optional(this.enforce);
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=ResourcePolicyAssignmentIdentity.class, parameters={})
    private Output</* @Nullable */ ResourcePolicyAssignmentIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<ResourcePolicyAssignmentIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Policy Assignment should exist. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A JSON mapping of any Metadata for this Policy.
     * 
     */
    @Export(name="metadata", type=String.class, parameters={})
    private Output<String> metadata;

    /**
     * @return A JSON mapping of any Metadata for this Policy.
     * 
     */
    public Output<String> metadata() {
        return this.metadata;
    }
    /**
     * The name which should be used for this Policy Assignment. Changing this forces a new Resource Policy Assignment to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Policy Assignment. Changing this forces a new Resource Policy Assignment to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * One or more `non_compliance_message` blocks as defined below.
     * 
     */
    @Export(name="nonComplianceMessages", type=List.class, parameters={ResourcePolicyAssignmentNonComplianceMessage.class})
    private Output</* @Nullable */ List<ResourcePolicyAssignmentNonComplianceMessage>> nonComplianceMessages;

    /**
     * @return One or more `non_compliance_message` blocks as defined below.
     * 
     */
    public Output<Optional<List<ResourcePolicyAssignmentNonComplianceMessage>>> nonComplianceMessages() {
        return Codegen.optional(this.nonComplianceMessages);
    }
    /**
     * Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     * 
     */
    @Export(name="notScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> notScopes;

    /**
     * @return Specifies a list of Resource Scopes (for example a Subscription, or a Resource Group) within this Management Group which are excluded from this Policy.
     * 
     */
    public Output<Optional<List<String>>> notScopes() {
        return Codegen.optional(this.notScopes);
    }
    /**
     * A JSON mapping of any Parameters for this Policy.
     * 
     */
    @Export(name="parameters", type=String.class, parameters={})
    private Output</* @Nullable */ String> parameters;

    /**
     * @return A JSON mapping of any Parameters for this Policy.
     * 
     */
    public Output<Optional<String>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     * 
     */
    @Export(name="policyDefinitionId", type=String.class, parameters={})
    private Output<String> policyDefinitionId;

    /**
     * @return The ID of the Policy Definition or Policy Definition Set. Changing this forces a new Policy Assignment to be created.
     * 
     */
    public Output<String> policyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * The ID of the Resource (or Resource Scope) where this should be applied. Changing this forces a new Resource Policy Assignment to be created.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The ID of the Resource (or Resource Scope) where this should be applied. Changing this forces a new Resource Policy Assignment to be created.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicyAssignment(String name) {
        this(name, ResourcePolicyAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicyAssignment(String name, ResourcePolicyAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicyAssignment(String name, ResourcePolicyAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourcePolicyAssignment:ResourcePolicyAssignment", name, args == null ? ResourcePolicyAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePolicyAssignment(String name, Output<String> id, @Nullable ResourcePolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:core/resourcePolicyAssignment:ResourcePolicyAssignment", name, state, makeResourceOptions(options, id));
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
    public static ResourcePolicyAssignment get(String name, Output<String> id, @Nullable ResourcePolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicyAssignment(name, id, state, options);
    }
}
