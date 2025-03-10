// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEvaluationJobArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEvaluationJobArgs Empty = new GetEvaluationJobArgs();

    @Import(name="evaluationJobId", required=true)
    private String evaluationJobId;

    public String evaluationJobId() {
        return this.evaluationJobId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetEvaluationJobArgs() {}

    private GetEvaluationJobArgs(GetEvaluationJobArgs $) {
        this.evaluationJobId = $.evaluationJobId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEvaluationJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEvaluationJobArgs $;

        public Builder() {
            $ = new GetEvaluationJobArgs();
        }

        public Builder(GetEvaluationJobArgs defaults) {
            $ = new GetEvaluationJobArgs(Objects.requireNonNull(defaults));
        }

        public Builder evaluationJobId(String evaluationJobId) {
            $.evaluationJobId = evaluationJobId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetEvaluationJobArgs build() {
            $.evaluationJobId = Objects.requireNonNull($.evaluationJobId, "expected parameter 'evaluationJobId' to be non-null");
            return $;
        }
    }

}
