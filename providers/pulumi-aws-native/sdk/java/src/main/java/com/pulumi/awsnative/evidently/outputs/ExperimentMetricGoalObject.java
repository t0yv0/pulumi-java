// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently.outputs;

import com.pulumi.awsnative.evidently.enums.ExperimentMetricGoalObjectDesiredChange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExperimentMetricGoalObject {
    private final ExperimentMetricGoalObjectDesiredChange desiredChange;
    /**
     * @return The JSON path to reference the entity id in the event.
     * 
     */
    private final String entityIdKey;
    /**
     * @return Event patterns have the same structure as the events they match. Rules use event patterns to select events. An event pattern either matches an event or it doesn&#39;t.
     * 
     */
    private final String eventPattern;
    private final String metricName;
    private final @Nullable String unitLabel;
    /**
     * @return The JSON path to reference the numerical metric value in the event.
     * 
     */
    private final String valueKey;

    @CustomType.Constructor
    private ExperimentMetricGoalObject(
        @CustomType.Parameter("desiredChange") ExperimentMetricGoalObjectDesiredChange desiredChange,
        @CustomType.Parameter("entityIdKey") String entityIdKey,
        @CustomType.Parameter("eventPattern") String eventPattern,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("unitLabel") @Nullable String unitLabel,
        @CustomType.Parameter("valueKey") String valueKey) {
        this.desiredChange = desiredChange;
        this.entityIdKey = entityIdKey;
        this.eventPattern = eventPattern;
        this.metricName = metricName;
        this.unitLabel = unitLabel;
        this.valueKey = valueKey;
    }

    public ExperimentMetricGoalObjectDesiredChange desiredChange() {
        return this.desiredChange;
    }
    /**
     * @return The JSON path to reference the entity id in the event.
     * 
     */
    public String entityIdKey() {
        return this.entityIdKey;
    }
    /**
     * @return Event patterns have the same structure as the events they match. Rules use event patterns to select events. An event pattern either matches an event or it doesn&#39;t.
     * 
     */
    public String eventPattern() {
        return this.eventPattern;
    }
    public String metricName() {
        return this.metricName;
    }
    public Optional<String> unitLabel() {
        return Optional.ofNullable(this.unitLabel);
    }
    /**
     * @return The JSON path to reference the numerical metric value in the event.
     * 
     */
    public String valueKey() {
        return this.valueKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExperimentMetricGoalObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentMetricGoalObjectDesiredChange desiredChange;
        private String entityIdKey;
        private String eventPattern;
        private String metricName;
        private @Nullable String unitLabel;
        private String valueKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ExperimentMetricGoalObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredChange = defaults.desiredChange;
    	      this.entityIdKey = defaults.entityIdKey;
    	      this.eventPattern = defaults.eventPattern;
    	      this.metricName = defaults.metricName;
    	      this.unitLabel = defaults.unitLabel;
    	      this.valueKey = defaults.valueKey;
        }

        public Builder desiredChange(ExperimentMetricGoalObjectDesiredChange desiredChange) {
            this.desiredChange = Objects.requireNonNull(desiredChange);
            return this;
        }
        public Builder entityIdKey(String entityIdKey) {
            this.entityIdKey = Objects.requireNonNull(entityIdKey);
            return this;
        }
        public Builder eventPattern(String eventPattern) {
            this.eventPattern = Objects.requireNonNull(eventPattern);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder unitLabel(@Nullable String unitLabel) {
            this.unitLabel = unitLabel;
            return this;
        }
        public Builder valueKey(String valueKey) {
            this.valueKey = Objects.requireNonNull(valueKey);
            return this;
        }        public ExperimentMetricGoalObject build() {
            return new ExperimentMetricGoalObject(desiredChange, entityIdKey, eventPattern, metricName, unitLabel, valueKey);
        }
    }
}
