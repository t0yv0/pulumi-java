// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.UserPolicyAttachmentArgs;
import com.pulumi.aws.iam.inputs.UserPolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attaches a Managed IAM Policy to an IAM user
 * 
 * &gt; **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
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
 *         var user = new User(&#34;user&#34;);
 * 
 *         var policy = new Policy(&#34;policy&#34;, PolicyArgs.builder()        
 *             .description(&#34;A test policy&#34;)
 *             .policy(&#34;{ ... policy JSON ... }&#34;)
 *             .build());
 * 
 *         var test_attach = new UserPolicyAttachment(&#34;test-attach&#34;, UserPolicyAttachmentArgs.builder()        
 *             .user(user.getName())
 *             .policyArn(policy.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IAM user policy attachments can be imported using the user name and policy arn separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:iam/userPolicyAttachment:UserPolicyAttachment test-attach test-user/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy
 * ```
 * 
 */
@ResourceType(type="aws:iam/userPolicyAttachment:UserPolicyAttachment")
public class UserPolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Export(name="policyArn", type=String.class, parameters={})
    private Output<String> policyArn;

    /**
     * @return The ARN of the policy you want to apply
     * 
     */
    public Output<String> policyArn() {
        return this.policyArn;
    }
    /**
     * The user the policy should be applied to
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return The user the policy should be applied to
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPolicyAttachment(String name) {
        this(name, UserPolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPolicyAttachment(String name, UserPolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPolicyAttachment(String name, UserPolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userPolicyAttachment:UserPolicyAttachment", name, args == null ? UserPolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPolicyAttachment(String name, Output<String> id, @Nullable UserPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/userPolicyAttachment:UserPolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static UserPolicyAttachment get(String name, Output<String> id, @Nullable UserPolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPolicyAttachment(name, id, state, options);
    }
}
