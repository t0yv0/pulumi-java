// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResponsePolicyRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResponsePolicyRuleArgs Empty = new GetResponsePolicyRuleArgs();

    @Import(name="clientOperationId")
    private @Nullable String clientOperationId;

    public Optional<String> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
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

    @Import(name="responsePolicy", required=true)
    private String responsePolicy;

    public String responsePolicy() {
        return this.responsePolicy;
    }

    @Import(name="responsePolicyRule", required=true)
    private String responsePolicyRule;

    public String responsePolicyRule() {
        return this.responsePolicyRule;
    }

    private GetResponsePolicyRuleArgs() {}

    private GetResponsePolicyRuleArgs(GetResponsePolicyRuleArgs $) {
        this.clientOperationId = $.clientOperationId;
        this.location = $.location;
        this.project = $.project;
        this.responsePolicy = $.responsePolicy;
        this.responsePolicyRule = $.responsePolicyRule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResponsePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResponsePolicyRuleArgs $;

        public Builder() {
            $ = new GetResponsePolicyRuleArgs();
        }

        public Builder(GetResponsePolicyRuleArgs defaults) {
            $ = new GetResponsePolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            $.clientOperationId = clientOperationId;
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

        public Builder responsePolicy(String responsePolicy) {
            $.responsePolicy = responsePolicy;
            return this;
        }

        public Builder responsePolicyRule(String responsePolicyRule) {
            $.responsePolicyRule = responsePolicyRule;
            return this;
        }

        public GetResponsePolicyRuleArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.responsePolicy = Objects.requireNonNull($.responsePolicy, "expected parameter 'responsePolicy' to be non-null");
            $.responsePolicyRule = Objects.requireNonNull($.responsePolicyRule, "expected parameter 'responsePolicyRule' to be non-null");
            return $;
        }
    }

}
