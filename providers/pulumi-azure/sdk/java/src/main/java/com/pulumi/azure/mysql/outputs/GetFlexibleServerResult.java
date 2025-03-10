// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.outputs;

import com.pulumi.azure.mysql.outputs.GetFlexibleServerHighAvailability;
import com.pulumi.azure.mysql.outputs.GetFlexibleServerMaintenanceWindow;
import com.pulumi.azure.mysql.outputs.GetFlexibleServerStorage;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFlexibleServerResult {
    /**
     * @return The Administrator Login of the MySQL Flexible Server.
     * 
     */
    private final String administratorLogin;
    /**
     * @return The backup retention days of the MySQL Flexible Server.
     * 
     */
    private final Integer backupRetentionDays;
    /**
     * @return The ID of the virtual network subnet the MySQL Flexible Server is created in.
     * 
     */
    private final String delegatedSubnetId;
    /**
     * @return The fully qualified domain name of the MySQL Flexible Server.
     * 
     */
    private final String fqdn;
    /**
     * @return Is geo redundant backup enabled?
     * 
     */
    private final Boolean geoRedundantBackupEnabled;
    /**
     * @return A `high_availability` block for this MySQL Flexible Server as defined below.
     * 
     */
    private final List<GetFlexibleServerHighAvailability> highAvailabilities;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure Region of the MySQL Flexible Server.
     * 
     */
    private final String location;
    /**
     * @return A `maintenance_window` block for this MySQL Flexible Server as defined below.
     * 
     */
    private final List<GetFlexibleServerMaintenanceWindow> maintenanceWindows;
    private final String name;
    /**
     * @return The ID of the Private DNS zone of the MySQL Flexible Server.
     * 
     */
    private final String privateDnsZoneId;
    /**
     * @return Is the public network access enabled?
     * 
     */
    private final Boolean publicNetworkAccessEnabled;
    /**
     * @return The maximum number of replicas that a primary MySQL Flexible Server can have.
     * 
     */
    private final Integer replicaCapacity;
    /**
     * @return The replication role of the MySQL Flexible Server.
     * 
     */
    private final String replicationRole;
    private final String resourceGroupName;
    private final String restorePointInTime;
    /**
     * @return The SKU Name of the MySQL Flexible Server.
     * 
     */
    private final String skuName;
    /**
     * @return A `storage` block for this MySQL Flexible Server as defined below.
     * 
     */
    private final List<GetFlexibleServerStorage> storages;
    /**
     * @return A mapping of tags which are assigned to the MySQL Flexible Server.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The version of the MySQL Flexible Server.
     * 
     */
    private final String version;
    /**
     * @return The Availability Zones where this MySQL Flexible Server is located.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private GetFlexibleServerResult(
        @CustomType.Parameter("administratorLogin") String administratorLogin,
        @CustomType.Parameter("backupRetentionDays") Integer backupRetentionDays,
        @CustomType.Parameter("delegatedSubnetId") String delegatedSubnetId,
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("geoRedundantBackupEnabled") Boolean geoRedundantBackupEnabled,
        @CustomType.Parameter("highAvailabilities") List<GetFlexibleServerHighAvailability> highAvailabilities,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maintenanceWindows") List<GetFlexibleServerMaintenanceWindow> maintenanceWindows,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateDnsZoneId") String privateDnsZoneId,
        @CustomType.Parameter("publicNetworkAccessEnabled") Boolean publicNetworkAccessEnabled,
        @CustomType.Parameter("replicaCapacity") Integer replicaCapacity,
        @CustomType.Parameter("replicationRole") String replicationRole,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("restorePointInTime") String restorePointInTime,
        @CustomType.Parameter("skuName") String skuName,
        @CustomType.Parameter("storages") List<GetFlexibleServerStorage> storages,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("zone") String zone) {
        this.administratorLogin = administratorLogin;
        this.backupRetentionDays = backupRetentionDays;
        this.delegatedSubnetId = delegatedSubnetId;
        this.fqdn = fqdn;
        this.geoRedundantBackupEnabled = geoRedundantBackupEnabled;
        this.highAvailabilities = highAvailabilities;
        this.id = id;
        this.location = location;
        this.maintenanceWindows = maintenanceWindows;
        this.name = name;
        this.privateDnsZoneId = privateDnsZoneId;
        this.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
        this.replicaCapacity = replicaCapacity;
        this.replicationRole = replicationRole;
        this.resourceGroupName = resourceGroupName;
        this.restorePointInTime = restorePointInTime;
        this.skuName = skuName;
        this.storages = storages;
        this.tags = tags;
        this.version = version;
        this.zone = zone;
    }

    /**
     * @return The Administrator Login of the MySQL Flexible Server.
     * 
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }
    /**
     * @return The backup retention days of the MySQL Flexible Server.
     * 
     */
    public Integer backupRetentionDays() {
        return this.backupRetentionDays;
    }
    /**
     * @return The ID of the virtual network subnet the MySQL Flexible Server is created in.
     * 
     */
    public String delegatedSubnetId() {
        return this.delegatedSubnetId;
    }
    /**
     * @return The fully qualified domain name of the MySQL Flexible Server.
     * 
     */
    public String fqdn() {
        return this.fqdn;
    }
    /**
     * @return Is geo redundant backup enabled?
     * 
     */
    public Boolean geoRedundantBackupEnabled() {
        return this.geoRedundantBackupEnabled;
    }
    /**
     * @return A `high_availability` block for this MySQL Flexible Server as defined below.
     * 
     */
    public List<GetFlexibleServerHighAvailability> highAvailabilities() {
        return this.highAvailabilities;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region of the MySQL Flexible Server.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return A `maintenance_window` block for this MySQL Flexible Server as defined below.
     * 
     */
    public List<GetFlexibleServerMaintenanceWindow> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the Private DNS zone of the MySQL Flexible Server.
     * 
     */
    public String privateDnsZoneId() {
        return this.privateDnsZoneId;
    }
    /**
     * @return Is the public network access enabled?
     * 
     */
    public Boolean publicNetworkAccessEnabled() {
        return this.publicNetworkAccessEnabled;
    }
    /**
     * @return The maximum number of replicas that a primary MySQL Flexible Server can have.
     * 
     */
    public Integer replicaCapacity() {
        return this.replicaCapacity;
    }
    /**
     * @return The replication role of the MySQL Flexible Server.
     * 
     */
    public String replicationRole() {
        return this.replicationRole;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String restorePointInTime() {
        return this.restorePointInTime;
    }
    /**
     * @return The SKU Name of the MySQL Flexible Server.
     * 
     */
    public String skuName() {
        return this.skuName;
    }
    /**
     * @return A `storage` block for this MySQL Flexible Server as defined below.
     * 
     */
    public List<GetFlexibleServerStorage> storages() {
        return this.storages;
    }
    /**
     * @return A mapping of tags which are assigned to the MySQL Flexible Server.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The version of the MySQL Flexible Server.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return The Availability Zones where this MySQL Flexible Server is located.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlexibleServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorLogin;
        private Integer backupRetentionDays;
        private String delegatedSubnetId;
        private String fqdn;
        private Boolean geoRedundantBackupEnabled;
        private List<GetFlexibleServerHighAvailability> highAvailabilities;
        private String id;
        private String location;
        private List<GetFlexibleServerMaintenanceWindow> maintenanceWindows;
        private String name;
        private String privateDnsZoneId;
        private Boolean publicNetworkAccessEnabled;
        private Integer replicaCapacity;
        private String replicationRole;
        private String resourceGroupName;
        private String restorePointInTime;
        private String skuName;
        private List<GetFlexibleServerStorage> storages;
        private Map<String,String> tags;
        private String version;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlexibleServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorLogin = defaults.administratorLogin;
    	      this.backupRetentionDays = defaults.backupRetentionDays;
    	      this.delegatedSubnetId = defaults.delegatedSubnetId;
    	      this.fqdn = defaults.fqdn;
    	      this.geoRedundantBackupEnabled = defaults.geoRedundantBackupEnabled;
    	      this.highAvailabilities = defaults.highAvailabilities;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.name = defaults.name;
    	      this.privateDnsZoneId = defaults.privateDnsZoneId;
    	      this.publicNetworkAccessEnabled = defaults.publicNetworkAccessEnabled;
    	      this.replicaCapacity = defaults.replicaCapacity;
    	      this.replicationRole = defaults.replicationRole;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.skuName = defaults.skuName;
    	      this.storages = defaults.storages;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.zone = defaults.zone;
        }

        public Builder administratorLogin(String administratorLogin) {
            this.administratorLogin = Objects.requireNonNull(administratorLogin);
            return this;
        }
        public Builder backupRetentionDays(Integer backupRetentionDays) {
            this.backupRetentionDays = Objects.requireNonNull(backupRetentionDays);
            return this;
        }
        public Builder delegatedSubnetId(String delegatedSubnetId) {
            this.delegatedSubnetId = Objects.requireNonNull(delegatedSubnetId);
            return this;
        }
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder geoRedundantBackupEnabled(Boolean geoRedundantBackupEnabled) {
            this.geoRedundantBackupEnabled = Objects.requireNonNull(geoRedundantBackupEnabled);
            return this;
        }
        public Builder highAvailabilities(List<GetFlexibleServerHighAvailability> highAvailabilities) {
            this.highAvailabilities = Objects.requireNonNull(highAvailabilities);
            return this;
        }
        public Builder highAvailabilities(GetFlexibleServerHighAvailability... highAvailabilities) {
            return highAvailabilities(List.of(highAvailabilities));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maintenanceWindows(List<GetFlexibleServerMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }
        public Builder maintenanceWindows(GetFlexibleServerMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateDnsZoneId(String privateDnsZoneId) {
            this.privateDnsZoneId = Objects.requireNonNull(privateDnsZoneId);
            return this;
        }
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            this.publicNetworkAccessEnabled = Objects.requireNonNull(publicNetworkAccessEnabled);
            return this;
        }
        public Builder replicaCapacity(Integer replicaCapacity) {
            this.replicaCapacity = Objects.requireNonNull(replicaCapacity);
            return this;
        }
        public Builder replicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder restorePointInTime(String restorePointInTime) {
            this.restorePointInTime = Objects.requireNonNull(restorePointInTime);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder storages(List<GetFlexibleServerStorage> storages) {
            this.storages = Objects.requireNonNull(storages);
            return this;
        }
        public Builder storages(GetFlexibleServerStorage... storages) {
            return storages(List.of(storages));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetFlexibleServerResult build() {
            return new GetFlexibleServerResult(administratorLogin, backupRetentionDays, delegatedSubnetId, fqdn, geoRedundantBackupEnabled, highAvailabilities, id, location, maintenanceWindows, name, privateDnsZoneId, publicNetworkAccessEnabled, replicaCapacity, replicationRole, resourceGroupName, restorePointInTime, skuName, storages, tags, version, zone);
        }
    }
}
