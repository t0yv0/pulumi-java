// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProviderArgs Empty = new GetProviderArgs();

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

    @Import(name="providerId", required=true)
    private String providerId;

    public String providerId() {
        return this.providerId;
    }

    @Import(name="workloadIdentityPoolId", required=true)
    private String workloadIdentityPoolId;

    public String workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    private GetProviderArgs() {}

    private GetProviderArgs(GetProviderArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.providerId = $.providerId;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProviderArgs $;

        public Builder() {
            $ = new GetProviderArgs();
        }

        public Builder(GetProviderArgs defaults) {
            $ = new GetProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
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

        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        public GetProviderArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.providerId = Objects.requireNonNull($.providerId, "expected parameter 'providerId' to be non-null");
            $.workloadIdentityPoolId = Objects.requireNonNull($.workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
            return $;
        }
    }

}
