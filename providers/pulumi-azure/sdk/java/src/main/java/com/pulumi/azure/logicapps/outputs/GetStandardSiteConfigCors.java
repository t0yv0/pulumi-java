// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.logicapps.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetStandardSiteConfigCors {
    private final List<String> allowedOrigins;
    private final @Nullable Boolean supportCredentials;

    @CustomType.Constructor
    private GetStandardSiteConfigCors(
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("supportCredentials") @Nullable Boolean supportCredentials) {
        this.allowedOrigins = allowedOrigins;
        this.supportCredentials = supportCredentials;
    }

    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    public Optional<Boolean> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardSiteConfigCors defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOrigins;
        private @Nullable Boolean supportCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStandardSiteConfigCors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder supportCredentials(@Nullable Boolean supportCredentials) {
            this.supportCredentials = supportCredentials;
            return this;
        }        public GetStandardSiteConfigCors build() {
            return new GetStandardSiteConfigCors(allowedOrigins, supportCredentials);
        }
    }
}
