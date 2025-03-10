// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.azurenative.eventgrid.outputs.InlineEventPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventTypeInfoResponse {
    /**
     * @return A collection of inline event types for the resource. The inline event type keys are of type string which represents the name of the event.
     * An example of a valid inline event name is &#34;Contoso.OrderCreated&#34;.
     * The inline event type values are of type InlineEventProperties and will contain additional information for every inline event type.
     * 
     */
    private final @Nullable Map<String,InlineEventPropertiesResponse> inlineEventTypes;
    /**
     * @return The kind of event type used.
     * 
     */
    private final @Nullable String kind;

    @CustomType.Constructor
    private EventTypeInfoResponse(
        @CustomType.Parameter("inlineEventTypes") @Nullable Map<String,InlineEventPropertiesResponse> inlineEventTypes,
        @CustomType.Parameter("kind") @Nullable String kind) {
        this.inlineEventTypes = inlineEventTypes;
        this.kind = kind;
    }

    /**
     * @return A collection of inline event types for the resource. The inline event type keys are of type string which represents the name of the event.
     * An example of a valid inline event name is &#34;Contoso.OrderCreated&#34;.
     * The inline event type values are of type InlineEventProperties and will contain additional information for every inline event type.
     * 
     */
    public Map<String,InlineEventPropertiesResponse> inlineEventTypes() {
        return this.inlineEventTypes == null ? Map.of() : this.inlineEventTypes;
    }
    /**
     * @return The kind of event type used.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTypeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,InlineEventPropertiesResponse> inlineEventTypes;
        private @Nullable String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTypeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineEventTypes = defaults.inlineEventTypes;
    	      this.kind = defaults.kind;
        }

        public Builder inlineEventTypes(@Nullable Map<String,InlineEventPropertiesResponse> inlineEventTypes) {
            this.inlineEventTypes = inlineEventTypes;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }        public EventTypeInfoResponse build() {
            return new EventTypeInfoResponse(inlineEventTypes, kind);
        }
    }
}
