// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.enums.EcKeyTypeSignatureAlgorithm;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Elliptic Curve key that may be used in a Certificate issued from a CaPool.
 * 
 */
public final class EcKeyTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcKeyTypeArgs Empty = new EcKeyTypeArgs();

    /**
     * Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
     * 
     */
    @Import(name="signatureAlgorithm")
    private @Nullable Output<EcKeyTypeSignatureAlgorithm> signatureAlgorithm;

    /**
     * @return Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
     * 
     */
    public Optional<Output<EcKeyTypeSignatureAlgorithm>> signatureAlgorithm() {
        return Optional.ofNullable(this.signatureAlgorithm);
    }

    private EcKeyTypeArgs() {}

    private EcKeyTypeArgs(EcKeyTypeArgs $) {
        this.signatureAlgorithm = $.signatureAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcKeyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcKeyTypeArgs $;

        public Builder() {
            $ = new EcKeyTypeArgs();
        }

        public Builder(EcKeyTypeArgs defaults) {
            $ = new EcKeyTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param signatureAlgorithm Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder signatureAlgorithm(@Nullable Output<EcKeyTypeSignatureAlgorithm> signatureAlgorithm) {
            $.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * @param signatureAlgorithm Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed.
         * 
         * @return builder
         * 
         */
        public Builder signatureAlgorithm(EcKeyTypeSignatureAlgorithm signatureAlgorithm) {
            return signatureAlgorithm(Output.of(signatureAlgorithm));
        }

        public EcKeyTypeArgs build() {
            return $;
        }
    }

}
