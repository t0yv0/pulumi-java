// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.ContentLinkArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration service environment managed api deployment parameters.
 * 
 */
public final class IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs Empty = new IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs();

    /**
     * The integration service environment managed api content link for deployment.
     * 
     */
    @Import(name="contentLinkDefinition")
    private @Nullable Output<ContentLinkArgs> contentLinkDefinition;

    /**
     * @return The integration service environment managed api content link for deployment.
     * 
     */
    public Optional<Output<ContentLinkArgs>> contentLinkDefinition() {
        return Optional.ofNullable(this.contentLinkDefinition);
    }

    private IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs() {}

    private IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs(IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs $) {
        this.contentLinkDefinition = $.contentLinkDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs $;

        public Builder() {
            $ = new IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs();
        }

        public Builder(IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs defaults) {
            $ = new IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contentLinkDefinition The integration service environment managed api content link for deployment.
         * 
         * @return builder
         * 
         */
        public Builder contentLinkDefinition(@Nullable Output<ContentLinkArgs> contentLinkDefinition) {
            $.contentLinkDefinition = contentLinkDefinition;
            return this;
        }

        /**
         * @param contentLinkDefinition The integration service environment managed api content link for deployment.
         * 
         * @return builder
         * 
         */
        public Builder contentLinkDefinition(ContentLinkArgs contentLinkDefinition) {
            return contentLinkDefinition(Output.of(contentLinkDefinition));
        }

        public IntegrationServiceEnvironmentManagedApiDeploymentParametersArgs build() {
            return $;
        }
    }

}
