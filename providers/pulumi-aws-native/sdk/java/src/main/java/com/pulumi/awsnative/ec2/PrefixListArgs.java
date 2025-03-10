// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.enums.PrefixListAddressFamily;
import com.pulumi.awsnative.ec2.inputs.PrefixListEntryArgs;
import com.pulumi.awsnative.ec2.inputs.PrefixListTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrefixListArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrefixListArgs Empty = new PrefixListArgs();

    /**
     * Ip Version of Prefix List.
     * 
     */
    @Import(name="addressFamily", required=true)
    private Output<PrefixListAddressFamily> addressFamily;

    /**
     * @return Ip Version of Prefix List.
     * 
     */
    public Output<PrefixListAddressFamily> addressFamily() {
        return this.addressFamily;
    }

    /**
     * Entries of Prefix List.
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<PrefixListEntryArgs>> entries;

    /**
     * @return Entries of Prefix List.
     * 
     */
    public Optional<Output<List<PrefixListEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
    }

    /**
     * Max Entries of Prefix List.
     * 
     */
    @Import(name="maxEntries", required=true)
    private Output<Integer> maxEntries;

    /**
     * @return Max Entries of Prefix List.
     * 
     */
    public Output<Integer> maxEntries() {
        return this.maxEntries;
    }

    /**
     * Name of Prefix List.
     * 
     */
    @Import(name="prefixListName")
    private @Nullable Output<String> prefixListName;

    /**
     * @return Name of Prefix List.
     * 
     */
    public Optional<Output<String>> prefixListName() {
        return Optional.ofNullable(this.prefixListName);
    }

    /**
     * Tags for Prefix List
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<PrefixListTagArgs>> tags;

    /**
     * @return Tags for Prefix List
     * 
     */
    public Optional<Output<List<PrefixListTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PrefixListArgs() {}

    private PrefixListArgs(PrefixListArgs $) {
        this.addressFamily = $.addressFamily;
        this.entries = $.entries;
        this.maxEntries = $.maxEntries;
        this.prefixListName = $.prefixListName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrefixListArgs $;

        public Builder() {
            $ = new PrefixListArgs();
        }

        public Builder(PrefixListArgs defaults) {
            $ = new PrefixListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressFamily Ip Version of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(Output<PrefixListAddressFamily> addressFamily) {
            $.addressFamily = addressFamily;
            return this;
        }

        /**
         * @param addressFamily Ip Version of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(PrefixListAddressFamily addressFamily) {
            return addressFamily(Output.of(addressFamily));
        }

        /**
         * @param entries Entries of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<PrefixListEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries Entries of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder entries(List<PrefixListEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries Entries of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder entries(PrefixListEntryArgs... entries) {
            return entries(List.of(entries));
        }

        /**
         * @param maxEntries Max Entries of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder maxEntries(Output<Integer> maxEntries) {
            $.maxEntries = maxEntries;
            return this;
        }

        /**
         * @param maxEntries Max Entries of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder maxEntries(Integer maxEntries) {
            return maxEntries(Output.of(maxEntries));
        }

        /**
         * @param prefixListName Name of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder prefixListName(@Nullable Output<String> prefixListName) {
            $.prefixListName = prefixListName;
            return this;
        }

        /**
         * @param prefixListName Name of Prefix List.
         * 
         * @return builder
         * 
         */
        public Builder prefixListName(String prefixListName) {
            return prefixListName(Output.of(prefixListName));
        }

        /**
         * @param tags Tags for Prefix List
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<PrefixListTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags for Prefix List
         * 
         * @return builder
         * 
         */
        public Builder tags(List<PrefixListTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags for Prefix List
         * 
         * @return builder
         * 
         */
        public Builder tags(PrefixListTagArgs... tags) {
            return tags(List.of(tags));
        }

        public PrefixListArgs build() {
            $.addressFamily = Objects.requireNonNull($.addressFamily, "expected parameter 'addressFamily' to be non-null");
            $.maxEntries = Objects.requireNonNull($.maxEntries, "expected parameter 'maxEntries' to be non-null");
            return $;
        }
    }

}
