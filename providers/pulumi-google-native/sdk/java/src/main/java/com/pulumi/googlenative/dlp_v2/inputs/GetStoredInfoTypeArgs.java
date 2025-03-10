// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStoredInfoTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStoredInfoTypeArgs Empty = new GetStoredInfoTypeArgs();

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

    @Import(name="storedInfoTypeId", required=true)
    private String storedInfoTypeId;

    public String storedInfoTypeId() {
        return this.storedInfoTypeId;
    }

    private GetStoredInfoTypeArgs() {}

    private GetStoredInfoTypeArgs(GetStoredInfoTypeArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.storedInfoTypeId = $.storedInfoTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStoredInfoTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStoredInfoTypeArgs $;

        public Builder() {
            $ = new GetStoredInfoTypeArgs();
        }

        public Builder(GetStoredInfoTypeArgs defaults) {
            $ = new GetStoredInfoTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder storedInfoTypeId(String storedInfoTypeId) {
            $.storedInfoTypeId = storedInfoTypeId;
            return this;
        }

        public GetStoredInfoTypeArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.storedInfoTypeId = Objects.requireNonNull($.storedInfoTypeId, "expected parameter 'storedInfoTypeId' to be non-null");
            return $;
        }
    }

}
