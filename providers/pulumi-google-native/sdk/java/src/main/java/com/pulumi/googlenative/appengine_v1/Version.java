// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.appengine_v1.VersionArgs;
import com.pulumi.googlenative.appengine_v1.outputs.ApiConfigHandlerResponse;
import com.pulumi.googlenative.appengine_v1.outputs.AutomaticScalingResponse;
import com.pulumi.googlenative.appengine_v1.outputs.BasicScalingResponse;
import com.pulumi.googlenative.appengine_v1.outputs.DeploymentResponse;
import com.pulumi.googlenative.appengine_v1.outputs.EndpointsApiServiceResponse;
import com.pulumi.googlenative.appengine_v1.outputs.EntrypointResponse;
import com.pulumi.googlenative.appengine_v1.outputs.ErrorHandlerResponse;
import com.pulumi.googlenative.appengine_v1.outputs.HealthCheckResponse;
import com.pulumi.googlenative.appengine_v1.outputs.LibraryResponse;
import com.pulumi.googlenative.appengine_v1.outputs.LivenessCheckResponse;
import com.pulumi.googlenative.appengine_v1.outputs.ManualScalingResponse;
import com.pulumi.googlenative.appengine_v1.outputs.NetworkResponse;
import com.pulumi.googlenative.appengine_v1.outputs.ReadinessCheckResponse;
import com.pulumi.googlenative.appengine_v1.outputs.ResourcesResponse;
import com.pulumi.googlenative.appengine_v1.outputs.UrlMapResponse;
import com.pulumi.googlenative.appengine_v1.outputs.VpcAccessConnectorResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Deploys code and resource files to a new version.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:appengine/v1:Version")
public class Version extends com.pulumi.resources.CustomResource {
    /**
     * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="apiConfig", type=ApiConfigHandlerResponse.class, parameters={})
    private Output<ApiConfigHandlerResponse> apiConfig;

    /**
     * @return Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<ApiConfigHandlerResponse> apiConfig() {
        return this.apiConfig;
    }
    /**
     * app_engine_apis allows second generation runtimes to access the App Engine APIs.
     * 
     */
    @Export(name="appEngineApis", type=Boolean.class, parameters={})
    private Output<Boolean> appEngineApis;

    /**
     * @return app_engine_apis allows second generation runtimes to access the App Engine APIs.
     * 
     */
    public Output<Boolean> appEngineApis() {
        return this.appEngineApis;
    }
    /**
     * Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
     * 
     */
    @Export(name="automaticScaling", type=AutomaticScalingResponse.class, parameters={})
    private Output<AutomaticScalingResponse> automaticScaling;

    /**
     * @return Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
     * 
     */
    public Output<AutomaticScalingResponse> automaticScaling() {
        return this.automaticScaling;
    }
    /**
     * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * 
     */
    @Export(name="basicScaling", type=BasicScalingResponse.class, parameters={})
    private Output<BasicScalingResponse> basicScaling;

    /**
     * @return A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
     * 
     */
    public Output<BasicScalingResponse> basicScaling() {
        return this.basicScaling;
    }
    /**
     * Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    @Export(name="betaSettings", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> betaSettings;

    /**
     * @return Metadata settings that are supplied to this version to enable beta runtime features.
     * 
     */
    public Output<Map<String,String>> betaSettings() {
        return this.betaSettings;
    }
    /**
     * Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="buildEnvVariables", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> buildEnvVariables;

    /**
     * @return Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<Map<String,String>> buildEnvVariables() {
        return this.buildEnvVariables;
    }
    /**
     * Time that this version was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time that this version was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Email address of the user who created this version.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return Email address of the user who created this version.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="defaultExpiration", type=String.class, parameters={})
    private Output<String> defaultExpiration;

    /**
     * @return Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<String> defaultExpiration() {
        return this.defaultExpiration;
    }
    /**
     * Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="deployment", type=DeploymentResponse.class, parameters={})
    private Output<DeploymentResponse> deployment;

    /**
     * @return Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<DeploymentResponse> deployment() {
        return this.deployment;
    }
    /**
     * Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.
     * 
     */
    @Export(name="diskUsageBytes", type=String.class, parameters={})
    private Output<String> diskUsageBytes;

    /**
     * @return Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.
     * 
     */
    public Output<String> diskUsageBytes() {
        return this.diskUsageBytes;
    }
    /**
     * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
     * 
     */
    @Export(name="endpointsApiService", type=EndpointsApiServiceResponse.class, parameters={})
    private Output<EndpointsApiServiceResponse> endpointsApiService;

    /**
     * @return Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
     * 
     */
    public Output<EndpointsApiServiceResponse> endpointsApiService() {
        return this.endpointsApiService;
    }
    /**
     * The entrypoint for the application.
     * 
     */
    @Export(name="entrypoint", type=EntrypointResponse.class, parameters={})
    private Output<EntrypointResponse> entrypoint;

    /**
     * @return The entrypoint for the application.
     * 
     */
    public Output<EntrypointResponse> entrypoint() {
        return this.entrypoint;
    }
    /**
     * App Engine execution environment for this version.Defaults to standard.
     * 
     */
    @Export(name="env", type=String.class, parameters={})
    private Output<String> env;

    /**
     * @return App Engine execution environment for this version.Defaults to standard.
     * 
     */
    public Output<String> env() {
        return this.env;
    }
    /**
     * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="envVariables", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> envVariables;

    /**
     * @return Environment variables available to the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<Map<String,String>> envVariables() {
        return this.envVariables;
    }
    /**
     * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="errorHandlers", type=List.class, parameters={ErrorHandlerResponse.class})
    private Output<List<ErrorHandlerResponse>> errorHandlers;

    /**
     * @return Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<List<ErrorHandlerResponse>> errorHandlers() {
        return this.errorHandlers;
    }
    /**
     * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="handlers", type=List.class, parameters={UrlMapResponse.class})
    private Output<List<UrlMapResponse>> handlers;

    /**
     * @return An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<List<UrlMapResponse>> handlers() {
        return this.handlers;
    }
    /**
     * Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="healthCheck", type=HealthCheckResponse.class, parameters={})
    private Output<HealthCheckResponse> healthCheck;

    /**
     * @return Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<HealthCheckResponse> healthCheck() {
        return this.healthCheck;
    }
    /**
     * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
     * 
     */
    @Export(name="inboundServices", type=List.class, parameters={String.class})
    private Output<List<String>> inboundServices;

    /**
     * @return Before an application can receive email or XMPP messages, the application must be configured to enable the service.
     * 
     */
    public Output<List<String>> inboundServices() {
        return this.inboundServices;
    }
    /**
     * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
     * 
     */
    @Export(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
     * 
     */
    public Output<String> instanceClass() {
        return this.instanceClass;
    }
    /**
     * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="libraries", type=List.class, parameters={LibraryResponse.class})
    private Output<List<LibraryResponse>> libraries;

    /**
     * @return Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<List<LibraryResponse>> libraries() {
        return this.libraries;
    }
    /**
     * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="livenessCheck", type=LivenessCheckResponse.class, parameters={})
    private Output<LivenessCheckResponse> livenessCheck;

    /**
     * @return Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
     * 
     */
    public Output<LivenessCheckResponse> livenessCheck() {
        return this.livenessCheck;
    }
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as &#34;backends&#34;.
     * 
     */
    @Export(name="manualScaling", type=ManualScalingResponse.class, parameters={})
    private Output<ManualScalingResponse> manualScaling;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as &#34;backends&#34;.
     * 
     */
    public Output<ManualScalingResponse> manualScaling() {
        return this.manualScaling;
    }
    /**
     * Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Extra network settings. Only applicable in the App Engine flexible environment.
     * 
     */
    @Export(name="network", type=NetworkResponse.class, parameters={})
    private Output<NetworkResponse> network;

    /**
     * @return Extra network settings. Only applicable in the App Engine flexible environment.
     * 
     */
    public Output<NetworkResponse> network() {
        return this.network;
    }
    /**
     * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="nobuildFilesRegex", type=String.class, parameters={})
    private Output<String> nobuildFilesRegex;

    /**
     * @return Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<String> nobuildFilesRegex() {
        return this.nobuildFilesRegex;
    }
    /**
     * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
     * 
     */
    @Export(name="readinessCheck", type=ReadinessCheckResponse.class, parameters={})
    private Output<ReadinessCheckResponse> readinessCheck;

    /**
     * @return Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
     * 
     */
    public Output<ReadinessCheckResponse> readinessCheck() {
        return this.readinessCheck;
    }
    /**
     * Machine resources for this version. Only applicable in the App Engine flexible environment.
     * 
     */
    @Export(name="resources", type=ResourcesResponse.class, parameters={})
    private Output<ResourcesResponse> resources;

    /**
     * @return Machine resources for this version. Only applicable in the App Engine flexible environment.
     * 
     */
    public Output<ResourcesResponse> resources() {
        return this.resources;
    }
    /**
     * Desired runtime. Example: python27.
     * 
     */
    @Export(name="runtime", type=String.class, parameters={})
    private Output<String> runtime;

    /**
     * @return Desired runtime. Example: python27.
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }
    /**
     * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
     * 
     */
    @Export(name="runtimeApiVersion", type=String.class, parameters={})
    private Output<String> runtimeApiVersion;

    /**
     * @return The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
     * 
     */
    public Output<String> runtimeApiVersion() {
        return this.runtimeApiVersion;
    }
    /**
     * The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
     * 
     */
    @Export(name="runtimeChannel", type=String.class, parameters={})
    private Output<String> runtimeChannel;

    /**
     * @return The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
     * 
     */
    public Output<String> runtimeChannel() {
        return this.runtimeChannel;
    }
    /**
     * The path or name of the app&#39;s main executable.
     * 
     */
    @Export(name="runtimeMainExecutablePath", type=String.class, parameters={})
    private Output<String> runtimeMainExecutablePath;

    /**
     * @return The path or name of the app&#39;s main executable.
     * 
     */
    public Output<String> runtimeMainExecutablePath() {
        return this.runtimeMainExecutablePath;
    }
    /**
     * The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
     * 
     */
    @Export(name="servingStatus", type=String.class, parameters={})
    private Output<String> servingStatus;

    /**
     * @return Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
     * 
     */
    public Output<String> servingStatus() {
        return this.servingStatus;
    }
    /**
     * Whether multiple requests can be dispatched to this version at once.
     * 
     */
    @Export(name="threadsafe", type=Boolean.class, parameters={})
    private Output<Boolean> threadsafe;

    /**
     * @return Whether multiple requests can be dispatched to this version at once.
     * 
     */
    public Output<Boolean> threadsafe() {
        return this.threadsafe;
    }
    /**
     * Serving URL for this version. Example: &#34;https://myversion-dot-myservice-dot-myapp.appspot.com&#34;
     * 
     */
    @Export(name="versionUrl", type=String.class, parameters={})
    private Output<String> versionUrl;

    /**
     * @return Serving URL for this version. Example: &#34;https://myversion-dot-myservice-dot-myapp.appspot.com&#34;
     * 
     */
    public Output<String> versionUrl() {
        return this.versionUrl;
    }
    /**
     * Whether to deploy this version in a container on a virtual machine.
     * 
     */
    @Export(name="vm", type=Boolean.class, parameters={})
    private Output<Boolean> vm;

    /**
     * @return Whether to deploy this version in a container on a virtual machine.
     * 
     */
    public Output<Boolean> vm() {
        return this.vm;
    }
    /**
     * Enables VPC connectivity for standard apps.
     * 
     */
    @Export(name="vpcAccessConnector", type=VpcAccessConnectorResponse.class, parameters={})
    private Output<VpcAccessConnectorResponse> vpcAccessConnector;

    /**
     * @return Enables VPC connectivity for standard apps.
     * 
     */
    public Output<VpcAccessConnectorResponse> vpcAccessConnector() {
        return this.vpcAccessConnector;
    }
    /**
     * The Google Compute Engine zones that are supported by this version in the App Engine flexible environment. Deprecated.
     * 
     * @deprecated
     * The Google Compute Engine zones that are supported by this version in the App Engine flexible environment. Deprecated.
     * 
     */
    @Deprecated /* The Google Compute Engine zones that are supported by this version in the App Engine flexible environment. Deprecated. */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output<List<String>> zones;

    /**
     * @return The Google Compute Engine zones that are supported by this version in the App Engine flexible environment. Deprecated.
     * 
     */
    public Output<List<String>> zones() {
        return this.zones;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Version(String name) {
        this(name, VersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Version(String name, VersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Version(String name, VersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:Version", name, args == null ? VersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Version(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:appengine/v1:Version", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Version get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Version(name, id, options);
    }
}
