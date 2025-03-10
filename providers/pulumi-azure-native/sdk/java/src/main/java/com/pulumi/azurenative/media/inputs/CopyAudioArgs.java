// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A codec flag, which tells the encoder to copy the input audio bitstream.
 * 
 */
public final class CopyAudioArgs extends com.pulumi.resources.ResourceArgs {

    public static final CopyAudioArgs Empty = new CopyAudioArgs();

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyAudio&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.CopyAudio&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    private CopyAudioArgs() {}

    private CopyAudioArgs(CopyAudioArgs $) {
        this.label = $.label;
        this.odataType = $.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CopyAudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CopyAudioArgs $;

        public Builder() {
            $ = new CopyAudioArgs();
        }

        public Builder(CopyAudioArgs defaults) {
            $ = new CopyAudioArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param label An optional label for the codec. The label can be used to control muxing behavior.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label An optional label for the codec. The label can be used to control muxing behavior.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.CopyAudio&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.CopyAudio&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        public CopyAudioArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
