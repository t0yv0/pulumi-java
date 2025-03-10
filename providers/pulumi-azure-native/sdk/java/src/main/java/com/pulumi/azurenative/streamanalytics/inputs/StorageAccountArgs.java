// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that are associated with an Azure Storage account
 * 
 */
public final class StorageAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<String> accountKey;

    /**
     * @return The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<String>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    private StorageAccountArgs() {}

    private StorageAccountArgs(StorageAccountArgs $) {
        this.accountKey = $.accountKey;
        this.accountName = $.accountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageAccountArgs $;

        public Builder() {
            $ = new StorageAccountArgs();
        }

        public Builder(StorageAccountArgs defaults) {
            $ = new StorageAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountKey The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKey The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        /**
         * @param accountName The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public StorageAccountArgs build() {
            return $;
        }
    }

}
