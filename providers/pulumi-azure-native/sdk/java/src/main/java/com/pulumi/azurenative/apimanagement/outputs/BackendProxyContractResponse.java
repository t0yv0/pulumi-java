// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendProxyContractResponse {
    /**
     * @return Password to connect to the WebProxy Server
     * 
     */
    private final @Nullable String password;
    /**
     * @return WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     * 
     */
    private final String url;
    /**
     * @return Username to connect to the WebProxy server
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private BackendProxyContractResponse(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.url = url;
        this.username = username;
    }

    /**
     * @return Password to connect to the WebProxy Server
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Username to connect to the WebProxy server
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendProxyContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendProxyContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public BackendProxyContractResponse build() {
            return new BackendProxyContractResponse(password, url, username);
        }
    }
}
