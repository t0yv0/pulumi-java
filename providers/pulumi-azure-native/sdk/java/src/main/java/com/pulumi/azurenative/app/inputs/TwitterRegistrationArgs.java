// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the app registration for the Twitter provider.
 * 
 */
public final class TwitterRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final TwitterRegistrationArgs Empty = new TwitterRegistrationArgs();

    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    @Import(name="consumerKey")
    private @Nullable Output<String> consumerKey;

    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * This setting is required for enabling Twitter Sign-In.
     * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
     * 
     */
    public Optional<Output<String>> consumerKey() {
        return Optional.ofNullable(this.consumerKey);
    }

    /**
     * The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    @Import(name="consumerSecretSettingName")
    private @Nullable Output<String> consumerSecretSettingName;

    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
     * application used for sign-in.
     * 
     */
    public Optional<Output<String>> consumerSecretSettingName() {
        return Optional.ofNullable(this.consumerSecretSettingName);
    }

    private TwitterRegistrationArgs() {}

    private TwitterRegistrationArgs(TwitterRegistrationArgs $) {
        this.consumerKey = $.consumerKey;
        this.consumerSecretSettingName = $.consumerSecretSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TwitterRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TwitterRegistrationArgs $;

        public Builder() {
            $ = new TwitterRegistrationArgs();
        }

        public Builder(TwitterRegistrationArgs defaults) {
            $ = new TwitterRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumerKey The OAuth 1.0a consumer key of the Twitter application used for sign-in.
         * This setting is required for enabling Twitter Sign-In.
         * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
         * 
         * @return builder
         * 
         */
        public Builder consumerKey(@Nullable Output<String> consumerKey) {
            $.consumerKey = consumerKey;
            return this;
        }

        /**
         * @param consumerKey The OAuth 1.0a consumer key of the Twitter application used for sign-in.
         * This setting is required for enabling Twitter Sign-In.
         * Twitter Sign-In documentation: https://dev.twitter.com/web/sign-in
         * 
         * @return builder
         * 
         */
        public Builder consumerKey(String consumerKey) {
            return consumerKey(Output.of(consumerKey));
        }

        /**
         * @param consumerSecretSettingName The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
         * application used for sign-in.
         * 
         * @return builder
         * 
         */
        public Builder consumerSecretSettingName(@Nullable Output<String> consumerSecretSettingName) {
            $.consumerSecretSettingName = consumerSecretSettingName;
            return this;
        }

        /**
         * @param consumerSecretSettingName The app setting name that contains the OAuth 1.0a consumer secret of the Twitter
         * application used for sign-in.
         * 
         * @return builder
         * 
         */
        public Builder consumerSecretSettingName(String consumerSecretSettingName) {
            return consumerSecretSettingName(Output.of(consumerSecretSettingName));
        }

        public TwitterRegistrationArgs build() {
            return $;
        }
    }

}
