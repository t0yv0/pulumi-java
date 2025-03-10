// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FactoryGlobalParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final FactoryGlobalParameterArgs Empty = new FactoryGlobalParameterArgs();

    /**
     * Specifies the global parameter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the global parameter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies the global parameter type. Possible Values are `Array`, `Bool`, `Float`, `Int`, `Object` or `String`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies the global parameter type. Possible Values are `Array`, `Bool`, `Float`, `Int`, `Object` or `String`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies the global parameter value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Specifies the global parameter value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private FactoryGlobalParameterArgs() {}

    private FactoryGlobalParameterArgs(FactoryGlobalParameterArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FactoryGlobalParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FactoryGlobalParameterArgs $;

        public Builder() {
            $ = new FactoryGlobalParameterArgs();
        }

        public Builder(FactoryGlobalParameterArgs defaults) {
            $ = new FactoryGlobalParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the global parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the global parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Specifies the global parameter type. Possible Values are `Array`, `Bool`, `Float`, `Int`, `Object` or `String`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the global parameter type. Possible Values are `Array`, `Bool`, `Float`, `Int`, `Object` or `String`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Specifies the global parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Specifies the global parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public FactoryGlobalParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
