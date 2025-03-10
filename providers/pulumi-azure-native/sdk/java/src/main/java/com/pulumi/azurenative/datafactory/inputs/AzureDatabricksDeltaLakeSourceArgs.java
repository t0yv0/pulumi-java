// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeExportCommandArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Databricks Delta Lake source.
 * 
 */
public final class AzureDatabricksDeltaLakeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksDeltaLakeSourceArgs Empty = new AzureDatabricksDeltaLakeSourceArgs();

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
     * Azure Databricks Delta Lake export settings.
     * 
     */
    @Import(name="exportSettings")
    private @Nullable Output<AzureDatabricksDeltaLakeExportCommandArgs> exportSettings;

    /**
     * @return Azure Databricks Delta Lake export settings.
     * 
     */
    public Optional<Output<AzureDatabricksDeltaLakeExportCommandArgs>> exportSettings() {
        return Optional.ofNullable(this.exportSettings);
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
     * Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
    private @Nullable Output<Object> query;

    /**
     * @return Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> query() {
        return Optional.ofNullable(this.query);
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
     * Copy source type.
     * Expected value is &#39;AzureDatabricksDeltaLakeSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;AzureDatabricksDeltaLakeSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AzureDatabricksDeltaLakeSourceArgs() {}

    private AzureDatabricksDeltaLakeSourceArgs(AzureDatabricksDeltaLakeSourceArgs $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.exportSettings = $.exportSettings;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.query = $.query;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDatabricksDeltaLakeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDatabricksDeltaLakeSourceArgs $;

        public Builder() {
            $ = new AzureDatabricksDeltaLakeSourceArgs();
        }

        public Builder(AzureDatabricksDeltaLakeSourceArgs defaults) {
            $ = new AzureDatabricksDeltaLakeSourceArgs(Objects.requireNonNull(defaults));
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
         * @param exportSettings Azure Databricks Delta Lake export settings.
         * 
         * @return builder
         * 
         */
        public Builder exportSettings(@Nullable Output<AzureDatabricksDeltaLakeExportCommandArgs> exportSettings) {
            $.exportSettings = exportSettings;
            return this;
        }

        /**
         * @param exportSettings Azure Databricks Delta Lake export settings.
         * 
         * @return builder
         * 
         */
        public Builder exportSettings(AzureDatabricksDeltaLakeExportCommandArgs exportSettings) {
            return exportSettings(Output.of(exportSettings));
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
         * @param query Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<Object> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder query(Object query) {
            return query(Output.of(query));
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
         * @param type Copy source type.
         * Expected value is &#39;AzureDatabricksDeltaLakeSource&#39;.
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
         * Expected value is &#39;AzureDatabricksDeltaLakeSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureDatabricksDeltaLakeSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
