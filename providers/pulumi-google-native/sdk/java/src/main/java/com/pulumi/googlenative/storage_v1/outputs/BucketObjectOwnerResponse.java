// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketObjectOwnerResponse {
    /**
     * @return The entity, in the form user-userId.
     * 
     */
    private final String entity;
    /**
     * @return The ID for the entity.
     * 
     */
    private final String entityId;

    @CustomType.Constructor
    private BucketObjectOwnerResponse(
        @CustomType.Parameter("entity") String entity,
        @CustomType.Parameter("entityId") String entityId) {
        this.entity = entity;
        this.entityId = entityId;
    }

    /**
     * @return The entity, in the form user-userId.
     * 
     */
    public String entity() {
        return this.entity;
    }
    /**
     * @return The ID for the entity.
     * 
     */
    public String entityId() {
        return this.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectOwnerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entity;
        private String entityId;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectOwnerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
        }

        public Builder entity(String entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }
        public Builder entityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }        public BucketObjectOwnerResponse build() {
            return new BucketObjectOwnerResponse(entity, entityId);
        }
    }
}
