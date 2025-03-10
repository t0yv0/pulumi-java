// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.domains_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DsRecordResponse {
    /**
     * @return The algorithm used to generate the referenced DNSKEY.
     * 
     */
    private final String algorithm;
    /**
     * @return The digest generated from the referenced DNSKEY.
     * 
     */
    private final String digest;
    /**
     * @return The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    private final String digestType;
    /**
     * @return The key tag of the record. Must be set in range 0 -- 65535.
     * 
     */
    private final Integer keyTag;

    @CustomType.Constructor
    private DsRecordResponse(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("digest") String digest,
        @CustomType.Parameter("digestType") String digestType,
        @CustomType.Parameter("keyTag") Integer keyTag) {
        this.algorithm = algorithm;
        this.digest = digest;
        this.digestType = digestType;
        this.keyTag = keyTag;
    }

    /**
     * @return The algorithm used to generate the referenced DNSKEY.
     * 
     */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * @return The digest generated from the referenced DNSKEY.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return The hash function used to generate the digest of the referenced DNSKEY.
     * 
     */
    public String digestType() {
        return this.digestType;
    }
    /**
     * @return The key tag of the record. Must be set in range 0 -- 65535.
     * 
     */
    public Integer keyTag() {
        return this.keyTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DsRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String digest;
        private String digestType;
        private Integer keyTag;

        public Builder() {
    	      // Empty
        }

        public Builder(DsRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.digest = defaults.digest;
    	      this.digestType = defaults.digestType;
    	      this.keyTag = defaults.keyTag;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder digestType(String digestType) {
            this.digestType = Objects.requireNonNull(digestType);
            return this;
        }
        public Builder keyTag(Integer keyTag) {
            this.keyTag = Objects.requireNonNull(keyTag);
            return this;
        }        public DsRecordResponse build() {
            return new DsRecordResponse(algorithm, digest, digestType, keyTag);
        }
    }
}
