// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcIpamScopeArgs;
import com.pulumi.aws.ec2.inputs.VpcIpamScopeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a scope for AWS IPAM.
 * 
 * ## Example Usage
 * 
 * Basic usage:
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
 *         final var current = Output.of(AwsFunctions.getRegion());
 * 
 *         var exampleVpcIpam = new VpcIpam(&#34;exampleVpcIpam&#34;, VpcIpamArgs.builder()        
 *             .operatingRegions(VpcIpamOperatingRegion.builder()
 *                 .regionName(current.apply(getRegionResult -&gt; getRegionResult.getName()))
 *                 .build())
 *             .build());
 * 
 *         var exampleVpcIpamScope = new VpcIpamScope(&#34;exampleVpcIpamScope&#34;, VpcIpamScopeArgs.builder()        
 *             .ipamId(exampleVpcIpam.getId())
 *             .description(&#34;Another Scope&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `scope_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamScope:VpcIpamScope example ipam-scope-0513c69f283d11dfb
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamScope:VpcIpamScope")
public class VpcIpamScope extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description for the scope you&#39;re creating.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the scope you&#39;re creating.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ARN of the IPAM for which you&#39;re creating this scope.
     * 
     */
    @Export(name="ipamArn", type=String.class, parameters={})
    private Output<String> ipamArn;

    /**
     * @return The ARN of the IPAM for which you&#39;re creating this scope.
     * 
     */
    public Output<String> ipamArn() {
        return this.ipamArn;
    }
    /**
     * The ID of the IPAM for which you&#39;re creating this scope.
     * 
     */
    @Export(name="ipamId", type=String.class, parameters={})
    private Output<String> ipamId;

    /**
     * @return The ID of the IPAM for which you&#39;re creating this scope.
     * 
     */
    public Output<String> ipamId() {
        return this.ipamId;
    }
    @Export(name="ipamScopeType", type=String.class, parameters={})
    private Output<String> ipamScopeType;

    public Output<String> ipamScopeType() {
        return this.ipamScopeType;
    }
    /**
     * Defines if the scope is the default scope or not.
     * 
     */
    @Export(name="isDefault", type=Boolean.class, parameters={})
    private Output<Boolean> isDefault;

    /**
     * @return Defines if the scope is the default scope or not.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * Count of pools under this scope
     * 
     */
    @Export(name="poolCount", type=Integer.class, parameters={})
    private Output<Integer> poolCount;

    /**
     * @return Count of pools under this scope
     * 
     */
    public Output<Integer> poolCount() {
        return this.poolCount;
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpamScope(String name) {
        this(name, VpcIpamScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpamScope(String name, VpcIpamScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamScope(String name, VpcIpamScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamScope:VpcIpamScope", name, args == null ? VpcIpamScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpamScope(String name, Output<String> id, @Nullable VpcIpamScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamScope:VpcIpamScope", name, state, makeResourceOptions(options, id));
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
    public static VpcIpamScope get(String name, Output<String> id, @Nullable VpcIpamScopeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamScope(name, id, state, options);
    }
}
