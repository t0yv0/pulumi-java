// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="projectId", required=true)
    private String projectId;

    public String projectId() {
        return this.projectId;
    }

    @Import(name="triggerId", required=true)
    private String triggerId;

    public String triggerId() {
        return this.triggerId;
    }

    private GetTriggerArgs() {}

    private GetTriggerArgs(GetTriggerArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.projectId = $.projectId;
        this.triggerId = $.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggerArgs $;

        public Builder() {
            $ = new GetTriggerArgs();
        }

        public Builder(GetTriggerArgs defaults) {
            $ = new GetTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder triggerId(String triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        public GetTriggerArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.triggerId = Objects.requireNonNull($.triggerId, "expected parameter 'triggerId' to be non-null");
            return $;
        }
    }

}
