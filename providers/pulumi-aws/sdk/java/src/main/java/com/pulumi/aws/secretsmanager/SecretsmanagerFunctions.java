// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.secretsmanager.inputs.GetSecretArgs;
import com.pulumi.aws.secretsmanager.inputs.GetSecretRotationArgs;
import com.pulumi.aws.secretsmanager.inputs.GetSecretVersionArgs;
import com.pulumi.aws.secretsmanager.outputs.GetSecretResult;
import com.pulumi.aws.secretsmanager.outputs.GetSecretRotationResult;
import com.pulumi.aws.secretsmanager.outputs.GetSecretVersionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SecretsmanagerFunctions {
    /**
     * Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion`.
     * 
     * ## Example Usage
     * ### ARN
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
     *         final var by-arn = Output.of(SecretsmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .arn(&#34;arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### Name
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
     *         final var by-name = Output.of(SecretsmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret() {
        return getSecret(GetSecretArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion`.
     * 
     * ## Example Usage
     * ### ARN
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
     *         final var by-arn = Output.of(SecretsmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .arn(&#34;arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### Name
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
     *         final var by-name = Output.of(SecretsmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve metadata information about a Secrets Manager secret. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion`.
     * 
     * ## Example Usage
     * ### ARN
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
     *         final var by-arn = Output.of(SecretsmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .arn(&#34;arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### Name
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
     *         final var by-name = Output.of(SecretsmanagerFunctions.getSecret(GetSecretArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:secretsmanager/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source.
     * 
     * ## Example Usage
     * ### Retrieve Secret Rotation Configuration
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
     *         final var example = Output.of(SecretsmanagerFunctions.getSecretRotation(GetSecretRotationArgs.builder()
     *             .secretId(data.getAws_secretsmanager_secret().getExample().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretRotationResult> getSecretRotation(GetSecretRotationArgs args) {
        return getSecretRotation(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a Secrets Manager secret rotation. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source. To retrieve a secret value, see the `aws.secretsmanager.SecretVersion` data source.
     * 
     * ## Example Usage
     * ### Retrieve Secret Rotation Configuration
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
     *         final var example = Output.of(SecretsmanagerFunctions.getSecretRotation(GetSecretRotationArgs.builder()
     *             .secretId(data.getAws_secretsmanager_secret().getExample().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretRotationResult> getSecretRotation(GetSecretRotationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:secretsmanager/getSecretRotation:getSecretRotation", TypeShape.of(GetSecretRotationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source.
     * 
     * ## Example Usage
     * ### Retrieve Current Secret Version
     * 
     * By default, this data sources retrieves information based on the `AWSCURRENT` staging label.
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
     *         final var secret-version = Output.of(SecretsmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secretId(data.getAws_secretsmanager_secret().getExample().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### Retrieve Specific Secret Version
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
     *         final var by-version-stage = Output.of(SecretsmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secretId(data.getAws_secretsmanager_secret().getExample().getId())
     *             .versionStage(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args) {
        return getSecretVersion(args, InvokeOptions.Empty);
    }
    /**
     * Retrieve information about a Secrets Manager secret version, including its secret value. To retrieve secret metadata, see the `aws.secretsmanager.Secret` data source.
     * 
     * ## Example Usage
     * ### Retrieve Current Secret Version
     * 
     * By default, this data sources retrieves information based on the `AWSCURRENT` staging label.
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
     *         final var secret-version = Output.of(SecretsmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secretId(data.getAws_secretsmanager_secret().getExample().getId())
     *             .build()));
     * 
     *         }
     * }
     * ```
     * ### Retrieve Specific Secret Version
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
     *         final var by-version-stage = Output.of(SecretsmanagerFunctions.getSecretVersion(GetSecretVersionArgs.builder()
     *             .secretId(data.getAws_secretsmanager_secret().getExample().getId())
     *             .versionStage(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetSecretVersionResult> getSecretVersion(GetSecretVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:secretsmanager/getSecretVersion:getSecretVersion", TypeShape.of(GetSecretVersionResult.class), args, Utilities.withVersion(options));
    }
}
