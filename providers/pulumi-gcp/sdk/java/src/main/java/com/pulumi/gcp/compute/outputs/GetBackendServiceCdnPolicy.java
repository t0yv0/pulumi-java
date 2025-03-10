// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCdnPolicyCacheKeyPolicy;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCdnPolicyNegativeCachingPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceCdnPolicy {
    private final List<GetBackendServiceCdnPolicyCacheKeyPolicy> cacheKeyPolicies;
    private final String cacheMode;
    private final Integer clientTtl;
    private final Integer defaultTtl;
    private final Integer maxTtl;
    private final Boolean negativeCaching;
    private final List<GetBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
    private final Integer serveWhileStale;
    private final Integer signedUrlCacheMaxAgeSec;

    @CustomType.Constructor
    private GetBackendServiceCdnPolicy(
        @CustomType.Parameter("cacheKeyPolicies") List<GetBackendServiceCdnPolicyCacheKeyPolicy> cacheKeyPolicies,
        @CustomType.Parameter("cacheMode") String cacheMode,
        @CustomType.Parameter("clientTtl") Integer clientTtl,
        @CustomType.Parameter("defaultTtl") Integer defaultTtl,
        @CustomType.Parameter("maxTtl") Integer maxTtl,
        @CustomType.Parameter("negativeCaching") Boolean negativeCaching,
        @CustomType.Parameter("negativeCachingPolicies") List<GetBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies,
        @CustomType.Parameter("serveWhileStale") Integer serveWhileStale,
        @CustomType.Parameter("signedUrlCacheMaxAgeSec") Integer signedUrlCacheMaxAgeSec) {
        this.cacheKeyPolicies = cacheKeyPolicies;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicies = negativeCachingPolicies;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    public List<GetBackendServiceCdnPolicyCacheKeyPolicy> cacheKeyPolicies() {
        return this.cacheKeyPolicies;
    }
    public String cacheMode() {
        return this.cacheMode;
    }
    public Integer clientTtl() {
        return this.clientTtl;
    }
    public Integer defaultTtl() {
        return this.defaultTtl;
    }
    public Integer maxTtl() {
        return this.maxTtl;
    }
    public Boolean negativeCaching() {
        return this.negativeCaching;
    }
    public List<GetBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies() {
        return this.negativeCachingPolicies;
    }
    public Integer serveWhileStale() {
        return this.serveWhileStale;
    }
    public Integer signedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceCdnPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBackendServiceCdnPolicyCacheKeyPolicy> cacheKeyPolicies;
        private String cacheMode;
        private Integer clientTtl;
        private Integer defaultTtl;
        private Integer maxTtl;
        private Boolean negativeCaching;
        private List<GetBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
        private Integer serveWhileStale;
        private Integer signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceCdnPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyPolicies = defaults.cacheKeyPolicies;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder cacheKeyPolicies(List<GetBackendServiceCdnPolicyCacheKeyPolicy> cacheKeyPolicies) {
            this.cacheKeyPolicies = Objects.requireNonNull(cacheKeyPolicies);
            return this;
        }
        public Builder cacheKeyPolicies(GetBackendServiceCdnPolicyCacheKeyPolicy... cacheKeyPolicies) {
            return cacheKeyPolicies(List.of(cacheKeyPolicies));
        }
        public Builder cacheMode(String cacheMode) {
            this.cacheMode = Objects.requireNonNull(cacheMode);
            return this;
        }
        public Builder clientTtl(Integer clientTtl) {
            this.clientTtl = Objects.requireNonNull(clientTtl);
            return this;
        }
        public Builder defaultTtl(Integer defaultTtl) {
            this.defaultTtl = Objects.requireNonNull(defaultTtl);
            return this;
        }
        public Builder maxTtl(Integer maxTtl) {
            this.maxTtl = Objects.requireNonNull(maxTtl);
            return this;
        }
        public Builder negativeCaching(Boolean negativeCaching) {
            this.negativeCaching = Objects.requireNonNull(negativeCaching);
            return this;
        }
        public Builder negativeCachingPolicies(List<GetBackendServiceCdnPolicyNegativeCachingPolicy> negativeCachingPolicies) {
            this.negativeCachingPolicies = Objects.requireNonNull(negativeCachingPolicies);
            return this;
        }
        public Builder negativeCachingPolicies(GetBackendServiceCdnPolicyNegativeCachingPolicy... negativeCachingPolicies) {
            return negativeCachingPolicies(List.of(negativeCachingPolicies));
        }
        public Builder serveWhileStale(Integer serveWhileStale) {
            this.serveWhileStale = Objects.requireNonNull(serveWhileStale);
            return this;
        }
        public Builder signedUrlCacheMaxAgeSec(Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec);
            return this;
        }        public GetBackendServiceCdnPolicy build() {
            return new GetBackendServiceCdnPolicy(cacheKeyPolicies, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
