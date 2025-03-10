// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudfront.KeyGroupArgs;
import com.pulumi.aws.cloudfront.inputs.KeyGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * The following example below creates a CloudFront key group.
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
 *         var examplePublicKey = new PublicKey(&#34;examplePublicKey&#34;, PublicKeyArgs.builder()        
 *             .comment(&#34;example public key&#34;)
 *             .encodedKey(Files.readString(&#34;public_key.pem&#34;))
 *             .build());
 * 
 *         var exampleKeyGroup = new KeyGroup(&#34;exampleKeyGroup&#34;, KeyGroupArgs.builder()        
 *             .comment(&#34;example key group&#34;)
 *             .items(examplePublicKey.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * CloudFront Key Group can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudfront/keyGroup:KeyGroup example 4b4f2r1c-315d-5c2e-f093-216t50jed10f
 * ```
 * 
 */
@ResourceType(type="aws:cloudfront/keyGroup:KeyGroup")
public class KeyGroup extends com.pulumi.resources.CustomResource {
    /**
     * A comment to describe the key group..
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return A comment to describe the key group..
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The identifier for this version of the key group.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The identifier for this version of the key group.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * A list of the identifiers of the public keys in the key group.
     * 
     */
    @Export(name="items", type=List.class, parameters={String.class})
    private Output<List<String>> items;

    /**
     * @return A list of the identifiers of the public keys in the key group.
     * 
     */
    public Output<List<String>> items() {
        return this.items;
    }
    /**
     * A name to identify the key group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name to identify the key group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyGroup(String name) {
        this(name, KeyGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyGroup(String name, KeyGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyGroup(String name, KeyGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/keyGroup:KeyGroup", name, args == null ? KeyGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeyGroup(String name, Output<String> id, @Nullable KeyGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/keyGroup:KeyGroup", name, state, makeResourceOptions(options, id));
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
    public static KeyGroup get(String name, Output<String> id, @Nullable KeyGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeyGroup(name, id, state, options);
    }
}
