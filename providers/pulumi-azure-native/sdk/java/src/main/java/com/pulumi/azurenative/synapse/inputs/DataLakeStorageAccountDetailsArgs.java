// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the data lake storage account associated with the workspace
 * 
 */
public final class DataLakeStorageAccountDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataLakeStorageAccountDetailsArgs Empty = new DataLakeStorageAccountDetailsArgs();

    /**
     * Account URL
     * 
     */
    @Import(name="accountUrl")
    private @Nullable Output<String> accountUrl;

    /**
     * @return Account URL
     * 
     */
    public Optional<Output<String>> accountUrl() {
        return Optional.ofNullable(this.accountUrl);
    }

    /**
     * Filesystem name
     * 
     */
    @Import(name="filesystem")
    private @Nullable Output<String> filesystem;

    /**
     * @return Filesystem name
     * 
     */
    public Optional<Output<String>> filesystem() {
        return Optional.ofNullable(this.filesystem);
    }

    private DataLakeStorageAccountDetailsArgs() {}

    private DataLakeStorageAccountDetailsArgs(DataLakeStorageAccountDetailsArgs $) {
        this.accountUrl = $.accountUrl;
        this.filesystem = $.filesystem;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataLakeStorageAccountDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataLakeStorageAccountDetailsArgs $;

        public Builder() {
            $ = new DataLakeStorageAccountDetailsArgs();
        }

        public Builder(DataLakeStorageAccountDetailsArgs defaults) {
            $ = new DataLakeStorageAccountDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountUrl Account URL
         * 
         * @return builder
         * 
         */
        public Builder accountUrl(@Nullable Output<String> accountUrl) {
            $.accountUrl = accountUrl;
            return this;
        }

        /**
         * @param accountUrl Account URL
         * 
         * @return builder
         * 
         */
        public Builder accountUrl(String accountUrl) {
            return accountUrl(Output.of(accountUrl));
        }

        /**
         * @param filesystem Filesystem name
         * 
         * @return builder
         * 
         */
        public Builder filesystem(@Nullable Output<String> filesystem) {
            $.filesystem = filesystem;
            return this;
        }

        /**
         * @param filesystem Filesystem name
         * 
         * @return builder
         * 
         */
        public Builder filesystem(String filesystem) {
            return filesystem(Output.of(filesystem));
        }

        public DataLakeStorageAccountDetailsArgs build() {
            return $;
        }
    }

}
