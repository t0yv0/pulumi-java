// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.enums.WebACLSizeConstraintStatementComparisonOperator;
import com.pulumi.awsnative.wafv2.outputs.WebACLFieldToMatch;
import com.pulumi.awsnative.wafv2.outputs.WebACLTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WebACLSizeConstraintStatement {
    private final WebACLSizeConstraintStatementComparisonOperator comparisonOperator;
    private final WebACLFieldToMatch fieldToMatch;
    private final Double size;
    private final List<WebACLTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebACLSizeConstraintStatement(
        @CustomType.Parameter("comparisonOperator") WebACLSizeConstraintStatementComparisonOperator comparisonOperator,
        @CustomType.Parameter("fieldToMatch") WebACLFieldToMatch fieldToMatch,
        @CustomType.Parameter("size") Double size,
        @CustomType.Parameter("textTransformations") List<WebACLTextTransformation> textTransformations) {
        this.comparisonOperator = comparisonOperator;
        this.fieldToMatch = fieldToMatch;
        this.size = size;
        this.textTransformations = textTransformations;
    }

    public WebACLSizeConstraintStatementComparisonOperator comparisonOperator() {
        return this.comparisonOperator;
    }
    public WebACLFieldToMatch fieldToMatch() {
        return this.fieldToMatch;
    }
    public Double size() {
        return this.size;
    }
    public List<WebACLTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLSizeConstraintStatementComparisonOperator comparisonOperator;
        private WebACLFieldToMatch fieldToMatch;
        private Double size;
        private List<WebACLTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(WebACLSizeConstraintStatementComparisonOperator comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }
        public Builder fieldToMatch(WebACLFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder size(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder textTransformations(List<WebACLTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebACLTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebACLSizeConstraintStatement build() {
            return new WebACLSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
