// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.outputs;

import com.pulumi.awsnative.customerprofiles.outputs.ObjectTypeFieldMap;
import com.pulumi.awsnative.customerprofiles.outputs.ObjectTypeKeyMap;
import com.pulumi.awsnative.customerprofiles.outputs.ObjectTypeTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetObjectTypeResult {
    /**
     * @return Indicates whether a profile should be created when data is received.
     * 
     */
    private final @Nullable Boolean allowProfileCreation;
    /**
     * @return The time of this integration got created.
     * 
     */
    private final @Nullable String createdAt;
    /**
     * @return Description of the profile object type.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The default encryption key
     * 
     */
    private final @Nullable String encryptionKey;
    /**
     * @return The default number of days until the data within the domain expires.
     * 
     */
    private final @Nullable Integer expirationDays;
    /**
     * @return A list of the name and ObjectType field.
     * 
     */
    private final @Nullable List<ObjectTypeFieldMap> fields;
    /**
     * @return A list of unique keys that can be used to map data to the profile.
     * 
     */
    private final @Nullable List<ObjectTypeKeyMap> keys;
    /**
     * @return The time of this integration got last updated at.
     * 
     */
    private final @Nullable String lastUpdatedAt;
    /**
     * @return The tags (keys and values) associated with the integration.
     * 
     */
    private final @Nullable List<ObjectTypeTag> tags;
    /**
     * @return A unique identifier for the object template.
     * 
     */
    private final @Nullable String templateId;

    @CustomType.Constructor
    private GetObjectTypeResult(
        @CustomType.Parameter("allowProfileCreation") @Nullable Boolean allowProfileCreation,
        @CustomType.Parameter("createdAt") @Nullable String createdAt,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encryptionKey") @Nullable String encryptionKey,
        @CustomType.Parameter("expirationDays") @Nullable Integer expirationDays,
        @CustomType.Parameter("fields") @Nullable List<ObjectTypeFieldMap> fields,
        @CustomType.Parameter("keys") @Nullable List<ObjectTypeKeyMap> keys,
        @CustomType.Parameter("lastUpdatedAt") @Nullable String lastUpdatedAt,
        @CustomType.Parameter("tags") @Nullable List<ObjectTypeTag> tags,
        @CustomType.Parameter("templateId") @Nullable String templateId) {
        this.allowProfileCreation = allowProfileCreation;
        this.createdAt = createdAt;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.expirationDays = expirationDays;
        this.fields = fields;
        this.keys = keys;
        this.lastUpdatedAt = lastUpdatedAt;
        this.tags = tags;
        this.templateId = templateId;
    }

    /**
     * @return Indicates whether a profile should be created when data is received.
     * 
     */
    public Optional<Boolean> allowProfileCreation() {
        return Optional.ofNullable(this.allowProfileCreation);
    }
    /**
     * @return The time of this integration got created.
     * 
     */
    public Optional<String> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * @return Description of the profile object type.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The default encryption key
     * 
     */
    public Optional<String> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * @return The default number of days until the data within the domain expires.
     * 
     */
    public Optional<Integer> expirationDays() {
        return Optional.ofNullable(this.expirationDays);
    }
    /**
     * @return A list of the name and ObjectType field.
     * 
     */
    public List<ObjectTypeFieldMap> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * @return A list of unique keys that can be used to map data to the profile.
     * 
     */
    public List<ObjectTypeKeyMap> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * @return The time of this integration got last updated at.
     * 
     */
    public Optional<String> lastUpdatedAt() {
        return Optional.ofNullable(this.lastUpdatedAt);
    }
    /**
     * @return The tags (keys and values) associated with the integration.
     * 
     */
    public List<ObjectTypeTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return A unique identifier for the object template.
     * 
     */
    public Optional<String> templateId() {
        return Optional.ofNullable(this.templateId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowProfileCreation;
        private @Nullable String createdAt;
        private @Nullable String description;
        private @Nullable String encryptionKey;
        private @Nullable Integer expirationDays;
        private @Nullable List<ObjectTypeFieldMap> fields;
        private @Nullable List<ObjectTypeKeyMap> keys;
        private @Nullable String lastUpdatedAt;
        private @Nullable List<ObjectTypeTag> tags;
        private @Nullable String templateId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowProfileCreation = defaults.allowProfileCreation;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.expirationDays = defaults.expirationDays;
    	      this.fields = defaults.fields;
    	      this.keys = defaults.keys;
    	      this.lastUpdatedAt = defaults.lastUpdatedAt;
    	      this.tags = defaults.tags;
    	      this.templateId = defaults.templateId;
        }

        public Builder allowProfileCreation(@Nullable Boolean allowProfileCreation) {
            this.allowProfileCreation = allowProfileCreation;
            return this;
        }
        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder expirationDays(@Nullable Integer expirationDays) {
            this.expirationDays = expirationDays;
            return this;
        }
        public Builder fields(@Nullable List<ObjectTypeFieldMap> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(ObjectTypeFieldMap... fields) {
            return fields(List.of(fields));
        }
        public Builder keys(@Nullable List<ObjectTypeKeyMap> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(ObjectTypeKeyMap... keys) {
            return keys(List.of(keys));
        }
        public Builder lastUpdatedAt(@Nullable String lastUpdatedAt) {
            this.lastUpdatedAt = lastUpdatedAt;
            return this;
        }
        public Builder tags(@Nullable List<ObjectTypeTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ObjectTypeTag... tags) {
            return tags(List.of(tags));
        }
        public Builder templateId(@Nullable String templateId) {
            this.templateId = templateId;
            return this;
        }        public GetObjectTypeResult build() {
            return new GetObjectTypeResult(allowProfileCreation, createdAt, description, encryptionKey, expirationDays, fields, keys, lastUpdatedAt, tags, templateId);
        }
    }
}
