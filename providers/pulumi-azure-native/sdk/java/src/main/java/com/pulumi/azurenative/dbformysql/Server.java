// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.dbformysql.ServerArgs;
import com.pulumi.azurenative.dbformysql.outputs.ResourceIdentityResponse;
import com.pulumi.azurenative.dbformysql.outputs.ServerPrivateEndpointConnectionResponse;
import com.pulumi.azurenative.dbformysql.outputs.SkuResponse;
import com.pulumi.azurenative.dbformysql.outputs.StorageProfileResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a server.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * ### Create a database as a point in time restore
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
 *         var server = new Server(&#34;server&#34;, ServerArgs.builder()        
 *             .location(&#34;brazilsouth&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;createMode&#34;, &#34;PointInTimeRestore&#34;),
 *                 Map.entry(&#34;restorePointInTime&#34;, &#34;2017-12-14T00:00:37.467Z&#34;),
 *                 Map.entry(&#34;sourceServerId&#34;, &#34;/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/SourceResourceGroup/providers/Microsoft.DBforMySQL/servers/sourceserver&#34;)
 *             ))
 *             .resourceGroupName(&#34;TargetResourceGroup&#34;)
 *             .serverName(&#34;targetserver&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;capacity&#34;, 2),
 *                 Map.entry(&#34;family&#34;, &#34;Gen5&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;GP_Gen5_2&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;GeneralPurpose&#34;)
 *             ))
 *             .tags(Map.of(&#34;ElasticServer&#34;, &#34;1&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a new server
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
 *         var server = new Server(&#34;server&#34;, ServerArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;administratorLogin&#34;, &#34;cloudsa&#34;),
 *                 Map.entry(&#34;administratorLoginPassword&#34;, &#34;&lt;administratorLoginPassword&gt;&#34;),
 *                 Map.entry(&#34;createMode&#34;, &#34;Default&#34;),
 *                 Map.entry(&#34;sslEnforcement&#34;, &#34;Enabled&#34;),
 *                 Map.entry(&#34;storageProfile&#34;, Map.ofEntries(
 *                     Map.entry(&#34;backupRetentionDays&#34;, 7),
 *                     Map.entry(&#34;geoRedundantBackup&#34;, &#34;Enabled&#34;),
 *                     Map.entry(&#34;storageMB&#34;, 128000)
 *                 ))
 *             ))
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .serverName(&#34;mysqltestsvc4&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;capacity&#34;, 2),
 *                 Map.entry(&#34;family&#34;, &#34;Gen5&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;GP_Gen5_2&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;GeneralPurpose&#34;)
 *             ))
 *             .tags(Map.of(&#34;ElasticServer&#34;, &#34;1&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a replica server
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
 *         var server = new Server(&#34;server&#34;, ServerArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;createMode&#34;, &#34;Replica&#34;),
 *                 Map.entry(&#34;sourceServerId&#34;, &#34;/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/MasterResourceGroup/providers/Microsoft.DBforMySQL/servers/masterserver&#34;)
 *             ))
 *             .resourceGroupName(&#34;TargetResourceGroup&#34;)
 *             .serverName(&#34;targetserver&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a server as a geo restore
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
 *         var server = new Server(&#34;server&#34;, ServerArgs.builder()        
 *             .location(&#34;westus&#34;)
 *             .properties(Map.ofEntries(
 *                 Map.entry(&#34;createMode&#34;, &#34;GeoRestore&#34;),
 *                 Map.entry(&#34;sourceServerId&#34;, &#34;/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/SourceResourceGroup/providers/Microsoft.DBforMySQL/servers/sourceserver&#34;)
 *             ))
 *             .resourceGroupName(&#34;TargetResourceGroup&#34;)
 *             .serverName(&#34;targetserver&#34;)
 *             .sku(Map.ofEntries(
 *                 Map.entry(&#34;capacity&#34;, 2),
 *                 Map.entry(&#34;family&#34;, &#34;Gen5&#34;),
 *                 Map.entry(&#34;name&#34;, &#34;GP_Gen5_2&#34;),
 *                 Map.entry(&#34;tier&#34;, &#34;GeneralPurpose&#34;)
 *             ))
 *             .tags(Map.of(&#34;ElasticServer&#34;, &#34;1&#34;))
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
 * $ pulumi import azure-native:dbformysql:Server targetserver /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforMySQL/servers/targetserver 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbformysql:Server")
public class Server extends com.pulumi.resources.CustomResource {
    /**
     * The administrator&#39;s login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    @Export(name="administratorLogin", type=String.class, parameters={})
    private Output</* @Nullable */ String> administratorLogin;

    /**
     * @return The administrator&#39;s login name of a server. Can only be specified when the server is being created (and is required for creation).
     * 
     */
    public Output<Optional<String>> administratorLogin() {
        return Codegen.optional(this.administratorLogin);
    }
    /**
     * Status showing whether the server data encryption is enabled with customer-managed keys.
     * 
     */
    @Export(name="byokEnforcement", type=String.class, parameters={})
    private Output<String> byokEnforcement;

    /**
     * @return Status showing whether the server data encryption is enabled with customer-managed keys.
     * 
     */
    public Output<String> byokEnforcement() {
        return this.byokEnforcement;
    }
    /**
     * Earliest restore point creation time (ISO8601 format)
     * 
     */
    @Export(name="earliestRestoreDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> earliestRestoreDate;

    /**
     * @return Earliest restore point creation time (ISO8601 format)
     * 
     */
    public Output<Optional<String>> earliestRestoreDate() {
        return Codegen.optional(this.earliestRestoreDate);
    }
    /**
     * The fully qualified domain name of a server.
     * 
     */
    @Export(name="fullyQualifiedDomainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> fullyQualifiedDomainName;

    /**
     * @return The fully qualified domain name of a server.
     * 
     */
    public Output<Optional<String>> fullyQualifiedDomainName() {
        return Codegen.optional(this.fullyQualifiedDomainName);
    }
    /**
     * The Azure Active Directory identity of the server.
     * 
     */
    @Export(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return The Azure Active Directory identity of the server.
     * 
     */
    public Output<Optional<ResourceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Status showing whether the server enabled infrastructure encryption.
     * 
     */
    @Export(name="infrastructureEncryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> infrastructureEncryption;

    /**
     * @return Status showing whether the server enabled infrastructure encryption.
     * 
     */
    public Output<Optional<String>> infrastructureEncryption() {
        return Codegen.optional(this.infrastructureEncryption);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The master server id of a replica server.
     * 
     */
    @Export(name="masterServerId", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterServerId;

    /**
     * @return The master server id of a replica server.
     * 
     */
    public Output<Optional<String>> masterServerId() {
        return Codegen.optional(this.masterServerId);
    }
    /**
     * Enforce a minimal Tls version for the server.
     * 
     */
    @Export(name="minimalTlsVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimalTlsVersion;

    /**
     * @return Enforce a minimal Tls version for the server.
     * 
     */
    public Output<Optional<String>> minimalTlsVersion() {
        return Codegen.optional(this.minimalTlsVersion);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of private endpoint connections on a server
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={ServerPrivateEndpointConnectionResponse.class})
    private Output<List<ServerPrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections on a server
     * 
     */
    public Output<List<ServerPrivateEndpointConnectionResponse>> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    @Export(name="publicNetworkAccess", type=String.class, parameters={})
    private Output</* @Nullable */ String> publicNetworkAccess;

    /**
     * @return Whether or not public network access is allowed for this server. Value is optional but if passed in, must be &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Output<Optional<String>> publicNetworkAccess() {
        return Codegen.optional(this.publicNetworkAccess);
    }
    /**
     * The maximum number of replicas that a master server can have.
     * 
     */
    @Export(name="replicaCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> replicaCapacity;

    /**
     * @return The maximum number of replicas that a master server can have.
     * 
     */
    public Output<Optional<Integer>> replicaCapacity() {
        return Codegen.optional(this.replicaCapacity);
    }
    /**
     * The replication role of the server.
     * 
     */
    @Export(name="replicationRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> replicationRole;

    /**
     * @return The replication role of the server.
     * 
     */
    public Output<Optional<String>> replicationRole() {
        return Codegen.optional(this.replicationRole);
    }
    /**
     * The SKU (pricing tier) of the server.
     * 
     */
    @Export(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The SKU (pricing tier) of the server.
     * 
     */
    public Output<Optional<SkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @Export(name="sslEnforcement", type=String.class, parameters={})
    private Output</* @Nullable */ String> sslEnforcement;

    /**
     * @return Enable ssl enforcement or not when connect to server.
     * 
     */
    public Output<Optional<String>> sslEnforcement() {
        return Codegen.optional(this.sslEnforcement);
    }
    /**
     * Storage profile of a server.
     * 
     */
    @Export(name="storageProfile", type=StorageProfileResponse.class, parameters={})
    private Output</* @Nullable */ StorageProfileResponse> storageProfile;

    /**
     * @return Storage profile of a server.
     * 
     */
    public Output<Optional<StorageProfileResponse>> storageProfile() {
        return Codegen.optional(this.storageProfile);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A state of a server that is visible to user.
     * 
     */
    @Export(name="userVisibleState", type=String.class, parameters={})
    private Output</* @Nullable */ String> userVisibleState;

    /**
     * @return A state of a server that is visible to user.
     * 
     */
    public Output<Optional<String>> userVisibleState() {
        return Codegen.optional(this.userVisibleState);
    }
    /**
     * Server version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Server version.
     * 
     */
    public Output<Optional<String>> version() {
        return Codegen.optional(this.version);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Server(String name) {
        this(name, ServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Server(String name, ServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Server(String name, ServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:Server", name, args == null ? ServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Server(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbformysql:Server", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:dbformysql/v20171201:Server").build()),
                Output.of(Alias.builder().type("azure-native:dbformysql/v20171201preview:Server").build())
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
    public static Server get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Server(name, id, options);
    }
}
