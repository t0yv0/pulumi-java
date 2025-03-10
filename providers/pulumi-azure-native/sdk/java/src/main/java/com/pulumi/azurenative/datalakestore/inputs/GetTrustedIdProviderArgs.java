// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTrustedIdProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrustedIdProviderArgs Empty = new GetTrustedIdProviderArgs();

    /**
     * The name of the Data Lake Store account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Data Lake Store account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the trusted identity provider to retrieve.
     * 
     */
    @Import(name="trustedIdProviderName", required=true)
    private String trustedIdProviderName;

    /**
     * @return The name of the trusted identity provider to retrieve.
     * 
     */
    public String trustedIdProviderName() {
        return this.trustedIdProviderName;
    }

    private GetTrustedIdProviderArgs() {}

    private GetTrustedIdProviderArgs(GetTrustedIdProviderArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.trustedIdProviderName = $.trustedIdProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrustedIdProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrustedIdProviderArgs $;

        public Builder() {
            $ = new GetTrustedIdProviderArgs();
        }

        public Builder(GetTrustedIdProviderArgs defaults) {
            $ = new GetTrustedIdProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Data Lake Store account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder trustedIdProviderName(String trustedIdProviderName) {
            $.trustedIdProviderName = trustedIdProviderName;
            return this;
        }

        public GetTrustedIdProviderArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.trustedIdProviderName = Objects.requireNonNull($.trustedIdProviderName, "expected parameter 'trustedIdProviderName' to be non-null");
            return $;
        }
    }

}
