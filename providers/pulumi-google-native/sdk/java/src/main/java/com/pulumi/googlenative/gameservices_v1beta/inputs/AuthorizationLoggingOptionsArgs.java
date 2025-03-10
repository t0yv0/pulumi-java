// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1beta.enums.AuthorizationLoggingOptionsPermissionType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authorization-related information used by Cloud Audit Logging.
 * 
 */
public final class AuthorizationLoggingOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizationLoggingOptionsArgs Empty = new AuthorizationLoggingOptionsArgs();

    /**
     * The type of the permission that was checked.
     * 
     */
    @Import(name="permissionType")
    private @Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType;

    /**
     * @return The type of the permission that was checked.
     * 
     */
    public Optional<Output<AuthorizationLoggingOptionsPermissionType>> permissionType() {
        return Optional.ofNullable(this.permissionType);
    }

    private AuthorizationLoggingOptionsArgs() {}

    private AuthorizationLoggingOptionsArgs(AuthorizationLoggingOptionsArgs $) {
        this.permissionType = $.permissionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizationLoggingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizationLoggingOptionsArgs $;

        public Builder() {
            $ = new AuthorizationLoggingOptionsArgs();
        }

        public Builder(AuthorizationLoggingOptionsArgs defaults) {
            $ = new AuthorizationLoggingOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissionType The type of the permission that was checked.
         * 
         * @return builder
         * 
         */
        public Builder permissionType(@Nullable Output<AuthorizationLoggingOptionsPermissionType> permissionType) {
            $.permissionType = permissionType;
            return this;
        }

        /**
         * @param permissionType The type of the permission that was checked.
         * 
         * @return builder
         * 
         */
        public Builder permissionType(AuthorizationLoggingOptionsPermissionType permissionType) {
            return permissionType(Output.of(permissionType));
        }

        public AuthorizationLoggingOptionsArgs build() {
            return $;
        }
    }

}
