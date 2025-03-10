// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.databoxedge.TriggerArgs;
import com.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Trigger details.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### TriggerPut
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
 *         var trigger = new Trigger(&#34;trigger&#34;, TriggerArgs.builder()        
 *             .deviceName(&#34;testedgedevice&#34;)
 *             .kind(&#34;FileEvent&#34;)
 *             .name(&#34;trigger1&#34;)
 *             .resourceGroupName(&#34;GroupForEdgeAutomation&#34;)
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
 * $ pulumi import azure-native:databoxedge:Trigger trigger1 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/testedgedevice/triggers/trigger1 
 * ```
 * 
 * @deprecated
 * Please use one of the variants: FileEventTrigger, PeriodicTimerEventTrigger.
 * 
 */
@Deprecated /* Please use one of the variants: FileEventTrigger, PeriodicTimerEventTrigger. */
@ResourceType(type="azure-native:databoxedge:Trigger")
public class Trigger extends com.pulumi.resources.CustomResource {
    /**
     * Trigger Kind.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Trigger Kind.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Trigger in DataBoxEdge Resource
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Trigger in DataBoxEdge Resource
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trigger(String name) {
        this(name, TriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trigger(String name, TriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trigger(String name, TriggerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Trigger", name, args == null ? TriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trigger(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:Trigger", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190301:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190701:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20190801:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200501preview:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20200901preview:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20201201:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210201preview:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20210601preview:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220301:Trigger").build()),
                Output.of(Alias.builder().type("azure-native:databoxedge/v20220401preview:Trigger").build())
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
    public static Trigger get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Trigger(name, id, options);
    }
}
