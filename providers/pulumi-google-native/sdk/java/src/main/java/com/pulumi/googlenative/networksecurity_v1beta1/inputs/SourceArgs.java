// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specification of traffic source attributes.
 * 
 */
public final class SourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceArgs Empty = new SourceArgs();

    /**
     * Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
     * 
     */
    @Import(name="ipBlocks")
    private @Nullable Output<List<String>> ipBlocks;

    /**
     * @return Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
     * 
     */
    public Optional<Output<List<String>>> ipBlocks() {
        return Optional.ofNullable(this.ipBlocks);
    }

    /**
     * Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
     * 
     */
    @Import(name="principals")
    private @Nullable Output<List<String>> principals;

    /**
     * @return Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
     * 
     */
    public Optional<Output<List<String>>> principals() {
        return Optional.ofNullable(this.principals);
    }

    private SourceArgs() {}

    private SourceArgs(SourceArgs $) {
        this.ipBlocks = $.ipBlocks;
        this.principals = $.principals;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceArgs $;

        public Builder() {
            $ = new SourceArgs();
        }

        public Builder(SourceArgs defaults) {
            $ = new SourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ipBlocks Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(@Nullable Output<List<String>> ipBlocks) {
            $.ipBlocks = ipBlocks;
            return this;
        }

        /**
         * @param ipBlocks Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(List<String> ipBlocks) {
            return ipBlocks(Output.of(ipBlocks));
        }

        /**
         * @param ipBlocks Optional. List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., &#34;1.2.3.4&#34;) and CIDR (e.g., &#34;1.2.3.0/24&#34;) are supported. Authorization based on source IP alone should be avoided. The IP addresses of any load balancers or proxies should be considered untrusted.
         * 
         * @return builder
         * 
         */
        public Builder ipBlocks(String... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }

        /**
         * @param principals Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
         * 
         * @return builder
         * 
         */
        public Builder principals(@Nullable Output<List<String>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
         * 
         * @return builder
         * 
         */
        public Builder principals(List<String> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals Optional. List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, &#34;namespace/*&#34;) or a suffix match (example, // *{@literal /}service-account&#34;) or a presence match &#34;*&#34;. Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
         * 
         * @return builder
         * 
         */
        public Builder principals(String... principals) {
            return principals(List.of(principals));
        }

        public SourceArgs build() {
            return $;
        }
    }

}
