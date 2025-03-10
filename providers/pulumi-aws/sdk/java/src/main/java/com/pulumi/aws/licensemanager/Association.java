// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.licensemanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.licensemanager.AssociationArgs;
import com.pulumi.aws.licensemanager.inputs.AssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a License Manager association.
 * 
 * &gt; **Note:** License configurations can also be associated with launch templates by specifying the `license_specifications` block for an `aws.ec2.LaunchTemplate`.
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
 *         final var exampleAmi = Output.of(Ec2Functions.getAmi(GetAmiArgs.builder()
 *             .mostRecent(true)
 *             .owners(&#34;amazon&#34;)
 *             .filters(GetAmiFilter.builder()
 *                 .name(&#34;name&#34;)
 *                 .values(&#34;amzn-ami-vpc-nat*&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .ami(exampleAmi.apply(getAmiResult -&gt; getAmiResult.getId()))
 *             .instanceType(&#34;t2.micro&#34;)
 *             .build());
 * 
 *         var exampleLicenseConfiguration = new LicenseConfiguration(&#34;exampleLicenseConfiguration&#34;, LicenseConfigurationArgs.builder()        
 *             .licenseCountingType(&#34;Instance&#34;)
 *             .build());
 * 
 *         var exampleAssociation = new Association(&#34;exampleAssociation&#34;, AssociationArgs.builder()        
 *             .licenseConfigurationArn(exampleLicenseConfiguration.getArn())
 *             .resourceArn(exampleInstance.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * License configurations can be imported in the form `resource_arn,license_configuration_arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:licensemanager/association:Association example arn:aws:ec2:eu-west-1:123456789012:image/ami-123456789abcdef01,arn:aws:license-manager:eu-west-1:123456789012:license-configuration:lic-0123456789abcdef0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:licensemanager/association:Association")
public class Association extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the license configuration.
     * 
     */
    @Export(name="licenseConfigurationArn", type=String.class, parameters={})
    private Output<String> licenseConfigurationArn;

    /**
     * @return ARN of the license configuration.
     * 
     */
    public Output<String> licenseConfigurationArn() {
        return this.licenseConfigurationArn;
    }
    /**
     * ARN of the resource associated with the license configuration.
     * 
     */
    @Export(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return ARN of the resource associated with the license configuration.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Association(String name) {
        this(name, AssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Association(String name, AssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Association(String name, AssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:licensemanager/association:Association", name, args == null ? AssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Association(String name, Output<String> id, @Nullable AssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:licensemanager/association:Association", name, state, makeResourceOptions(options, id));
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
    public static Association get(String name, Output<String> id, @Nullable AssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Association(name, id, state, options);
    }
}
