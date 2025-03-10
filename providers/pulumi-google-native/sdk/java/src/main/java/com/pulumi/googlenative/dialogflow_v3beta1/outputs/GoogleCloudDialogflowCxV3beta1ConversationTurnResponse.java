// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1ConversationTurnResponse {
    /**
     * @return The user input.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput;
    /**
     * @return The virtual agent output.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1ConversationTurnResponse(
        @CustomType.Parameter("userInput") GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput,
        @CustomType.Parameter("virtualAgentOutput") GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
        this.userInput = userInput;
        this.virtualAgentOutput = virtualAgentOutput;
    }

    /**
     * @return The user input.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput() {
        return this.userInput;
    }
    /**
     * @return The virtual agent output.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput() {
        return this.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput;
        private GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userInput = defaults.userInput;
    	      this.virtualAgentOutput = defaults.virtualAgentOutput;
        }

        public Builder userInput(GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput) {
            this.userInput = Objects.requireNonNull(userInput);
            return this;
        }
        public Builder virtualAgentOutput(GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
            this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1ConversationTurnResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ConversationTurnResponse(userInput, virtualAgentOutput);
        }
    }
}
