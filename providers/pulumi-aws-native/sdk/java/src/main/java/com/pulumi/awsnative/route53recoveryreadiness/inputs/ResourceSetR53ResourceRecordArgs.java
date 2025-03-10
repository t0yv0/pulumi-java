// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Route 53 resource that a DNS target resource record points to.
 * 
 */
public final class ResourceSetR53ResourceRecordArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSetR53ResourceRecordArgs Empty = new ResourceSetR53ResourceRecordArgs();

    /**
     * The DNS target domain name.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The DNS target domain name.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The Resource Record set id.
     * 
     */
    @Import(name="recordSetId")
    private @Nullable Output<String> recordSetId;

    /**
     * @return The Resource Record set id.
     * 
     */
    public Optional<Output<String>> recordSetId() {
        return Optional.ofNullable(this.recordSetId);
    }

    private ResourceSetR53ResourceRecordArgs() {}

    private ResourceSetR53ResourceRecordArgs(ResourceSetR53ResourceRecordArgs $) {
        this.domainName = $.domainName;
        this.recordSetId = $.recordSetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSetR53ResourceRecordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSetR53ResourceRecordArgs $;

        public Builder() {
            $ = new ResourceSetR53ResourceRecordArgs();
        }

        public Builder(ResourceSetR53ResourceRecordArgs defaults) {
            $ = new ResourceSetR53ResourceRecordArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The DNS target domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The DNS target domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param recordSetId The Resource Record set id.
         * 
         * @return builder
         * 
         */
        public Builder recordSetId(@Nullable Output<String> recordSetId) {
            $.recordSetId = recordSetId;
            return this;
        }

        /**
         * @param recordSetId The Resource Record set id.
         * 
         * @return builder
         * 
         */
        public Builder recordSetId(String recordSetId) {
            return recordSetId(Output.of(recordSetId));
        }

        public ResourceSetR53ResourceRecordArgs build() {
            return $;
        }
    }

}
