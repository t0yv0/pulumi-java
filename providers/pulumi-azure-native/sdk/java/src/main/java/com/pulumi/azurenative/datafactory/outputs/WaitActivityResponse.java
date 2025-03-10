// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WaitActivityResponse {
    /**
     * @return Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * @return Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Activity name.
     * 
     */
    private final String name;
    /**
     * @return Type of activity.
     * Expected value is &#39;Wait&#39;.
     * 
     */
    private final String type;
    /**
     * @return Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * @return Duration in seconds.
     * 
     */
    private final Object waitTimeInSeconds;

    @CustomType.Constructor
    private WaitActivityResponse(
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties,
        @CustomType.Parameter("waitTimeInSeconds") Object waitTimeInSeconds) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = name;
        this.type = type;
        this.userProperties = userProperties;
        this.waitTimeInSeconds = waitTimeInSeconds;
    }

    /**
     * @return Activity depends on condition.
     * 
     */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * @return Activity description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Activity name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Type of activity.
     * Expected value is &#39;Wait&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Activity user properties.
     * 
     */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * @return Duration in seconds.
     * 
     */
    public Object waitTimeInSeconds() {
        return this.waitTimeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private Object waitTimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.waitTimeInSeconds = defaults.waitTimeInSeconds;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder waitTimeInSeconds(Object waitTimeInSeconds) {
            this.waitTimeInSeconds = Objects.requireNonNull(waitTimeInSeconds);
            return this;
        }        public WaitActivityResponse build() {
            return new WaitActivityResponse(dependsOn, description, name, type, userProperties, waitTimeInSeconds);
        }
    }
}
