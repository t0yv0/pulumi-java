// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLAllowActionArgs;
import com.pulumi.awsnative.wafv2.inputs.WebACLBlockActionArgs;
import com.pulumi.awsnative.wafv2.inputs.WebACLCaptchaActionArgs;
import com.pulumi.awsnative.wafv2.inputs.WebACLCountActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action taken when Rule matches its condition.
 * 
 */
public final class WebACLRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebACLRuleActionArgs Empty = new WebACLRuleActionArgs();

    @Import(name="allow")
    private @Nullable Output<WebACLAllowActionArgs> allow;

    public Optional<Output<WebACLAllowActionArgs>> allow() {
        return Optional.ofNullable(this.allow);
    }

    @Import(name="block")
    private @Nullable Output<WebACLBlockActionArgs> block;

    public Optional<Output<WebACLBlockActionArgs>> block() {
        return Optional.ofNullable(this.block);
    }

    @Import(name="captcha")
    private @Nullable Output<WebACLCaptchaActionArgs> captcha;

    public Optional<Output<WebACLCaptchaActionArgs>> captcha() {
        return Optional.ofNullable(this.captcha);
    }

    @Import(name="count")
    private @Nullable Output<WebACLCountActionArgs> count;

    public Optional<Output<WebACLCountActionArgs>> count() {
        return Optional.ofNullable(this.count);
    }

    private WebACLRuleActionArgs() {}

    private WebACLRuleActionArgs(WebACLRuleActionArgs $) {
        this.allow = $.allow;
        this.block = $.block;
        this.captcha = $.captcha;
        this.count = $.count;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLRuleActionArgs $;

        public Builder() {
            $ = new WebACLRuleActionArgs();
        }

        public Builder(WebACLRuleActionArgs defaults) {
            $ = new WebACLRuleActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder allow(@Nullable Output<WebACLAllowActionArgs> allow) {
            $.allow = allow;
            return this;
        }

        public Builder allow(WebACLAllowActionArgs allow) {
            return allow(Output.of(allow));
        }

        public Builder block(@Nullable Output<WebACLBlockActionArgs> block) {
            $.block = block;
            return this;
        }

        public Builder block(WebACLBlockActionArgs block) {
            return block(Output.of(block));
        }

        public Builder captcha(@Nullable Output<WebACLCaptchaActionArgs> captcha) {
            $.captcha = captcha;
            return this;
        }

        public Builder captcha(WebACLCaptchaActionArgs captcha) {
            return captcha(Output.of(captcha));
        }

        public Builder count(@Nullable Output<WebACLCountActionArgs> count) {
            $.count = count;
            return this;
        }

        public Builder count(WebACLCountActionArgs count) {
            return count(Output.of(count));
        }

        public WebACLRuleActionArgs build() {
            return $;
        }
    }

}
