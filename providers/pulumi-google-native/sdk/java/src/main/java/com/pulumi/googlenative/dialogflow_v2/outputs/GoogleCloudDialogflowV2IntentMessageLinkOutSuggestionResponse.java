// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse {
    /**
     * @return The name of the app or site this chip is linking to.
     * 
     */
    private final String destinationName;
    /**
     * @return The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse(
        @CustomType.Parameter("destinationName") String destinationName,
        @CustomType.Parameter("uri") String uri) {
        this.destinationName = destinationName;
        this.uri = uri;
    }

    /**
     * @return The name of the app or site this chip is linking to.
     * 
     */
    public String destinationName() {
        return this.destinationName;
    }
    /**
     * @return The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationName;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationName = defaults.destinationName;
    	      this.uri = defaults.uri;
        }

        public Builder destinationName(String destinationName) {
            this.destinationName = Objects.requireNonNull(destinationName);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageLinkOutSuggestionResponse(destinationName, uri);
        }
    }
}
