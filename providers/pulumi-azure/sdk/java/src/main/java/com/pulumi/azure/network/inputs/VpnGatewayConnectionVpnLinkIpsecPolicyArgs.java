// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VpnGatewayConnectionVpnLinkIpsecPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayConnectionVpnLinkIpsecPolicyArgs Empty = new VpnGatewayConnectionVpnLinkIpsecPolicyArgs();

    /**
     * The DH Group used in IKE Phase 1 for initial SA. Possible values are `None`, `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384`.
     * 
     */
    @Import(name="dhGroup", required=true)
    private Output<String> dhGroup;

    /**
     * @return The DH Group used in IKE Phase 1 for initial SA. Possible values are `None`, `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384`.
     * 
     */
    public Output<String> dhGroup() {
        return this.dhGroup;
    }

    /**
     * The IPSec encryption algorithm (IKE phase 1). Possible values are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, `None`.
     * 
     */
    @Import(name="encryptionAlgorithm", required=true)
    private Output<String> encryptionAlgorithm;

    /**
     * @return The IPSec encryption algorithm (IKE phase 1). Possible values are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, `None`.
     * 
     */
    public Output<String> encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * The IKE encryption algorithm (IKE phase 2). Possible values are `DES`, `DES3`, `AES128`, `AES192`, `AES256`, `GCMAES128`, `GCMAES256`.
     * 
     */
    @Import(name="ikeEncryptionAlgorithm", required=true)
    private Output<String> ikeEncryptionAlgorithm;

    /**
     * @return The IKE encryption algorithm (IKE phase 2). Possible values are `DES`, `DES3`, `AES128`, `AES192`, `AES256`, `GCMAES128`, `GCMAES256`.
     * 
     */
    public Output<String> ikeEncryptionAlgorithm() {
        return this.ikeEncryptionAlgorithm;
    }

    /**
     * The IKE integrity algorithm (IKE phase 2). Possible values are `MD5`, `SHA1`, `SHA256`, `SHA384`, `GCMAES128`, `GCMAES256`.
     * 
     */
    @Import(name="ikeIntegrityAlgorithm", required=true)
    private Output<String> ikeIntegrityAlgorithm;

    /**
     * @return The IKE integrity algorithm (IKE phase 2). Possible values are `MD5`, `SHA1`, `SHA256`, `SHA384`, `GCMAES128`, `GCMAES256`.
     * 
     */
    public Output<String> ikeIntegrityAlgorithm() {
        return this.ikeIntegrityAlgorithm;
    }

    /**
     * The IPSec integrity algorithm (IKE phase 1). Possible values are `MD5`, `SHA1`, `SHA256`, `GCMAES128`, `GCMAES192`, `GCMAES256`.
     * 
     */
    @Import(name="integrityAlgorithm", required=true)
    private Output<String> integrityAlgorithm;

    /**
     * @return The IPSec integrity algorithm (IKE phase 1). Possible values are `MD5`, `SHA1`, `SHA256`, `GCMAES128`, `GCMAES192`, `GCMAES256`.
     * 
     */
    public Output<String> integrityAlgorithm() {
        return this.integrityAlgorithm;
    }

    /**
     * The Pfs Group used in IKE Phase 2 for the new child SA. Possible values are `None`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM`, `ECP256`, `ECP384`.
     * 
     */
    @Import(name="pfsGroup", required=true)
    private Output<String> pfsGroup;

    /**
     * @return The Pfs Group used in IKE Phase 2 for the new child SA. Possible values are `None`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM`, `ECP256`, `ECP384`.
     * 
     */
    public Output<String> pfsGroup() {
        return this.pfsGroup;
    }

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for the site to site VPN tunnel.
     * 
     */
    @Import(name="saDataSizeKb", required=true)
    private Output<Integer> saDataSizeKb;

    /**
     * @return The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for the site to site VPN tunnel.
     * 
     */
    public Output<Integer> saDataSizeKb() {
        return this.saDataSizeKb;
    }

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for the site to site VPN tunnel.
     * 
     */
    @Import(name="saLifetimeSec", required=true)
    private Output<Integer> saLifetimeSec;

    /**
     * @return The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for the site to site VPN tunnel.
     * 
     */
    public Output<Integer> saLifetimeSec() {
        return this.saLifetimeSec;
    }

    private VpnGatewayConnectionVpnLinkIpsecPolicyArgs() {}

    private VpnGatewayConnectionVpnLinkIpsecPolicyArgs(VpnGatewayConnectionVpnLinkIpsecPolicyArgs $) {
        this.dhGroup = $.dhGroup;
        this.encryptionAlgorithm = $.encryptionAlgorithm;
        this.ikeEncryptionAlgorithm = $.ikeEncryptionAlgorithm;
        this.ikeIntegrityAlgorithm = $.ikeIntegrityAlgorithm;
        this.integrityAlgorithm = $.integrityAlgorithm;
        this.pfsGroup = $.pfsGroup;
        this.saDataSizeKb = $.saDataSizeKb;
        this.saLifetimeSec = $.saLifetimeSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnGatewayConnectionVpnLinkIpsecPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnGatewayConnectionVpnLinkIpsecPolicyArgs $;

        public Builder() {
            $ = new VpnGatewayConnectionVpnLinkIpsecPolicyArgs();
        }

        public Builder(VpnGatewayConnectionVpnLinkIpsecPolicyArgs defaults) {
            $ = new VpnGatewayConnectionVpnLinkIpsecPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhGroup The DH Group used in IKE Phase 1 for initial SA. Possible values are `None`, `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(Output<String> dhGroup) {
            $.dhGroup = dhGroup;
            return this;
        }

        /**
         * @param dhGroup The DH Group used in IKE Phase 1 for initial SA. Possible values are `None`, `DHGroup1`, `DHGroup2`, `DHGroup14`, `DHGroup24`, `DHGroup2048`, `ECP256`, `ECP384`.
         * 
         * @return builder
         * 
         */
        public Builder dhGroup(String dhGroup) {
            return dhGroup(Output.of(dhGroup));
        }

        /**
         * @param encryptionAlgorithm The IPSec encryption algorithm (IKE phase 1). Possible values are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, `None`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(Output<String> encryptionAlgorithm) {
            $.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }

        /**
         * @param encryptionAlgorithm The IPSec encryption algorithm (IKE phase 1). Possible values are `AES128`, `AES192`, `AES256`, `DES`, `DES3`, `GCMAES128`, `GCMAES192`, `GCMAES256`, `None`.
         * 
         * @return builder
         * 
         */
        public Builder encryptionAlgorithm(String encryptionAlgorithm) {
            return encryptionAlgorithm(Output.of(encryptionAlgorithm));
        }

        /**
         * @param ikeEncryptionAlgorithm The IKE encryption algorithm (IKE phase 2). Possible values are `DES`, `DES3`, `AES128`, `AES192`, `AES256`, `GCMAES128`, `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncryptionAlgorithm(Output<String> ikeEncryptionAlgorithm) {
            $.ikeEncryptionAlgorithm = ikeEncryptionAlgorithm;
            return this;
        }

        /**
         * @param ikeEncryptionAlgorithm The IKE encryption algorithm (IKE phase 2). Possible values are `DES`, `DES3`, `AES128`, `AES192`, `AES256`, `GCMAES128`, `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeEncryptionAlgorithm(String ikeEncryptionAlgorithm) {
            return ikeEncryptionAlgorithm(Output.of(ikeEncryptionAlgorithm));
        }

        /**
         * @param ikeIntegrityAlgorithm The IKE integrity algorithm (IKE phase 2). Possible values are `MD5`, `SHA1`, `SHA256`, `SHA384`, `GCMAES128`, `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeIntegrityAlgorithm(Output<String> ikeIntegrityAlgorithm) {
            $.ikeIntegrityAlgorithm = ikeIntegrityAlgorithm;
            return this;
        }

        /**
         * @param ikeIntegrityAlgorithm The IKE integrity algorithm (IKE phase 2). Possible values are `MD5`, `SHA1`, `SHA256`, `SHA384`, `GCMAES128`, `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder ikeIntegrityAlgorithm(String ikeIntegrityAlgorithm) {
            return ikeIntegrityAlgorithm(Output.of(ikeIntegrityAlgorithm));
        }

        /**
         * @param integrityAlgorithm The IPSec integrity algorithm (IKE phase 1). Possible values are `MD5`, `SHA1`, `SHA256`, `GCMAES128`, `GCMAES192`, `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder integrityAlgorithm(Output<String> integrityAlgorithm) {
            $.integrityAlgorithm = integrityAlgorithm;
            return this;
        }

        /**
         * @param integrityAlgorithm The IPSec integrity algorithm (IKE phase 1). Possible values are `MD5`, `SHA1`, `SHA256`, `GCMAES128`, `GCMAES192`, `GCMAES256`.
         * 
         * @return builder
         * 
         */
        public Builder integrityAlgorithm(String integrityAlgorithm) {
            return integrityAlgorithm(Output.of(integrityAlgorithm));
        }

        /**
         * @param pfsGroup The Pfs Group used in IKE Phase 2 for the new child SA. Possible values are `None`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM`, `ECP256`, `ECP384`.
         * 
         * @return builder
         * 
         */
        public Builder pfsGroup(Output<String> pfsGroup) {
            $.pfsGroup = pfsGroup;
            return this;
        }

        /**
         * @param pfsGroup The Pfs Group used in IKE Phase 2 for the new child SA. Possible values are `None`, `PFS1`, `PFS2`, `PFS14`, `PFS24`, `PFS2048`, `PFSMM`, `ECP256`, `ECP384`.
         * 
         * @return builder
         * 
         */
        public Builder pfsGroup(String pfsGroup) {
            return pfsGroup(Output.of(pfsGroup));
        }

        /**
         * @param saDataSizeKb The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for the site to site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saDataSizeKb(Output<Integer> saDataSizeKb) {
            $.saDataSizeKb = saDataSizeKb;
            return this;
        }

        /**
         * @param saDataSizeKb The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for the site to site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saDataSizeKb(Integer saDataSizeKb) {
            return saDataSizeKb(Output.of(saDataSizeKb));
        }

        /**
         * @param saLifetimeSec The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for the site to site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saLifetimeSec(Output<Integer> saLifetimeSec) {
            $.saLifetimeSec = saLifetimeSec;
            return this;
        }

        /**
         * @param saLifetimeSec The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for the site to site VPN tunnel.
         * 
         * @return builder
         * 
         */
        public Builder saLifetimeSec(Integer saLifetimeSec) {
            return saLifetimeSec(Output.of(saLifetimeSec));
        }

        public VpnGatewayConnectionVpnLinkIpsecPolicyArgs build() {
            $.dhGroup = Objects.requireNonNull($.dhGroup, "expected parameter 'dhGroup' to be non-null");
            $.encryptionAlgorithm = Objects.requireNonNull($.encryptionAlgorithm, "expected parameter 'encryptionAlgorithm' to be non-null");
            $.ikeEncryptionAlgorithm = Objects.requireNonNull($.ikeEncryptionAlgorithm, "expected parameter 'ikeEncryptionAlgorithm' to be non-null");
            $.ikeIntegrityAlgorithm = Objects.requireNonNull($.ikeIntegrityAlgorithm, "expected parameter 'ikeIntegrityAlgorithm' to be non-null");
            $.integrityAlgorithm = Objects.requireNonNull($.integrityAlgorithm, "expected parameter 'integrityAlgorithm' to be non-null");
            $.pfsGroup = Objects.requireNonNull($.pfsGroup, "expected parameter 'pfsGroup' to be non-null");
            $.saDataSizeKb = Objects.requireNonNull($.saDataSizeKb, "expected parameter 'saDataSizeKb' to be non-null");
            $.saLifetimeSec = Objects.requireNonNull($.saLifetimeSec, "expected parameter 'saLifetimeSec' to be non-null");
            return $;
        }
    }

}
