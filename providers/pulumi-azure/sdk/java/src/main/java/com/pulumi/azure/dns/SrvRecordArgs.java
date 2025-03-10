// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dns;

import com.pulumi.azure.dns.inputs.SrvRecordRecordArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SrvRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final SrvRecordArgs Empty = new SrvRecordArgs();

    /**
     * The name of the DNS SRV Record.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the DNS SRV Record.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * 
     */
    @Import(name="records", required=true)
    private Output<List<SrvRecordRecordArgs>> records;

    /**
     * @return A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * 
     */
    public Output<List<SrvRecordRecordArgs>> records() {
        return this.records;
    }

    /**
     * Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    @Import(name="ttl", required=true)
    private Output<Integer> ttl;

    /**
     * @return The Time To Live (TTL) of the DNS record in seconds.
     * 
     */
    public Output<Integer> ttl() {
        return this.ttl;
    }

    /**
     * Specifies the DNS Zone where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="zoneName", required=true)
    private Output<String> zoneName;

    /**
     * @return Specifies the DNS Zone where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> zoneName() {
        return this.zoneName;
    }

    private SrvRecordArgs() {}

    private SrvRecordArgs(SrvRecordArgs $) {
        this.name = $.name;
        this.records = $.records;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.ttl = $.ttl;
        this.zoneName = $.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SrvRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SrvRecordArgs $;

        public Builder() {
            $ = new SrvRecordArgs();
        }

        public Builder(SrvRecordArgs defaults) {
            $ = new SrvRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the DNS SRV Record.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the DNS SRV Record.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder records(Output<List<SrvRecordRecordArgs>> records) {
            $.records = records;
            return this;
        }

        /**
         * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder records(List<SrvRecordRecordArgs> records) {
            return records(Output.of(records));
        }

        /**
         * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder records(SrvRecordRecordArgs... records) {
            return records(List.of(records));
        }

        /**
         * @param resourceGroupName Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the resource group where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param ttl The Time To Live (TTL) of the DNS record in seconds.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The Time To Live (TTL) of the DNS record in seconds.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param zoneName Specifies the DNS Zone where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(Output<String> zoneName) {
            $.zoneName = zoneName;
            return this;
        }

        /**
         * @param zoneName Specifies the DNS Zone where the DNS Zone (parent resource) exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder zoneName(String zoneName) {
            return zoneName(Output.of(zoneName));
        }

        public SrvRecordArgs build() {
            $.records = Objects.requireNonNull($.records, "expected parameter 'records' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            $.zoneName = Objects.requireNonNull($.zoneName, "expected parameter 'zoneName' to be non-null");
            return $;
        }
    }

}
