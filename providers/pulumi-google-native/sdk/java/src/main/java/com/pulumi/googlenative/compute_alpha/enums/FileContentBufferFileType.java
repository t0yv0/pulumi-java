// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The file type of source file.
     * 
     */
    @EnumType
    public enum FileContentBufferFileType {
        Bin("BIN"),
        Undefined("UNDEFINED"),
        X509("X509");

        private final String value;

        FileContentBufferFileType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FileContentBufferFileType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
