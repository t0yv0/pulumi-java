// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore_v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The field&#39;s mode.
     * 
     */
    @EnumType
    public enum GoogleFirestoreAdminV1beta1IndexFieldMode {
        /**
         * The mode is unspecified.
         * 
         */
        ModeUnspecified("MODE_UNSPECIFIED"),
        /**
         * The field&#39;s values are indexed so as to support sequencing in ascending order and also query by &lt;, &gt;, &lt;=, &gt;=, and =.
         * 
         */
        Ascending("ASCENDING"),
        /**
         * The field&#39;s values are indexed so as to support sequencing in descending order and also query by &lt;, &gt;, &lt;=, &gt;=, and =.
         * 
         */
        Descending("DESCENDING"),
        /**
         * The field&#39;s array values are indexed so as to support membership using ARRAY_CONTAINS queries.
         * 
         */
        ArrayContains("ARRAY_CONTAINS");

        private final String value;

        GoogleFirestoreAdminV1beta1IndexFieldMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleFirestoreAdminV1beta1IndexFieldMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
