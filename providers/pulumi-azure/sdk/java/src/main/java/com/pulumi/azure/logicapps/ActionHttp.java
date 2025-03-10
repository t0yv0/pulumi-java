// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.logicapps.ActionHttpArgs;
import com.pulumi.azure.logicapps.inputs.ActionHttpState;
import com.pulumi.azure.logicapps.outputs.ActionHttpRunAfter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an HTTP Action within a Logic App Workflow
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleWorkflow = new Workflow(&#34;exampleWorkflow&#34;, WorkflowArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleActionHttp = new ActionHttp(&#34;exampleActionHttp&#34;, ActionHttpArgs.builder()        
 *             .logicAppId(exampleWorkflow.getId())
 *             .method(&#34;GET&#34;)
 *             .uri(&#34;http://example.com/some-webhook&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Logic App HTTP Actions can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:logicapps/actionHttp:ActionHttp webhook1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Logic/workflows/workflow1/actions/webhook1
 * ```
 * 
 */
@ResourceType(type="azure:logicapps/actionHttp:ActionHttp")
public class ActionHttp extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output</* @Nullable */ String> body;

    /**
     * @return Specifies the HTTP Body that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    public Output<Optional<String>> body() {
        return Codegen.optional(this.body);
    }
    /**
     * Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    @Export(name="headers", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> headers;

    /**
     * @return Specifies a Map of Key-Value Pairs that should be sent to the `uri` when this HTTP Action is triggered.
     * 
     */
    public Output<Optional<Map<String,String>>> headers() {
        return Codegen.optional(this.headers);
    }
    /**
     * Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="logicAppId", type=String.class, parameters={})
    private Output<String> logicAppId;

    /**
     * @return Specifies the ID of the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> logicAppId() {
        return this.logicAppId;
    }
    /**
     * Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
     * 
     */
    @Export(name="method", type=String.class, parameters={})
    private Output<String> method;

    /**
     * @return Specifies the HTTP Method which should be used for this HTTP Action. Possible values include `DELETE`, `GET`, `PATCH`, `POST` and `PUT`.
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the HTTP Action to be created within the Logic App Workflow. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
     * 
     */
    @Export(name="runAfters", type=List.class, parameters={ActionHttpRunAfter.class})
    private Output</* @Nullable */ List<ActionHttpRunAfter>> runAfters;

    /**
     * @return Specifies the place of the HTTP Action in the Logic App Workflow. If not specified, the HTTP Action is right after the Trigger. A `run_after` block is as defined below.
     * 
     */
    public Output<Optional<List<ActionHttpRunAfter>>> runAfters() {
        return Codegen.optional(this.runAfters);
    }
    /**
     * Specifies the URI which will be called when this HTTP Action is triggered.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return Specifies the URI which will be called when this HTTP Action is triggered.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ActionHttp(String name) {
        this(name, ActionHttpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ActionHttp(String name, ActionHttpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ActionHttp(String name, ActionHttpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:logicapps/actionHttp:ActionHttp", name, args == null ? ActionHttpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ActionHttp(String name, Output<String> id, @Nullable ActionHttpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:logicapps/actionHttp:ActionHttp", name, state, makeResourceOptions(options, id));
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
    public static ActionHttp get(String name, Output<String> id, @Nullable ActionHttpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ActionHttp(name, id, state, options);
    }
}
