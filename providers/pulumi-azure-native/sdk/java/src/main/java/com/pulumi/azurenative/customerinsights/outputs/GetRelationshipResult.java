// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.azurenative.customerinsights.outputs.PropertyDefinitionResponse;
import com.pulumi.azurenative.customerinsights.outputs.RelationshipTypeMappingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRelationshipResult {
    /**
     * @return The Relationship Cardinality.
     * 
     */
    private final @Nullable String cardinality;
    /**
     * @return Localized descriptions for the Relationship.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * @return Localized display name for the Relationship.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * @return The expiry date time in UTC.
     * 
     */
    private final @Nullable String expiryDateTimeUtc;
    /**
     * @return The properties of the Relationship.
     * 
     */
    private final @Nullable List<PropertyDefinitionResponse> fields;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Optional property to be used to map fields in profile to their strong ids in related profile.
     * 
     */
    private final @Nullable List<RelationshipTypeMappingResponse> lookupMappings;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Profile type.
     * 
     */
    private final String profileType;
    /**
     * @return Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * @return Related profile being referenced.
     * 
     */
    private final String relatedProfileType;
    /**
     * @return The relationship guid id.
     * 
     */
    private final String relationshipGuidId;
    /**
     * @return The Relationship name.
     * 
     */
    private final String relationshipName;
    /**
     * @return The hub name.
     * 
     */
    private final String tenantId;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRelationshipResult(
        @CustomType.Parameter("cardinality") @Nullable String cardinality,
        @CustomType.Parameter("description") @Nullable Map<String,String> description,
        @CustomType.Parameter("displayName") @Nullable Map<String,String> displayName,
        @CustomType.Parameter("expiryDateTimeUtc") @Nullable String expiryDateTimeUtc,
        @CustomType.Parameter("fields") @Nullable List<PropertyDefinitionResponse> fields,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lookupMappings") @Nullable List<RelationshipTypeMappingResponse> lookupMappings,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("profileType") String profileType,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("relatedProfileType") String relatedProfileType,
        @CustomType.Parameter("relationshipGuidId") String relationshipGuidId,
        @CustomType.Parameter("relationshipName") String relationshipName,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.cardinality = cardinality;
        this.description = description;
        this.displayName = displayName;
        this.expiryDateTimeUtc = expiryDateTimeUtc;
        this.fields = fields;
        this.id = id;
        this.lookupMappings = lookupMappings;
        this.name = name;
        this.profileType = profileType;
        this.provisioningState = provisioningState;
        this.relatedProfileType = relatedProfileType;
        this.relationshipGuidId = relationshipGuidId;
        this.relationshipName = relationshipName;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The Relationship Cardinality.
     * 
     */
    public Optional<String> cardinality() {
        return Optional.ofNullable(this.cardinality);
    }
    /**
     * @return Localized descriptions for the Relationship.
     * 
     */
    public Map<String,String> description() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * @return Localized display name for the Relationship.
     * 
     */
    public Map<String,String> displayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * @return The expiry date time in UTC.
     * 
     */
    public Optional<String> expiryDateTimeUtc() {
        return Optional.ofNullable(this.expiryDateTimeUtc);
    }
    /**
     * @return The properties of the Relationship.
     * 
     */
    public List<PropertyDefinitionResponse> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Optional property to be used to map fields in profile to their strong ids in related profile.
     * 
     */
    public List<RelationshipTypeMappingResponse> lookupMappings() {
        return this.lookupMappings == null ? List.of() : this.lookupMappings;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Profile type.
     * 
     */
    public String profileType() {
        return this.profileType;
    }
    /**
     * @return Provisioning state.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Related profile being referenced.
     * 
     */
    public String relatedProfileType() {
        return this.relatedProfileType;
    }
    /**
     * @return The relationship guid id.
     * 
     */
    public String relationshipGuidId() {
        return this.relationshipGuidId;
    }
    /**
     * @return The Relationship name.
     * 
     */
    public String relationshipName() {
        return this.relationshipName;
    }
    /**
     * @return The hub name.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRelationshipResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cardinality;
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private @Nullable String expiryDateTimeUtc;
        private @Nullable List<PropertyDefinitionResponse> fields;
        private String id;
        private @Nullable List<RelationshipTypeMappingResponse> lookupMappings;
        private String name;
        private String profileType;
        private String provisioningState;
        private String relatedProfileType;
        private String relationshipGuidId;
        private String relationshipName;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRelationshipResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.expiryDateTimeUtc = defaults.expiryDateTimeUtc;
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.lookupMappings = defaults.lookupMappings;
    	      this.name = defaults.name;
    	      this.profileType = defaults.profileType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.relatedProfileType = defaults.relatedProfileType;
    	      this.relationshipGuidId = defaults.relationshipGuidId;
    	      this.relationshipName = defaults.relationshipName;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder cardinality(@Nullable String cardinality) {
            this.cardinality = cardinality;
            return this;
        }
        public Builder description(@Nullable Map<String,String> description) {
            this.description = description;
            return this;
        }
        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder expiryDateTimeUtc(@Nullable String expiryDateTimeUtc) {
            this.expiryDateTimeUtc = expiryDateTimeUtc;
            return this;
        }
        public Builder fields(@Nullable List<PropertyDefinitionResponse> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(PropertyDefinitionResponse... fields) {
            return fields(List.of(fields));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lookupMappings(@Nullable List<RelationshipTypeMappingResponse> lookupMappings) {
            this.lookupMappings = lookupMappings;
            return this;
        }
        public Builder lookupMappings(RelationshipTypeMappingResponse... lookupMappings) {
            return lookupMappings(List.of(lookupMappings));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder profileType(String profileType) {
            this.profileType = Objects.requireNonNull(profileType);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder relatedProfileType(String relatedProfileType) {
            this.relatedProfileType = Objects.requireNonNull(relatedProfileType);
            return this;
        }
        public Builder relationshipGuidId(String relationshipGuidId) {
            this.relationshipGuidId = Objects.requireNonNull(relationshipGuidId);
            return this;
        }
        public Builder relationshipName(String relationshipName) {
            this.relationshipName = Objects.requireNonNull(relationshipName);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRelationshipResult build() {
            return new GetRelationshipResult(cardinality, description, displayName, expiryDateTimeUtc, fields, id, lookupMappings, name, profileType, provisioningState, relatedProfileType, relationshipGuidId, relationshipName, tenantId, type);
        }
    }
}
