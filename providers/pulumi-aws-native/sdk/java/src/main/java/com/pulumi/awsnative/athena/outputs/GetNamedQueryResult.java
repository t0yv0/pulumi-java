// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamedQueryResult {
    /**
     * @return The unique ID of the query.
     * 
     */
    private final @Nullable String namedQueryId;

    @CustomType.Constructor
    private GetNamedQueryResult(@CustomType.Parameter("namedQueryId") @Nullable String namedQueryId) {
        this.namedQueryId = namedQueryId;
    }

    /**
     * @return The unique ID of the query.
     * 
     */
    public Optional<String> namedQueryId() {
        return Optional.ofNullable(this.namedQueryId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamedQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String namedQueryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamedQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedQueryId = defaults.namedQueryId;
        }

        public Builder namedQueryId(@Nullable String namedQueryId) {
            this.namedQueryId = namedQueryId;
            return this;
        }        public GetNamedQueryResult build() {
            return new GetNamedQueryResult(namedQueryId);
        }
    }
}
