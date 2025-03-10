// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotVersionLocaleDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BotVersionLocaleSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotVersionLocaleSpecificationArgs Empty = new BotVersionLocaleSpecificationArgs();

    @Import(name="botVersionLocaleDetails", required=true)
    private Output<BotVersionLocaleDetailsArgs> botVersionLocaleDetails;

    public Output<BotVersionLocaleDetailsArgs> botVersionLocaleDetails() {
        return this.botVersionLocaleDetails;
    }

    @Import(name="localeId", required=true)
    private Output<String> localeId;

    public Output<String> localeId() {
        return this.localeId;
    }

    private BotVersionLocaleSpecificationArgs() {}

    private BotVersionLocaleSpecificationArgs(BotVersionLocaleSpecificationArgs $) {
        this.botVersionLocaleDetails = $.botVersionLocaleDetails;
        this.localeId = $.localeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotVersionLocaleSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotVersionLocaleSpecificationArgs $;

        public Builder() {
            $ = new BotVersionLocaleSpecificationArgs();
        }

        public Builder(BotVersionLocaleSpecificationArgs defaults) {
            $ = new BotVersionLocaleSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder botVersionLocaleDetails(Output<BotVersionLocaleDetailsArgs> botVersionLocaleDetails) {
            $.botVersionLocaleDetails = botVersionLocaleDetails;
            return this;
        }

        public Builder botVersionLocaleDetails(BotVersionLocaleDetailsArgs botVersionLocaleDetails) {
            return botVersionLocaleDetails(Output.of(botVersionLocaleDetails));
        }

        public Builder localeId(Output<String> localeId) {
            $.localeId = localeId;
            return this;
        }

        public Builder localeId(String localeId) {
            return localeId(Output.of(localeId));
        }

        public BotVersionLocaleSpecificationArgs build() {
            $.botVersionLocaleDetails = Objects.requireNonNull($.botVersionLocaleDetails, "expected parameter 'botVersionLocaleDetails' to be non-null");
            $.localeId = Objects.requireNonNull($.localeId, "expected parameter 'localeId' to be non-null");
            return $;
        }
    }

}
