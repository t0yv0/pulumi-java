// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Compress text responses using Brotli or gzip compression, based on the client&#39;s Accept-Encoding header.
     * 
     */
    @EnumType
    public enum BackendServiceCompressionMode {
        /**
         * Automatically uses the best compression based on the Accept-Encoding header sent by the client.
         * 
         */
        Automatic("AUTOMATIC"),
        /**
         * Disables compression. Existing compressed responses cached by Cloud CDN will not be served to clients.
         * 
         */
        Disabled("DISABLED");

        private final String value;

        BackendServiceCompressionMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BackendServiceCompressionMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
