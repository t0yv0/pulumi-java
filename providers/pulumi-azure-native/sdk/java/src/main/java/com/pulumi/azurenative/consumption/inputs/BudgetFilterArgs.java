// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.consumption.inputs;

import com.pulumi.azurenative.consumption.inputs.BudgetComparisonExpressionArgs;
import com.pulumi.azurenative.consumption.inputs.BudgetFilterPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * May be used to filter budgets by resource group, resource, or meter.
 * 
 */
public final class BudgetFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BudgetFilterArgs Empty = new BudgetFilterArgs();

    /**
     * The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    @Import(name="and")
    private @Nullable Output<List<BudgetFilterPropertiesArgs>> and;

    /**
     * @return The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    public Optional<Output<List<BudgetFilterPropertiesArgs>>> and() {
        return Optional.ofNullable(this.and);
    }

    /**
     * Has comparison expression for a dimension
     * 
     */
    @Import(name="dimensions")
    private @Nullable Output<BudgetComparisonExpressionArgs> dimensions;

    /**
     * @return Has comparison expression for a dimension
     * 
     */
    public Optional<Output<BudgetComparisonExpressionArgs>> dimensions() {
        return Optional.ofNullable(this.dimensions);
    }

    /**
     * The logical &#34;NOT&#34; expression.
     * 
     */
    @Import(name="not")
    private @Nullable Output<BudgetFilterPropertiesArgs> not;

    /**
     * @return The logical &#34;NOT&#34; expression.
     * 
     */
    public Optional<Output<BudgetFilterPropertiesArgs>> not() {
        return Optional.ofNullable(this.not);
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @Import(name="tags")
    private @Nullable Output<BudgetComparisonExpressionArgs> tags;

    /**
     * @return Has comparison expression for a tag
     * 
     */
    public Optional<Output<BudgetComparisonExpressionArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private BudgetFilterArgs() {}

    private BudgetFilterArgs(BudgetFilterArgs $) {
        this.and = $.and;
        this.dimensions = $.dimensions;
        this.not = $.not;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BudgetFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetFilterArgs $;

        public Builder() {
            $ = new BudgetFilterArgs();
        }

        public Builder(BudgetFilterArgs defaults) {
            $ = new BudgetFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param and The logical &#34;AND&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder and(@Nullable Output<List<BudgetFilterPropertiesArgs>> and) {
            $.and = and;
            return this;
        }

        /**
         * @param and The logical &#34;AND&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder and(List<BudgetFilterPropertiesArgs> and) {
            return and(Output.of(and));
        }

        /**
         * @param and The logical &#34;AND&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder and(BudgetFilterPropertiesArgs... and) {
            return and(List.of(and));
        }

        /**
         * @param dimensions Has comparison expression for a dimension
         * 
         * @return builder
         * 
         */
        public Builder dimensions(@Nullable Output<BudgetComparisonExpressionArgs> dimensions) {
            $.dimensions = dimensions;
            return this;
        }

        /**
         * @param dimensions Has comparison expression for a dimension
         * 
         * @return builder
         * 
         */
        public Builder dimensions(BudgetComparisonExpressionArgs dimensions) {
            return dimensions(Output.of(dimensions));
        }

        /**
         * @param not The logical &#34;NOT&#34; expression.
         * 
         * @return builder
         * 
         */
        public Builder not(@Nullable Output<BudgetFilterPropertiesArgs> not) {
            $.not = not;
            return this;
        }

        /**
         * @param not The logical &#34;NOT&#34; expression.
         * 
         * @return builder
         * 
         */
        public Builder not(BudgetFilterPropertiesArgs not) {
            return not(Output.of(not));
        }

        /**
         * @param tags Has comparison expression for a tag
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<BudgetComparisonExpressionArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Has comparison expression for a tag
         * 
         * @return builder
         * 
         */
        public Builder tags(BudgetComparisonExpressionArgs tags) {
            return tags(Output.of(tags));
        }

        public BudgetFilterArgs build() {
            return $;
        }
    }

}
