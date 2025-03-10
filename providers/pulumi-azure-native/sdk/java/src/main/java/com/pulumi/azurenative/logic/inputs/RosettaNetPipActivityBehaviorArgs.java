// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.RosettaNetActionType;
import com.pulumi.azurenative.logic.enums.RosettaNetPipConfidentialityScope;
import com.pulumi.azurenative.logic.enums.RosettaNetResponseType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * The integration account RosettaNet ProcessConfiguration activity behavior.
 * 
 */
public final class RosettaNetPipActivityBehaviorArgs extends com.pulumi.resources.ResourceArgs {

    public static final RosettaNetPipActivityBehaviorArgs Empty = new RosettaNetPipActivityBehaviorArgs();

    /**
     * The value indicating whether the RosettaNet PIP is used for a single action.
     * 
     */
    @Import(name="actionType", required=true)
    private Output<RosettaNetActionType> actionType;

    /**
     * @return The value indicating whether the RosettaNet PIP is used for a single action.
     * 
     */
    public Output<RosettaNetActionType> actionType() {
        return this.actionType;
    }

    /**
     * The value indicating whether authorization is required.
     * 
     */
    @Import(name="isAuthorizationRequired", required=true)
    private Output<Boolean> isAuthorizationRequired;

    /**
     * @return The value indicating whether authorization is required.
     * 
     */
    public Output<Boolean> isAuthorizationRequired() {
        return this.isAuthorizationRequired;
    }

    /**
     * The value indicating whether secured transport is required.
     * 
     */
    @Import(name="isSecuredTransportRequired", required=true)
    private Output<Boolean> isSecuredTransportRequired;

    /**
     * @return The value indicating whether secured transport is required.
     * 
     */
    public Output<Boolean> isSecuredTransportRequired() {
        return this.isSecuredTransportRequired;
    }

    /**
     * The value indicating whether non-repudiation is for origin and content.
     * 
     */
    @Import(name="nonRepudiationOfOriginAndContent", required=true)
    private Output<Boolean> nonRepudiationOfOriginAndContent;

    /**
     * @return The value indicating whether non-repudiation is for origin and content.
     * 
     */
    public Output<Boolean> nonRepudiationOfOriginAndContent() {
        return this.nonRepudiationOfOriginAndContent;
    }

    /**
     * The persistent confidentiality encryption scope.
     * 
     */
    @Import(name="persistentConfidentialityScope", required=true)
    private Output<RosettaNetPipConfidentialityScope> persistentConfidentialityScope;

    /**
     * @return The persistent confidentiality encryption scope.
     * 
     */
    public Output<RosettaNetPipConfidentialityScope> persistentConfidentialityScope() {
        return this.persistentConfidentialityScope;
    }

    /**
     * The value indicating whether the RosettaNet PIP communication is synchronous.
     * 
     */
    @Import(name="responseType", required=true)
    private Output<RosettaNetResponseType> responseType;

    /**
     * @return The value indicating whether the RosettaNet PIP communication is synchronous.
     * 
     */
    public Output<RosettaNetResponseType> responseType() {
        return this.responseType;
    }

    /**
     * The value indicating retry count.
     * 
     */
    @Import(name="retryCount", required=true)
    private Output<Integer> retryCount;

    /**
     * @return The value indicating retry count.
     * 
     */
    public Output<Integer> retryCount() {
        return this.retryCount;
    }

    /**
     * The time to perform in seconds.
     * 
     */
    @Import(name="timeToPerformInSeconds", required=true)
    private Output<Integer> timeToPerformInSeconds;

    /**
     * @return The time to perform in seconds.
     * 
     */
    public Output<Integer> timeToPerformInSeconds() {
        return this.timeToPerformInSeconds;
    }

    private RosettaNetPipActivityBehaviorArgs() {}

    private RosettaNetPipActivityBehaviorArgs(RosettaNetPipActivityBehaviorArgs $) {
        this.actionType = $.actionType;
        this.isAuthorizationRequired = $.isAuthorizationRequired;
        this.isSecuredTransportRequired = $.isSecuredTransportRequired;
        this.nonRepudiationOfOriginAndContent = $.nonRepudiationOfOriginAndContent;
        this.persistentConfidentialityScope = $.persistentConfidentialityScope;
        this.responseType = $.responseType;
        this.retryCount = $.retryCount;
        this.timeToPerformInSeconds = $.timeToPerformInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RosettaNetPipActivityBehaviorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RosettaNetPipActivityBehaviorArgs $;

        public Builder() {
            $ = new RosettaNetPipActivityBehaviorArgs();
        }

        public Builder(RosettaNetPipActivityBehaviorArgs defaults) {
            $ = new RosettaNetPipActivityBehaviorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType The value indicating whether the RosettaNet PIP is used for a single action.
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<RosettaNetActionType> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType The value indicating whether the RosettaNet PIP is used for a single action.
         * 
         * @return builder
         * 
         */
        public Builder actionType(RosettaNetActionType actionType) {
            return actionType(Output.of(actionType));
        }

        /**
         * @param isAuthorizationRequired The value indicating whether authorization is required.
         * 
         * @return builder
         * 
         */
        public Builder isAuthorizationRequired(Output<Boolean> isAuthorizationRequired) {
            $.isAuthorizationRequired = isAuthorizationRequired;
            return this;
        }

        /**
         * @param isAuthorizationRequired The value indicating whether authorization is required.
         * 
         * @return builder
         * 
         */
        public Builder isAuthorizationRequired(Boolean isAuthorizationRequired) {
            return isAuthorizationRequired(Output.of(isAuthorizationRequired));
        }

        /**
         * @param isSecuredTransportRequired The value indicating whether secured transport is required.
         * 
         * @return builder
         * 
         */
        public Builder isSecuredTransportRequired(Output<Boolean> isSecuredTransportRequired) {
            $.isSecuredTransportRequired = isSecuredTransportRequired;
            return this;
        }

        /**
         * @param isSecuredTransportRequired The value indicating whether secured transport is required.
         * 
         * @return builder
         * 
         */
        public Builder isSecuredTransportRequired(Boolean isSecuredTransportRequired) {
            return isSecuredTransportRequired(Output.of(isSecuredTransportRequired));
        }

        /**
         * @param nonRepudiationOfOriginAndContent The value indicating whether non-repudiation is for origin and content.
         * 
         * @return builder
         * 
         */
        public Builder nonRepudiationOfOriginAndContent(Output<Boolean> nonRepudiationOfOriginAndContent) {
            $.nonRepudiationOfOriginAndContent = nonRepudiationOfOriginAndContent;
            return this;
        }

        /**
         * @param nonRepudiationOfOriginAndContent The value indicating whether non-repudiation is for origin and content.
         * 
         * @return builder
         * 
         */
        public Builder nonRepudiationOfOriginAndContent(Boolean nonRepudiationOfOriginAndContent) {
            return nonRepudiationOfOriginAndContent(Output.of(nonRepudiationOfOriginAndContent));
        }

        /**
         * @param persistentConfidentialityScope The persistent confidentiality encryption scope.
         * 
         * @return builder
         * 
         */
        public Builder persistentConfidentialityScope(Output<RosettaNetPipConfidentialityScope> persistentConfidentialityScope) {
            $.persistentConfidentialityScope = persistentConfidentialityScope;
            return this;
        }

        /**
         * @param persistentConfidentialityScope The persistent confidentiality encryption scope.
         * 
         * @return builder
         * 
         */
        public Builder persistentConfidentialityScope(RosettaNetPipConfidentialityScope persistentConfidentialityScope) {
            return persistentConfidentialityScope(Output.of(persistentConfidentialityScope));
        }

        /**
         * @param responseType The value indicating whether the RosettaNet PIP communication is synchronous.
         * 
         * @return builder
         * 
         */
        public Builder responseType(Output<RosettaNetResponseType> responseType) {
            $.responseType = responseType;
            return this;
        }

        /**
         * @param responseType The value indicating whether the RosettaNet PIP communication is synchronous.
         * 
         * @return builder
         * 
         */
        public Builder responseType(RosettaNetResponseType responseType) {
            return responseType(Output.of(responseType));
        }

        /**
         * @param retryCount The value indicating retry count.
         * 
         * @return builder
         * 
         */
        public Builder retryCount(Output<Integer> retryCount) {
            $.retryCount = retryCount;
            return this;
        }

        /**
         * @param retryCount The value indicating retry count.
         * 
         * @return builder
         * 
         */
        public Builder retryCount(Integer retryCount) {
            return retryCount(Output.of(retryCount));
        }

        /**
         * @param timeToPerformInSeconds The time to perform in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeToPerformInSeconds(Output<Integer> timeToPerformInSeconds) {
            $.timeToPerformInSeconds = timeToPerformInSeconds;
            return this;
        }

        /**
         * @param timeToPerformInSeconds The time to perform in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeToPerformInSeconds(Integer timeToPerformInSeconds) {
            return timeToPerformInSeconds(Output.of(timeToPerformInSeconds));
        }

        public RosettaNetPipActivityBehaviorArgs build() {
            $.actionType = Objects.requireNonNull($.actionType, "expected parameter 'actionType' to be non-null");
            $.isAuthorizationRequired = Objects.requireNonNull($.isAuthorizationRequired, "expected parameter 'isAuthorizationRequired' to be non-null");
            $.isSecuredTransportRequired = Objects.requireNonNull($.isSecuredTransportRequired, "expected parameter 'isSecuredTransportRequired' to be non-null");
            $.nonRepudiationOfOriginAndContent = Objects.requireNonNull($.nonRepudiationOfOriginAndContent, "expected parameter 'nonRepudiationOfOriginAndContent' to be non-null");
            $.persistentConfidentialityScope = Objects.requireNonNull($.persistentConfidentialityScope, "expected parameter 'persistentConfidentialityScope' to be non-null");
            $.responseType = Objects.requireNonNull($.responseType, "expected parameter 'responseType' to be non-null");
            $.retryCount = Objects.requireNonNull($.retryCount, "expected parameter 'retryCount' to be non-null");
            $.timeToPerformInSeconds = Objects.requireNonNull($.timeToPerformInSeconds, "expected parameter 'timeToPerformInSeconds' to be non-null");
            return $;
        }
    }

}
