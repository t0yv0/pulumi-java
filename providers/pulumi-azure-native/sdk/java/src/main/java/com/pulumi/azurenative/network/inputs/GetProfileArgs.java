// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProfileArgs Empty = new GetProfileArgs();

    /**
     * The name of the Traffic Manager profile.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return The name of the Traffic Manager profile.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * The name of the resource group containing the Traffic Manager profile.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group containing the Traffic Manager profile.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProfileArgs() {}

    private GetProfileArgs(GetProfileArgs $) {
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProfileArgs $;

        public Builder() {
            $ = new GetProfileArgs();
        }

        public Builder(GetProfileArgs defaults) {
            $ = new GetProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileName The name of the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Traffic Manager profile.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetProfileArgs build() {
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
