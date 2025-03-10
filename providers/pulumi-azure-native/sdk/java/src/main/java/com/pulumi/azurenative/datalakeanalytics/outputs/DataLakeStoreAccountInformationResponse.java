// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataLakeStoreAccountInformationResponse {
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return The optional suffix for the Data Lake Store account.
     * 
     */
    private final String suffix;
    /**
     * @return The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DataLakeStoreAccountInformationResponse(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("suffix") String suffix,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.suffix = suffix;
        this.type = type;
    }

    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The optional suffix for the Data Lake Store account.
     * 
     */
    public String suffix() {
        return this.suffix;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataLakeStoreAccountInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String suffix;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataLakeStoreAccountInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.suffix = defaults.suffix;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder suffix(String suffix) {
            this.suffix = Objects.requireNonNull(suffix);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DataLakeStoreAccountInformationResponse build() {
            return new DataLakeStoreAccountInformationResponse(id, name, suffix, type);
        }
    }
}
