// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationsmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameter to pass to ARM template
 * 
 */
public final class ArmTemplateParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArmTemplateParameterArgs Empty = new ArmTemplateParameterArgs();

    /**
     * name of the parameter.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name of the parameter.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * value for the parameter. In Jtoken
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return value for the parameter. In Jtoken
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ArmTemplateParameterArgs() {}

    private ArmTemplateParameterArgs(ArmTemplateParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArmTemplateParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArmTemplateParameterArgs $;

        public Builder() {
            $ = new ArmTemplateParameterArgs();
        }

        public Builder(ArmTemplateParameterArgs defaults) {
            $ = new ArmTemplateParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name of the parameter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value value for the parameter. In Jtoken
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value value for the parameter. In Jtoken
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ArmTemplateParameterArgs build() {
            return $;
        }
    }

}
