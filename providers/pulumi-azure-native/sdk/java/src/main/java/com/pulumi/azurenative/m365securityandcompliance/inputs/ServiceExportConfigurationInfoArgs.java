// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Export operation configuration information
 * 
 */
public final class ServiceExportConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceExportConfigurationInfoArgs Empty = new ServiceExportConfigurationInfoArgs();

    /**
     * The name of the default export storage account.
     * 
     */
    @Import(name="storageAccountName")
    private @Nullable Output<String> storageAccountName;

    /**
     * @return The name of the default export storage account.
     * 
     */
    public Optional<Output<String>> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    private ServiceExportConfigurationInfoArgs() {}

    private ServiceExportConfigurationInfoArgs(ServiceExportConfigurationInfoArgs $) {
        this.storageAccountName = $.storageAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceExportConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceExportConfigurationInfoArgs $;

        public Builder() {
            $ = new ServiceExportConfigurationInfoArgs();
        }

        public Builder(ServiceExportConfigurationInfoArgs defaults) {
            $ = new ServiceExportConfigurationInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param storageAccountName The name of the default export storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(@Nullable Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName The name of the default export storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        public ServiceExportConfigurationInfoArgs build() {
            return $;
        }
    }

}
