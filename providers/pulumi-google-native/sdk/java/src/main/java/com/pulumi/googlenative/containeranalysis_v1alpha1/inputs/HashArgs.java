// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.enums.HashType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container message for hash values.
 * 
 */
public final class HashArgs extends com.pulumi.resources.ResourceArgs {

    public static final HashArgs Empty = new HashArgs();

    /**
     * The type of hash that was performed.
     * 
     */
    @Import(name="type")
    private @Nullable Output<HashType> type;

    /**
     * @return The type of hash that was performed.
     * 
     */
    public Optional<Output<HashType>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The hash value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The hash value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private HashArgs() {}

    private HashArgs(HashArgs $) {
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HashArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HashArgs $;

        public Builder() {
            $ = new HashArgs();
        }

        public Builder(HashArgs defaults) {
            $ = new HashArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of hash that was performed.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<HashType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of hash that was performed.
         * 
         * @return builder
         * 
         */
        public Builder type(HashType type) {
            return type(Output.of(type));
        }

        /**
         * @param value The hash value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The hash value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public HashArgs build() {
            return $;
        }
    }

}
