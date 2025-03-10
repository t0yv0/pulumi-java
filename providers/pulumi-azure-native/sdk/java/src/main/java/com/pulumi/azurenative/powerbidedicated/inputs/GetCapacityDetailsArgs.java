// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerbidedicated.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCapacityDetailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCapacityDetailsArgs Empty = new GetCapacityDetailsArgs();

    /**
     * The name of the dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="dedicatedCapacityName", required=true)
    private String dedicatedCapacityName;

    /**
     * @return The name of the dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    public String dedicatedCapacityName() {
        return this.dedicatedCapacityName;
    }

    /**
     * The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCapacityDetailsArgs() {}

    private GetCapacityDetailsArgs(GetCapacityDetailsArgs $) {
        this.dedicatedCapacityName = $.dedicatedCapacityName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCapacityDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCapacityDetailsArgs $;

        public Builder() {
            $ = new GetCapacityDetailsArgs();
        }

        public Builder(GetCapacityDetailsArgs defaults) {
            $ = new GetCapacityDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicatedCapacityName The name of the dedicated capacity. It must be a minimum of 3 characters, and a maximum of 63.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedCapacityName(String dedicatedCapacityName) {
            $.dedicatedCapacityName = dedicatedCapacityName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure Resource group of which a given PowerBIDedicated capacity is part. This name must be at least 1 character in length, and no more than 90.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetCapacityDetailsArgs build() {
            $.dedicatedCapacityName = Objects.requireNonNull($.dedicatedCapacityName, "expected parameter 'dedicatedCapacityName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
