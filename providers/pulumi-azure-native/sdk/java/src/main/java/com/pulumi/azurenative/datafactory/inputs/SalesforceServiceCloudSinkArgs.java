// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.SalesforceSinkWriteBehavior;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Salesforce Service Cloud sink.
 * 
 */
public final class SalesforceServiceCloudSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final SalesforceServiceCloudSinkArgs Empty = new SalesforceServiceCloudSinkArgs();

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
     * The name of the external ID field for upsert operation. Default value is &#39;Id&#39; column. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="externalIdFieldName")
    private @Nullable Output<Object> externalIdFieldName;

    /**
     * @return The name of the external ID field for upsert operation. Default value is &#39;Id&#39; column. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> externalIdFieldName() {
        return Optional.ofNullable(this.externalIdFieldName);
    }

    /**
     * The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="ignoreNullValues")
    private @Nullable Output<Object> ignoreNullValues;

    /**
     * @return The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> ignoreNullValues() {
        return Optional.ofNullable(this.ignoreNullValues);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Output<Object> sinkRetryCount;

    /**
     * @return Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Output<Object> sinkRetryWait;

    /**
     * @return Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;SalesforceServiceCloudSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy sink type.
     * Expected value is &#39;SalesforceServiceCloudSink&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Output<Object> writeBatchSize;

    /**
     * @return Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Output<Object> writeBatchTimeout;

    /**
     * @return Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * The write behavior for the operation. Default is Insert.
     * 
     */
    @Import(name="writeBehavior")
    private @Nullable Output<Either<String,SalesforceSinkWriteBehavior>> writeBehavior;

    /**
     * @return The write behavior for the operation. Default is Insert.
     * 
     */
    public Optional<Output<Either<String,SalesforceSinkWriteBehavior>>> writeBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    private SalesforceServiceCloudSinkArgs() {}

    private SalesforceServiceCloudSinkArgs(SalesforceServiceCloudSinkArgs $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.externalIdFieldName = $.externalIdFieldName;
        this.ignoreNullValues = $.ignoreNullValues;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.type = $.type;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
        this.writeBehavior = $.writeBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SalesforceServiceCloudSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SalesforceServiceCloudSinkArgs $;

        public Builder() {
            $ = new SalesforceServiceCloudSinkArgs();
        }

        public Builder(SalesforceServiceCloudSinkArgs defaults) {
            $ = new SalesforceServiceCloudSinkArgs(Objects.requireNonNull(defaults));
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
         * @param externalIdFieldName The name of the external ID field for upsert operation. Default value is &#39;Id&#39; column. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder externalIdFieldName(@Nullable Output<Object> externalIdFieldName) {
            $.externalIdFieldName = externalIdFieldName;
            return this;
        }

        /**
         * @param externalIdFieldName The name of the external ID field for upsert operation. Default value is &#39;Id&#39; column. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder externalIdFieldName(Object externalIdFieldName) {
            return externalIdFieldName(Output.of(externalIdFieldName));
        }

        /**
         * @param ignoreNullValues The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder ignoreNullValues(@Nullable Output<Object> ignoreNullValues) {
            $.ignoreNullValues = ignoreNullValues;
            return this;
        }

        /**
         * @param ignoreNullValues The flag indicating whether or not to ignore null values from input dataset (except key fields) during write operation. Default value is false. If set it to true, it means ADF will leave the data in the destination object unchanged when doing upsert/update operation and insert defined default value when doing insert operation, versus ADF will update the data in the destination object to NULL when doing upsert/update operation and insert NULL value when doing insert operation. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder ignoreNullValues(Object ignoreNullValues) {
            return ignoreNullValues(Output.of(ignoreNullValues));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(Object sinkRetryCount) {
            return sinkRetryCount(Output.of(sinkRetryCount));
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(Object sinkRetryWait) {
            return sinkRetryWait(Output.of(sinkRetryWait));
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SalesforceServiceCloudSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;SalesforceServiceCloudSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(Object writeBatchSize) {
            return writeBatchSize(Output.of(writeBatchSize));
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(Object writeBatchTimeout) {
            return writeBatchTimeout(Output.of(writeBatchTimeout));
        }

        /**
         * @param writeBehavior The write behavior for the operation. Default is Insert.
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(@Nullable Output<Either<String,SalesforceSinkWriteBehavior>> writeBehavior) {
            $.writeBehavior = writeBehavior;
            return this;
        }

        /**
         * @param writeBehavior The write behavior for the operation. Default is Insert.
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(Either<String,SalesforceSinkWriteBehavior> writeBehavior) {
            return writeBehavior(Output.of(writeBehavior));
        }

        /**
         * @param writeBehavior The write behavior for the operation. Default is Insert.
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(String writeBehavior) {
            return writeBehavior(Either.ofLeft(writeBehavior));
        }

        /**
         * @param writeBehavior The write behavior for the operation. Default is Insert.
         * 
         * @return builder
         * 
         */
        public Builder writeBehavior(SalesforceSinkWriteBehavior writeBehavior) {
            return writeBehavior(Either.ofRight(writeBehavior));
        }

        public SalesforceServiceCloudSinkArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
