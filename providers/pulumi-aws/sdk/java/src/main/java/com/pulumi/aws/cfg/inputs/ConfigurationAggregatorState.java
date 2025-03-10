// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.inputs;

import com.pulumi.aws.cfg.inputs.ConfigurationAggregatorAccountAggregationSourceArgs;
import com.pulumi.aws.cfg.inputs.ConfigurationAggregatorOrganizationAggregationSourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorState Empty = new ConfigurationAggregatorState();

    /**
     * The account(s) to aggregate config data from as documented below.
     * 
     */
    @Import(name="accountAggregationSource")
    private @Nullable Output<ConfigurationAggregatorAccountAggregationSourceArgs> accountAggregationSource;

    /**
     * @return The account(s) to aggregate config data from as documented below.
     * 
     */
    public Optional<Output<ConfigurationAggregatorAccountAggregationSourceArgs>> accountAggregationSource() {
        return Optional.ofNullable(this.accountAggregationSource);
    }

    /**
     * The ARN of the aggregator
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the aggregator
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The name of the configuration aggregator.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the configuration aggregator.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization to aggregate config data from as documented below.
     * 
     */
    @Import(name="organizationAggregationSource")
    private @Nullable Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource;

    /**
     * @return The organization to aggregate config data from as documented below.
     * 
     */
    public Optional<Output<ConfigurationAggregatorOrganizationAggregationSourceArgs>> organizationAggregationSource() {
        return Optional.ofNullable(this.organizationAggregationSource);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private ConfigurationAggregatorState() {}

    private ConfigurationAggregatorState(ConfigurationAggregatorState $) {
        this.accountAggregationSource = $.accountAggregationSource;
        this.arn = $.arn;
        this.name = $.name;
        this.organizationAggregationSource = $.organizationAggregationSource;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationAggregatorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationAggregatorState $;

        public Builder() {
            $ = new ConfigurationAggregatorState();
        }

        public Builder(ConfigurationAggregatorState defaults) {
            $ = new ConfigurationAggregatorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountAggregationSource The account(s) to aggregate config data from as documented below.
         * 
         * @return builder
         * 
         */
        public Builder accountAggregationSource(@Nullable Output<ConfigurationAggregatorAccountAggregationSourceArgs> accountAggregationSource) {
            $.accountAggregationSource = accountAggregationSource;
            return this;
        }

        /**
         * @param accountAggregationSource The account(s) to aggregate config data from as documented below.
         * 
         * @return builder
         * 
         */
        public Builder accountAggregationSource(ConfigurationAggregatorAccountAggregationSourceArgs accountAggregationSource) {
            return accountAggregationSource(Output.of(accountAggregationSource));
        }

        /**
         * @param arn The ARN of the aggregator
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the aggregator
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param name The name of the configuration aggregator.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the configuration aggregator.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationAggregationSource The organization to aggregate config data from as documented below.
         * 
         * @return builder
         * 
         */
        public Builder organizationAggregationSource(@Nullable Output<ConfigurationAggregatorOrganizationAggregationSourceArgs> organizationAggregationSource) {
            $.organizationAggregationSource = organizationAggregationSource;
            return this;
        }

        /**
         * @param organizationAggregationSource The organization to aggregate config data from as documented below.
         * 
         * @return builder
         * 
         */
        public Builder organizationAggregationSource(ConfigurationAggregatorOrganizationAggregationSourceArgs organizationAggregationSource) {
            return organizationAggregationSource(Output.of(organizationAggregationSource));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public ConfigurationAggregatorState build() {
            return $;
        }
    }

}
