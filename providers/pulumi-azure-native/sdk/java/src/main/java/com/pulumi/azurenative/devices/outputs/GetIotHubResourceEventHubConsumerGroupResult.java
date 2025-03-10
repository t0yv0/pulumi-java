// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetIotHubResourceEventHubConsumerGroupResult {
    /**
     * @return The etag.
     * 
     */
    private final String etag;
    /**
     * @return The Event Hub-compatible consumer group identifier.
     * 
     */
    private final String id;
    /**
     * @return The Event Hub-compatible consumer group name.
     * 
     */
    private final String name;
    /**
     * @return The tags.
     * 
     */
    private final Map<String,String> properties;
    /**
     * @return the resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIotHubResourceEventHubConsumerGroupResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Map<String,String> properties,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * @return The etag.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The Event Hub-compatible consumer group identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Event Hub-compatible consumer group name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The tags.
     * 
     */
    public Map<String,String> properties() {
        return this.properties;
    }
    /**
     * @return the resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotHubResourceEventHubConsumerGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private Map<String,String> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotHubResourceEventHubConsumerGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIotHubResourceEventHubConsumerGroupResult build() {
            return new GetIotHubResourceEventHubConsumerGroupResult(etag, id, name, properties, type);
        }
    }
}
