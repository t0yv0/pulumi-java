// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceWebCrawlerBasicAuthenticationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWebCrawlerAuthenticationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceWebCrawlerAuthenticationConfigurationArgs Empty = new DataSourceWebCrawlerAuthenticationConfigurationArgs();

    @Import(name="basicAuthentication")
    private @Nullable Output<List<DataSourceWebCrawlerBasicAuthenticationArgs>> basicAuthentication;

    public Optional<Output<List<DataSourceWebCrawlerBasicAuthenticationArgs>>> basicAuthentication() {
        return Optional.ofNullable(this.basicAuthentication);
    }

    private DataSourceWebCrawlerAuthenticationConfigurationArgs() {}

    private DataSourceWebCrawlerAuthenticationConfigurationArgs(DataSourceWebCrawlerAuthenticationConfigurationArgs $) {
        this.basicAuthentication = $.basicAuthentication;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceWebCrawlerAuthenticationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceWebCrawlerAuthenticationConfigurationArgs $;

        public Builder() {
            $ = new DataSourceWebCrawlerAuthenticationConfigurationArgs();
        }

        public Builder(DataSourceWebCrawlerAuthenticationConfigurationArgs defaults) {
            $ = new DataSourceWebCrawlerAuthenticationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuthentication(@Nullable Output<List<DataSourceWebCrawlerBasicAuthenticationArgs>> basicAuthentication) {
            $.basicAuthentication = basicAuthentication;
            return this;
        }

        public Builder basicAuthentication(List<DataSourceWebCrawlerBasicAuthenticationArgs> basicAuthentication) {
            return basicAuthentication(Output.of(basicAuthentication));
        }

        public Builder basicAuthentication(DataSourceWebCrawlerBasicAuthenticationArgs... basicAuthentication) {
            return basicAuthentication(List.of(basicAuthentication));
        }

        public DataSourceWebCrawlerAuthenticationConfigurationArgs build() {
            return $;
        }
    }

}
