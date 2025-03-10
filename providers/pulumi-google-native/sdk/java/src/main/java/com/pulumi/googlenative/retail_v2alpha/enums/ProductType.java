// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The type of the product. Default to Catalog.product_level_config.ingestion_product_type if unset.
     * 
     */
    @EnumType
    public enum ProductType {
        /**
         * Default value. Default to Catalog.product_level_config.ingestion_product_type if unset.
         * 
         */
        TypeUnspecified("TYPE_UNSPECIFIED"),
        /**
         * The primary type. As the primary unit for predicting, indexing and search serving, a Type.PRIMARY Product is grouped with multiple Type.VARIANT Products.
         * 
         */
        Primary("PRIMARY"),
        /**
         * The variant type. Type.VARIANT Products usually share some common attributes on the same Type.PRIMARY Products, but they have variant attributes like different colors, sizes and prices, etc.
         * 
         */
        Variant("VARIANT"),
        /**
         * The collection type. Collection products are bundled Type.PRIMARY Products or Type.VARIANT Products that are sold together, such as a jewelry set with necklaces, earrings and rings, etc.
         * 
         */
        Collection("COLLECTION");

        private final String value;

        ProductType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProductType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
