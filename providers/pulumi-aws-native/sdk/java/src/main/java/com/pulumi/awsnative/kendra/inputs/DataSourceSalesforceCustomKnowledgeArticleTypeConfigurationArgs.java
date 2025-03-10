// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs Empty = new DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs();

    @Import(name="documentDataFieldName", required=true)
    private Output<String> documentDataFieldName;

    public Output<String> documentDataFieldName() {
        return this.documentDataFieldName;
    }

    @Import(name="documentTitleFieldName")
    private @Nullable Output<String> documentTitleFieldName;

    public Optional<Output<String>> documentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }

    @Import(name="fieldMappings")
    private @Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Optional<Output<List<DataSourceToIndexFieldMappingArgs>>> fieldMappings() {
        return Optional.ofNullable(this.fieldMappings);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs() {}

    private DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs(DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs $) {
        this.documentDataFieldName = $.documentDataFieldName;
        this.documentTitleFieldName = $.documentTitleFieldName;
        this.fieldMappings = $.fieldMappings;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs $;

        public Builder() {
            $ = new DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs();
        }

        public Builder(DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs defaults) {
            $ = new DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder documentDataFieldName(Output<String> documentDataFieldName) {
            $.documentDataFieldName = documentDataFieldName;
            return this;
        }

        public Builder documentDataFieldName(String documentDataFieldName) {
            return documentDataFieldName(Output.of(documentDataFieldName));
        }

        public Builder documentTitleFieldName(@Nullable Output<String> documentTitleFieldName) {
            $.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder documentTitleFieldName(String documentTitleFieldName) {
            return documentTitleFieldName(Output.of(documentTitleFieldName));
        }

        public Builder fieldMappings(@Nullable Output<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
            $.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(List<DataSourceToIndexFieldMappingArgs> fieldMappings) {
            return fieldMappings(Output.of(fieldMappings));
        }

        public Builder fieldMappings(DataSourceToIndexFieldMappingArgs... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs build() {
            $.documentDataFieldName = Objects.requireNonNull($.documentDataFieldName, "expected parameter 'documentDataFieldName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
