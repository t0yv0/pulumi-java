// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.ManagedClusterPodIdentityArgs;
import com.pulumi.azurenative.containerservice.inputs.ManagedClusterPodIdentityExceptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterPodIdentityProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedClusterPodIdentityProfileArgs Empty = new ManagedClusterPodIdentityProfileArgs();

    /**
     * Customer consent for enabling AAD pod identity addon in cluster using Kubenet network plugin.
     * 
     */
    @Import(name="allowNetworkPluginKubenet")
    private @Nullable Output<Boolean> allowNetworkPluginKubenet;

    /**
     * @return Customer consent for enabling AAD pod identity addon in cluster using Kubenet network plugin.
     * 
     */
    public Optional<Output<Boolean>> allowNetworkPluginKubenet() {
        return Optional.ofNullable(this.allowNetworkPluginKubenet);
    }

    /**
     * Whether the pod identity addon is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the pod identity addon is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * User assigned pod identity settings.
     * 
     */
    @Import(name="userAssignedIdentities")
    private @Nullable Output<List<ManagedClusterPodIdentityArgs>> userAssignedIdentities;

    /**
     * @return User assigned pod identity settings.
     * 
     */
    public Optional<Output<List<ManagedClusterPodIdentityArgs>>> userAssignedIdentities() {
        return Optional.ofNullable(this.userAssignedIdentities);
    }

    /**
     * User assigned pod identity exception settings.
     * 
     */
    @Import(name="userAssignedIdentityExceptions")
    private @Nullable Output<List<ManagedClusterPodIdentityExceptionArgs>> userAssignedIdentityExceptions;

    /**
     * @return User assigned pod identity exception settings.
     * 
     */
    public Optional<Output<List<ManagedClusterPodIdentityExceptionArgs>>> userAssignedIdentityExceptions() {
        return Optional.ofNullable(this.userAssignedIdentityExceptions);
    }

    private ManagedClusterPodIdentityProfileArgs() {}

    private ManagedClusterPodIdentityProfileArgs(ManagedClusterPodIdentityProfileArgs $) {
        this.allowNetworkPluginKubenet = $.allowNetworkPluginKubenet;
        this.enabled = $.enabled;
        this.userAssignedIdentities = $.userAssignedIdentities;
        this.userAssignedIdentityExceptions = $.userAssignedIdentityExceptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterPodIdentityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterPodIdentityProfileArgs $;

        public Builder() {
            $ = new ManagedClusterPodIdentityProfileArgs();
        }

        public Builder(ManagedClusterPodIdentityProfileArgs defaults) {
            $ = new ManagedClusterPodIdentityProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowNetworkPluginKubenet Customer consent for enabling AAD pod identity addon in cluster using Kubenet network plugin.
         * 
         * @return builder
         * 
         */
        public Builder allowNetworkPluginKubenet(@Nullable Output<Boolean> allowNetworkPluginKubenet) {
            $.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
            return this;
        }

        /**
         * @param allowNetworkPluginKubenet Customer consent for enabling AAD pod identity addon in cluster using Kubenet network plugin.
         * 
         * @return builder
         * 
         */
        public Builder allowNetworkPluginKubenet(Boolean allowNetworkPluginKubenet) {
            return allowNetworkPluginKubenet(Output.of(allowNetworkPluginKubenet));
        }

        /**
         * @param enabled Whether the pod identity addon is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the pod identity addon is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param userAssignedIdentities User assigned pod identity settings.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(@Nullable Output<List<ManagedClusterPodIdentityArgs>> userAssignedIdentities) {
            $.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        /**
         * @param userAssignedIdentities User assigned pod identity settings.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(List<ManagedClusterPodIdentityArgs> userAssignedIdentities) {
            return userAssignedIdentities(Output.of(userAssignedIdentities));
        }

        /**
         * @param userAssignedIdentities User assigned pod identity settings.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentities(ManagedClusterPodIdentityArgs... userAssignedIdentities) {
            return userAssignedIdentities(List.of(userAssignedIdentities));
        }

        /**
         * @param userAssignedIdentityExceptions User assigned pod identity exception settings.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityExceptions(@Nullable Output<List<ManagedClusterPodIdentityExceptionArgs>> userAssignedIdentityExceptions) {
            $.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
            return this;
        }

        /**
         * @param userAssignedIdentityExceptions User assigned pod identity exception settings.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityExceptions(List<ManagedClusterPodIdentityExceptionArgs> userAssignedIdentityExceptions) {
            return userAssignedIdentityExceptions(Output.of(userAssignedIdentityExceptions));
        }

        /**
         * @param userAssignedIdentityExceptions User assigned pod identity exception settings.
         * 
         * @return builder
         * 
         */
        public Builder userAssignedIdentityExceptions(ManagedClusterPodIdentityExceptionArgs... userAssignedIdentityExceptions) {
            return userAssignedIdentityExceptions(List.of(userAssignedIdentityExceptions));
        }

        public ManagedClusterPodIdentityProfileArgs build() {
            return $;
        }
    }

}
