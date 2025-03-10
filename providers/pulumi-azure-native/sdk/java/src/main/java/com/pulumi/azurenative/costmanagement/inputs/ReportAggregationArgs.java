// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.FunctionType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The aggregation expression to be used in the report.
 * 
 */
public final class ReportAggregationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReportAggregationArgs Empty = new ReportAggregationArgs();

    /**
     * The name of the aggregation function to use.
     * 
     */
    @Import(name="function", required=true)
    private Output<Either<String,FunctionType>> function;

    /**
     * @return The name of the aggregation function to use.
     * 
     */
    public Output<Either<String,FunctionType>> function() {
        return this.function;
    }

    /**
     * The name of the column to aggregate.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the column to aggregate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ReportAggregationArgs() {}

    private ReportAggregationArgs(ReportAggregationArgs $) {
        this.function = $.function;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReportAggregationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReportAggregationArgs $;

        public Builder() {
            $ = new ReportAggregationArgs();
        }

        public Builder(ReportAggregationArgs defaults) {
            $ = new ReportAggregationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param function The name of the aggregation function to use.
         * 
         * @return builder
         * 
         */
        public Builder function(Output<Either<String,FunctionType>> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function The name of the aggregation function to use.
         * 
         * @return builder
         * 
         */
        public Builder function(Either<String,FunctionType> function) {
            return function(Output.of(function));
        }

        /**
         * @param function The name of the aggregation function to use.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Either.ofLeft(function));
        }

        /**
         * @param function The name of the aggregation function to use.
         * 
         * @return builder
         * 
         */
        public Builder function(FunctionType function) {
            return function(Either.ofRight(function));
        }

        /**
         * @param name The name of the column to aggregate.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the column to aggregate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ReportAggregationArgs build() {
            $.function = Objects.requireNonNull($.function, "expected parameter 'function' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
