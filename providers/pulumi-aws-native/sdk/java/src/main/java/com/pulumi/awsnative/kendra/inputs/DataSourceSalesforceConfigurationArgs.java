// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceChatterFeedConfigurationArgs;
import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceKnowledgeArticleConfigurationArgs;
import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardObjectAttachmentConfigurationArgs;
import com.pulumi.awsnative.kendra.inputs.DataSourceSalesforceStandardObjectConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceSalesforceConfigurationArgs Empty = new DataSourceSalesforceConfigurationArgs();

    @Import(name="chatterFeedConfiguration")
    private @Nullable Output<DataSourceSalesforceChatterFeedConfigurationArgs> chatterFeedConfiguration;

    public Optional<Output<DataSourceSalesforceChatterFeedConfigurationArgs>> chatterFeedConfiguration() {
        return Optional.ofNullable(this.chatterFeedConfiguration);
    }

    @Import(name="crawlAttachments")
    private @Nullable Output<Boolean> crawlAttachments;

    public Optional<Output<Boolean>> crawlAttachments() {
        return Optional.ofNullable(this.crawlAttachments);
    }

    @Import(name="excludeAttachmentFilePatterns")
    private @Nullable Output<List<String>> excludeAttachmentFilePatterns;

    public Optional<Output<List<String>>> excludeAttachmentFilePatterns() {
        return Optional.ofNullable(this.excludeAttachmentFilePatterns);
    }

    @Import(name="includeAttachmentFilePatterns")
    private @Nullable Output<List<String>> includeAttachmentFilePatterns;

    public Optional<Output<List<String>>> includeAttachmentFilePatterns() {
        return Optional.ofNullable(this.includeAttachmentFilePatterns);
    }

    @Import(name="knowledgeArticleConfiguration")
    private @Nullable Output<DataSourceSalesforceKnowledgeArticleConfigurationArgs> knowledgeArticleConfiguration;

    public Optional<Output<DataSourceSalesforceKnowledgeArticleConfigurationArgs>> knowledgeArticleConfiguration() {
        return Optional.ofNullable(this.knowledgeArticleConfiguration);
    }

    @Import(name="secretArn", required=true)
    private Output<String> secretArn;

    public Output<String> secretArn() {
        return this.secretArn;
    }

    @Import(name="serverUrl", required=true)
    private Output<String> serverUrl;

    public Output<String> serverUrl() {
        return this.serverUrl;
    }

    @Import(name="standardObjectAttachmentConfiguration")
    private @Nullable Output<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> standardObjectAttachmentConfiguration;

    public Optional<Output<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs>> standardObjectAttachmentConfiguration() {
        return Optional.ofNullable(this.standardObjectAttachmentConfiguration);
    }

    @Import(name="standardObjectConfigurations")
    private @Nullable Output<List<DataSourceSalesforceStandardObjectConfigurationArgs>> standardObjectConfigurations;

    public Optional<Output<List<DataSourceSalesforceStandardObjectConfigurationArgs>>> standardObjectConfigurations() {
        return Optional.ofNullable(this.standardObjectConfigurations);
    }

    private DataSourceSalesforceConfigurationArgs() {}

    private DataSourceSalesforceConfigurationArgs(DataSourceSalesforceConfigurationArgs $) {
        this.chatterFeedConfiguration = $.chatterFeedConfiguration;
        this.crawlAttachments = $.crawlAttachments;
        this.excludeAttachmentFilePatterns = $.excludeAttachmentFilePatterns;
        this.includeAttachmentFilePatterns = $.includeAttachmentFilePatterns;
        this.knowledgeArticleConfiguration = $.knowledgeArticleConfiguration;
        this.secretArn = $.secretArn;
        this.serverUrl = $.serverUrl;
        this.standardObjectAttachmentConfiguration = $.standardObjectAttachmentConfiguration;
        this.standardObjectConfigurations = $.standardObjectConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSalesforceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSalesforceConfigurationArgs $;

        public Builder() {
            $ = new DataSourceSalesforceConfigurationArgs();
        }

        public Builder(DataSourceSalesforceConfigurationArgs defaults) {
            $ = new DataSourceSalesforceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder chatterFeedConfiguration(@Nullable Output<DataSourceSalesforceChatterFeedConfigurationArgs> chatterFeedConfiguration) {
            $.chatterFeedConfiguration = chatterFeedConfiguration;
            return this;
        }

        public Builder chatterFeedConfiguration(DataSourceSalesforceChatterFeedConfigurationArgs chatterFeedConfiguration) {
            return chatterFeedConfiguration(Output.of(chatterFeedConfiguration));
        }

        public Builder crawlAttachments(@Nullable Output<Boolean> crawlAttachments) {
            $.crawlAttachments = crawlAttachments;
            return this;
        }

        public Builder crawlAttachments(Boolean crawlAttachments) {
            return crawlAttachments(Output.of(crawlAttachments));
        }

        public Builder excludeAttachmentFilePatterns(@Nullable Output<List<String>> excludeAttachmentFilePatterns) {
            $.excludeAttachmentFilePatterns = excludeAttachmentFilePatterns;
            return this;
        }

        public Builder excludeAttachmentFilePatterns(List<String> excludeAttachmentFilePatterns) {
            return excludeAttachmentFilePatterns(Output.of(excludeAttachmentFilePatterns));
        }

        public Builder excludeAttachmentFilePatterns(String... excludeAttachmentFilePatterns) {
            return excludeAttachmentFilePatterns(List.of(excludeAttachmentFilePatterns));
        }

        public Builder includeAttachmentFilePatterns(@Nullable Output<List<String>> includeAttachmentFilePatterns) {
            $.includeAttachmentFilePatterns = includeAttachmentFilePatterns;
            return this;
        }

        public Builder includeAttachmentFilePatterns(List<String> includeAttachmentFilePatterns) {
            return includeAttachmentFilePatterns(Output.of(includeAttachmentFilePatterns));
        }

        public Builder includeAttachmentFilePatterns(String... includeAttachmentFilePatterns) {
            return includeAttachmentFilePatterns(List.of(includeAttachmentFilePatterns));
        }

        public Builder knowledgeArticleConfiguration(@Nullable Output<DataSourceSalesforceKnowledgeArticleConfigurationArgs> knowledgeArticleConfiguration) {
            $.knowledgeArticleConfiguration = knowledgeArticleConfiguration;
            return this;
        }

        public Builder knowledgeArticleConfiguration(DataSourceSalesforceKnowledgeArticleConfigurationArgs knowledgeArticleConfiguration) {
            return knowledgeArticleConfiguration(Output.of(knowledgeArticleConfiguration));
        }

        public Builder secretArn(Output<String> secretArn) {
            $.secretArn = secretArn;
            return this;
        }

        public Builder secretArn(String secretArn) {
            return secretArn(Output.of(secretArn));
        }

        public Builder serverUrl(Output<String> serverUrl) {
            $.serverUrl = serverUrl;
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            return serverUrl(Output.of(serverUrl));
        }

        public Builder standardObjectAttachmentConfiguration(@Nullable Output<DataSourceSalesforceStandardObjectAttachmentConfigurationArgs> standardObjectAttachmentConfiguration) {
            $.standardObjectAttachmentConfiguration = standardObjectAttachmentConfiguration;
            return this;
        }

        public Builder standardObjectAttachmentConfiguration(DataSourceSalesforceStandardObjectAttachmentConfigurationArgs standardObjectAttachmentConfiguration) {
            return standardObjectAttachmentConfiguration(Output.of(standardObjectAttachmentConfiguration));
        }

        public Builder standardObjectConfigurations(@Nullable Output<List<DataSourceSalesforceStandardObjectConfigurationArgs>> standardObjectConfigurations) {
            $.standardObjectConfigurations = standardObjectConfigurations;
            return this;
        }

        public Builder standardObjectConfigurations(List<DataSourceSalesforceStandardObjectConfigurationArgs> standardObjectConfigurations) {
            return standardObjectConfigurations(Output.of(standardObjectConfigurations));
        }

        public Builder standardObjectConfigurations(DataSourceSalesforceStandardObjectConfigurationArgs... standardObjectConfigurations) {
            return standardObjectConfigurations(List.of(standardObjectConfigurations));
        }

        public DataSourceSalesforceConfigurationArgs build() {
            $.secretArn = Objects.requireNonNull($.secretArn, "expected parameter 'secretArn' to be non-null");
            $.serverUrl = Objects.requireNonNull($.serverUrl, "expected parameter 'serverUrl' to be non-null");
            return $;
        }
    }

}
