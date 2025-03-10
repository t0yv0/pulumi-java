// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.dns.inputs.GetZoneArgs;
import com.pulumi.azure.dns.outputs.GetZoneResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DnsFunctions {
    /**
     * Use this data source to access information about an existing DNS Zone.
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
     *         final var example = Output.of(DnsFunctions.getZone(GetZoneArgs.builder()
     *             .name(&#34;search-eventhubns&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;dnsZoneId&#34;, example.apply(getZoneResult -&gt; getZoneResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZoneResult> getZone(GetZoneArgs args) {
        return getZone(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing DNS Zone.
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
     *         final var example = Output.of(DnsFunctions.getZone(GetZoneArgs.builder()
     *             .name(&#34;search-eventhubns&#34;)
     *             .resourceGroupName(&#34;search-service&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;dnsZoneId&#34;, example.apply(getZoneResult -&gt; getZoneResult.getId()));
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZoneResult> getZone(GetZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:dns/getZone:getZone", TypeShape.of(GetZoneResult.class), args, Utilities.withVersion(options));
    }
}
