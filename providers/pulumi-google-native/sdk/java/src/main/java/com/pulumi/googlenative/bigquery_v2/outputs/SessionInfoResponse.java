// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SessionInfoResponse {
    /**
     * @return // [Preview] Id of the session.
     * 
     */
    private final String sessionId;

    @CustomType.Constructor
    private SessionInfoResponse(@CustomType.Parameter("sessionId") String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * @return // [Preview] Id of the session.
     * 
     */
    public String sessionId() {
        return this.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sessionId;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sessionId = defaults.sessionId;
        }

        public Builder sessionId(String sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }        public SessionInfoResponse build() {
            return new SessionInfoResponse(sessionId);
        }
    }
}
