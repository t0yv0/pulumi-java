// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.CloudServiceRoleSkuResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudServiceRoleProfilePropertiesResponse {
    /**
     * @return Resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Describes the cloud service role sku.
     * 
     */
    private final @Nullable CloudServiceRoleSkuResponse sku;

    @CustomType.Constructor
    private CloudServiceRoleProfilePropertiesResponse(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("sku") @Nullable CloudServiceRoleSkuResponse sku) {
        this.name = name;
        this.sku = sku;
    }

    /**
     * @return Resource name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Describes the cloud service role sku.
     * 
     */
    public Optional<CloudServiceRoleSkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceRoleProfilePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable CloudServiceRoleSkuResponse sku;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceRoleProfilePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder sku(@Nullable CloudServiceRoleSkuResponse sku) {
            this.sku = sku;
            return this;
        }        public CloudServiceRoleProfilePropertiesResponse build() {
            return new CloudServiceRoleProfilePropertiesResponse(name, sku);
        }
    }
}
