// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaResponse {
    @CustomType.Constructor
    private GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaResponse() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaResponse build() {
            return new GoogleCloudDatacatalogV1PhysicalSchemaOrcSchemaResponse();
        }
    }
}
