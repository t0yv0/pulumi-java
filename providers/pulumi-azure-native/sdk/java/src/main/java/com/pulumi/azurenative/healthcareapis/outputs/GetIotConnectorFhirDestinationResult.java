// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.outputs;

import com.pulumi.azurenative.healthcareapis.outputs.IotMappingPropertiesResponse;
import com.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIotConnectorFhirDestinationResult {
    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return FHIR Mappings
     * 
     */
    private final IotMappingPropertiesResponse fhirMapping;
    /**
     * @return Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    private final String fhirServiceResourceId;
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return Determines how resource identity is resolved on the destination.
     * 
     */
    private final String resourceIdentityResolutionType;
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIotConnectorFhirDestinationResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("fhirMapping") IotMappingPropertiesResponse fhirMapping,
        @CustomType.Parameter("fhirServiceResourceId") String fhirServiceResourceId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceIdentityResolutionType") String resourceIdentityResolutionType,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.fhirMapping = fhirMapping;
        this.fhirServiceResourceId = fhirServiceResourceId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceIdentityResolutionType = resourceIdentityResolutionType;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return FHIR Mappings
     * 
     */
    public IotMappingPropertiesResponse fhirMapping() {
        return this.fhirMapping;
    }
    /**
     * @return Fully qualified resource id of the FHIR service to connect to.
     * 
     */
    public String fhirServiceResourceId() {
        return this.fhirServiceResourceId;
    }
    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Determines how resource identity is resolved on the destination.
     * 
     */
    public String resourceIdentityResolutionType() {
        return this.resourceIdentityResolutionType;
    }
    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
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

    public static Builder builder(GetIotConnectorFhirDestinationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private IotMappingPropertiesResponse fhirMapping;
        private String fhirServiceResourceId;
        private String id;
        private @Nullable String location;
        private String name;
        private String resourceIdentityResolutionType;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotConnectorFhirDestinationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.fhirMapping = defaults.fhirMapping;
    	      this.fhirServiceResourceId = defaults.fhirServiceResourceId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceIdentityResolutionType = defaults.resourceIdentityResolutionType;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder fhirMapping(IotMappingPropertiesResponse fhirMapping) {
            this.fhirMapping = Objects.requireNonNull(fhirMapping);
            return this;
        }
        public Builder fhirServiceResourceId(String fhirServiceResourceId) {
            this.fhirServiceResourceId = Objects.requireNonNull(fhirServiceResourceId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceIdentityResolutionType(String resourceIdentityResolutionType) {
            this.resourceIdentityResolutionType = Objects.requireNonNull(resourceIdentityResolutionType);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIotConnectorFhirDestinationResult build() {
            return new GetIotConnectorFhirDestinationResult(etag, fhirMapping, fhirServiceResourceId, id, location, name, resourceIdentityResolutionType, systemData, type);
        }
    }
}
