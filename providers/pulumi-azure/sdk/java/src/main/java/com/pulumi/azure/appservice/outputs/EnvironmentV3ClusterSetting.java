// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvironmentV3ClusterSetting {
    /**
     * @return The name of the Cluster Setting.
     * 
     */
    private final String name;
    /**
     * @return The value for the Cluster Setting.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private EnvironmentV3ClusterSetting(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * @return The name of the Cluster Setting.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value for the Cluster Setting.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentV3ClusterSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentV3ClusterSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EnvironmentV3ClusterSetting build() {
            return new EnvironmentV3ClusterSetting(name, value);
        }
    }
}
