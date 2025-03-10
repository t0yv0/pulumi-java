// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.peering;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.peering.ConnectionMonitorTestArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Connection Monitor Test class.
 * API Version: 2021-06-01.
 * 
 * ## Example Usage
 * ### Create or Update Connection Monitor Test
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
 *         var connectionMonitorTest = new ConnectionMonitorTest(&#34;connectionMonitorTest&#34;, ConnectionMonitorTestArgs.builder()        
 *             .connectionMonitorTestName(&#34;connectionMonitorTestName&#34;)
 *             .destination(&#34;Example Destination&#34;)
 *             .destinationPort(443)
 *             .peeringServiceName(&#34;peeringServiceName&#34;)
 *             .resourceGroupName(&#34;rgName&#34;)
 *             .sourceAgent(&#34;Example Source Agent&#34;)
 *             .testFrequencyInSec(30)
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
 * $ pulumi import azure-native:peering:ConnectionMonitorTest connectionMonitorTestName /subscriptions/subId/resourceGroups/rgName/providers/Microsoft.Peering/peeringServices/peeringServiceName/connectionMonitorTests/connectionMonitorTestName 
 * ```
 * 
 */
@ResourceType(type="azure-native:peering:ConnectionMonitorTest")
public class ConnectionMonitorTest extends com.pulumi.resources.CustomResource {
    /**
     * The Connection Monitor test destination
     * 
     */
    @Export(name="destination", type=String.class, parameters={})
    private Output</* @Nullable */ String> destination;

    /**
     * @return The Connection Monitor test destination
     * 
     */
    public Output<Optional<String>> destination() {
        return Codegen.optional(this.destination);
    }
    /**
     * The Connection Monitor test destination port
     * 
     */
    @Export(name="destinationPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> destinationPort;

    /**
     * @return The Connection Monitor test destination port
     * 
     */
    public Output<Optional<Integer>> destinationPort() {
        return Codegen.optional(this.destinationPort);
    }
    /**
     * The flag that indicates if the Connection Monitor test is successful or not.
     * 
     */
    @Export(name="isTestSuccessful", type=Boolean.class, parameters={})
    private Output<Boolean> isTestSuccessful;

    /**
     * @return The flag that indicates if the Connection Monitor test is successful or not.
     * 
     */
    public Output<Boolean> isTestSuccessful() {
        return this.isTestSuccessful;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The path representing the Connection Monitor test.
     * 
     */
    @Export(name="path", type=List.class, parameters={String.class})
    private Output<List<String>> path;

    /**
     * @return The path representing the Connection Monitor test.
     * 
     */
    public Output<List<String>> path() {
        return this.path;
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The Connection Monitor test source agent
     * 
     */
    @Export(name="sourceAgent", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceAgent;

    /**
     * @return The Connection Monitor test source agent
     * 
     */
    public Output<Optional<String>> sourceAgent() {
        return Codegen.optional(this.sourceAgent);
    }
    /**
     * The Connection Monitor test frequency in seconds
     * 
     */
    @Export(name="testFrequencyInSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> testFrequencyInSec;

    /**
     * @return The Connection Monitor test frequency in seconds
     * 
     */
    public Output<Optional<Integer>> testFrequencyInSec() {
        return Codegen.optional(this.testFrequencyInSec);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionMonitorTest(String name) {
        this(name, ConnectionMonitorTestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionMonitorTest(String name, ConnectionMonitorTestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionMonitorTest(String name, ConnectionMonitorTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:ConnectionMonitorTest", name, args == null ? ConnectionMonitorTestArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionMonitorTest(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:peering:ConnectionMonitorTest", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:peering/v20210601:ConnectionMonitorTest").build()),
                Output.of(Alias.builder().type("azure-native:peering/v20220101:ConnectionMonitorTest").build())
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
    public static ConnectionMonitorTest get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionMonitorTest(name, id, options);
    }
}
