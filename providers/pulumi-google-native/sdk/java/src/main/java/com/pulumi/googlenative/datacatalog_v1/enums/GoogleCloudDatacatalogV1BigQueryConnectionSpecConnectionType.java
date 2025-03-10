// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the BigQuery connection.
     * 
     */
    @EnumType
    public enum GoogleCloudDatacatalogV1BigQueryConnectionSpecConnectionType {
        /**
         * Unspecified type.
         * 
         */
        ConnectionTypeUnspecified("CONNECTION_TYPE_UNSPECIFIED"),
        /**
         * Cloud SQL connection.
         * 
         */
        CloudSql("CLOUD_SQL");

        private final String value;

        GoogleCloudDatacatalogV1BigQueryConnectionSpecConnectionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDatacatalogV1BigQueryConnectionSpecConnectionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
