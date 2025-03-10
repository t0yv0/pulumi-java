// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dump flag definition.
 * 
 */
public final class DumpFlagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DumpFlagArgs Empty = new DumpFlagArgs();

    /**
     * The name of the flag
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the flag
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of the flag.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the flag.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DumpFlagArgs() {}

    private DumpFlagArgs(DumpFlagArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DumpFlagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DumpFlagArgs $;

        public Builder() {
            $ = new DumpFlagArgs();
        }

        public Builder(DumpFlagArgs defaults) {
            $ = new DumpFlagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the flag
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the flag
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The value of the flag.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the flag.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DumpFlagArgs build() {
            return $;
        }
    }

}
