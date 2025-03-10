// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The vault id is an Azure Resource Manager Resource id in the form /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.KeyVault/vaults/{vaultName}
 * 
 */
public final class SourceVaultArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceVaultArgs Empty = new SourceVaultArgs();

    /**
     * Resource Id
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource Id
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private SourceVaultArgs() {}

    private SourceVaultArgs(SourceVaultArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceVaultArgs $;

        public Builder() {
            $ = new SourceVaultArgs();
        }

        public Builder(SourceVaultArgs defaults) {
            $ = new SourceVaultArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource Id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public SourceVaultArgs build() {
            return $;
        }
    }

}
