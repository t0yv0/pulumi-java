// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.azure.cosmosdb.outputs.GetAccountCapability;
import com.pulumi.azure.cosmosdb.outputs.GetAccountConsistencyPolicy;
import com.pulumi.azure.cosmosdb.outputs.GetAccountGeoLocation;
import com.pulumi.azure.cosmosdb.outputs.GetAccountVirtualNetworkRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAccountResult {
    /**
     * @return Capabilities enabled on this Cosmos DB account.
     * 
     */
    private final List<GetAccountCapability> capabilities;
    private final List<GetAccountConsistencyPolicy> consistencyPolicies;
    /**
     * @return If automatic failover is enabled for this CosmosDB Account.
     * 
     */
    private final Boolean enableAutomaticFailover;
    /**
     * @return If Free Tier pricing option is enabled for this CosmosDB Account. You can have up to one free tier Azure Cosmos DB account per Azure subscription.
     * 
     */
    private final Boolean enableFreeTier;
    /**
     * @return If multiple write locations are enabled for this Cosmos DB account.
     * 
     */
    private final Boolean enableMultipleWriteLocations;
    /**
     * @return The endpoint used to connect to the CosmosDB account.
     * 
     */
    private final String endpoint;
    private final List<GetAccountGeoLocation> geoLocations;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current IP Filter for this CosmosDB account
     * 
     */
    private final String ipRangeFilter;
    /**
     * @return If virtual network filtering is enabled for this Cosmos DB account.
     * 
     */
    private final Boolean isVirtualNetworkFilterEnabled;
    /**
     * @return The Key Vault key URI for CMK encryption.
     * 
     */
    private final String keyVaultKeyId;
    /**
     * @return The Kind of the CosmosDB account.
     * 
     */
    private final String kind;
    /**
     * @return The name of the Azure region hosting replicated data.
     * 
     */
    private final String location;
    private final String name;
    /**
     * @return The Offer Type to used by this CosmosDB Account.
     * 
     */
    private final String offerType;
    /**
     * @return The Primary key for the CosmosDB Account.
     * 
     */
    private final String primaryKey;
    /**
     * @return The Primary read-only Key for the CosmosDB Account.
     * 
     */
    private final String primaryReadonlyKey;
    /**
     * @return A list of read endpoints available for this CosmosDB account.
     * 
     */
    private final List<String> readEndpoints;
    private final String resourceGroupName;
    /**
     * @return The Secondary key for the CosmosDB Account.
     * 
     */
    private final String secondaryKey;
    /**
     * @return The Secondary read-only key for the CosmosDB Account.
     * 
     */
    private final String secondaryReadonlyKey;
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return Subnets that are allowed to access this CosmosDB account.
     * 
     */
    private final List<GetAccountVirtualNetworkRule> virtualNetworkRules;
    /**
     * @return A list of write endpoints available for this CosmosDB account.
     * 
     */
    private final List<String> writeEndpoints;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("capabilities") List<GetAccountCapability> capabilities,
        @CustomType.Parameter("consistencyPolicies") List<GetAccountConsistencyPolicy> consistencyPolicies,
        @CustomType.Parameter("enableAutomaticFailover") Boolean enableAutomaticFailover,
        @CustomType.Parameter("enableFreeTier") Boolean enableFreeTier,
        @CustomType.Parameter("enableMultipleWriteLocations") Boolean enableMultipleWriteLocations,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("geoLocations") List<GetAccountGeoLocation> geoLocations,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipRangeFilter") String ipRangeFilter,
        @CustomType.Parameter("isVirtualNetworkFilterEnabled") Boolean isVirtualNetworkFilterEnabled,
        @CustomType.Parameter("keyVaultKeyId") String keyVaultKeyId,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offerType") String offerType,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("primaryReadonlyKey") String primaryReadonlyKey,
        @CustomType.Parameter("readEndpoints") List<String> readEndpoints,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("secondaryKey") String secondaryKey,
        @CustomType.Parameter("secondaryReadonlyKey") String secondaryReadonlyKey,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("virtualNetworkRules") List<GetAccountVirtualNetworkRule> virtualNetworkRules,
        @CustomType.Parameter("writeEndpoints") List<String> writeEndpoints) {
        this.capabilities = capabilities;
        this.consistencyPolicies = consistencyPolicies;
        this.enableAutomaticFailover = enableAutomaticFailover;
        this.enableFreeTier = enableFreeTier;
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        this.endpoint = endpoint;
        this.geoLocations = geoLocations;
        this.id = id;
        this.ipRangeFilter = ipRangeFilter;
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        this.keyVaultKeyId = keyVaultKeyId;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.offerType = offerType;
        this.primaryKey = primaryKey;
        this.primaryReadonlyKey = primaryReadonlyKey;
        this.readEndpoints = readEndpoints;
        this.resourceGroupName = resourceGroupName;
        this.secondaryKey = secondaryKey;
        this.secondaryReadonlyKey = secondaryReadonlyKey;
        this.tags = tags;
        this.virtualNetworkRules = virtualNetworkRules;
        this.writeEndpoints = writeEndpoints;
    }

    /**
     * @return Capabilities enabled on this Cosmos DB account.
     * 
     */
    public List<GetAccountCapability> capabilities() {
        return this.capabilities;
    }
    public List<GetAccountConsistencyPolicy> consistencyPolicies() {
        return this.consistencyPolicies;
    }
    /**
     * @return If automatic failover is enabled for this CosmosDB Account.
     * 
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }
    /**
     * @return If Free Tier pricing option is enabled for this CosmosDB Account. You can have up to one free tier Azure Cosmos DB account per Azure subscription.
     * 
     */
    public Boolean enableFreeTier() {
        return this.enableFreeTier;
    }
    /**
     * @return If multiple write locations are enabled for this Cosmos DB account.
     * 
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }
    /**
     * @return The endpoint used to connect to the CosmosDB account.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    public List<GetAccountGeoLocation> geoLocations() {
        return this.geoLocations;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The current IP Filter for this CosmosDB account
     * 
     */
    public String ipRangeFilter() {
        return this.ipRangeFilter;
    }
    /**
     * @return If virtual network filtering is enabled for this Cosmos DB account.
     * 
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }
    /**
     * @return The Key Vault key URI for CMK encryption.
     * 
     */
    public String keyVaultKeyId() {
        return this.keyVaultKeyId;
    }
    /**
     * @return The Kind of the CosmosDB account.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return The name of the Azure region hosting replicated data.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The Offer Type to used by this CosmosDB Account.
     * 
     */
    public String offerType() {
        return this.offerType;
    }
    /**
     * @return The Primary key for the CosmosDB Account.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    /**
     * @return The Primary read-only Key for the CosmosDB Account.
     * 
     */
    public String primaryReadonlyKey() {
        return this.primaryReadonlyKey;
    }
    /**
     * @return A list of read endpoints available for this CosmosDB account.
     * 
     */
    public List<String> readEndpoints() {
        return this.readEndpoints;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The Secondary key for the CosmosDB Account.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }
    /**
     * @return The Secondary read-only key for the CosmosDB Account.
     * 
     */
    public String secondaryReadonlyKey() {
        return this.secondaryReadonlyKey;
    }
    /**
     * @return A mapping of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Subnets that are allowed to access this CosmosDB account.
     * 
     */
    public List<GetAccountVirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }
    /**
     * @return A list of write endpoints available for this CosmosDB account.
     * 
     */
    public List<String> writeEndpoints() {
        return this.writeEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAccountCapability> capabilities;
        private List<GetAccountConsistencyPolicy> consistencyPolicies;
        private Boolean enableAutomaticFailover;
        private Boolean enableFreeTier;
        private Boolean enableMultipleWriteLocations;
        private String endpoint;
        private List<GetAccountGeoLocation> geoLocations;
        private String id;
        private String ipRangeFilter;
        private Boolean isVirtualNetworkFilterEnabled;
        private String keyVaultKeyId;
        private String kind;
        private String location;
        private String name;
        private String offerType;
        private String primaryKey;
        private String primaryReadonlyKey;
        private List<String> readEndpoints;
        private String resourceGroupName;
        private String secondaryKey;
        private String secondaryReadonlyKey;
        private Map<String,String> tags;
        private List<GetAccountVirtualNetworkRule> virtualNetworkRules;
        private List<String> writeEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.consistencyPolicies = defaults.consistencyPolicies;
    	      this.enableAutomaticFailover = defaults.enableAutomaticFailover;
    	      this.enableFreeTier = defaults.enableFreeTier;
    	      this.enableMultipleWriteLocations = defaults.enableMultipleWriteLocations;
    	      this.endpoint = defaults.endpoint;
    	      this.geoLocations = defaults.geoLocations;
    	      this.id = defaults.id;
    	      this.ipRangeFilter = defaults.ipRangeFilter;
    	      this.isVirtualNetworkFilterEnabled = defaults.isVirtualNetworkFilterEnabled;
    	      this.keyVaultKeyId = defaults.keyVaultKeyId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.offerType = defaults.offerType;
    	      this.primaryKey = defaults.primaryKey;
    	      this.primaryReadonlyKey = defaults.primaryReadonlyKey;
    	      this.readEndpoints = defaults.readEndpoints;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.secondaryReadonlyKey = defaults.secondaryReadonlyKey;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
    	      this.writeEndpoints = defaults.writeEndpoints;
        }

        public Builder capabilities(List<GetAccountCapability> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }
        public Builder capabilities(GetAccountCapability... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder consistencyPolicies(List<GetAccountConsistencyPolicy> consistencyPolicies) {
            this.consistencyPolicies = Objects.requireNonNull(consistencyPolicies);
            return this;
        }
        public Builder consistencyPolicies(GetAccountConsistencyPolicy... consistencyPolicies) {
            return consistencyPolicies(List.of(consistencyPolicies));
        }
        public Builder enableAutomaticFailover(Boolean enableAutomaticFailover) {
            this.enableAutomaticFailover = Objects.requireNonNull(enableAutomaticFailover);
            return this;
        }
        public Builder enableFreeTier(Boolean enableFreeTier) {
            this.enableFreeTier = Objects.requireNonNull(enableFreeTier);
            return this;
        }
        public Builder enableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
            this.enableMultipleWriteLocations = Objects.requireNonNull(enableMultipleWriteLocations);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder geoLocations(List<GetAccountGeoLocation> geoLocations) {
            this.geoLocations = Objects.requireNonNull(geoLocations);
            return this;
        }
        public Builder geoLocations(GetAccountGeoLocation... geoLocations) {
            return geoLocations(List.of(geoLocations));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipRangeFilter(String ipRangeFilter) {
            this.ipRangeFilter = Objects.requireNonNull(ipRangeFilter);
            return this;
        }
        public Builder isVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
            this.isVirtualNetworkFilterEnabled = Objects.requireNonNull(isVirtualNetworkFilterEnabled);
            return this;
        }
        public Builder keyVaultKeyId(String keyVaultKeyId) {
            this.keyVaultKeyId = Objects.requireNonNull(keyVaultKeyId);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder offerType(String offerType) {
            this.offerType = Objects.requireNonNull(offerType);
            return this;
        }
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder primaryReadonlyKey(String primaryReadonlyKey) {
            this.primaryReadonlyKey = Objects.requireNonNull(primaryReadonlyKey);
            return this;
        }
        public Builder readEndpoints(List<String> readEndpoints) {
            this.readEndpoints = Objects.requireNonNull(readEndpoints);
            return this;
        }
        public Builder readEndpoints(String... readEndpoints) {
            return readEndpoints(List.of(readEndpoints));
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }
        public Builder secondaryReadonlyKey(String secondaryReadonlyKey) {
            this.secondaryReadonlyKey = Objects.requireNonNull(secondaryReadonlyKey);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder virtualNetworkRules(List<GetAccountVirtualNetworkRule> virtualNetworkRules) {
            this.virtualNetworkRules = Objects.requireNonNull(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(GetAccountVirtualNetworkRule... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }
        public Builder writeEndpoints(List<String> writeEndpoints) {
            this.writeEndpoints = Objects.requireNonNull(writeEndpoints);
            return this;
        }
        public Builder writeEndpoints(String... writeEndpoints) {
            return writeEndpoints(List.of(writeEndpoints));
        }        public GetAccountResult build() {
            return new GetAccountResult(capabilities, consistencyPolicies, enableAutomaticFailover, enableFreeTier, enableMultipleWriteLocations, endpoint, geoLocations, id, ipRangeFilter, isVirtualNetworkFilterEnabled, keyVaultKeyId, kind, location, name, offerType, primaryKey, primaryReadonlyKey, readEndpoints, resourceGroupName, secondaryKey, secondaryReadonlyKey, tags, virtualNetworkRules, writeEndpoints);
        }
    }
}
