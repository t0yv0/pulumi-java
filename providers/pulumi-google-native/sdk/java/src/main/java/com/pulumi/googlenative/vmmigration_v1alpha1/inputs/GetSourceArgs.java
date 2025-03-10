// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSourceArgs Empty = new GetSourceArgs();

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

    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    private GetSourceArgs() {}

    private GetSourceArgs(GetSourceArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.sourceId = $.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSourceArgs $;

        public Builder() {
            $ = new GetSourceArgs();
        }

        public Builder(GetSourceArgs defaults) {
            $ = new GetSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public GetSourceArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
