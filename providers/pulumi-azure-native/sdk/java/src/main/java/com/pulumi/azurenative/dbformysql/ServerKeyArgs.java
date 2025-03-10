// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformysql;

import com.pulumi.azurenative.dbformysql.enums.ServerKeyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServerKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServerKeyArgs Empty = new ServerKeyArgs();

    /**
     * The name of the MySQL Server key to be operated on (updated or created).
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    /**
     * @return The name of the MySQL Server key to be operated on (updated or created).
     * 
     */
    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The key type like &#39;AzureKeyVault&#39;.
     * 
     */
    @Import(name="serverKeyType", required=true)
    private Output<Either<String,ServerKeyType>> serverKeyType;

    /**
     * @return The key type like &#39;AzureKeyVault&#39;.
     * 
     */
    public Output<Either<String,ServerKeyType>> serverKeyType() {
        return this.serverKeyType;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    /**
     * @return The name of the server.
     * 
     */
    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The URI of the key.
     * 
     */
    @Import(name="uri")
    private @Nullable Output<String> uri;

    /**
     * @return The URI of the key.
     * 
     */
    public Optional<Output<String>> uri() {
        return Optional.ofNullable(this.uri);
    }

    private ServerKeyArgs() {}

    private ServerKeyArgs(ServerKeyArgs $) {
        this.keyName = $.keyName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverKeyType = $.serverKeyType;
        this.serverName = $.serverName;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServerKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServerKeyArgs $;

        public Builder() {
            $ = new ServerKeyArgs();
        }

        public Builder(ServerKeyArgs defaults) {
            $ = new ServerKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyName The name of the MySQL Server key to be operated on (updated or created).
         * 
         * @return builder
         * 
         */
        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        /**
         * @param keyName The name of the MySQL Server key to be operated on (updated or created).
         * 
         * @return builder
         * 
         */
        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serverKeyType The key type like &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(Output<Either<String,ServerKeyType>> serverKeyType) {
            $.serverKeyType = serverKeyType;
            return this;
        }

        /**
         * @param serverKeyType The key type like &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(Either<String,ServerKeyType> serverKeyType) {
            return serverKeyType(Output.of(serverKeyType));
        }

        /**
         * @param serverKeyType The key type like &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(String serverKeyType) {
            return serverKeyType(Either.ofLeft(serverKeyType));
        }

        /**
         * @param serverKeyType The key type like &#39;AzureKeyVault&#39;.
         * 
         * @return builder
         * 
         */
        public Builder serverKeyType(ServerKeyType serverKeyType) {
            return serverKeyType(Either.ofRight(serverKeyType));
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        /**
         * @param serverName The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        /**
         * @param uri The URI of the key.
         * 
         * @return builder
         * 
         */
        public Builder uri(@Nullable Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The URI of the key.
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public ServerKeyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverKeyType = Objects.requireNonNull($.serverKeyType, "expected parameter 'serverKeyType' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            return $;
        }
    }

}
