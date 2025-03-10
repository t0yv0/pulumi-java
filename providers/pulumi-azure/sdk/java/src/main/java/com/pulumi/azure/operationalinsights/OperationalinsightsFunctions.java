// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.operationalinsights;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.operationalinsights.inputs.GetAnalyticsWorkspaceArgs;
import com.pulumi.azure.operationalinsights.outputs.GetAnalyticsWorkspaceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OperationalinsightsFunctions {
    /**
     * Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.
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
     *         final var example = Output.of(OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name(&#34;acctest-01&#34;)
     *             .resourceGroupName(&#34;acctest&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;logAnalyticsWorkspaceId&#34;, example.apply(getAnalyticsWorkspaceResult -&gt; getAnalyticsWorkspaceResult.getWorkspaceId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAnalyticsWorkspaceResult> getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs args) {
        return getAnalyticsWorkspace(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Log Analytics (formally Operational Insights) Workspace.
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
     *         final var example = Output.of(OperationalinsightsFunctions.getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs.builder()
     *             .name(&#34;acctest-01&#34;)
     *             .resourceGroupName(&#34;acctest&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;logAnalyticsWorkspaceId&#34;, example.apply(getAnalyticsWorkspaceResult -&gt; getAnalyticsWorkspaceResult.getWorkspaceId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAnalyticsWorkspaceResult> getAnalyticsWorkspace(GetAnalyticsWorkspaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:operationalinsights/getAnalyticsWorkspace:getAnalyticsWorkspace", TypeShape.of(GetAnalyticsWorkspaceResult.class), args, Utilities.withVersion(options));
    }
}
