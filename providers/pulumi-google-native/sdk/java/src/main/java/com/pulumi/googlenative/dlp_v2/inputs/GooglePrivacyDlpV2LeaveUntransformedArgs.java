// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;




/**
 * Skips the data without modifying it if the requested transformation would cause an error. For example, if a `DateShift` transformation were applied an an IP address, this mode would leave the IP address unchanged in the response.
 * 
 */
public final class GooglePrivacyDlpV2LeaveUntransformedArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2LeaveUntransformedArgs Empty = new GooglePrivacyDlpV2LeaveUntransformedArgs();

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LeaveUntransformedArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2LeaveUntransformedArgs();
        }
        public GooglePrivacyDlpV2LeaveUntransformedArgs build() {
            return $;
        }
    }

}
