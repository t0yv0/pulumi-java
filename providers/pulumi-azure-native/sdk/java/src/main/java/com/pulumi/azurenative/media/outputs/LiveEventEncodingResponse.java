// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LiveEventEncodingResponse {
    /**
     * @return Live event type. When encodingType is set to None, the service simply passes through the incoming video and audio layer(s) to the output. When encodingType is set to Standard or Premium1080p, a live encoder transcodes the incoming stream into multiple bitrates or layers. See https://go.microsoft.com/fwlink/?linkid=2095101 for more information. This property cannot be modified after the live event is created.
     * 
     */
    private final @Nullable String encodingType;
    /**
     * @return Use an ISO 8601 time value between 0.5 to 20 seconds to specify the output fragment length for the video and audio tracks of an encoding live event. For example, use PT2S to indicate 2 seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures).   If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value cannot be set for pass-through live events.
     * 
     */
    private final @Nullable String keyFrameInterval;
    /**
     * @return The optional encoding preset name, used when encodingType is not None. This value is specified at creation time and cannot be updated. If the encodingType is set to Standard, then the default preset name is ‘Default720p’. Else if the encodingType is set to Premium1080p, the default preset is ‘Default1080p’.
     * 
     */
    private final @Nullable String presetName;
    /**
     * @return Specifies how the input video will be resized to fit the desired output resolution(s). Default is None
     * 
     */
    private final @Nullable String stretchMode;

    @CustomType.Constructor
    private LiveEventEncodingResponse(
        @CustomType.Parameter("encodingType") @Nullable String encodingType,
        @CustomType.Parameter("keyFrameInterval") @Nullable String keyFrameInterval,
        @CustomType.Parameter("presetName") @Nullable String presetName,
        @CustomType.Parameter("stretchMode") @Nullable String stretchMode) {
        this.encodingType = encodingType;
        this.keyFrameInterval = keyFrameInterval;
        this.presetName = presetName;
        this.stretchMode = stretchMode;
    }

    /**
     * @return Live event type. When encodingType is set to None, the service simply passes through the incoming video and audio layer(s) to the output. When encodingType is set to Standard or Premium1080p, a live encoder transcodes the incoming stream into multiple bitrates or layers. See https://go.microsoft.com/fwlink/?linkid=2095101 for more information. This property cannot be modified after the live event is created.
     * 
     */
    public Optional<String> encodingType() {
        return Optional.ofNullable(this.encodingType);
    }
    /**
     * @return Use an ISO 8601 time value between 0.5 to 20 seconds to specify the output fragment length for the video and audio tracks of an encoding live event. For example, use PT2S to indicate 2 seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures).   If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value cannot be set for pass-through live events.
     * 
     */
    public Optional<String> keyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }
    /**
     * @return The optional encoding preset name, used when encodingType is not None. This value is specified at creation time and cannot be updated. If the encodingType is set to Standard, then the default preset name is ‘Default720p’. Else if the encodingType is set to Premium1080p, the default preset is ‘Default1080p’.
     * 
     */
    public Optional<String> presetName() {
        return Optional.ofNullable(this.presetName);
    }
    /**
     * @return Specifies how the input video will be resized to fit the desired output resolution(s). Default is None
     * 
     */
    public Optional<String> stretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventEncodingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encodingType;
        private @Nullable String keyFrameInterval;
        private @Nullable String presetName;
        private @Nullable String stretchMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventEncodingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encodingType = defaults.encodingType;
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.presetName = defaults.presetName;
    	      this.stretchMode = defaults.stretchMode;
        }

        public Builder encodingType(@Nullable String encodingType) {
            this.encodingType = encodingType;
            return this;
        }
        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        public Builder presetName(@Nullable String presetName) {
            this.presetName = presetName;
            return this;
        }
        public Builder stretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }        public LiveEventEncodingResponse build() {
            return new LiveEventEncodingResponse(encodingType, keyFrameInterval, presetName, stretchMode);
        }
    }
}
