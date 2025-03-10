// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBotVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotVersionArgs Empty = new GetBotVersionArgs();

    @Import(name="botId", required=true)
    private String botId;

    public String botId() {
        return this.botId;
    }

    @Import(name="botVersion", required=true)
    private String botVersion;

    public String botVersion() {
        return this.botVersion;
    }

    private GetBotVersionArgs() {}

    private GetBotVersionArgs(GetBotVersionArgs $) {
        this.botId = $.botId;
        this.botVersion = $.botVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotVersionArgs $;

        public Builder() {
            $ = new GetBotVersionArgs();
        }

        public Builder(GetBotVersionArgs defaults) {
            $ = new GetBotVersionArgs(Objects.requireNonNull(defaults));
        }

        public Builder botId(String botId) {
            $.botId = botId;
            return this;
        }

        public Builder botVersion(String botVersion) {
            $.botVersion = botVersion;
            return this;
        }

        public GetBotVersionArgs build() {
            $.botId = Objects.requireNonNull($.botId, "expected parameter 'botId' to be non-null");
            $.botVersion = Objects.requireNonNull($.botVersion, "expected parameter 'botVersion' to be non-null");
            return $;
        }
    }

}
