// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final IAMPolicyState Empty = new IAMPolicyState();

    /**
     * (Computed) The etag of the organization&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return (Computed) The etag of the organization&#39;s IAM policy.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
     * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
     * will not be inferred from the provider.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
     * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
     * will not be inferred from the provider.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the organization. The policy will be
     * merged with any existing policy applied to the organization.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    /**
     * @return The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the organization. The policy will be
     * merged with any existing policy applied to the organization.
     * 
     */
    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    private IAMPolicyState() {}

    private IAMPolicyState(IAMPolicyState $) {
        this.etag = $.etag;
        this.orgId = $.orgId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMPolicyState $;

        public Builder() {
            $ = new IAMPolicyState();
        }

        public Builder(IAMPolicyState defaults) {
            $ = new IAMPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag (Computed) The etag of the organization&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag (Computed) The etag of the organization&#39;s IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param orgId The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
         * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
         * will not be inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId The organization ID. If not specified for `gcp.organizations.IAMBinding`, `gcp.organizations.IAMMember`, or `gcp.organizations.IamAuditConfig`, uses the ID of the organization configured with the provider.
         * Required for `gcp.organizations.IAMPolicy` - you must explicitly set the organization, and it
         * will not be inferred from the provider.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param policyData The `gcp.organizations.getIAMPolicy` data source that represents
         * the IAM policy that will be applied to the organization. The policy will be
         * merged with any existing policy applied to the organization.
         * 
         * @return builder
         * 
         */
        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The `gcp.organizations.getIAMPolicy` data source that represents
         * the IAM policy that will be applied to the organization. The policy will be
         * merged with any existing policy applied to the organization.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public IAMPolicyState build() {
            return $;
        }
    }

}
