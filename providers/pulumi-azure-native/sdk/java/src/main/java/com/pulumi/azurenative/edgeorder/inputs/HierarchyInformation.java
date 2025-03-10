// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Holds details about product hierarchy information
 * 
 */
public final class HierarchyInformation extends com.pulumi.resources.InvokeArgs {

    public static final HierarchyInformation Empty = new HierarchyInformation();

    /**
     * Represents configuration name that uniquely identifies configuration
     * 
     */
    @Import(name="configurationName")
    private @Nullable String configurationName;

    /**
     * @return Represents configuration name that uniquely identifies configuration
     * 
     */
    public Optional<String> configurationName() {
        return Optional.ofNullable(this.configurationName);
    }

    /**
     * Represents product family name that uniquely identifies product family
     * 
     */
    @Import(name="productFamilyName")
    private @Nullable String productFamilyName;

    /**
     * @return Represents product family name that uniquely identifies product family
     * 
     */
    public Optional<String> productFamilyName() {
        return Optional.ofNullable(this.productFamilyName);
    }

    /**
     * Represents product line name that uniquely identifies product line
     * 
     */
    @Import(name="productLineName")
    private @Nullable String productLineName;

    /**
     * @return Represents product line name that uniquely identifies product line
     * 
     */
    public Optional<String> productLineName() {
        return Optional.ofNullable(this.productLineName);
    }

    /**
     * Represents product name that uniquely identifies product
     * 
     */
    @Import(name="productName")
    private @Nullable String productName;

    /**
     * @return Represents product name that uniquely identifies product
     * 
     */
    public Optional<String> productName() {
        return Optional.ofNullable(this.productName);
    }

    private HierarchyInformation() {}

    private HierarchyInformation(HierarchyInformation $) {
        this.configurationName = $.configurationName;
        this.productFamilyName = $.productFamilyName;
        this.productLineName = $.productLineName;
        this.productName = $.productName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HierarchyInformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HierarchyInformation $;

        public Builder() {
            $ = new HierarchyInformation();
        }

        public Builder(HierarchyInformation defaults) {
            $ = new HierarchyInformation(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName Represents configuration name that uniquely identifies configuration
         * 
         * @return builder
         * 
         */
        public Builder configurationName(@Nullable String configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param productFamilyName Represents product family name that uniquely identifies product family
         * 
         * @return builder
         * 
         */
        public Builder productFamilyName(@Nullable String productFamilyName) {
            $.productFamilyName = productFamilyName;
            return this;
        }

        /**
         * @param productLineName Represents product line name that uniquely identifies product line
         * 
         * @return builder
         * 
         */
        public Builder productLineName(@Nullable String productLineName) {
            $.productLineName = productLineName;
            return this;
        }

        /**
         * @param productName Represents product name that uniquely identifies product
         * 
         * @return builder
         * 
         */
        public Builder productName(@Nullable String productName) {
            $.productName = productName;
            return this;
        }

        public HierarchyInformation build() {
            return $;
        }
    }

}
