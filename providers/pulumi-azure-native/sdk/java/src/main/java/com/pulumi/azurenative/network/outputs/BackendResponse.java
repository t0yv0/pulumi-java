// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendResponse {
    /**
     * @return Location of the backend (IP address or FQDN)
     * 
     */
    private final @Nullable String address;
    /**
     * @return The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    private final @Nullable String backendHostHeader;
    /**
     * @return Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    private final @Nullable String enabledState;
    /**
     * @return The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    private final @Nullable Integer httpPort;
    /**
     * @return The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    private final @Nullable Integer httpsPort;
    /**
     * @return Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The Approval status for the connection to the Private Link
     * 
     */
    private final String privateEndpointStatus;
    /**
     * @return The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    private final @Nullable String privateLinkAlias;
    /**
     * @return A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    private final @Nullable String privateLinkApprovalMessage;
    /**
     * @return The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    private final @Nullable String privateLinkLocation;
    /**
     * @return The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    private final @Nullable String privateLinkResourceId;
    /**
     * @return Weight of this endpoint for load balancing purposes.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private BackendResponse(
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("backendHostHeader") @Nullable String backendHostHeader,
        @CustomType.Parameter("enabledState") @Nullable String enabledState,
        @CustomType.Parameter("httpPort") @Nullable Integer httpPort,
        @CustomType.Parameter("httpsPort") @Nullable Integer httpsPort,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("privateEndpointStatus") String privateEndpointStatus,
        @CustomType.Parameter("privateLinkAlias") @Nullable String privateLinkAlias,
        @CustomType.Parameter("privateLinkApprovalMessage") @Nullable String privateLinkApprovalMessage,
        @CustomType.Parameter("privateLinkLocation") @Nullable String privateLinkLocation,
        @CustomType.Parameter("privateLinkResourceId") @Nullable String privateLinkResourceId,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.address = address;
        this.backendHostHeader = backendHostHeader;
        this.enabledState = enabledState;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.priority = priority;
        this.privateEndpointStatus = privateEndpointStatus;
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.weight = weight;
    }

    /**
     * @return Location of the backend (IP address or FQDN)
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The value to use as the host header sent to the backend. If blank or unspecified, this defaults to the incoming host.
     * 
     */
    public Optional<String> backendHostHeader() {
        return Optional.ofNullable(this.backendHostHeader);
    }
    /**
     * @return Whether to enable use of this backend. Permitted values are &#39;Enabled&#39; or &#39;Disabled&#39;
     * 
     */
    public Optional<String> enabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * @return The HTTP TCP port number. Must be between 1 and 65535.
     * 
     */
    public Optional<Integer> httpPort() {
        return Optional.ofNullable(this.httpPort);
    }
    /**
     * @return The HTTPS TCP port number. Must be between 1 and 65535.
     * 
     */
    public Optional<Integer> httpsPort() {
        return Optional.ofNullable(this.httpsPort);
    }
    /**
     * @return Priority to use for load balancing. Higher priorities will not be used for load balancing if any lower priority backend is healthy.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The Approval status for the connection to the Private Link
     * 
     */
    public String privateEndpointStatus() {
        return this.privateEndpointStatus;
    }
    /**
     * @return The Alias of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    public Optional<String> privateLinkAlias() {
        return Optional.ofNullable(this.privateLinkAlias);
    }
    /**
     * @return A custom message to be included in the approval request to connect to the Private Link
     * 
     */
    public Optional<String> privateLinkApprovalMessage() {
        return Optional.ofNullable(this.privateLinkApprovalMessage);
    }
    /**
     * @return The location of the Private Link resource. Required only if &#39;privateLinkResourceId&#39; is populated
     * 
     */
    public Optional<String> privateLinkLocation() {
        return Optional.ofNullable(this.privateLinkLocation);
    }
    /**
     * @return The Resource Id of the Private Link resource. Populating this optional field indicates that this backend is &#39;Private&#39;
     * 
     */
    public Optional<String> privateLinkResourceId() {
        return Optional.ofNullable(this.privateLinkResourceId);
    }
    /**
     * @return Weight of this endpoint for load balancing purposes.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String backendHostHeader;
        private @Nullable String enabledState;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable Integer priority;
        private String privateEndpointStatus;
        private @Nullable String privateLinkAlias;
        private @Nullable String privateLinkApprovalMessage;
        private @Nullable String privateLinkLocation;
        private @Nullable String privateLinkResourceId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.backendHostHeader = defaults.backendHostHeader;
    	      this.enabledState = defaults.enabledState;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.priority = defaults.priority;
    	      this.privateEndpointStatus = defaults.privateEndpointStatus;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.weight = defaults.weight;
        }

        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder backendHostHeader(@Nullable String backendHostHeader) {
            this.backendHostHeader = backendHostHeader;
            return this;
        }
        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }
        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder privateEndpointStatus(String privateEndpointStatus) {
            this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus);
            return this;
        }
        public Builder privateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }
        public Builder privateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }
        public Builder privateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }
        public Builder privateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public BackendResponse build() {
            return new BackendResponse(address, backendHostHeader, enabledState, httpPort, httpsPort, priority, privateEndpointStatus, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, weight);
        }
    }
}
