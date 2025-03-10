// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceIamPolicyArgs Empty = new GetInstanceIamPolicyArgs();

    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstanceIamPolicyArgs() {}

    private GetInstanceIamPolicyArgs(GetInstanceIamPolicyArgs $) {
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceIamPolicyArgs $;

        public Builder() {
            $ = new GetInstanceIamPolicyArgs();
        }

        public Builder(GetInstanceIamPolicyArgs defaults) {
            $ = new GetInstanceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstanceIamPolicyArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
