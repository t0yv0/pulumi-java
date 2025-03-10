// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53.KeySigningKeyArgs;
import com.pulumi.awsnative.route53.enums.KeySigningKeyStatus;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Represents a key signing key (KSK) associated with a hosted zone. You can only have two KSKs per hosted zone.
 * 
 */
@ResourceType(type="aws-native:route53:KeySigningKey")
public class KeySigningKey extends com.pulumi.resources.CustomResource {
    /**
     * The unique string (ID) used to identify a hosted zone.
     * 
     */
    @Export(name="hostedZoneId", type=String.class, parameters={})
    private Output<String> hostedZoneId;

    /**
     * @return The unique string (ID) used to identify a hosted zone.
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The KeyManagementServiceArn must be unique for each key signing key (KSK) in a single hosted zone.
     * 
     */
    @Export(name="keyManagementServiceArn", type=String.class, parameters={})
    private Output<String> keyManagementServiceArn;

    /**
     * @return The Amazon resource name (ARN) for a customer managed key (CMK) in AWS Key Management Service (KMS). The KeyManagementServiceArn must be unique for each key signing key (KSK) in a single hosted zone.
     * 
     */
    public Output<String> keyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }
    /**
     * An alphanumeric string used to identify a key signing key (KSK). Name must be unique for each key signing key in the same hosted zone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return An alphanumeric string used to identify a key signing key (KSK). Name must be unique for each key signing key in the same hosted zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A string specifying the initial status of the key signing key (KSK). You can set the value to ACTIVE or INACTIVE.
     * 
     */
    @Export(name="status", type=KeySigningKeyStatus.class, parameters={})
    private Output<KeySigningKeyStatus> status;

    /**
     * @return A string specifying the initial status of the key signing key (KSK). You can set the value to ACTIVE or INACTIVE.
     * 
     */
    public Output<KeySigningKeyStatus> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeySigningKey(String name) {
        this(name, KeySigningKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeySigningKey(String name, KeySigningKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeySigningKey(String name, KeySigningKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53:KeySigningKey", name, args == null ? KeySigningKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeySigningKey(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53:KeySigningKey", name, null, makeResourceOptions(options, id));
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
    public static KeySigningKey get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeySigningKey(name, id, options);
    }
}
