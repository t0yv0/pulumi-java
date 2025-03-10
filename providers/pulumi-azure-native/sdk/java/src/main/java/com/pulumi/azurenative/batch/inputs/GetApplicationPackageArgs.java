// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationPackageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationPackageArgs Empty = new GetApplicationPackageArgs();

    /**
     * The name of the Batch account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the Batch account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the application. This must be unique within the account.
     * 
     */
    @Import(name="applicationName", required=true)
    private String applicationName;

    /**
     * @return The name of the application. This must be unique within the account.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * The name of the resource group that contains the Batch account.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the Batch account.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The version of the application.
     * 
     */
    @Import(name="versionName", required=true)
    private String versionName;

    /**
     * @return The version of the application.
     * 
     */
    public String versionName() {
        return this.versionName;
    }

    private GetApplicationPackageArgs() {}

    private GetApplicationPackageArgs(GetApplicationPackageArgs $) {
        this.accountName = $.accountName;
        this.applicationName = $.applicationName;
        this.resourceGroupName = $.resourceGroupName;
        this.versionName = $.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationPackageArgs $;

        public Builder() {
            $ = new GetApplicationPackageArgs();
        }

        public Builder(GetApplicationPackageArgs defaults) {
            $ = new GetApplicationPackageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param applicationName The name of the application. This must be unique within the account.
         * 
         * @return builder
         * 
         */
        public Builder applicationName(String applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the Batch account.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param versionName The version of the application.
         * 
         * @return builder
         * 
         */
        public Builder versionName(String versionName) {
            $.versionName = versionName;
            return this;
        }

        public GetApplicationPackageArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.versionName = Objects.requireNonNull($.versionName, "expected parameter 'versionName' to be non-null");
            return $;
        }
    }

}
