// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.inputs.ReportComparisonExpressionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The filter expression to be used in the report.
 * 
 */
public final class ReportFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportFilterArgs Empty = new ReportFilterArgs();

    /**
     * The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    @Import(name="and")
    private @Nullable Output<List<ReportFilterArgs>> and;

    /**
     * @return The logical &#34;AND&#34; expression. Must have at least 2 items.
     * 
     */
    public Optional<Output<List<ReportFilterArgs>>> and() {
        return Optional.ofNullable(this.and);
    }

    /**
     * Has comparison expression for a dimension
     * 
     */
    @Import(name="dimension")
    private @Nullable Output<ReportComparisonExpressionArgs> dimension;

    /**
     * @return Has comparison expression for a dimension
     * 
     */
    public Optional<Output<ReportComparisonExpressionArgs>> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    /**
     * The logical &#34;NOT&#34; expression.
     * 
     */
    @Import(name="not")
    private @Nullable Output<ReportFilterArgs> not;

    /**
     * @return The logical &#34;NOT&#34; expression.
     * 
     */
    public Optional<Output<ReportFilterArgs>> not() {
        return Optional.ofNullable(this.not);
    }

    /**
     * The logical &#34;OR&#34; expression. Must have at least 2 items.
     * 
     */
    @Import(name="or")
    private @Nullable Output<List<ReportFilterArgs>> or;

    /**
     * @return The logical &#34;OR&#34; expression. Must have at least 2 items.
     * 
     */
    public Optional<Output<List<ReportFilterArgs>>> or() {
        return Optional.ofNullable(this.or);
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @Import(name="tag")
    private @Nullable Output<ReportComparisonExpressionArgs> tag;

    /**
     * @return Has comparison expression for a tag
     * 
     */
    public Optional<Output<ReportComparisonExpressionArgs>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private ReportFilterArgs() {}

    private ReportFilterArgs(ReportFilterArgs $) {
        this.and = $.and;
        this.dimension = $.dimension;
        this.not = $.not;
        this.or = $.or;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportFilterArgs $;

        public Builder() {
            $ = new ReportFilterArgs();
        }

        public Builder(ReportFilterArgs defaults) {
            $ = new ReportFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param and The logical &#34;AND&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder and(@Nullable Output<List<ReportFilterArgs>> and) {
            $.and = and;
            return this;
        }

        /**
         * @param and The logical &#34;AND&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder and(List<ReportFilterArgs> and) {
            return and(Output.of(and));
        }

        /**
         * @param and The logical &#34;AND&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder and(ReportFilterArgs... and) {
            return and(List.of(and));
        }

        /**
         * @param dimension Has comparison expression for a dimension
         * 
         * @return builder
         * 
         */
        public Builder dimension(@Nullable Output<ReportComparisonExpressionArgs> dimension) {
            $.dimension = dimension;
            return this;
        }

        /**
         * @param dimension Has comparison expression for a dimension
         * 
         * @return builder
         * 
         */
        public Builder dimension(ReportComparisonExpressionArgs dimension) {
            return dimension(Output.of(dimension));
        }

        /**
         * @param not The logical &#34;NOT&#34; expression.
         * 
         * @return builder
         * 
         */
        public Builder not(@Nullable Output<ReportFilterArgs> not) {
            $.not = not;
            return this;
        }

        /**
         * @param not The logical &#34;NOT&#34; expression.
         * 
         * @return builder
         * 
         */
        public Builder not(ReportFilterArgs not) {
            return not(Output.of(not));
        }

        /**
         * @param or The logical &#34;OR&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder or(@Nullable Output<List<ReportFilterArgs>> or) {
            $.or = or;
            return this;
        }

        /**
         * @param or The logical &#34;OR&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder or(List<ReportFilterArgs> or) {
            return or(Output.of(or));
        }

        /**
         * @param or The logical &#34;OR&#34; expression. Must have at least 2 items.
         * 
         * @return builder
         * 
         */
        public Builder or(ReportFilterArgs... or) {
            return or(List.of(or));
        }

        /**
         * @param tag Has comparison expression for a tag
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<ReportComparisonExpressionArgs> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag Has comparison expression for a tag
         * 
         * @return builder
         * 
         */
        public Builder tag(ReportComparisonExpressionArgs tag) {
            return tag(Output.of(tag));
        }

        public ReportFilterArgs build() {
            return $;
        }
    }

}
