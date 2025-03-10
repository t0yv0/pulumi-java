// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.outputs;

import com.pulumi.azurenative.aad.outputs.DomainSecuritySettingsResponse;
import com.pulumi.azurenative.aad.outputs.LdapsSettingsResponse;
import com.pulumi.azurenative.aad.outputs.MigrationPropertiesResponse;
import com.pulumi.azurenative.aad.outputs.NotificationSettingsResponse;
import com.pulumi.azurenative.aad.outputs.ReplicaSetResponse;
import com.pulumi.azurenative.aad.outputs.ResourceForestSettingsResponse;
import com.pulumi.azurenative.aad.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainServiceResult {
    /**
     * @return Deployment Id
     * 
     */
    private final String deploymentId;
    /**
     * @return Domain Configuration Type
     * 
     */
    private final @Nullable String domainConfigurationType;
    /**
     * @return The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
     */
    private final @Nullable String domainName;
    /**
     * @return DomainSecurity Settings
     * 
     */
    private final @Nullable DomainSecuritySettingsResponse domainSecuritySettings;
    /**
     * @return Resource etag
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    private final @Nullable String filteredSync;
    /**
     * @return Resource Id
     * 
     */
    private final String id;
    /**
     * @return Secure LDAP Settings
     * 
     */
    private final @Nullable LdapsSettingsResponse ldapsSettings;
    /**
     * @return Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * @return Migration Properties
     * 
     */
    private final MigrationPropertiesResponse migrationProperties;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Notification Settings
     * 
     */
    private final @Nullable NotificationSettingsResponse notificationSettings;
    /**
     * @return the current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * @return List of ReplicaSets
     * 
     */
    private final @Nullable List<ReplicaSetResponse> replicaSets;
    /**
     * @return Resource Forest Settings
     * 
     */
    private final @Nullable ResourceForestSettingsResponse resourceForestSettings;
    /**
     * @return Sku Type
     * 
     */
    private final @Nullable String sku;
    /**
     * @return SyncOwner ReplicaSet Id
     * 
     */
    private final String syncOwner;
    /**
     * @return The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Azure Active Directory Tenant Id
     * 
     */
    private final String tenantId;
    /**
     * @return Resource type
     * 
     */
    private final String type;
    /**
     * @return Data Model Version
     * 
     */
    private final Integer version;

    @CustomType.Constructor
    private GetDomainServiceResult(
        @CustomType.Parameter("deploymentId") String deploymentId,
        @CustomType.Parameter("domainConfigurationType") @Nullable String domainConfigurationType,
        @CustomType.Parameter("domainName") @Nullable String domainName,
        @CustomType.Parameter("domainSecuritySettings") @Nullable DomainSecuritySettingsResponse domainSecuritySettings,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("filteredSync") @Nullable String filteredSync,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ldapsSettings") @Nullable LdapsSettingsResponse ldapsSettings,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("migrationProperties") MigrationPropertiesResponse migrationProperties,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationSettings") @Nullable NotificationSettingsResponse notificationSettings,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("replicaSets") @Nullable List<ReplicaSetResponse> replicaSets,
        @CustomType.Parameter("resourceForestSettings") @Nullable ResourceForestSettingsResponse resourceForestSettings,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("syncOwner") String syncOwner,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") Integer version) {
        this.deploymentId = deploymentId;
        this.domainConfigurationType = domainConfigurationType;
        this.domainName = domainName;
        this.domainSecuritySettings = domainSecuritySettings;
        this.etag = etag;
        this.filteredSync = filteredSync;
        this.id = id;
        this.ldapsSettings = ldapsSettings;
        this.location = location;
        this.migrationProperties = migrationProperties;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.provisioningState = provisioningState;
        this.replicaSets = replicaSets;
        this.resourceForestSettings = resourceForestSettings;
        this.sku = sku;
        this.syncOwner = syncOwner;
        this.systemData = systemData;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Deployment Id
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }
    /**
     * @return Domain Configuration Type
     * 
     */
    public Optional<String> domainConfigurationType() {
        return Optional.ofNullable(this.domainConfigurationType);
    }
    /**
     * @return The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
     */
    public Optional<String> domainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * @return DomainSecurity Settings
     * 
     */
    public Optional<DomainSecuritySettingsResponse> domainSecuritySettings() {
        return Optional.ofNullable(this.domainSecuritySettings);
    }
    /**
     * @return Resource etag
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    public Optional<String> filteredSync() {
        return Optional.ofNullable(this.filteredSync);
    }
    /**
     * @return Resource Id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Secure LDAP Settings
     * 
     */
    public Optional<LdapsSettingsResponse> ldapsSettings() {
        return Optional.ofNullable(this.ldapsSettings);
    }
    /**
     * @return Resource location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Migration Properties
     * 
     */
    public MigrationPropertiesResponse migrationProperties() {
        return this.migrationProperties;
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Notification Settings
     * 
     */
    public Optional<NotificationSettingsResponse> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    /**
     * @return the current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return List of ReplicaSets
     * 
     */
    public List<ReplicaSetResponse> replicaSets() {
        return this.replicaSets == null ? List.of() : this.replicaSets;
    }
    /**
     * @return Resource Forest Settings
     * 
     */
    public Optional<ResourceForestSettingsResponse> resourceForestSettings() {
        return Optional.ofNullable(this.resourceForestSettings);
    }
    /**
     * @return Sku Type
     * 
     */
    public Optional<String> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * @return SyncOwner ReplicaSet Id
     * 
     */
    public String syncOwner() {
        return this.syncOwner;
    }
    /**
     * @return The system meta data relating to this resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Azure Active Directory Tenant Id
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Data Model Version
     * 
     */
    public Integer version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentId;
        private @Nullable String domainConfigurationType;
        private @Nullable String domainName;
        private @Nullable DomainSecuritySettingsResponse domainSecuritySettings;
        private @Nullable String etag;
        private @Nullable String filteredSync;
        private String id;
        private @Nullable LdapsSettingsResponse ldapsSettings;
        private @Nullable String location;
        private MigrationPropertiesResponse migrationProperties;
        private String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private String provisioningState;
        private @Nullable List<ReplicaSetResponse> replicaSets;
        private @Nullable ResourceForestSettingsResponse resourceForestSettings;
        private @Nullable String sku;
        private String syncOwner;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.domainConfigurationType = defaults.domainConfigurationType;
    	      this.domainName = defaults.domainName;
    	      this.domainSecuritySettings = defaults.domainSecuritySettings;
    	      this.etag = defaults.etag;
    	      this.filteredSync = defaults.filteredSync;
    	      this.id = defaults.id;
    	      this.ldapsSettings = defaults.ldapsSettings;
    	      this.location = defaults.location;
    	      this.migrationProperties = defaults.migrationProperties;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.replicaSets = defaults.replicaSets;
    	      this.resourceForestSettings = defaults.resourceForestSettings;
    	      this.sku = defaults.sku;
    	      this.syncOwner = defaults.syncOwner;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }
        public Builder domainConfigurationType(@Nullable String domainConfigurationType) {
            this.domainConfigurationType = domainConfigurationType;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainSecuritySettings(@Nullable DomainSecuritySettingsResponse domainSecuritySettings) {
            this.domainSecuritySettings = domainSecuritySettings;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder filteredSync(@Nullable String filteredSync) {
            this.filteredSync = filteredSync;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ldapsSettings(@Nullable LdapsSettingsResponse ldapsSettings) {
            this.ldapsSettings = ldapsSettings;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder migrationProperties(MigrationPropertiesResponse migrationProperties) {
            this.migrationProperties = Objects.requireNonNull(migrationProperties);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder replicaSets(@Nullable List<ReplicaSetResponse> replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }
        public Builder replicaSets(ReplicaSetResponse... replicaSets) {
            return replicaSets(List.of(replicaSets));
        }
        public Builder resourceForestSettings(@Nullable ResourceForestSettingsResponse resourceForestSettings) {
            this.resourceForestSettings = resourceForestSettings;
            return this;
        }
        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }
        public Builder syncOwner(String syncOwner) {
            this.syncOwner = Objects.requireNonNull(syncOwner);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetDomainServiceResult build() {
            return new GetDomainServiceResult(deploymentId, domainConfigurationType, domainName, domainSecuritySettings, etag, filteredSync, id, ldapsSettings, location, migrationProperties, name, notificationSettings, provisioningState, replicaSets, resourceForestSettings, sku, syncOwner, systemData, tags, tenantId, type, version);
        }
    }
}
