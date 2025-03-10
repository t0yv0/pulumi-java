// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudcontrol;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudcontrol.inputs.GetResourceArgs;
import com.pulumi.aws.cloudcontrol.outputs.GetResourceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CloudcontrolFunctions {
    /**
     * Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service.
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
     *         final var example = Output.of(CloudcontrolFunctions.getResource(GetResourceArgs.builder()
     *             .identifier(&#34;example&#34;)
     *             .typeName(&#34;AWS::ECS::Cluster&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceResult> getResource(GetResourceArgs args) {
        return getResource(args, InvokeOptions.Empty);
    }
    /**
     * Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service.
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
     *         final var example = Output.of(CloudcontrolFunctions.getResource(GetResourceArgs.builder()
     *             .identifier(&#34;example&#34;)
     *             .typeName(&#34;AWS::ECS::Cluster&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResourceResult> getResource(GetResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudcontrol/getResource:getResource", TypeShape.of(GetResourceResult.class), args, Utilities.withVersion(options));
    }
}
