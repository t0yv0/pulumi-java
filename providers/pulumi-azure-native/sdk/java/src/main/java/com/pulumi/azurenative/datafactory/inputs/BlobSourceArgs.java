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
 * A copy activity Azure Blob source.
 * 
 */
public final class BlobSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobSourceArgs Empty = new BlobSourceArgs();

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
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="recursive")
    private @Nullable Output<Object> recursive;

    /**
     * @return If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * Number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="skipHeaderLineCount")
    private @Nullable Output<Object> skipHeaderLineCount;

    /**
     * @return Number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> skipHeaderLineCount() {
        return Optional.ofNullable(this.skipHeaderLineCount);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Treat empty as null. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="treatEmptyAsNull")
    private @Nullable Output<Object> treatEmptyAsNull;

    /**
     * @return Treat empty as null. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> treatEmptyAsNull() {
        return Optional.ofNullable(this.treatEmptyAsNull);
    }

    /**
     * Copy source type.
     * Expected value is &#39;BlobSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;BlobSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private BlobSourceArgs() {}

    private BlobSourceArgs(BlobSourceArgs $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.recursive = $.recursive;
        this.skipHeaderLineCount = $.skipHeaderLineCount;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.treatEmptyAsNull = $.treatEmptyAsNull;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobSourceArgs $;

        public Builder() {
            $ = new BlobSourceArgs();
        }

        public Builder(BlobSourceArgs defaults) {
            $ = new BlobSourceArgs(Objects.requireNonNull(defaults));
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
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param recursive If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Output<Object> recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param recursive If true, files under the folder path will be read recursively. Default is true. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder recursive(Object recursive) {
            return recursive(Output.of(recursive));
        }

        /**
         * @param skipHeaderLineCount Number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipHeaderLineCount(@Nullable Output<Object> skipHeaderLineCount) {
            $.skipHeaderLineCount = skipHeaderLineCount;
            return this;
        }

        /**
         * @param skipHeaderLineCount Number of header lines to skip from each blob. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder skipHeaderLineCount(Object skipHeaderLineCount) {
            return skipHeaderLineCount(Output.of(skipHeaderLineCount));
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        /**
         * @param treatEmptyAsNull Treat empty as null. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder treatEmptyAsNull(@Nullable Output<Object> treatEmptyAsNull) {
            $.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }

        /**
         * @param treatEmptyAsNull Treat empty as null. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder treatEmptyAsNull(Object treatEmptyAsNull) {
            return treatEmptyAsNull(Output.of(treatEmptyAsNull));
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;BlobSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;BlobSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BlobSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
