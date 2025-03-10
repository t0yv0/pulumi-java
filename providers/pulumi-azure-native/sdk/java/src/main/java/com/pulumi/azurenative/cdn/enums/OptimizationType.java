// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies what scenario the customer wants this CDN endpoint to optimize for, e.g. Download, Media services. With this information, CDN can apply scenario driven optimization.
     * 
     */
    @EnumType
    public enum OptimizationType {
        GeneralWebDelivery("GeneralWebDelivery"),
        GeneralMediaStreaming("GeneralMediaStreaming"),
        VideoOnDemandMediaStreaming("VideoOnDemandMediaStreaming"),
        LargeFileDownload("LargeFileDownload"),
        DynamicSiteAcceleration("DynamicSiteAcceleration");

        private final String value;

        OptimizationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OptimizationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
