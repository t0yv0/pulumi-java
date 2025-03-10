// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.aadiam.DiagnosticSettingArgs;
import com.pulumi.azurenative.aadiam.outputs.LogSettingsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The diagnostic setting resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * ### BatchAccountDelete
 * 
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
 *         var diagnosticSetting = new DiagnosticSetting(&#34;diagnosticSetting&#34;, DiagnosticSettingArgs.builder()        
 *             .eventHubAuthorizationRuleId(&#34;/subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourceGroups/montest/providers/microsoft.eventhub/namespaces/mynamespace/eventhubs/myeventhub/authorizationrules/myrule&#34;)
 *             .eventHubName(&#34;myeventhub&#34;)
 *             .logs(Map.ofEntries(
 *                 Map.entry(&#34;category&#34;, &#34;AuditLogs&#34;),
 *                 Map.entry(&#34;enabled&#34;, true),
 *                 Map.entry(&#34;retentionPolicy&#34;, Map.ofEntries(
 *                     Map.entry(&#34;days&#34;, 0),
 *                     Map.entry(&#34;enabled&#34;, false)
 *                 ))
 *             ))
 *             .name(&#34;mysetting&#34;)
 *             .storageAccountId(&#34;/subscriptions/df602c9c-7aa0-407d-a6fb-eb20c8bd1192/resourceGroups/apptest/providers/Microsoft.Storage/storageAccounts/appteststorage1&#34;)
 *             .workspaceId(&#34;&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:aadiam:DiagnosticSetting mysetting providers/microsoft.aadiam/diagnosticSettings/mysetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:aadiam:DiagnosticSetting")
public class DiagnosticSetting extends com.pulumi.resources.CustomResource {
    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Export(name="eventHubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubAuthorizationRuleId;

    /**
     * @return The resource Id for the event hub authorization rule.
     * 
     */
    public Output<Optional<String>> eventHubAuthorizationRuleId() {
        return Codegen.optional(this.eventHubAuthorizationRuleId);
    }
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Export(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    /**
     * @return The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Output<Optional<String>> eventHubName() {
        return Codegen.optional(this.eventHubName);
    }
    /**
     * The list of logs settings.
     * 
     */
    @Export(name="logs", type=List.class, parameters={LogSettingsResponse.class})
    private Output</* @Nullable */ List<LogSettingsResponse>> logs;

    /**
     * @return The list of logs settings.
     * 
     */
    public Output<Optional<List<LogSettingsResponse>>> logs() {
        return Codegen.optional(this.logs);
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Export(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    /**
     * @return The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Output<Optional<String>> serviceBusRuleId() {
        return Codegen.optional(this.serviceBusRuleId);
    }
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Output<Optional<String>> storageAccountId() {
        return Codegen.optional(this.storageAccountId);
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspaceId;

    /**
     * @return The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Output<Optional<String>> workspaceId() {
        return Codegen.optional(this.workspaceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiagnosticSetting(String name) {
        this(name, DiagnosticSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiagnosticSetting(String name, @Nullable DiagnosticSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiagnosticSetting(String name, @Nullable DiagnosticSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:DiagnosticSetting", name, args == null ? DiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiagnosticSetting(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:aadiam:DiagnosticSetting", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:aadiam/v20170401:DiagnosticSetting").build()),
                Output.of(Alias.builder().type("azure-native:aadiam/v20170401preview:DiagnosticSetting").build())
            ))
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
    public static DiagnosticSetting get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiagnosticSetting(name, id, options);
    }
}
