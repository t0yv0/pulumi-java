// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1EntityMetadataResponse {
    /**
     * @return Time at which the API proxy was created, in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * @return Time at which the API proxy was most recently modified, in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * @return The type of entity described
     * 
     */
    private final String subType;

    @CustomType.Constructor
    private GoogleCloudApigeeV1EntityMetadataResponse(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("subType") String subType) {
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.subType = subType;
    }

    /**
     * @return Time at which the API proxy was created, in milliseconds since epoch.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Time at which the API proxy was most recently modified, in milliseconds since epoch.
     * 
     */
    public String lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * @return The type of entity described
     * 
     */
    public String subType() {
        return this.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1EntityMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String lastModifiedAt;
        private String subType;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1EntityMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.subType = defaults.subType;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }
        public Builder subType(String subType) {
            this.subType = Objects.requireNonNull(subType);
            return this;
        }        public GoogleCloudApigeeV1EntityMetadataResponse build() {
            return new GoogleCloudApigeeV1EntityMetadataResponse(createdAt, lastModifiedAt, subType);
        }
    }
}
