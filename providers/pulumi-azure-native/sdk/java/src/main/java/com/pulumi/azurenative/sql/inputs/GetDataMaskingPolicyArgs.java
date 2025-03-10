// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataMaskingPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDataMaskingPolicyArgs Empty = new GetDataMaskingPolicyArgs();

    /**
     * The name of the database for which the data masking rule applies.
     * 
     */
    @Import(name="dataMaskingPolicyName", required=true)
    private String dataMaskingPolicyName;

    /**
     * @return The name of the database for which the data masking rule applies.
     * 
     */
    public String dataMaskingPolicyName() {
        return this.dataMaskingPolicyName;
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private String databaseName;

    /**
     * @return The name of the database.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private String serverName;

    /**
     * @return The name of the server.
     * 
     */
    public String serverName() {
        return this.serverName;
    }

    private GetDataMaskingPolicyArgs() {}

    private GetDataMaskingPolicyArgs(GetDataMaskingPolicyArgs $) {
        this.dataMaskingPolicyName = $.dataMaskingPolicyName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataMaskingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataMaskingPolicyArgs $;

        public Builder() {
            $ = new GetDataMaskingPolicyArgs();
        }

        public Builder(GetDataMaskingPolicyArgs defaults) {
            $ = new GetDataMaskingPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataMaskingPolicyName The name of the database for which the data masking rule applies.
         * 
         * @return builder
         * 
         */
        public Builder dataMaskingPolicyName(String dataMaskingPolicyName) {
            $.dataMaskingPolicyName = dataMaskingPolicyName;
            return this;
        }

        /**
         * @param databaseName The name of the database.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            $.serverName = serverName;
            return this;
        }

        public GetDataMaskingPolicyArgs build() {
            $.dataMaskingPolicyName = Objects.requireNonNull($.dataMaskingPolicyName, "expected parameter 'dataMaskingPolicyName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
