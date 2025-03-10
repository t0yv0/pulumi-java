// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDataCollectorResult {
    /**
     * @return The time at which the data collector was created in milliseconds since the epoch.
     * 
     */
    private final String createdAt;
    /**
     * @return A description of the data collector.
     * 
     */
    private final String description;
    /**
     * @return The time at which the Data Collector was last updated in milliseconds since the epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * @return ID of the data collector. Must begin with `dc_`.
     * 
     */
    private final String name;
    /**
     * @return Immutable. The type of data this data collector will collect.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDataCollectorResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.createdAt = createdAt;
        this.description = description;
        this.lastModifiedAt = lastModifiedAt;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The time at which the data collector was created in milliseconds since the epoch.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return A description of the data collector.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The time at which the Data Collector was last updated in milliseconds since the epoch.
     * 
     */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * @return ID of the data collector. Must begin with `dc_`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Immutable. The type of data this data collector will collect.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String description;
        private String lastModifiedAt;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetDataCollectorResult build() {
            return new GetDataCollectorResult(createdAt, description, lastModifiedAt, name, type);
        }
    }
}
