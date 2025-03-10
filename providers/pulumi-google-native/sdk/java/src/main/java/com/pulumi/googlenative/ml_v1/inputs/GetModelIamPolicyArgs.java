// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetModelIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelIamPolicyArgs Empty = new GetModelIamPolicyArgs();

    @Import(name="modelId", required=true)
    private String modelId;

    public String modelId() {
        return this.modelId;
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

    private GetModelIamPolicyArgs() {}

    private GetModelIamPolicyArgs(GetModelIamPolicyArgs $) {
        this.modelId = $.modelId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelIamPolicyArgs $;

        public Builder() {
            $ = new GetModelIamPolicyArgs();
        }

        public Builder(GetModelIamPolicyArgs defaults) {
            $ = new GetModelIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder modelId(String modelId) {
            $.modelId = modelId;
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

        public GetModelIamPolicyArgs build() {
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            return $;
        }
    }

}
