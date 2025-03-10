// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appinsights;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appinsights.inputs.GetInsightsArgs;
import com.pulumi.azure.appinsights.outputs.GetInsightsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AppinsightsFunctions {
    /**
     * Use this data source to access information about an existing Application Insights component.
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
     *         final var example = Output.of(AppinsightsFunctions.getInsights(GetInsightsArgs.builder()
     *             .name(&#34;production&#34;)
     *             .resourceGroupName(&#34;networking&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;applicationInsightsInstrumentationKey&#34;, example.apply(getInsightsResult -&gt; getInsightsResult.getInstrumentationKey()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInsightsResult> getInsights(GetInsightsArgs args) {
        return getInsights(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Application Insights component.
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
     *         final var example = Output.of(AppinsightsFunctions.getInsights(GetInsightsArgs.builder()
     *             .name(&#34;production&#34;)
     *             .resourceGroupName(&#34;networking&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;applicationInsightsInstrumentationKey&#34;, example.apply(getInsightsResult -&gt; getInsightsResult.getInstrumentationKey()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInsightsResult> getInsights(GetInsightsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:appinsights/getInsights:getInsights", TypeShape.of(GetInsightsResult.class), args, Utilities.withVersion(options));
    }
}
