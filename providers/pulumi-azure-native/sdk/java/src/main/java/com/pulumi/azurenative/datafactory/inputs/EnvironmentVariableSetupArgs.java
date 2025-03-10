// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The custom setup of setting environment variable.
 * 
 */
public final class EnvironmentVariableSetupArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableSetupArgs Empty = new EnvironmentVariableSetupArgs();

    /**
     * The type of custom setup.
     * Expected value is &#39;EnvironmentVariableSetup&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of custom setup.
     * Expected value is &#39;EnvironmentVariableSetup&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The name of the environment variable.
     * 
     */
    @Import(name="variableName", required=true)
    private Output<String> variableName;

    /**
     * @return The name of the environment variable.
     * 
     */
    public Output<String> variableName() {
        return this.variableName;
    }

    /**
     * The value of the environment variable.
     * 
     */
    @Import(name="variableValue", required=true)
    private Output<String> variableValue;

    /**
     * @return The value of the environment variable.
     * 
     */
    public Output<String> variableValue() {
        return this.variableValue;
    }

    private EnvironmentVariableSetupArgs() {}

    private EnvironmentVariableSetupArgs(EnvironmentVariableSetupArgs $) {
        this.type = $.type;
        this.variableName = $.variableName;
        this.variableValue = $.variableValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVariableSetupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVariableSetupArgs $;

        public Builder() {
            $ = new EnvironmentVariableSetupArgs();
        }

        public Builder(EnvironmentVariableSetupArgs defaults) {
            $ = new EnvironmentVariableSetupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of custom setup.
         * Expected value is &#39;EnvironmentVariableSetup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of custom setup.
         * Expected value is &#39;EnvironmentVariableSetup&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param variableName The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder variableName(Output<String> variableName) {
            $.variableName = variableName;
            return this;
        }

        /**
         * @param variableName The name of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder variableName(String variableName) {
            return variableName(Output.of(variableName));
        }

        /**
         * @param variableValue The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder variableValue(Output<String> variableValue) {
            $.variableValue = variableValue;
            return this;
        }

        /**
         * @param variableValue The value of the environment variable.
         * 
         * @return builder
         * 
         */
        public Builder variableValue(String variableValue) {
            return variableValue(Output.of(variableValue));
        }

        public EnvironmentVariableSetupArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.variableName = Objects.requireNonNull($.variableName, "expected parameter 'variableName' to be non-null");
            $.variableValue = Objects.requireNonNull($.variableValue, "expected parameter 'variableValue' to be non-null");
            return $;
        }
    }

}
