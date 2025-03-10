// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs;
import com.pulumi.aws.ec2.inputs.SpotDatafeedSubscriptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Note:** There is only a single subscription allowed per account.
 * 
 * To help you understand the charges for your Spot instances, Amazon EC2 provides a data feed that describes your Spot instance usage and pricing.
 * This data feed is sent to an Amazon S3 bucket that you specify when you subscribe to the data feed.
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
 *         var defaultBucketV2 = new BucketV2(&#34;defaultBucketV2&#34;);
 * 
 *         var defaultSpotDatafeedSubscription = new SpotDatafeedSubscription(&#34;defaultSpotDatafeedSubscription&#34;, SpotDatafeedSubscriptionArgs.builder()        
 *             .bucket(defaultBucketV2.getBucket())
 *             .prefix(&#34;my_subdirectory&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * A Spot Datafeed Subscription can be imported using the word `spot-datafeed-subscription`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription mysubscription spot-datafeed-subscription
 * ```
 * 
 */
@ResourceType(type="aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription")
public class SpotDatafeedSubscription extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon S3 bucket in which to store the Spot instance data feed.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The Amazon S3 bucket in which to store the Spot instance data feed.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Path of folder inside bucket to place spot pricing data.
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return Path of folder inside bucket to place spot pricing data.
     * 
     */
    public Output<Optional<String>> prefix() {
        return Codegen.optional(this.prefix);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpotDatafeedSubscription(String name) {
        this(name, SpotDatafeedSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpotDatafeedSubscription(String name, SpotDatafeedSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpotDatafeedSubscription(String name, SpotDatafeedSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription", name, args == null ? SpotDatafeedSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SpotDatafeedSubscription(String name, Output<String> id, @Nullable SpotDatafeedSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SpotDatafeedSubscription get(String name, Output<String> id, @Nullable SpotDatafeedSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SpotDatafeedSubscription(name, id, state, options);
    }
}
