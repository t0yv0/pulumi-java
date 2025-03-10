// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.enums.EnforcementMode;
import com.pulumi.azurenative.authorization.inputs.IdentityArgs;
import com.pulumi.azurenative.authorization.inputs.NonComplianceMessageArgs;
import com.pulumi.azurenative.authorization.inputs.ParameterValuesValueArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyAssignmentArgs Empty = new PolicyAssignmentArgs();

    /**
     * This message will be part of response in case of policy violation.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return This message will be part of response in case of policy violation.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the policy assignment.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the policy assignment.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
     * 
     */
    @Import(name="enforcementMode")
    private @Nullable Output<Either<String,EnforcementMode>> enforcementMode;

    /**
     * @return The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
     * 
     */
    public Optional<Output<Either<String,EnforcementMode>>> enforcementMode() {
        return Optional.ofNullable(this.enforcementMode);
    }

    /**
     * The managed identity associated with the policy assignment.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<IdentityArgs> identity;

    /**
     * @return The managed identity associated with the policy assignment.
     * 
     */
    public Optional<Output<IdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The location of the policy assignment. Only required when utilizing managed identity.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the policy assignment. Only required when utilizing managed identity.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The messages that describe why a resource is non-compliant with the policy.
     * 
     */
    @Import(name="nonComplianceMessages")
    private @Nullable Output<List<NonComplianceMessageArgs>> nonComplianceMessages;

    /**
     * @return The messages that describe why a resource is non-compliant with the policy.
     * 
     */
    public Optional<Output<List<NonComplianceMessageArgs>>> nonComplianceMessages() {
        return Optional.ofNullable(this.nonComplianceMessages);
    }

    /**
     * The policy&#39;s excluded scopes.
     * 
     */
    @Import(name="notScopes")
    private @Nullable Output<List<String>> notScopes;

    /**
     * @return The policy&#39;s excluded scopes.
     * 
     */
    public Optional<Output<List<String>>> notScopes() {
        return Optional.ofNullable(this.notScopes);
    }

    /**
     * The parameter values for the assigned policy rule. The keys are the parameter names.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterValuesValueArgs>> parameters;

    /**
     * @return The parameter values for the assigned policy rule. The keys are the parameter names.
     * 
     */
    public Optional<Output<Map<String,ParameterValuesValueArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the policy assignment.
     * 
     */
    @Import(name="policyAssignmentName")
    private @Nullable Output<String> policyAssignmentName;

    /**
     * @return The name of the policy assignment.
     * 
     */
    public Optional<Output<String>> policyAssignmentName() {
        return Optional.ofNullable(this.policyAssignmentName);
    }

    /**
     * The ID of the policy definition or policy set definition being assigned.
     * 
     */
    @Import(name="policyDefinitionId")
    private @Nullable Output<String> policyDefinitionId;

    /**
     * @return The ID of the policy definition or policy set definition being assigned.
     * 
     */
    public Optional<Output<String>> policyDefinitionId() {
        return Optional.ofNullable(this.policyDefinitionId);
    }

    /**
     * The scope of the policy assignment. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of the policy assignment. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private PolicyAssignmentArgs() {}

    private PolicyAssignmentArgs(PolicyAssignmentArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.enforcementMode = $.enforcementMode;
        this.identity = $.identity;
        this.location = $.location;
        this.metadata = $.metadata;
        this.nonComplianceMessages = $.nonComplianceMessages;
        this.notScopes = $.notScopes;
        this.parameters = $.parameters;
        this.policyAssignmentName = $.policyAssignmentName;
        this.policyDefinitionId = $.policyDefinitionId;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAssignmentArgs $;

        public Builder() {
            $ = new PolicyAssignmentArgs();
        }

        public Builder(PolicyAssignmentArgs defaults) {
            $ = new PolicyAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description This message will be part of response in case of policy violation.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description This message will be part of response in case of policy violation.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enforcementMode The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
         * 
         * @return builder
         * 
         */
        public Builder enforcementMode(@Nullable Output<Either<String,EnforcementMode>> enforcementMode) {
            $.enforcementMode = enforcementMode;
            return this;
        }

        /**
         * @param enforcementMode The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
         * 
         * @return builder
         * 
         */
        public Builder enforcementMode(Either<String,EnforcementMode> enforcementMode) {
            return enforcementMode(Output.of(enforcementMode));
        }

        /**
         * @param enforcementMode The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
         * 
         * @return builder
         * 
         */
        public Builder enforcementMode(String enforcementMode) {
            return enforcementMode(Either.ofLeft(enforcementMode));
        }

        /**
         * @param enforcementMode The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
         * 
         * @return builder
         * 
         */
        public Builder enforcementMode(EnforcementMode enforcementMode) {
            return enforcementMode(Either.ofRight(enforcementMode));
        }

        /**
         * @param identity The managed identity associated with the policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The managed identity associated with the policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder identity(IdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param location The location of the policy assignment. Only required when utilizing managed identity.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the policy assignment. Only required when utilizing managed identity.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param metadata The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param nonComplianceMessages The messages that describe why a resource is non-compliant with the policy.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceMessages(@Nullable Output<List<NonComplianceMessageArgs>> nonComplianceMessages) {
            $.nonComplianceMessages = nonComplianceMessages;
            return this;
        }

        /**
         * @param nonComplianceMessages The messages that describe why a resource is non-compliant with the policy.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceMessages(List<NonComplianceMessageArgs> nonComplianceMessages) {
            return nonComplianceMessages(Output.of(nonComplianceMessages));
        }

        /**
         * @param nonComplianceMessages The messages that describe why a resource is non-compliant with the policy.
         * 
         * @return builder
         * 
         */
        public Builder nonComplianceMessages(NonComplianceMessageArgs... nonComplianceMessages) {
            return nonComplianceMessages(List.of(nonComplianceMessages));
        }

        /**
         * @param notScopes The policy&#39;s excluded scopes.
         * 
         * @return builder
         * 
         */
        public Builder notScopes(@Nullable Output<List<String>> notScopes) {
            $.notScopes = notScopes;
            return this;
        }

        /**
         * @param notScopes The policy&#39;s excluded scopes.
         * 
         * @return builder
         * 
         */
        public Builder notScopes(List<String> notScopes) {
            return notScopes(Output.of(notScopes));
        }

        /**
         * @param notScopes The policy&#39;s excluded scopes.
         * 
         * @return builder
         * 
         */
        public Builder notScopes(String... notScopes) {
            return notScopes(List.of(notScopes));
        }

        /**
         * @param parameters The parameter values for the assigned policy rule. The keys are the parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterValuesValueArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameter values for the assigned policy rule. The keys are the parameter names.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterValuesValueArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param policyAssignmentName The name of the policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder policyAssignmentName(@Nullable Output<String> policyAssignmentName) {
            $.policyAssignmentName = policyAssignmentName;
            return this;
        }

        /**
         * @param policyAssignmentName The name of the policy assignment.
         * 
         * @return builder
         * 
         */
        public Builder policyAssignmentName(String policyAssignmentName) {
            return policyAssignmentName(Output.of(policyAssignmentName));
        }

        /**
         * @param policyDefinitionId The ID of the policy definition or policy set definition being assigned.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(@Nullable Output<String> policyDefinitionId) {
            $.policyDefinitionId = policyDefinitionId;
            return this;
        }

        /**
         * @param policyDefinitionId The ID of the policy definition or policy set definition being assigned.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionId(String policyDefinitionId) {
            return policyDefinitionId(Output.of(policyDefinitionId));
        }

        /**
         * @param scope The scope of the policy assignment. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of the policy assignment. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;), resource group (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39;, or resource (format: &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}&#39;
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public PolicyAssignmentArgs build() {
            $.enforcementMode = Codegen.stringProp("enforcementMode").left(EnforcementMode.class).output().arg($.enforcementMode).def("Default").getNullable();
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
