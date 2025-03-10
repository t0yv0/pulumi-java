// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.AS2AcknowledgementConnectionSettingsArgs;
import com.pulumi.azurenative.logic.inputs.AS2EnvelopeSettingsArgs;
import com.pulumi.azurenative.logic.inputs.AS2ErrorSettingsArgs;
import com.pulumi.azurenative.logic.inputs.AS2MdnSettingsArgs;
import com.pulumi.azurenative.logic.inputs.AS2MessageConnectionSettingsArgs;
import com.pulumi.azurenative.logic.inputs.AS2SecuritySettingsArgs;
import com.pulumi.azurenative.logic.inputs.AS2ValidationSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The AS2 agreement protocol settings.
 * 
 */
public final class AS2ProtocolSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AS2ProtocolSettingsArgs Empty = new AS2ProtocolSettingsArgs();

    /**
     * The acknowledgement connection settings.
     * 
     */
    @Import(name="acknowledgementConnectionSettings", required=true)
    private Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings;

    /**
     * @return The acknowledgement connection settings.
     * 
     */
    public Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings() {
        return this.acknowledgementConnectionSettings;
    }

    /**
     * The envelope settings.
     * 
     */
    @Import(name="envelopeSettings", required=true)
    private Output<AS2EnvelopeSettingsArgs> envelopeSettings;

    /**
     * @return The envelope settings.
     * 
     */
    public Output<AS2EnvelopeSettingsArgs> envelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * The error settings.
     * 
     */
    @Import(name="errorSettings", required=true)
    private Output<AS2ErrorSettingsArgs> errorSettings;

    /**
     * @return The error settings.
     * 
     */
    public Output<AS2ErrorSettingsArgs> errorSettings() {
        return this.errorSettings;
    }

    /**
     * The MDN settings.
     * 
     */
    @Import(name="mdnSettings", required=true)
    private Output<AS2MdnSettingsArgs> mdnSettings;

    /**
     * @return The MDN settings.
     * 
     */
    public Output<AS2MdnSettingsArgs> mdnSettings() {
        return this.mdnSettings;
    }

    /**
     * The message connection settings.
     * 
     */
    @Import(name="messageConnectionSettings", required=true)
    private Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings;

    /**
     * @return The message connection settings.
     * 
     */
    public Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings() {
        return this.messageConnectionSettings;
    }

    /**
     * The security settings.
     * 
     */
    @Import(name="securitySettings", required=true)
    private Output<AS2SecuritySettingsArgs> securitySettings;

    /**
     * @return The security settings.
     * 
     */
    public Output<AS2SecuritySettingsArgs> securitySettings() {
        return this.securitySettings;
    }

    /**
     * The validation settings.
     * 
     */
    @Import(name="validationSettings", required=true)
    private Output<AS2ValidationSettingsArgs> validationSettings;

    /**
     * @return The validation settings.
     * 
     */
    public Output<AS2ValidationSettingsArgs> validationSettings() {
        return this.validationSettings;
    }

    private AS2ProtocolSettingsArgs() {}

    private AS2ProtocolSettingsArgs(AS2ProtocolSettingsArgs $) {
        this.acknowledgementConnectionSettings = $.acknowledgementConnectionSettings;
        this.envelopeSettings = $.envelopeSettings;
        this.errorSettings = $.errorSettings;
        this.mdnSettings = $.mdnSettings;
        this.messageConnectionSettings = $.messageConnectionSettings;
        this.securitySettings = $.securitySettings;
        this.validationSettings = $.validationSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2ProtocolSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2ProtocolSettingsArgs $;

        public Builder() {
            $ = new AS2ProtocolSettingsArgs();
        }

        public Builder(AS2ProtocolSettingsArgs defaults) {
            $ = new AS2ProtocolSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acknowledgementConnectionSettings The acknowledgement connection settings.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementConnectionSettings(Output<AS2AcknowledgementConnectionSettingsArgs> acknowledgementConnectionSettings) {
            $.acknowledgementConnectionSettings = acknowledgementConnectionSettings;
            return this;
        }

        /**
         * @param acknowledgementConnectionSettings The acknowledgement connection settings.
         * 
         * @return builder
         * 
         */
        public Builder acknowledgementConnectionSettings(AS2AcknowledgementConnectionSettingsArgs acknowledgementConnectionSettings) {
            return acknowledgementConnectionSettings(Output.of(acknowledgementConnectionSettings));
        }

        /**
         * @param envelopeSettings The envelope settings.
         * 
         * @return builder
         * 
         */
        public Builder envelopeSettings(Output<AS2EnvelopeSettingsArgs> envelopeSettings) {
            $.envelopeSettings = envelopeSettings;
            return this;
        }

        /**
         * @param envelopeSettings The envelope settings.
         * 
         * @return builder
         * 
         */
        public Builder envelopeSettings(AS2EnvelopeSettingsArgs envelopeSettings) {
            return envelopeSettings(Output.of(envelopeSettings));
        }

        /**
         * @param errorSettings The error settings.
         * 
         * @return builder
         * 
         */
        public Builder errorSettings(Output<AS2ErrorSettingsArgs> errorSettings) {
            $.errorSettings = errorSettings;
            return this;
        }

        /**
         * @param errorSettings The error settings.
         * 
         * @return builder
         * 
         */
        public Builder errorSettings(AS2ErrorSettingsArgs errorSettings) {
            return errorSettings(Output.of(errorSettings));
        }

        /**
         * @param mdnSettings The MDN settings.
         * 
         * @return builder
         * 
         */
        public Builder mdnSettings(Output<AS2MdnSettingsArgs> mdnSettings) {
            $.mdnSettings = mdnSettings;
            return this;
        }

        /**
         * @param mdnSettings The MDN settings.
         * 
         * @return builder
         * 
         */
        public Builder mdnSettings(AS2MdnSettingsArgs mdnSettings) {
            return mdnSettings(Output.of(mdnSettings));
        }

        /**
         * @param messageConnectionSettings The message connection settings.
         * 
         * @return builder
         * 
         */
        public Builder messageConnectionSettings(Output<AS2MessageConnectionSettingsArgs> messageConnectionSettings) {
            $.messageConnectionSettings = messageConnectionSettings;
            return this;
        }

        /**
         * @param messageConnectionSettings The message connection settings.
         * 
         * @return builder
         * 
         */
        public Builder messageConnectionSettings(AS2MessageConnectionSettingsArgs messageConnectionSettings) {
            return messageConnectionSettings(Output.of(messageConnectionSettings));
        }

        /**
         * @param securitySettings The security settings.
         * 
         * @return builder
         * 
         */
        public Builder securitySettings(Output<AS2SecuritySettingsArgs> securitySettings) {
            $.securitySettings = securitySettings;
            return this;
        }

        /**
         * @param securitySettings The security settings.
         * 
         * @return builder
         * 
         */
        public Builder securitySettings(AS2SecuritySettingsArgs securitySettings) {
            return securitySettings(Output.of(securitySettings));
        }

        /**
         * @param validationSettings The validation settings.
         * 
         * @return builder
         * 
         */
        public Builder validationSettings(Output<AS2ValidationSettingsArgs> validationSettings) {
            $.validationSettings = validationSettings;
            return this;
        }

        /**
         * @param validationSettings The validation settings.
         * 
         * @return builder
         * 
         */
        public Builder validationSettings(AS2ValidationSettingsArgs validationSettings) {
            return validationSettings(Output.of(validationSettings));
        }

        public AS2ProtocolSettingsArgs build() {
            $.acknowledgementConnectionSettings = Objects.requireNonNull($.acknowledgementConnectionSettings, "expected parameter 'acknowledgementConnectionSettings' to be non-null");
            $.envelopeSettings = Objects.requireNonNull($.envelopeSettings, "expected parameter 'envelopeSettings' to be non-null");
            $.errorSettings = Objects.requireNonNull($.errorSettings, "expected parameter 'errorSettings' to be non-null");
            $.mdnSettings = Objects.requireNonNull($.mdnSettings, "expected parameter 'mdnSettings' to be non-null");
            $.messageConnectionSettings = Objects.requireNonNull($.messageConnectionSettings, "expected parameter 'messageConnectionSettings' to be non-null");
            $.securitySettings = Objects.requireNonNull($.securitySettings, "expected parameter 'securitySettings' to be non-null");
            $.validationSettings = Objects.requireNonNull($.validationSettings, "expected parameter 'validationSettings' to be non-null");
            return $;
        }
    }

}
