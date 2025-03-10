// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Key-value pair to store extra metadata.
 * 
 */
public final class GoogleCloudApigeeV1AttributeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1AttributeArgs Empty = new GoogleCloudApigeeV1AttributeArgs();

    /**
     * API key of the attribute.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return API key of the attribute.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Value of the attribute.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Value of the attribute.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private GoogleCloudApigeeV1AttributeArgs() {}

    private GoogleCloudApigeeV1AttributeArgs(GoogleCloudApigeeV1AttributeArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1AttributeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1AttributeArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1AttributeArgs();
        }

        public Builder(GoogleCloudApigeeV1AttributeArgs defaults) {
            $ = new GoogleCloudApigeeV1AttributeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name API key of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name API key of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Value of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GoogleCloudApigeeV1AttributeArgs build() {
            return $;
        }
    }

}
