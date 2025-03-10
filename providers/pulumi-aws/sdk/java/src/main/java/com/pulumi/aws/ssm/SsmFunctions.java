// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.inputs.GetDocumentArgs;
import com.pulumi.aws.ssm.inputs.GetInstancesArgs;
import com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs;
import com.pulumi.aws.ssm.inputs.GetParameterArgs;
import com.pulumi.aws.ssm.inputs.GetParametersByPathArgs;
import com.pulumi.aws.ssm.inputs.GetPatchBaselineArgs;
import com.pulumi.aws.ssm.outputs.GetDocumentResult;
import com.pulumi.aws.ssm.outputs.GetInstancesResult;
import com.pulumi.aws.ssm.outputs.GetMaintenanceWindowsResult;
import com.pulumi.aws.ssm.outputs.GetParameterResult;
import com.pulumi.aws.ssm.outputs.GetParametersByPathResult;
import com.pulumi.aws.ssm.outputs.GetPatchBaselineResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SsmFunctions {
    /**
     * Gets the contents of the specified Systems Manager document.
     * 
     * ## Example Usage
     * 
     * To get the contents of the document owned by AWS.
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
     *         final var foo = Output.of(SsmFunctions.getDocument(GetDocumentArgs.builder()
     *             .name(&#34;AWS-GatherSoftwareInventory&#34;)
     *             .documentFormat(&#34;YAML&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;content&#34;, foo.apply(getDocumentResult -&gt; getDocumentResult.getContent()));
     *         }
     * }
     * ```
     * 
     * To get the contents of the custom document.
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
     *         final var test = Output.of(SsmFunctions.getDocument(GetDocumentArgs.builder()
     *             .name(aws_ssm_document.getTest().getName())
     *             .documentFormat(&#34;JSON&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDocumentResult> getDocument(GetDocumentArgs args) {
        return getDocument(args, InvokeOptions.Empty);
    }
    /**
     * Gets the contents of the specified Systems Manager document.
     * 
     * ## Example Usage
     * 
     * To get the contents of the document owned by AWS.
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
     *         final var foo = Output.of(SsmFunctions.getDocument(GetDocumentArgs.builder()
     *             .name(&#34;AWS-GatherSoftwareInventory&#34;)
     *             .documentFormat(&#34;YAML&#34;)
     *             .build()));
     * 
     *         ctx.export(&#34;content&#34;, foo.apply(getDocumentResult -&gt; getDocumentResult.getContent()));
     *         }
     * }
     * ```
     * 
     * To get the contents of the custom document.
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
     *         final var test = Output.of(SsmFunctions.getDocument(GetDocumentArgs.builder()
     *             .name(aws_ssm_document.getTest().getName())
     *             .documentFormat(&#34;JSON&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDocumentResult> getDocument(GetDocumentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getDocument:getDocument", TypeShape.of(GetDocumentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the instance IDs of SSM managed instances.
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
     *         final var example = Output.of(SsmFunctions.getInstances(GetInstancesArgs.builder()
     *             .filters(GetInstancesFilter.builder()
     *                 .name(&#34;PlatformTypes&#34;)
     *                 .values(&#34;Linux&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstances() {
        return getInstances(GetInstancesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the instance IDs of SSM managed instances.
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
     *         final var example = Output.of(SsmFunctions.getInstances(GetInstancesArgs.builder()
     *             .filters(GetInstancesFilter.builder()
     *                 .name(&#34;PlatformTypes&#34;)
     *                 .values(&#34;Linux&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstances(GetInstancesArgs args) {
        return getInstances(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the instance IDs of SSM managed instances.
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
     *         final var example = Output.of(SsmFunctions.getInstances(GetInstancesArgs.builder()
     *             .filters(GetInstancesFilter.builder()
     *                 .name(&#34;PlatformTypes&#34;)
     *                 .values(&#34;Linux&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetInstancesResult> getInstances(GetInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getInstances:getInstances", TypeShape.of(GetInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the window IDs of SSM maintenance windows.
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
     *         final var example = Output.of(SsmFunctions.getMaintenanceWindows(GetMaintenanceWindowsArgs.builder()
     *             .filters(GetMaintenanceWindowsFilter.builder()
     *                 .name(&#34;Enabled&#34;)
     *                 .values(&#34;true&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMaintenanceWindowsResult> getMaintenanceWindows() {
        return getMaintenanceWindows(GetMaintenanceWindowsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the window IDs of SSM maintenance windows.
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
     *         final var example = Output.of(SsmFunctions.getMaintenanceWindows(GetMaintenanceWindowsArgs.builder()
     *             .filters(GetMaintenanceWindowsFilter.builder()
     *                 .name(&#34;Enabled&#34;)
     *                 .values(&#34;true&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMaintenanceWindowsResult> getMaintenanceWindows(GetMaintenanceWindowsArgs args) {
        return getMaintenanceWindows(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the window IDs of SSM maintenance windows.
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
     *         final var example = Output.of(SsmFunctions.getMaintenanceWindows(GetMaintenanceWindowsArgs.builder()
     *             .filters(GetMaintenanceWindowsFilter.builder()
     *                 .name(&#34;Enabled&#34;)
     *                 .values(&#34;true&#34;)
     *                 .build())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetMaintenanceWindowsResult> getMaintenanceWindows(GetMaintenanceWindowsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getMaintenanceWindows:getMaintenanceWindows", TypeShape.of(GetMaintenanceWindowsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides an SSM Parameter data source.
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
     *         final var foo = Output.of(SsmFunctions.getParameter(GetParameterArgs.builder()
     *             .name(&#34;foo&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     * &gt; **Note:** The data source is currently following the behavior of the [SSM API](https://docs.aws.amazon.com/sdk-for-go/api/service/ssm/#Parameter) to return a string value, regardless of parameter type.
     * 
     */
    public static CompletableFuture<GetParameterResult> getParameter(GetParameterArgs args) {
        return getParameter(args, InvokeOptions.Empty);
    }
    /**
     * Provides an SSM Parameter data source.
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
     *         final var foo = Output.of(SsmFunctions.getParameter(GetParameterArgs.builder()
     *             .name(&#34;foo&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     * &gt; **Note:** The data source is currently following the behavior of the [SSM API](https://docs.aws.amazon.com/sdk-for-go/api/service/ssm/#Parameter) to return a string value, regardless of parameter type.
     * 
     */
    public static CompletableFuture<GetParameterResult> getParameter(GetParameterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getParameter:getParameter", TypeShape.of(GetParameterResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetParametersByPathResult> getParametersByPath(GetParametersByPathArgs args) {
        return getParametersByPath(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetParametersByPathResult> getParametersByPath(GetParametersByPathArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getParametersByPath:getParametersByPath", TypeShape.of(GetParametersByPathResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided.
     * 
     * ## Example Usage
     * 
     * To retrieve a baseline provided by AWS:
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
     *         final var centos = Output.of(SsmFunctions.getPatchBaseline(GetPatchBaselineArgs.builder()
     *             .namePrefix(&#34;AWS-&#34;)
     *             .operatingSystem(&#34;CENTOS&#34;)
     *             .owner(&#34;AWS&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     * To retrieve a baseline on your account:
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
     *         final var defaultCustom = Output.of(SsmFunctions.getPatchBaseline(GetPatchBaselineArgs.builder()
     *             .defaultBaseline(true)
     *             .namePrefix(&#34;MyCustomBaseline&#34;)
     *             .operatingSystem(&#34;WINDOWS&#34;)
     *             .owner(&#34;Self&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPatchBaselineResult> getPatchBaseline(GetPatchBaselineArgs args) {
        return getPatchBaseline(args, InvokeOptions.Empty);
    }
    /**
     * Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided.
     * 
     * ## Example Usage
     * 
     * To retrieve a baseline provided by AWS:
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
     *         final var centos = Output.of(SsmFunctions.getPatchBaseline(GetPatchBaselineArgs.builder()
     *             .namePrefix(&#34;AWS-&#34;)
     *             .operatingSystem(&#34;CENTOS&#34;)
     *             .owner(&#34;AWS&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     * To retrieve a baseline on your account:
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
     *         final var defaultCustom = Output.of(SsmFunctions.getPatchBaseline(GetPatchBaselineArgs.builder()
     *             .defaultBaseline(true)
     *             .namePrefix(&#34;MyCustomBaseline&#34;)
     *             .operatingSystem(&#34;WINDOWS&#34;)
     *             .owner(&#34;Self&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPatchBaselineResult> getPatchBaseline(GetPatchBaselineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getPatchBaseline:getPatchBaseline", TypeShape.of(GetPatchBaselineResult.class), args, Utilities.withVersion(options));
    }
}
