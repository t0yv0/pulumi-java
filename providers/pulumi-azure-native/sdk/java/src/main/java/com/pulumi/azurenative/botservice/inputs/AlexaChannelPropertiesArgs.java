// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters to provide for the Alexa channel.
 * 
 */
public final class AlexaChannelPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlexaChannelPropertiesArgs Empty = new AlexaChannelPropertiesArgs();

    /**
     * The Alexa skill Id
     * 
     */
    @Import(name="alexaSkillId", required=true)
    private Output<String> alexaSkillId;

    /**
     * @return The Alexa skill Id
     * 
     */
    public Output<String> alexaSkillId() {
        return this.alexaSkillId;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    /**
     * @return Whether this channel is enabled for the bot
     * 
     */
    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    private AlexaChannelPropertiesArgs() {}

    private AlexaChannelPropertiesArgs(AlexaChannelPropertiesArgs $) {
        this.alexaSkillId = $.alexaSkillId;
        this.isEnabled = $.isEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlexaChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlexaChannelPropertiesArgs $;

        public Builder() {
            $ = new AlexaChannelPropertiesArgs();
        }

        public Builder(AlexaChannelPropertiesArgs defaults) {
            $ = new AlexaChannelPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alexaSkillId The Alexa skill Id
         * 
         * @return builder
         * 
         */
        public Builder alexaSkillId(Output<String> alexaSkillId) {
            $.alexaSkillId = alexaSkillId;
            return this;
        }

        /**
         * @param alexaSkillId The Alexa skill Id
         * 
         * @return builder
         * 
         */
        public Builder alexaSkillId(String alexaSkillId) {
            return alexaSkillId(Output.of(alexaSkillId));
        }

        /**
         * @param isEnabled Whether this channel is enabled for the bot
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Whether this channel is enabled for the bot
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public AlexaChannelPropertiesArgs build() {
            $.alexaSkillId = Objects.requireNonNull($.alexaSkillId, "expected parameter 'alexaSkillId' to be non-null");
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            return $;
        }
    }

}
