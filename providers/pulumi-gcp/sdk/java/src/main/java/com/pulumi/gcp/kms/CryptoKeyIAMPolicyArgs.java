// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CryptoKeyIAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyIAMPolicyArgs Empty = new CryptoKeyIAMPolicyArgs();

    /**
     * The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider&#39;s project setting will be used as a fallback.
     * 
     */
    @Import(name="cryptoKeyId", required=true)
    private Output<String> cryptoKeyId;

    /**
     * @return The crypto key ID, in the form
     * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
     * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
     * the provider&#39;s project setting will be used as a fallback.
     * 
     */
    public Output<String> cryptoKeyId() {
        return this.cryptoKeyId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    private CryptoKeyIAMPolicyArgs() {}

    private CryptoKeyIAMPolicyArgs(CryptoKeyIAMPolicyArgs $) {
        this.cryptoKeyId = $.cryptoKeyId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyIAMPolicyArgs $;

        public Builder() {
            $ = new CryptoKeyIAMPolicyArgs();
        }

        public Builder(CryptoKeyIAMPolicyArgs defaults) {
            $ = new CryptoKeyIAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cryptoKeyId The crypto key ID, in the form
         * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
         * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
         * the provider&#39;s project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyId(Output<String> cryptoKeyId) {
            $.cryptoKeyId = cryptoKeyId;
            return this;
        }

        /**
         * @param cryptoKeyId The crypto key ID, in the form
         * `{project_id}/{location_name}/{key_ring_name}/{crypto_key_name}` or
         * `{location_name}/{key_ring_name}/{crypto_key_name}`. In the second form,
         * the provider&#39;s project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyId(String cryptoKeyId) {
            return cryptoKeyId(Output.of(cryptoKeyId));
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by
         * a `gcp.organizations.getIAMPolicy` data source.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public CryptoKeyIAMPolicyArgs build() {
            $.cryptoKeyId = Objects.requireNonNull($.cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
