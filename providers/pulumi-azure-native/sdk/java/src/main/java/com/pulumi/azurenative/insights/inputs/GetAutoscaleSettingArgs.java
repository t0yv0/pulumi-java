// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutoscaleSettingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoscaleSettingArgs Empty = new GetAutoscaleSettingArgs();

    /**
     * The autoscale setting name.
     * 
     */
    @Import(name="autoscaleSettingName", required=true)
    private String autoscaleSettingName;

    /**
     * @return The autoscale setting name.
     * 
     */
    public String autoscaleSettingName() {
        return this.autoscaleSettingName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAutoscaleSettingArgs() {}

    private GetAutoscaleSettingArgs(GetAutoscaleSettingArgs $) {
        this.autoscaleSettingName = $.autoscaleSettingName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoscaleSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoscaleSettingArgs $;

        public Builder() {
            $ = new GetAutoscaleSettingArgs();
        }

        public Builder(GetAutoscaleSettingArgs defaults) {
            $ = new GetAutoscaleSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscaleSettingName The autoscale setting name.
         * 
         * @return builder
         * 
         */
        public Builder autoscaleSettingName(String autoscaleSettingName) {
            $.autoscaleSettingName = autoscaleSettingName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAutoscaleSettingArgs build() {
            $.autoscaleSettingName = Objects.requireNonNull($.autoscaleSettingName, "expected parameter 'autoscaleSettingName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
