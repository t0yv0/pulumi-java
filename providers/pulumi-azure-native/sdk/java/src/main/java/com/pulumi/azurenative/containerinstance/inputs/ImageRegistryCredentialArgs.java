// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Image registry credential.
 * 
 */
public final class ImageRegistryCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageRegistryCredentialArgs Empty = new ImageRegistryCredentialArgs();

    /**
     * The password for the private registry.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the private registry.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The Docker image registry server without a protocol such as &#34;http&#34; and &#34;https&#34;.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return The Docker image registry server without a protocol such as &#34;http&#34; and &#34;https&#34;.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    /**
     * The username for the private registry.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The username for the private registry.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private ImageRegistryCredentialArgs() {}

    private ImageRegistryCredentialArgs(ImageRegistryCredentialArgs $) {
        this.password = $.password;
        this.server = $.server;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageRegistryCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageRegistryCredentialArgs $;

        public Builder() {
            $ = new ImageRegistryCredentialArgs();
        }

        public Builder(ImageRegistryCredentialArgs defaults) {
            $ = new ImageRegistryCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password for the private registry.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the private registry.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param server The Docker image registry server without a protocol such as &#34;http&#34; and &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server The Docker image registry server without a protocol such as &#34;http&#34; and &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        /**
         * @param username The username for the private registry.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username for the private registry.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ImageRegistryCredentialArgs build() {
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
