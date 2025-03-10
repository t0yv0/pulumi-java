// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPredictionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPredictionArgs Empty = new GetPredictionArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * The name of the Prediction.
     * 
     */
    @Import(name="predictionName", required=true)
    private String predictionName;

    /**
     * @return The name of the Prediction.
     * 
     */
    public String predictionName() {
        return this.predictionName;
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

    private GetPredictionArgs() {}

    private GetPredictionArgs(GetPredictionArgs $) {
        this.hubName = $.hubName;
        this.predictionName = $.predictionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPredictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPredictionArgs $;

        public Builder() {
            $ = new GetPredictionArgs();
        }

        public Builder(GetPredictionArgs defaults) {
            $ = new GetPredictionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param predictionName The name of the Prediction.
         * 
         * @return builder
         * 
         */
        public Builder predictionName(String predictionName) {
            $.predictionName = predictionName;
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

        public GetPredictionArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.predictionName = Objects.requireNonNull($.predictionName, "expected parameter 'predictionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
