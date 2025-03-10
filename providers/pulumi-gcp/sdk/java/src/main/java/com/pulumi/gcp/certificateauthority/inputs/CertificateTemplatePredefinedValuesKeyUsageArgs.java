// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesKeyUsageArgs Empty = new CertificateTemplatePredefinedValuesKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    @Import(name="baseKeyUsage")
    private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> baseKeyUsage;

    /**
     * @return Describes high-level ways in which a key may be used.
     * 
     */
    public Optional<Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs>> baseKeyUsage() {
        return Optional.ofNullable(this.baseKeyUsage);
    }

    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    @Import(name="extendedKeyUsage")
    private @Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> extendedKeyUsage;

    /**
     * @return Detailed scenarios in which a key may be used.
     * 
     */
    public Optional<Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs>> extendedKeyUsage() {
        return Optional.ofNullable(this.extendedKeyUsage);
    }

    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    @Import(name="unknownExtendedKeyUsages")
    private @Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    /**
     * @return Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    public Optional<Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>>> unknownExtendedKeyUsages() {
        return Optional.ofNullable(this.unknownExtendedKeyUsages);
    }

    private CertificateTemplatePredefinedValuesKeyUsageArgs() {}

    private CertificateTemplatePredefinedValuesKeyUsageArgs(CertificateTemplatePredefinedValuesKeyUsageArgs $) {
        this.baseKeyUsage = $.baseKeyUsage;
        this.extendedKeyUsage = $.extendedKeyUsage;
        this.unknownExtendedKeyUsages = $.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateTemplatePredefinedValuesKeyUsageArgs $;

        public Builder() {
            $ = new CertificateTemplatePredefinedValuesKeyUsageArgs();
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsageArgs defaults) {
            $ = new CertificateTemplatePredefinedValuesKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseKeyUsage Describes high-level ways in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder baseKeyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs> baseKeyUsage) {
            $.baseKeyUsage = baseKeyUsage;
            return this;
        }

        /**
         * @param baseKeyUsage Describes high-level ways in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder baseKeyUsage(CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs baseKeyUsage) {
            return baseKeyUsage(Output.of(baseKeyUsage));
        }

        /**
         * @param extendedKeyUsage Detailed scenarios in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder extendedKeyUsage(@Nullable Output<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs> extendedKeyUsage) {
            $.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        /**
         * @param extendedKeyUsage Detailed scenarios in which a key may be used.
         * 
         * @return builder
         * 
         */
        public Builder extendedKeyUsage(CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs extendedKeyUsage) {
            return extendedKeyUsage(Output.of(extendedKeyUsage));
        }

        /**
         * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(@Nullable Output<List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            $.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        /**
         * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(Output.of(unknownExtendedKeyUsages));
        }

        /**
         * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
         * 
         * @return builder
         * 
         */
        public Builder unknownExtendedKeyUsages(CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs... unknownExtendedKeyUsages) {
            return unknownExtendedKeyUsages(List.of(unknownExtendedKeyUsages));
        }

        public CertificateTemplatePredefinedValuesKeyUsageArgs build() {
            return $;
        }
    }

}
