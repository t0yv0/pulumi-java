// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.monitoring.CustomServiceArgs;
import com.pulumi.gcp.monitoring.inputs.CustomServiceState;
import com.pulumi.gcp.monitoring.outputs.CustomServiceTelemetry;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Service is a discrete, autonomous, and network-accessible unit,
 * designed to solve an individual concern (Wikipedia). In Cloud Monitoring,
 * a Service acts as the root resource under which operational aspects of
 * the service are accessible
 * 
 * To get more information about Service, see:
 * 
 * * [API documentation](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/services)
 * * How-to Guides
 *     * [Service Monitoring](https://cloud.google.com/monitoring/service-monitoring)
 *     * [Monitoring API Documentation](https://cloud.google.com/monitoring/api/v3/)
 * 
 * ## Example Usage
 * ### Monitoring Service Custom
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
 *         var custom = new CustomService(&#34;custom&#34;, CustomServiceArgs.builder()        
 *             .displayName(&#34;My Custom Service custom-srv&#34;)
 *             .serviceId(&#34;custom-srv&#34;)
 *             .telemetry(CustomServiceTelemetry.builder()
 *                 .resourceName(&#34;//product.googleapis.com/foo/foo/services/test&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:monitoring/customService:CustomService default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:monitoring/customService:CustomService")
public class CustomService extends com.pulumi.resources.CustomResource {
    /**
     * Name used for UI elements listing this Service.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Name used for UI elements listing this Service.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The full resource name for this service. The syntax is: projects/[PROJECT_ID]/services/[SERVICE_ID].
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The full resource name for this service. The syntax is: projects/[PROJECT_ID]/services/[SERVICE_ID].
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * An optional service ID to use. If not given, the server will generate a
     * service ID.
     * 
     */
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return An optional service ID to use. If not given, the server will generate a
     * service ID.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     * 
     */
    @Export(name="telemetry", type=CustomServiceTelemetry.class, parameters={})
    private Output</* @Nullable */ CustomServiceTelemetry> telemetry;

    /**
     * @return Configuration for how to query telemetry on a Service.
     * Structure is documented below.
     * 
     */
    public Output<Optional<CustomServiceTelemetry>> telemetry() {
        return Codegen.optional(this.telemetry);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomService(String name) {
        this(name, CustomServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomService(String name, @Nullable CustomServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomService(String name, @Nullable CustomServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/customService:CustomService", name, args == null ? CustomServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomService(String name, Output<String> id, @Nullable CustomServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:monitoring/customService:CustomService", name, state, makeResourceOptions(options, id));
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
    public static CustomService get(String name, Output<String> id, @Nullable CustomServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomService(name, id, state, options);
    }
}
