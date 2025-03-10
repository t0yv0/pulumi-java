// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainEndpointOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainEndpointOptionsArgs Empty = new DomainEndpointOptionsArgs();

    @Import(name="customEndpoint")
    private @Nullable Output<String> customEndpoint;

    public Optional<Output<String>> customEndpoint() {
        return Optional.ofNullable(this.customEndpoint);
    }

    @Import(name="customEndpointCertificateArn")
    private @Nullable Output<String> customEndpointCertificateArn;

    public Optional<Output<String>> customEndpointCertificateArn() {
        return Optional.ofNullable(this.customEndpointCertificateArn);
    }

    @Import(name="customEndpointEnabled")
    private @Nullable Output<Boolean> customEndpointEnabled;

    public Optional<Output<Boolean>> customEndpointEnabled() {
        return Optional.ofNullable(this.customEndpointEnabled);
    }

    @Import(name="enforceHTTPS")
    private @Nullable Output<Boolean> enforceHTTPS;

    public Optional<Output<Boolean>> enforceHTTPS() {
        return Optional.ofNullable(this.enforceHTTPS);
    }

    @Import(name="tLSSecurityPolicy")
    private @Nullable Output<String> tLSSecurityPolicy;

    public Optional<Output<String>> tLSSecurityPolicy() {
        return Optional.ofNullable(this.tLSSecurityPolicy);
    }

    private DomainEndpointOptionsArgs() {}

    private DomainEndpointOptionsArgs(DomainEndpointOptionsArgs $) {
        this.customEndpoint = $.customEndpoint;
        this.customEndpointCertificateArn = $.customEndpointCertificateArn;
        this.customEndpointEnabled = $.customEndpointEnabled;
        this.enforceHTTPS = $.enforceHTTPS;
        this.tLSSecurityPolicy = $.tLSSecurityPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainEndpointOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainEndpointOptionsArgs $;

        public Builder() {
            $ = new DomainEndpointOptionsArgs();
        }

        public Builder(DomainEndpointOptionsArgs defaults) {
            $ = new DomainEndpointOptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder customEndpoint(@Nullable Output<String> customEndpoint) {
            $.customEndpoint = customEndpoint;
            return this;
        }

        public Builder customEndpoint(String customEndpoint) {
            return customEndpoint(Output.of(customEndpoint));
        }

        public Builder customEndpointCertificateArn(@Nullable Output<String> customEndpointCertificateArn) {
            $.customEndpointCertificateArn = customEndpointCertificateArn;
            return this;
        }

        public Builder customEndpointCertificateArn(String customEndpointCertificateArn) {
            return customEndpointCertificateArn(Output.of(customEndpointCertificateArn));
        }

        public Builder customEndpointEnabled(@Nullable Output<Boolean> customEndpointEnabled) {
            $.customEndpointEnabled = customEndpointEnabled;
            return this;
        }

        public Builder customEndpointEnabled(Boolean customEndpointEnabled) {
            return customEndpointEnabled(Output.of(customEndpointEnabled));
        }

        public Builder enforceHTTPS(@Nullable Output<Boolean> enforceHTTPS) {
            $.enforceHTTPS = enforceHTTPS;
            return this;
        }

        public Builder enforceHTTPS(Boolean enforceHTTPS) {
            return enforceHTTPS(Output.of(enforceHTTPS));
        }

        public Builder tLSSecurityPolicy(@Nullable Output<String> tLSSecurityPolicy) {
            $.tLSSecurityPolicy = tLSSecurityPolicy;
            return this;
        }

        public Builder tLSSecurityPolicy(String tLSSecurityPolicy) {
            return tLSSecurityPolicy(Output.of(tLSSecurityPolicy));
        }

        public DomainEndpointOptionsArgs build() {
            return $;
        }
    }

}
