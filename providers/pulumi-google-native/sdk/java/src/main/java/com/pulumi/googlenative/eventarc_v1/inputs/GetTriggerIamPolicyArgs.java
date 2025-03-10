// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTriggerIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggerIamPolicyArgs Empty = new GetTriggerIamPolicyArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="triggerId", required=true)
    private String triggerId;

    public String triggerId() {
        return this.triggerId;
    }

    private GetTriggerIamPolicyArgs() {}

    private GetTriggerIamPolicyArgs(GetTriggerIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.triggerId = $.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggerIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggerIamPolicyArgs $;

        public Builder() {
            $ = new GetTriggerIamPolicyArgs();
        }

        public Builder(GetTriggerIamPolicyArgs defaults) {
            $ = new GetTriggerIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder triggerId(String triggerId) {
            $.triggerId = triggerId;
            return this;
        }

        public GetTriggerIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.triggerId = Objects.requireNonNull($.triggerId, "expected parameter 'triggerId' to be non-null");
            return $;
        }
    }

}
