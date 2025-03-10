// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CryptoKeyIAMBindingConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMBindingConditionArgs Empty = new CryptoKeyIAMBindingConditionArgs();

    /**
     * An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    /**
     * @return Textual representation of an expression in Common Expression Language syntax.
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }

    /**
     * A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return A title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private CryptoKeyIAMBindingConditionArgs() {}

    private CryptoKeyIAMBindingConditionArgs(CryptoKeyIAMBindingConditionArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyIAMBindingConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyIAMBindingConditionArgs $;

        public Builder() {
            $ = new CryptoKeyIAMBindingConditionArgs();
        }

        public Builder(CryptoKeyIAMBindingConditionArgs defaults) {
            $ = new CryptoKeyIAMBindingConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Textual representation of an expression in Common Expression Language syntax.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        /**
         * @param title A title for the expression, i.e. a short string describing its purpose.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title A title for the expression, i.e. a short string describing its purpose.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public CryptoKeyIAMBindingConditionArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
