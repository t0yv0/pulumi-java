// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinkedResourceResponse {
    /**
     * @return The ARM id of the linked resource.
     * 
     */
    private final @Nullable String id;

    @CustomType.Constructor
    private LinkedResourceResponse(@CustomType.Parameter("id") @Nullable String id) {
        this.id = id;
    }

    /**
     * @return The ARM id of the linked resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }        public LinkedResourceResponse build() {
            return new LinkedResourceResponse(id);
        }
    }
}
