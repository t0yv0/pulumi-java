// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.monitoring.ActionRuleActionGroupArgs;
import com.pulumi.azure.monitoring.inputs.ActionRuleActionGroupState;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupCondition;
import com.pulumi.azure.monitoring.outputs.ActionRuleActionGroupScope;
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
 * Manages an Monitor Action Rule which type is action group.
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
 *         var exampleActionGroup = new ActionGroup(&#34;exampleActionGroup&#34;, ActionGroupArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .shortName(&#34;exampleactiongroup&#34;)
 *             .build());
 * 
 *         var exampleActionRuleActionGroup = new ActionRuleActionGroup(&#34;exampleActionRuleActionGroup&#34;, ActionRuleActionGroupArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .actionGroupId(exampleActionGroup.getId())
 *             .scope(ActionRuleActionGroupScope.builder()
 *                 .type(&#34;ResourceGroup&#34;)
 *                 .resourceIds(exampleResourceGroup.getId())
 *                 .build())
 *             .tags(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Monitor Action Rule can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:monitoring/actionRuleActionGroup:ActionRuleActionGroup example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.AlertsManagement/actionRules/actionRule1
 * ```
 * 
 */
@ResourceType(type="azure:monitoring/actionRuleActionGroup:ActionRuleActionGroup")
public class ActionRuleActionGroup extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the resource id of monitor action group.
     * 
     */
    @Export(name="actionGroupId", type=String.class, parameters={})
    private Output<String> actionGroupId;

    /**
     * @return Specifies the resource id of monitor action group.
     * 
     */
    public Output<String> actionGroupId() {
        return this.actionGroupId;
    }
    /**
     * A `condition` block as defined below.
     * 
     */
    @Export(name="condition", type=ActionRuleActionGroupCondition.class, parameters={})
    private Output</* @Nullable */ ActionRuleActionGroupCondition> condition;

    /**
     * @return A `condition` block as defined below.
     * 
     */
    public Output<Optional<ActionRuleActionGroupCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * Specifies a description for the Action Rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies a description for the Action Rule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Is the Action Rule enabled? Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Is the Action Rule enabled? Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Specifies the name of the Monitor Action Rule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Monitor Action Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the name of the resource group in which the Monitor Action Rule should exist. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the resource group in which the Monitor Action Rule should exist. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A `scope` block as defined below.
     * 
     */
    @Export(name="scope", type=ActionRuleActionGroupScope.class, parameters={})
    private Output</* @Nullable */ ActionRuleActionGroupScope> scope;

    /**
     * @return A `scope` block as defined below.
     * 
     */
    public Output<Optional<ActionRuleActionGroupScope>> scope() {
        return Codegen.optional(this.scope);
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
    public ActionRuleActionGroup(String name) {
        this(name, ActionRuleActionGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionRuleActionGroup(String name, ActionRuleActionGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionRuleActionGroup(String name, ActionRuleActionGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/actionRuleActionGroup:ActionRuleActionGroup", name, args == null ? ActionRuleActionGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionRuleActionGroup(String name, Output<String> id, @Nullable ActionRuleActionGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/actionRuleActionGroup:ActionRuleActionGroup", name, state, makeResourceOptions(options, id));
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
    public static ActionRuleActionGroup get(String name, Output<String> id, @Nullable ActionRuleActionGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionRuleActionGroup(name, id, state, options);
    }
}
