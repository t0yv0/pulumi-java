// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.ImageIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final ImageIamMemberState Empty = new ImageIamMemberState();

    /**
     * An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<ImageIamMemberConditionArgs> condition;

    /**
     * @return An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ImageIamMemberConditionArgs>> condition() {
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

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
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
     * `gcp.compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private ImageIamMemberState() {}

    private ImageIamMemberState(ImageIamMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.image = $.image;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageIamMemberState $;

        public Builder() {
            $ = new ImageIamMemberState();
        }

        public Builder(ImageIamMemberState defaults) {
            $ = new ImageIamMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<ImageIamMemberConditionArgs> condition) {
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
        public Builder condition(ImageIamMemberConditionArgs condition) {
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

        /**
         * @param image Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
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
         * `gcp.compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
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
         * `gcp.compute.ImageIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public ImageIamMemberState build() {
            return $;
        }
    }

}
