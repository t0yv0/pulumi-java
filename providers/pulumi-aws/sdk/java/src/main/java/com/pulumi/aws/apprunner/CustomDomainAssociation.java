// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apprunner;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apprunner.CustomDomainAssociationArgs;
import com.pulumi.aws.apprunner.inputs.CustomDomainAssociationState;
import com.pulumi.aws.apprunner.outputs.CustomDomainAssociationCertificateValidationRecord;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an App Runner Custom Domain association.
 * 
 * &gt; **NOTE:** After creation, you must use the information in the `certification_validation_records` attribute to add CNAME records to your Domain Name System (DNS). For each mapped domain name, add a mapping to the target App Runner subdomain (found in the `dns_target` attribute) and one or more certificate validation records. App Runner then performs DNS validation to verify that you own or control the domain name you associated. App Runner tracks domain validity in a certificate stored in AWS Certificate Manager (ACM).
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
 *         var example = new CustomDomainAssociation(&#34;example&#34;, CustomDomainAssociationArgs.builder()        
 *             .domainName(&#34;example.com&#34;)
 *             .serviceArn(aws_apprunner_service.getExample().getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * App Runner Custom Domain Associations can be imported by using the `domain_name` and `service_arn` separated by a comma (`,`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apprunner/customDomainAssociation:CustomDomainAssociation example example.com,arn:aws:apprunner:us-east-1:123456789012:service/example-
 * ```
 * 
 *  app/8fe1e10304f84fd2b0df550fe98a71fa
 * 
 */
@ResourceType(type="aws:apprunner/customDomainAssociation:CustomDomainAssociation")
public class CustomDomainAssociation extends com.pulumi.resources.CustomResource {
    /**
     * A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
     * 
     */
    @Export(name="certificateValidationRecords", type=List.class, parameters={CustomDomainAssociationCertificateValidationRecord.class})
    private Output<List<CustomDomainAssociationCertificateValidationRecord>> certificateValidationRecords;

    /**
     * @return A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
     * 
     */
    public Output<List<CustomDomainAssociationCertificateValidationRecord>> certificateValidationRecords() {
        return this.certificateValidationRecords;
    }
    /**
     * The App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
     * 
     */
    @Export(name="dnsTarget", type=String.class, parameters={})
    private Output<String> dnsTarget;

    /**
     * @return The App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
     * 
     */
    public Output<String> dnsTarget() {
        return this.dnsTarget;
    }
    /**
     * The custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
     * 
     */
    @Export(name="enableWwwSubdomain", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableWwwSubdomain;

    /**
     * @return Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enableWwwSubdomain() {
        return Codegen.optional(this.enableWwwSubdomain);
    }
    /**
     * The ARN of the App Runner service.
     * 
     */
    @Export(name="serviceArn", type=String.class, parameters={})
    private Output<String> serviceArn;

    /**
     * @return The ARN of the App Runner service.
     * 
     */
    public Output<String> serviceArn() {
        return this.serviceArn;
    }
    /**
     * The current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomDomainAssociation(String name) {
        this(name, CustomDomainAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomDomainAssociation(String name, CustomDomainAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomDomainAssociation(String name, CustomDomainAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/customDomainAssociation:CustomDomainAssociation", name, args == null ? CustomDomainAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomDomainAssociation(String name, Output<String> id, @Nullable CustomDomainAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apprunner/customDomainAssociation:CustomDomainAssociation", name, state, makeResourceOptions(options, id));
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
    public static CustomDomainAssociation get(String name, Output<String> id, @Nullable CustomDomainAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomDomainAssociation(name, id, state, options);
    }
}
