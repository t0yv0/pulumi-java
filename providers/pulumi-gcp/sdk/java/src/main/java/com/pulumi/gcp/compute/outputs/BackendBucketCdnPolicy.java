// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.BackendBucketCdnPolicyNegativeCachingPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendBucketCdnPolicy {
    /**
     * @return Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    private final @Nullable String cacheMode;
    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    private final @Nullable Integer clientTtl;
    /**
     * @return Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    private final @Nullable Integer defaultTtl;
    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    private final @Nullable Integer maxTtl;
    /**
     * @return Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    private final @Nullable Boolean negativeCaching;
    /**
     * @return Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<BackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
    /**
     * @return Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    private final @Nullable Integer serveWhileStale;
    /**
     * @return Maximum number of seconds the response to a signed URL request will
     * be considered fresh. After this time period,
     * the response will be revalidated before being served.
     * When serving responses to signed URL requests,
     * Cloud CDN will internally behave as though
     * all responses from this backend had a &#34;Cache-Control: public,
     * max-age=[TTL]&#34; header, regardless of any existing Cache-Control
     * header. The actual headers served in responses will not be altered.
     * 
     */
    private final @Nullable Integer signedUrlCacheMaxAgeSec;

    @CustomType.Constructor
    private BackendBucketCdnPolicy(
        @CustomType.Parameter("cacheMode") @Nullable String cacheMode,
        @CustomType.Parameter("clientTtl") @Nullable Integer clientTtl,
        @CustomType.Parameter("defaultTtl") @Nullable Integer defaultTtl,
        @CustomType.Parameter("maxTtl") @Nullable Integer maxTtl,
        @CustomType.Parameter("negativeCaching") @Nullable Boolean negativeCaching,
        @CustomType.Parameter("negativeCachingPolicies") @Nullable List<BackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies,
        @CustomType.Parameter("serveWhileStale") @Nullable Integer serveWhileStale,
        @CustomType.Parameter("signedUrlCacheMaxAgeSec") @Nullable Integer signedUrlCacheMaxAgeSec) {
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicies = negativeCachingPolicies;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    /**
     * @return Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    public Optional<String> cacheMode() {
        return Optional.ofNullable(this.cacheMode);
    }
    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    public Optional<Integer> clientTtl() {
        return Optional.ofNullable(this.clientTtl);
    }
    /**
     * @return Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    public Optional<Integer> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    public Optional<Integer> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }
    /**
     * @return Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    public Optional<Boolean> negativeCaching() {
        return Optional.ofNullable(this.negativeCaching);
    }
    /**
     * @return Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN&#39;s default cache TTLs.
     * Structure is documented below.
     * 
     */
    public List<BackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies() {
        return this.negativeCachingPolicies == null ? List.of() : this.negativeCachingPolicies;
    }
    /**
     * @return Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    public Optional<Integer> serveWhileStale() {
        return Optional.ofNullable(this.serveWhileStale);
    }
    /**
     * @return Maximum number of seconds the response to a signed URL request will
     * be considered fresh. After this time period,
     * the response will be revalidated before being served.
     * When serving responses to signed URL requests,
     * Cloud CDN will internally behave as though
     * all responses from this backend had a &#34;Cache-Control: public,
     * max-age=[TTL]&#34; header, regardless of any existing Cache-Control
     * header. The actual headers served in responses will not be altered.
     * 
     */
    public Optional<Integer> signedUrlCacheMaxAgeSec() {
        return Optional.ofNullable(this.signedUrlCacheMaxAgeSec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cacheMode;
        private @Nullable Integer clientTtl;
        private @Nullable Integer defaultTtl;
        private @Nullable Integer maxTtl;
        private @Nullable Boolean negativeCaching;
        private @Nullable List<BackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies;
        private @Nullable Integer serveWhileStale;
        private @Nullable Integer signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder cacheMode(@Nullable String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public Builder clientTtl(@Nullable Integer clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }
        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }
        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }
        public Builder negativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }
        public Builder negativeCachingPolicies(@Nullable List<BackendBucketCdnPolicyNegativeCachingPolicy> negativeCachingPolicies) {
            this.negativeCachingPolicies = negativeCachingPolicies;
            return this;
        }
        public Builder negativeCachingPolicies(BackendBucketCdnPolicyNegativeCachingPolicy... negativeCachingPolicies) {
            return negativeCachingPolicies(List.of(negativeCachingPolicies));
        }
        public Builder serveWhileStale(@Nullable Integer serveWhileStale) {
            this.serveWhileStale = serveWhileStale;
            return this;
        }
        public Builder signedUrlCacheMaxAgeSec(@Nullable Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }        public BackendBucketCdnPolicy build() {
            return new BackendBucketCdnPolicy(cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
