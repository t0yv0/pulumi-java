// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The integration account partner&#39;s business identity.
 * 
 */
public final class BusinessIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final BusinessIdentityArgs Empty = new BusinessIdentityArgs();

    /**
     * The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    @Import(name="qualifier", required=true)
    private Output<String> qualifier;

    /**
     * @return The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
     * 
     */
    public Output<String> qualifier() {
        return this.qualifier;
    }

    /**
     * The user defined business identity value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The user defined business identity value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private BusinessIdentityArgs() {}

    private BusinessIdentityArgs(BusinessIdentityArgs $) {
        this.qualifier = $.qualifier;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessIdentityArgs $;

        public Builder() {
            $ = new BusinessIdentityArgs();
        }

        public Builder(BusinessIdentityArgs defaults) {
            $ = new BusinessIdentityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param qualifier The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
         * 
         * @return builder
         * 
         */
        public Builder qualifier(Output<String> qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        /**
         * @param qualifier The business identity qualifier e.g. as2identity, ZZ, ZZZ, 31, 32
         * 
         * @return builder
         * 
         */
        public Builder qualifier(String qualifier) {
            return qualifier(Output.of(qualifier));
        }

        /**
         * @param value The user defined business identity value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The user defined business identity value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public BusinessIdentityArgs build() {
            $.qualifier = Objects.requireNonNull($.qualifier, "expected parameter 'qualifier' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
