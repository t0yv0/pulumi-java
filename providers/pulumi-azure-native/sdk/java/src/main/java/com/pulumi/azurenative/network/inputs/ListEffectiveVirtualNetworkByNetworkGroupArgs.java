// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListEffectiveVirtualNetworkByNetworkGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListEffectiveVirtualNetworkByNetworkGroupArgs Empty = new ListEffectiveVirtualNetworkByNetworkGroupArgs();

    /**
     * The name of the network group to get.
     * 
     */
    @Import(name="networkGroupName", required=true)
    private String networkGroupName;

    /**
     * @return The name of the network group to get.
     * 
     */
    public String networkGroupName() {
        return this.networkGroupName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private String networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public String networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    @Import(name="skipToken")
    private @Nullable String skipToken;

    /**
     * @return When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
     * 
     */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    private ListEffectiveVirtualNetworkByNetworkGroupArgs() {}

    private ListEffectiveVirtualNetworkByNetworkGroupArgs(ListEffectiveVirtualNetworkByNetworkGroupArgs $) {
        this.networkGroupName = $.networkGroupName;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
        this.skipToken = $.skipToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListEffectiveVirtualNetworkByNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListEffectiveVirtualNetworkByNetworkGroupArgs $;

        public Builder() {
            $ = new ListEffectiveVirtualNetworkByNetworkGroupArgs();
        }

        public Builder(ListEffectiveVirtualNetworkByNetworkGroupArgs defaults) {
            $ = new ListEffectiveVirtualNetworkByNetworkGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param networkGroupName The name of the network group to get.
         * 
         * @return builder
         * 
         */
        public Builder networkGroupName(String networkGroupName) {
            $.networkGroupName = networkGroupName;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param skipToken When present, the value can be passed to a subsequent query call (together with the same query and scopes used in the current request) to retrieve the next page of data.
         * 
         * @return builder
         * 
         */
        public Builder skipToken(@Nullable String skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        public ListEffectiveVirtualNetworkByNetworkGroupArgs build() {
            $.networkGroupName = Objects.requireNonNull($.networkGroupName, "expected parameter 'networkGroupName' to be non-null");
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
