// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.mediapackage.PackagingGroupArgs;
import com.pulumi.awsnative.mediapackage.outputs.PackagingGroupAuthorization;
import com.pulumi.awsnative.mediapackage.outputs.PackagingGroupLogConfiguration;
import com.pulumi.awsnative.mediapackage.outputs.PackagingGroupTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::MediaPackage::PackagingGroup
 * 
 */
@ResourceType(type="aws-native:mediapackage:PackagingGroup")
public class PackagingGroup extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the PackagingGroup.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the PackagingGroup.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * CDN Authorization
     * 
     */
    @Export(name="authorization", type=PackagingGroupAuthorization.class, parameters={})
    private Output</* @Nullable */ PackagingGroupAuthorization> authorization;

    /**
     * @return CDN Authorization
     * 
     */
    public Output<Optional<PackagingGroupAuthorization>> authorization() {
        return Codegen.optional(this.authorization);
    }
    /**
     * The fully qualified domain name for Assets in the PackagingGroup.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The fully qualified domain name for Assets in the PackagingGroup.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The configuration parameters for egress access logging.
     * 
     */
    @Export(name="egressAccessLogs", type=PackagingGroupLogConfiguration.class, parameters={})
    private Output</* @Nullable */ PackagingGroupLogConfiguration> egressAccessLogs;

    /**
     * @return The configuration parameters for egress access logging.
     * 
     */
    public Output<Optional<PackagingGroupLogConfiguration>> egressAccessLogs() {
        return Codegen.optional(this.egressAccessLogs);
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @Export(name="tags", type=List.class, parameters={PackagingGroupTag.class})
    private Output</* @Nullable */ List<PackagingGroupTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output<Optional<List<PackagingGroupTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PackagingGroup(String name) {
        this(name, PackagingGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PackagingGroup(String name, @Nullable PackagingGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PackagingGroup(String name, @Nullable PackagingGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mediapackage:PackagingGroup", name, args == null ? PackagingGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PackagingGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mediapackage:PackagingGroup", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PackagingGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PackagingGroup(name, id, options);
    }
}
