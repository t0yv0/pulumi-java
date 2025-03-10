// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.random.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RandomShuffleState extends com.pulumi.resources.ResourceArgs {

    public static final RandomShuffleState Empty = new RandomShuffleState();

    /**
     * The list of strings to shuffle.
     * 
     */
    @Import(name="inputs")
    private @Nullable Output<List<String>> inputs;

    /**
     * @return The list of strings to shuffle.
     * 
     */
    public Optional<Output<List<String>>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

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
     * The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some
     * elements will be excluded from the result. If more items are requested, items will be repeated in the result but not
     * more frequently than the number of items in the input list.
     * 
     */
    @Import(name="resultCount")
    private @Nullable Output<Integer> resultCount;

    /**
     * @return The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some
     * elements will be excluded from the result. If more items are requested, items will be repeated in the result but not
     * more frequently than the number of items in the input list.
     * 
     */
    public Optional<Output<Integer>> resultCount() {
        return Optional.ofNullable(this.resultCount);
    }

    /**
     * Random permutation of the list of strings given in `input`.
     * 
     */
    @Import(name="results")
    private @Nullable Output<List<String>> results;

    /**
     * @return Random permutation of the list of strings given in `input`.
     * 
     */
    public Optional<Output<List<String>>> results() {
        return Optional.ofNullable(this.results);
    }

    /**
     * Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the
     * list. **Important:** Even with an identical seed, it is not guaranteed that the same permutation will be produced across
     * different versions of Terraform. This argument causes the result to be *less volatile*, but not fixed for all time.
     * 
     */
    @Import(name="seed")
    private @Nullable Output<String> seed;

    /**
     * @return Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the
     * list. **Important:** Even with an identical seed, it is not guaranteed that the same permutation will be produced across
     * different versions of Terraform. This argument causes the result to be *less volatile*, but not fixed for all time.
     * 
     */
    public Optional<Output<String>> seed() {
        return Optional.ofNullable(this.seed);
    }

    private RandomShuffleState() {}

    private RandomShuffleState(RandomShuffleState $) {
        this.inputs = $.inputs;
        this.keepers = $.keepers;
        this.resultCount = $.resultCount;
        this.results = $.results;
        this.seed = $.seed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RandomShuffleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RandomShuffleState $;

        public Builder() {
            $ = new RandomShuffleState();
        }

        public Builder(RandomShuffleState defaults) {
            $ = new RandomShuffleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputs The list of strings to shuffle.
         * 
         * @return builder
         * 
         */
        public Builder inputs(@Nullable Output<List<String>> inputs) {
            $.inputs = inputs;
            return this;
        }

        /**
         * @param inputs The list of strings to shuffle.
         * 
         * @return builder
         * 
         */
        public Builder inputs(List<String> inputs) {
            return inputs(Output.of(inputs));
        }

        /**
         * @param inputs The list of strings to shuffle.
         * 
         * @return builder
         * 
         */
        public Builder inputs(String... inputs) {
            return inputs(List.of(inputs));
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
         * @param resultCount The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some
         * elements will be excluded from the result. If more items are requested, items will be repeated in the result but not
         * more frequently than the number of items in the input list.
         * 
         * @return builder
         * 
         */
        public Builder resultCount(@Nullable Output<Integer> resultCount) {
            $.resultCount = resultCount;
            return this;
        }

        /**
         * @param resultCount The number of results to return. Defaults to the number of items in the `input` list. If fewer items are requested, some
         * elements will be excluded from the result. If more items are requested, items will be repeated in the result but not
         * more frequently than the number of items in the input list.
         * 
         * @return builder
         * 
         */
        public Builder resultCount(Integer resultCount) {
            return resultCount(Output.of(resultCount));
        }

        /**
         * @param results Random permutation of the list of strings given in `input`.
         * 
         * @return builder
         * 
         */
        public Builder results(@Nullable Output<List<String>> results) {
            $.results = results;
            return this;
        }

        /**
         * @param results Random permutation of the list of strings given in `input`.
         * 
         * @return builder
         * 
         */
        public Builder results(List<String> results) {
            return results(Output.of(results));
        }

        /**
         * @param results Random permutation of the list of strings given in `input`.
         * 
         * @return builder
         * 
         */
        public Builder results(String... results) {
            return results(List.of(results));
        }

        /**
         * @param seed Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the
         * list. **Important:** Even with an identical seed, it is not guaranteed that the same permutation will be produced across
         * different versions of Terraform. This argument causes the result to be *less volatile*, but not fixed for all time.
         * 
         * @return builder
         * 
         */
        public Builder seed(@Nullable Output<String> seed) {
            $.seed = seed;
            return this;
        }

        /**
         * @param seed Arbitrary string with which to seed the random number generator, in order to produce less-volatile permutations of the
         * list. **Important:** Even with an identical seed, it is not guaranteed that the same permutation will be produced across
         * different versions of Terraform. This argument causes the result to be *less volatile*, but not fixed for all time.
         * 
         * @return builder
         * 
         */
        public Builder seed(String seed) {
            return seed(Output.of(seed));
        }

        public RandomShuffleState build() {
            return $;
        }
    }

}
