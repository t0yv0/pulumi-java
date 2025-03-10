// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.UsagePlanKeyArgs;
import com.pulumi.aws.apigateway.inputs.UsagePlanKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway Usage Plan Key.
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
 *         var test = new RestApi(&#34;test&#34;);
 * 
 *         var myusageplan = new UsagePlan(&#34;myusageplan&#34;, UsagePlanArgs.builder()        
 *             .apiStages(UsagePlanApiStage.builder()
 *                 .apiId(test.getId())
 *                 .stage(aws_api_gateway_deployment.getFoo().getStage_name())
 *                 .build())
 *             .build());
 * 
 *         var mykey = new ApiKey(&#34;mykey&#34;);
 * 
 *         var main = new UsagePlanKey(&#34;main&#34;, UsagePlanKeyArgs.builder()        
 *             .keyId(mykey.getId())
 *             .keyType(&#34;API_KEY&#34;)
 *             .usagePlanId(myusageplan.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AWS API Gateway Usage Plan Key can be imported using the `USAGE-PLAN-ID/USAGE-PLAN-KEY-ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/usagePlanKey:UsagePlanKey key 12345abcde/zzz
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/usagePlanKey:UsagePlanKey")
public class UsagePlanKey extends com.pulumi.resources.CustomResource {
    /**
     * The identifier of the API key resource.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return The identifier of the API key resource.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * The type of the API key resource. Currently, the valid key type is API_KEY.
     * 
     */
    @Export(name="keyType", type=String.class, parameters={})
    private Output<String> keyType;

    /**
     * @return The type of the API key resource. Currently, the valid key type is API_KEY.
     * 
     */
    public Output<String> keyType() {
        return this.keyType;
    }
    /**
     * The name of a usage plan key.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of a usage plan key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Id of the usage plan resource representing to associate the key to.
     * 
     */
    @Export(name="usagePlanId", type=String.class, parameters={})
    private Output<String> usagePlanId;

    /**
     * @return The Id of the usage plan resource representing to associate the key to.
     * 
     */
    public Output<String> usagePlanId() {
        return this.usagePlanId;
    }
    /**
     * The value of a usage plan key.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The value of a usage plan key.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UsagePlanKey(String name) {
        this(name, UsagePlanKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UsagePlanKey(String name, UsagePlanKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UsagePlanKey(String name, UsagePlanKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/usagePlanKey:UsagePlanKey", name, args == null ? UsagePlanKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UsagePlanKey(String name, Output<String> id, @Nullable UsagePlanKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/usagePlanKey:UsagePlanKey", name, state, makeResourceOptions(options, id));
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
    public static UsagePlanKey get(String name, Output<String> id, @Nullable UsagePlanKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UsagePlanKey(name, id, state, options);
    }
}
