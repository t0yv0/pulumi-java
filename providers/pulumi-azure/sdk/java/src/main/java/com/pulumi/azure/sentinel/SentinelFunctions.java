// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleArgs;
import com.pulumi.azure.sentinel.inputs.GetAlertRuleTemplateArgs;
import com.pulumi.azure.sentinel.outputs.GetAlertRuleResult;
import com.pulumi.azure.sentinel.outputs.GetAlertRuleTemplateResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SentinelFunctions {
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     *         final var exampleAnalyticsWorkspace = Output.of(OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build()));
     * 
     *         final var exampleAlertRule = Output.of(SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .logAnalyticsWorkspaceId(exampleAnalyticsWorkspace.apply(getAnalyticsWorkspaceResult -&gt; getAnalyticsWorkspaceResult.getId()))
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, exampleAlertRule.apply(getAlertRuleResult -&gt; getAlertRuleResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args) {
        return getAlertRule(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule.
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
     *         final var exampleAnalyticsWorkspace = Output.of(OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name(&#34;example&#34;)
     *             .resourceGroupName(&#34;example-resources&#34;)
     *             .build()));
     * 
     *         final var exampleAlertRule = Output.of(SentinelFunctions.getAlertRule(GetAlertRuleArgs.builder()
     *             .name(&#34;existing&#34;)
     *             .logAnalyticsWorkspaceId(exampleAnalyticsWorkspace.apply(getAnalyticsWorkspaceResult -&gt; getAnalyticsWorkspaceResult.getId()))
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, exampleAlertRule.apply(getAlertRuleResult -&gt; getAlertRuleResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAlertRuleResult> getAlertRule(GetAlertRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sentinel/getAlertRule:getAlertRule", TypeShape.of(GetAlertRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     *         final var example = Output.of(SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1&#34;)
     *             .displayName(&#34;Create incidents based on Azure Security Center for IoT alerts&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getAlertRuleTemplateResult -&gt; getAlertRuleTemplateResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAlertRuleTemplateResult> getAlertRuleTemplate(GetAlertRuleTemplateArgs args) {
        return getAlertRuleTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Sentinel Alert Rule Template.
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
     *         final var example = Output.of(SentinelFunctions.getAlertRuleTemplate(GetAlertRuleTemplateArgs.builder()
     *             .logAnalyticsWorkspaceId(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.OperationalInsights/workspaces/workspace1&#34;)
     *             .displayName(&#34;Create incidents based on Azure Security Center for IoT alerts&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getAlertRuleTemplateResult -&gt; getAlertRuleTemplateResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAlertRuleTemplateResult> getAlertRuleTemplate(GetAlertRuleTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:sentinel/getAlertRuleTemplate:getAlertRuleTemplate", TypeShape.of(GetAlertRuleTemplateResult.class), args, Utilities.withVersion(options));
    }
}
