// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendServiceCdnPolicyCacheKeyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyCacheKeyPolicyArgs Empty = new BackendServiceCdnPolicyCacheKeyPolicyArgs();

    /**
     * If true requests to different hosts will be cached separately.
     * 
     */
    @Import(name="includeHost")
    private @Nullable Output<Boolean> includeHost;

    /**
     * @return If true requests to different hosts will be cached separately.
     * 
     */
    public Optional<Output<Boolean>> includeHost() {
        return Optional.ofNullable(this.includeHost);
    }

    /**
     * If true, http and https requests will be cached separately.
     * 
     */
    @Import(name="includeProtocol")
    private @Nullable Output<Boolean> includeProtocol;

    /**
     * @return If true, http and https requests will be cached separately.
     * 
     */
    public Optional<Output<Boolean>> includeProtocol() {
        return Optional.ofNullable(this.includeProtocol);
    }

    /**
     * If true, include query string parameters in the cache key
     * according to query_string_whitelist and
     * query_string_blacklist. If neither is set, the entire query
     * string will be included.
     * If false, the query string will be excluded from the cache
     * key entirely.
     * 
     */
    @Import(name="includeQueryString")
    private @Nullable Output<Boolean> includeQueryString;

    /**
     * @return If true, include query string parameters in the cache key
     * according to query_string_whitelist and
     * query_string_blacklist. If neither is set, the entire query
     * string will be included.
     * If false, the query string will be excluded from the cache
     * key entirely.
     * 
     */
    public Optional<Output<Boolean>> includeQueryString() {
        return Optional.ofNullable(this.includeQueryString);
    }

    /**
     * Names of query string parameters to exclude in cache keys.
     * All other parameters will be included. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
     * delimiters.
     * 
     */
    @Import(name="queryStringBlacklists")
    private @Nullable Output<List<String>> queryStringBlacklists;

    /**
     * @return Names of query string parameters to exclude in cache keys.
     * All other parameters will be included. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
     * delimiters.
     * 
     */
    public Optional<Output<List<String>>> queryStringBlacklists() {
        return Optional.ofNullable(this.queryStringBlacklists);
    }

    /**
     * Names of query string parameters to include in cache keys.
     * All other parameters will be excluded. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
     * delimiters.
     * 
     */
    @Import(name="queryStringWhitelists")
    private @Nullable Output<List<String>> queryStringWhitelists;

    /**
     * @return Names of query string parameters to include in cache keys.
     * All other parameters will be excluded. Either specify
     * query_string_whitelist or query_string_blacklist, not both.
     * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
     * delimiters.
     * 
     */
    public Optional<Output<List<String>>> queryStringWhitelists() {
        return Optional.ofNullable(this.queryStringWhitelists);
    }

    private BackendServiceCdnPolicyCacheKeyPolicyArgs() {}

    private BackendServiceCdnPolicyCacheKeyPolicyArgs(BackendServiceCdnPolicyCacheKeyPolicyArgs $) {
        this.includeHost = $.includeHost;
        this.includeProtocol = $.includeProtocol;
        this.includeQueryString = $.includeQueryString;
        this.queryStringBlacklists = $.queryStringBlacklists;
        this.queryStringWhitelists = $.queryStringWhitelists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceCdnPolicyCacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceCdnPolicyCacheKeyPolicyArgs $;

        public Builder() {
            $ = new BackendServiceCdnPolicyCacheKeyPolicyArgs();
        }

        public Builder(BackendServiceCdnPolicyCacheKeyPolicyArgs defaults) {
            $ = new BackendServiceCdnPolicyCacheKeyPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param includeHost If true requests to different hosts will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeHost(@Nullable Output<Boolean> includeHost) {
            $.includeHost = includeHost;
            return this;
        }

        /**
         * @param includeHost If true requests to different hosts will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeHost(Boolean includeHost) {
            return includeHost(Output.of(includeHost));
        }

        /**
         * @param includeProtocol If true, http and https requests will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeProtocol(@Nullable Output<Boolean> includeProtocol) {
            $.includeProtocol = includeProtocol;
            return this;
        }

        /**
         * @param includeProtocol If true, http and https requests will be cached separately.
         * 
         * @return builder
         * 
         */
        public Builder includeProtocol(Boolean includeProtocol) {
            return includeProtocol(Output.of(includeProtocol));
        }

        /**
         * @param includeQueryString If true, include query string parameters in the cache key
         * according to query_string_whitelist and
         * query_string_blacklist. If neither is set, the entire query
         * string will be included.
         * If false, the query string will be excluded from the cache
         * key entirely.
         * 
         * @return builder
         * 
         */
        public Builder includeQueryString(@Nullable Output<Boolean> includeQueryString) {
            $.includeQueryString = includeQueryString;
            return this;
        }

        /**
         * @param includeQueryString If true, include query string parameters in the cache key
         * according to query_string_whitelist and
         * query_string_blacklist. If neither is set, the entire query
         * string will be included.
         * If false, the query string will be excluded from the cache
         * key entirely.
         * 
         * @return builder
         * 
         */
        public Builder includeQueryString(Boolean includeQueryString) {
            return includeQueryString(Output.of(includeQueryString));
        }

        /**
         * @param queryStringBlacklists Names of query string parameters to exclude in cache keys.
         * All other parameters will be included. Either specify
         * query_string_whitelist or query_string_blacklist, not both.
         * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
         * delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringBlacklists(@Nullable Output<List<String>> queryStringBlacklists) {
            $.queryStringBlacklists = queryStringBlacklists;
            return this;
        }

        /**
         * @param queryStringBlacklists Names of query string parameters to exclude in cache keys.
         * All other parameters will be included. Either specify
         * query_string_whitelist or query_string_blacklist, not both.
         * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
         * delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringBlacklists(List<String> queryStringBlacklists) {
            return queryStringBlacklists(Output.of(queryStringBlacklists));
        }

        /**
         * @param queryStringBlacklists Names of query string parameters to exclude in cache keys.
         * All other parameters will be included. Either specify
         * query_string_whitelist or query_string_blacklist, not both.
         * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
         * delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringBlacklists(String... queryStringBlacklists) {
            return queryStringBlacklists(List.of(queryStringBlacklists));
        }

        /**
         * @param queryStringWhitelists Names of query string parameters to include in cache keys.
         * All other parameters will be excluded. Either specify
         * query_string_whitelist or query_string_blacklist, not both.
         * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
         * delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelists(@Nullable Output<List<String>> queryStringWhitelists) {
            $.queryStringWhitelists = queryStringWhitelists;
            return this;
        }

        /**
         * @param queryStringWhitelists Names of query string parameters to include in cache keys.
         * All other parameters will be excluded. Either specify
         * query_string_whitelist or query_string_blacklist, not both.
         * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
         * delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelists(List<String> queryStringWhitelists) {
            return queryStringWhitelists(Output.of(queryStringWhitelists));
        }

        /**
         * @param queryStringWhitelists Names of query string parameters to include in cache keys.
         * All other parameters will be excluded. Either specify
         * query_string_whitelist or query_string_blacklist, not both.
         * &#39;&amp;&#39; and &#39;=&#39; will be percent encoded and not treated as
         * delimiters.
         * 
         * @return builder
         * 
         */
        public Builder queryStringWhitelists(String... queryStringWhitelists) {
            return queryStringWhitelists(List.of(queryStringWhitelists));
        }

        public BackendServiceCdnPolicyCacheKeyPolicyArgs build() {
            return $;
        }
    }

}
