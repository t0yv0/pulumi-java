// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDefaultObjectAccessControlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDefaultObjectAccessControlArgs Empty = new GetDefaultObjectAccessControlArgs();

    @Import(name="bucket", required=true)
    private String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="entity", required=true)
    private String entity;

    public String entity() {
        return this.entity;
    }

    @Import(name="userProject")
    private @Nullable String userProject;

    public Optional<String> userProject() {
        return Optional.ofNullable(this.userProject);
    }

    private GetDefaultObjectAccessControlArgs() {}

    private GetDefaultObjectAccessControlArgs(GetDefaultObjectAccessControlArgs $) {
        this.bucket = $.bucket;
        this.entity = $.entity;
        this.userProject = $.userProject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDefaultObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDefaultObjectAccessControlArgs $;

        public Builder() {
            $ = new GetDefaultObjectAccessControlArgs();
        }

        public Builder(GetDefaultObjectAccessControlArgs defaults) {
            $ = new GetDefaultObjectAccessControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder entity(String entity) {
            $.entity = entity;
            return this;
        }

        public Builder userProject(@Nullable String userProject) {
            $.userProject = userProject;
            return this;
        }

        public GetDefaultObjectAccessControlArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.entity = Objects.requireNonNull($.entity, "expected parameter 'entity' to be non-null");
            return $;
        }
    }

}
