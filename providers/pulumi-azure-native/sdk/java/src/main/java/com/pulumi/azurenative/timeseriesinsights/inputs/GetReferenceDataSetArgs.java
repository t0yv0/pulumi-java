// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.timeseriesinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReferenceDataSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReferenceDataSetArgs Empty = new GetReferenceDataSetArgs();

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
    private String environmentName;

    /**
     * @return The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    public String environmentName() {
        return this.environmentName;
    }

    /**
     * The name of the Time Series Insights reference data set associated with the specified environment.
     * 
     */
    @Import(name="referenceDataSetName", required=true)
    private String referenceDataSetName;

    /**
     * @return The name of the Time Series Insights reference data set associated with the specified environment.
     * 
     */
    public String referenceDataSetName() {
        return this.referenceDataSetName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of an Azure Resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetReferenceDataSetArgs() {}

    private GetReferenceDataSetArgs(GetReferenceDataSetArgs $) {
        this.environmentName = $.environmentName;
        this.referenceDataSetName = $.referenceDataSetName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReferenceDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReferenceDataSetArgs $;

        public Builder() {
            $ = new GetReferenceDataSetArgs();
        }

        public Builder(GetReferenceDataSetArgs defaults) {
            $ = new GetReferenceDataSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder environmentName(String environmentName) {
            $.environmentName = environmentName;
            return this;
        }

        /**
         * @param referenceDataSetName The name of the Time Series Insights reference data set associated with the specified environment.
         * 
         * @return builder
         * 
         */
        public Builder referenceDataSetName(String referenceDataSetName) {
            $.referenceDataSetName = referenceDataSetName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure Resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetReferenceDataSetArgs build() {
            $.environmentName = Objects.requireNonNull($.environmentName, "expected parameter 'environmentName' to be non-null");
            $.referenceDataSetName = Objects.requireNonNull($.referenceDataSetName, "expected parameter 'referenceDataSetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
