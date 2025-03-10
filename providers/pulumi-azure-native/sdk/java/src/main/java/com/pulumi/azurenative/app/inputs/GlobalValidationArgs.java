// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.azurenative.app.enums.UnauthenticatedClientActionV2;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings that determines the validation flow of users using ContainerApp Service Authentication/Authorization.
 * 
 */
public final class GlobalValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalValidationArgs Empty = new GlobalValidationArgs();

    /**
     * The paths for which unauthenticated flow would not be redirected to the login page.
     * 
     */
    @Import(name="excludedPaths")
    private @Nullable Output<List<String>> excludedPaths;

    /**
     * @return The paths for which unauthenticated flow would not be redirected to the login page.
     * 
     */
    public Optional<Output<List<String>>> excludedPaths() {
        return Optional.ofNullable(this.excludedPaths);
    }

    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    @Import(name="redirectToProvider")
    private @Nullable Output<String> redirectToProvider;

    /**
     * @return The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    public Optional<Output<String>> redirectToProvider() {
        return Optional.ofNullable(this.redirectToProvider);
    }

    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    @Import(name="unauthenticatedClientAction")
    private @Nullable Output<UnauthenticatedClientActionV2> unauthenticatedClientAction;

    /**
     * @return The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    public Optional<Output<UnauthenticatedClientActionV2>> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    private GlobalValidationArgs() {}

    private GlobalValidationArgs(GlobalValidationArgs $) {
        this.excludedPaths = $.excludedPaths;
        this.redirectToProvider = $.redirectToProvider;
        this.unauthenticatedClientAction = $.unauthenticatedClientAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalValidationArgs $;

        public Builder() {
            $ = new GlobalValidationArgs();
        }

        public Builder(GlobalValidationArgs defaults) {
            $ = new GlobalValidationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludedPaths The paths for which unauthenticated flow would not be redirected to the login page.
         * 
         * @return builder
         * 
         */
        public Builder excludedPaths(@Nullable Output<List<String>> excludedPaths) {
            $.excludedPaths = excludedPaths;
            return this;
        }

        /**
         * @param excludedPaths The paths for which unauthenticated flow would not be redirected to the login page.
         * 
         * @return builder
         * 
         */
        public Builder excludedPaths(List<String> excludedPaths) {
            return excludedPaths(Output.of(excludedPaths));
        }

        /**
         * @param excludedPaths The paths for which unauthenticated flow would not be redirected to the login page.
         * 
         * @return builder
         * 
         */
        public Builder excludedPaths(String... excludedPaths) {
            return excludedPaths(List.of(excludedPaths));
        }

        /**
         * @param redirectToProvider The default authentication provider to use when multiple providers are configured.
         * This setting is only needed if multiple providers are configured and the unauthenticated client
         * action is set to &#34;RedirectToLoginPage&#34;.
         * 
         * @return builder
         * 
         */
        public Builder redirectToProvider(@Nullable Output<String> redirectToProvider) {
            $.redirectToProvider = redirectToProvider;
            return this;
        }

        /**
         * @param redirectToProvider The default authentication provider to use when multiple providers are configured.
         * This setting is only needed if multiple providers are configured and the unauthenticated client
         * action is set to &#34;RedirectToLoginPage&#34;.
         * 
         * @return builder
         * 
         */
        public Builder redirectToProvider(String redirectToProvider) {
            return redirectToProvider(Output.of(redirectToProvider));
        }

        /**
         * @param unauthenticatedClientAction The action to take when an unauthenticated client attempts to access the app.
         * 
         * @return builder
         * 
         */
        public Builder unauthenticatedClientAction(@Nullable Output<UnauthenticatedClientActionV2> unauthenticatedClientAction) {
            $.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }

        /**
         * @param unauthenticatedClientAction The action to take when an unauthenticated client attempts to access the app.
         * 
         * @return builder
         * 
         */
        public Builder unauthenticatedClientAction(UnauthenticatedClientActionV2 unauthenticatedClientAction) {
            return unauthenticatedClientAction(Output.of(unauthenticatedClientAction));
        }

        public GlobalValidationArgs build() {
            return $;
        }
    }

}
