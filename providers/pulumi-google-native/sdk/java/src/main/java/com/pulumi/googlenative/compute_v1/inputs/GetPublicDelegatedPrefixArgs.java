// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicDelegatedPrefixArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicDelegatedPrefixArgs Empty = new GetPublicDelegatedPrefixArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="publicDelegatedPrefix", required=true)
    private String publicDelegatedPrefix;

    public String publicDelegatedPrefix() {
        return this.publicDelegatedPrefix;
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetPublicDelegatedPrefixArgs() {}

    private GetPublicDelegatedPrefixArgs(GetPublicDelegatedPrefixArgs $) {
        this.project = $.project;
        this.publicDelegatedPrefix = $.publicDelegatedPrefix;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicDelegatedPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicDelegatedPrefixArgs $;

        public Builder() {
            $ = new GetPublicDelegatedPrefixArgs();
        }

        public Builder(GetPublicDelegatedPrefixArgs defaults) {
            $ = new GetPublicDelegatedPrefixArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder publicDelegatedPrefix(String publicDelegatedPrefix) {
            $.publicDelegatedPrefix = publicDelegatedPrefix;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetPublicDelegatedPrefixArgs build() {
            $.publicDelegatedPrefix = Objects.requireNonNull($.publicDelegatedPrefix, "expected parameter 'publicDelegatedPrefix' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
