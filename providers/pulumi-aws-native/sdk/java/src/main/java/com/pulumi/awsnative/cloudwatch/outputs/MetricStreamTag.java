// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudwatch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricStreamTag {
    /**
     * @return A unique identifier for the tag.
     * 
     */
    private final String key;
    /**
     * @return An optional string, which you can use to describe or define the tag.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private MetricStreamTag(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") @Nullable String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return A unique identifier for the tag.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return An optional string, which you can use to describe or define the tag.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricStreamTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricStreamTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public MetricStreamTag build() {
            return new MetricStreamTag(key, value);
        }
    }
}
