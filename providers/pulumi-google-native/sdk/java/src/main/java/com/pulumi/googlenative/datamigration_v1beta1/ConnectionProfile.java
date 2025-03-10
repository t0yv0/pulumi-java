// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.datamigration_v1beta1.ConnectionProfileArgs;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.CloudSqlConnectionProfileResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.MySqlConnectionProfileResponse;
import com.pulumi.googlenative.datamigration_v1beta1.outputs.StatusResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new connection profile in a given project and location.
 * 
 */
@ResourceType(type="google-native:datamigration/v1beta1:ConnectionProfile")
public class ConnectionProfile extends com.pulumi.resources.CustomResource {
    /**
     * A CloudSQL database connection profile.
     * 
     */
    @Export(name="cloudsql", type=CloudSqlConnectionProfileResponse.class, parameters={})
    private Output<CloudSqlConnectionProfileResponse> cloudsql;

    /**
     * @return A CloudSQL database connection profile.
     * 
     */
    public Output<CloudSqlConnectionProfileResponse> cloudsql() {
        return this.cloudsql;
    }
    /**
     * The timestamp when the resource was created. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The timestamp when the resource was created. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The connection profile display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The connection profile display name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The error details in case of state FAILED.
     * 
     */
    @Export(name="error", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> error;

    /**
     * @return The error details in case of state FAILED.
     * 
     */
    public Output<StatusResponse> error() {
        return this.error;
    }
    /**
     * The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The resource labels for connection profile to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of &#34;key&#34;: &#34;value&#34; pairs. Example: `{ &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }`.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * A MySQL database connection profile.
     * 
     */
    @Export(name="mysql", type=MySqlConnectionProfileResponse.class, parameters={})
    private Output<MySqlConnectionProfileResponse> mysql;

    /**
     * @return A MySQL database connection profile.
     * 
     */
    public Output<MySqlConnectionProfileResponse> mysql() {
        return this.mysql;
    }
    /**
     * The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this connection profile resource in the form of projects/{project}/locations/{location}/connectionProfiles/{connectionProfile}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The database provider.
     * 
     */
    @Export(name="provider", type=String.class, parameters={})
    private Output<String> provider;

    /**
     * @return The database provider.
     * 
     */
    public Output<String> provider() {
        return this.provider;
    }
    /**
     * The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current connection profile state (e.g. DRAFT, READY, or FAILED).
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The timestamp when the resource was last updated. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The timestamp when the resource was last updated. A timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds. Example: &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionProfile(String name) {
        this(name, ConnectionProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionProfile(String name, ConnectionProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1beta1:ConnectionProfile", name, args == null ? ConnectionProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionProfile(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datamigration/v1beta1:ConnectionProfile", name, null, makeResourceOptions(options, id));
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
    public static ConnectionProfile get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionProfile(name, id, options);
    }
}
