// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.Protocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JitNetworkAccessPortRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JitNetworkAccessPortRuleArgs Empty = new JitNetworkAccessPortRuleArgs();

    /**
     * Mutually exclusive with the &#34;allowedSourceAddressPrefixes&#34; parameter. Should be an IP address or CIDR, for example &#34;192.168.0.3&#34; or &#34;192.168.0.0/16&#34;.
     * 
     */
    @Import(name="allowedSourceAddressPrefix")
    private @Nullable Output<String> allowedSourceAddressPrefix;

    /**
     * @return Mutually exclusive with the &#34;allowedSourceAddressPrefixes&#34; parameter. Should be an IP address or CIDR, for example &#34;192.168.0.3&#34; or &#34;192.168.0.0/16&#34;.
     * 
     */
    public Optional<Output<String>> allowedSourceAddressPrefix() {
        return Optional.ofNullable(this.allowedSourceAddressPrefix);
    }

    /**
     * Mutually exclusive with the &#34;allowedSourceAddressPrefix&#34; parameter.
     * 
     */
    @Import(name="allowedSourceAddressPrefixes")
    private @Nullable Output<List<String>> allowedSourceAddressPrefixes;

    /**
     * @return Mutually exclusive with the &#34;allowedSourceAddressPrefix&#34; parameter.
     * 
     */
    public Optional<Output<List<String>>> allowedSourceAddressPrefixes() {
        return Optional.ofNullable(this.allowedSourceAddressPrefixes);
    }

    /**
     * Maximum duration requests can be made for. In ISO 8601 duration format. Minimum 5 minutes, maximum 1 day
     * 
     */
    @Import(name="maxRequestAccessDuration", required=true)
    private Output<String> maxRequestAccessDuration;

    /**
     * @return Maximum duration requests can be made for. In ISO 8601 duration format. Minimum 5 minutes, maximum 1 day
     * 
     */
    public Output<String> maxRequestAccessDuration() {
        return this.maxRequestAccessDuration;
    }

    @Import(name="number", required=true)
    private Output<Integer> number;

    public Output<Integer> number() {
        return this.number;
    }

    @Import(name="protocol", required=true)
    private Output<Either<String,Protocol>> protocol;

    public Output<Either<String,Protocol>> protocol() {
        return this.protocol;
    }

    private JitNetworkAccessPortRuleArgs() {}

    private JitNetworkAccessPortRuleArgs(JitNetworkAccessPortRuleArgs $) {
        this.allowedSourceAddressPrefix = $.allowedSourceAddressPrefix;
        this.allowedSourceAddressPrefixes = $.allowedSourceAddressPrefixes;
        this.maxRequestAccessDuration = $.maxRequestAccessDuration;
        this.number = $.number;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JitNetworkAccessPortRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JitNetworkAccessPortRuleArgs $;

        public Builder() {
            $ = new JitNetworkAccessPortRuleArgs();
        }

        public Builder(JitNetworkAccessPortRuleArgs defaults) {
            $ = new JitNetworkAccessPortRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedSourceAddressPrefix Mutually exclusive with the &#34;allowedSourceAddressPrefixes&#34; parameter. Should be an IP address or CIDR, for example &#34;192.168.0.3&#34; or &#34;192.168.0.0/16&#34;.
         * 
         * @return builder
         * 
         */
        public Builder allowedSourceAddressPrefix(@Nullable Output<String> allowedSourceAddressPrefix) {
            $.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
            return this;
        }

        /**
         * @param allowedSourceAddressPrefix Mutually exclusive with the &#34;allowedSourceAddressPrefixes&#34; parameter. Should be an IP address or CIDR, for example &#34;192.168.0.3&#34; or &#34;192.168.0.0/16&#34;.
         * 
         * @return builder
         * 
         */
        public Builder allowedSourceAddressPrefix(String allowedSourceAddressPrefix) {
            return allowedSourceAddressPrefix(Output.of(allowedSourceAddressPrefix));
        }

        /**
         * @param allowedSourceAddressPrefixes Mutually exclusive with the &#34;allowedSourceAddressPrefix&#34; parameter.
         * 
         * @return builder
         * 
         */
        public Builder allowedSourceAddressPrefixes(@Nullable Output<List<String>> allowedSourceAddressPrefixes) {
            $.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
            return this;
        }

        /**
         * @param allowedSourceAddressPrefixes Mutually exclusive with the &#34;allowedSourceAddressPrefix&#34; parameter.
         * 
         * @return builder
         * 
         */
        public Builder allowedSourceAddressPrefixes(List<String> allowedSourceAddressPrefixes) {
            return allowedSourceAddressPrefixes(Output.of(allowedSourceAddressPrefixes));
        }

        /**
         * @param allowedSourceAddressPrefixes Mutually exclusive with the &#34;allowedSourceAddressPrefix&#34; parameter.
         * 
         * @return builder
         * 
         */
        public Builder allowedSourceAddressPrefixes(String... allowedSourceAddressPrefixes) {
            return allowedSourceAddressPrefixes(List.of(allowedSourceAddressPrefixes));
        }

        /**
         * @param maxRequestAccessDuration Maximum duration requests can be made for. In ISO 8601 duration format. Minimum 5 minutes, maximum 1 day
         * 
         * @return builder
         * 
         */
        public Builder maxRequestAccessDuration(Output<String> maxRequestAccessDuration) {
            $.maxRequestAccessDuration = maxRequestAccessDuration;
            return this;
        }

        /**
         * @param maxRequestAccessDuration Maximum duration requests can be made for. In ISO 8601 duration format. Minimum 5 minutes, maximum 1 day
         * 
         * @return builder
         * 
         */
        public Builder maxRequestAccessDuration(String maxRequestAccessDuration) {
            return maxRequestAccessDuration(Output.of(maxRequestAccessDuration));
        }

        public Builder number(Output<Integer> number) {
            $.number = number;
            return this;
        }

        public Builder number(Integer number) {
            return number(Output.of(number));
        }

        public Builder protocol(Output<Either<String,Protocol>> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(Either<String,Protocol> protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder protocol(String protocol) {
            return protocol(Either.ofLeft(protocol));
        }

        public Builder protocol(Protocol protocol) {
            return protocol(Either.ofRight(protocol));
        }

        public JitNetworkAccessPortRuleArgs build() {
            $.maxRequestAccessDuration = Objects.requireNonNull($.maxRequestAccessDuration, "expected parameter 'maxRequestAccessDuration' to be non-null");
            $.number = Objects.requireNonNull($.number, "expected parameter 'number' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
