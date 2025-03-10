// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceIamPolicyArgs Empty = new GetNamespaceIamPolicyArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="namespaceId", required=true)
    private String namespaceId;

    public String namespaceId() {
        return this.namespaceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNamespaceIamPolicyArgs() {}

    private GetNamespaceIamPolicyArgs(GetNamespaceIamPolicyArgs $) {
        this.location = $.location;
        this.namespaceId = $.namespaceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceIamPolicyArgs $;

        public Builder() {
            $ = new GetNamespaceIamPolicyArgs();
        }

        public Builder(GetNamespaceIamPolicyArgs defaults) {
            $ = new GetNamespaceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetNamespaceIamPolicyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}
