// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Mysql.inputs.GetAnalyticsClusterArgs;
import com.pulumi.oci.Mysql.inputs.GetChannelArgs;
import com.pulumi.oci.Mysql.inputs.GetChannelsArgs;
import com.pulumi.oci.Mysql.inputs.GetHeatWaveClusterArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlBackupArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlBackupsArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlConfigurationArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlConfigurationsArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlDbSystemArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlDbSystemsArgs;
import com.pulumi.oci.Mysql.inputs.GetMysqlVersionArgs;
import com.pulumi.oci.Mysql.inputs.GetShapesArgs;
import com.pulumi.oci.Mysql.outputs.GetAnalyticsClusterResult;
import com.pulumi.oci.Mysql.outputs.GetChannelResult;
import com.pulumi.oci.Mysql.outputs.GetChannelsResult;
import com.pulumi.oci.Mysql.outputs.GetHeatWaveClusterResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlBackupResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlBackupsResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlConfigurationResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlConfigurationsResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlDbSystemResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlDbSystemsResult;
import com.pulumi.oci.Mysql.outputs.GetMysqlVersionResult;
import com.pulumi.oci.Mysql.outputs.GetShapesResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class MysqlFunctions {
    /**
     * This data source provides details about a specific Analytics Cluster resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * DEPRECATED -- please use HeatWave API instead.
     * Gets information about the Analytics Cluster.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAnalyticsClusterResult> getAnalyticsCluster(GetAnalyticsClusterArgs args) {
        return getAnalyticsCluster(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Analytics Cluster resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * DEPRECATED -- please use HeatWave API instead.
     * Gets information about the Analytics Cluster.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAnalyticsClusterResult> getAnalyticsCluster(GetAnalyticsClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getAnalyticsCluster:getAnalyticsCluster", TypeShape.of(GetAnalyticsClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Channel resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Gets the full details of the specified Channel, including the user-specified
     * configuration parameters (passwords are omitted), as well as information about
     * the state of the Channel, its sources and targets.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args) {
        return getChannel(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Channel resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Gets the full details of the specified Channel, including the user-specified
     * configuration parameters (passwords are omitted), as well as information about
     * the state of the Channel, its sources and targets.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetChannelResult> getChannel(GetChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getChannel:getChannel", TypeShape.of(GetChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Channels in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Lists all the Channels that match the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetChannelsResult> getChannels(GetChannelsArgs args) {
        return getChannels(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Channels in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Lists all the Channels that match the specified filters.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetChannelsResult> getChannels(GetChannelsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getChannels:getChannels", TypeShape.of(GetChannelsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific HeatWave cluster resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Gets information about the HeatWave cluster.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHeatWaveClusterResult> getHeatWaveCluster(GetHeatWaveClusterArgs args) {
        return getHeatWaveCluster(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific HeatWave cluster resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Gets information about the HeatWave cluster.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHeatWaveClusterResult> getHeatWaveCluster(GetHeatWaveClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getHeatWaveCluster:getHeatWaveCluster", TypeShape.of(GetHeatWaveClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Mysql Backup resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get information about the specified Backup
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlBackupResult> getMysqlBackup(GetMysqlBackupArgs args) {
        return getMysqlBackup(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Mysql Backup resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get information about the specified Backup
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlBackupResult> getMysqlBackup(GetMysqlBackupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlBackup:getMysqlBackup", TypeShape.of(GetMysqlBackupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Mysql Backups in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get a list of DB System backups.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlBackupsResult> getMysqlBackups(GetMysqlBackupsArgs args) {
        return getMysqlBackups(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Mysql Backups in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get a list of DB System backups.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlBackupsResult> getMysqlBackups(GetMysqlBackupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlBackups:getMysqlBackups", TypeShape.of(GetMysqlBackupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Mysql Configuration resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get the full details of the specified Configuration, including the list of MySQL Variables and their values.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlConfigurationResult> getMysqlConfiguration(GetMysqlConfigurationArgs args) {
        return getMysqlConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Mysql Configuration resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get the full details of the specified Configuration, including the list of MySQL Variables and their values.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlConfigurationResult> getMysqlConfiguration(GetMysqlConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlConfiguration:getMysqlConfiguration", TypeShape.of(GetMysqlConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Mysql Configurations in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Lists the Configurations available when creating a DB System.
     * 
     * This may include DEFAULT configurations per Shape and CUSTOM configurations.
     * 
     * The default sort order is a multi-part sort by:
     *   - shapeName, ascending
     *   - DEFAULT-before-CUSTOM
     *   - displayName ascending
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlConfigurationsResult> getMysqlConfigurations(GetMysqlConfigurationsArgs args) {
        return getMysqlConfigurations(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Mysql Configurations in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Lists the Configurations available when creating a DB System.
     * 
     * This may include DEFAULT configurations per Shape and CUSTOM configurations.
     * 
     * The default sort order is a multi-part sort by:
     *   - shapeName, ascending
     *   - DEFAULT-before-CUSTOM
     *   - displayName ascending
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlConfigurationsResult> getMysqlConfigurations(GetMysqlConfigurationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlConfigurations:getMysqlConfigurations", TypeShape.of(GetMysqlConfigurationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Mysql Db System resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get information about the specified DB System.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlDbSystemResult> getMysqlDbSystem(GetMysqlDbSystemArgs args) {
        return getMysqlDbSystem(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Mysql Db System resource in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get information about the specified DB System.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlDbSystemResult> getMysqlDbSystem(GetMysqlDbSystemArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlDbSystem:getMysqlDbSystem", TypeShape.of(GetMysqlDbSystemResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Mysql Db Systems in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get a list of DB Systems in the specified compartment.
     * The default sort order is by timeUpdated, descending.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlDbSystemsResult> getMysqlDbSystems(GetMysqlDbSystemsArgs args) {
        return getMysqlDbSystems(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Mysql Db Systems in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get a list of DB Systems in the specified compartment.
     * The default sort order is by timeUpdated, descending.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlDbSystemsResult> getMysqlDbSystems(GetMysqlDbSystemsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlDbSystems:getMysqlDbSystems", TypeShape.of(GetMysqlDbSystemsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Mysql Versions in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get a list of supported and available MySQL database major versions.
     * 
     * The list is sorted by version family.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlVersionResult> getMysqlVersion(GetMysqlVersionArgs args) {
        return getMysqlVersion(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Mysql Versions in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Get a list of supported and available MySQL database major versions.
     * 
     * The list is sorted by version family.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMysqlVersionResult> getMysqlVersion(GetMysqlVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getMysqlVersion:getMysqlVersion", TypeShape.of(GetMysqlVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Shapes in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Gets a list of the shapes you can use to create a new MySQL DB System.
     * The shape determines the resources allocated to the DB System:
     * CPU cores and memory for VM shapes; CPU cores, memory and
     * storage for non-VM (or bare metal) shapes.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetShapesResult> getShapes(GetShapesArgs args) {
        return getShapes(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Shapes in Oracle Cloud Infrastructure MySQL Database service.
     * 
     * Gets a list of the shapes you can use to create a new MySQL DB System.
     * The shape determines the resources allocated to the DB System:
     * CPU cores and memory for VM shapes; CPU cores, memory and
     * storage for non-VM (or bare metal) shapes.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetShapesResult> getShapes(GetShapesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Mysql/getShapes:getShapes", TypeShape.of(GetShapesResult.class), args, Utilities.withVersion(options));
    }
}
