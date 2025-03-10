// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cognitive;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.cognitive.inputs.GetAccountArgs;
import com.pulumi.azure.cognitive.outputs.GetAccountResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CognitiveFunctions {
    /**
     * Use this data source to access information about an existing Cognitive Services Account.
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
     *         final var test = Output.of(CognitiveFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;cognitive_account_rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;primaryAccessKey&#34;, test.apply(getAccountResult -&gt; getAccountResult.getPrimaryAccessKey()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args) {
        return getAccount(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Cognitive Services Account.
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
     *         final var test = Output.of(CognitiveFunctions.getAccount(GetAccountArgs.builder()
     *             .name(&#34;example-account&#34;)
     *             .resourceGroupName(&#34;cognitive_account_rg&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;primaryAccessKey&#34;, test.apply(getAccountResult -&gt; getAccountResult.getPrimaryAccessKey()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAccountResult> getAccount(GetAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:cognitive/getAccount:getAccount", TypeShape.of(GetAccountResult.class), args, Utilities.withVersion(options));
    }
}
