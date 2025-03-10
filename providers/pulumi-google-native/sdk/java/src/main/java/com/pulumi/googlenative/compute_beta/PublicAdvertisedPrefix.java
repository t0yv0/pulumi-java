// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_beta.PublicAdvertisedPrefixArgs;
import com.pulumi.googlenative.compute_beta.outputs.PublicAdvertisedPrefixPublicDelegatedPrefixResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a PublicAdvertisedPrefix in the specified project using the parameters that are included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:PublicAdvertisedPrefix")
public class PublicAdvertisedPrefix extends com.pulumi.resources.CustomResource {
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The IPv4 address to be used for reverse DNS verification.
     * 
     */
    @Export(name="dnsVerificationIp", type=String.class, parameters={})
    private Output<String> dnsVerificationIp;

    /**
     * @return The IPv4 address to be used for reverse DNS verification.
     * 
     */
    public Output<String> dnsVerificationIp() {
        return this.dnsVerificationIp;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a new PublicAdvertisedPrefix. An up-to-date fingerprint must be provided in order to update the PublicAdvertisedPrefix, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a PublicAdvertisedPrefix.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    @Export(name="ipCidrRange", type=String.class, parameters={})
    private Output<String> ipCidrRange;

    /**
     * @return The IPv4 address range, in CIDR format, represented by this public advertised prefix.
     * 
     */
    public Output<String> ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#publicAdvertisedPrefix for public advertised prefixes.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of public delegated prefixes that exist for this public advertised prefix.
     * 
     */
    @Export(name="publicDelegatedPrefixs", type=List.class, parameters={PublicAdvertisedPrefixPublicDelegatedPrefixResponse.class})
    private Output<List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse>> publicDelegatedPrefixs;

    /**
     * @return The list of public delegated prefixes that exist for this public advertised prefix.
     * 
     */
    public Output<List<PublicAdvertisedPrefixPublicDelegatedPrefixResponse>> publicDelegatedPrefixs() {
        return this.publicDelegatedPrefixs;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The shared secret to be used for reverse DNS verification.
     * 
     */
    @Export(name="sharedSecret", type=String.class, parameters={})
    private Output<String> sharedSecret;

    /**
     * @return The shared secret to be used for reverse DNS verification.
     * 
     */
    public Output<String> sharedSecret() {
        return this.sharedSecret;
    }
    /**
     * The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the public advertised prefix. Possible values include: - `INITIAL`: RPKI validation is complete. - `PTR_CONFIGURED`: User has configured the PTR. - `VALIDATED`: Reverse DNS lookup is successful. - `REVERSE_DNS_LOOKUP_FAILED`: Reverse DNS lookup failed. - `PREFIX_CONFIGURATION_IN_PROGRESS`: The prefix is being configured. - `PREFIX_CONFIGURATION_COMPLETE`: The prefix is fully configured. - `PREFIX_REMOVAL_IN_PROGRESS`: The prefix is being removed.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicAdvertisedPrefix(String name) {
        this(name, PublicAdvertisedPrefixArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicAdvertisedPrefix(String name, @Nullable PublicAdvertisedPrefixArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicAdvertisedPrefix(String name, @Nullable PublicAdvertisedPrefixArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:PublicAdvertisedPrefix", name, args == null ? PublicAdvertisedPrefixArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublicAdvertisedPrefix(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:PublicAdvertisedPrefix", name, null, makeResourceOptions(options, id));
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
    public static PublicAdvertisedPrefix get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublicAdvertisedPrefix(name, id, options);
    }
}
