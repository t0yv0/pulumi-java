// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionCookiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionForwardedValuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionForwardedValuesArgs Empty = new DistributionForwardedValuesArgs();

    @Import(name="cookies")
    private @Nullable Output<DistributionCookiesArgs> cookies;

    public Optional<Output<DistributionCookiesArgs>> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    @Import(name="queryString", required=true)
    private Output<Boolean> queryString;

    public Output<Boolean> queryString() {
        return this.queryString;
    }

    @Import(name="queryStringCacheKeys")
    private @Nullable Output<List<String>> queryStringCacheKeys;

    public Optional<Output<List<String>>> queryStringCacheKeys() {
        return Optional.ofNullable(this.queryStringCacheKeys);
    }

    private DistributionForwardedValuesArgs() {}

    private DistributionForwardedValuesArgs(DistributionForwardedValuesArgs $) {
        this.cookies = $.cookies;
        this.headers = $.headers;
        this.queryString = $.queryString;
        this.queryStringCacheKeys = $.queryStringCacheKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionForwardedValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionForwardedValuesArgs $;

        public Builder() {
            $ = new DistributionForwardedValuesArgs();
        }

        public Builder(DistributionForwardedValuesArgs defaults) {
            $ = new DistributionForwardedValuesArgs(Objects.requireNonNull(defaults));
        }

        public Builder cookies(@Nullable Output<DistributionCookiesArgs> cookies) {
            $.cookies = cookies;
            return this;
        }

        public Builder cookies(DistributionCookiesArgs cookies) {
            return cookies(Output.of(cookies));
        }

        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public Builder queryString(Output<Boolean> queryString) {
            $.queryString = queryString;
            return this;
        }

        public Builder queryString(Boolean queryString) {
            return queryString(Output.of(queryString));
        }

        public Builder queryStringCacheKeys(@Nullable Output<List<String>> queryStringCacheKeys) {
            $.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }

        public Builder queryStringCacheKeys(List<String> queryStringCacheKeys) {
            return queryStringCacheKeys(Output.of(queryStringCacheKeys));
        }

        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }

        public DistributionForwardedValuesArgs build() {
            $.queryString = Objects.requireNonNull($.queryString, "expected parameter 'queryString' to be non-null");
            return $;
        }
    }

}
