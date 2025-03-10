// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.azurenative.documentdb.outputs.ConflictResolutionPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.ContainerPartitionKeyResponse;
import com.pulumi.azurenative.documentdb.outputs.IndexingPolicyResponse;
import com.pulumi.azurenative.documentdb.outputs.UniqueKeyPolicyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlContainerGetPropertiesResponseResource {
    /**
     * @return Analytical TTL.
     * 
     */
    private final @Nullable Double analyticalStorageTtl;
    /**
     * @return The conflict resolution policy for the container.
     * 
     */
    private final @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
    /**
     * @return Default time to live
     * 
     */
    private final @Nullable Integer defaultTtl;
    /**
     * @return A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    private final String etag;
    /**
     * @return Name of the Cosmos DB SQL container
     * 
     */
    private final String id;
    /**
     * @return The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    private final @Nullable IndexingPolicyResponse indexingPolicy;
    /**
     * @return The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    private final @Nullable ContainerPartitionKeyResponse partitionKey;
    /**
     * @return A system generated property. A unique identifier.
     * 
     */
    private final String rid;
    /**
     * @return A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    private final Double ts;
    /**
     * @return The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    private final @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

    @CustomType.Constructor
    private SqlContainerGetPropertiesResponseResource(
        @CustomType.Parameter("analyticalStorageTtl") @Nullable Double analyticalStorageTtl,
        @CustomType.Parameter("conflictResolutionPolicy") @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy,
        @CustomType.Parameter("defaultTtl") @Nullable Integer defaultTtl,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("indexingPolicy") @Nullable IndexingPolicyResponse indexingPolicy,
        @CustomType.Parameter("partitionKey") @Nullable ContainerPartitionKeyResponse partitionKey,
        @CustomType.Parameter("rid") String rid,
        @CustomType.Parameter("ts") Double ts,
        @CustomType.Parameter("uniqueKeyPolicy") @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.defaultTtl = defaultTtl;
        this.etag = etag;
        this.id = id;
        this.indexingPolicy = indexingPolicy;
        this.partitionKey = partitionKey;
        this.rid = rid;
        this.ts = ts;
        this.uniqueKeyPolicy = uniqueKeyPolicy;
    }

    /**
     * @return Analytical TTL.
     * 
     */
    public Optional<Double> analyticalStorageTtl() {
        return Optional.ofNullable(this.analyticalStorageTtl);
    }
    /**
     * @return The conflict resolution policy for the container.
     * 
     */
    public Optional<ConflictResolutionPolicyResponse> conflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }
    /**
     * @return Default time to live
     * 
     */
    public Optional<Integer> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * @return A system generated property representing the resource etag required for optimistic concurrency control.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Name of the Cosmos DB SQL container
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    public Optional<IndexingPolicyResponse> indexingPolicy() {
        return Optional.ofNullable(this.indexingPolicy);
    }
    /**
     * @return The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    public Optional<ContainerPartitionKeyResponse> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    /**
     * @return A system generated property. A unique identifier.
     * 
     */
    public String rid() {
        return this.rid;
    }
    /**
     * @return A system generated property that denotes the last updated timestamp of the resource.
     * 
     */
    public Double ts() {
        return this.ts;
    }
    /**
     * @return The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    public Optional<UniqueKeyPolicyResponse> uniqueKeyPolicy() {
        return Optional.ofNullable(this.uniqueKeyPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double analyticalStorageTtl;
        private @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
        private @Nullable Integer defaultTtl;
        private String etag;
        private String id;
        private @Nullable IndexingPolicyResponse indexingPolicy;
        private @Nullable ContainerPartitionKeyResponse partitionKey;
        private String rid;
        private Double ts;
        private @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexingPolicy = defaults.indexingPolicy;
    	      this.partitionKey = defaults.partitionKey;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
    	      this.uniqueKeyPolicy = defaults.uniqueKeyPolicy;
        }

        public Builder analyticalStorageTtl(@Nullable Double analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }
        public Builder conflictResolutionPolicy(@Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder indexingPolicy(@Nullable IndexingPolicyResponse indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }
        public Builder partitionKey(@Nullable ContainerPartitionKeyResponse partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder rid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }
        public Builder ts(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }
        public Builder uniqueKeyPolicy(@Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
            this.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }        public SqlContainerGetPropertiesResponseResource build() {
            return new SqlContainerGetPropertiesResponseResource(analyticalStorageTtl, conflictResolutionPolicy, defaultTtl, etag, id, indexingPolicy, partitionKey, rid, ts, uniqueKeyPolicy);
        }
    }
}
