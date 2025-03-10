// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFunctionIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionIamPolicyArgs Empty = new GetFunctionIamPolicyArgs();

    @Import(name="functionId", required=true)
    private String functionId;

    public String functionId() {
        return this.functionId;
    }

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

    private GetFunctionIamPolicyArgs() {}

    private GetFunctionIamPolicyArgs(GetFunctionIamPolicyArgs $) {
        this.functionId = $.functionId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionIamPolicyArgs $;

        public Builder() {
            $ = new GetFunctionIamPolicyArgs();
        }

        public Builder(GetFunctionIamPolicyArgs defaults) {
            $ = new GetFunctionIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionId(String functionId) {
            $.functionId = functionId;
            return this;
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

        public GetFunctionIamPolicyArgs build() {
            $.functionId = Objects.requireNonNull($.functionId, "expected parameter 'functionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
