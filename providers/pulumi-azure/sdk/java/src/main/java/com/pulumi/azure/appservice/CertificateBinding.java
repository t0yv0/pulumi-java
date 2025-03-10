// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.CertificateBindingArgs;
import com.pulumi.azure.appservice.inputs.CertificateBindingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an App Service Certificate Binding.
 * 
 * ## Import
 * 
 * App Service Certificate Bindings can be imported using the `hostname_binding_id` and the `app_service_certificate_id` , e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/certificateBinding:CertificateBinding example &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Web/sites/instance1/hostNameBindings/mywebsite.com|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Web/certificates/mywebsite.com&#34;
 * ```
 * 
 */
@ResourceType(type="azure:appservice/certificateBinding:CertificateBinding")
public class CertificateBinding extends com.pulumi.resources.CustomResource {
    /**
     * The name of the App Service to which the certificate was bound.
     * 
     */
    @Export(name="appServiceName", type=String.class, parameters={})
    private Output<String> appServiceName;

    /**
     * @return The name of the App Service to which the certificate was bound.
     * 
     */
    public Output<String> appServiceName() {
        return this.appServiceName;
    }
    /**
     * The ID of the certificate to bind to the custom domain. Changing this forces a new App Service Certificate Binding to be created.
     * 
     */
    @Export(name="certificateId", type=String.class, parameters={})
    private Output<String> certificateId;

    /**
     * @return The ID of the certificate to bind to the custom domain. Changing this forces a new App Service Certificate Binding to be created.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }
    /**
     * The hostname of the bound certificate.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return The hostname of the bound certificate.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The ID of the Custom Domain/Hostname Binding. Changing this forces a new App Service Certificate Binding to be created.
     * 
     */
    @Export(name="hostnameBindingId", type=String.class, parameters={})
    private Output<String> hostnameBindingId;

    /**
     * @return The ID of the Custom Domain/Hostname Binding. Changing this forces a new App Service Certificate Binding to be created.
     * 
     */
    public Output<String> hostnameBindingId() {
        return this.hostnameBindingId;
    }
    /**
     * The type of certificate binding. Allowed values are `IpBasedEnabled` or `SniEnabled`. Changing this forces a new App Service Certificate Binding to be created.
     * 
     */
    @Export(name="sslState", type=String.class, parameters={})
    private Output<String> sslState;

    /**
     * @return The type of certificate binding. Allowed values are `IpBasedEnabled` or `SniEnabled`. Changing this forces a new App Service Certificate Binding to be created.
     * 
     */
    public Output<String> sslState() {
        return this.sslState;
    }
    /**
     * The certificate thumbprint.
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output<String> thumbprint;

    /**
     * @return The certificate thumbprint.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateBinding(String name) {
        this(name, CertificateBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateBinding(String name, CertificateBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateBinding(String name, CertificateBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/certificateBinding:CertificateBinding", name, args == null ? CertificateBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateBinding(String name, Output<String> id, @Nullable CertificateBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/certificateBinding:CertificateBinding", name, state, makeResourceOptions(options, id));
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
    public static CertificateBinding get(String name, Output<String> id, @Nullable CertificateBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateBinding(name, id, state, options);
    }
}
