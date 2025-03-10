// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The stage of a conversation. It indicates whether the virtual agent or a human agent is handling the conversation. If the conversation is created with the conversation profile that has Dialogflow config set, defaults to ConversationStage.VIRTUAL_AGENT_STAGE; Otherwise, defaults to ConversationStage.HUMAN_ASSIST_STAGE. If the conversation is created with the conversation profile that has Dialogflow config set but explicitly sets conversation_stage to ConversationStage.HUMAN_ASSIST_STAGE, it skips ConversationStage.VIRTUAL_AGENT_STAGE stage and directly goes to ConversationStage.HUMAN_ASSIST_STAGE.
     * 
     */
    @EnumType
    public enum ConversationConversationStage {
        /**
         * Unknown. Should never be used after a conversation is successfully created.
         * 
         */
        ConversationStageUnspecified("CONVERSATION_STAGE_UNSPECIFIED"),
        /**
         * The conversation should return virtual agent responses into the conversation.
         * 
         */
        VirtualAgentStage("VIRTUAL_AGENT_STAGE"),
        /**
         * The conversation should not provide responses, just listen and provide suggestions.
         * 
         */
        HumanAssistStage("HUMAN_ASSIST_STAGE");

        private final String value;

        ConversationConversationStage(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ConversationConversationStage[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
