// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.azurenative.dataprotection.outputs.StorageSettingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackupVaultResponse {
    /**
     * @return Provisioning state of the BackupVault resource
     * 
     */
    private final String provisioningState;
    /**
     * @return Storage Settings
     * 
     */
    private final List<StorageSettingResponse> storageSettings;

    @CustomType.Constructor
    private BackupVaultResponse(
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("storageSettings") List<StorageSettingResponse> storageSettings) {
        this.provisioningState = provisioningState;
        this.storageSettings = storageSettings;
    }

    /**
     * @return Provisioning state of the BackupVault resource
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Storage Settings
     * 
     */
    public List<StorageSettingResponse> storageSettings() {
        return this.storageSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupVaultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningState;
        private List<StorageSettingResponse> storageSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupVaultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningState = defaults.provisioningState;
    	      this.storageSettings = defaults.storageSettings;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder storageSettings(List<StorageSettingResponse> storageSettings) {
            this.storageSettings = Objects.requireNonNull(storageSettings);
            return this;
        }
        public Builder storageSettings(StorageSettingResponse... storageSettings) {
            return storageSettings(List.of(storageSettings));
        }        public BackupVaultResponse build() {
            return new BackupVaultResponse(provisioningState, storageSettings);
        }
    }
}
