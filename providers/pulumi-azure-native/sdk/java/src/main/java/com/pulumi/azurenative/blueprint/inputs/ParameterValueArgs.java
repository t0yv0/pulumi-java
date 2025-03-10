// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.azurenative.blueprint.inputs.SecretValueReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Value for the specified parameter. Can be either &#39;value&#39; or &#39;reference&#39; but not both.
 * 
 */
public final class ParameterValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParameterValueArgs Empty = new ParameterValueArgs();

    /**
     * Parameter value as reference type.
     * 
     */
    @Import(name="reference")
    private @Nullable Output<SecretValueReferenceArgs> reference;

    /**
     * @return Parameter value as reference type.
     * 
     */
    public Optional<Output<SecretValueReferenceArgs>> reference() {
        return Optional.ofNullable(this.reference);
    }

    /**
     * Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Object> value;

    /**
     * @return Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
     * 
     */
    public Optional<Output<Object>> value() {
        return Optional.ofNullable(this.value);
    }

    private ParameterValueArgs() {}

    private ParameterValueArgs(ParameterValueArgs $) {
        this.reference = $.reference;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParameterValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParameterValueArgs $;

        public Builder() {
            $ = new ParameterValueArgs();
        }

        public Builder(ParameterValueArgs defaults) {
            $ = new ParameterValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param reference Parameter value as reference type.
         * 
         * @return builder
         * 
         */
        public Builder reference(@Nullable Output<SecretValueReferenceArgs> reference) {
            $.reference = reference;
            return this;
        }

        /**
         * @param reference Parameter value as reference type.
         * 
         * @return builder
         * 
         */
        public Builder reference(SecretValueReferenceArgs reference) {
            return reference(Output.of(reference));
        }

        /**
         * @param value Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Object> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Parameter value. Any valid JSON value is allowed including objects, arrays, strings, numbers and booleans.
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            return value(Output.of(value));
        }

        public ParameterValueArgs build() {
            return $;
        }
    }

}
