// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VideoResponse {
    /**
     * @return The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    private final @Nullable String keyFrameInterval;
    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    private final @Nullable String label;
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.Video&#39;.
     * 
     */
    private final String odataType;
    /**
     * @return The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    private final @Nullable String stretchMode;
    /**
     * @return The Video Sync Mode
     * 
     */
    private final @Nullable String syncMode;

    @CustomType.Constructor
    private VideoResponse(
        @CustomType.Parameter("keyFrameInterval") @Nullable String keyFrameInterval,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("stretchMode") @Nullable String stretchMode,
        @CustomType.Parameter("syncMode") @Nullable String syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.odataType = odataType;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    /**
     * @return The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    public Optional<String> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }
    /**
     * @return An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.Video&#39;.
     * 
     */
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    public Optional<String> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }
    /**
     * @return The Video Sync Mode
     * 
     */
    public Optional<String> syncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private String odataType;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder stretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }
        public Builder syncMode(@Nullable String syncMode) {
            this.syncMode = syncMode;
            return this;
        }        public VideoResponse build() {
            return new VideoResponse(keyFrameInterval, label, odataType, stretchMode, syncMode);
        }
    }
}
