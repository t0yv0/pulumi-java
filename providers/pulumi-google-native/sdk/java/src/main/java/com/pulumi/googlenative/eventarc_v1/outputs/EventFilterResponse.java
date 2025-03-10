// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventFilterResponse {
    /**
     * @return The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the &#39;type&#39; attribute.
     * 
     */
    private final String attribute;
    /**
     * @return Optional. The operator used for matching the events with the value of the filter. If not specified, only events that have an exact key-value pair specified in the filter are matched. The only allowed value is `match-path-pattern`.
     * 
     */
    private final String operator;
    /**
     * @return The value for the attribute.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private EventFilterResponse(
        @CustomType.Parameter("attribute") String attribute,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("value") String value) {
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    /**
     * @return The name of a CloudEvents attribute. Currently, only a subset of attributes are supported for filtering. All triggers MUST provide a filter for the &#39;type&#39; attribute.
     * 
     */
    public String attribute() {
        return this.attribute;
    }
    /**
     * @return Optional. The operator used for matching the events with the value of the filter. If not specified, only events that have an exact key-value pair specified in the filter are matched. The only allowed value is `match-path-pattern`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The value for the attribute.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attribute;
        private String operator;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        public Builder attribute(String attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EventFilterResponse build() {
            return new EventFilterResponse(attribute, operator, value);
        }
    }
}
