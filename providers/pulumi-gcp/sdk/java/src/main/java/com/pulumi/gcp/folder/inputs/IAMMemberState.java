// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.folder.inputs.IAMMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMMemberState extends com.pulumi.resources.ResourceArgs {

    public static final IAMMemberState Empty = new IAMMemberState();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<IAMMemberConditionArgs> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<IAMMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the folder&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the folder&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `organizations/{{org_id}}/roles/{{role_id}}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private IAMMemberState() {}

    private IAMMemberState(IAMMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.folder = $.folder;
        this.member = $.member;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMMemberState $;

        public Builder() {
            $ = new IAMMemberState();
        }

        public Builder(IAMMemberState defaults) {
            $ = new IAMMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<IAMMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(IAMMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param etag (Computed) The etag of the folder&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the folder&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param folder The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
         * `organizations/{{org_id}}/roles/{{role_id}}`.
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
         * `gcp.folder.IAMBinding` can be used per role. Note that custom roles must be of the format
         * `organizations/{{org_id}}/roles/{{role_id}}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public IAMMemberState build() {
            return $;
        }
    }

}
