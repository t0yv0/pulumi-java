// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkExperimentProfileResult {
    /**
     * @return The state of the Experiment
     * 
     */
    private final @Nullable String enabledState;
    /**
     * @return Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Resource status.
     * 
     */
    private final String resourceState;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetNetworkExperimentProfileResult(
        @CustomType.Parameter("enabledState") @Nullable String enabledState,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.enabledState = enabledState;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceState = resourceState;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The state of the Experiment
     * 
     */
    public Optional<String> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * @return Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource status.
     * 
     */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetNetworkExperimentProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabledState;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String resourceState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkExperimentProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledState = defaults.enabledState;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
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
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetNetworkExperimentProfileResult build() {
            return new GetNetworkExperimentProfileResult(enabledState, etag, id, location, name, resourceState, tags, type);
        }
    }
}
