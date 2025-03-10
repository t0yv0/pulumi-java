// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storage_v1.HmacKeyArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new HMAC key for the specified service account.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:storage/v1:HmacKey")
public class HmacKey extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the HMAC Key.
     * 
     */
    @Export(name="accessId", type=String.class, parameters={})
    private Output<String> accessId;

    /**
     * @return The ID of the HMAC Key.
     * 
     */
    public Output<String> accessId() {
        return this.accessId;
    }
    /**
     * HTTP 1.1 Entity tag for the HMAC key.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the HMAC key.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For HMAC Key metadata, this is always storage#hmacKeyMetadata.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Project ID owning the service account to which the key authenticates.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return Project ID owning the service account to which the key authenticates.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The link to this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The link to this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The email address of the key&#39;s associated service account.
     * 
     */
    @Export(name="serviceAccountEmail", type=String.class, parameters={})
    private Output<String> serviceAccountEmail;

    /**
     * @return The email address of the key&#39;s associated service account.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }
    /**
     * The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the key. Can be one of ACTIVE, INACTIVE, or DELETED.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The creation time of the HMAC key in RFC 3339 format.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The creation time of the HMAC key in RFC 3339 format.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The last modification time of the HMAC key metadata in RFC 3339 format.
     * 
     */
    @Export(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    /**
     * @return The last modification time of the HMAC key metadata in RFC 3339 format.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HmacKey(String name) {
        this(name, HmacKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HmacKey(String name, HmacKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HmacKey(String name, HmacKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:HmacKey", name, args == null ? HmacKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HmacKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:HmacKey", name, null, makeResourceOptions(options, id));
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
    public static HmacKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HmacKey(name, id, options);
    }
}
