// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of custom domain for Spring Cloud Gateway
 * 
 */
public final class GatewayCustomDomainPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayCustomDomainPropertiesArgs Empty = new GatewayCustomDomainPropertiesArgs();

    /**
     * The thumbprint of bound certificate.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The thumbprint of bound certificate.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private GatewayCustomDomainPropertiesArgs() {}

    private GatewayCustomDomainPropertiesArgs(GatewayCustomDomainPropertiesArgs $) {
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayCustomDomainPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayCustomDomainPropertiesArgs $;

        public Builder() {
            $ = new GatewayCustomDomainPropertiesArgs();
        }

        public Builder(GatewayCustomDomainPropertiesArgs defaults) {
            $ = new GatewayCustomDomainPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param thumbprint The thumbprint of bound certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The thumbprint of bound certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public GatewayCustomDomainPropertiesArgs build() {
            return $;
        }
    }

}
