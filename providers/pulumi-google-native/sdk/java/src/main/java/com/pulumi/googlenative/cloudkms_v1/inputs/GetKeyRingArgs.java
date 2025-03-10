// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyRingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyRingArgs Empty = new GetKeyRingArgs();

    @Import(name="keyRingId", required=true)
    private String keyRingId;

    public String keyRingId() {
        return this.keyRingId;
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

    private GetKeyRingArgs() {}

    private GetKeyRingArgs(GetKeyRingArgs $) {
        this.keyRingId = $.keyRingId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyRingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyRingArgs $;

        public Builder() {
            $ = new GetKeyRingArgs();
        }

        public Builder(GetKeyRingArgs defaults) {
            $ = new GetKeyRingArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyRingId(String keyRingId) {
            $.keyRingId = keyRingId;
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

        public GetKeyRingArgs build() {
            $.keyRingId = Objects.requireNonNull($.keyRingId, "expected parameter 'keyRingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
