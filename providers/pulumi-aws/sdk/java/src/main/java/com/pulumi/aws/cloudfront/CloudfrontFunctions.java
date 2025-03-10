// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudfront.inputs.GetCachePolicyArgs;
import com.pulumi.aws.cloudfront.inputs.GetDistributionArgs;
import com.pulumi.aws.cloudfront.inputs.GetFunctionArgs;
import com.pulumi.aws.cloudfront.inputs.GetLogDeliveryCanonicalUserIdArgs;
import com.pulumi.aws.cloudfront.inputs.GetOriginAccessIdentityArgs;
import com.pulumi.aws.cloudfront.inputs.GetOriginRequestPolicyArgs;
import com.pulumi.aws.cloudfront.inputs.GetRealtimeLogConfigArgs;
import com.pulumi.aws.cloudfront.inputs.GetResponseHeadersPolicyArgs;
import com.pulumi.aws.cloudfront.outputs.GetCachePolicyResult;
import com.pulumi.aws.cloudfront.outputs.GetDistributionResult;
import com.pulumi.aws.cloudfront.outputs.GetFunctionResult;
import com.pulumi.aws.cloudfront.outputs.GetLogDeliveryCanonicalUserIdResult;
import com.pulumi.aws.cloudfront.outputs.GetOriginAccessIdentityResult;
import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyResult;
import com.pulumi.aws.cloudfront.outputs.GetRealtimeLogConfigResult;
import com.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class CloudfrontFunctions {
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getCachePolicy(GetCachePolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy() {
        return getCachePolicy(GetCachePolicyArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getCachePolicy(GetCachePolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy(GetCachePolicyArgs args) {
        return getCachePolicy(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getCachePolicy(GetCachePolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCachePolicyResult> getCachePolicy(GetCachePolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getCachePolicy:getCachePolicy", TypeShape.of(GetCachePolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a CloudFront distribution.
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
     *         final var test = Output.of(CloudfrontFunctions.getDistribution(GetDistributionArgs.builder()
     *             .id(&#34;EDFDVBD632BHDS5&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDistributionResult> getDistribution(GetDistributionArgs args) {
        return getDistribution(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a CloudFront distribution.
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
     *         final var test = Output.of(CloudfrontFunctions.getDistribution(GetDistributionArgs.builder()
     *             .id(&#34;EDFDVBD632BHDS5&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDistributionResult> getDistribution(GetDistributionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getDistribution:getDistribution", TypeShape.of(GetDistributionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about a CloudFront Function.
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
     *         final var config = Config.of();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = Output.of(CloudfrontFunctions.getFunction(GetFunctionArgs.builder()
     *             .name(functionName)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args) {
        return getFunction(args, InvokeOptions.Empty);
    }
    /**
     * Provides information about a CloudFront Function.
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
     *         final var config = Config.of();
     *         final var functionName = config.get(&#34;functionName&#34;);
     *         final var existing = Output.of(CloudfrontFunctions.getFunction(GetFunctionArgs.builder()
     *             .name(functionName)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetFunctionResult> getFunction(GetFunctionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getFunction:getFunction", TypeShape.of(GetFunctionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
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
     *         final var exampleLogDeliveryCanonicalUserId = Output.of(CloudfrontFunctions.getLogDeliveryCanonicalUserId());
     * 
     *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
     * 
     *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
     *             .bucket(exampleBucketV2.getId())
     *             .accessControlPolicy(BucketAclV2AccessControlPolicy.builder()
     *                 .grants(BucketAclV2AccessControlPolicyGrant.builder()
     *                     .grantee(BucketAclV2AccessControlPolicyGrantGrantee.builder()
     *                         .id(exampleLogDeliveryCanonicalUserId.apply(getLogDeliveryCanonicalUserIdResult -&gt; getLogDeliveryCanonicalUserIdResult.getId()))
     *                         .type(&#34;CanonicalUser&#34;)
     *                         .build())
     *                     .permission(&#34;FULL_CONTROL&#34;)
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLogDeliveryCanonicalUserIdResult> getLogDeliveryCanonicalUserId() {
        return getLogDeliveryCanonicalUserId(GetLogDeliveryCanonicalUserIdArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
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
     *         final var exampleLogDeliveryCanonicalUserId = Output.of(CloudfrontFunctions.getLogDeliveryCanonicalUserId());
     * 
     *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
     * 
     *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
     *             .bucket(exampleBucketV2.getId())
     *             .accessControlPolicy(BucketAclV2AccessControlPolicy.builder()
     *                 .grants(BucketAclV2AccessControlPolicyGrant.builder()
     *                     .grantee(BucketAclV2AccessControlPolicyGrantGrantee.builder()
     *                         .id(exampleLogDeliveryCanonicalUserId.apply(getLogDeliveryCanonicalUserIdResult -&gt; getLogDeliveryCanonicalUserIdResult.getId()))
     *                         .type(&#34;CanonicalUser&#34;)
     *                         .build())
     *                     .permission(&#34;FULL_CONTROL&#34;)
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLogDeliveryCanonicalUserIdResult> getLogDeliveryCanonicalUserId(GetLogDeliveryCanonicalUserIdArgs args) {
        return getLogDeliveryCanonicalUserId(args, InvokeOptions.Empty);
    }
    /**
     * The CloudFront Log Delivery Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS `awslogsdelivery` account for CloudFront bucket logging.
     * See the [Amazon CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/AccessLogs.html) for more information.
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
     *         final var exampleLogDeliveryCanonicalUserId = Output.of(CloudfrontFunctions.getLogDeliveryCanonicalUserId());
     * 
     *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
     * 
     *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
     *             .bucket(exampleBucketV2.getId())
     *             .accessControlPolicy(BucketAclV2AccessControlPolicy.builder()
     *                 .grants(BucketAclV2AccessControlPolicyGrant.builder()
     *                     .grantee(BucketAclV2AccessControlPolicyGrantGrantee.builder()
     *                         .id(exampleLogDeliveryCanonicalUserId.apply(getLogDeliveryCanonicalUserIdResult -&gt; getLogDeliveryCanonicalUserIdResult.getId()))
     *                         .type(&#34;CanonicalUser&#34;)
     *                         .build())
     *                     .permission(&#34;FULL_CONTROL&#34;)
     *                     .build())
     *                 .build())
     *             .build());
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetLogDeliveryCanonicalUserIdResult> getLogDeliveryCanonicalUserId(GetLogDeliveryCanonicalUserIdArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getLogDeliveryCanonicalUserId:getLogDeliveryCanonicalUserId", TypeShape.of(GetLogDeliveryCanonicalUserIdResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetOriginAccessIdentityResult> getOriginAccessIdentity(GetOriginAccessIdentityArgs args) {
        return getOriginAccessIdentity(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOriginAccessIdentityResult> getOriginAccessIdentity(GetOriginAccessIdentityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getOriginAccessIdentity:getOriginAccessIdentity", TypeShape.of(GetOriginAccessIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * 
     * The following example below creates a CloudFront origin request policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getOriginRequestPolicy(GetOriginRequestPolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy() {
        return getOriginRequestPolicy(GetOriginRequestPolicyArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * The following example below creates a CloudFront origin request policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getOriginRequestPolicy(GetOriginRequestPolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy(GetOriginRequestPolicyArgs args) {
        return getOriginRequestPolicy(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * 
     * The following example below creates a CloudFront origin request policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getOriginRequestPolicy(GetOriginRequestPolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetOriginRequestPolicyResult> getOriginRequestPolicy(GetOriginRequestPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getOriginRequestPolicy:getOriginRequestPolicy", TypeShape.of(GetOriginRequestPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides a CloudFront real-time log configuration resource.
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
     *         final var example = Output.of(CloudfrontFunctions.getRealtimeLogConfig(GetRealtimeLogConfigArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRealtimeLogConfigResult> getRealtimeLogConfig(GetRealtimeLogConfigArgs args) {
        return getRealtimeLogConfig(args, InvokeOptions.Empty);
    }
    /**
     * Provides a CloudFront real-time log configuration resource.
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
     *         final var example = Output.of(CloudfrontFunctions.getRealtimeLogConfig(GetRealtimeLogConfigArgs.builder()
     *             .name(&#34;example&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetRealtimeLogConfigResult> getRealtimeLogConfig(GetRealtimeLogConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getRealtimeLogConfig:getRealtimeLogConfig", TypeShape.of(GetRealtimeLogConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getResponseHeadersPolicy(GetResponseHeadersPolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy() {
        return getResponseHeadersPolicy(GetResponseHeadersPolicyArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getResponseHeadersPolicy(GetResponseHeadersPolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy(GetResponseHeadersPolicyArgs args) {
        return getResponseHeadersPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to retrieve information about a CloudFront cache policy.
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
     *         final var example = Output.of(CloudfrontFunctions.getResponseHeadersPolicy(GetResponseHeadersPolicyArgs.builder()
     *             .name(&#34;example-policy&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetResponseHeadersPolicyResult> getResponseHeadersPolicy(GetResponseHeadersPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudfront/getResponseHeadersPolicy:getResponseHeadersPolicy", TypeShape.of(GetResponseHeadersPolicyResult.class), args, Utilities.withVersion(options));
    }
}
