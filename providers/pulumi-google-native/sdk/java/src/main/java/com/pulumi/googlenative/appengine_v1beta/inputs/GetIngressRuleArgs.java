// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIngressRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIngressRuleArgs Empty = new GetIngressRuleArgs();

    @Import(name="appId", required=true)
    private String appId;

    public String appId() {
        return this.appId;
    }

    @Import(name="ingressRuleId", required=true)
    private String ingressRuleId;

    public String ingressRuleId() {
        return this.ingressRuleId;
    }

    private GetIngressRuleArgs() {}

    private GetIngressRuleArgs(GetIngressRuleArgs $) {
        this.appId = $.appId;
        this.ingressRuleId = $.ingressRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIngressRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIngressRuleArgs $;

        public Builder() {
            $ = new GetIngressRuleArgs();
        }

        public Builder(GetIngressRuleArgs defaults) {
            $ = new GetIngressRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        public Builder ingressRuleId(String ingressRuleId) {
            $.ingressRuleId = ingressRuleId;
            return this;
        }

        public GetIngressRuleArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.ingressRuleId = Objects.requireNonNull($.ingressRuleId, "expected parameter 'ingressRuleId' to be non-null");
            return $;
        }
    }

}
