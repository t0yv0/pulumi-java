// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * An value that determines where the API Version identifier will be located in a HTTP request.
     * 
     */
    @EnumType
    public enum VersioningScheme {
        /**
         * The API Version is passed in a path segment.
         * 
         */
        Segment("Segment"),
        /**
         * The API Version is passed in a query parameter.
         * 
         */
        Query("Query"),
        /**
         * The API Version is passed in a HTTP header.
         * 
         */
        Header("Header");

        private final String value;

        VersioningScheme(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VersioningScheme[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
