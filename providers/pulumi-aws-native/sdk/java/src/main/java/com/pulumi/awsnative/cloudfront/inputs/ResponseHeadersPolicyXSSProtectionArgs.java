// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyXSSProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyXSSProtectionArgs Empty = new ResponseHeadersPolicyXSSProtectionArgs();

    @Import(name="modeBlock")
    private @Nullable Output<Boolean> modeBlock;

    public Optional<Output<Boolean>> modeBlock() {
        return Optional.ofNullable(this.modeBlock);
    }

    @Import(name="override", required=true)
    private Output<Boolean> override;

    public Output<Boolean> override() {
        return this.override;
    }

    @Import(name="protection", required=true)
    private Output<Boolean> protection;

    public Output<Boolean> protection() {
        return this.protection;
    }

    @Import(name="reportUri")
    private @Nullable Output<String> reportUri;

    public Optional<Output<String>> reportUri() {
        return Optional.ofNullable(this.reportUri);
    }

    private ResponseHeadersPolicyXSSProtectionArgs() {}

    private ResponseHeadersPolicyXSSProtectionArgs(ResponseHeadersPolicyXSSProtectionArgs $) {
        this.modeBlock = $.modeBlock;
        this.override = $.override;
        this.protection = $.protection;
        this.reportUri = $.reportUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResponseHeadersPolicyXSSProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResponseHeadersPolicyXSSProtectionArgs $;

        public Builder() {
            $ = new ResponseHeadersPolicyXSSProtectionArgs();
        }

        public Builder(ResponseHeadersPolicyXSSProtectionArgs defaults) {
            $ = new ResponseHeadersPolicyXSSProtectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder modeBlock(@Nullable Output<Boolean> modeBlock) {
            $.modeBlock = modeBlock;
            return this;
        }

        public Builder modeBlock(Boolean modeBlock) {
            return modeBlock(Output.of(modeBlock));
        }

        public Builder override(Output<Boolean> override) {
            $.override = override;
            return this;
        }

        public Builder override(Boolean override) {
            return override(Output.of(override));
        }

        public Builder protection(Output<Boolean> protection) {
            $.protection = protection;
            return this;
        }

        public Builder protection(Boolean protection) {
            return protection(Output.of(protection));
        }

        public Builder reportUri(@Nullable Output<String> reportUri) {
            $.reportUri = reportUri;
            return this;
        }

        public Builder reportUri(String reportUri) {
            return reportUri(Output.of(reportUri));
        }

        public ResponseHeadersPolicyXSSProtectionArgs build() {
            $.override = Objects.requireNonNull($.override, "expected parameter 'override' to be non-null");
            $.protection = Objects.requireNonNull($.protection, "expected parameter 'protection' to be non-null");
            return $;
        }
    }

}
