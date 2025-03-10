// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.transcoder_v1.enums.AnimationFadeFadeType;
import com.pulumi.googlenative.transcoder_v1.inputs.NormalizedCoordinateArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Display overlay object with fade animation.
 * 
 */
public final class AnimationFadeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnimationFadeArgs Empty = new AnimationFadeArgs();

    /**
     * The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
     */
    @Import(name="endTimeOffset")
    private @Nullable Output<String> endTimeOffset;

    /**
     * @return The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
     * 
     */
    public Optional<Output<String>> endTimeOffset() {
        return Optional.ofNullable(this.endTimeOffset);
    }

    /**
     * Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
     */
    @Import(name="fadeType", required=true)
    private Output<AnimationFadeFadeType> fadeType;

    /**
     * @return Type of fade animation: `FADE_IN` or `FADE_OUT`.
     * 
     */
    public Output<AnimationFadeFadeType> fadeType() {
        return this.fadeType;
    }

    /**
     * The time to start the fade animation, in seconds. Default: 0
     * 
     */
    @Import(name="startTimeOffset")
    private @Nullable Output<String> startTimeOffset;

    /**
     * @return The time to start the fade animation, in seconds. Default: 0
     * 
     */
    public Optional<Output<String>> startTimeOffset() {
        return Optional.ofNullable(this.startTimeOffset);
    }

    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    @Import(name="xy")
    private @Nullable Output<NormalizedCoordinateArgs> xy;

    /**
     * @return Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    public Optional<Output<NormalizedCoordinateArgs>> xy() {
        return Optional.ofNullable(this.xy);
    }

    private AnimationFadeArgs() {}

    private AnimationFadeArgs(AnimationFadeArgs $) {
        this.endTimeOffset = $.endTimeOffset;
        this.fadeType = $.fadeType;
        this.startTimeOffset = $.startTimeOffset;
        this.xy = $.xy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnimationFadeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnimationFadeArgs $;

        public Builder() {
            $ = new AnimationFadeArgs();
        }

        public Builder(AnimationFadeArgs defaults) {
            $ = new AnimationFadeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTimeOffset The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(@Nullable Output<String> endTimeOffset) {
            $.endTimeOffset = endTimeOffset;
            return this;
        }

        /**
         * @param endTimeOffset The time to end the fade animation, in seconds. Default: `start_time_offset` + 1s
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(String endTimeOffset) {
            return endTimeOffset(Output.of(endTimeOffset));
        }

        /**
         * @param fadeType Type of fade animation: `FADE_IN` or `FADE_OUT`.
         * 
         * @return builder
         * 
         */
        public Builder fadeType(Output<AnimationFadeFadeType> fadeType) {
            $.fadeType = fadeType;
            return this;
        }

        /**
         * @param fadeType Type of fade animation: `FADE_IN` or `FADE_OUT`.
         * 
         * @return builder
         * 
         */
        public Builder fadeType(AnimationFadeFadeType fadeType) {
            return fadeType(Output.of(fadeType));
        }

        /**
         * @param startTimeOffset The time to start the fade animation, in seconds. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        /**
         * @param startTimeOffset The time to start the fade animation, in seconds. Default: 0
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(String startTimeOffset) {
            return startTimeOffset(Output.of(startTimeOffset));
        }

        /**
         * @param xy Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
         * 
         * @return builder
         * 
         */
        public Builder xy(@Nullable Output<NormalizedCoordinateArgs> xy) {
            $.xy = xy;
            return this;
        }

        /**
         * @param xy Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
         * 
         * @return builder
         * 
         */
        public Builder xy(NormalizedCoordinateArgs xy) {
            return xy(Output.of(xy));
        }

        public AnimationFadeArgs build() {
            $.fadeType = Objects.requireNonNull($.fadeType, "expected parameter 'fadeType' to be non-null");
            return $;
        }
    }

}
