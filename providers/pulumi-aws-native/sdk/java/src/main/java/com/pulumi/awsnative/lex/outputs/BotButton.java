// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotButton {
    /**
     * @return The text that appears on the button.
     * 
     */
    private final String text;
    /**
     * @return The value returned to Amazon Lex when the user chooses this button.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private BotButton(
        @CustomType.Parameter("text") String text,
        @CustomType.Parameter("value") String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * @return The text that appears on the button.
     * 
     */
    public String text() {
        return this.text;
    }
    /**
     * @return The value returned to Amazon Lex when the user chooses this button.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotButton defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String text;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(BotButton defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BotButton build() {
            return new BotButton(text, value);
        }
    }
}
