// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ChannelLineLineChannel {
    /**
     * @return The access token which is used to call the Line Channel API.
     * 
     */
    private final String accessToken;
    /**
     * @return The secret which is used to access the Line Channel.
     * 
     */
    private final String secret;

    @CustomType.Constructor
    private ChannelLineLineChannel(
        @CustomType.Parameter("accessToken") String accessToken,
        @CustomType.Parameter("secret") String secret) {
        this.accessToken = accessToken;
        this.secret = secret;
    }

    /**
     * @return The access token which is used to call the Line Channel API.
     * 
     */
    public String accessToken() {
        return this.accessToken;
    }
    /**
     * @return The secret which is used to access the Line Channel.
     * 
     */
    public String secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelLineLineChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessToken;
        private String secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelLineLineChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.secret = defaults.secret;
        }

        public Builder accessToken(String accessToken) {
            this.accessToken = Objects.requireNonNull(accessToken);
            return this;
        }
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }        public ChannelLineLineChannel build() {
            return new ChannelLineLineChannel(accessToken, secret);
        }
    }
}
