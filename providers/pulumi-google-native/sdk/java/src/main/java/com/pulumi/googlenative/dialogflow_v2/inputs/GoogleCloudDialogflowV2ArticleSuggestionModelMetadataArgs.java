// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2ArticleSuggestionModelMetadataTrainingModelType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for article suggestion models.
 * 
 */
public final class GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs Empty = new GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs();

    /**
     * Optional. Type of the article suggestion model. If not provided, model_type is used.
     * 
     */
    @Import(name="trainingModelType")
    private @Nullable Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataTrainingModelType> trainingModelType;

    /**
     * @return Optional. Type of the article suggestion model. If not provided, model_type is used.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataTrainingModelType>> trainingModelType() {
        return Optional.ofNullable(this.trainingModelType);
    }

    private GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs() {}

    private GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs(GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs $) {
        this.trainingModelType = $.trainingModelType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs();
        }

        public Builder(GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs defaults) {
            $ = new GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param trainingModelType Optional. Type of the article suggestion model. If not provided, model_type is used.
         * 
         * @return builder
         * 
         */
        public Builder trainingModelType(@Nullable Output<GoogleCloudDialogflowV2ArticleSuggestionModelMetadataTrainingModelType> trainingModelType) {
            $.trainingModelType = trainingModelType;
            return this;
        }

        /**
         * @param trainingModelType Optional. Type of the article suggestion model. If not provided, model_type is used.
         * 
         * @return builder
         * 
         */
        public Builder trainingModelType(GoogleCloudDialogflowV2ArticleSuggestionModelMetadataTrainingModelType trainingModelType) {
            return trainingModelType(Output.of(trainingModelType));
        }

        public GoogleCloudDialogflowV2ArticleSuggestionModelMetadataArgs build() {
            return $;
        }
    }

}
