// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse {
    /**
     * @return The Data Catalog resource name of the dataset entry the current table belongs to, for example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
     * 
     */
    private final String dataset;
    /**
     * @return Total number of shards.
     * 
     */
    private final String shardCount;
    /**
     * @return The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the `table_prefix` is `MyTable`.
     * 
     */
    private final String tablePrefix;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse(
        @CustomType.Parameter("dataset") String dataset,
        @CustomType.Parameter("shardCount") String shardCount,
        @CustomType.Parameter("tablePrefix") String tablePrefix) {
        this.dataset = dataset;
        this.shardCount = shardCount;
        this.tablePrefix = tablePrefix;
    }

    /**
     * @return The Data Catalog resource name of the dataset entry the current table belongs to, for example, `projects/{project_id}/locations/{location}/entrygroups/{entry_group_id}/entries/{entry_id}`.
     * 
     */
    public String dataset() {
        return this.dataset;
    }
    /**
     * @return Total number of shards.
     * 
     */
    public String shardCount() {
        return this.shardCount;
    }
    /**
     * @return The table name prefix of the shards. The name of any given shard is `[table_prefix]YYYYMMDD`, for example, for shard `MyTable20180101`, the `table_prefix` is `MyTable`.
     * 
     */
    public String tablePrefix() {
        return this.tablePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataset;
        private String shardCount;
        private String tablePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.shardCount = defaults.shardCount;
    	      this.tablePrefix = defaults.tablePrefix;
        }

        public Builder dataset(String dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder shardCount(String shardCount) {
            this.shardCount = Objects.requireNonNull(shardCount);
            return this;
        }
        public Builder tablePrefix(String tablePrefix) {
            this.tablePrefix = Objects.requireNonNull(tablePrefix);
            return this;
        }        public GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse build() {
            return new GoogleCloudDatacatalogV1beta1BigQueryDateShardedSpecResponse(dataset, shardCount, tablePrefix);
        }
    }
}
