// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gameservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGameServerDeploymentRolloutArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGameServerDeploymentRolloutArgs Empty = new GetGameServerDeploymentRolloutArgs();

    /**
     * The deployment to get the rollout state from. Only 1 rollout must be associated with each deployment.
     * 
     */
    @Import(name="deploymentId", required=true)
    private String deploymentId;

    /**
     * @return The deployment to get the rollout state from. Only 1 rollout must be associated with each deployment.
     * 
     */
    public String deploymentId() {
        return this.deploymentId;
    }

    private GetGameServerDeploymentRolloutArgs() {}

    private GetGameServerDeploymentRolloutArgs(GetGameServerDeploymentRolloutArgs $) {
        this.deploymentId = $.deploymentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGameServerDeploymentRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGameServerDeploymentRolloutArgs $;

        public Builder() {
            $ = new GetGameServerDeploymentRolloutArgs();
        }

        public Builder(GetGameServerDeploymentRolloutArgs defaults) {
            $ = new GetGameServerDeploymentRolloutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentId The deployment to get the rollout state from. Only 1 rollout must be associated with each deployment.
         * 
         * @return builder
         * 
         */
        public Builder deploymentId(String deploymentId) {
            $.deploymentId = deploymentId;
            return this;
        }

        public GetGameServerDeploymentRolloutArgs build() {
            $.deploymentId = Objects.requireNonNull($.deploymentId, "expected parameter 'deploymentId' to be non-null");
            return $;
        }
    }

}
