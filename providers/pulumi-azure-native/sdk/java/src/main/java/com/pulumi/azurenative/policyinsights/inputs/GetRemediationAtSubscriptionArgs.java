// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRemediationAtSubscriptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRemediationAtSubscriptionArgs Empty = new GetRemediationAtSubscriptionArgs();

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName", required=true)
    private String remediationName;

    /**
     * @return The name of the remediation.
     * 
     */
    public String remediationName() {
        return this.remediationName;
    }

    private GetRemediationAtSubscriptionArgs() {}

    private GetRemediationAtSubscriptionArgs(GetRemediationAtSubscriptionArgs $) {
        this.remediationName = $.remediationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRemediationAtSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRemediationAtSubscriptionArgs $;

        public Builder() {
            $ = new GetRemediationAtSubscriptionArgs();
        }

        public Builder(GetRemediationAtSubscriptionArgs defaults) {
            $ = new GetRemediationAtSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param remediationName The name of the remediation.
         * 
         * @return builder
         * 
         */
        public Builder remediationName(String remediationName) {
            $.remediationName = remediationName;
            return this;
        }

        public GetRemediationAtSubscriptionArgs build() {
            $.remediationName = Objects.requireNonNull($.remediationName, "expected parameter 'remediationName' to be non-null");
            return $;
        }
    }

}
