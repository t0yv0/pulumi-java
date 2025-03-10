// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListRemediationDeploymentsAtResourceArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListRemediationDeploymentsAtResourceArgs Empty = new ListRemediationDeploymentsAtResourceArgs();

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

    /**
     * Resource ID.
     * 
     */
    @Import(name="resourceId", required=true)
    private String resourceId;

    /**
     * @return Resource ID.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Maximum number of records to return.
     * 
     */
    @Import(name="top")
    private @Nullable Integer top;

    /**
     * @return Maximum number of records to return.
     * 
     */
    public Optional<Integer> top() {
        return Optional.ofNullable(this.top);
    }

    private ListRemediationDeploymentsAtResourceArgs() {}

    private ListRemediationDeploymentsAtResourceArgs(ListRemediationDeploymentsAtResourceArgs $) {
        this.remediationName = $.remediationName;
        this.resourceId = $.resourceId;
        this.top = $.top;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListRemediationDeploymentsAtResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListRemediationDeploymentsAtResourceArgs $;

        public Builder() {
            $ = new ListRemediationDeploymentsAtResourceArgs();
        }

        public Builder(ListRemediationDeploymentsAtResourceArgs defaults) {
            $ = new ListRemediationDeploymentsAtResourceArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param resourceId Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param top Maximum number of records to return.
         * 
         * @return builder
         * 
         */
        public Builder top(@Nullable Integer top) {
            $.top = top;
            return this;
        }

        public ListRemediationDeploymentsAtResourceArgs build() {
            $.remediationName = Objects.requireNonNull($.remediationName, "expected parameter 'remediationName' to be non-null");
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
