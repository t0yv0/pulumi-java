// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.azurenative.hanaonazure.inputs.DiskArgs;
import com.pulumi.azurenative.hanaonazure.inputs.SAPSystemIDArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the storage settings for the HANA instance disks.
 * 
 */
public final class StorageProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageProfileArgs Empty = new StorageProfileArgs();

    /**
     * Specifies information related to SAP system IDs for the hana instance.
     * 
     */
    @Import(name="hanaSids")
    private @Nullable Output<List<SAPSystemIDArgs>> hanaSids;

    /**
     * @return Specifies information related to SAP system IDs for the hana instance.
     * 
     */
    public Optional<Output<List<SAPSystemIDArgs>>> hanaSids() {
        return Optional.ofNullable(this.hanaSids);
    }

    /**
     * Specifies information about the operating system disk used by the hana instance.
     * 
     */
    @Import(name="osDisks")
    private @Nullable Output<List<DiskArgs>> osDisks;

    /**
     * @return Specifies information about the operating system disk used by the hana instance.
     * 
     */
    public Optional<Output<List<DiskArgs>>> osDisks() {
        return Optional.ofNullable(this.osDisks);
    }

    private StorageProfileArgs() {}

    private StorageProfileArgs(StorageProfileArgs $) {
        this.hanaSids = $.hanaSids;
        this.osDisks = $.osDisks;
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
         * @param hanaSids Specifies information related to SAP system IDs for the hana instance.
         * 
         * @return builder
         * 
         */
        public Builder hanaSids(@Nullable Output<List<SAPSystemIDArgs>> hanaSids) {
            $.hanaSids = hanaSids;
            return this;
        }

        /**
         * @param hanaSids Specifies information related to SAP system IDs for the hana instance.
         * 
         * @return builder
         * 
         */
        public Builder hanaSids(List<SAPSystemIDArgs> hanaSids) {
            return hanaSids(Output.of(hanaSids));
        }

        /**
         * @param hanaSids Specifies information related to SAP system IDs for the hana instance.
         * 
         * @return builder
         * 
         */
        public Builder hanaSids(SAPSystemIDArgs... hanaSids) {
            return hanaSids(List.of(hanaSids));
        }

        /**
         * @param osDisks Specifies information about the operating system disk used by the hana instance.
         * 
         * @return builder
         * 
         */
        public Builder osDisks(@Nullable Output<List<DiskArgs>> osDisks) {
            $.osDisks = osDisks;
            return this;
        }

        /**
         * @param osDisks Specifies information about the operating system disk used by the hana instance.
         * 
         * @return builder
         * 
         */
        public Builder osDisks(List<DiskArgs> osDisks) {
            return osDisks(Output.of(osDisks));
        }

        /**
         * @param osDisks Specifies information about the operating system disk used by the hana instance.
         * 
         * @return builder
         * 
         */
        public Builder osDisks(DiskArgs... osDisks) {
            return osDisks(List.of(osDisks));
        }

        public StorageProfileArgs build() {
            return $;
        }
    }

}
