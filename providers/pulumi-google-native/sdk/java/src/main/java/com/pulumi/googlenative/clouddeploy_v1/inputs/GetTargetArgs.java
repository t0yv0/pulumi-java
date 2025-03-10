// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTargetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTargetArgs Empty = new GetTargetArgs();

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

    @Import(name="targetId", required=true)
    private String targetId;

    public String targetId() {
        return this.targetId;
    }

    private GetTargetArgs() {}

    private GetTargetArgs(GetTargetArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTargetArgs $;

        public Builder() {
            $ = new GetTargetArgs();
        }

        public Builder(GetTargetArgs defaults) {
            $ = new GetTargetArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder targetId(String targetId) {
            $.targetId = targetId;
            return this;
        }

        public GetTargetArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            return $;
        }
    }

}
