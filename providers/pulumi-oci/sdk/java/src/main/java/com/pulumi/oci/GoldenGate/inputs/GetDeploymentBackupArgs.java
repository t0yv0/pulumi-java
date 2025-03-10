// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.GoldenGate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDeploymentBackupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDeploymentBackupArgs Empty = new GetDeploymentBackupArgs();

    /**
     * A unique DeploymentBackup identifier.
     * 
     */
    @Import(name="deploymentBackupId", required=true)
    private String deploymentBackupId;

    /**
     * @return A unique DeploymentBackup identifier.
     * 
     */
    public String deploymentBackupId() {
        return this.deploymentBackupId;
    }

    private GetDeploymentBackupArgs() {}

    private GetDeploymentBackupArgs(GetDeploymentBackupArgs $) {
        this.deploymentBackupId = $.deploymentBackupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDeploymentBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDeploymentBackupArgs $;

        public Builder() {
            $ = new GetDeploymentBackupArgs();
        }

        public Builder(GetDeploymentBackupArgs defaults) {
            $ = new GetDeploymentBackupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentBackupId A unique DeploymentBackup identifier.
         * 
         * @return builder
         * 
         */
        public Builder deploymentBackupId(String deploymentBackupId) {
            $.deploymentBackupId = deploymentBackupId;
            return this;
        }

        public GetDeploymentBackupArgs build() {
            $.deploymentBackupId = Objects.requireNonNull($.deploymentBackupId, "expected parameter 'deploymentBackupId' to be non-null");
            return $;
        }
    }

}
