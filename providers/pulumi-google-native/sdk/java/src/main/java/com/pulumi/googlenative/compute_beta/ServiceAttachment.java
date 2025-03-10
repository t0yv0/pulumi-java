// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.compute_beta.ServiceAttachmentArgs;
import com.pulumi.googlenative.compute_beta.outputs.ServiceAttachmentConnectedEndpointResponse;
import com.pulumi.googlenative.compute_beta.outputs.ServiceAttachmentConsumerProjectLimitResponse;
import com.pulumi.googlenative.compute_beta.outputs.Uint128Response;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a ServiceAttachment in the specified project in the given scope using the parameters that are included in the request.
 * 
 */
@ResourceType(type="google-native:compute/beta:ServiceAttachment")
public class ServiceAttachment extends com.pulumi.resources.CustomResource {
    /**
     * An array of connections for all the consumers connected to this service attachment.
     * 
     */
    @Export(name="connectedEndpoints", type=List.class, parameters={ServiceAttachmentConnectedEndpointResponse.class})
    private Output<List<ServiceAttachmentConnectedEndpointResponse>> connectedEndpoints;

    /**
     * @return An array of connections for all the consumers connected to this service attachment.
     * 
     */
    public Output<List<ServiceAttachmentConnectedEndpointResponse>> connectedEndpoints() {
        return this.connectedEndpoints;
    }
    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    @Export(name="connectionPreference", type=String.class, parameters={})
    private Output<String> connectionPreference;

    /**
     * @return The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    public Output<String> connectionPreference() {
        return this.connectionPreference;
    }
    /**
     * Projects that are allowed to connect to this service attachment.
     * 
     */
    @Export(name="consumerAcceptLists", type=List.class, parameters={ServiceAttachmentConsumerProjectLimitResponse.class})
    private Output<List<ServiceAttachmentConsumerProjectLimitResponse>> consumerAcceptLists;

    /**
     * @return Projects that are allowed to connect to this service attachment.
     * 
     */
    public Output<List<ServiceAttachmentConsumerProjectLimitResponse>> consumerAcceptLists() {
        return this.consumerAcceptLists;
    }
    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    @Export(name="consumerRejectLists", type=List.class, parameters={String.class})
    private Output<List<String>> consumerRejectLists;

    /**
     * @return Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    public Output<List<String>> consumerRejectLists() {
        return this.consumerRejectLists;
    }
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
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
     * 
     */
    @Export(name="domainNames", type=List.class, parameters={String.class})
    private Output<List<String>> domainNames;

    /**
     * @return If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: &#34;p.mycompany.com.&#34;. Current max number of domain names supported is 1.
     * 
     */
    public Output<List<String>> domainNames() {
        return this.domainNames;
    }
    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    @Export(name="enableProxyProtocol", type=Boolean.class, parameters={})
    private Output<Boolean> enableProxyProtocol;

    /**
     * @return If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    public Output<Boolean> enableProxyProtocol() {
        return this.enableProxyProtocol;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
     * 
     */
    @Export(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ServiceAttachment. An up-to-date fingerprint must be provided in order to patch/update the ServiceAttachment; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the ServiceAttachment.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * Type of the resource. Always compute#serviceAttachment for service attachments.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the resource. Always compute#serviceAttachment for service attachments.
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
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    @Export(name="natSubnets", type=List.class, parameters={String.class})
    private Output<List<String>> natSubnets;

    /**
     * @return An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    public Output<List<String>> natSubnets() {
        return this.natSubnets;
    }
    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    @Export(name="producerForwardingRule", type=String.class, parameters={})
    private Output<String> producerForwardingRule;

    /**
     * @return The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    public Output<String> producerForwardingRule() {
        return this.producerForwardingRule;
    }
    /**
     * An 128-bit global unique ID of the PSC service attachment.
     * 
     */
    @Export(name="pscServiceAttachmentId", type=Uint128Response.class, parameters={})
    private Output<Uint128Response> pscServiceAttachmentId;

    /**
     * @return An 128-bit global unique ID of the PSC service attachment.
     * 
     */
    public Output<Uint128Response> pscServiceAttachmentId() {
        return this.pscServiceAttachmentId;
    }
    /**
     * URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the service attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> region() {
        return this.region;
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
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    @Export(name="targetService", type=String.class, parameters={})
    private Output<String> targetService;

    /**
     * @return The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    public Output<String> targetService() {
        return this.targetService;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAttachment(String name) {
        this(name, ServiceAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAttachment(String name, ServiceAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAttachment(String name, ServiceAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:ServiceAttachment", name, args == null ? ServiceAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAttachment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:ServiceAttachment", name, null, makeResourceOptions(options, id));
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
    public static ServiceAttachment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAttachment(name, id, options);
    }
}
