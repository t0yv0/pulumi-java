// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EdifactMessageFilterResponse {
    /**
     * @return The message filter type.
     * 
     */
    private final String messageFilterType;

    @CustomType.Constructor
    private EdifactMessageFilterResponse(@CustomType.Parameter("messageFilterType") String messageFilterType) {
        this.messageFilterType = messageFilterType;
    }

    /**
     * @return The message filter type.
     * 
     */
    public String messageFilterType() {
        return this.messageFilterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageFilterType;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFilterType = defaults.messageFilterType;
        }

        public Builder messageFilterType(String messageFilterType) {
            this.messageFilterType = Objects.requireNonNull(messageFilterType);
            return this;
        }        public EdifactMessageFilterResponse build() {
            return new EdifactMessageFilterResponse(messageFilterType);
        }
    }
}
