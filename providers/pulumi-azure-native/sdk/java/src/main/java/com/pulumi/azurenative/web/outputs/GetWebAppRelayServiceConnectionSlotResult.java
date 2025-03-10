// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppRelayServiceConnectionSlotResult {
    private final @Nullable String biztalkUri;
    private final @Nullable String entityConnectionString;
    private final @Nullable String entityName;
    private final @Nullable String hostname;
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource Name.
     * 
     */
    private final String name;
    private final @Nullable Integer port;
    private final @Nullable String resourceConnectionString;
    private final @Nullable String resourceType;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWebAppRelayServiceConnectionSlotResult(
        @CustomType.Parameter("biztalkUri") @Nullable String biztalkUri,
        @CustomType.Parameter("entityConnectionString") @Nullable String entityConnectionString,
        @CustomType.Parameter("entityName") @Nullable String entityName,
        @CustomType.Parameter("hostname") @Nullable String hostname,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("resourceConnectionString") @Nullable String resourceConnectionString,
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("type") String type) {
        this.biztalkUri = biztalkUri;
        this.entityConnectionString = entityConnectionString;
        this.entityName = entityName;
        this.hostname = hostname;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.port = port;
        this.resourceConnectionString = resourceConnectionString;
        this.resourceType = resourceType;
        this.type = type;
    }

    public Optional<String> biztalkUri() {
        return Optional.ofNullable(this.biztalkUri);
    }
    public Optional<String> entityConnectionString() {
        return Optional.ofNullable(this.entityConnectionString);
    }
    public Optional<String> entityName() {
        return Optional.ofNullable(this.entityName);
    }
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of resource.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource Name.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> resourceConnectionString() {
        return Optional.ofNullable(this.resourceConnectionString);
    }
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
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

    public static Builder builder(GetWebAppRelayServiceConnectionSlotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String biztalkUri;
        private @Nullable String entityConnectionString;
        private @Nullable String entityName;
        private @Nullable String hostname;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable Integer port;
        private @Nullable String resourceConnectionString;
        private @Nullable String resourceType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppRelayServiceConnectionSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biztalkUri = defaults.biztalkUri;
    	      this.entityConnectionString = defaults.entityConnectionString;
    	      this.entityName = defaults.entityName;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.resourceConnectionString = defaults.resourceConnectionString;
    	      this.resourceType = defaults.resourceType;
    	      this.type = defaults.type;
        }

        public Builder biztalkUri(@Nullable String biztalkUri) {
            this.biztalkUri = biztalkUri;
            return this;
        }
        public Builder entityConnectionString(@Nullable String entityConnectionString) {
            this.entityConnectionString = entityConnectionString;
            return this;
        }
        public Builder entityName(@Nullable String entityName) {
            this.entityName = entityName;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder resourceConnectionString(@Nullable String resourceConnectionString) {
            this.resourceConnectionString = resourceConnectionString;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWebAppRelayServiceConnectionSlotResult build() {
            return new GetWebAppRelayServiceConnectionSlotResult(biztalkUri, entityConnectionString, entityName, hostname, id, kind, name, port, resourceConnectionString, resourceType, type);
        }
    }
}
