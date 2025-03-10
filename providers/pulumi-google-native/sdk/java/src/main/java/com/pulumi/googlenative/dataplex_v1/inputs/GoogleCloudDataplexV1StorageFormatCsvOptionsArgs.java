// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes CSV and similar semi-structured data formats.
 * 
 */
public final class GoogleCloudDataplexV1StorageFormatCsvOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1StorageFormatCsvOptionsArgs Empty = new GoogleCloudDataplexV1StorageFormatCsvOptionsArgs();

    /**
     * Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
     * 
     */
    @Import(name="delimiter")
    private @Nullable Output<String> delimiter;

    /**
     * @return Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
     * 
     */
    public Optional<Output<String>> delimiter() {
        return Optional.ofNullable(this.delimiter);
    }

    /**
     * Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
     * 
     */
    @Import(name="encoding")
    private @Nullable Output<String> encoding;

    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
     * 
     */
    public Optional<Output<String>> encoding() {
        return Optional.ofNullable(this.encoding);
    }

    /**
     * Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
     * 
     */
    @Import(name="headerRows")
    private @Nullable Output<Integer> headerRows;

    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
     * 
     */
    public Optional<Output<Integer>> headerRows() {
        return Optional.ofNullable(this.headerRows);
    }

    /**
     * Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
     * 
     */
    @Import(name="quote")
    private @Nullable Output<String> quote;

    /**
     * @return Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
     * 
     */
    public Optional<Output<String>> quote() {
        return Optional.ofNullable(this.quote);
    }

    private GoogleCloudDataplexV1StorageFormatCsvOptionsArgs() {}

    private GoogleCloudDataplexV1StorageFormatCsvOptionsArgs(GoogleCloudDataplexV1StorageFormatCsvOptionsArgs $) {
        this.delimiter = $.delimiter;
        this.encoding = $.encoding;
        this.headerRows = $.headerRows;
        this.quote = $.quote;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1StorageFormatCsvOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1StorageFormatCsvOptionsArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1StorageFormatCsvOptionsArgs();
        }

        public Builder(GoogleCloudDataplexV1StorageFormatCsvOptionsArgs defaults) {
            $ = new GoogleCloudDataplexV1StorageFormatCsvOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delimiter Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(@Nullable Output<String> delimiter) {
            $.delimiter = delimiter;
            return this;
        }

        /**
         * @param delimiter Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
         * 
         * @return builder
         * 
         */
        public Builder delimiter(String delimiter) {
            return delimiter(Output.of(delimiter));
        }

        /**
         * @param encoding Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder encoding(@Nullable Output<String> encoding) {
            $.encoding = encoding;
            return this;
        }

        /**
         * @param encoding Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder encoding(String encoding) {
            return encoding(Output.of(encoding));
        }

        /**
         * @param headerRows Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder headerRows(@Nullable Output<Integer> headerRows) {
            $.headerRows = headerRows;
            return this;
        }

        /**
         * @param headerRows Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
         * 
         * @return builder
         * 
         */
        public Builder headerRows(Integer headerRows) {
            return headerRows(Output.of(headerRows));
        }

        /**
         * @param quote Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder quote(@Nullable Output<String> quote) {
            $.quote = quote;
            return this;
        }

        /**
         * @param quote Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
         * 
         * @return builder
         * 
         */
        public Builder quote(String quote) {
            return quote(Output.of(quote));
        }

        public GoogleCloudDataplexV1StorageFormatCsvOptionsArgs build() {
            return $;
        }
    }

}
