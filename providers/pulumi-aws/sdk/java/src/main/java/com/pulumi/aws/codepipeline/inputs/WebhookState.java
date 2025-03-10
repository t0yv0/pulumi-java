// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.inputs;

import com.pulumi.aws.codepipeline.inputs.WebhookAuthenticationConfigurationArgs;
import com.pulumi.aws.codepipeline.inputs.WebhookFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookState extends com.pulumi.resources.ResourceArgs {

    public static final WebhookState Empty = new WebhookState();

    /**
     * The CodePipeline webhook&#39;s ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The CodePipeline webhook&#39;s ARN.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    @Import(name="authentication")
    private @Nullable Output<String> authentication;

    /**
     * @return The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
     * 
     */
    public Optional<Output<String>> authentication() {
        return Optional.ofNullable(this.authentication);
    }

    /**
     * An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    @Import(name="authenticationConfiguration")
    private @Nullable Output<WebhookAuthenticationConfigurationArgs> authenticationConfiguration;

    /**
     * @return An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
     * 
     */
    public Optional<Output<WebhookAuthenticationConfigurationArgs>> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }

    /**
     * One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<WebhookFilterArgs>> filters;

    /**
     * @return One or more `filter` blocks. Filter blocks are documented below.
     * 
     */
    public Optional<Output<List<WebhookFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the webhook.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the webhook.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    @Import(name="targetAction")
    private @Nullable Output<String> targetAction;

    /**
     * @return The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
     * 
     */
    public Optional<Output<String>> targetAction() {
        return Optional.ofNullable(this.targetAction);
    }

    /**
     * The name of the pipeline.
     * 
     */
    @Import(name="targetPipeline")
    private @Nullable Output<String> targetPipeline;

    /**
     * @return The name of the pipeline.
     * 
     */
    public Optional<Output<String>> targetPipeline() {
        return Optional.ofNullable(this.targetPipeline);
    }

    /**
     * The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    /**
     * @return The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
     * 
     */
    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private WebhookState() {}

    private WebhookState(WebhookState $) {
        this.arn = $.arn;
        this.authentication = $.authentication;
        this.authenticationConfiguration = $.authenticationConfiguration;
        this.filters = $.filters;
        this.name = $.name;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.targetAction = $.targetAction;
        this.targetPipeline = $.targetPipeline;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookState $;

        public Builder() {
            $ = new WebhookState();
        }

        public Builder(WebhookState defaults) {
            $ = new WebhookState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The CodePipeline webhook&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The CodePipeline webhook&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param authentication The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
         * 
         * @return builder
         * 
         */
        public Builder authentication(@Nullable Output<String> authentication) {
            $.authentication = authentication;
            return this;
        }

        /**
         * @param authentication The type of authentication  to use. One of `IP`, `GITHUB_HMAC`, or `UNAUTHENTICATED`.
         * 
         * @return builder
         * 
         */
        public Builder authentication(String authentication) {
            return authentication(Output.of(authentication));
        }

        /**
         * @param authenticationConfiguration An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder authenticationConfiguration(@Nullable Output<WebhookAuthenticationConfigurationArgs> authenticationConfiguration) {
            $.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        /**
         * @param authenticationConfiguration An `auth` block. Required for `IP` and `GITHUB_HMAC`. Auth blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder authenticationConfiguration(WebhookAuthenticationConfigurationArgs authenticationConfiguration) {
            return authenticationConfiguration(Output.of(authenticationConfiguration));
        }

        /**
         * @param filters One or more `filter` blocks. Filter blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<WebhookFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more `filter` blocks. Filter blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<WebhookFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters One or more `filter` blocks. Filter blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(WebhookFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name The name of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the webhook.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param targetAction The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder targetAction(@Nullable Output<String> targetAction) {
            $.targetAction = targetAction;
            return this;
        }

        /**
         * @param targetAction The name of the action in a pipeline you want to connect to the webhook. The action must be from the source (first) stage of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder targetAction(String targetAction) {
            return targetAction(Output.of(targetAction));
        }

        /**
         * @param targetPipeline The name of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder targetPipeline(@Nullable Output<String> targetPipeline) {
            $.targetPipeline = targetPipeline;
            return this;
        }

        /**
         * @param targetPipeline The name of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder targetPipeline(String targetPipeline) {
            return targetPipeline(Output.of(targetPipeline));
        }

        /**
         * @param url The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
         * 
         * @return builder
         * 
         */
        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The CodePipeline webhook&#39;s URL. POST events to this endpoint to trigger the target.
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        public WebhookState build() {
            return $;
        }
    }

}
