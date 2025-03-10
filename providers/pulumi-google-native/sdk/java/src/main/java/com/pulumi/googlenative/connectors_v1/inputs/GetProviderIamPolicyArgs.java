// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.connectors_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProviderIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderIamPolicyArgs Empty = new GetProviderIamPolicyArgs();

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

    @Import(name="providerId", required=true)
    private String providerId;

    public String providerId() {
        return this.providerId;
    }

    private GetProviderIamPolicyArgs() {}

    private GetProviderIamPolicyArgs(GetProviderIamPolicyArgs $) {
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
        this.providerId = $.providerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderIamPolicyArgs $;

        public Builder() {
            $ = new GetProviderIamPolicyArgs();
        }

        public Builder(GetProviderIamPolicyArgs defaults) {
            $ = new GetProviderIamPolicyArgs(Objects.requireNonNull(defaults));
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

        public Builder providerId(String providerId) {
            $.providerId = providerId;
            return this;
        }

        public GetProviderIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.providerId = Objects.requireNonNull($.providerId, "expected parameter 'providerId' to be non-null");
            return $;
        }
    }

}
