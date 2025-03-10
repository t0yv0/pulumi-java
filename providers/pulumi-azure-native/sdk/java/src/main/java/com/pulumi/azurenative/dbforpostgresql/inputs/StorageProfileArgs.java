// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbforpostgresql.inputs;

import com.pulumi.azurenative.dbforpostgresql.enums.GeoRedundantBackup;
import com.pulumi.azurenative.dbforpostgresql.enums.StorageAutogrow;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Storage Profile properties of a server
 * 
 */
public final class StorageProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Backup retention days for the server.
     * 
     */
    @Import(name="backupRetentionDays")
    private @Nullable Output<Integer> backupRetentionDays;

    /**
     * @return Backup retention days for the server.
     * 
     */
    public Optional<Output<Integer>> backupRetentionDays() {
        return Optional.ofNullable(this.backupRetentionDays);
    }

    /**
     * Enable Geo-redundant or not for server backup.
     * 
     */
    @Import(name="geoRedundantBackup")
    private @Nullable Output<Either<String,GeoRedundantBackup>> geoRedundantBackup;

    /**
     * @return Enable Geo-redundant or not for server backup.
     * 
     */
    public Optional<Output<Either<String,GeoRedundantBackup>>> geoRedundantBackup() {
        return Optional.ofNullable(this.geoRedundantBackup);
    }

    /**
     * Enable Storage Auto Grow.
     * 
     */
    @Import(name="storageAutogrow")
    private @Nullable Output<Either<String,StorageAutogrow>> storageAutogrow;

    /**
     * @return Enable Storage Auto Grow.
     * 
     */
    public Optional<Output<Either<String,StorageAutogrow>>> storageAutogrow() {
        return Optional.ofNullable(this.storageAutogrow);
    }

    /**
     * Max storage allowed for a server.
     * 
     */
    @Import(name="storageMB")
    private @Nullable Output<Integer> storageMB;

    /**
     * @return Max storage allowed for a server.
     * 
     */
    public Optional<Output<Integer>> storageMB() {
        return Optional.ofNullable(this.storageMB);
    }

    private StorageProfileArgs() {}

    private StorageProfileArgs(StorageProfileArgs $) {
        this.backupRetentionDays = $.backupRetentionDays;
        this.geoRedundantBackup = $.geoRedundantBackup;
        this.storageAutogrow = $.storageAutogrow;
        this.storageMB = $.storageMB;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageProfileArgs $;

        public Builder() {
            $ = new StorageProfileArgs();
        }

        public Builder(StorageProfileArgs defaults) {
            $ = new StorageProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupRetentionDays Backup retention days for the server.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionDays(@Nullable Output<Integer> backupRetentionDays) {
            $.backupRetentionDays = backupRetentionDays;
            return this;
        }

        /**
         * @param backupRetentionDays Backup retention days for the server.
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionDays(Integer backupRetentionDays) {
            return backupRetentionDays(Output.of(backupRetentionDays));
        }

        /**
         * @param geoRedundantBackup Enable Geo-redundant or not for server backup.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackup(@Nullable Output<Either<String,GeoRedundantBackup>> geoRedundantBackup) {
            $.geoRedundantBackup = geoRedundantBackup;
            return this;
        }

        /**
         * @param geoRedundantBackup Enable Geo-redundant or not for server backup.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackup(Either<String,GeoRedundantBackup> geoRedundantBackup) {
            return geoRedundantBackup(Output.of(geoRedundantBackup));
        }

        /**
         * @param geoRedundantBackup Enable Geo-redundant or not for server backup.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackup(String geoRedundantBackup) {
            return geoRedundantBackup(Either.ofLeft(geoRedundantBackup));
        }

        /**
         * @param geoRedundantBackup Enable Geo-redundant or not for server backup.
         * 
         * @return builder
         * 
         */
        public Builder geoRedundantBackup(GeoRedundantBackup geoRedundantBackup) {
            return geoRedundantBackup(Either.ofRight(geoRedundantBackup));
        }

        /**
         * @param storageAutogrow Enable Storage Auto Grow.
         * 
         * @return builder
         * 
         */
        public Builder storageAutogrow(@Nullable Output<Either<String,StorageAutogrow>> storageAutogrow) {
            $.storageAutogrow = storageAutogrow;
            return this;
        }

        /**
         * @param storageAutogrow Enable Storage Auto Grow.
         * 
         * @return builder
         * 
         */
        public Builder storageAutogrow(Either<String,StorageAutogrow> storageAutogrow) {
            return storageAutogrow(Output.of(storageAutogrow));
        }

        /**
         * @param storageAutogrow Enable Storage Auto Grow.
         * 
         * @return builder
         * 
         */
        public Builder storageAutogrow(String storageAutogrow) {
            return storageAutogrow(Either.ofLeft(storageAutogrow));
        }

        /**
         * @param storageAutogrow Enable Storage Auto Grow.
         * 
         * @return builder
         * 
         */
        public Builder storageAutogrow(StorageAutogrow storageAutogrow) {
            return storageAutogrow(Either.ofRight(storageAutogrow));
        }

        /**
         * @param storageMB Max storage allowed for a server.
         * 
         * @return builder
         * 
         */
        public Builder storageMB(@Nullable Output<Integer> storageMB) {
            $.storageMB = storageMB;
            return this;
        }

        /**
         * @param storageMB Max storage allowed for a server.
         * 
         * @return builder
         * 
         */
        public Builder storageMB(Integer storageMB) {
            return storageMB(Output.of(storageMB));
        }

        public StorageProfileArgs build() {
            return $;
        }
    }

}
