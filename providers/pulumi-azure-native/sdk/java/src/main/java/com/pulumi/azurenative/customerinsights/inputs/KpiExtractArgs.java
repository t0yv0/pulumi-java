// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI extract.
 * 
 */
public final class KpiExtractArgs extends com.pulumi.resources.ResourceArgs {

    public static final KpiExtractArgs Empty = new KpiExtractArgs();

    /**
     * The expression.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return The expression.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * KPI extract name.
     * 
     */
    @Import(name="extractName", required=true)
    private Output<String> extractName;

    /**
     * @return KPI extract name.
     * 
     */
    public Output<String> extractName() {
        return this.extractName;
    }

    private KpiExtractArgs() {}

    private KpiExtractArgs(KpiExtractArgs $) {
        this.expression = $.expression;
        this.extractName = $.extractName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KpiExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KpiExtractArgs $;

        public Builder() {
            $ = new KpiExtractArgs();
        }

        public Builder(KpiExtractArgs defaults) {
            $ = new KpiExtractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expression The expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression The expression.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param extractName KPI extract name.
         * 
         * @return builder
         * 
         */
        public Builder extractName(Output<String> extractName) {
            $.extractName = extractName;
            return this;
        }

        /**
         * @param extractName KPI extract name.
         * 
         * @return builder
         * 
         */
        public Builder extractName(String extractName) {
            return extractName(Output.of(extractName));
        }

        public KpiExtractArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.extractName = Objects.requireNonNull($.extractName, "expected parameter 'extractName' to be non-null");
            return $;
        }
    }

}
