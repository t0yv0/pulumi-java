// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.azurenative.cognitiveservices.inputs.DeploymentModelArgs;
import com.pulumi.azurenative.cognitiveservices.inputs.DeploymentScaleSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment.
 * 
 */
public final class DeploymentPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentPropertiesArgs Empty = new DeploymentPropertiesArgs();

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="model")
    private @Nullable Output<DeploymentModelArgs> model;

    /**
     * @return Properties of Cognitive Services account deployment model.
     * 
     */
    public Optional<Output<DeploymentModelArgs>> model() {
        return Optional.ofNullable(this.model);
    }

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="scaleSettings")
    private @Nullable Output<DeploymentScaleSettingsArgs> scaleSettings;

    /**
     * @return Properties of Cognitive Services account deployment model.
     * 
     */
    public Optional<Output<DeploymentScaleSettingsArgs>> scaleSettings() {
        return Optional.ofNullable(this.scaleSettings);
    }

    private DeploymentPropertiesArgs() {}

    private DeploymentPropertiesArgs(DeploymentPropertiesArgs $) {
        this.model = $.model;
        this.scaleSettings = $.scaleSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentPropertiesArgs $;

        public Builder() {
            $ = new DeploymentPropertiesArgs();
        }

        public Builder(DeploymentPropertiesArgs defaults) {
            $ = new DeploymentPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param model Properties of Cognitive Services account deployment model.
         * 
         * @return builder
         * 
         */
        public Builder model(@Nullable Output<DeploymentModelArgs> model) {
            $.model = model;
            return this;
        }

        /**
         * @param model Properties of Cognitive Services account deployment model.
         * 
         * @return builder
         * 
         */
        public Builder model(DeploymentModelArgs model) {
            return model(Output.of(model));
        }

        /**
         * @param scaleSettings Properties of Cognitive Services account deployment model.
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(@Nullable Output<DeploymentScaleSettingsArgs> scaleSettings) {
            $.scaleSettings = scaleSettings;
            return this;
        }

        /**
         * @param scaleSettings Properties of Cognitive Services account deployment model.
         * 
         * @return builder
         * 
         */
        public Builder scaleSettings(DeploymentScaleSettingsArgs scaleSettings) {
            return scaleSettings(Output.of(scaleSettings));
        }

        public DeploymentPropertiesArgs build() {
            return $;
        }
    }

}
