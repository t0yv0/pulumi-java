// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FhirStoreIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamMemberArgs Empty = new FhirStoreIamMemberArgs();

    @Import(name="condition")
    private @Nullable Output<FhirStoreIamMemberConditionArgs> condition;

    public Optional<Output<FhirStoreIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="fhirStoreId", required=true)
    private Output<String> fhirStoreId;

    /**
     * @return The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public Output<String> fhirStoreId() {
        return this.fhirStoreId;
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    private FhirStoreIamMemberArgs() {}

    private FhirStoreIamMemberArgs(FhirStoreIamMemberArgs $) {
        this.condition = $.condition;
        this.fhirStoreId = $.fhirStoreId;
        this.member = $.member;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FhirStoreIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirStoreIamMemberArgs $;

        public Builder() {
            $ = new FhirStoreIamMemberArgs();
        }

        public Builder(FhirStoreIamMemberArgs defaults) {
            $ = new FhirStoreIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<FhirStoreIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(FhirStoreIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param fhirStoreId The FHIR store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
         * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder fhirStoreId(Output<String> fhirStoreId) {
            $.fhirStoreId = fhirStoreId;
            return this;
        }

        /**
         * @param fhirStoreId The FHIR store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
         * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder fhirStoreId(String fhirStoreId) {
            return fhirStoreId(Output.of(fhirStoreId));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public FhirStoreIamMemberArgs build() {
            $.fhirStoreId = Objects.requireNonNull($.fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
