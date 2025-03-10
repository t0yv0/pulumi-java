// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.random.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RandomPetState extends com.pulumi.resources.ResourceArgs {

    public static final RandomPetState Empty = new RandomPetState();

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See [the main provider
     * documentation](../index.html) for more information.
     * 
     */
    @Import(name="keepers")
    private @Nullable Output<Map<String,Object>> keepers;

    /**
     * @return Arbitrary map of values that, when changed, will trigger recreation of resource. See [the main provider
     * documentation](../index.html) for more information.
     * 
     */
    public Optional<Output<Map<String,Object>>> keepers() {
        return Optional.ofNullable(this.keepers);
    }

    /**
     * The length (in words) of the pet name.
     * 
     */
    @Import(name="length")
    private @Nullable Output<Integer> length;

    /**
     * @return The length (in words) of the pet name.
     * 
     */
    public Optional<Output<Integer>> length() {
        return Optional.ofNullable(this.length);
    }

    /**
     * A string to prefix the name with.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return A string to prefix the name with.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The character to separate words in the pet name.
     * 
     */
    @Import(name="separator")
    private @Nullable Output<String> separator;

    /**
     * @return The character to separate words in the pet name.
     * 
     */
    public Optional<Output<String>> separator() {
        return Optional.ofNullable(this.separator);
    }

    private RandomPetState() {}

    private RandomPetState(RandomPetState $) {
        this.keepers = $.keepers;
        this.length = $.length;
        this.prefix = $.prefix;
        this.separator = $.separator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RandomPetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RandomPetState $;

        public Builder() {
            $ = new RandomPetState();
        }

        public Builder(RandomPetState defaults) {
            $ = new RandomPetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param keepers Arbitrary map of values that, when changed, will trigger recreation of resource. See [the main provider
         * documentation](../index.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            $.keepers = keepers;
            return this;
        }

        /**
         * @param keepers Arbitrary map of values that, when changed, will trigger recreation of resource. See [the main provider
         * documentation](../index.html) for more information.
         * 
         * @return builder
         * 
         */
        public Builder keepers(Map<String,Object> keepers) {
            return keepers(Output.of(keepers));
        }

        /**
         * @param length The length (in words) of the pet name.
         * 
         * @return builder
         * 
         */
        public Builder length(@Nullable Output<Integer> length) {
            $.length = length;
            return this;
        }

        /**
         * @param length The length (in words) of the pet name.
         * 
         * @return builder
         * 
         */
        public Builder length(Integer length) {
            return length(Output.of(length));
        }

        /**
         * @param prefix A string to prefix the name with.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix A string to prefix the name with.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param separator The character to separate words in the pet name.
         * 
         * @return builder
         * 
         */
        public Builder separator(@Nullable Output<String> separator) {
            $.separator = separator;
            return this;
        }

        /**
         * @param separator The character to separate words in the pet name.
         * 
         * @return builder
         * 
         */
        public Builder separator(String separator) {
            return separator(Output.of(separator));
        }

        public RandomPetState build() {
            return $;
        }
    }

}
