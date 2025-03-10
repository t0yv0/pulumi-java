// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The default value to use when a user doesn&#39;t provide a value for a slot.
 * 
 */
public final class BotSlotDefaultValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotSlotDefaultValueArgs Empty = new BotSlotDefaultValueArgs();

    /**
     * The default value to use when a user doesn&#39;t provide a value for a slot.
     * 
     */
    @Import(name="defaultValue", required=true)
    private Output<String> defaultValue;

    /**
     * @return The default value to use when a user doesn&#39;t provide a value for a slot.
     * 
     */
    public Output<String> defaultValue() {
        return this.defaultValue;
    }

    private BotSlotDefaultValueArgs() {}

    private BotSlotDefaultValueArgs(BotSlotDefaultValueArgs $) {
        this.defaultValue = $.defaultValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotSlotDefaultValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotSlotDefaultValueArgs $;

        public Builder() {
            $ = new BotSlotDefaultValueArgs();
        }

        public Builder(BotSlotDefaultValueArgs defaults) {
            $ = new BotSlotDefaultValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultValue The default value to use when a user doesn&#39;t provide a value for a slot.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(Output<String> defaultValue) {
            $.defaultValue = defaultValue;
            return this;
        }

        /**
         * @param defaultValue The default value to use when a user doesn&#39;t provide a value for a slot.
         * 
         * @return builder
         * 
         */
        public Builder defaultValue(String defaultValue) {
            return defaultValue(Output.of(defaultValue));
        }

        public BotSlotDefaultValueArgs build() {
            $.defaultValue = Objects.requireNonNull($.defaultValue, "expected parameter 'defaultValue' to be non-null");
            return $;
        }
    }

}
