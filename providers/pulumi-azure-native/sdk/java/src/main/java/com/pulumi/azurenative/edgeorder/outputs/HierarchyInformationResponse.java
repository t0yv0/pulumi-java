// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.edgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HierarchyInformationResponse {
    /**
     * @return Represents configuration name that uniquely identifies configuration
     * 
     */
    private final @Nullable String configurationName;
    /**
     * @return Represents product family name that uniquely identifies product family
     * 
     */
    private final @Nullable String productFamilyName;
    /**
     * @return Represents product line name that uniquely identifies product line
     * 
     */
    private final @Nullable String productLineName;
    /**
     * @return Represents product name that uniquely identifies product
     * 
     */
    private final @Nullable String productName;

    @CustomType.Constructor
    private HierarchyInformationResponse(
        @CustomType.Parameter("configurationName") @Nullable String configurationName,
        @CustomType.Parameter("productFamilyName") @Nullable String productFamilyName,
        @CustomType.Parameter("productLineName") @Nullable String productLineName,
        @CustomType.Parameter("productName") @Nullable String productName) {
        this.configurationName = configurationName;
        this.productFamilyName = productFamilyName;
        this.productLineName = productLineName;
        this.productName = productName;
    }

    /**
     * @return Represents configuration name that uniquely identifies configuration
     * 
     */
    public Optional<String> configurationName() {
        return Optional.ofNullable(this.configurationName);
    }
    /**
     * @return Represents product family name that uniquely identifies product family
     * 
     */
    public Optional<String> productFamilyName() {
        return Optional.ofNullable(this.productFamilyName);
    }
    /**
     * @return Represents product line name that uniquely identifies product line
     * 
     */
    public Optional<String> productLineName() {
        return Optional.ofNullable(this.productLineName);
    }
    /**
     * @return Represents product name that uniquely identifies product
     * 
     */
    public Optional<String> productName() {
        return Optional.ofNullable(this.productName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configurationName;
        private @Nullable String productFamilyName;
        private @Nullable String productLineName;
        private @Nullable String productName;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.productFamilyName = defaults.productFamilyName;
    	      this.productLineName = defaults.productLineName;
    	      this.productName = defaults.productName;
        }

        public Builder configurationName(@Nullable String configurationName) {
            this.configurationName = configurationName;
            return this;
        }
        public Builder productFamilyName(@Nullable String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }
        public Builder productLineName(@Nullable String productLineName) {
            this.productLineName = productLineName;
            return this;
        }
        public Builder productName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }        public HierarchyInformationResponse build() {
            return new HierarchyInformationResponse(configurationName, productFamilyName, productLineName, productName);
        }
    }
}
