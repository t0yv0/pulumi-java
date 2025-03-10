// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.networkfirewall.FirewallPolicyArgs;
import com.pulumi.awsnative.networkfirewall.outputs.FirewallPolicyTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::NetworkFirewall::FirewallPolicy
 * 
 */
@ResourceType(type="aws-native:networkfirewall:FirewallPolicy")
public class FirewallPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="firewallPolicy", type=com.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy.class, parameters={})
    private Output<com.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy> firewallPolicy;

    public Output<com.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy> firewallPolicy() {
        return this.firewallPolicy;
    }
    @Export(name="firewallPolicyArn", type=String.class, parameters={})
    private Output<String> firewallPolicyArn;

    public Output<String> firewallPolicyArn() {
        return this.firewallPolicyArn;
    }
    @Export(name="firewallPolicyId", type=String.class, parameters={})
    private Output<String> firewallPolicyId;

    public Output<String> firewallPolicyId() {
        return this.firewallPolicyId;
    }
    @Export(name="firewallPolicyName", type=String.class, parameters={})
    private Output<String> firewallPolicyName;

    public Output<String> firewallPolicyName() {
        return this.firewallPolicyName;
    }
    @Export(name="tags", type=List.class, parameters={FirewallPolicyTag.class})
    private Output</* @Nullable */ List<FirewallPolicyTag>> tags;

    public Output<Optional<List<FirewallPolicyTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallPolicy(String name) {
        this(name, FirewallPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:FirewallPolicy", name, args == null ? FirewallPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:FirewallPolicy", name, null, makeResourceOptions(options, id));
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
    public static FirewallPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicy(name, id, options);
    }
}
