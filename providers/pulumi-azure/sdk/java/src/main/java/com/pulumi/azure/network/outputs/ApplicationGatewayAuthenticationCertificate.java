// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationGatewayAuthenticationCertificate {
    /**
     * @return The contents of the Authentication Certificate which should be used.
     * 
     */
    private final String data;
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the Authentication Certificate.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ApplicationGatewayAuthenticationCertificate(
        @CustomType.Parameter("data") String data,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") String name) {
        this.data = data;
        this.id = id;
        this.name = name;
    }

    /**
     * @return The contents of the Authentication Certificate which should be used.
     * 
     */
    public String data() {
        return this.data;
    }
    /**
     * @return The ID of the Rewrite Rule Set
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the Authentication Certificate.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayAuthenticationCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String data;
        private @Nullable String id;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayAuthenticationCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ApplicationGatewayAuthenticationCertificate build() {
            return new ApplicationGatewayAuthenticationCertificate(data, id, name);
        }
    }
}
