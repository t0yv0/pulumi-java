// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.enums.IndexDocumentAttributeValueType;
import com.pulumi.awsnative.kendra.inputs.IndexRelevanceArgs;
import com.pulumi.awsnative.kendra.inputs.IndexSearchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexDocumentMetadataConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexDocumentMetadataConfigurationArgs Empty = new IndexDocumentMetadataConfigurationArgs();

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="relevance")
    private @Nullable Output<IndexRelevanceArgs> relevance;

    public Optional<Output<IndexRelevanceArgs>> relevance() {
        return Optional.ofNullable(this.relevance);
    }

    @Import(name="search")
    private @Nullable Output<IndexSearchArgs> search;

    public Optional<Output<IndexSearchArgs>> search() {
        return Optional.ofNullable(this.search);
    }

    @Import(name="type", required=true)
    private Output<IndexDocumentAttributeValueType> type;

    public Output<IndexDocumentAttributeValueType> type() {
        return this.type;
    }

    private IndexDocumentMetadataConfigurationArgs() {}

    private IndexDocumentMetadataConfigurationArgs(IndexDocumentMetadataConfigurationArgs $) {
        this.name = $.name;
        this.relevance = $.relevance;
        this.search = $.search;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexDocumentMetadataConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexDocumentMetadataConfigurationArgs $;

        public Builder() {
            $ = new IndexDocumentMetadataConfigurationArgs();
        }

        public Builder(IndexDocumentMetadataConfigurationArgs defaults) {
            $ = new IndexDocumentMetadataConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder relevance(@Nullable Output<IndexRelevanceArgs> relevance) {
            $.relevance = relevance;
            return this;
        }

        public Builder relevance(IndexRelevanceArgs relevance) {
            return relevance(Output.of(relevance));
        }

        public Builder search(@Nullable Output<IndexSearchArgs> search) {
            $.search = search;
            return this;
        }

        public Builder search(IndexSearchArgs search) {
            return search(Output.of(search));
        }

        public Builder type(Output<IndexDocumentAttributeValueType> type) {
            $.type = type;
            return this;
        }

        public Builder type(IndexDocumentAttributeValueType type) {
            return type(Output.of(type));
        }

        public IndexDocumentMetadataConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
