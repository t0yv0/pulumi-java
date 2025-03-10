// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.awsnative.wafv2.outputs.RuleGroupFieldToMatch;
import com.pulumi.awsnative.wafv2.outputs.RuleGroupTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRegexMatchStatement {
    private final RuleGroupFieldToMatch fieldToMatch;
    private final String regexString;
    private final List<RuleGroupTextTransformation> textTransformations;

    @CustomType.Constructor
    private RuleGroupRegexMatchStatement(
        @CustomType.Parameter("fieldToMatch") RuleGroupFieldToMatch fieldToMatch,
        @CustomType.Parameter("regexString") String regexString,
        @CustomType.Parameter("textTransformations") List<RuleGroupTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.regexString = regexString;
        this.textTransformations = textTransformations;
    }

    public RuleGroupFieldToMatch fieldToMatch() {
        return this.fieldToMatch;
    }
    public String regexString() {
        return this.regexString;
    }
    public List<RuleGroupTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRegexMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupFieldToMatch fieldToMatch;
        private String regexString;
        private List<RuleGroupTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRegexMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.regexString = defaults.regexString;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }
        public Builder regexString(String regexString) {
            this.regexString = Objects.requireNonNull(regexString);
            return this;
        }
        public Builder textTransformations(List<RuleGroupTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(RuleGroupTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public RuleGroupRegexMatchStatement build() {
            return new RuleGroupRegexMatchStatement(fieldToMatch, regexString, textTransformations);
        }
    }
}
