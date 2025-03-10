// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.outputs;

import com.pulumi.aws.cloudtrail.outputs.EventDataStoreAdvancedEventSelectorFieldSelector;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventDataStoreAdvancedEventSelector {
    /**
     * @return Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    private final @Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors;
    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private EventDataStoreAdvancedEventSelector(
        @CustomType.Parameter("fieldSelectors") @Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors,
        @CustomType.Parameter("name") @Nullable String name) {
        this.fieldSelectors = fieldSelectors;
        this.name = name;
    }

    /**
     * @return Specifies the selector statements in an advanced event selector. Fields documented below.
     * 
     */
    public List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors() {
        return this.fieldSelectors == null ? List.of() : this.fieldSelectors;
    }
    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventDataStoreAdvancedEventSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(EventDataStoreAdvancedEventSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldSelectors = defaults.fieldSelectors;
    	      this.name = defaults.name;
        }

        public Builder fieldSelectors(@Nullable List<EventDataStoreAdvancedEventSelectorFieldSelector> fieldSelectors) {
            this.fieldSelectors = fieldSelectors;
            return this;
        }
        public Builder fieldSelectors(EventDataStoreAdvancedEventSelectorFieldSelector... fieldSelectors) {
            return fieldSelectors(List.of(fieldSelectors));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public EventDataStoreAdvancedEventSelector build() {
            return new EventDataStoreAdvancedEventSelector(fieldSelectors, name);
        }
    }
}
