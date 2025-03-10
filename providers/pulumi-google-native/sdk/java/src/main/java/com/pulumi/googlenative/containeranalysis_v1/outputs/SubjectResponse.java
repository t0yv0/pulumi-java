// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class SubjectResponse {
    /**
     * @return `&#34;&#34;: &#34;&#34;` Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * 
     */
    private final Map<String,String> digest;
    private final String name;

    @CustomType.Constructor
    private SubjectResponse(
        @CustomType.Parameter("digest") Map<String,String> digest,
        @CustomType.Parameter("name") String name) {
        this.digest = digest;
        this.name = name;
    }

    /**
     * @return `&#34;&#34;: &#34;&#34;` Algorithms can be e.g. sha256, sha512 See https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
     * 
     */
    public Map<String,String> digest() {
        return this.digest;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> digest;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.name = defaults.name;
        }

        public Builder digest(Map<String,String> digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public SubjectResponse build() {
            return new SubjectResponse(digest, name);
        }
    }
}
