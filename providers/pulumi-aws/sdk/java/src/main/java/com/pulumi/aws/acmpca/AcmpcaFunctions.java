// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.acmpca.inputs.GetCertificateArgs;
import com.pulumi.aws.acmpca.inputs.GetCertificateAuthorityArgs;
import com.pulumi.aws.acmpca.outputs.GetCertificateAuthorityResult;
import com.pulumi.aws.acmpca.outputs.GetCertificateResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AcmpcaFunctions {
    /**
     * Get information on a Certificate issued by a AWS Certificate Manager Private Certificate Authority.
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
     *         final var example = Output.of(AcmpcaFunctions.getCertificate(GetCertificateArgs.builder()
     *             .arn(&#34;arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/1234b4a0d73e2056789bdbe77d5b1a23&#34;)
     *             .certificateAuthorityArn(&#34;arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Get information on a Certificate issued by a AWS Certificate Manager Private Certificate Authority.
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
     *         final var example = Output.of(AcmpcaFunctions.getCertificate(GetCertificateArgs.builder()
     *             .arn(&#34;arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/1234b4a0d73e2056789bdbe77d5b1a23&#34;)
     *             .certificateAuthorityArn(&#34;arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:acmpca/getCertificate:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).
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
     *         final var example = Output.of(AcmpcaFunctions.getCertificateAuthority(GetCertificateAuthorityArgs.builder()
     *             .arn(&#34;arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args) {
        return getCertificateAuthority(args, InvokeOptions.Empty);
    }
    /**
     * Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).
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
     *         final var example = Output.of(AcmpcaFunctions.getCertificateAuthority(GetCertificateAuthorityArgs.builder()
     *             .arn(&#34;arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:acmpca/getCertificateAuthority:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args, Utilities.withVersion(options));
    }
}
