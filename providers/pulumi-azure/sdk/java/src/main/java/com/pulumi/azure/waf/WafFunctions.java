// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.waf;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.waf.inputs.GetFirewallPolicyArgs;
import com.pulumi.azure.waf.outputs.GetFirewallPolicyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class WafFunctions {
    /**
     * Use this data source to access information about an existing Web Application Firewall Policy.
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
     *         final var example = Output.of(WafFunctions.getFirewallPolicy(GetFirewallPolicyArgs.builder()
     *             .resourceGroupName(&#34;existing&#34;)
     *             .name(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getFirewallPolicyResult -&gt; getFirewallPolicyResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFirewallPolicyResult> getFirewallPolicy(GetFirewallPolicyArgs args) {
        return getFirewallPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Web Application Firewall Policy.
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
     *         final var example = Output.of(WafFunctions.getFirewallPolicy(GetFirewallPolicyArgs.builder()
     *             .resourceGroupName(&#34;existing&#34;)
     *             .name(&#34;existing&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;id&#34;, example.apply(getFirewallPolicyResult -&gt; getFirewallPolicyResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFirewallPolicyResult> getFirewallPolicy(GetFirewallPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:waf/getFirewallPolicy:getFirewallPolicy", TypeShape.of(GetFirewallPolicyResult.class), args, Utilities.withVersion(options));
    }
}
