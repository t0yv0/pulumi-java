// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.bot.ChannelLineArgs;
import com.pulumi.azure.bot.inputs.ChannelLineState;
import com.pulumi.azure.bot.outputs.ChannelLineLineChannel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Line integration for a Bot Channel
 * 
 * &gt; **Note** A bot can only have a single Line Channel associated with it.
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleChannelsRegistration = new ChannelsRegistration(&#34;exampleChannelsRegistration&#34;, ChannelsRegistrationArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;F0&#34;)
 *             .microsoftAppId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getClientId()))
 *             .build());
 * 
 *         var exampleChannelLine = new ChannelLine(&#34;exampleChannelLine&#34;, ChannelLineArgs.builder()        
 *             .botName(exampleChannelsRegistration.getName())
 *             .location(exampleChannelsRegistration.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .lineChannels(ChannelLineLineChannel.builder()
 *                 .accessToken(&#34;asdfdsdfTYUIOIoj1231hkjhk&#34;)
 *                 .secret(&#34;aagfdgfd123567&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * The Line Integration for a Bot Channel can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:bot/channelLine:ChannelLine example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.BotService/botServices/botService1/channels/LineChannel
 * ```
 * 
 */
@ResourceType(type="azure:bot/channelLine:ChannelLine")
public class ChannelLine extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="botName", type=String.class, parameters={})
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }
    /**
     * One or more `line_channel` blocks as defined below.
     * 
     */
    @Export(name="lineChannels", type=List.class, parameters={ChannelLineLineChannel.class})
    private Output<List<ChannelLineLineChannel>> lineChannels;

    /**
     * @return One or more `line_channel` blocks as defined below.
     * 
     */
    public Output<List<ChannelLineLineChannel>> lineChannels() {
        return this.lineChannels;
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource group where the Line Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Line Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ChannelLine(String name) {
        this(name, ChannelLineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ChannelLine(String name, ChannelLineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ChannelLine(String name, ChannelLineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/channelLine:ChannelLine", name, args == null ? ChannelLineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ChannelLine(String name, Output<String> id, @Nullable ChannelLineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/channelLine:ChannelLine", name, state, makeResourceOptions(options, id));
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
    public static ChannelLine get(String name, Output<String> id, @Nullable ChannelLineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ChannelLine(name, id, state, options);
    }
}
