// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetElasticPoolSkus {
    /**
     * @return The scale up/out capacity, representing server&#39;s compute units.
     * 
     */
    private final Integer capacity;
    /**
     * @return The `family` of hardware.
     * 
     */
    private final String family;
    /**
     * @return The name of the elastic pool.
     * 
     */
    private final String name;
    /**
     * @return The tier of the particular SKU.
     * 
     */
    private final String tier;

    @CustomType.Constructor
    private GetElasticPoolSkus(
        @CustomType.Parameter("capacity") Integer capacity,
        @CustomType.Parameter("family") String family,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = name;
        this.tier = tier;
    }

    /**
     * @return The scale up/out capacity, representing server&#39;s compute units.
     * 
     */
    public Integer capacity() {
        return this.capacity;
    }
    /**
     * @return The `family` of hardware.
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return The name of the elastic pool.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The tier of the particular SKU.
     * 
     */
    public String tier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticPoolSkus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer capacity;
        private String family;
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticPoolSkus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public GetElasticPoolSkus build() {
            return new GetElasticPoolSkus(capacity, family, name, tier);
        }
    }
}
