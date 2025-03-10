// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.signalrservice.SignalRCustomDomainArgs;
import com.pulumi.azurenative.signalrservice.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.signalrservice.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A custom domain
 * API Version: 2022-02-01.
 * 
 * ## Example Usage
 * ### SignalRCustomDomains_CreateOrUpdate
 * 
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
 *         var signalRCustomDomain = new SignalRCustomDomain(&#34;signalRCustomDomain&#34;, SignalRCustomDomainArgs.builder()        
 *             .customCertificate(Map.of(&#34;id&#34;, &#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/SignalR/mySignalRService/customCertificates/myCert&#34;))
 *             .domainName(&#34;example.com&#34;)
 *             .name(&#34;myDomain&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .resourceName(&#34;mySignalRService&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:signalrservice:SignalRCustomDomain myDomain /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/SignalR/mySignalRService/customDomains/myDomain 
 * ```
 * 
 */
@ResourceType(type="azure-native:signalrservice:SignalRCustomDomain")
public class SignalRCustomDomain extends com.pulumi.resources.CustomResource {
    /**
     * Reference to a resource.
     * 
     */
    @Export(name="customCertificate", type=ResourceReferenceResponse.class, parameters={})
    private Output<ResourceReferenceResponse> customCertificate;

    /**
     * @return Reference to a resource.
     * 
     */
    public Output<ResourceReferenceResponse> customCertificate() {
        return this.customCertificate;
    }
    /**
     * The custom domain name.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The custom domain name.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource - e.g. &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource - e.g. &#34;Microsoft.SignalRService/SignalR&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SignalRCustomDomain(String name) {
        this(name, SignalRCustomDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SignalRCustomDomain(String name, SignalRCustomDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SignalRCustomDomain(String name, SignalRCustomDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalRCustomDomain", name, args == null ? SignalRCustomDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SignalRCustomDomain(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalRCustomDomain", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:signalrservice/v20220201:SignalRCustomDomain").build())
            ))
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
    public static SignalRCustomDomain get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SignalRCustomDomain(name, id, options);
    }
}
