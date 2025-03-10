// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetPrefixListFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrefixListArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrefixListArgs Empty = new GetPrefixListArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetPrefixListFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetPrefixListFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the prefix list to select.
     * 
     */
    @Import(name="prefixListId")
    private @Nullable String prefixListId;

    /**
     * @return The ID of the prefix list to select.
     * 
     */
    public Optional<String> prefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }

    private GetPrefixListArgs() {}

    private GetPrefixListArgs(GetPrefixListArgs $) {
        this.filters = $.filters;
        this.name = $.name;
        this.prefixListId = $.prefixListId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrefixListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrefixListArgs $;

        public Builder() {
            $ = new GetPrefixListArgs();
        }

        public Builder(GetPrefixListArgs defaults) {
            $ = new GetPrefixListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetPrefixListFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetPrefixListFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name The name of the filter field. Valid values can be found in the [EC2 DescribePrefixLists API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribePrefixLists.html).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param prefixListId The ID of the prefix list to select.
         * 
         * @return builder
         * 
         */
        public Builder prefixListId(@Nullable String prefixListId) {
            $.prefixListId = prefixListId;
            return this;
        }

        public GetPrefixListArgs build() {
            return $;
        }
    }

}
