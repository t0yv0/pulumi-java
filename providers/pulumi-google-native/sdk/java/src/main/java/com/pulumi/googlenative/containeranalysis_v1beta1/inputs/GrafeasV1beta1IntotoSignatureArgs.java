// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A signature object consists of the KeyID used and the signature itself.
 * 
 */
public final class GrafeasV1beta1IntotoSignatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GrafeasV1beta1IntotoSignatureArgs Empty = new GrafeasV1beta1IntotoSignatureArgs();

    @Import(name="keyid")
    private @Nullable Output<String> keyid;

    public Optional<Output<String>> keyid() {
        return Optional.ofNullable(this.keyid);
    }

    @Import(name="sig")
    private @Nullable Output<String> sig;

    public Optional<Output<String>> sig() {
        return Optional.ofNullable(this.sig);
    }

    private GrafeasV1beta1IntotoSignatureArgs() {}

    private GrafeasV1beta1IntotoSignatureArgs(GrafeasV1beta1IntotoSignatureArgs $) {
        this.keyid = $.keyid;
        this.sig = $.sig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GrafeasV1beta1IntotoSignatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GrafeasV1beta1IntotoSignatureArgs $;

        public Builder() {
            $ = new GrafeasV1beta1IntotoSignatureArgs();
        }

        public Builder(GrafeasV1beta1IntotoSignatureArgs defaults) {
            $ = new GrafeasV1beta1IntotoSignatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyid(@Nullable Output<String> keyid) {
            $.keyid = keyid;
            return this;
        }

        public Builder keyid(String keyid) {
            return keyid(Output.of(keyid));
        }

        public Builder sig(@Nullable Output<String> sig) {
            $.sig = sig;
            return this;
        }

        public Builder sig(String sig) {
            return sig(Output.of(sig));
        }

        public GrafeasV1beta1IntotoSignatureArgs build() {
            return $;
        }
    }

}
