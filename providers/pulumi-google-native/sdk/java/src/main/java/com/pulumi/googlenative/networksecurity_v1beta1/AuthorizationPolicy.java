// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networksecurity_v1beta1.AuthorizationPolicyArgs;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.RuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new AuthorizationPolicy in a given project and location.
 * 
 */
@ResourceType(type="google-native:networksecurity/v1beta1:AuthorizationPolicy")
public class AuthorizationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The action to take when a rule match is found. Possible values are &#34;ALLOW&#34; or &#34;DENY&#34;.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The action to take when a rule match is found. Possible values are &#34;ALLOW&#34; or &#34;DENY&#34;.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The timestamp when the resource was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optional. Free-text description of the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Set of label tags associated with the AuthorizationPolicy resource.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the AuthorizationPolicy resource. It matches pattern `projects/{project}/locations/{location}/authorizationPolicies/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    @Export(name="rules", type=List.class, parameters={RuleResponse.class})
    private Output<List<RuleResponse>> rules;

    /**
     * @return Optional. List of rules to match. Note that at least one of the rules must match in order for the action specified in the &#39;action&#39; field to be taken. A rule is a match if there is a matching source and destination. If left blank, the action specified in the `action` field will be applied on every request.
     * 
     */
    public Output<List<RuleResponse>> rules() {
        return this.rules;
    }
    /**
     * The timestamp when the resource was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizationPolicy(String name) {
        this(name, AuthorizationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizationPolicy(String name, AuthorizationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizationPolicy(String name, AuthorizationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1beta1:AuthorizationPolicy", name, args == null ? AuthorizationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthorizationPolicy(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:networksecurity/v1beta1:AuthorizationPolicy", name, null, makeResourceOptions(options, id));
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
    public static AuthorizationPolicy get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizationPolicy(name, id, options);
    }
}
