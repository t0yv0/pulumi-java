// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A sequence of absolute datetime ranges as a string. The datetime values should follow IS08601, and the sum of the ranges should add up to 24 hours or less. Currently, there can be only one range specified in the sequence.
 * 
 */
public final class VideoSequenceAbsoluteTimeMarkersArgs extends com.pulumi.resources.ResourceArgs {

    public static final VideoSequenceAbsoluteTimeMarkersArgs Empty = new VideoSequenceAbsoluteTimeMarkersArgs();

    /**
     * The sequence of datetime ranges. Example: &#39;[[&#34;2021-10-05T03:30:00Z&#34;, &#34;2021-10-05T03:40:00Z&#34;]]&#39;.
     * 
     */
    @Import(name="ranges", required=true)
    private Output<String> ranges;

    /**
     * @return The sequence of datetime ranges. Example: &#39;[[&#34;2021-10-05T03:30:00Z&#34;, &#34;2021-10-05T03:40:00Z&#34;]]&#39;.
     * 
     */
    public Output<String> ranges() {
        return this.ranges;
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.VideoSequenceAbsoluteTimeMarkers&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.VideoAnalyzer.VideoSequenceAbsoluteTimeMarkers&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private VideoSequenceAbsoluteTimeMarkersArgs() {}

    private VideoSequenceAbsoluteTimeMarkersArgs(VideoSequenceAbsoluteTimeMarkersArgs $) {
        this.ranges = $.ranges;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VideoSequenceAbsoluteTimeMarkersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VideoSequenceAbsoluteTimeMarkersArgs $;

        public Builder() {
            $ = new VideoSequenceAbsoluteTimeMarkersArgs();
        }

        public Builder(VideoSequenceAbsoluteTimeMarkersArgs defaults) {
            $ = new VideoSequenceAbsoluteTimeMarkersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ranges The sequence of datetime ranges. Example: &#39;[[&#34;2021-10-05T03:30:00Z&#34;, &#34;2021-10-05T03:40:00Z&#34;]]&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ranges(Output<String> ranges) {
            $.ranges = ranges;
            return this;
        }

        /**
         * @param ranges The sequence of datetime ranges. Example: &#39;[[&#34;2021-10-05T03:30:00Z&#34;, &#34;2021-10-05T03:40:00Z&#34;]]&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ranges(String ranges) {
            return ranges(Output.of(ranges));
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.VideoSequenceAbsoluteTimeMarkers&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The discriminator for derived types.
         * Expected value is &#39;#Microsoft.VideoAnalyzer.VideoSequenceAbsoluteTimeMarkers&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public VideoSequenceAbsoluteTimeMarkersArgs build() {
            $.ranges = Objects.requireNonNull($.ranges, "expected parameter 'ranges' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
