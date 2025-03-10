// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.signer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.signer.inputs.GetSigningJobArgs;
import com.pulumi.aws.signer.inputs.GetSigningProfileArgs;
import com.pulumi.aws.signer.outputs.GetSigningJobResult;
import com.pulumi.aws.signer.outputs.GetSigningProfileResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SignerFunctions {
    /**
     * Provides information about a Signer Signing Job.
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
     *         final var buildSigningJob = Output.of(SignerFunctions.getSigningJob(GetSigningJobArgs.builder()
     *             .jobId(&#34;9ed7e5c3-b8d4-4da0-8459-44e0b068f7ee&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSigningJobResult> getSigningJob(GetSigningJobArgs args) {
        return getSigningJob(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Signer Signing Job.
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
     *         final var buildSigningJob = Output.of(SignerFunctions.getSigningJob(GetSigningJobArgs.builder()
     *             .jobId(&#34;9ed7e5c3-b8d4-4da0-8459-44e0b068f7ee&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSigningJobResult> getSigningJob(GetSigningJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:signer/getSigningJob:getSigningJob", TypeShape.of(GetSigningJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a Signer Signing Profile.
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
     *         final var productionSigningProfile = Output.of(SignerFunctions.getSigningProfile(GetSigningProfileArgs.builder()
     *             .name(&#34;prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSigningProfileResult> getSigningProfile(GetSigningProfileArgs args) {
        return getSigningProfile(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a Signer Signing Profile.
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
     *         final var productionSigningProfile = Output.of(SignerFunctions.getSigningProfile(GetSigningProfileArgs.builder()
     *             .name(&#34;prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSigningProfileResult> getSigningProfile(GetSigningProfileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:signer/getSigningProfile:getSigningProfile", TypeShape.of(GetSigningProfileResult.class), args, Utilities.withVersion(options));
    }
}
