// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a Google account.
 * 
 */
public final class GoogleAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleAccountArgs Empty = new GoogleAccountArgs();

    /**
     * Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * The user name of the Google account.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The user name of the Google account.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private GoogleAccountArgs() {}

    private GoogleAccountArgs(GoogleAccountArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleAccountArgs $;

        public Builder() {
            $ = new GoogleAccountArgs();
        }

        public Builder(GoogleAccountArgs defaults) {
            $ = new GoogleAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Input only. The password of the Google account. The credential is stored encrypted and not returned in any response nor included in audit logs.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The user name of the Google account.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The user name of the Google account.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GoogleAccountArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
