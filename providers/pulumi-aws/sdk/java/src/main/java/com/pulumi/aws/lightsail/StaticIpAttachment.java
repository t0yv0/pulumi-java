// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.StaticIpAttachmentArgs;
import com.pulumi.aws.lightsail.inputs.StaticIpAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a static IP address attachment - relationship between a Lightsail static IP &amp; Lightsail instance.
 * 
 * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
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
 *         var testStaticIp = new StaticIp(&#34;testStaticIp&#34;);
 * 
 *         var testInstance = new Instance(&#34;testInstance&#34;, InstanceArgs.builder()        
 *             .availabilityZone(&#34;us-east-1b&#34;)
 *             .blueprintId(&#34;string&#34;)
 *             .bundleId(&#34;string&#34;)
 *             .keyPairName(&#34;some_key_name&#34;)
 *             .build());
 * 
 *         var testStaticIpAttachment = new StaticIpAttachment(&#34;testStaticIpAttachment&#34;, StaticIpAttachmentArgs.builder()        
 *             .staticIpName(testStaticIp.getId())
 *             .instanceName(testInstance.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:lightsail/staticIpAttachment:StaticIpAttachment")
public class StaticIpAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Lightsail instance to attach the IP to
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return The name of the Lightsail instance to attach the IP to
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * The allocated static IP address
     * 
     */
    @Export(name="ipAddress", type=String.class, parameters={})
    private Output<String> ipAddress;

    /**
     * @return The allocated static IP address
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * The name of the allocated static IP
     * 
     */
    @Export(name="staticIpName", type=String.class, parameters={})
    private Output<String> staticIpName;

    /**
     * @return The name of the allocated static IP
     * 
     */
    public Output<String> staticIpName() {
        return this.staticIpName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StaticIpAttachment(String name) {
        this(name, StaticIpAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StaticIpAttachment(String name, StaticIpAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StaticIpAttachment(String name, StaticIpAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/staticIpAttachment:StaticIpAttachment", name, args == null ? StaticIpAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StaticIpAttachment(String name, Output<String> id, @Nullable StaticIpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/staticIpAttachment:StaticIpAttachment", name, state, makeResourceOptions(options, id));
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
    public static StaticIpAttachment get(String name, Output<String> id, @Nullable StaticIpAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StaticIpAttachment(name, id, state, options);
    }
}
