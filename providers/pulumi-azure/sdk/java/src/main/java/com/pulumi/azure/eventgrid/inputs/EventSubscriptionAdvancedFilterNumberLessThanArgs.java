// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class EventSubscriptionAdvancedFilterNumberLessThanArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionAdvancedFilterNumberLessThanArgs Empty = new EventSubscriptionAdvancedFilterNumberLessThanArgs();

    /**
     * Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * Specifies a single value to compare to when using a single value operator.
     * 
     */
    @Import(name="value", required=true)
    private Output<Double> value;

    /**
     * @return Specifies a single value to compare to when using a single value operator.
     * 
     */
    public Output<Double> value() {
        return this.value;
    }

    private EventSubscriptionAdvancedFilterNumberLessThanArgs() {}

    private EventSubscriptionAdvancedFilterNumberLessThanArgs(EventSubscriptionAdvancedFilterNumberLessThanArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventSubscriptionAdvancedFilterNumberLessThanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventSubscriptionAdvancedFilterNumberLessThanArgs $;

        public Builder() {
            $ = new EventSubscriptionAdvancedFilterNumberLessThanArgs();
        }

        public Builder(EventSubscriptionAdvancedFilterNumberLessThanArgs defaults) {
            $ = new EventSubscriptionAdvancedFilterNumberLessThanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param value Specifies a single value to compare to when using a single value operator.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Specifies a single value to compare to when using a single value operator.
         * 
         * @return builder
         * 
         */
        public Builder value(Double value) {
            return value(Output.of(value));
        }

        public EventSubscriptionAdvancedFilterNumberLessThanArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
