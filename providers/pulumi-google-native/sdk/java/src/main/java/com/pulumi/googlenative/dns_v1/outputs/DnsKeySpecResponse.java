// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DnsKeySpecResponse {
    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    private final String algorithm;
    /**
     * @return Length of the keys in bits.
     * 
     */
    private final Integer keyLength;
    /**
     * @return Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    private final String keyType;
    private final String kind;

    @CustomType.Constructor
    private DnsKeySpecResponse(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("keyLength") Integer keyLength,
        @CustomType.Parameter("keyType") String keyType,
        @CustomType.Parameter("kind") String kind) {
        this.algorithm = algorithm;
        this.keyLength = keyLength;
        this.keyType = keyType;
        this.kind = kind;
    }

    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return Length of the keys in bits.
     * 
     */
    public Integer keyLength() {
        return this.keyLength;
    }
    /**
     * @return Specifies whether this is a key signing key (KSK) or a zone signing key (ZSK). Key signing keys have the Secure Entry Point flag set and, when active, are only used to sign resource record sets of type DNSKEY. Zone signing keys do not have the Secure Entry Point flag set and are used to sign all other types of resource record sets.
     * 
     */
    public String keyType() {
        return this.keyType;
    }
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsKeySpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private Integer keyLength;
        private String keyType;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsKeySpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder keyLength(Integer keyLength) {
            this.keyLength = Objects.requireNonNull(keyLength);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public DnsKeySpecResponse build() {
            return new DnsKeySpecResponse(algorithm, keyLength, keyType, kind);
        }
    }
}
