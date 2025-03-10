// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.TableExternalDataConfigurationCsvOptions;
import com.pulumi.gcp.bigquery.outputs.TableExternalDataConfigurationGoogleSheetsOptions;
import com.pulumi.gcp.bigquery.outputs.TableExternalDataConfigurationHivePartitioningOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableExternalDataConfiguration {
    /**
     * @return - Let BigQuery try to autodetect the schema
     * and format of the table.
     * 
     */
    private final Boolean autodetect;
    /**
     * @return The compression type of the data source.
     * Valid values are &#34;NONE&#34; or &#34;GZIP&#34;.
     * 
     */
    private final @Nullable String compression;
    /**
     * @return Additional properties to set if
     * `source_format` is set to &#34;CSV&#34;. Structure is documented below.
     * 
     */
    private final @Nullable TableExternalDataConfigurationCsvOptions csvOptions;
    /**
     * @return Additional options if
     * `source_format` is set to &#34;GOOGLE_SHEETS&#34;. Structure is
     * documented below.
     * 
     */
    private final @Nullable TableExternalDataConfigurationGoogleSheetsOptions googleSheetsOptions;
    /**
     * @return When set, configures hive partitioning
     * support. Not all storage formats support hive partitioning -- requesting hive
     * partitioning on an unsupported format will lead to an error, as will providing
     * an invalid specification. Structure is documented below.
     * 
     */
    private final @Nullable TableExternalDataConfigurationHivePartitioningOptions hivePartitioningOptions;
    /**
     * @return Indicates if BigQuery should
     * allow extra values that are not represented in the table schema.
     * If true, the extra values are ignored. If false, records with
     * extra columns are treated as bad records, and if there are too
     * many bad records, an invalid error is returned in the job result.
     * The default value is false.
     * 
     */
    private final @Nullable Boolean ignoreUnknownValues;
    /**
     * @return The maximum number of bad records that
     * BigQuery can ignore when reading data.
     * 
     */
    private final @Nullable Integer maxBadRecords;
    /**
     * @return A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn&#39;t changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    private final @Nullable String schema;
    /**
     * @return The data format. Supported values are:
     * &#34;CSV&#34;, &#34;GOOGLE_SHEETS&#34;, &#34;NEWLINE_DELIMITED_JSON&#34;, &#34;AVRO&#34;, &#34;PARQUET&#34;, &#34;ORC&#34;,
     * &#34;DATSTORE_BACKUP&#34;, and &#34;BIGTABLE&#34;. To use &#34;GOOGLE_SHEETS&#34;
     * the `scopes` must include
     * &#34;https://www.googleapis.com/auth/drive.readonly&#34;.
     * 
     */
    private final String sourceFormat;
    /**
     * @return A list of the fully-qualified URIs that point to
     * your data in Google Cloud.
     * 
     */
    private final List<String> sourceUris;

    @CustomType.Constructor
    private TableExternalDataConfiguration(
        @CustomType.Parameter("autodetect") Boolean autodetect,
        @CustomType.Parameter("compression") @Nullable String compression,
        @CustomType.Parameter("csvOptions") @Nullable TableExternalDataConfigurationCsvOptions csvOptions,
        @CustomType.Parameter("googleSheetsOptions") @Nullable TableExternalDataConfigurationGoogleSheetsOptions googleSheetsOptions,
        @CustomType.Parameter("hivePartitioningOptions") @Nullable TableExternalDataConfigurationHivePartitioningOptions hivePartitioningOptions,
        @CustomType.Parameter("ignoreUnknownValues") @Nullable Boolean ignoreUnknownValues,
        @CustomType.Parameter("maxBadRecords") @Nullable Integer maxBadRecords,
        @CustomType.Parameter("schema") @Nullable String schema,
        @CustomType.Parameter("sourceFormat") String sourceFormat,
        @CustomType.Parameter("sourceUris") List<String> sourceUris) {
        this.autodetect = autodetect;
        this.compression = compression;
        this.csvOptions = csvOptions;
        this.googleSheetsOptions = googleSheetsOptions;
        this.hivePartitioningOptions = hivePartitioningOptions;
        this.ignoreUnknownValues = ignoreUnknownValues;
        this.maxBadRecords = maxBadRecords;
        this.schema = schema;
        this.sourceFormat = sourceFormat;
        this.sourceUris = sourceUris;
    }

    /**
     * @return - Let BigQuery try to autodetect the schema
     * and format of the table.
     * 
     */
    public Boolean autodetect() {
        return this.autodetect;
    }
    /**
     * @return The compression type of the data source.
     * Valid values are &#34;NONE&#34; or &#34;GZIP&#34;.
     * 
     */
    public Optional<String> compression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * @return Additional properties to set if
     * `source_format` is set to &#34;CSV&#34;. Structure is documented below.
     * 
     */
    public Optional<TableExternalDataConfigurationCsvOptions> csvOptions() {
        return Optional.ofNullable(this.csvOptions);
    }
    /**
     * @return Additional options if
     * `source_format` is set to &#34;GOOGLE_SHEETS&#34;. Structure is
     * documented below.
     * 
     */
    public Optional<TableExternalDataConfigurationGoogleSheetsOptions> googleSheetsOptions() {
        return Optional.ofNullable(this.googleSheetsOptions);
    }
    /**
     * @return When set, configures hive partitioning
     * support. Not all storage formats support hive partitioning -- requesting hive
     * partitioning on an unsupported format will lead to an error, as will providing
     * an invalid specification. Structure is documented below.
     * 
     */
    public Optional<TableExternalDataConfigurationHivePartitioningOptions> hivePartitioningOptions() {
        return Optional.ofNullable(this.hivePartitioningOptions);
    }
    /**
     * @return Indicates if BigQuery should
     * allow extra values that are not represented in the table schema.
     * If true, the extra values are ignored. If false, records with
     * extra columns are treated as bad records, and if there are too
     * many bad records, an invalid error is returned in the job result.
     * The default value is false.
     * 
     */
    public Optional<Boolean> ignoreUnknownValues() {
        return Optional.ofNullable(this.ignoreUnknownValues);
    }
    /**
     * @return The maximum number of bad records that
     * BigQuery can ignore when reading data.
     * 
     */
    public Optional<Integer> maxBadRecords() {
        return Optional.ofNullable(this.maxBadRecords);
    }
    /**
     * @return A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn&#39;t changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    public Optional<String> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return The data format. Supported values are:
     * &#34;CSV&#34;, &#34;GOOGLE_SHEETS&#34;, &#34;NEWLINE_DELIMITED_JSON&#34;, &#34;AVRO&#34;, &#34;PARQUET&#34;, &#34;ORC&#34;,
     * &#34;DATSTORE_BACKUP&#34;, and &#34;BIGTABLE&#34;. To use &#34;GOOGLE_SHEETS&#34;
     * the `scopes` must include
     * &#34;https://www.googleapis.com/auth/drive.readonly&#34;.
     * 
     */
    public String sourceFormat() {
        return this.sourceFormat;
    }
    /**
     * @return A list of the fully-qualified URIs that point to
     * your data in Google Cloud.
     * 
     */
    public List<String> sourceUris() {
        return this.sourceUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autodetect;
        private @Nullable String compression;
        private @Nullable TableExternalDataConfigurationCsvOptions csvOptions;
        private @Nullable TableExternalDataConfigurationGoogleSheetsOptions googleSheetsOptions;
        private @Nullable TableExternalDataConfigurationHivePartitioningOptions hivePartitioningOptions;
        private @Nullable Boolean ignoreUnknownValues;
        private @Nullable Integer maxBadRecords;
        private @Nullable String schema;
        private String sourceFormat;
        private List<String> sourceUris;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autodetect = defaults.autodetect;
    	      this.compression = defaults.compression;
    	      this.csvOptions = defaults.csvOptions;
    	      this.googleSheetsOptions = defaults.googleSheetsOptions;
    	      this.hivePartitioningOptions = defaults.hivePartitioningOptions;
    	      this.ignoreUnknownValues = defaults.ignoreUnknownValues;
    	      this.maxBadRecords = defaults.maxBadRecords;
    	      this.schema = defaults.schema;
    	      this.sourceFormat = defaults.sourceFormat;
    	      this.sourceUris = defaults.sourceUris;
        }

        public Builder autodetect(Boolean autodetect) {
            this.autodetect = Objects.requireNonNull(autodetect);
            return this;
        }
        public Builder compression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }
        public Builder csvOptions(@Nullable TableExternalDataConfigurationCsvOptions csvOptions) {
            this.csvOptions = csvOptions;
            return this;
        }
        public Builder googleSheetsOptions(@Nullable TableExternalDataConfigurationGoogleSheetsOptions googleSheetsOptions) {
            this.googleSheetsOptions = googleSheetsOptions;
            return this;
        }
        public Builder hivePartitioningOptions(@Nullable TableExternalDataConfigurationHivePartitioningOptions hivePartitioningOptions) {
            this.hivePartitioningOptions = hivePartitioningOptions;
            return this;
        }
        public Builder ignoreUnknownValues(@Nullable Boolean ignoreUnknownValues) {
            this.ignoreUnknownValues = ignoreUnknownValues;
            return this;
        }
        public Builder maxBadRecords(@Nullable Integer maxBadRecords) {
            this.maxBadRecords = maxBadRecords;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = schema;
            return this;
        }
        public Builder sourceFormat(String sourceFormat) {
            this.sourceFormat = Objects.requireNonNull(sourceFormat);
            return this;
        }
        public Builder sourceUris(List<String> sourceUris) {
            this.sourceUris = Objects.requireNonNull(sourceUris);
            return this;
        }
        public Builder sourceUris(String... sourceUris) {
            return sourceUris(List.of(sourceUris));
        }        public TableExternalDataConfiguration build() {
            return new TableExternalDataConfiguration(autodetect, compression, csvOptions, googleSheetsOptions, hivePartitioningOptions, ignoreUnknownValues, maxBadRecords, schema, sourceFormat, sourceUris);
        }
    }
}
