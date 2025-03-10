// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.AS2OneWayAgreementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The integration account AS2 agreement content.
 * 
 */
public final class AS2AgreementContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AS2AgreementContentArgs Empty = new AS2AgreementContentArgs();

    /**
     * The AS2 one-way receive agreement.
     * 
     */
    @Import(name="receiveAgreement", required=true)
    private Output<AS2OneWayAgreementArgs> receiveAgreement;

    /**
     * @return The AS2 one-way receive agreement.
     * 
     */
    public Output<AS2OneWayAgreementArgs> receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The AS2 one-way send agreement.
     * 
     */
    @Import(name="sendAgreement", required=true)
    private Output<AS2OneWayAgreementArgs> sendAgreement;

    /**
     * @return The AS2 one-way send agreement.
     * 
     */
    public Output<AS2OneWayAgreementArgs> sendAgreement() {
        return this.sendAgreement;
    }

    private AS2AgreementContentArgs() {}

    private AS2AgreementContentArgs(AS2AgreementContentArgs $) {
        this.receiveAgreement = $.receiveAgreement;
        this.sendAgreement = $.sendAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AS2AgreementContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2AgreementContentArgs $;

        public Builder() {
            $ = new AS2AgreementContentArgs();
        }

        public Builder(AS2AgreementContentArgs defaults) {
            $ = new AS2AgreementContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param receiveAgreement The AS2 one-way receive agreement.
         * 
         * @return builder
         * 
         */
        public Builder receiveAgreement(Output<AS2OneWayAgreementArgs> receiveAgreement) {
            $.receiveAgreement = receiveAgreement;
            return this;
        }

        /**
         * @param receiveAgreement The AS2 one-way receive agreement.
         * 
         * @return builder
         * 
         */
        public Builder receiveAgreement(AS2OneWayAgreementArgs receiveAgreement) {
            return receiveAgreement(Output.of(receiveAgreement));
        }

        /**
         * @param sendAgreement The AS2 one-way send agreement.
         * 
         * @return builder
         * 
         */
        public Builder sendAgreement(Output<AS2OneWayAgreementArgs> sendAgreement) {
            $.sendAgreement = sendAgreement;
            return this;
        }

        /**
         * @param sendAgreement The AS2 one-way send agreement.
         * 
         * @return builder
         * 
         */
        public Builder sendAgreement(AS2OneWayAgreementArgs sendAgreement) {
            return sendAgreement(Output.of(sendAgreement));
        }

        public AS2AgreementContentArgs build() {
            $.receiveAgreement = Objects.requireNonNull($.receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
            $.sendAgreement = Objects.requireNonNull($.sendAgreement, "expected parameter 'sendAgreement' to be non-null");
            return $;
        }
    }

}
