// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCompanyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCompanyArgs Empty = new GetCompanyArgs();

    @Import(name="companyId", required=true)
    private String companyId;

    public String companyId() {
        return this.companyId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCompanyArgs() {}

    private GetCompanyArgs(GetCompanyArgs $) {
        this.companyId = $.companyId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCompanyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCompanyArgs $;

        public Builder() {
            $ = new GetCompanyArgs();
        }

        public Builder(GetCompanyArgs defaults) {
            $ = new GetCompanyArgs(Objects.requireNonNull(defaults));
        }

        public Builder companyId(String companyId) {
            $.companyId = companyId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCompanyArgs build() {
            $.companyId = Objects.requireNonNull($.companyId, "expected parameter 'companyId' to be non-null");
            return $;
        }
    }

}
