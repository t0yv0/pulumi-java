// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A single flow version with specified traffic allocation.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs Empty = new GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs();

    /**
     * Whether the variant is for the control group.
     * 
     */
    @Import(name="isControlGroup")
    private @Nullable Output<Boolean> isControlGroup;

    /**
     * @return Whether the variant is for the control group.
     * 
     */
    public Optional<Output<Boolean>> isControlGroup() {
        return Optional.ofNullable(this.isControlGroup);
    }

    /**
     * Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
     * 
     */
    @Import(name="trafficAllocation")
    private @Nullable Output<Double> trafficAllocation;

    /**
     * @return Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
     * 
     */
    public Optional<Output<Double>> trafficAllocation() {
        return Optional.ofNullable(this.trafficAllocation);
    }

    /**
     * The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs() {}

    private GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs(GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs $) {
        this.isControlGroup = $.isControlGroup;
        this.trafficAllocation = $.trafficAllocation;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isControlGroup Whether the variant is for the control group.
         * 
         * @return builder
         * 
         */
        public Builder isControlGroup(@Nullable Output<Boolean> isControlGroup) {
            $.isControlGroup = isControlGroup;
            return this;
        }

        /**
         * @param isControlGroup Whether the variant is for the control group.
         * 
         * @return builder
         * 
         */
        public Builder isControlGroup(Boolean isControlGroup) {
            return isControlGroup(Output.of(isControlGroup));
        }

        /**
         * @param trafficAllocation Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
         * 
         * @return builder
         * 
         */
        public Builder trafficAllocation(@Nullable Output<Double> trafficAllocation) {
            $.trafficAllocation = trafficAllocation;
            return this;
        }

        /**
         * @param trafficAllocation Percentage of the traffic which should be routed to this version of flow. Traffic allocation for a single flow must sum up to 1.0.
         * 
         * @return builder
         * 
         */
        public Builder trafficAllocation(Double trafficAllocation) {
            return trafficAllocation(Output.of(trafficAllocation));
        }

        /**
         * @param version The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The name of the flow version. Format: `projects//locations//agents//flows//versions/`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs build() {
            return $;
        }
    }

}
