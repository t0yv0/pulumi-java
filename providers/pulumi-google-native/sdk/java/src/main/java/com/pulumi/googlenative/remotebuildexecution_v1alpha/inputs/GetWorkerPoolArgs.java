// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkerPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkerPoolArgs Empty = new GetWorkerPoolArgs();

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

    @Import(name="workerpoolId", required=true)
    private String workerpoolId;

    public String workerpoolId() {
        return this.workerpoolId;
    }

    private GetWorkerPoolArgs() {}

    private GetWorkerPoolArgs(GetWorkerPoolArgs $) {
        this.instanceId = $.instanceId;
        this.project = $.project;
        this.workerpoolId = $.workerpoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkerPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkerPoolArgs $;

        public Builder() {
            $ = new GetWorkerPoolArgs();
        }

        public Builder(GetWorkerPoolArgs defaults) {
            $ = new GetWorkerPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder workerpoolId(String workerpoolId) {
            $.workerpoolId = workerpoolId;
            return this;
        }

        public GetWorkerPoolArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.workerpoolId = Objects.requireNonNull($.workerpoolId, "expected parameter 'workerpoolId' to be non-null");
            return $;
        }
    }

}
