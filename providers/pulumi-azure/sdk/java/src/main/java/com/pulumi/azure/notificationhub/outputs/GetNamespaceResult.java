// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.notificationhub.outputs;

import com.pulumi.azure.notificationhub.outputs.GetNamespaceSku;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNamespaceResult {
    /**
     * @return Is this Notification Hub Namespace enabled?
     * 
     */
    private final Boolean enabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Azure Region in which this Notification Hub Namespace exists.
     * 
     */
    private final String location;
    /**
     * @return The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard.`
     * 
     */
    private final String name;
    /**
     * @return The Type of Namespace, such as `Messaging` or `NotificationHub`.
     * 
     */
    private final String namespaceType;
    private final String resourceGroupName;
    private final String servicebusEndpoint;
    /**
     * @return A `sku` block as defined below.
     * 
     */
    private final GetNamespaceSku sku;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetNamespaceResult(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceType") String namespaceType,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("servicebusEndpoint") String servicebusEndpoint,
        @CustomType.Parameter("sku") GetNamespaceSku sku,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.enabled = enabled;
        this.id = id;
        this.location = location;
        this.name = name;
        this.namespaceType = namespaceType;
        this.resourceGroupName = resourceGroupName;
        this.servicebusEndpoint = servicebusEndpoint;
        this.sku = sku;
        this.tags = tags;
    }

    /**
     * @return Is this Notification Hub Namespace enabled?
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Azure Region in which this Notification Hub Namespace exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The name of the SKU to use for this Notification Hub Namespace. Possible values are `Free`, `Basic` or `Standard.`
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Type of Namespace, such as `Messaging` or `NotificationHub`.
     * 
     */
    public String namespaceType() {
        return this.namespaceType;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public String servicebusEndpoint() {
        return this.servicebusEndpoint;
    }
    /**
     * @return A `sku` block as defined below.
     * 
     */
    public GetNamespaceSku sku() {
        return this.sku;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String id;
        private String location;
        private String name;
        private String namespaceType;
        private String resourceGroupName;
        private String servicebusEndpoint;
        private GetNamespaceSku sku;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.namespaceType = defaults.namespaceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicebusEndpoint = defaults.servicebusEndpoint;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
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
        public Builder namespaceType(String namespaceType) {
            this.namespaceType = Objects.requireNonNull(namespaceType);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder servicebusEndpoint(String servicebusEndpoint) {
            this.servicebusEndpoint = Objects.requireNonNull(servicebusEndpoint);
            return this;
        }
        public Builder sku(GetNamespaceSku sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetNamespaceResult build() {
            return new GetNamespaceResult(enabled, id, location, name, namespaceType, resourceGroupName, servicebusEndpoint, sku, tags);
        }
    }
}
