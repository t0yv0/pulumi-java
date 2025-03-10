// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Knowledge base source settings. Supported features: ARTICLE_SUGGESTION, FAQ.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs();

    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
     * 
     */
    @Import(name="knowledgeBases", required=true)
    private Output<List<String>> knowledgeBases;

    /**
     * @return Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
     * 
     */
    public Output<List<String>> knowledgeBases() {
        return this.knowledgeBases;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs() {}

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs $) {
        this.knowledgeBases = $.knowledgeBases;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param knowledgeBases Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
         * 
         * @return builder
         * 
         */
        public Builder knowledgeBases(Output<List<String>> knowledgeBases) {
            $.knowledgeBases = knowledgeBases;
            return this;
        }

        /**
         * @param knowledgeBases Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
         * 
         * @return builder
         * 
         */
        public Builder knowledgeBases(List<String> knowledgeBases) {
            return knowledgeBases(Output.of(knowledgeBases));
        }

        /**
         * @param knowledgeBases Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
         * 
         * @return builder
         * 
         */
        public Builder knowledgeBases(String... knowledgeBases) {
            return knowledgeBases(List.of(knowledgeBases));
        }

        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceArgs build() {
            $.knowledgeBases = Objects.requireNonNull($.knowledgeBases, "expected parameter 'knowledgeBases' to be non-null");
            return $;
        }
    }

}
