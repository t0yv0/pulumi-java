// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecretIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final SecretIamMemberState Empty = new SecretIamMemberState();

    @Import(name="condition")
    private @Nullable Output<SecretIamMemberConditionArgs> condition;

    public Optional<Output<SecretIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="secretId")
    private @Nullable Output<String> secretId;

    public Optional<Output<String>> secretId() {
        return Optional.ofNullable(this.secretId);
    }

    private SecretIamMemberState() {}

    private SecretIamMemberState(SecretIamMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
        this.secretId = $.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecretIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretIamMemberState $;

        public Builder() {
            $ = new SecretIamMemberState();
        }

        public Builder(SecretIamMemberState defaults) {
            $ = new SecretIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<SecretIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(SecretIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder secretId(@Nullable Output<String> secretId) {
            $.secretId = secretId;
            return this;
        }

        public Builder secretId(String secretId) {
            return secretId(Output.of(secretId));
        }

        public SecretIamMemberState build() {
            return $;
        }
    }

}
