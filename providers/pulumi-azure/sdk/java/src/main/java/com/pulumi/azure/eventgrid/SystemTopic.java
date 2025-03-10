// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventgrid.SystemTopicArgs;
import com.pulumi.azure.eventgrid.inputs.SystemTopicState;
import com.pulumi.azure.eventgrid.outputs.SystemTopicIdentity;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Event Grid System Topic.
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
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .tags(Map.of(&#34;environment&#34;, &#34;staging&#34;))
 *             .build());
 * 
 *         var exampleSystemTopic = new SystemTopic(&#34;exampleSystemTopic&#34;, SystemTopicArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sourceArmResourceId(exampleAccount.getId())
 *             .topicType(&#34;Microsoft.Storage.StorageAccounts&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Event Grid System Topic can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventgrid/systemTopic:SystemTopic example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventGrid/systemTopics/systemTopic1
 * ```
 * 
 */
@ResourceType(type="azure:eventgrid/systemTopic:SystemTopic")
public class SystemTopic extends com.pulumi.resources.CustomResource {
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=SystemTopicIdentity.class, parameters={})
    private Output</* @Nullable */ SystemTopicIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<SystemTopicIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * The Azure Region where the Event Grid System Topic should exist. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Event Grid System Topic should exist. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The Metric ARM Resource ID of the Event Grid System Topic.
     * 
     */
    @Export(name="metricArmResourceId", type=String.class, parameters={})
    private Output<String> metricArmResourceId;

    /**
     * @return The Metric ARM Resource ID of the Event Grid System Topic.
     * 
     */
    public Output<String> metricArmResourceId() {
        return this.metricArmResourceId;
    }
    /**
     * The name which should be used for this Event Grid System Topic. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Event Grid System Topic. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Event Grid System Topic should exist. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Event Grid System Topic should exist. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The ID of the Event Grid System Topic ARM Source. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    @Export(name="sourceArmResourceId", type=String.class, parameters={})
    private Output<String> sourceArmResourceId;

    /**
     * @return The ID of the Event Grid System Topic ARM Source. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    public Output<String> sourceArmResourceId() {
        return this.sourceArmResourceId;
    }
    /**
     * A mapping of tags which should be assigned to the Event Grid System Topic.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Event Grid System Topic.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Topic Type of the Event Grid System Topic. The topic type is validated by Azure and there may be additional topic types beyond the following: `Microsoft.AppConfiguration.ConfigurationStores`, `Microsoft.Communication.CommunicationServices`, `Microsoft.ContainerRegistry.Registries`, `Microsoft.Devices.IoTHubs`, `Microsoft.EventGrid.Domains`, `Microsoft.EventGrid.Topics`, `Microsoft.Eventhub.Namespaces`, `Microsoft.KeyVault.vaults`, `Microsoft.MachineLearningServices.Workspaces`, `Microsoft.Maps.Accounts`, `Microsoft.Media.MediaServices`, `Microsoft.Resources.ResourceGroups`, `Microsoft.Resources.Subscriptions`, `Microsoft.ServiceBus.Namespaces`, `Microsoft.SignalRService.SignalR`, `Microsoft.Storage.StorageAccounts`, `Microsoft.Web.ServerFarms` and `Microsoft.Web.Sites`. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    @Export(name="topicType", type=String.class, parameters={})
    private Output<String> topicType;

    /**
     * @return The Topic Type of the Event Grid System Topic. The topic type is validated by Azure and there may be additional topic types beyond the following: `Microsoft.AppConfiguration.ConfigurationStores`, `Microsoft.Communication.CommunicationServices`, `Microsoft.ContainerRegistry.Registries`, `Microsoft.Devices.IoTHubs`, `Microsoft.EventGrid.Domains`, `Microsoft.EventGrid.Topics`, `Microsoft.Eventhub.Namespaces`, `Microsoft.KeyVault.vaults`, `Microsoft.MachineLearningServices.Workspaces`, `Microsoft.Maps.Accounts`, `Microsoft.Media.MediaServices`, `Microsoft.Resources.ResourceGroups`, `Microsoft.Resources.Subscriptions`, `Microsoft.ServiceBus.Namespaces`, `Microsoft.SignalRService.SignalR`, `Microsoft.Storage.StorageAccounts`, `Microsoft.Web.ServerFarms` and `Microsoft.Web.Sites`. Changing this forces a new Event Grid System Topic to be created.
     * 
     */
    public Output<String> topicType() {
        return this.topicType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SystemTopic(String name) {
        this(name, SystemTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SystemTopic(String name, SystemTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SystemTopic(String name, SystemTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventgrid/systemTopic:SystemTopic", name, args == null ? SystemTopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SystemTopic(String name, Output<String> id, @Nullable SystemTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventgrid/systemTopic:SystemTopic", name, state, makeResourceOptions(options, id));
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
    public static SystemTopic get(String name, Output<String> id, @Nullable SystemTopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SystemTopic(name, id, state, options);
    }
}
