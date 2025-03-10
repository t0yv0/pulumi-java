// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.projects.DefaultServiceAccountsArgs;
import com.pulumi.gcp.projects.inputs.DefaultServiceAccountsState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Allows management of Google Cloud Platform project default service accounts.
 * 
 * When certain service APIs are enabled, Google Cloud Platform automatically creates service accounts to help get started, but
 * this is not recommended for production environments as per [Google&#39;s documentation](https://cloud.google.com/iam/docs/service-accounts#default).
 * See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.
 * 
 * &gt; **WARNING** Some Google Cloud products do not work if the default service accounts are deleted so it is better to `DEPRIVILEGE` as
 * Google **CAN NOT** recover service accounts that have been deleted for more than 30 days.
 * Also Google recommends using the `constraints/iam.automaticIamGrantsForDefaultServiceAccounts` [constraint](https://www.terraform.io/docs/providers/google/r/google_organization_policy.html)
 * to disable automatic IAM Grants to default service accounts.
 * 
 * &gt; This resource works on a best-effort basis, as no API formally describes the default service accounts
 * and it is for users who are unable to use constraints. If the default service accounts change their name
 * or additional service accounts are added, this resource will need to be updated.
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
 *         var myProject = new DefaultServiceAccounts(&#34;myProject&#34;, DefaultServiceAccountsArgs.builder()        
 *             .action(&#34;DELETE&#34;)
 *             .project(&#34;my-project-id&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * To enable the default service accounts on the resource destroy:
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
 *         var myProject = new DefaultServiceAccounts(&#34;myProject&#34;, DefaultServiceAccountsArgs.builder()        
 *             .action(&#34;DISABLE&#34;)
 *             .project(&#34;my-project-id&#34;)
 *             .restorePolicy(&#34;REVERT&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support import
 * 
 */
@ResourceType(type="gcp:projects/defaultServiceAccounts:DefaultServiceAccounts")
public class DefaultServiceAccounts extends com.pulumi.resources.CustomResource {
    /**
     * The action to be performed in the default service accounts. Valid values are: `DEPRIVILEGE`, `DELETE`, `DISABLE`. Note that `DEPRIVILEGE` action will ignore the REVERT configuration in the restore_policy
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The action to be performed in the default service accounts. Valid values are: `DEPRIVILEGE`, `DELETE`, `DISABLE`. Note that `DEPRIVILEGE` action will ignore the REVERT configuration in the restore_policy
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The project ID where service accounts are created.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project ID where service accounts are created.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The action to be performed in the default service accounts on the resource destroy.
     * Valid values are NONE, REVERT and REVERT_AND_IGNORE_FAILURE. It is applied for any action but in the DEPRIVILEGE.
     * If set to REVERT it attempts to restore all default SAs but the DEPRIVILEGE action.
     * If set to REVERT_AND_IGNORE_FAILURE it is the same behavior as REVERT but ignores errors returned by the API.
     * 
     */
    @Export(name="restorePolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> restorePolicy;

    /**
     * @return The action to be performed in the default service accounts on the resource destroy.
     * Valid values are NONE, REVERT and REVERT_AND_IGNORE_FAILURE. It is applied for any action but in the DEPRIVILEGE.
     * If set to REVERT it attempts to restore all default SAs but the DEPRIVILEGE action.
     * If set to REVERT_AND_IGNORE_FAILURE it is the same behavior as REVERT but ignores errors returned by the API.
     * 
     */
    public Output<Optional<String>> restorePolicy() {
        return Codegen.optional(this.restorePolicy);
    }
    /**
     * The Service Accounts changed by this resource. It is used for `REVERT` the `action` on the destroy.
     * 
     */
    @Export(name="serviceAccounts", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> serviceAccounts;

    /**
     * @return The Service Accounts changed by this resource. It is used for `REVERT` the `action` on the destroy.
     * 
     */
    public Output<Map<String,Object>> serviceAccounts() {
        return this.serviceAccounts;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultServiceAccounts(String name) {
        this(name, DefaultServiceAccountsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultServiceAccounts(String name, DefaultServiceAccountsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultServiceAccounts(String name, DefaultServiceAccountsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/defaultServiceAccounts:DefaultServiceAccounts", name, args == null ? DefaultServiceAccountsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultServiceAccounts(String name, Output<String> id, @Nullable DefaultServiceAccountsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:projects/defaultServiceAccounts:DefaultServiceAccounts", name, state, makeResourceOptions(options, id));
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
    public static DefaultServiceAccounts get(String name, Output<String> id, @Nullable DefaultServiceAccountsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultServiceAccounts(name, id, state, options);
    }
}
