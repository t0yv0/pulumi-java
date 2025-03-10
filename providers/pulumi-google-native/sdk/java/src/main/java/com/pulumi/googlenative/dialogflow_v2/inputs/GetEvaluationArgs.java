// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEvaluationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEvaluationArgs Empty = new GetEvaluationArgs();

    @Import(name="conversationModelId", required=true)
    private String conversationModelId;

    public String conversationModelId() {
        return this.conversationModelId;
    }

    @Import(name="evaluationId", required=true)
    private String evaluationId;

    public String evaluationId() {
        return this.evaluationId;
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

    private GetEvaluationArgs() {}

    private GetEvaluationArgs(GetEvaluationArgs $) {
        this.conversationModelId = $.conversationModelId;
        this.evaluationId = $.evaluationId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEvaluationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEvaluationArgs $;

        public Builder() {
            $ = new GetEvaluationArgs();
        }

        public Builder(GetEvaluationArgs defaults) {
            $ = new GetEvaluationArgs(Objects.requireNonNull(defaults));
        }

        public Builder conversationModelId(String conversationModelId) {
            $.conversationModelId = conversationModelId;
            return this;
        }

        public Builder evaluationId(String evaluationId) {
            $.evaluationId = evaluationId;
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

        public GetEvaluationArgs build() {
            $.conversationModelId = Objects.requireNonNull($.conversationModelId, "expected parameter 'conversationModelId' to be non-null");
            $.evaluationId = Objects.requireNonNull($.evaluationId, "expected parameter 'evaluationId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
