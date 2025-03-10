// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.SqlPartitionSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.StoredProcedureParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SQL source.
 * 
 */
public final class SqlSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlSourceArgs Empty = new SqlSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Specifies the transaction locking behavior for the SQL source. Allowed values: ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="isolationLevel")
    private @Nullable Output<Object> isolationLevel;

    /**
     * @return Specifies the transaction locking behavior for the SQL source. Allowed values: ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> isolationLevel() {
        return Optional.ofNullable(this.isolationLevel);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
     * 
     */
    @Import(name="partitionOption")
    private @Nullable Output<Object> partitionOption;

    /**
     * @return The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
     * 
     */
    public Optional<Output<Object>> partitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    @Import(name="partitionSettings")
    private @Nullable Output<SqlPartitionSettingsArgs> partitionSettings;

    /**
     * @return The settings that will be leveraged for Sql source partitioning.
     * 
     */
    public Optional<Output<SqlPartitionSettingsArgs>> partitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<Object> queryTimeout;

    /**
     * @return Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderQuery")
    private @Nullable Output<Object> sqlReaderQuery;

    /**
     * @return SQL reader query. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sqlReaderQuery() {
        return Optional.ofNullable(this.sqlReaderQuery);
    }

    /**
     * Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sqlReaderStoredProcedureName")
    private @Nullable Output<Object> sqlReaderStoredProcedureName;

    /**
     * @return Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sqlReaderStoredProcedureName() {
        return Optional.ofNullable(this.sqlReaderStoredProcedureName);
    }

    /**
     * Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
     * 
     */
    @Import(name="storedProcedureParameters")
    private @Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters;

    /**
     * @return Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
     * 
     */
    public Optional<Output<Map<String,StoredProcedureParameterArgs>>> storedProcedureParameters() {
        return Optional.ofNullable(this.storedProcedureParameters);
    }

    /**
     * Copy source type.
     * Expected value is &#39;SqlSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;SqlSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private SqlSourceArgs() {}

    private SqlSourceArgs(SqlSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.isolationLevel = $.isolationLevel;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.partitionOption = $.partitionOption;
        this.partitionSettings = $.partitionSettings;
        this.queryTimeout = $.queryTimeout;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.sqlReaderQuery = $.sqlReaderQuery;
        this.sqlReaderStoredProcedureName = $.sqlReaderStoredProcedureName;
        this.storedProcedureParameters = $.storedProcedureParameters;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlSourceArgs $;

        public Builder() {
            $ = new SqlSourceArgs();
        }

        public Builder(SqlSourceArgs defaults) {
            $ = new SqlSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param isolationLevel Specifies the transaction locking behavior for the SQL source. Allowed values: ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder isolationLevel(@Nullable Output<Object> isolationLevel) {
            $.isolationLevel = isolationLevel;
            return this;
        }

        /**
         * @param isolationLevel Specifies the transaction locking behavior for the SQL source. Allowed values: ReadCommitted/ReadUncommitted/RepeatableRead/Serializable/Snapshot. The default value is ReadCommitted. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder isolationLevel(Object isolationLevel) {
            return isolationLevel(Output.of(isolationLevel));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param partitionOption The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
         * 
         * @return builder
         * 
         */
        public Builder partitionOption(@Nullable Output<Object> partitionOption) {
            $.partitionOption = partitionOption;
            return this;
        }

        /**
         * @param partitionOption The partition mechanism that will be used for Sql read in parallel. Possible values include: &#34;None&#34;, &#34;PhysicalPartitionsOfTable&#34;, &#34;DynamicRange&#34;.
         * 
         * @return builder
         * 
         */
        public Builder partitionOption(Object partitionOption) {
            return partitionOption(Output.of(partitionOption));
        }

        /**
         * @param partitionSettings The settings that will be leveraged for Sql source partitioning.
         * 
         * @return builder
         * 
         */
        public Builder partitionSettings(@Nullable Output<SqlPartitionSettingsArgs> partitionSettings) {
            $.partitionSettings = partitionSettings;
            return this;
        }

        /**
         * @param partitionSettings The settings that will be leveraged for Sql source partitioning.
         * 
         * @return builder
         * 
         */
        public Builder partitionSettings(SqlPartitionSettingsArgs partitionSettings) {
            return partitionSettings(Output.of(partitionSettings));
        }

        /**
         * @param queryTimeout Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(@Nullable Output<Object> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param queryTimeout Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(Object queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        /**
         * @param sqlReaderQuery SQL reader query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlReaderQuery(@Nullable Output<Object> sqlReaderQuery) {
            $.sqlReaderQuery = sqlReaderQuery;
            return this;
        }

        /**
         * @param sqlReaderQuery SQL reader query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlReaderQuery(Object sqlReaderQuery) {
            return sqlReaderQuery(Output.of(sqlReaderQuery));
        }

        /**
         * @param sqlReaderStoredProcedureName Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlReaderStoredProcedureName(@Nullable Output<Object> sqlReaderStoredProcedureName) {
            $.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }

        /**
         * @param sqlReaderStoredProcedureName Name of the stored procedure for a SQL Database source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sqlReaderStoredProcedureName(Object sqlReaderStoredProcedureName) {
            return sqlReaderStoredProcedureName(Output.of(sqlReaderStoredProcedureName));
        }

        /**
         * @param storedProcedureParameters Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureParameters(@Nullable Output<Map<String,StoredProcedureParameterArgs>> storedProcedureParameters) {
            $.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        /**
         * @param storedProcedureParameters Value and type setting for stored procedure parameters. Example: &#34;{Parameter1: {value: &#34;1&#34;, type: &#34;int&#34;}}&#34;.
         * 
         * @return builder
         * 
         */
        public Builder storedProcedureParameters(Map<String,StoredProcedureParameterArgs> storedProcedureParameters) {
            return storedProcedureParameters(Output.of(storedProcedureParameters));
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;SqlSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;SqlSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SqlSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
