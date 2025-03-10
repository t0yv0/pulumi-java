// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StringIn Advanced Filter.
 * 
 */
public final class StringInAdvancedFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final StringInAdvancedFilterArgs Empty = new StringInAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The field/property in the event based on which you want to filter.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringIn&#39;.
     * 
     */
    @Import(name="operatorType", required=true)
    private Output<String> operatorType;

    /**
     * @return The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is &#39;StringIn&#39;.
     * 
     */
    public Output<String> operatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The set of filter values.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private StringInAdvancedFilterArgs() {}

    private StringInAdvancedFilterArgs(StringInAdvancedFilterArgs $) {
        this.key = $.key;
        this.operatorType = $.operatorType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StringInAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StringInAdvancedFilterArgs $;

        public Builder() {
            $ = new StringInAdvancedFilterArgs();
        }

        public Builder(StringInAdvancedFilterArgs defaults) {
            $ = new StringInAdvancedFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The field/property in the event based on which you want to filter.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;StringIn&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(Output<String> operatorType) {
            $.operatorType = operatorType;
            return this;
        }

        /**
         * @param operatorType The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
         * Expected value is &#39;StringIn&#39;.
         * 
         * @return builder
         * 
         */
        public Builder operatorType(String operatorType) {
            return operatorType(Output.of(operatorType));
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The set of filter values.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public StringInAdvancedFilterArgs build() {
            $.operatorType = Codegen.stringProp("operatorType").output().arg($.operatorType).require();
            return $;
        }
    }

}
