// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsupport_v2beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCaseArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCaseArgs Empty = new GetCaseArgs();

    @Import(name="caseId", required=true)
    private String caseId;

    public String caseId() {
        return this.caseId;
    }

    @Import(name="v2betaId1", required=true)
    private String v2betaId1;

    public String v2betaId1() {
        return this.v2betaId1;
    }

    @Import(name="v2betumId", required=true)
    private String v2betumId;

    public String v2betumId() {
        return this.v2betumId;
    }

    private GetCaseArgs() {}

    private GetCaseArgs(GetCaseArgs $) {
        this.caseId = $.caseId;
        this.v2betaId1 = $.v2betaId1;
        this.v2betumId = $.v2betumId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCaseArgs $;

        public Builder() {
            $ = new GetCaseArgs();
        }

        public Builder(GetCaseArgs defaults) {
            $ = new GetCaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder caseId(String caseId) {
            $.caseId = caseId;
            return this;
        }

        public Builder v2betaId1(String v2betaId1) {
            $.v2betaId1 = v2betaId1;
            return this;
        }

        public Builder v2betumId(String v2betumId) {
            $.v2betumId = v2betumId;
            return this;
        }

        public GetCaseArgs build() {
            $.caseId = Objects.requireNonNull($.caseId, "expected parameter 'caseId' to be non-null");
            $.v2betaId1 = Objects.requireNonNull($.v2betaId1, "expected parameter 'v2betaId1' to be non-null");
            $.v2betumId = Objects.requireNonNull($.v2betumId, "expected parameter 'v2betumId' to be non-null");
            return $;
        }
    }

}
