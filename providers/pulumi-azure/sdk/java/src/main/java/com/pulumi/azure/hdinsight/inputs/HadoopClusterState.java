// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.azure.hdinsight.inputs.HadoopClusterComponentVersionArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterGatewayArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterMonitorArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterNetworkArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterSecurityProfileArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountArgs;
import com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountGen2Args;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HadoopClusterState extends com.pulumi.resources.ResourceArgs {

    public static final HadoopClusterState Empty = new HadoopClusterState();

    /**
     * Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="clusterVersion")
    private @Nullable Output<String> clusterVersion;

    /**
     * @return Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> clusterVersion() {
        return Optional.ofNullable(this.clusterVersion);
    }

    /**
     * A `component_version` block as defined below.
     * 
     */
    @Import(name="componentVersion")
    private @Nullable Output<HadoopClusterComponentVersionArgs> componentVersion;

    /**
     * @return A `component_version` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterComponentVersionArgs>> componentVersion() {
        return Optional.ofNullable(this.componentVersion);
    }

    /**
     * A `gateway` block as defined below.
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<HadoopClusterGatewayArgs> gateway;

    /**
     * @return A `gateway` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterGatewayArgs>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    /**
     * The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster.
     * 
     */
    @Import(name="httpsEndpoint")
    private @Nullable Output<String> httpsEndpoint;

    /**
     * @return The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster.
     * 
     */
    public Optional<Output<String>> httpsEndpoint() {
        return Optional.ofNullable(this.httpsEndpoint);
    }

    /**
     * Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * A `metastores` block as defined below.
     * 
     */
    @Import(name="metastores")
    private @Nullable Output<HadoopClusterMetastoresArgs> metastores;

    /**
     * @return A `metastores` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterMetastoresArgs>> metastores() {
        return Optional.ofNullable(this.metastores);
    }

    /**
     * A `monitor` block as defined below.
     * 
     */
    @Import(name="monitor")
    private @Nullable Output<HadoopClusterMonitorArgs> monitor;

    /**
     * @return A `monitor` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterMonitorArgs>> monitor() {
        return Optional.ofNullable(this.monitor);
    }

    /**
     * Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A `network` block as defined below.
     * 
     */
    @Import(name="network")
    private @Nullable Output<HadoopClusterNetworkArgs> network;

    /**
     * @return A `network` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterNetworkArgs>> network() {
        return Optional.ofNullable(this.network);
    }

    /**
     * Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * A `roles` block as defined below.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<HadoopClusterRolesArgs> roles;

    /**
     * @return A `roles` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterRolesArgs>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * A `security_profile` block as defined below.
     * 
     */
    @Import(name="securityProfile")
    private @Nullable Output<HadoopClusterSecurityProfileArgs> securityProfile;

    /**
     * @return A `security_profile` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterSecurityProfileArgs>> securityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }

    /**
     * The SSH Connectivity Endpoint for this HDInsight Hadoop Cluster.
     * 
     */
    @Import(name="sshEndpoint")
    private @Nullable Output<String> sshEndpoint;

    /**
     * @return The SSH Connectivity Endpoint for this HDInsight Hadoop Cluster.
     * 
     */
    public Optional<Output<String>> sshEndpoint() {
        return Optional.ofNullable(this.sshEndpoint);
    }

    /**
     * A `storage_account_gen2` block as defined below.
     * 
     */
    @Import(name="storageAccountGen2")
    private @Nullable Output<HadoopClusterStorageAccountGen2Args> storageAccountGen2;

    /**
     * @return A `storage_account_gen2` block as defined below.
     * 
     */
    public Optional<Output<HadoopClusterStorageAccountGen2Args>> storageAccountGen2() {
        return Optional.ofNullable(this.storageAccountGen2);
    }

    /**
     * One or more `storage_account` block as defined below.
     * 
     */
    @Import(name="storageAccounts")
    private @Nullable Output<List<HadoopClusterStorageAccountArgs>> storageAccounts;

    /**
     * @return One or more `storage_account` block as defined below.
     * 
     */
    public Optional<Output<List<HadoopClusterStorageAccountArgs>>> storageAccounts() {
        return Optional.ofNullable(this.storageAccounts);
    }

    /**
     * A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<String> tier;

    /**
     * @return Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> tier() {
        return Optional.ofNullable(this.tier);
    }

    @Import(name="tlsMinVersion")
    private @Nullable Output<String> tlsMinVersion;

    public Optional<Output<String>> tlsMinVersion() {
        return Optional.ofNullable(this.tlsMinVersion);
    }

    private HadoopClusterState() {}

    private HadoopClusterState(HadoopClusterState $) {
        this.clusterVersion = $.clusterVersion;
        this.componentVersion = $.componentVersion;
        this.gateway = $.gateway;
        this.httpsEndpoint = $.httpsEndpoint;
        this.location = $.location;
        this.metastores = $.metastores;
        this.monitor = $.monitor;
        this.name = $.name;
        this.network = $.network;
        this.resourceGroupName = $.resourceGroupName;
        this.roles = $.roles;
        this.securityProfile = $.securityProfile;
        this.sshEndpoint = $.sshEndpoint;
        this.storageAccountGen2 = $.storageAccountGen2;
        this.storageAccounts = $.storageAccounts;
        this.tags = $.tags;
        this.tier = $.tier;
        this.tlsMinVersion = $.tlsMinVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HadoopClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopClusterState $;

        public Builder() {
            $ = new HadoopClusterState();
        }

        public Builder(HadoopClusterState defaults) {
            $ = new HadoopClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterVersion Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(@Nullable Output<String> clusterVersion) {
            $.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * @param clusterVersion Specifies the Version of HDInsights which should be used for this Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(String clusterVersion) {
            return clusterVersion(Output.of(clusterVersion));
        }

        /**
         * @param componentVersion A `component_version` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(@Nullable Output<HadoopClusterComponentVersionArgs> componentVersion) {
            $.componentVersion = componentVersion;
            return this;
        }

        /**
         * @param componentVersion A `component_version` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder componentVersion(HadoopClusterComponentVersionArgs componentVersion) {
            return componentVersion(Output.of(componentVersion));
        }

        /**
         * @param gateway A `gateway` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<HadoopClusterGatewayArgs> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway A `gateway` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder gateway(HadoopClusterGatewayArgs gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param httpsEndpoint The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoint(@Nullable Output<String> httpsEndpoint) {
            $.httpsEndpoint = httpsEndpoint;
            return this;
        }

        /**
         * @param httpsEndpoint The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster.
         * 
         * @return builder
         * 
         */
        public Builder httpsEndpoint(String httpsEndpoint) {
            return httpsEndpoint(Output.of(httpsEndpoint));
        }

        /**
         * @param location Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the Azure Region which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metastores A `metastores` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder metastores(@Nullable Output<HadoopClusterMetastoresArgs> metastores) {
            $.metastores = metastores;
            return this;
        }

        /**
         * @param metastores A `metastores` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder metastores(HadoopClusterMetastoresArgs metastores) {
            return metastores(Output.of(metastores));
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(@Nullable Output<HadoopClusterMonitorArgs> monitor) {
            $.monitor = monitor;
            return this;
        }

        /**
         * @param monitor A `monitor` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder monitor(HadoopClusterMonitorArgs monitor) {
            return monitor(Output.of(monitor));
        }

        /**
         * @param name Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name for this HDInsight Hadoop Cluster. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network A `network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder network(@Nullable Output<HadoopClusterNetworkArgs> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network A `network` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder network(HadoopClusterNetworkArgs network) {
            return network(Output.of(network));
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the Resource Group in which this HDInsight Hadoop Cluster should exist. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param roles A `roles` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<HadoopClusterRolesArgs> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles A `roles` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder roles(HadoopClusterRolesArgs roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param securityProfile A `security_profile` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(@Nullable Output<HadoopClusterSecurityProfileArgs> securityProfile) {
            $.securityProfile = securityProfile;
            return this;
        }

        /**
         * @param securityProfile A `security_profile` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder securityProfile(HadoopClusterSecurityProfileArgs securityProfile) {
            return securityProfile(Output.of(securityProfile));
        }

        /**
         * @param sshEndpoint The SSH Connectivity Endpoint for this HDInsight Hadoop Cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoint(@Nullable Output<String> sshEndpoint) {
            $.sshEndpoint = sshEndpoint;
            return this;
        }

        /**
         * @param sshEndpoint The SSH Connectivity Endpoint for this HDInsight Hadoop Cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshEndpoint(String sshEndpoint) {
            return sshEndpoint(Output.of(sshEndpoint));
        }

        /**
         * @param storageAccountGen2 A `storage_account_gen2` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountGen2(@Nullable Output<HadoopClusterStorageAccountGen2Args> storageAccountGen2) {
            $.storageAccountGen2 = storageAccountGen2;
            return this;
        }

        /**
         * @param storageAccountGen2 A `storage_account_gen2` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountGen2(HadoopClusterStorageAccountGen2Args storageAccountGen2) {
            return storageAccountGen2(Output.of(storageAccountGen2));
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(@Nullable Output<List<HadoopClusterStorageAccountArgs>> storageAccounts) {
            $.storageAccounts = storageAccounts;
            return this;
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(List<HadoopClusterStorageAccountArgs> storageAccounts) {
            return storageAccounts(Output.of(storageAccounts));
        }

        /**
         * @param storageAccounts One or more `storage_account` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder storageAccounts(HadoopClusterStorageAccountArgs... storageAccounts) {
            return storageAccounts(List.of(storageAccounts));
        }

        /**
         * @param tags A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of Tags which should be assigned to this HDInsight Hadoop Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tier Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tier(@Nullable Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier Specifies the Tier which should be used for this HDInsight Hadoop Cluster. Possible values are `Standard` or `Premium`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public Builder tlsMinVersion(@Nullable Output<String> tlsMinVersion) {
            $.tlsMinVersion = tlsMinVersion;
            return this;
        }

        public Builder tlsMinVersion(String tlsMinVersion) {
            return tlsMinVersion(Output.of(tlsMinVersion));
        }

        public HadoopClusterState build() {
            return $;
        }
    }

}
