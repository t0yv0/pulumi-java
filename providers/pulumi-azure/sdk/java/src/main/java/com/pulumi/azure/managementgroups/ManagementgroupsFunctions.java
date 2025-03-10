// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.managementgroups;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.managementgroups.inputs.GetManagementGroupArgs;
import com.pulumi.azure.managementgroups.outputs.GetManagementGroupResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ManagementgroupsFunctions {
    /**
     * Use this data source to access information about an existing Management Group.
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
     *         final var example = Output.of(ManagementFunctions.getGroup(GetGroupArgs.builder()
     *             .name(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;displayName&#34;, example.apply(getGroupResult -&gt; getGroupResult.getDisplayName()));
     *         }
     * }
     * ```
     * 
     * @deprecated
     * azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup
     * 
     */
    @Deprecated /* azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup */
    public static CompletableFuture<GetManagementGroupResult> getManagementGroup() {
        return getManagementGroup(GetManagementGroupArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Management Group.
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
     *         final var example = Output.of(ManagementFunctions.getGroup(GetGroupArgs.builder()
     *             .name(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;displayName&#34;, example.apply(getGroupResult -&gt; getGroupResult.getDisplayName()));
     *         }
     * }
     * ```
     * 
     * @deprecated
     * azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup
     * 
     */
    @Deprecated /* azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup */
    public static CompletableFuture<GetManagementGroupResult> getManagementGroup(GetManagementGroupArgs args) {
        return getManagementGroup(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to access information about an existing Management Group.
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
     *         final var example = Output.of(ManagementFunctions.getGroup(GetGroupArgs.builder()
     *             .name(&#34;00000000-0000-0000-0000-000000000000&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;displayName&#34;, example.apply(getGroupResult -&gt; getGroupResult.getDisplayName()));
     *         }
     * }
     * ```
     * 
     * @deprecated
     * azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup
     * 
     */
    @Deprecated /* azure.managementgroups.getManagementGroup has been deprecated in favor of azure.management.getGroup */
    public static CompletableFuture<GetManagementGroupResult> getManagementGroup(GetManagementGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure:managementgroups/getManagementGroup:getManagementGroup", TypeShape.of(GetManagementGroupResult.class), args, Utilities.withVersion(options));
    }
}
