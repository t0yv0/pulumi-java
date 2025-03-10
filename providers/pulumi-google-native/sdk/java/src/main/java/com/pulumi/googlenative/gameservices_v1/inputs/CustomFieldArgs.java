// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom fields. These can be used to create a counter with arbitrary field/value pairs. See: go/rpcsp-custom-fields.
 * 
 */
public final class CustomFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomFieldArgs Empty = new CustomFieldArgs();

    /**
     * Name is the field name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name is the field name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value is the field value. It is important that in contrast to the CounterOptions.field, the value here is a constant that is not derived from the IAMContext.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value is the field value. It is important that in contrast to the CounterOptions.field, the value here is a constant that is not derived from the IAMContext.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private CustomFieldArgs() {}

    private CustomFieldArgs(CustomFieldArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomFieldArgs $;

        public Builder() {
            $ = new CustomFieldArgs();
        }

        public Builder(CustomFieldArgs defaults) {
            $ = new CustomFieldArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name is the field name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name is the field name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value is the field value. It is important that in contrast to the CounterOptions.field, the value here is a constant that is not derived from the IAMContext.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value is the field value. It is important that in contrast to the CounterOptions.field, the value here is a constant that is not derived from the IAMContext.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public CustomFieldArgs build() {
            return $;
        }
    }

}
