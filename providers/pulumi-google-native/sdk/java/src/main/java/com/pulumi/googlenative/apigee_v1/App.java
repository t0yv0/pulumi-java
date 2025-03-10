// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee_v1.AppArgs;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1AttributeResponse;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1CredentialResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an app associated with a developer. This API associates the developer app with the specified API product and auto-generates an API key for the app to use in calls to API proxies inside that API product. The `name` is the unique ID of the app that you can use in API calls. The `DisplayName` (set as an attribute) appears in the UI. If you don&#39;t set the `DisplayName` attribute, the `name` appears in the UI.
 * 
 */
@ResourceType(type="google-native:apigee/v1:App")
public class App extends com.pulumi.resources.CustomResource {
    /**
     * List of API products associated with the developer app.
     * 
     */
    @Export(name="apiProducts", type=List.class, parameters={String.class})
    private Output<List<String>> apiProducts;

    /**
     * @return List of API products associated with the developer app.
     * 
     */
    public Output<List<String>> apiProducts() {
        return this.apiProducts;
    }
    /**
     * Developer app family.
     * 
     */
    @Export(name="appFamily", type=String.class, parameters={})
    private Output<String> appFamily;

    /**
     * @return Developer app family.
     * 
     */
    public Output<String> appFamily() {
        return this.appFamily;
    }
    /**
     * ID of the developer app.
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return ID of the developer app.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * List of attributes for the developer app.
     * 
     */
    @Export(name="attributes", type=List.class, parameters={GoogleCloudApigeeV1AttributeResponse.class})
    private Output<List<GoogleCloudApigeeV1AttributeResponse>> attributes;

    /**
     * @return List of attributes for the developer app.
     * 
     */
    public Output<List<GoogleCloudApigeeV1AttributeResponse>> attributes() {
        return this.attributes;
    }
    /**
     * Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to developer apps.
     * 
     */
    @Export(name="callbackUrl", type=String.class, parameters={})
    private Output<String> callbackUrl;

    /**
     * @return Callback URL used by OAuth 2.0 authorization servers to communicate authorization codes back to developer apps.
     * 
     */
    public Output<String> callbackUrl() {
        return this.callbackUrl;
    }
    /**
     * Time the developer app was created in milliseconds since epoch.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time the developer app was created in milliseconds since epoch.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Set of credentials for the developer app consisting of the consumer key/secret pairs associated with the API products.
     * 
     */
    @Export(name="credentials", type=List.class, parameters={GoogleCloudApigeeV1CredentialResponse.class})
    private Output<List<GoogleCloudApigeeV1CredentialResponse>> credentials;

    /**
     * @return Set of credentials for the developer app consisting of the consumer key/secret pairs associated with the API products.
     * 
     */
    public Output<List<GoogleCloudApigeeV1CredentialResponse>> credentials() {
        return this.credentials;
    }
    /**
     * ID of the developer.
     * 
     */
    @Export(name="developerId", type=String.class, parameters={})
    private Output<String> developerId;

    /**
     * @return ID of the developer.
     * 
     */
    public Output<String> developerId() {
        return this.developerId;
    }
    /**
     * Expiration time, in milliseconds, for the consumer key that is generated for the developer app. If not set or left to the default value of `-1`, the API key never expires. The expiration time can&#39;t be updated after it is set.
     * 
     */
    @Export(name="keyExpiresIn", type=String.class, parameters={})
    private Output<String> keyExpiresIn;

    /**
     * @return Expiration time, in milliseconds, for the consumer key that is generated for the developer app. If not set or left to the default value of `-1`, the API key never expires. The expiration time can&#39;t be updated after it is set.
     * 
     */
    public Output<String> keyExpiresIn() {
        return this.keyExpiresIn;
    }
    /**
     * Time the developer app was modified in milliseconds since epoch.
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return Time the developer app was modified in milliseconds since epoch.
     * 
     */
    public Output<String> lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the developer app.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the developer app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Scopes to apply to the developer app. The specified scopes must already exist for the API product that you associate with the developer app.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    /**
     * @return Scopes to apply to the developer app. The specified scopes must already exist for the API product that you associate with the developer app.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }
    /**
     * Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the credential. Valid values include `approved` or `revoked`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public App(String name) {
        this(name, AppArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public App(String name, AppArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public App(String name, AppArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:App", name, args == null ? AppArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private App(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:App", name, null, makeResourceOptions(options, id));
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
    public static App get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new App(name, id, options);
    }
}
