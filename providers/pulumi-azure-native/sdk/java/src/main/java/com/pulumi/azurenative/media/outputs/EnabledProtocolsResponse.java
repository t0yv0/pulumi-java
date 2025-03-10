// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class EnabledProtocolsResponse {
    /**
     * @return Enable DASH protocol or not
     * 
     */
    private final Boolean dash;
    /**
     * @return Enable Download protocol or not
     * 
     */
    private final Boolean download;
    /**
     * @return Enable HLS protocol or not
     * 
     */
    private final Boolean hls;
    /**
     * @return Enable SmoothStreaming protocol or not
     * 
     */
    private final Boolean smoothStreaming;

    @CustomType.Constructor
    private EnabledProtocolsResponse(
        @CustomType.Parameter("dash") Boolean dash,
        @CustomType.Parameter("download") Boolean download,
        @CustomType.Parameter("hls") Boolean hls,
        @CustomType.Parameter("smoothStreaming") Boolean smoothStreaming) {
        this.dash = dash;
        this.download = download;
        this.hls = hls;
        this.smoothStreaming = smoothStreaming;
    }

    /**
     * @return Enable DASH protocol or not
     * 
     */
    public Boolean dash() {
        return this.dash;
    }
    /**
     * @return Enable Download protocol or not
     * 
     */
    public Boolean download() {
        return this.download;
    }
    /**
     * @return Enable HLS protocol or not
     * 
     */
    public Boolean hls() {
        return this.hls;
    }
    /**
     * @return Enable SmoothStreaming protocol or not
     * 
     */
    public Boolean smoothStreaming() {
        return this.smoothStreaming;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnabledProtocolsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean dash;
        private Boolean download;
        private Boolean hls;
        private Boolean smoothStreaming;

        public Builder() {
    	      // Empty
        }

        public Builder(EnabledProtocolsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dash = defaults.dash;
    	      this.download = defaults.download;
    	      this.hls = defaults.hls;
    	      this.smoothStreaming = defaults.smoothStreaming;
        }

        public Builder dash(Boolean dash) {
            this.dash = Objects.requireNonNull(dash);
            return this;
        }
        public Builder download(Boolean download) {
            this.download = Objects.requireNonNull(download);
            return this;
        }
        public Builder hls(Boolean hls) {
            this.hls = Objects.requireNonNull(hls);
            return this;
        }
        public Builder smoothStreaming(Boolean smoothStreaming) {
            this.smoothStreaming = Objects.requireNonNull(smoothStreaming);
            return this;
        }        public EnabledProtocolsResponse build() {
            return new EnabledProtocolsResponse(dash, download, hls, smoothStreaming);
        }
    }
}
