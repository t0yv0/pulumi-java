// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.DelimitedTextReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FtpReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.HttpReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.SftpReadSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity DelimitedText source.
 * 
 */
public final class DelimitedTextSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DelimitedTextSourceArgs Empty = new DelimitedTextSourceArgs();

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
     * DelimitedText format settings.
     * 
     */
    @Import(name="formatSettings")
    private @Nullable Output<DelimitedTextReadSettingsArgs> formatSettings;

    /**
     * @return DelimitedText format settings.
     * 
     */
    public Optional<Output<DelimitedTextReadSettingsArgs>> formatSettings() {
        return Optional.ofNullable(this.formatSettings);
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
     * DelimitedText store settings.
     * 
     */
    @Import(name="storeSettings")
    private @Nullable Output<Object> storeSettings;

    /**
     * @return DelimitedText store settings.
     * 
     */
    public Optional<Output<Object>> storeSettings() {
        return Optional.ofNullable(this.storeSettings);
    }

    /**
     * Copy source type.
     * Expected value is &#39;DelimitedTextSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;DelimitedTextSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DelimitedTextSourceArgs() {}

    private DelimitedTextSourceArgs(DelimitedTextSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.formatSettings = $.formatSettings;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.storeSettings = $.storeSettings;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DelimitedTextSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DelimitedTextSourceArgs $;

        public Builder() {
            $ = new DelimitedTextSourceArgs();
        }

        public Builder(DelimitedTextSourceArgs defaults) {
            $ = new DelimitedTextSourceArgs(Objects.requireNonNull(defaults));
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
         * @param formatSettings DelimitedText format settings.
         * 
         * @return builder
         * 
         */
        public Builder formatSettings(@Nullable Output<DelimitedTextReadSettingsArgs> formatSettings) {
            $.formatSettings = formatSettings;
            return this;
        }

        /**
         * @param formatSettings DelimitedText format settings.
         * 
         * @return builder
         * 
         */
        public Builder formatSettings(DelimitedTextReadSettingsArgs formatSettings) {
            return formatSettings(Output.of(formatSettings));
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
         * @param storeSettings DelimitedText store settings.
         * 
         * @return builder
         * 
         */
        public Builder storeSettings(@Nullable Output<Object> storeSettings) {
            $.storeSettings = storeSettings;
            return this;
        }

        /**
         * @param storeSettings DelimitedText store settings.
         * 
         * @return builder
         * 
         */
        public Builder storeSettings(Object storeSettings) {
            return storeSettings(Output.of(storeSettings));
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;DelimitedTextSource&#39;.
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
         * Expected value is &#39;DelimitedTextSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DelimitedTextSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
