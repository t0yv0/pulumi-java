// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.automation.WebhookArgs;
import com.pulumi.azure.automation.inputs.WebhookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Automation Runbook&#39;s Webhook.
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .skuName(&#34;Basic&#34;)
 *             .build());
 * 
 *         var exampleRunBook = new RunBook(&#34;exampleRunBook&#34;, RunBookArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .automationAccountName(exampleAccount.getName())
 *             .logVerbose(&#34;true&#34;)
 *             .logProgress(&#34;true&#34;)
 *             .description(&#34;This is an example runbook&#34;)
 *             .runbookType(&#34;PowerShellWorkflow&#34;)
 *             .publishContentLink(RunBookPublishContentLink.builder()
 *                 .uri(&#34;https://raw.githubusercontent.com/Azure/azure-quickstart-templates/c4935ffb69246a6058eb24f54640f53f69d3ac9f/101-automation-runbook-getvms/Runbooks/Get-AzureVMTutorial.ps1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleWebhook = new Webhook(&#34;exampleWebhook&#34;, WebhookArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .automationAccountName(exampleAccount.getName())
 *             .expiryTime(&#34;2021-12-31T00:00:00Z&#34;)
 *             .enabled(true)
 *             .runbookName(exampleRunBook.getName())
 *             .parameters(Map.of(&#34;input&#34;, &#34;parameter&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Automation Webhooks can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:automation/webhook:Webhook TestRunbook_webhook /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.Automation/automationAccounts/account1/webhooks/TestRunbook_webhook
 * ```
 * 
 */
@ResourceType(type="azure:automation/webhook:Webhook")
public class Webhook extends com.pulumi.resources.CustomResource {
    /**
     * The name of the automation account in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="automationAccountName", type=String.class, parameters={})
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }
    /**
     * Controls if Webhook is enabled. Defaults to `true`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Controls if Webhook is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Timestamp when the webhook expires. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="expiryTime", type=String.class, parameters={})
    private Output<String> expiryTime;

    /**
     * @return Timestamp when the webhook expires. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> expiryTime() {
        return this.expiryTime;
    }
    /**
     * Specifies the name of the Webhook. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Webhook. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Map of input parameters passed to runbook.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return Map of input parameters passed to runbook.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The name of the resource group in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Webhook is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Name of the hybrid worker group the Webhook job will run on.
     * 
     */
    @Export(name="runOnWorkerGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> runOnWorkerGroup;

    /**
     * @return Name of the hybrid worker group the Webhook job will run on.
     * 
     */
    public Output<Optional<String>> runOnWorkerGroup() {
        return Codegen.optional(this.runOnWorkerGroup);
    }
    /**
     * Name of the Automation Runbook to execute by Webhook.
     * 
     */
    @Export(name="runbookName", type=String.class, parameters={})
    private Output<String> runbookName;

    /**
     * @return Name of the Automation Runbook to execute by Webhook.
     * 
     */
    public Output<String> runbookName() {
        return this.runbookName;
    }
    /**
     * URI to initiate the webhook. Can be generated using [Generate URI API](https://docs.microsoft.com/en-us/rest/api/automation/webhook/generate-uri). By default, new URI is generated on each new resource creation.
     * 
     */
    @Export(name="uri", type=String.class, parameters={})
    private Output<String> uri;

    /**
     * @return URI to initiate the webhook. Can be generated using [Generate URI API](https://docs.microsoft.com/en-us/rest/api/automation/webhook/generate-uri). By default, new URI is generated on each new resource creation.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhook(String name) {
        this(name, WebhookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhook(String name, WebhookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhook(String name, WebhookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/webhook:Webhook", name, args == null ? WebhookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Webhook(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:automation/webhook:Webhook", name, state, makeResourceOptions(options, id));
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
    public static Webhook get(String name, Output<String> id, @Nullable WebhookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Webhook(name, id, state, options);
    }
}
