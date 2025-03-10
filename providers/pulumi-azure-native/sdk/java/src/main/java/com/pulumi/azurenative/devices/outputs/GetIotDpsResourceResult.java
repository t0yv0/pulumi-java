// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.azurenative.devices.outputs.IotDpsPropertiesDescriptionResponse;
import com.pulumi.azurenative.devices.outputs.IotDpsSkuInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIotDpsResourceResult {
    /**
     * @return The Etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal ETag convention.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The resource location.
     * 
     */
    private final String location;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return Service specific properties for a provisioning service
     * 
     */
    private final IotDpsPropertiesDescriptionResponse properties;
    /**
     * @return Sku info for a provisioning Service.
     * 
     */
    private final IotDpsSkuInfoResponse sku;
    /**
     * @return The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIotDpsResourceResult(
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") IotDpsPropertiesDescriptionResponse properties,
        @CustomType.Parameter("sku") IotDpsSkuInfoResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The Etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal ETag convention.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
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
    public String location() {
        return this.location;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Service specific properties for a provisioning service
     * 
     */
    public IotDpsPropertiesDescriptionResponse properties() {
        return this.properties;
    }
    /**
     * @return Sku info for a provisioning Service.
     * 
     */
    public IotDpsSkuInfoResponse sku() {
        return this.sku;
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetIotDpsResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String location;
        private String name;
        private IotDpsPropertiesDescriptionResponse properties;
        private IotDpsSkuInfoResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotDpsResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(IotDpsPropertiesDescriptionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder sku(IotDpsSkuInfoResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIotDpsResourceResult build() {
            return new GetIotDpsResourceResult(etag, id, location, name, properties, sku, tags, type);
        }
    }
}
