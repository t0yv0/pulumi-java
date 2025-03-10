// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeidentifyTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeidentifyTemplateArgs Empty = new GetDeidentifyTemplateArgs();

    @Import(name="deidentifyTemplateId", required=true)
    private String deidentifyTemplateId;

    public String deidentifyTemplateId() {
        return this.deidentifyTemplateId;
    }

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

    private GetDeidentifyTemplateArgs() {}

    private GetDeidentifyTemplateArgs(GetDeidentifyTemplateArgs $) {
        this.deidentifyTemplateId = $.deidentifyTemplateId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeidentifyTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeidentifyTemplateArgs $;

        public Builder() {
            $ = new GetDeidentifyTemplateArgs();
        }

        public Builder(GetDeidentifyTemplateArgs defaults) {
            $ = new GetDeidentifyTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder deidentifyTemplateId(String deidentifyTemplateId) {
            $.deidentifyTemplateId = deidentifyTemplateId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDeidentifyTemplateArgs build() {
            $.deidentifyTemplateId = Objects.requireNonNull($.deidentifyTemplateId, "expected parameter 'deidentifyTemplateId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
