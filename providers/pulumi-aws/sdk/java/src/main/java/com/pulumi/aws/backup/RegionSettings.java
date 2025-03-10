// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.backup.RegionSettingsArgs;
import com.pulumi.aws.backup.inputs.RegionSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup Region Settings resource.
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
 *         var test = new RegionSettings(&#34;test&#34;, RegionSettingsArgs.builder()        
 *             .resourceTypeManagementPreference(Map.ofEntries(
 *                 Map.entry(&#34;DynamoDB&#34;, true),
 *                 Map.entry(&#34;EFS&#34;, true)
 *             ))
 *             .resourceTypeOptInPreference(Map.ofEntries(
 *                 Map.entry(&#34;Aurora&#34;, true),
 *                 Map.entry(&#34;DocumentDB&#34;, true),
 *                 Map.entry(&#34;DynamoDB&#34;, true),
 *                 Map.entry(&#34;EBS&#34;, true),
 *                 Map.entry(&#34;EC2&#34;, true),
 *                 Map.entry(&#34;EFS&#34;, true),
 *                 Map.entry(&#34;FSx&#34;, true),
 *                 Map.entry(&#34;Neptune&#34;, true),
 *                 Map.entry(&#34;RDS&#34;, true),
 *                 Map.entry(&#34;Storage Gateway&#34;, true),
 *                 Map.entry(&#34;VirtualMachine&#34;, true)
 *             ))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Backup Region Settings can be imported using the `region`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:backup/regionSettings:RegionSettings test us-west-2
 * ```
 * 
 */
@ResourceType(type="aws:backup/regionSettings:RegionSettings")
public class RegionSettings extends com.pulumi.resources.CustomResource {
    /**
     * A map of services along with the management preferences for the Region.
     * 
     */
    @Export(name="resourceTypeManagementPreference", type=Map.class, parameters={String.class, Boolean.class})
    private Output<Map<String,Boolean>> resourceTypeManagementPreference;

    /**
     * @return A map of services along with the management preferences for the Region.
     * 
     */
    public Output<Map<String,Boolean>> resourceTypeManagementPreference() {
        return this.resourceTypeManagementPreference;
    }
    /**
     * A map of services along with the opt-in preferences for the Region.
     * 
     */
    @Export(name="resourceTypeOptInPreference", type=Map.class, parameters={String.class, Boolean.class})
    private Output<Map<String,Boolean>> resourceTypeOptInPreference;

    /**
     * @return A map of services along with the opt-in preferences for the Region.
     * 
     */
    public Output<Map<String,Boolean>> resourceTypeOptInPreference() {
        return this.resourceTypeOptInPreference;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionSettings(String name) {
        this(name, RegionSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionSettings(String name, RegionSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionSettings(String name, RegionSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/regionSettings:RegionSettings", name, args == null ? RegionSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionSettings(String name, Output<String> id, @Nullable RegionSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/regionSettings:RegionSettings", name, state, makeResourceOptions(options, id));
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
    public static RegionSettings get(String name, Output<String> id, @Nullable RegionSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionSettings(name, id, state, options);
    }
}
