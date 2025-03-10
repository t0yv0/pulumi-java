// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.cdn.OriginGroupArgs;
import com.pulumi.azurenative.cdn.outputs.HealthProbeParametersResponse;
import com.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import com.pulumi.azurenative.cdn.outputs.ResponseBasedOriginErrorDetectionParametersResponse;
import com.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Origin group comprising of origins is used for load balancing to origins when the content cannot be served from CDN.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * ### OriginGroups_Create
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
 *         var originGroup = new OriginGroup(&#34;originGroup&#34;, OriginGroupArgs.builder()        
 *             .endpointName(&#34;endpoint1&#34;)
 *             .healthProbeSettings(Map.ofEntries(
 *                 Map.entry(&#34;probeIntervalInSeconds&#34;, 120),
 *                 Map.entry(&#34;probePath&#34;, &#34;/health.aspx&#34;),
 *                 Map.entry(&#34;probeProtocol&#34;, &#34;Http&#34;),
 *                 Map.entry(&#34;probeRequestType&#34;, &#34;GET&#34;)
 *             ))
 *             .originGroupName(&#34;origingroup1&#34;)
 *             .origins(Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/origins/origin1&#34;))
 *             .profileName(&#34;profile1&#34;)
 *             .resourceGroupName(&#34;RG&#34;)
 *             .responseBasedOriginErrorDetectionSettings(Map.ofEntries(
 *                 Map.entry(&#34;responseBasedDetectedErrorTypes&#34;, &#34;TcpErrorsOnly&#34;),
 *                 Map.entry(&#34;responseBasedFailoverThresholdPercentage&#34;, 10)
 *             ))
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
 * $ pulumi import azure-native:cdn:OriginGroup originGroup1 /subscriptions/subid/resourcegroups/RG/providers/Microsoft.Cdn/profiles/profile1/endpoints/endpoint1/originGroups/originGroup1 
 * ```
 * 
 */
@ResourceType(type="azure-native:cdn:OriginGroup")
public class OriginGroup extends com.pulumi.resources.CustomResource {
    /**
     * Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    @Export(name="healthProbeSettings", type=HealthProbeParametersResponse.class, parameters={})
    private Output</* @Nullable */ HealthProbeParametersResponse> healthProbeSettings;

    /**
     * @return Health probe settings to the origin that is used to determine the health of the origin.
     * 
     */
    public Output<Optional<HealthProbeParametersResponse>> healthProbeSettings() {
        return Codegen.optional(this.healthProbeSettings);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The source of the content being delivered via CDN within given origin group.
     * 
     */
    @Export(name="origins", type=List.class, parameters={ResourceReferenceResponse.class})
    private Output<List<ResourceReferenceResponse>> origins;

    /**
     * @return The source of the content being delivered via CDN within given origin group.
     * 
     */
    public Output<List<ResourceReferenceResponse>> origins() {
        return this.origins;
    }
    /**
     * Provisioning status of the origin group.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning status of the origin group.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the origin group.
     * 
     */
    @Export(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status of the origin group.
     * 
     */
    public Output<String> resourceState() {
        return this.resourceState;
    }
    /**
     * The JSON object that contains the properties to determine origin health using real requests/responses. This property is currently not supported.
     * 
     */
    @Export(name="responseBasedOriginErrorDetectionSettings", type=ResponseBasedOriginErrorDetectionParametersResponse.class, parameters={})
    private Output</* @Nullable */ ResponseBasedOriginErrorDetectionParametersResponse> responseBasedOriginErrorDetectionSettings;

    /**
     * @return The JSON object that contains the properties to determine origin health using real requests/responses. This property is currently not supported.
     * 
     */
    public Output<Optional<ResponseBasedOriginErrorDetectionParametersResponse>> responseBasedOriginErrorDetectionSettings() {
        return Codegen.optional(this.responseBasedOriginErrorDetectionSettings);
    }
    /**
     * Read only system data
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    @Export(name="trafficRestorationTimeToHealedOrNewEndpointsInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> trafficRestorationTimeToHealedOrNewEndpointsInMinutes;

    /**
     * @return Time in minutes to shift the traffic to the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins. This property is currently not supported.
     * 
     */
    public Output<Optional<Integer>> trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return Codegen.optional(this.trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OriginGroup(String name) {
        this(name, OriginGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OriginGroup(String name, OriginGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OriginGroup(String name, OriginGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:OriginGroup", name, args == null ? OriginGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OriginGroup(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cdn:OriginGroup", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:cdn/v20191231:OriginGroup").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20200331:OriginGroup").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20200415:OriginGroup").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20200901:OriginGroup").build()),
                Output.of(Alias.builder().type("azure-native:cdn/v20210601:OriginGroup").build())
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
    public static OriginGroup get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OriginGroup(name, id, options);
    }
}
