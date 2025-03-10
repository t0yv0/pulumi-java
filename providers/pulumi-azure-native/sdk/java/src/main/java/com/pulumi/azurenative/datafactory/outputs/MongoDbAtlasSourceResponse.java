// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.MongoDbCursorMethodsPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoDbAtlasSourceResponse {
    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * @return Specifies the number of documents to return in each batch of the response from MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This property&#39;s main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object batchSize;
    /**
     * @return Cursor methods for Mongodb query
     * 
     */
    private final @Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods;
    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * @return Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object filter;
    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * @return Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * @return Copy source type.
     * Expected value is &#39;MongoDbAtlasSource&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private MongoDbAtlasSourceResponse(
        @CustomType.Parameter("additionalColumns") @Nullable Object additionalColumns,
        @CustomType.Parameter("batchSize") @Nullable Object batchSize,
        @CustomType.Parameter("cursorMethods") @Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("filter") @Nullable Object filter,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("queryTimeout") @Nullable Object queryTimeout,
        @CustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @CustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @CustomType.Parameter("type") String type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.cursorMethods = cursorMethods;
        this.disableMetricsCollection = disableMetricsCollection;
        this.filter = filter;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = type;
    }

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Object> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * @return Specifies the number of documents to return in each batch of the response from MongoDB Atlas instance. In most cases, modifying the batch size will not affect the user or the application. This property&#39;s main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> batchSize() {
        return Optional.ofNullable(this.batchSize);
    }
    /**
     * @return Cursor methods for Mongodb query
     * 
     */
    public Optional<MongoDbCursorMethodsPropertiesResponse> cursorMethods() {
        return Optional.ofNullable(this.cursorMethods);
    }
    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * @return Specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * @return Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * @return Copy source type.
     * Expected value is &#39;MongoDbAtlasSource&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbAtlasSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object batchSize;
        private @Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object filter;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbAtlasSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.cursorMethods = defaults.cursorMethods;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.filter = defaults.filter;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }
        public Builder batchSize(@Nullable Object batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Builder cursorMethods(@Nullable MongoDbCursorMethodsPropertiesResponse cursorMethods) {
            this.cursorMethods = cursorMethods;
            return this;
        }
        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }
        public Builder filter(@Nullable Object filter) {
            this.filter = filter;
            return this;
        }
        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }
        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }
        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }
        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public MongoDbAtlasSourceResponse build() {
            return new MongoDbAtlasSourceResponse(additionalColumns, batchSize, cursorMethods, disableMetricsCollection, filter, maxConcurrentConnections, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
