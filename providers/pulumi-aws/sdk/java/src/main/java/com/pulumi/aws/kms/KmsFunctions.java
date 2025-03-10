// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.inputs.GetAliasArgs;
import com.pulumi.aws.kms.inputs.GetCipherTextArgs;
import com.pulumi.aws.kms.inputs.GetKeyArgs;
import com.pulumi.aws.kms.inputs.GetPublicKeyArgs;
import com.pulumi.aws.kms.inputs.GetSecretArgs;
import com.pulumi.aws.kms.inputs.GetSecretsArgs;
import com.pulumi.aws.kms.outputs.GetAliasResult;
import com.pulumi.aws.kms.outputs.GetCipherTextResult;
import com.pulumi.aws.kms.outputs.GetKeyResult;
import com.pulumi.aws.kms.outputs.GetPublicKeyResult;
import com.pulumi.aws.kms.outputs.GetSecretResult;
import com.pulumi.aws.kms.outputs.GetSecretsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KmsFunctions {
    /**
     * Use this data source to get the ARN of a KMS key alias.
     * By using this data source, you can reference key alias
     * without having to hard code the ARN as input.
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
     *         final var s3 = Output.of(KmsFunctions.getAlias(GetAliasArgs.builder()
     *             .name(&#34;alias/aws/s3&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args) {
        return getAlias(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the ARN of a KMS key alias.
     * By using this data source, you can reference key alias
     * without having to hard code the ARN as input.
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
     *         final var s3 = Output.of(KmsFunctions.getAlias(GetAliasArgs.builder()
     *             .name(&#34;alias/aws/s3&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAliasResult> getAlias(GetAliasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getAlias:getAlias", TypeShape.of(GetAliasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     * by using an AWS KMS customer master key. The value returned by this data source
     * changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     * resource.
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
     *         var oauthConfig = new Key(&#34;oauthConfig&#34;, KeyArgs.builder()        
     *             .description(&#34;oauth config&#34;)
     *             .isEnabled(true)
     *             .build());
     * 
     *         final var oauth = KmsFunctions.getCipherText(GetCipherTextArgs.builder()
     *             .keyId(oauthConfig.getKeyId())
     *             .plaintext(&#34;&#34;&#34;
     * {
     *   &#34;client_id&#34;: &#34;e587dbae22222f55da22&#34;,
     *   &#34;client_secret&#34;: &#34;8289575d00000ace55e1815ec13673955721b8a5&#34;
     * }
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCipherTextResult> getCipherText(GetCipherTextArgs args) {
        return getCipherText(args, InvokeOptions.Empty);
    }
    /**
     * The KMS ciphertext data source allows you to encrypt plaintext into ciphertext
     * by using an AWS KMS customer master key. The value returned by this data source
     * changes every apply. For a stable ciphertext value, see the `aws.kms.Ciphertext`
     * resource.
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
     *         var oauthConfig = new Key(&#34;oauthConfig&#34;, KeyArgs.builder()        
     *             .description(&#34;oauth config&#34;)
     *             .isEnabled(true)
     *             .build());
     * 
     *         final var oauth = KmsFunctions.getCipherText(GetCipherTextArgs.builder()
     *             .keyId(oauthConfig.getKeyId())
     *             .plaintext(&#34;&#34;&#34;
     * {
     *   &#34;client_id&#34;: &#34;e587dbae22222f55da22&#34;,
     *   &#34;client_secret&#34;: &#34;8289575d00000ace55e1815ec13673955721b8a5&#34;
     * }
     *             &#34;&#34;&#34;)
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCipherTextResult> getCipherText(GetCipherTextArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getCipherText:getCipherText", TypeShape.of(GetCipherTextResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get detailed information about
     * the specified KMS Key with flexible key id input.
     * This can be useful to reference key alias
     * without having to hard code the ARN as input.
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
     *         final var byAlias = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byId = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         final var byAliasArn = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byKeyArn = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get detailed information about
     * the specified KMS Key with flexible key id input.
     * This can be useful to reference key alias
     * without having to hard code the ARN as input.
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
     *         final var byAlias = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byId = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         final var byAliasArn = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byKeyArn = Output.of(KmsFunctions.getKey(GetKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getKey:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the public key about the specified KMS Key with flexible key id input. This can be useful to reference key alias without having to hard code the ARN as input.
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
     *         final var byAlias = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byId = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         final var byAliasArn = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byKeyArn = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args) {
        return getPublicKey(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get the public key about the specified KMS Key with flexible key id input. This can be useful to reference key alias without having to hard code the ARN as input.
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
     *         final var byAlias = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byId = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         final var byAliasArn = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:alias/my-key&#34;)
     *             .build()));
     * 
     *         final var byKeyArn = Output.of(KmsFunctions.getPublicKey(GetPublicKeyArgs.builder()
     *             .keyId(&#34;arn:aws:kms:us-east-1:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPublicKeyResult> getPublicKey(GetPublicKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getPublicKey:getPublicKey", TypeShape.of(GetPublicKeyResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getSecret:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Decrypt multiple secrets from data encrypted with the AWS KMS service.
     * 
     */
    public static CompletableFuture<GetSecretsResult> getSecrets(GetSecretsArgs args) {
        return getSecrets(args, InvokeOptions.Empty);
    }
    /**
     * Decrypt multiple secrets from data encrypted with the AWS KMS service.
     * 
     */
    public static CompletableFuture<GetSecretsResult> getSecrets(GetSecretsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kms/getSecrets:getSecrets", TypeShape.of(GetSecretsResult.class), args, Utilities.withVersion(options));
    }
}
