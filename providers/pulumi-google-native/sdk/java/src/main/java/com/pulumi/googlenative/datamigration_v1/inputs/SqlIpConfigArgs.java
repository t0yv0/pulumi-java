// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datamigration_v1.inputs.SqlAclEntryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP Management configuration.
 * 
 */
public final class SqlIpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlIpConfigArgs Empty = new SqlIpConfigArgs();

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
     * 
     */
    @Import(name="authorizedNetworks")
    private @Nullable Output<List<SqlAclEntryArgs>> authorizedNetworks;

    /**
     * @return The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
     * 
     */
    public Optional<Output<List<SqlAclEntryArgs>>> authorizedNetworks() {
        return Optional.ofNullable(this.authorizedNetworks);
    }

    /**
     * Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    @Import(name="enableIpv4")
    private @Nullable Output<Boolean> enableIpv4;

    /**
     * @return Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    public Optional<Output<Boolean>> enableIpv4() {
        return Optional.ofNullable(this.enableIpv4);
    }

    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @Import(name="privateNetwork")
    private @Nullable Output<String> privateNetwork;

    /**
     * @return The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    public Optional<Output<String>> privateNetwork() {
        return Optional.ofNullable(this.privateNetwork);
    }

    /**
     * Whether SSL connections over IP should be enforced or not.
     * 
     */
    @Import(name="requireSsl")
    private @Nullable Output<Boolean> requireSsl;

    /**
     * @return Whether SSL connections over IP should be enforced or not.
     * 
     */
    public Optional<Output<Boolean>> requireSsl() {
        return Optional.ofNullable(this.requireSsl);
    }

    private SqlIpConfigArgs() {}

    private SqlIpConfigArgs(SqlIpConfigArgs $) {
        this.authorizedNetworks = $.authorizedNetworks;
        this.enableIpv4 = $.enableIpv4;
        this.privateNetwork = $.privateNetwork;
        this.requireSsl = $.requireSsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlIpConfigArgs $;

        public Builder() {
            $ = new SqlIpConfigArgs();
        }

        public Builder(SqlIpConfigArgs defaults) {
            $ = new SqlIpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizedNetworks The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(@Nullable Output<List<SqlAclEntryArgs>> authorizedNetworks) {
            $.authorizedNetworks = authorizedNetworks;
            return this;
        }

        /**
         * @param authorizedNetworks The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(List<SqlAclEntryArgs> authorizedNetworks) {
            return authorizedNetworks(Output.of(authorizedNetworks));
        }

        /**
         * @param authorizedNetworks The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as &#39;slash&#39; notation (e.g. `192.168.100.0/24`).
         * 
         * @return builder
         * 
         */
        public Builder authorizedNetworks(SqlAclEntryArgs... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }

        /**
         * @param enableIpv4 Whether the instance should be assigned an IPv4 address or not.
         * 
         * @return builder
         * 
         */
        public Builder enableIpv4(@Nullable Output<Boolean> enableIpv4) {
            $.enableIpv4 = enableIpv4;
            return this;
        }

        /**
         * @param enableIpv4 Whether the instance should be assigned an IPv4 address or not.
         * 
         * @return builder
         * 
         */
        public Builder enableIpv4(Boolean enableIpv4) {
            return enableIpv4(Output.of(enableIpv4));
        }

        /**
         * @param privateNetwork The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
         * 
         * @return builder
         * 
         */
        public Builder privateNetwork(@Nullable Output<String> privateNetwork) {
            $.privateNetwork = privateNetwork;
            return this;
        }

        /**
         * @param privateNetwork The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
         * 
         * @return builder
         * 
         */
        public Builder privateNetwork(String privateNetwork) {
            return privateNetwork(Output.of(privateNetwork));
        }

        /**
         * @param requireSsl Whether SSL connections over IP should be enforced or not.
         * 
         * @return builder
         * 
         */
        public Builder requireSsl(@Nullable Output<Boolean> requireSsl) {
            $.requireSsl = requireSsl;
            return this;
        }

        /**
         * @param requireSsl Whether SSL connections over IP should be enforced or not.
         * 
         * @return builder
         * 
         */
        public Builder requireSsl(Boolean requireSsl) {
            return requireSsl(Output.of(requireSsl));
        }

        public SqlIpConfigArgs build() {
            return $;
        }
    }

}
