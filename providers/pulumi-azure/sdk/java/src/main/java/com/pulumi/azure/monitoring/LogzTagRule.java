// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.monitoring.LogzTagRuleArgs;
import com.pulumi.azure.monitoring.inputs.LogzTagRuleState;
import com.pulumi.azure.monitoring.outputs.LogzTagRuleTagFilter;
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
 * Manages a logz Tag Rule.
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
 *         var exampleLogzMonitor = new LogzMonitor(&#34;exampleLogzMonitor&#34;, LogzMonitorArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .plan(LogzMonitorPlan.builder()
 *                 .billingCycle(&#34;Monthly&#34;)
 *                 .effectiveDate(&#34;2022-06-06T00:00:00Z&#34;)
 *                 .planId(&#34;100gb14days&#34;)
 *                 .usageType(&#34;Committed&#34;)
 *                 .build())
 *             .user(LogzMonitorUser.builder()
 *                 .email(&#34;user@example.com&#34;)
 *                 .firstName(&#34;Example&#34;)
 *                 .lastName(&#34;User&#34;)
 *                 .phoneNumber(&#34;+12313803556&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleLogzTagRule = new LogzTagRule(&#34;exampleLogzTagRule&#34;, LogzTagRuleArgs.builder()        
 *             .logzMonitorId(exampleLogzMonitor.getId())
 *             .tagFilters(            
 *                 LogzTagRuleTagFilter.builder()
 *                     .name(&#34;name1&#34;)
 *                     .action(&#34;Include&#34;)
 *                     .value(&#34;value1&#34;)
 *                     .build(),
 *                 LogzTagRuleTagFilter.builder()
 *                     .name(&#34;name2&#34;)
 *                     .action(&#34;Exclude&#34;)
 *                     .value(&#34;value2&#34;)
 *                     .build())
 *             .sendAadLogs(true)
 *             .sendActivityLogs(true)
 *             .sendSubscriptionLogs(true)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * logz Tag Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:monitoring/logzTagRule:LogzTagRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Logz/monitors/monitor1/tagRules/ruleSet1
 * ```
 * 
 */
@ResourceType(type="azure:monitoring/logzTagRule:LogzTagRule")
public class LogzTagRule extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
     * 
     */
    @Export(name="logzMonitorId", type=String.class, parameters={})
    private Output<String> logzMonitorId;

    /**
     * @return The ID of the Logz Monitor. Changing this forces a new logz Tag Rule to be created.
     * 
     */
    public Output<String> logzMonitorId() {
        return this.logzMonitorId;
    }
    /**
     * Whether AAD logs should be sent to the Monitor resource?
     * 
     */
    @Export(name="sendAadLogs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendAadLogs;

    /**
     * @return Whether AAD logs should be sent to the Monitor resource?
     * 
     */
    public Output<Optional<Boolean>> sendAadLogs() {
        return Codegen.optional(this.sendAadLogs);
    }
    /**
     * Whether activity logs from Azure resources should be sent to the Monitor resource?
     * 
     */
    @Export(name="sendActivityLogs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendActivityLogs;

    /**
     * @return Whether activity logs from Azure resources should be sent to the Monitor resource?
     * 
     */
    public Output<Optional<Boolean>> sendActivityLogs() {
        return Codegen.optional(this.sendActivityLogs);
    }
    /**
     * Whether subscription logs should be sent to the Monitor resource?
     * 
     */
    @Export(name="sendSubscriptionLogs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> sendSubscriptionLogs;

    /**
     * @return Whether subscription logs should be sent to the Monitor resource?
     * 
     */
    public Output<Optional<Boolean>> sendSubscriptionLogs() {
        return Codegen.optional(this.sendSubscriptionLogs);
    }
    /**
     * One or more (up to 10) `tag_filter` blocks as defined below.
     * 
     */
    @Export(name="tagFilters", type=List.class, parameters={LogzTagRuleTagFilter.class})
    private Output</* @Nullable */ List<LogzTagRuleTagFilter>> tagFilters;

    /**
     * @return One or more (up to 10) `tag_filter` blocks as defined below.
     * 
     */
    public Output<Optional<List<LogzTagRuleTagFilter>>> tagFilters() {
        return Codegen.optional(this.tagFilters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogzTagRule(String name) {
        this(name, LogzTagRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogzTagRule(String name, LogzTagRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogzTagRule(String name, LogzTagRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/logzTagRule:LogzTagRule", name, args == null ? LogzTagRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogzTagRule(String name, Output<String> id, @Nullable LogzTagRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:monitoring/logzTagRule:LogzTagRule", name, state, makeResourceOptions(options, id));
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
    public static LogzTagRule get(String name, Output<String> id, @Nullable LogzTagRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogzTagRule(name, id, state, options);
    }
}
