// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashHttpCookieTtlArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionBackendServiceConsistentHashHttpCookieArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceConsistentHashHttpCookieArgs Empty = new RegionBackendServiceConsistentHashHttpCookieArgs();

    /**
     * Name of the cookie.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the cookie.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Path to set for the cookie.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to set for the cookie.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<RegionBackendServiceConsistentHashHttpCookieTtlArgs> ttl;

    /**
     * @return The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    public Optional<Output<RegionBackendServiceConsistentHashHttpCookieTtlArgs>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    private RegionBackendServiceConsistentHashHttpCookieArgs() {}

    private RegionBackendServiceConsistentHashHttpCookieArgs(RegionBackendServiceConsistentHashHttpCookieArgs $) {
        this.name = $.name;
        this.path = $.path;
        this.ttl = $.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionBackendServiceConsistentHashHttpCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionBackendServiceConsistentHashHttpCookieArgs $;

        public Builder() {
            $ = new RegionBackendServiceConsistentHashHttpCookieArgs();
        }

        public Builder(RegionBackendServiceConsistentHashHttpCookieArgs defaults) {
            $ = new RegionBackendServiceConsistentHashHttpCookieArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the cookie.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the cookie.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to set for the cookie.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to set for the cookie.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param ttl The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
         * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<RegionBackendServiceConsistentHashHttpCookieTtlArgs> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
         * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
         * 
         * @return builder
         * 
         */
        public Builder ttl(RegionBackendServiceConsistentHashHttpCookieTtlArgs ttl) {
            return ttl(Output.of(ttl));
        }

        public RegionBackendServiceConsistentHashHttpCookieArgs build() {
            return $;
        }
    }

}
