// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoveryreadiness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RecoveryGroupTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecoveryGroupTagArgs Empty = new RecoveryGroupTagArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<List<String>> value;

    public Output<List<String>> value() {
        return this.value;
    }

    private RecoveryGroupTagArgs() {}

    private RecoveryGroupTagArgs(RecoveryGroupTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecoveryGroupTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecoveryGroupTagArgs $;

        public Builder() {
            $ = new RecoveryGroupTagArgs();
        }

        public Builder(RecoveryGroupTagArgs defaults) {
            $ = new RecoveryGroupTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<List<String>> value) {
            $.value = value;
            return this;
        }

        public Builder value(List<String> value) {
            return value(Output.of(value));
        }

        public Builder value(String... value) {
            return value(List.of(value));
        }

        public RecoveryGroupTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
