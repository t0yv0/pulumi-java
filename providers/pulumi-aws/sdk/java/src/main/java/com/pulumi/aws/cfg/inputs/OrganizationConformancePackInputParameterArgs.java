// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OrganizationConformancePackInputParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationConformancePackInputParameterArgs Empty = new OrganizationConformancePackInputParameterArgs();

    /**
     * The input key.
     * 
     */
    @Import(name="parameterName", required=true)
    private Output<String> parameterName;

    /**
     * @return The input key.
     * 
     */
    public Output<String> parameterName() {
        return this.parameterName;
    }

    /**
     * The input value.
     * 
     */
    @Import(name="parameterValue", required=true)
    private Output<String> parameterValue;

    /**
     * @return The input value.
     * 
     */
    public Output<String> parameterValue() {
        return this.parameterValue;
    }

    private OrganizationConformancePackInputParameterArgs() {}

    private OrganizationConformancePackInputParameterArgs(OrganizationConformancePackInputParameterArgs $) {
        this.parameterName = $.parameterName;
        this.parameterValue = $.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationConformancePackInputParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationConformancePackInputParameterArgs $;

        public Builder() {
            $ = new OrganizationConformancePackInputParameterArgs();
        }

        public Builder(OrganizationConformancePackInputParameterArgs defaults) {
            $ = new OrganizationConformancePackInputParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param parameterName The input key.
         * 
         * @return builder
         * 
         */
        public Builder parameterName(Output<String> parameterName) {
            $.parameterName = parameterName;
            return this;
        }

        /**
         * @param parameterName The input key.
         * 
         * @return builder
         * 
         */
        public Builder parameterName(String parameterName) {
            return parameterName(Output.of(parameterName));
        }

        /**
         * @param parameterValue The input value.
         * 
         * @return builder
         * 
         */
        public Builder parameterValue(Output<String> parameterValue) {
            $.parameterValue = parameterValue;
            return this;
        }

        /**
         * @param parameterValue The input value.
         * 
         * @return builder
         * 
         */
        public Builder parameterValue(String parameterValue) {
            return parameterValue(Output.of(parameterValue));
        }

        public OrganizationConformancePackInputParameterArgs build() {
            $.parameterName = Objects.requireNonNull($.parameterName, "expected parameter 'parameterName' to be non-null");
            $.parameterValue = Objects.requireNonNull($.parameterValue, "expected parameter 'parameterValue' to be non-null");
            return $;
        }
    }

}
