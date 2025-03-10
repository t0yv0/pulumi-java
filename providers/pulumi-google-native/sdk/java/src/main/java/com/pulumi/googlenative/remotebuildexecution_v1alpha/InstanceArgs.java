// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The policy to define whether or not RBE features can be used or how they can be used.
     * 
     */
    @Import(name="featurePolicy")
    private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs> featurePolicy;

    /**
     * @return The policy to define whether or not RBE features can be used or how they can be used.
     * 
     */
    public Optional<Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs>> featurePolicy() {
        return Optional.ofNullable(this.featurePolicy);
    }

    /**
     * ID of the created instance. A valid `instance_id` must: be 6-50 characters long, contain only lowercase letters, digits, hyphens and underscores, start with a lowercase letter, and end with a lowercase letter or a digit.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return ID of the created instance. A valid `instance_id` must: be 6-50 characters long, contain only lowercase letters, digits, hyphens and underscores, start with a lowercase letter, and end with a lowercase letter or a digit.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The location is a GCP region. Currently only `us-central1` is supported.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location is a GCP region. Currently only `us-central1` is supported.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
     * 
     */
    @Import(name="parent")
    private @Nullable Output<String> parent;

    /**
     * @return Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
     * 
     */
    public Optional<Output<String>> parent() {
        return Optional.ofNullable(this.parent);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private InstanceArgs() {}

    private InstanceArgs(InstanceArgs $) {
        this.featurePolicy = $.featurePolicy;
        this.instanceId = $.instanceId;
        this.location = $.location;
        this.parent = $.parent;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceArgs $;

        public Builder() {
            $ = new InstanceArgs();
        }

        public Builder(InstanceArgs defaults) {
            $ = new InstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featurePolicy The policy to define whether or not RBE features can be used or how they can be used.
         * 
         * @return builder
         * 
         */
        public Builder featurePolicy(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs> featurePolicy) {
            $.featurePolicy = featurePolicy;
            return this;
        }

        /**
         * @param featurePolicy The policy to define whether or not RBE features can be used or how they can be used.
         * 
         * @return builder
         * 
         */
        public Builder featurePolicy(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyArgs featurePolicy) {
            return featurePolicy(Output.of(featurePolicy));
        }

        /**
         * @param instanceId ID of the created instance. A valid `instance_id` must: be 6-50 characters long, contain only lowercase letters, digits, hyphens and underscores, start with a lowercase letter, and end with a lowercase letter or a digit.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the created instance. A valid `instance_id` must: be 6-50 characters long, contain only lowercase letters, digits, hyphens and underscores, start with a lowercase letter, and end with a lowercase letter or a digit.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param location The location is a GCP region. Currently only `us-central1` is supported.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location is a GCP region. Currently only `us-central1` is supported.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param parent Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
         * 
         * @return builder
         * 
         */
        public Builder parent(@Nullable Output<String> parent) {
            $.parent = parent;
            return this;
        }

        /**
         * @param parent Resource name of the project containing the instance. Format: `projects/[PROJECT_ID]`.
         * 
         * @return builder
         * 
         */
        public Builder parent(String parent) {
            return parent(Output.of(parent));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public InstanceArgs build() {
            return $;
        }
    }

}
