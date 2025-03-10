// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.providerhub.outputs;

import com.pulumi.azurenative.providerhub.outputs.NotificationEndpointResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationRegistrationResponseProperties {
    private final @Nullable List<String> includedEvents;
    private final @Nullable String messageScope;
    private final @Nullable List<NotificationEndpointResponse> notificationEndpoints;
    private final @Nullable String notificationMode;
    private final @Nullable String provisioningState;

    @CustomType.Constructor
    private NotificationRegistrationResponseProperties(
        @CustomType.Parameter("includedEvents") @Nullable List<String> includedEvents,
        @CustomType.Parameter("messageScope") @Nullable String messageScope,
        @CustomType.Parameter("notificationEndpoints") @Nullable List<NotificationEndpointResponse> notificationEndpoints,
        @CustomType.Parameter("notificationMode") @Nullable String notificationMode,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState) {
        this.includedEvents = includedEvents;
        this.messageScope = messageScope;
        this.notificationEndpoints = notificationEndpoints;
        this.notificationMode = notificationMode;
        this.provisioningState = provisioningState;
    }

    public List<String> includedEvents() {
        return this.includedEvents == null ? List.of() : this.includedEvents;
    }
    public Optional<String> messageScope() {
        return Optional.ofNullable(this.messageScope);
    }
    public List<NotificationEndpointResponse> notificationEndpoints() {
        return this.notificationEndpoints == null ? List.of() : this.notificationEndpoints;
    }
    public Optional<String> notificationMode() {
        return Optional.ofNullable(this.notificationMode);
    }
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> includedEvents;
        private @Nullable String messageScope;
        private @Nullable List<NotificationEndpointResponse> notificationEndpoints;
        private @Nullable String notificationMode;
        private @Nullable String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRegistrationResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedEvents = defaults.includedEvents;
    	      this.messageScope = defaults.messageScope;
    	      this.notificationEndpoints = defaults.notificationEndpoints;
    	      this.notificationMode = defaults.notificationMode;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder includedEvents(@Nullable List<String> includedEvents) {
            this.includedEvents = includedEvents;
            return this;
        }
        public Builder includedEvents(String... includedEvents) {
            return includedEvents(List.of(includedEvents));
        }
        public Builder messageScope(@Nullable String messageScope) {
            this.messageScope = messageScope;
            return this;
        }
        public Builder notificationEndpoints(@Nullable List<NotificationEndpointResponse> notificationEndpoints) {
            this.notificationEndpoints = notificationEndpoints;
            return this;
        }
        public Builder notificationEndpoints(NotificationEndpointResponse... notificationEndpoints) {
            return notificationEndpoints(List.of(notificationEndpoints));
        }
        public Builder notificationMode(@Nullable String notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }        public NotificationRegistrationResponseProperties build() {
            return new NotificationRegistrationResponseProperties(includedEvents, messageScope, notificationEndpoints, notificationMode, provisioningState);
        }
    }
}
