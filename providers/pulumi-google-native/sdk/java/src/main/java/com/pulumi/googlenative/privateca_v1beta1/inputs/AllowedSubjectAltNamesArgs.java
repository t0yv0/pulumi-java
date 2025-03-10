// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AllowedSubjectAltNames specifies the allowed values for SubjectAltNames by the CertificateAuthority when issuing Certificates.
 * 
 */
public final class AllowedSubjectAltNamesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AllowedSubjectAltNamesArgs Empty = new AllowedSubjectAltNamesArgs();

    /**
     * Optional. Specifies if to allow custom X509Extension values.
     * 
     */
    @Import(name="allowCustomSans")
    private @Nullable Output<Boolean> allowCustomSans;

    /**
     * @return Optional. Specifies if to allow custom X509Extension values.
     * 
     */
    public Optional<Output<Boolean>> allowCustomSans() {
        return Optional.ofNullable(this.allowCustomSans);
    }

    /**
     * Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
     * 
     */
    @Import(name="allowGlobbingDnsWildcards")
    private @Nullable Output<Boolean> allowGlobbingDnsWildcards;

    /**
     * @return Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
     * 
     */
    public Optional<Output<Boolean>> allowGlobbingDnsWildcards() {
        return Optional.ofNullable(this.allowGlobbingDnsWildcards);
    }

    /**
     * Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
     * 
     */
    @Import(name="allowedDnsNames")
    private @Nullable Output<List<String>> allowedDnsNames;

    /**
     * @return Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
     * 
     */
    public Optional<Output<List<String>>> allowedDnsNames() {
        return Optional.ofNullable(this.allowedDnsNames);
    }

    /**
     * Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
     * 
     */
    @Import(name="allowedEmailAddresses")
    private @Nullable Output<List<String>> allowedEmailAddresses;

    /**
     * @return Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
     * 
     */
    public Optional<Output<List<String>>> allowedEmailAddresses() {
        return Optional.ofNullable(this.allowedEmailAddresses);
    }

    /**
     * Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the &#39;/&#39; notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
     * 
     */
    @Import(name="allowedIps")
    private @Nullable Output<List<String>> allowedIps;

    /**
     * @return Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the &#39;/&#39; notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
     * 
     */
    public Optional<Output<List<String>>> allowedIps() {
        return Optional.ofNullable(this.allowedIps);
    }

    /**
     * Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. &#39;/&#39;) use the double star glob pattern (i.e. &#39;**&#39;).
     * 
     */
    @Import(name="allowedUris")
    private @Nullable Output<List<String>> allowedUris;

    /**
     * @return Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. &#39;/&#39;) use the double star glob pattern (i.e. &#39;**&#39;).
     * 
     */
    public Optional<Output<List<String>>> allowedUris() {
        return Optional.ofNullable(this.allowedUris);
    }

    private AllowedSubjectAltNamesArgs() {}

    private AllowedSubjectAltNamesArgs(AllowedSubjectAltNamesArgs $) {
        this.allowCustomSans = $.allowCustomSans;
        this.allowGlobbingDnsWildcards = $.allowGlobbingDnsWildcards;
        this.allowedDnsNames = $.allowedDnsNames;
        this.allowedEmailAddresses = $.allowedEmailAddresses;
        this.allowedIps = $.allowedIps;
        this.allowedUris = $.allowedUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AllowedSubjectAltNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AllowedSubjectAltNamesArgs $;

        public Builder() {
            $ = new AllowedSubjectAltNamesArgs();
        }

        public Builder(AllowedSubjectAltNamesArgs defaults) {
            $ = new AllowedSubjectAltNamesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowCustomSans Optional. Specifies if to allow custom X509Extension values.
         * 
         * @return builder
         * 
         */
        public Builder allowCustomSans(@Nullable Output<Boolean> allowCustomSans) {
            $.allowCustomSans = allowCustomSans;
            return this;
        }

        /**
         * @param allowCustomSans Optional. Specifies if to allow custom X509Extension values.
         * 
         * @return builder
         * 
         */
        public Builder allowCustomSans(Boolean allowCustomSans) {
            return allowCustomSans(Output.of(allowCustomSans));
        }

        /**
         * @param allowGlobbingDnsWildcards Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
         * 
         * @return builder
         * 
         */
        public Builder allowGlobbingDnsWildcards(@Nullable Output<Boolean> allowGlobbingDnsWildcards) {
            $.allowGlobbingDnsWildcards = allowGlobbingDnsWildcards;
            return this;
        }

        /**
         * @param allowGlobbingDnsWildcards Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
         * 
         * @return builder
         * 
         */
        public Builder allowGlobbingDnsWildcards(Boolean allowGlobbingDnsWildcards) {
            return allowGlobbingDnsWildcards(Output.of(allowGlobbingDnsWildcards));
        }

        /**
         * @param allowedDnsNames Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
         * 
         * @return builder
         * 
         */
        public Builder allowedDnsNames(@Nullable Output<List<String>> allowedDnsNames) {
            $.allowedDnsNames = allowedDnsNames;
            return this;
        }

        /**
         * @param allowedDnsNames Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
         * 
         * @return builder
         * 
         */
        public Builder allowedDnsNames(List<String> allowedDnsNames) {
            return allowedDnsNames(Output.of(allowedDnsNames));
        }

        /**
         * @param allowedDnsNames Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
         * 
         * @return builder
         * 
         */
        public Builder allowedDnsNames(String... allowedDnsNames) {
            return allowedDnsNames(List.of(allowedDnsNames));
        }

        /**
         * @param allowedEmailAddresses Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
         * 
         * @return builder
         * 
         */
        public Builder allowedEmailAddresses(@Nullable Output<List<String>> allowedEmailAddresses) {
            $.allowedEmailAddresses = allowedEmailAddresses;
            return this;
        }

        /**
         * @param allowedEmailAddresses Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
         * 
         * @return builder
         * 
         */
        public Builder allowedEmailAddresses(List<String> allowedEmailAddresses) {
            return allowedEmailAddresses(Output.of(allowedEmailAddresses));
        }

        /**
         * @param allowedEmailAddresses Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
         * 
         * @return builder
         * 
         */
        public Builder allowedEmailAddresses(String... allowedEmailAddresses) {
            return allowedEmailAddresses(List.of(allowedEmailAddresses));
        }

        /**
         * @param allowedIps Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the &#39;/&#39; notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(@Nullable Output<List<String>> allowedIps) {
            $.allowedIps = allowedIps;
            return this;
        }

        /**
         * @param allowedIps Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the &#39;/&#39; notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(List<String> allowedIps) {
            return allowedIps(Output.of(allowedIps));
        }

        /**
         * @param allowedIps Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the &#39;/&#39; notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
         * 
         * @return builder
         * 
         */
        public Builder allowedIps(String... allowedIps) {
            return allowedIps(List.of(allowedIps));
        }

        /**
         * @param allowedUris Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. &#39;/&#39;) use the double star glob pattern (i.e. &#39;**&#39;).
         * 
         * @return builder
         * 
         */
        public Builder allowedUris(@Nullable Output<List<String>> allowedUris) {
            $.allowedUris = allowedUris;
            return this;
        }

        /**
         * @param allowedUris Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. &#39;/&#39;) use the double star glob pattern (i.e. &#39;**&#39;).
         * 
         * @return builder
         * 
         */
        public Builder allowedUris(List<String> allowedUris) {
            return allowedUris(Output.of(allowedUris));
        }

        /**
         * @param allowedUris Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. &#39;/&#39;) use the double star glob pattern (i.e. &#39;**&#39;).
         * 
         * @return builder
         * 
         */
        public Builder allowedUris(String... allowedUris) {
            return allowedUris(List.of(allowedUris));
        }

        public AllowedSubjectAltNamesArgs build() {
            return $;
        }
    }

}
