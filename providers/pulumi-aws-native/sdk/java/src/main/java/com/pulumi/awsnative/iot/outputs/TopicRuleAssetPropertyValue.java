// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.TopicRuleAssetPropertyTimestamp;
import com.pulumi.awsnative.iot.outputs.TopicRuleAssetPropertyVariant;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleAssetPropertyValue {
    private final @Nullable String quality;
    private final TopicRuleAssetPropertyTimestamp timestamp;
    private final TopicRuleAssetPropertyVariant value;

    @CustomType.Constructor
    private TopicRuleAssetPropertyValue(
        @CustomType.Parameter("quality") @Nullable String quality,
        @CustomType.Parameter("timestamp") TopicRuleAssetPropertyTimestamp timestamp,
        @CustomType.Parameter("value") TopicRuleAssetPropertyVariant value) {
        this.quality = quality;
        this.timestamp = timestamp;
        this.value = value;
    }

    public Optional<String> quality() {
        return Optional.ofNullable(this.quality);
    }
    public TopicRuleAssetPropertyTimestamp timestamp() {
        return this.timestamp;
    }
    public TopicRuleAssetPropertyVariant value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleAssetPropertyValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String quality;
        private TopicRuleAssetPropertyTimestamp timestamp;
        private TopicRuleAssetPropertyVariant value;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleAssetPropertyValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quality = defaults.quality;
    	      this.timestamp = defaults.timestamp;
    	      this.value = defaults.value;
        }

        public Builder quality(@Nullable String quality) {
            this.quality = quality;
            return this;
        }
        public Builder timestamp(TopicRuleAssetPropertyTimestamp timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }
        public Builder value(TopicRuleAssetPropertyVariant value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public TopicRuleAssetPropertyValue build() {
            return new TopicRuleAssetPropertyValue(quality, timestamp, value);
        }
    }
}
