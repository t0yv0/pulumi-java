// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.amp;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.amp.RuleGroupNamespaceArgs;
import com.pulumi.aws.amp.inputs.RuleGroupNamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Amazon Managed Service for Prometheus (AMP) Rule Group Namespace
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
 *         var demoWorkspace = new Workspace(&#34;demoWorkspace&#34;);
 * 
 *         var demoRuleGroupNamespace = new RuleGroupNamespace(&#34;demoRuleGroupNamespace&#34;, RuleGroupNamespaceArgs.builder()        
 *             .workspaceId(demoWorkspace.getId())
 *             .data(&#34;&#34;&#34;
 * groups:
 *   - name: test
 *     rules:
 *     - record: metric:recording_rule
 *       expr: avg(rate(container_cpu_usage_seconds_total[5m]))
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * The prometheus rule group namespace can be imported using the arn, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:amp/ruleGroupNamespace:RuleGroupNamespace demo arn:aws:aps:us-west-2:123456789012:rulegroupsnamespace/IDstring/namespace_name
 * ```
 * 
 */
@ResourceType(type="aws:amp/ruleGroupNamespace:RuleGroupNamespace")
public class RuleGroupNamespace extends com.pulumi.resources.CustomResource {
    /**
     * the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
     * 
     */
    @Export(name="data", type=String.class, parameters={})
    private Output<String> data;

    /**
     * @return the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
     * 
     */
    public Output<String> data() {
        return this.data;
    }
    /**
     * The name of the rule group namespace
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the rule group namespace
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The id of the prometheus workspace the rule group namespace should be linked to
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output<String> workspaceId;

    /**
     * @return The id of the prometheus workspace the rule group namespace should be linked to
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleGroupNamespace(String name) {
        this(name, RuleGroupNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleGroupNamespace(String name, RuleGroupNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleGroupNamespace(String name, RuleGroupNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amp/ruleGroupNamespace:RuleGroupNamespace", name, args == null ? RuleGroupNamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RuleGroupNamespace(String name, Output<String> id, @Nullable RuleGroupNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:amp/ruleGroupNamespace:RuleGroupNamespace", name, state, makeResourceOptions(options, id));
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
    public static RuleGroupNamespace get(String name, Output<String> id, @Nullable RuleGroupNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RuleGroupNamespace(name, id, state, options);
    }
}
