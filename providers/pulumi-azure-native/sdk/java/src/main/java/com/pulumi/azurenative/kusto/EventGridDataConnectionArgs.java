// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto;

import com.pulumi.azurenative.kusto.enums.BlobStorageEventType;
import com.pulumi.azurenative.kusto.enums.EventGridDataFormat;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EventGridDataConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventGridDataConnectionArgs Empty = new EventGridDataConnectionArgs();

    /**
     * The name of blob storage event type to process.
     * 
     */
    @Import(name="blobStorageEventType")
    private @Nullable Output<Either<String,BlobStorageEventType>> blobStorageEventType;

    /**
     * @return The name of blob storage event type to process.
     * 
     */
    public Optional<Output<Either<String,BlobStorageEventType>>> blobStorageEventType() {
        return Optional.ofNullable(this.blobStorageEventType);
    }

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The event hub consumer group.
     * 
     */
    @Import(name="consumerGroup", required=true)
    private Output<String> consumerGroup;

    /**
     * @return The event hub consumer group.
     * 
     */
    public Output<String> consumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The name of the data connection.
     * 
     */
    @Import(name="dataConnectionName")
    private @Nullable Output<String> dataConnectionName;

    /**
     * @return The name of the data connection.
     * 
     */
    public Optional<Output<String>> dataConnectionName() {
        return Optional.ofNullable(this.dataConnectionName);
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Import(name="dataFormat")
    private @Nullable Output<Either<String,EventGridDataFormat>> dataFormat;

    /**
     * @return The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    public Optional<Output<Either<String,EventGridDataFormat>>> dataFormat() {
        return Optional.ofNullable(this.dataFormat);
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database in the Kusto cluster.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The resource ID where the event grid is configured to send events.
     * 
     */
    @Import(name="eventHubResourceId", required=true)
    private Output<String> eventHubResourceId;

    /**
     * @return The resource ID where the event grid is configured to send events.
     * 
     */
    public Output<String> eventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    @Import(name="ignoreFirstRecord")
    private @Nullable Output<Boolean> ignoreFirstRecord;

    /**
     * @return A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    public Optional<Output<Boolean>> ignoreFirstRecord() {
        return Optional.ofNullable(this.ignoreFirstRecord);
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is &#39;EventGrid&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Kind of the endpoint for the data connection
     * Expected value is &#39;EventGrid&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Import(name="mappingRuleName")
    private @Nullable Output<String> mappingRuleName;

    /**
     * @return The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    public Optional<Output<String>> mappingRuleName() {
        return Optional.ofNullable(this.mappingRuleName);
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource ID of the storage account where the data resides.
     * 
     */
    @Import(name="storageAccountResourceId", required=true)
    private Output<String> storageAccountResourceId;

    /**
     * @return The resource ID of the storage account where the data resides.
     * 
     */
    public Output<String> storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    /**
     * @return The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    private EventGridDataConnectionArgs() {}

    private EventGridDataConnectionArgs(EventGridDataConnectionArgs $) {
        this.blobStorageEventType = $.blobStorageEventType;
        this.clusterName = $.clusterName;
        this.consumerGroup = $.consumerGroup;
        this.dataConnectionName = $.dataConnectionName;
        this.dataFormat = $.dataFormat;
        this.databaseName = $.databaseName;
        this.eventHubResourceId = $.eventHubResourceId;
        this.ignoreFirstRecord = $.ignoreFirstRecord;
        this.kind = $.kind;
        this.location = $.location;
        this.mappingRuleName = $.mappingRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.storageAccountResourceId = $.storageAccountResourceId;
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventGridDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventGridDataConnectionArgs $;

        public Builder() {
            $ = new EventGridDataConnectionArgs();
        }

        public Builder(EventGridDataConnectionArgs defaults) {
            $ = new EventGridDataConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blobStorageEventType The name of blob storage event type to process.
         * 
         * @return builder
         * 
         */
        public Builder blobStorageEventType(@Nullable Output<Either<String,BlobStorageEventType>> blobStorageEventType) {
            $.blobStorageEventType = blobStorageEventType;
            return this;
        }

        /**
         * @param blobStorageEventType The name of blob storage event type to process.
         * 
         * @return builder
         * 
         */
        public Builder blobStorageEventType(Either<String,BlobStorageEventType> blobStorageEventType) {
            return blobStorageEventType(Output.of(blobStorageEventType));
        }

        /**
         * @param blobStorageEventType The name of blob storage event type to process.
         * 
         * @return builder
         * 
         */
        public Builder blobStorageEventType(String blobStorageEventType) {
            return blobStorageEventType(Either.ofLeft(blobStorageEventType));
        }

        /**
         * @param blobStorageEventType The name of blob storage event type to process.
         * 
         * @return builder
         * 
         */
        public Builder blobStorageEventType(BlobStorageEventType blobStorageEventType) {
            return blobStorageEventType(Either.ofRight(blobStorageEventType));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param consumerGroup The event hub consumer group.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroup(Output<String> consumerGroup) {
            $.consumerGroup = consumerGroup;
            return this;
        }

        /**
         * @param consumerGroup The event hub consumer group.
         * 
         * @return builder
         * 
         */
        public Builder consumerGroup(String consumerGroup) {
            return consumerGroup(Output.of(consumerGroup));
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(@Nullable Output<String> dataConnectionName) {
            $.dataConnectionName = dataConnectionName;
            return this;
        }

        /**
         * @param dataConnectionName The name of the data connection.
         * 
         * @return builder
         * 
         */
        public Builder dataConnectionName(String dataConnectionName) {
            return dataConnectionName(Output.of(dataConnectionName));
        }

        /**
         * @param dataFormat The data format of the message. Optionally the data format can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(@Nullable Output<Either<String,EventGridDataFormat>> dataFormat) {
            $.dataFormat = dataFormat;
            return this;
        }

        /**
         * @param dataFormat The data format of the message. Optionally the data format can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(Either<String,EventGridDataFormat> dataFormat) {
            return dataFormat(Output.of(dataFormat));
        }

        /**
         * @param dataFormat The data format of the message. Optionally the data format can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(String dataFormat) {
            return dataFormat(Either.ofLeft(dataFormat));
        }

        /**
         * @param dataFormat The data format of the message. Optionally the data format can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder dataFormat(EventGridDataFormat dataFormat) {
            return dataFormat(Either.ofRight(dataFormat));
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param eventHubResourceId The resource ID where the event grid is configured to send events.
         * 
         * @return builder
         * 
         */
        public Builder eventHubResourceId(Output<String> eventHubResourceId) {
            $.eventHubResourceId = eventHubResourceId;
            return this;
        }

        /**
         * @param eventHubResourceId The resource ID where the event grid is configured to send events.
         * 
         * @return builder
         * 
         */
        public Builder eventHubResourceId(String eventHubResourceId) {
            return eventHubResourceId(Output.of(eventHubResourceId));
        }

        /**
         * @param ignoreFirstRecord A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
         * 
         * @return builder
         * 
         */
        public Builder ignoreFirstRecord(@Nullable Output<Boolean> ignoreFirstRecord) {
            $.ignoreFirstRecord = ignoreFirstRecord;
            return this;
        }

        /**
         * @param ignoreFirstRecord A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
         * 
         * @return builder
         * 
         */
        public Builder ignoreFirstRecord(Boolean ignoreFirstRecord) {
            return ignoreFirstRecord(Output.of(ignoreFirstRecord));
        }

        /**
         * @param kind Kind of the endpoint for the data connection
         * Expected value is &#39;EventGrid&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of the endpoint for the data connection
         * Expected value is &#39;EventGrid&#39;.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param mappingRuleName The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder mappingRuleName(@Nullable Output<String> mappingRuleName) {
            $.mappingRuleName = mappingRuleName;
            return this;
        }

        /**
         * @param mappingRuleName The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder mappingRuleName(String mappingRuleName) {
            return mappingRuleName(Output.of(mappingRuleName));
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageAccountResourceId The resource ID of the storage account where the data resides.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountResourceId(Output<String> storageAccountResourceId) {
            $.storageAccountResourceId = storageAccountResourceId;
            return this;
        }

        /**
         * @param storageAccountResourceId The resource ID of the storage account where the data resides.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountResourceId(String storageAccountResourceId) {
            return storageAccountResourceId(Output.of(storageAccountResourceId));
        }

        /**
         * @param tableName The table where the data should be ingested. Optionally the table information can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        /**
         * @param tableName The table where the data should be ingested. Optionally the table information can be added to each message.
         * 
         * @return builder
         * 
         */
        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public EventGridDataConnectionArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.consumerGroup = Objects.requireNonNull($.consumerGroup, "expected parameter 'consumerGroup' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.eventHubResourceId = Objects.requireNonNull($.eventHubResourceId, "expected parameter 'eventHubResourceId' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageAccountResourceId = Objects.requireNonNull($.storageAccountResourceId, "expected parameter 'storageAccountResourceId' to be non-null");
            return $;
        }
    }

}
