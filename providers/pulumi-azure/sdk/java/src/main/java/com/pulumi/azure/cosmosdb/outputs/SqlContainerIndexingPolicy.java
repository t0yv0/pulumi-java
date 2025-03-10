// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.azure.cosmosdb.outputs.SqlContainerIndexingPolicyCompositeIndex;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerIndexingPolicyExcludedPath;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerIndexingPolicyIncludedPath;
import com.pulumi.azure.cosmosdb.outputs.SqlContainerIndexingPolicySpatialIndex;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlContainerIndexingPolicy {
    /**
     * @return One or more `composite_index` blocks as defined below.
     * 
     */
    private final @Nullable List<SqlContainerIndexingPolicyCompositeIndex> compositeIndices;
    /**
     * @return One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    private final @Nullable List<SqlContainerIndexingPolicyExcludedPath> excludedPaths;
    /**
     * @return One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    private final @Nullable List<SqlContainerIndexingPolicyIncludedPath> includedPaths;
    /**
     * @return Indicates the indexing mode. Possible values include: `Consistent` and `None`. Defaults to `Consistent`.
     * 
     */
    private final @Nullable String indexingMode;
    /**
     * @return One or more `spatial_index` blocks as defined below.
     * 
     */
    private final @Nullable List<SqlContainerIndexingPolicySpatialIndex> spatialIndices;

    @CustomType.Constructor
    private SqlContainerIndexingPolicy(
        @CustomType.Parameter("compositeIndices") @Nullable List<SqlContainerIndexingPolicyCompositeIndex> compositeIndices,
        @CustomType.Parameter("excludedPaths") @Nullable List<SqlContainerIndexingPolicyExcludedPath> excludedPaths,
        @CustomType.Parameter("includedPaths") @Nullable List<SqlContainerIndexingPolicyIncludedPath> includedPaths,
        @CustomType.Parameter("indexingMode") @Nullable String indexingMode,
        @CustomType.Parameter("spatialIndices") @Nullable List<SqlContainerIndexingPolicySpatialIndex> spatialIndices) {
        this.compositeIndices = compositeIndices;
        this.excludedPaths = excludedPaths;
        this.includedPaths = includedPaths;
        this.indexingMode = indexingMode;
        this.spatialIndices = spatialIndices;
    }

    /**
     * @return One or more `composite_index` blocks as defined below.
     * 
     */
    public List<SqlContainerIndexingPolicyCompositeIndex> compositeIndices() {
        return this.compositeIndices == null ? List.of() : this.compositeIndices;
    }
    /**
     * @return One or more `excluded_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    public List<SqlContainerIndexingPolicyExcludedPath> excludedPaths() {
        return this.excludedPaths == null ? List.of() : this.excludedPaths;
    }
    /**
     * @return One or more `included_path` blocks as defined below. Either `included_path` or `excluded_path` must contain the `path` `/*`
     * 
     */
    public List<SqlContainerIndexingPolicyIncludedPath> includedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }
    /**
     * @return Indicates the indexing mode. Possible values include: `Consistent` and `None`. Defaults to `Consistent`.
     * 
     */
    public Optional<String> indexingMode() {
        return Optional.ofNullable(this.indexingMode);
    }
    /**
     * @return One or more `spatial_index` blocks as defined below.
     * 
     */
    public List<SqlContainerIndexingPolicySpatialIndex> spatialIndices() {
        return this.spatialIndices == null ? List.of() : this.spatialIndices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerIndexingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SqlContainerIndexingPolicyCompositeIndex> compositeIndices;
        private @Nullable List<SqlContainerIndexingPolicyExcludedPath> excludedPaths;
        private @Nullable List<SqlContainerIndexingPolicyIncludedPath> includedPaths;
        private @Nullable String indexingMode;
        private @Nullable List<SqlContainerIndexingPolicySpatialIndex> spatialIndices;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerIndexingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeIndices = defaults.compositeIndices;
    	      this.excludedPaths = defaults.excludedPaths;
    	      this.includedPaths = defaults.includedPaths;
    	      this.indexingMode = defaults.indexingMode;
    	      this.spatialIndices = defaults.spatialIndices;
        }

        public Builder compositeIndices(@Nullable List<SqlContainerIndexingPolicyCompositeIndex> compositeIndices) {
            this.compositeIndices = compositeIndices;
            return this;
        }
        public Builder compositeIndices(SqlContainerIndexingPolicyCompositeIndex... compositeIndices) {
            return compositeIndices(List.of(compositeIndices));
        }
        public Builder excludedPaths(@Nullable List<SqlContainerIndexingPolicyExcludedPath> excludedPaths) {
            this.excludedPaths = excludedPaths;
            return this;
        }
        public Builder excludedPaths(SqlContainerIndexingPolicyExcludedPath... excludedPaths) {
            return excludedPaths(List.of(excludedPaths));
        }
        public Builder includedPaths(@Nullable List<SqlContainerIndexingPolicyIncludedPath> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public Builder includedPaths(SqlContainerIndexingPolicyIncludedPath... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }
        public Builder indexingMode(@Nullable String indexingMode) {
            this.indexingMode = indexingMode;
            return this;
        }
        public Builder spatialIndices(@Nullable List<SqlContainerIndexingPolicySpatialIndex> spatialIndices) {
            this.spatialIndices = spatialIndices;
            return this;
        }
        public Builder spatialIndices(SqlContainerIndexingPolicySpatialIndex... spatialIndices) {
            return spatialIndices(List.of(spatialIndices));
        }        public SqlContainerIndexingPolicy build() {
            return new SqlContainerIndexingPolicy(compositeIndices, excludedPaths, includedPaths, indexingMode, spatialIndices);
        }
    }
}
