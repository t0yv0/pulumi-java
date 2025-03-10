// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.outputs;

import com.pulumi.awsnative.sagemaker.outputs.UserProfileJupyterServerAppSettings;
import com.pulumi.awsnative.sagemaker.outputs.UserProfileKernelGatewayAppSettings;
import com.pulumi.awsnative.sagemaker.outputs.UserProfileRStudioServerProAppSettings;
import com.pulumi.awsnative.sagemaker.outputs.UserProfileSharingSettings;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileUserSettings {
    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable String executionRole;
    /**
     * @return The Jupyter server&#39;s app settings.
     * 
     */
    private final @Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings;
    /**
     * @return The kernel gateway app settings.
     * 
     */
    private final @Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings;
    private final @Nullable UserProfileRStudioServerProAppSettings rStudioServerProAppSettings;
    /**
     * @return The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * @return The sharing settings.
     * 
     */
    private final @Nullable UserProfileSharingSettings sharingSettings;

    @CustomType.Constructor
    private UserProfileUserSettings(
        @CustomType.Parameter("executionRole") @Nullable String executionRole,
        @CustomType.Parameter("jupyterServerAppSettings") @Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings,
        @CustomType.Parameter("kernelGatewayAppSettings") @Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings,
        @CustomType.Parameter("rStudioServerProAppSettings") @Nullable UserProfileRStudioServerProAppSettings rStudioServerProAppSettings,
        @CustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @CustomType.Parameter("sharingSettings") @Nullable UserProfileSharingSettings sharingSettings) {
        this.executionRole = executionRole;
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.rStudioServerProAppSettings = rStudioServerProAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
    }

    /**
     * @return The user profile Amazon Resource Name (ARN).
     * 
     */
    public Optional<String> executionRole() {
        return Optional.ofNullable(this.executionRole);
    }
    /**
     * @return The Jupyter server&#39;s app settings.
     * 
     */
    public Optional<UserProfileJupyterServerAppSettings> jupyterServerAppSettings() {
        return Optional.ofNullable(this.jupyterServerAppSettings);
    }
    /**
     * @return The kernel gateway app settings.
     * 
     */
    public Optional<UserProfileKernelGatewayAppSettings> kernelGatewayAppSettings() {
        return Optional.ofNullable(this.kernelGatewayAppSettings);
    }
    public Optional<UserProfileRStudioServerProAppSettings> rStudioServerProAppSettings() {
        return Optional.ofNullable(this.rStudioServerProAppSettings);
    }
    /**
     * @return The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The sharing settings.
     * 
     */
    public Optional<UserProfileSharingSettings> sharingSettings() {
        return Optional.ofNullable(this.sharingSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executionRole;
        private @Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings;
        private @Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings;
        private @Nullable UserProfileRStudioServerProAppSettings rStudioServerProAppSettings;
        private @Nullable List<String> securityGroups;
        private @Nullable UserProfileSharingSettings sharingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.rStudioServerProAppSettings = defaults.rStudioServerProAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
        }

        public Builder executionRole(@Nullable String executionRole) {
            this.executionRole = executionRole;
            return this;
        }
        public Builder jupyterServerAppSettings(@Nullable UserProfileJupyterServerAppSettings jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }
        public Builder kernelGatewayAppSettings(@Nullable UserProfileKernelGatewayAppSettings kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }
        public Builder rStudioServerProAppSettings(@Nullable UserProfileRStudioServerProAppSettings rStudioServerProAppSettings) {
            this.rStudioServerProAppSettings = rStudioServerProAppSettings;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sharingSettings(@Nullable UserProfileSharingSettings sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }        public UserProfileUserSettings build() {
            return new UserProfileUserSettings(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, rStudioServerProAppSettings, securityGroups, sharingSettings);
        }
    }
}
