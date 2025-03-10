// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSIS property override.
 * 
 */
public final class SSISPropertyOverrideArgs extends com.pulumi.resources.ResourceArgs {

    public static final SSISPropertyOverrideArgs Empty = new SSISPropertyOverrideArgs();

    /**
     * Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     * 
     */
    @Import(name="isSensitive")
    private @Nullable Output<Boolean> isSensitive;

    /**
     * @return Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
     * 
     */
    public Optional<Output<Boolean>> isSensitive() {
        return Optional.ofNullable(this.isSensitive);
    }

    /**
     * SSIS package property override value. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="value", required=true)
    private Output<Object> value;

    /**
     * @return SSIS package property override value. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> value() {
        return this.value;
    }

    private SSISPropertyOverrideArgs() {}

    private SSISPropertyOverrideArgs(SSISPropertyOverrideArgs $) {
        this.isSensitive = $.isSensitive;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SSISPropertyOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SSISPropertyOverrideArgs $;

        public Builder() {
            $ = new SSISPropertyOverrideArgs();
        }

        public Builder(SSISPropertyOverrideArgs defaults) {
            $ = new SSISPropertyOverrideArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isSensitive Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
         * 
         * @return builder
         * 
         */
        public Builder isSensitive(@Nullable Output<Boolean> isSensitive) {
            $.isSensitive = isSensitive;
            return this;
        }

        /**
         * @param isSensitive Whether SSIS package property override value is sensitive data. Value will be encrypted in SSISDB if it is true
         * 
         * @return builder
         * 
         */
        public Builder isSensitive(Boolean isSensitive) {
            return isSensitive(Output.of(isSensitive));
        }

        /**
         * @param value SSIS package property override value. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Object> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value SSIS package property override value. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            return value(Output.of(value));
        }

        public SSISPropertyOverrideArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
