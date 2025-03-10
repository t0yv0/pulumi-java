// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.enums.PolicyType;
import com.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyDefinitionArgs Empty = new PolicyDefinitionArgs();

    /**
     * The policy definition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The policy definition description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the policy definition.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the policy definition.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    /**
     * @return The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters;

    /**
     * @return The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    public Optional<Output<Map<String,ParameterDefinitionsValueArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the policy definition to create.
     * 
     */
    @Import(name="policyDefinitionName")
    private @Nullable Output<String> policyDefinitionName;

    /**
     * @return The name of the policy definition to create.
     * 
     */
    public Optional<Output<String>> policyDefinitionName() {
        return Optional.ofNullable(this.policyDefinitionName);
    }

    /**
     * The policy rule.
     * 
     */
    @Import(name="policyRule")
    private @Nullable Output<Object> policyRule;

    /**
     * @return The policy rule.
     * 
     */
    public Optional<Output<Object>> policyRule() {
        return Optional.ofNullable(this.policyRule);
    }

    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<Either<String,PolicyType>> policyType;

    /**
     * @return The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    public Optional<Output<Either<String,PolicyType>>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private PolicyDefinitionArgs() {}

    private PolicyDefinitionArgs(PolicyDefinitionArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.metadata = $.metadata;
        this.mode = $.mode;
        this.parameters = $.parameters;
        this.policyDefinitionName = $.policyDefinitionName;
        this.policyRule = $.policyRule;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyDefinitionArgs $;

        public Builder() {
            $ = new PolicyDefinitionArgs();
        }

        public Builder(PolicyDefinitionArgs defaults) {
            $ = new PolicyDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The policy definition description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The policy definition description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the policy definition.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the policy definition.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param metadata The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param mode The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param parameters The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterDefinitionsValueArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param policyDefinitionName The name of the policy definition to create.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionName(@Nullable Output<String> policyDefinitionName) {
            $.policyDefinitionName = policyDefinitionName;
            return this;
        }

        /**
         * @param policyDefinitionName The name of the policy definition to create.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionName(String policyDefinitionName) {
            return policyDefinitionName(Output.of(policyDefinitionName));
        }

        /**
         * @param policyRule The policy rule.
         * 
         * @return builder
         * 
         */
        public Builder policyRule(@Nullable Output<Object> policyRule) {
            $.policyRule = policyRule;
            return this;
        }

        /**
         * @param policyRule The policy rule.
         * 
         * @return builder
         * 
         */
        public Builder policyRule(Object policyRule) {
            return policyRule(Output.of(policyRule));
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<Either<String,PolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(Either<String,PolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Either.ofLeft(policyType));
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(PolicyType policyType) {
            return policyType(Either.ofRight(policyType));
        }

        public PolicyDefinitionArgs build() {
            $.mode = Codegen.stringProp("mode").output().arg($.mode).def("Indexed").getNullable();
            return $;
        }
    }

}
