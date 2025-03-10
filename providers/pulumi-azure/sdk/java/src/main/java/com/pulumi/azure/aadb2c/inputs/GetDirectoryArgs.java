// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.aadb2c.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDirectoryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDirectoryArgs Empty = new GetDirectoryArgs();

    /**
     * Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix.
     * 
     */
    @Import(name="domainName", required=true)
    private String domainName;

    /**
     * @return Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix.
     * 
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * The name of the Resource Group where the AAD B2C Directory exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Resource Group where the AAD B2C Directory exists.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDirectoryArgs() {}

    private GetDirectoryArgs(GetDirectoryArgs $) {
        this.domainName = $.domainName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDirectoryArgs $;

        public Builder() {
            $ = new GetDirectoryArgs();
        }

        public Builder(GetDirectoryArgs defaults) {
            $ = new GetDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName Domain name of the B2C tenant, including the `.onmicrosoft.com` suffix.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the AAD B2C Directory exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDirectoryArgs build() {
            $.domainName = Objects.requireNonNull($.domainName, "expected parameter 'domainName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
