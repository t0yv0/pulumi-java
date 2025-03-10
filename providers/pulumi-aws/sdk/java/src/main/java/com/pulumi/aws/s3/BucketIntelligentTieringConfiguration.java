// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketIntelligentTieringConfigurationArgs;
import com.pulumi.aws.s3.inputs.BucketIntelligentTieringConfigurationState;
import com.pulumi.aws.s3.outputs.BucketIntelligentTieringConfigurationFilter;
import com.pulumi.aws.s3.outputs.BucketIntelligentTieringConfigurationTiering;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an [S3 Intelligent-Tiering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intelligent-tiering.html) configuration resource.
 * 
 * ## Example Usage
 * ### Add intelligent tiering configuration for entire S3 bucket
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
 *         var example = new BucketV2(&#34;example&#34;);
 * 
 *         var example_entire_bucket = new BucketIntelligentTieringConfiguration(&#34;example-entire-bucket&#34;, BucketIntelligentTieringConfigurationArgs.builder()        
 *             .bucket(example.getBucket())
 *             .tierings(            
 *                 BucketIntelligentTieringConfigurationTiering.builder()
 *                     .accessTier(&#34;DEEP_ARCHIVE_ACCESS&#34;)
 *                     .days(180)
 *                     .build(),
 *                 BucketIntelligentTieringConfigurationTiering.builder()
 *                     .accessTier(&#34;ARCHIVE_ACCESS&#34;)
 *                     .days(125)
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Add intelligent tiering configuration with S3 object filter
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
 *         var example = new BucketV2(&#34;example&#34;);
 * 
 *         var example_filtered = new BucketIntelligentTieringConfiguration(&#34;example-filtered&#34;, BucketIntelligentTieringConfigurationArgs.builder()        
 *             .bucket(example.getBucket())
 *             .status(&#34;Disabled&#34;)
 *             .filter(BucketIntelligentTieringConfigurationFilter.builder()
 *                 .prefix(&#34;documents/&#34;)
 *                 .tags(Map.ofEntries(
 *                     Map.entry(&#34;priority&#34;, &#34;high&#34;),
 *                     Map.entry(&#34;class&#34;, &#34;blue&#34;)
 *                 ))
 *                 .build())
 *             .tierings(BucketIntelligentTieringConfigurationTiering.builder()
 *                 .accessTier(&#34;ARCHIVE_ACCESS&#34;)
 *                 .days(125)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * S3 bucket intelligent tiering configurations can be imported using `bucket:name`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration my-bucket-entire-bucket my-bucket:EntireBucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration")
public class BucketIntelligentTieringConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket this intelligent tiering configuration is associated with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    @Export(name="filter", type=BucketIntelligentTieringConfigurationFilter.class, parameters={})
    private Output</* @Nullable */ BucketIntelligentTieringConfigurationFilter> filter;

    /**
     * @return A bucket filter. The configuration only includes objects that meet the filter&#39;s criteria (documented below).
     * 
     */
    public Output<Optional<BucketIntelligentTieringConfigurationFilter>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique name used to identify the S3 Intelligent-Tiering configuration for the bucket.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Specifies the status of the configuration. Valid values: `Enabled`, `Disabled`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }
    /**
     * The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    @Export(name="tierings", type=List.class, parameters={BucketIntelligentTieringConfigurationTiering.class})
    private Output<List<BucketIntelligentTieringConfigurationTiering>> tierings;

    /**
     * @return The S3 Intelligent-Tiering storage class tiers of the configuration (documented below).
     * 
     */
    public Output<List<BucketIntelligentTieringConfigurationTiering>> tierings() {
        return this.tierings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketIntelligentTieringConfiguration(String name) {
        this(name, BucketIntelligentTieringConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketIntelligentTieringConfiguration(String name, BucketIntelligentTieringConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketIntelligentTieringConfiguration(String name, BucketIntelligentTieringConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration", name, args == null ? BucketIntelligentTieringConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketIntelligentTieringConfiguration(String name, Output<String> id, @Nullable BucketIntelligentTieringConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketIntelligentTieringConfiguration:BucketIntelligentTieringConfiguration", name, state, makeResourceOptions(options, id));
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
    public static BucketIntelligentTieringConfiguration get(String name, Output<String> id, @Nullable BucketIntelligentTieringConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketIntelligentTieringConfiguration(name, id, state, options);
    }
}
