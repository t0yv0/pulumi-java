// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.run_v1.outputs.DomainMappingSpecResponse;
import com.pulumi.googlenative.run_v1.outputs.DomainMappingStatusResponse;
import com.pulumi.googlenative.run_v1.outputs.ObjectMetaResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainMappingResult {
    /**
     * @return The API version for this call such as &#34;domains.cloudrun.com/v1&#34;.
     * 
     */
    private final String apiVersion;
    /**
     * @return The kind of resource, in this case &#34;DomainMapping&#34;.
     * 
     */
    private final String kind;
    /**
     * @return Metadata associated with this BuildTemplate.
     * 
     */
    private final ObjectMetaResponse metadata;
    /**
     * @return The spec for this DomainMapping.
     * 
     */
    private final DomainMappingSpecResponse spec;
    /**
     * @return The current status of the DomainMapping.
     * 
     */
    private final DomainMappingStatusResponse status;

    @CustomType.Constructor
    private GetDomainMappingResult(
        @CustomType.Parameter("apiVersion") String apiVersion,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("metadata") ObjectMetaResponse metadata,
        @CustomType.Parameter("spec") DomainMappingSpecResponse spec,
        @CustomType.Parameter("status") DomainMappingStatusResponse status) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * @return The API version for this call such as &#34;domains.cloudrun.com/v1&#34;.
     * 
     */
    public String apiVersion() {
        return this.apiVersion;
    }
    /**
     * @return The kind of resource, in this case &#34;DomainMapping&#34;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Metadata associated with this BuildTemplate.
     * 
     */
    public ObjectMetaResponse metadata() {
        return this.metadata;
    }
    /**
     * @return The spec for this DomainMapping.
     * 
     */
    public DomainMappingSpecResponse spec() {
        return this.spec;
    }
    /**
     * @return The current status of the DomainMapping.
     * 
     */
    public DomainMappingStatusResponse status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainMappingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiVersion;
        private String kind;
        private ObjectMetaResponse metadata;
        private DomainMappingSpecResponse spec;
        private DomainMappingStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainMappingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.spec = defaults.spec;
    	      this.status = defaults.status;
        }

        public Builder apiVersion(String apiVersion) {
            this.apiVersion = Objects.requireNonNull(apiVersion);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder metadata(ObjectMetaResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder spec(DomainMappingSpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public Builder status(DomainMappingStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetDomainMappingResult build() {
            return new GetDomainMappingResult(apiVersion, kind, metadata, spec, status);
        }
    }
}
