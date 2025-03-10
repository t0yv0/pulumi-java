// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.kusto.inputs.GetAttachedDatabaseConfigurationArgs;
import com.pulumi.azurenative.kusto.inputs.GetClusterArgs;
import com.pulumi.azurenative.kusto.inputs.GetClusterPrincipalAssignmentArgs;
import com.pulumi.azurenative.kusto.inputs.GetDataConnectionArgs;
import com.pulumi.azurenative.kusto.inputs.GetDatabaseArgs;
import com.pulumi.azurenative.kusto.inputs.GetDatabasePrincipalAssignmentArgs;
import com.pulumi.azurenative.kusto.inputs.GetEventGridDataConnectionArgs;
import com.pulumi.azurenative.kusto.inputs.GetEventHubConnectionArgs;
import com.pulumi.azurenative.kusto.inputs.GetEventHubDataConnectionArgs;
import com.pulumi.azurenative.kusto.inputs.GetIotHubDataConnectionArgs;
import com.pulumi.azurenative.kusto.inputs.GetManagedPrivateEndpointArgs;
import com.pulumi.azurenative.kusto.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.kusto.inputs.GetReadOnlyFollowingDatabaseArgs;
import com.pulumi.azurenative.kusto.inputs.GetReadWriteDatabaseArgs;
import com.pulumi.azurenative.kusto.inputs.GetScriptArgs;
import com.pulumi.azurenative.kusto.inputs.ListClusterFollowerDatabasesArgs;
import com.pulumi.azurenative.kusto.inputs.ListClusterLanguageExtensionsArgs;
import com.pulumi.azurenative.kusto.inputs.ListDatabasePrincipalsArgs;
import com.pulumi.azurenative.kusto.outputs.GetAttachedDatabaseConfigurationResult;
import com.pulumi.azurenative.kusto.outputs.GetClusterPrincipalAssignmentResult;
import com.pulumi.azurenative.kusto.outputs.GetClusterResult;
import com.pulumi.azurenative.kusto.outputs.GetDataConnectionResult;
import com.pulumi.azurenative.kusto.outputs.GetDatabasePrincipalAssignmentResult;
import com.pulumi.azurenative.kusto.outputs.GetDatabaseResult;
import com.pulumi.azurenative.kusto.outputs.GetEventGridDataConnectionResult;
import com.pulumi.azurenative.kusto.outputs.GetEventHubConnectionResult;
import com.pulumi.azurenative.kusto.outputs.GetEventHubDataConnectionResult;
import com.pulumi.azurenative.kusto.outputs.GetIotHubDataConnectionResult;
import com.pulumi.azurenative.kusto.outputs.GetManagedPrivateEndpointResult;
import com.pulumi.azurenative.kusto.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.kusto.outputs.GetReadOnlyFollowingDatabaseResult;
import com.pulumi.azurenative.kusto.outputs.GetReadWriteDatabaseResult;
import com.pulumi.azurenative.kusto.outputs.GetScriptResult;
import com.pulumi.azurenative.kusto.outputs.ListClusterFollowerDatabasesResult;
import com.pulumi.azurenative.kusto.outputs.ListClusterLanguageExtensionsResult;
import com.pulumi.azurenative.kusto.outputs.ListDatabasePrincipalsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class KustoFunctions {
    /**
     * Class representing an attached database configuration.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetAttachedDatabaseConfigurationResult> getAttachedDatabaseConfiguration(GetAttachedDatabaseConfigurationArgs args) {
        return getAttachedDatabaseConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Class representing an attached database configuration.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetAttachedDatabaseConfigurationResult> getAttachedDatabaseConfiguration(GetAttachedDatabaseConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getAttachedDatabaseConfiguration", TypeShape.of(GetAttachedDatabaseConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a Kusto cluster.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a Kusto cluster.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a cluster principal assignment.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetClusterPrincipalAssignmentResult> getClusterPrincipalAssignment(GetClusterPrincipalAssignmentArgs args) {
        return getClusterPrincipalAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a cluster principal assignment.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetClusterPrincipalAssignmentResult> getClusterPrincipalAssignment(GetClusterPrincipalAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getClusterPrincipalAssignment", TypeShape.of(GetClusterPrincipalAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing an data connection.
     * API Version: 2021-01-01.
     * 
     * @deprecated
     * Please use one of the variants: EventGridDataConnection, EventHubDataConnection, IotHubDataConnection.
     * 
     */
    @Deprecated /* Please use one of the variants: EventGridDataConnection, EventHubDataConnection, IotHubDataConnection. */
    public static CompletableFuture<GetDataConnectionResult> getDataConnection(GetDataConnectionArgs args) {
        return getDataConnection(args, InvokeOptions.Empty);
    }
    /**
     * Class representing an data connection.
     * API Version: 2021-01-01.
     * 
     * @deprecated
     * Please use one of the variants: EventGridDataConnection, EventHubDataConnection, IotHubDataConnection.
     * 
     */
    @Deprecated /* Please use one of the variants: EventGridDataConnection, EventHubDataConnection, IotHubDataConnection. */
    public static CompletableFuture<GetDataConnectionResult> getDataConnection(GetDataConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getDataConnection", TypeShape.of(GetDataConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a Kusto database.
     * API Version: 2021-01-01.
     * 
     * @deprecated
     * Please use one of the variants: ReadOnlyFollowingDatabase, ReadWriteDatabase.
     * 
     */
    @Deprecated /* Please use one of the variants: ReadOnlyFollowingDatabase, ReadWriteDatabase. */
    public static CompletableFuture<GetDatabaseResult> getDatabase(GetDatabaseArgs args) {
        return getDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a Kusto database.
     * API Version: 2021-01-01.
     * 
     * @deprecated
     * Please use one of the variants: ReadOnlyFollowingDatabase, ReadWriteDatabase.
     * 
     */
    @Deprecated /* Please use one of the variants: ReadOnlyFollowingDatabase, ReadWriteDatabase. */
    public static CompletableFuture<GetDatabaseResult> getDatabase(GetDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getDatabase", TypeShape.of(GetDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a database principal assignment.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDatabasePrincipalAssignmentResult> getDatabasePrincipalAssignment(GetDatabasePrincipalAssignmentArgs args) {
        return getDatabasePrincipalAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a database principal assignment.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetDatabasePrincipalAssignmentResult> getDatabasePrincipalAssignment(GetDatabasePrincipalAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getDatabasePrincipalAssignment", TypeShape.of(GetDatabasePrincipalAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing an Event Grid data connection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetEventGridDataConnectionResult> getEventGridDataConnection(GetEventGridDataConnectionArgs args) {
        return getEventGridDataConnection(args, InvokeOptions.Empty);
    }
    /**
     * Class representing an Event Grid data connection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetEventGridDataConnectionResult> getEventGridDataConnection(GetEventGridDataConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getEventGridDataConnection", TypeShape.of(GetEventGridDataConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing an event hub connection.
     * API Version: 2018-09-07-preview.
     * 
     */
    public static CompletableFuture<GetEventHubConnectionResult> getEventHubConnection(GetEventHubConnectionArgs args) {
        return getEventHubConnection(args, InvokeOptions.Empty);
    }
    /**
     * Class representing an event hub connection.
     * API Version: 2018-09-07-preview.
     * 
     */
    public static CompletableFuture<GetEventHubConnectionResult> getEventHubConnection(GetEventHubConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getEventHubConnection", TypeShape.of(GetEventHubConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing an event hub data connection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetEventHubDataConnectionResult> getEventHubDataConnection(GetEventHubDataConnectionArgs args) {
        return getEventHubDataConnection(args, InvokeOptions.Empty);
    }
    /**
     * Class representing an event hub data connection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetEventHubDataConnectionResult> getEventHubDataConnection(GetEventHubDataConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getEventHubDataConnection", TypeShape.of(GetEventHubDataConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing an iot hub data connection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetIotHubDataConnectionResult> getIotHubDataConnection(GetIotHubDataConnectionArgs args) {
        return getIotHubDataConnection(args, InvokeOptions.Empty);
    }
    /**
     * Class representing an iot hub data connection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetIotHubDataConnectionResult> getIotHubDataConnection(GetIotHubDataConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getIotHubDataConnection", TypeShape.of(GetIotHubDataConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a managed private endpoint.
     * API Version: 2021-08-27.
     * 
     */
    public static CompletableFuture<GetManagedPrivateEndpointResult> getManagedPrivateEndpoint(GetManagedPrivateEndpointArgs args) {
        return getManagedPrivateEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a managed private endpoint.
     * API Version: 2021-08-27.
     * 
     */
    public static CompletableFuture<GetManagedPrivateEndpointResult> getManagedPrivateEndpoint(GetManagedPrivateEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getManagedPrivateEndpoint", TypeShape.of(GetManagedPrivateEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection
     * API Version: 2021-08-27.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection
     * API Version: 2021-08-27.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a read only following database.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetReadOnlyFollowingDatabaseResult> getReadOnlyFollowingDatabase(GetReadOnlyFollowingDatabaseArgs args) {
        return getReadOnlyFollowingDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a read only following database.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetReadOnlyFollowingDatabaseResult> getReadOnlyFollowingDatabase(GetReadOnlyFollowingDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getReadOnlyFollowingDatabase", TypeShape.of(GetReadOnlyFollowingDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a read write database.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetReadWriteDatabaseResult> getReadWriteDatabase(GetReadWriteDatabaseArgs args) {
        return getReadWriteDatabase(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a read write database.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetReadWriteDatabaseResult> getReadWriteDatabase(GetReadWriteDatabaseArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getReadWriteDatabase", TypeShape.of(GetReadWriteDatabaseResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing a database script.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetScriptResult> getScript(GetScriptArgs args) {
        return getScript(args, InvokeOptions.Empty);
    }
    /**
     * Class representing a database script.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetScriptResult> getScript(GetScriptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getScript", TypeShape.of(GetScriptResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list Kusto database principals operation response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListClusterFollowerDatabasesResult> listClusterFollowerDatabases(ListClusterFollowerDatabasesArgs args) {
        return listClusterFollowerDatabases(args, InvokeOptions.Empty);
    }
    /**
     * The list Kusto database principals operation response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListClusterFollowerDatabasesResult> listClusterFollowerDatabases(ListClusterFollowerDatabasesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:listClusterFollowerDatabases", TypeShape.of(ListClusterFollowerDatabasesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of language extension objects.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListClusterLanguageExtensionsResult> listClusterLanguageExtensions(ListClusterLanguageExtensionsArgs args) {
        return listClusterLanguageExtensions(args, InvokeOptions.Empty);
    }
    /**
     * The list of language extension objects.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListClusterLanguageExtensionsResult> listClusterLanguageExtensions(ListClusterLanguageExtensionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:listClusterLanguageExtensions", TypeShape.of(ListClusterLanguageExtensionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list Kusto database principals operation response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListDatabasePrincipalsResult> listDatabasePrincipals(ListDatabasePrincipalsArgs args) {
        return listDatabasePrincipals(args, InvokeOptions.Empty);
    }
    /**
     * The list Kusto database principals operation response.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<ListDatabasePrincipalsResult> listDatabasePrincipals(ListDatabasePrincipalsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:listDatabasePrincipals", TypeShape.of(ListDatabasePrincipalsResult.class), args, Utilities.withVersion(options));
    }
}
