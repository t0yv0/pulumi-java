// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.azurenative.documentdb.inputs.ConflictResolutionPolicyArgs;
import com.pulumi.azurenative.documentdb.inputs.ContainerPartitionKeyArgs;
import com.pulumi.azurenative.documentdb.inputs.IndexingPolicyArgs;
import com.pulumi.azurenative.documentdb.inputs.UniqueKeyPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cosmos DB SQL container resource object
 * 
 */
public final class SqlContainerResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlContainerResourceArgs Empty = new SqlContainerResourceArgs();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
    private @Nullable Output<Double> analyticalStorageTtl;

    /**
     * @return Analytical TTL.
     * 
     */
    public Optional<Output<Double>> analyticalStorageTtl() {
        return Optional.ofNullable(this.analyticalStorageTtl);
    }

    /**
     * The conflict resolution policy for the container.
     * 
     */
    @Import(name="conflictResolutionPolicy")
    private @Nullable Output<ConflictResolutionPolicyArgs> conflictResolutionPolicy;

    /**
     * @return The conflict resolution policy for the container.
     * 
     */
    public Optional<Output<ConflictResolutionPolicyArgs>> conflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }

    /**
     * Default time to live
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<Integer> defaultTtl;

    /**
     * @return Default time to live
     * 
     */
    public Optional<Output<Integer>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * Name of the Cosmos DB SQL container
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Name of the Cosmos DB SQL container
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    @Import(name="indexingPolicy")
    private @Nullable Output<IndexingPolicyArgs> indexingPolicy;

    /**
     * @return The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
     * 
     */
    public Optional<Output<IndexingPolicyArgs>> indexingPolicy() {
        return Optional.ofNullable(this.indexingPolicy);
    }

    /**
     * The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    @Import(name="partitionKey")
    private @Nullable Output<ContainerPartitionKeyArgs> partitionKey;

    /**
     * @return The configuration of the partition key to be used for partitioning data into multiple partitions
     * 
     */
    public Optional<Output<ContainerPartitionKeyArgs>> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    /**
     * The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    @Import(name="uniqueKeyPolicy")
    private @Nullable Output<UniqueKeyPolicyArgs> uniqueKeyPolicy;

    /**
     * @return The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     * 
     */
    public Optional<Output<UniqueKeyPolicyArgs>> uniqueKeyPolicy() {
        return Optional.ofNullable(this.uniqueKeyPolicy);
    }

    private SqlContainerResourceArgs() {}

    private SqlContainerResourceArgs(SqlContainerResourceArgs $) {
        this.analyticalStorageTtl = $.analyticalStorageTtl;
        this.conflictResolutionPolicy = $.conflictResolutionPolicy;
        this.defaultTtl = $.defaultTtl;
        this.id = $.id;
        this.indexingPolicy = $.indexingPolicy;
        this.partitionKey = $.partitionKey;
        this.uniqueKeyPolicy = $.uniqueKeyPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlContainerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlContainerResourceArgs $;

        public Builder() {
            $ = new SqlContainerResourceArgs();
        }

        public Builder(SqlContainerResourceArgs defaults) {
            $ = new SqlContainerResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param analyticalStorageTtl Analytical TTL.
         * 
         * @return builder
         * 
         */
        public Builder analyticalStorageTtl(@Nullable Output<Double> analyticalStorageTtl) {
            $.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }

        /**
         * @param analyticalStorageTtl Analytical TTL.
         * 
         * @return builder
         * 
         */
        public Builder analyticalStorageTtl(Double analyticalStorageTtl) {
            return analyticalStorageTtl(Output.of(analyticalStorageTtl));
        }

        /**
         * @param conflictResolutionPolicy The conflict resolution policy for the container.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(@Nullable Output<ConflictResolutionPolicyArgs> conflictResolutionPolicy) {
            $.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        /**
         * @param conflictResolutionPolicy The conflict resolution policy for the container.
         * 
         * @return builder
         * 
         */
        public Builder conflictResolutionPolicy(ConflictResolutionPolicyArgs conflictResolutionPolicy) {
            return conflictResolutionPolicy(Output.of(conflictResolutionPolicy));
        }

        /**
         * @param defaultTtl Default time to live
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<Integer> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl Default time to live
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(Integer defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param id Name of the Cosmos DB SQL container
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Name of the Cosmos DB SQL container
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param indexingPolicy The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
         * 
         * @return builder
         * 
         */
        public Builder indexingPolicy(@Nullable Output<IndexingPolicyArgs> indexingPolicy) {
            $.indexingPolicy = indexingPolicy;
            return this;
        }

        /**
         * @param indexingPolicy The configuration of the indexing policy. By default, the indexing is automatic for all document paths within the container
         * 
         * @return builder
         * 
         */
        public Builder indexingPolicy(IndexingPolicyArgs indexingPolicy) {
            return indexingPolicy(Output.of(indexingPolicy));
        }

        /**
         * @param partitionKey The configuration of the partition key to be used for partitioning data into multiple partitions
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(@Nullable Output<ContainerPartitionKeyArgs> partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        /**
         * @param partitionKey The configuration of the partition key to be used for partitioning data into multiple partitions
         * 
         * @return builder
         * 
         */
        public Builder partitionKey(ContainerPartitionKeyArgs partitionKey) {
            return partitionKey(Output.of(partitionKey));
        }

        /**
         * @param uniqueKeyPolicy The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
         * 
         * @return builder
         * 
         */
        public Builder uniqueKeyPolicy(@Nullable Output<UniqueKeyPolicyArgs> uniqueKeyPolicy) {
            $.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }

        /**
         * @param uniqueKeyPolicy The unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
         * 
         * @return builder
         * 
         */
        public Builder uniqueKeyPolicy(UniqueKeyPolicyArgs uniqueKeyPolicy) {
            return uniqueKeyPolicy(Output.of(uniqueKeyPolicy));
        }

        public SqlContainerResourceArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
