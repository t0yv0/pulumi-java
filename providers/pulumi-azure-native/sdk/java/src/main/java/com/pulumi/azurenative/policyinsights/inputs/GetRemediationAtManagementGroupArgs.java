// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRemediationAtManagementGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRemediationAtManagementGroupArgs Empty = new GetRemediationAtManagementGroupArgs();

    /**
     * Management group ID.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private String managementGroupId;

    /**
     * @return Management group ID.
     * 
     */
    public String managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The namespace for Microsoft Management RP; only &#34;Microsoft.Management&#34; is allowed.
     * 
     */
    @Import(name="managementGroupsNamespace", required=true)
    private String managementGroupsNamespace;

    /**
     * @return The namespace for Microsoft Management RP; only &#34;Microsoft.Management&#34; is allowed.
     * 
     */
    public String managementGroupsNamespace() {
        return this.managementGroupsNamespace;
    }

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

    private GetRemediationAtManagementGroupArgs() {}

    private GetRemediationAtManagementGroupArgs(GetRemediationAtManagementGroupArgs $) {
        this.managementGroupId = $.managementGroupId;
        this.managementGroupsNamespace = $.managementGroupsNamespace;
        this.remediationName = $.remediationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRemediationAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRemediationAtManagementGroupArgs $;

        public Builder() {
            $ = new GetRemediationAtManagementGroupArgs();
        }

        public Builder(GetRemediationAtManagementGroupArgs defaults) {
            $ = new GetRemediationAtManagementGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managementGroupId Management group ID.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupId(String managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        /**
         * @param managementGroupsNamespace The namespace for Microsoft Management RP; only &#34;Microsoft.Management&#34; is allowed.
         * 
         * @return builder
         * 
         */
        public Builder managementGroupsNamespace(String managementGroupsNamespace) {
            $.managementGroupsNamespace = managementGroupsNamespace;
            return this;
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

        public GetRemediationAtManagementGroupArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.managementGroupsNamespace = Objects.requireNonNull($.managementGroupsNamespace, "expected parameter 'managementGroupsNamespace' to be non-null");
            $.remediationName = Objects.requireNonNull($.remediationName, "expected parameter 'remediationName' to be non-null");
            return $;
        }
    }

}
