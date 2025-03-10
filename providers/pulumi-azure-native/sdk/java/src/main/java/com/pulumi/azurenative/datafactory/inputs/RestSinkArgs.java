// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Rest service Sink.
 * 
 */
public final class RestSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestSinkArgs Empty = new RestSinkArgs();

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
    private @Nullable Output<Object> additionalHeaders;

    /**
     * @return The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     * 
     */
    @Import(name="httpCompressionType")
    private @Nullable Output<Object> httpCompressionType;

    /**
     * @return Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
     * 
     */
    public Optional<Output<Object>> httpCompressionType() {
        return Optional.ofNullable(this.httpCompressionType);
    }

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="httpRequestTimeout")
    private @Nullable Output<Object> httpRequestTimeout;

    /**
     * @return The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> httpRequestTimeout() {
        return Optional.ofNullable(this.httpRequestTimeout);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The time to await before sending next request, in milliseconds
     * 
     */
    @Import(name="requestInterval")
    private @Nullable Output<Object> requestInterval;

    /**
     * @return The time to await before sending next request, in milliseconds
     * 
     */
    public Optional<Output<Object>> requestInterval() {
        return Optional.ofNullable(this.requestInterval);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Output<Object> requestMethod;

    /**
     * @return The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Output<Object> sinkRetryCount;

    /**
     * @return Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Output<Object> sinkRetryWait;

    /**
     * @return Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;RestSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy sink type.
     * Expected value is &#39;RestSink&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Output<Object> writeBatchSize;

    /**
     * @return Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    public Optional<Output<Object>> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Output<Object> writeBatchTimeout;

    /**
     * @return Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    private RestSinkArgs() {}

    private RestSinkArgs(RestSinkArgs $) {
        this.additionalHeaders = $.additionalHeaders;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.httpCompressionType = $.httpCompressionType;
        this.httpRequestTimeout = $.httpRequestTimeout;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.requestInterval = $.requestInterval;
        this.requestMethod = $.requestMethod;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.type = $.type;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestSinkArgs $;

        public Builder() {
            $ = new RestSinkArgs();
        }

        public Builder(RestSinkArgs defaults) {
            $ = new RestSinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalHeaders The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder additionalHeaders(@Nullable Output<Object> additionalHeaders) {
            $.additionalHeaders = additionalHeaders;
            return this;
        }

        /**
         * @param additionalHeaders The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder additionalHeaders(Object additionalHeaders) {
            return additionalHeaders(Output.of(additionalHeaders));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param httpCompressionType Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
         * 
         * @return builder
         * 
         */
        public Builder httpCompressionType(@Nullable Output<Object> httpCompressionType) {
            $.httpCompressionType = httpCompressionType;
            return this;
        }

        /**
         * @param httpCompressionType Http Compression Type to Send data in compressed format with Optimal Compression Level, Default is None. And The Only Supported option is Gzip.
         * 
         * @return builder
         * 
         */
        public Builder httpCompressionType(Object httpCompressionType) {
            return httpCompressionType(Output.of(httpCompressionType));
        }

        /**
         * @param httpRequestTimeout The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder httpRequestTimeout(@Nullable Output<Object> httpRequestTimeout) {
            $.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        /**
         * @param httpRequestTimeout The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder httpRequestTimeout(Object httpRequestTimeout) {
            return httpRequestTimeout(Output.of(httpRequestTimeout));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param requestInterval The time to await before sending next request, in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder requestInterval(@Nullable Output<Object> requestInterval) {
            $.requestInterval = requestInterval;
            return this;
        }

        /**
         * @param requestInterval The time to await before sending next request, in milliseconds
         * 
         * @return builder
         * 
         */
        public Builder requestInterval(Object requestInterval) {
            return requestInterval(Output.of(requestInterval));
        }

        /**
         * @param requestMethod The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(@Nullable Output<Object> requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        /**
         * @param requestMethod The HTTP method used to call the RESTful API. The default is POST. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(Object requestMethod) {
            return requestMethod(Output.of(requestMethod));
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        /**
         * @param sinkRetryCount Sink retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryCount(Object sinkRetryCount) {
            return sinkRetryCount(Output.of(sinkRetryCount));
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        /**
         * @param sinkRetryWait Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sinkRetryWait(Object sinkRetryWait) {
            return sinkRetryWait(Output.of(sinkRetryWait));
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;RestSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy sink type.
         * Expected value is &#39;RestSink&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        /**
         * @param writeBatchSize Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
         * 
         * @return builder
         * 
         */
        public Builder writeBatchSize(Object writeBatchSize) {
            return writeBatchSize(Output.of(writeBatchSize));
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        /**
         * @param writeBatchTimeout Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder writeBatchTimeout(Object writeBatchTimeout) {
            return writeBatchTimeout(Output.of(writeBatchTimeout));
        }

        public RestSinkArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
