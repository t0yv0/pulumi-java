// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CapabilityResponse {
    /**
     * @return Name of the Cosmos DB capability. For example, &#34;name&#34;: &#34;EnableCassandra&#34;. Current values also include &#34;EnableTable&#34; and &#34;EnableGremlin&#34;.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private CapabilityResponse(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * @return Name of the Cosmos DB capability. For example, &#34;name&#34;: &#34;EnableCassandra&#34;. Current values also include &#34;EnableTable&#34; and &#34;EnableGremlin&#34;.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CapabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public CapabilityResponse build() {
            return new CapabilityResponse(name);
        }
    }
}
