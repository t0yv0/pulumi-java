// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1LoggingConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1NotificationConfigArgs;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConversationProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConversationProfileArgs Empty = new ConversationProfileArgs();

    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    @Import(name="automatedAgentConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> automatedAgentConfig;

    /**
     * @return Configuration for an automated agent to use with this profile.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs>> automatedAgentConfig() {
        return Optional.ofNullable(this.automatedAgentConfig);
    }

    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    @Import(name="humanAgentAssistantConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> humanAgentAssistantConfig;

    /**
     * @return Configuration for agent assistance to use with this profile.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs>> humanAgentAssistantConfig() {
        return Optional.ofNullable(this.humanAgentAssistantConfig);
    }

    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="humanAgentHandoffConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> humanAgentHandoffConfig;

    /**
     * @return Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs>> humanAgentHandoffConfig() {
        return Optional.ofNullable(this.humanAgentHandoffConfig);
    }

    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    @Import(name="languageCode")
    private @Nullable Output<String> languageCode;

    /**
     * @return Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
     * 
     */
    public Optional<Output<String>> languageCode() {
        return Optional.ofNullable(this.languageCode);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1LoggingConfigArgs> loggingConfig;

    /**
     * @return Configuration for logging conversation lifecycle events.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1LoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    @Import(name="newMessageEventNotificationConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> newMessageEventNotificationConfig;

    /**
     * @return Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs>> newMessageEventNotificationConfig() {
        return Optional.ofNullable(this.newMessageEventNotificationConfig);
    }

    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    @Import(name="notificationConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig;

    /**
     * @return Configuration for publishing conversation lifecycle events.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs>> notificationConfig() {
        return Optional.ofNullable(this.notificationConfig);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Import(name="securitySettings")
    private @Nullable Output<String> securitySettings;

    /**
     * @return Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    public Optional<Output<String>> securitySettings() {
        return Optional.ofNullable(this.securitySettings);
    }

    /**
     * Settings for speech transcription.
     * 
     */
    @Import(name="sttConfig")
    private @Nullable Output<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> sttConfig;

    /**
     * @return Settings for speech transcription.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs>> sttConfig() {
        return Optional.ofNullable(this.sttConfig);
    }

    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private ConversationProfileArgs() {}

    private ConversationProfileArgs(ConversationProfileArgs $) {
        this.automatedAgentConfig = $.automatedAgentConfig;
        this.displayName = $.displayName;
        this.humanAgentAssistantConfig = $.humanAgentAssistantConfig;
        this.humanAgentHandoffConfig = $.humanAgentHandoffConfig;
        this.languageCode = $.languageCode;
        this.location = $.location;
        this.loggingConfig = $.loggingConfig;
        this.name = $.name;
        this.newMessageEventNotificationConfig = $.newMessageEventNotificationConfig;
        this.notificationConfig = $.notificationConfig;
        this.project = $.project;
        this.securitySettings = $.securitySettings;
        this.sttConfig = $.sttConfig;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConversationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConversationProfileArgs $;

        public Builder() {
            $ = new ConversationProfileArgs();
        }

        public Builder(ConversationProfileArgs defaults) {
            $ = new ConversationProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automatedAgentConfig Configuration for an automated agent to use with this profile.
         * 
         * @return builder
         * 
         */
        public Builder automatedAgentConfig(@Nullable Output<GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs> automatedAgentConfig) {
            $.automatedAgentConfig = automatedAgentConfig;
            return this;
        }

        /**
         * @param automatedAgentConfig Configuration for an automated agent to use with this profile.
         * 
         * @return builder
         * 
         */
        public Builder automatedAgentConfig(GoogleCloudDialogflowV2beta1AutomatedAgentConfigArgs automatedAgentConfig) {
            return automatedAgentConfig(Output.of(automatedAgentConfig));
        }

        /**
         * @param displayName Human readable name for this profile. Max length 1024 bytes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Human readable name for this profile. Max length 1024 bytes.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param humanAgentAssistantConfig Configuration for agent assistance to use with this profile.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentAssistantConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs> humanAgentAssistantConfig) {
            $.humanAgentAssistantConfig = humanAgentAssistantConfig;
            return this;
        }

        /**
         * @param humanAgentAssistantConfig Configuration for agent assistance to use with this profile.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentAssistantConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs humanAgentAssistantConfig) {
            return humanAgentAssistantConfig(Output.of(humanAgentAssistantConfig));
        }

        /**
         * @param humanAgentHandoffConfig Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentHandoffConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs> humanAgentHandoffConfig) {
            $.humanAgentHandoffConfig = humanAgentHandoffConfig;
            return this;
        }

        /**
         * @param humanAgentHandoffConfig Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
         * 
         * @return builder
         * 
         */
        public Builder humanAgentHandoffConfig(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigArgs humanAgentHandoffConfig) {
            return humanAgentHandoffConfig(Output.of(humanAgentHandoffConfig));
        }

        /**
         * @param languageCode Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(@Nullable Output<String> languageCode) {
            $.languageCode = languageCode;
            return this;
        }

        /**
         * @param languageCode Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: &#34;en-US&#34;.
         * 
         * @return builder
         * 
         */
        public Builder languageCode(String languageCode) {
            return languageCode(Output.of(languageCode));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param loggingConfig Configuration for logging conversation lifecycle events.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<GoogleCloudDialogflowV2beta1LoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Configuration for logging conversation lifecycle events.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(GoogleCloudDialogflowV2beta1LoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param name The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param newMessageEventNotificationConfig Configuration for publishing new message events. Event will be sent in format of ConversationEvent
         * 
         * @return builder
         * 
         */
        public Builder newMessageEventNotificationConfig(@Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> newMessageEventNotificationConfig) {
            $.newMessageEventNotificationConfig = newMessageEventNotificationConfig;
            return this;
        }

        /**
         * @param newMessageEventNotificationConfig Configuration for publishing new message events. Event will be sent in format of ConversationEvent
         * 
         * @return builder
         * 
         */
        public Builder newMessageEventNotificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigArgs newMessageEventNotificationConfig) {
            return newMessageEventNotificationConfig(Output.of(newMessageEventNotificationConfig));
        }

        /**
         * @param notificationConfig Configuration for publishing conversation lifecycle events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(@Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig) {
            $.notificationConfig = notificationConfig;
            return this;
        }

        /**
         * @param notificationConfig Configuration for publishing conversation lifecycle events.
         * 
         * @return builder
         * 
         */
        public Builder notificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigArgs notificationConfig) {
            return notificationConfig(Output.of(notificationConfig));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param securitySettings Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
         * 
         * @return builder
         * 
         */
        public Builder securitySettings(@Nullable Output<String> securitySettings) {
            $.securitySettings = securitySettings;
            return this;
        }

        /**
         * @param securitySettings Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
         * 
         * @return builder
         * 
         */
        public Builder securitySettings(String securitySettings) {
            return securitySettings(Output.of(securitySettings));
        }

        /**
         * @param sttConfig Settings for speech transcription.
         * 
         * @return builder
         * 
         */
        public Builder sttConfig(@Nullable Output<GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs> sttConfig) {
            $.sttConfig = sttConfig;
            return this;
        }

        /**
         * @param sttConfig Settings for speech transcription.
         * 
         * @return builder
         * 
         */
        public Builder sttConfig(GoogleCloudDialogflowV2beta1SpeechToTextConfigArgs sttConfig) {
            return sttConfig(Output.of(sttConfig));
        }

        /**
         * @param timeZone The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public ConversationProfileArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}
