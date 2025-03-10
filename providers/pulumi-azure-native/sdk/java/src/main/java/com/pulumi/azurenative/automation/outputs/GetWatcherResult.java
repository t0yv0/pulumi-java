// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWatcherResult {
    /**
     * @return Gets or sets the creation time.
     * 
     */
    private final String creationTime;
    /**
     * @return Gets or sets the description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Gets or sets the frequency at which the watcher is invoked.
     * 
     */
    private final @Nullable Double executionFrequencyInSeconds;
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    private final String id;
    /**
     * @return Details of the user who last modified the watcher.
     * 
     */
    private final String lastModifiedBy;
    /**
     * @return Gets or sets the last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Gets or sets the name of the script the watcher is attached to, i.e. the name of an existing runbook.
     * 
     */
    private final @Nullable String scriptName;
    /**
     * @return Gets or sets the parameters of the script.
     * 
     */
    private final @Nullable Map<String,String> scriptParameters;
    /**
     * @return Gets or sets the name of the hybrid worker group the watcher will run on.
     * 
     */
    private final @Nullable String scriptRunOn;
    /**
     * @return Gets the current status of the watcher.
     * 
     */
    private final String status;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWatcherResult(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("executionFrequencyInSeconds") @Nullable Double executionFrequencyInSeconds,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModifiedBy") String lastModifiedBy,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("scriptName") @Nullable String scriptName,
        @CustomType.Parameter("scriptParameters") @Nullable Map<String,String> scriptParameters,
        @CustomType.Parameter("scriptRunOn") @Nullable String scriptRunOn,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.creationTime = creationTime;
        this.description = description;
        this.etag = etag;
        this.executionFrequencyInSeconds = executionFrequencyInSeconds;
        this.id = id;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.scriptName = scriptName;
        this.scriptParameters = scriptParameters;
        this.scriptRunOn = scriptRunOn;
        this.status = status;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Gets or sets the creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return Gets or sets the description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Gets or sets the etag of the resource.
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Gets or sets the frequency at which the watcher is invoked.
     * 
     */
    public Optional<Double> executionFrequencyInSeconds() {
        return Optional.ofNullable(this.executionFrequencyInSeconds);
    }
    /**
     * @return Fully qualified resource Id for the resource
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Details of the user who last modified the watcher.
     * 
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * @return Gets or sets the last modified time.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Gets or sets the name of the script the watcher is attached to, i.e. the name of an existing runbook.
     * 
     */
    public Optional<String> scriptName() {
        return Optional.ofNullable(this.scriptName);
    }
    /**
     * @return Gets or sets the parameters of the script.
     * 
     */
    public Map<String,String> scriptParameters() {
        return this.scriptParameters == null ? Map.of() : this.scriptParameters;
    }
    /**
     * @return Gets or sets the name of the hybrid worker group the watcher will run on.
     * 
     */
    public Optional<String> scriptRunOn() {
        return Optional.ofNullable(this.scriptRunOn);
    }
    /**
     * @return Gets the current status of the watcher.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The type of the resource.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWatcherResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private @Nullable String description;
        private @Nullable String etag;
        private @Nullable Double executionFrequencyInSeconds;
        private String id;
        private String lastModifiedBy;
        private String lastModifiedTime;
        private @Nullable String location;
        private String name;
        private @Nullable String scriptName;
        private @Nullable Map<String,String> scriptParameters;
        private @Nullable String scriptRunOn;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWatcherResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.executionFrequencyInSeconds = defaults.executionFrequencyInSeconds;
    	      this.id = defaults.id;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scriptName = defaults.scriptName;
    	      this.scriptParameters = defaults.scriptParameters;
    	      this.scriptRunOn = defaults.scriptRunOn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder executionFrequencyInSeconds(@Nullable Double executionFrequencyInSeconds) {
            this.executionFrequencyInSeconds = executionFrequencyInSeconds;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
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
        public Builder scriptName(@Nullable String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public Builder scriptParameters(@Nullable Map<String,String> scriptParameters) {
            this.scriptParameters = scriptParameters;
            return this;
        }
        public Builder scriptRunOn(@Nullable String scriptRunOn) {
            this.scriptRunOn = scriptRunOn;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWatcherResult build() {
            return new GetWatcherResult(creationTime, description, etag, executionFrequencyInSeconds, id, lastModifiedBy, lastModifiedTime, location, name, scriptName, scriptParameters, scriptRunOn, status, tags, type);
        }
    }
}
