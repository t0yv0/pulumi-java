// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.consumption.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBudgetResourceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBudgetResourceGroupArgs Empty = new GetBudgetResourceGroupArgs();

    /**
     * The name of this Consumption Budget.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of this Consumption Budget.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the subscription.
     * 
     */
    @Import(name="resourceGroupId", required=true)
    private String resourceGroupId;

    /**
     * @return The ID of the subscription.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    private GetBudgetResourceGroupArgs() {}

    private GetBudgetResourceGroupArgs(GetBudgetResourceGroupArgs $) {
        this.name = $.name;
        this.resourceGroupId = $.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBudgetResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBudgetResourceGroupArgs $;

        public Builder() {
            $ = new GetBudgetResourceGroupArgs();
        }

        public Builder(GetBudgetResourceGroupArgs defaults) {
            $ = new GetBudgetResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of this Consumption Budget.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        public GetBudgetResourceGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupId = Objects.requireNonNull($.resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
            return $;
        }
    }

}
