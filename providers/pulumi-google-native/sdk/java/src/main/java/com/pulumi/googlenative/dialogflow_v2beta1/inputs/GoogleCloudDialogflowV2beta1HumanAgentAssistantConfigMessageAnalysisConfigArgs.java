// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for analyses to run on each conversation message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs();

    /**
     * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="enableEntityExtraction")
    private @Nullable Output<Boolean> enableEntityExtraction;

    /**
     * @return Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Optional<Output<Boolean>> enableEntityExtraction() {
        return Optional.ofNullable(this.enableEntityExtraction);
    }

    /**
     * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user&#39;s attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    @Import(name="enableSentimentAnalysis")
    private @Nullable Output<Boolean> enableSentimentAnalysis;

    /**
     * @return Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user&#39;s attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    public Optional<Output<Boolean>> enableSentimentAnalysis() {
        return Optional.ofNullable(this.enableSentimentAnalysis);
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs $) {
        this.enableEntityExtraction = $.enableEntityExtraction;
        this.enableSentimentAnalysis = $.enableSentimentAnalysis;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableEntityExtraction Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder enableEntityExtraction(@Nullable Output<Boolean> enableEntityExtraction) {
            $.enableEntityExtraction = enableEntityExtraction;
            return this;
        }

        /**
         * @param enableEntityExtraction Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder enableEntityExtraction(Boolean enableEntityExtraction) {
            return enableEntityExtraction(Output.of(enableEntityExtraction));
        }

        /**
         * @param enableSentimentAnalysis Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user&#39;s attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
         * 
         * @return builder
         * 
         */
        public Builder enableSentimentAnalysis(@Nullable Output<Boolean> enableSentimentAnalysis) {
            $.enableSentimentAnalysis = enableSentimentAnalysis;
            return this;
        }

        /**
         * @param enableSentimentAnalysis Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user&#39;s attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
         * 
         * @return builder
         * 
         */
        public Builder enableSentimentAnalysis(Boolean enableSentimentAnalysis) {
            return enableSentimentAnalysis(Output.of(enableSentimentAnalysis));
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs build() {
            return $;
        }
    }

}
