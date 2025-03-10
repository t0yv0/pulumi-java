// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InfrastructureConfigurationInstanceMetadataOptions {
    /**
     * @return The number of hops that an instance can traverse to reach its destonation.
     * 
     */
    private final @Nullable Integer httpPutResponseHopLimit;
    /**
     * @return Whether a signed token is required for instance metadata retrieval requests. Valid values: `required`, `optional`.
     * 
     */
    private final @Nullable String httpTokens;

    @CustomType.Constructor
    private InfrastructureConfigurationInstanceMetadataOptions(
        @CustomType.Parameter("httpPutResponseHopLimit") @Nullable Integer httpPutResponseHopLimit,
        @CustomType.Parameter("httpTokens") @Nullable String httpTokens) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
    }

    /**
     * @return The number of hops that an instance can traverse to reach its destonation.
     * 
     */
    public Optional<Integer> httpPutResponseHopLimit() {
        return Optional.ofNullable(this.httpPutResponseHopLimit);
    }
    /**
     * @return Whether a signed token is required for instance metadata retrieval requests. Valid values: `required`, `optional`.
     * 
     */
    public Optional<String> httpTokens() {
        return Optional.ofNullable(this.httpTokens);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationInstanceMetadataOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer httpPutResponseHopLimit;
        private @Nullable String httpTokens;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationInstanceMetadataOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        public Builder httpPutResponseHopLimit(@Nullable Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = httpPutResponseHopLimit;
            return this;
        }
        public Builder httpTokens(@Nullable String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }        public InfrastructureConfigurationInstanceMetadataOptions build() {
            return new InfrastructureConfigurationInstanceMetadataOptions(httpPutResponseHopLimit, httpTokens);
        }
    }
}
