// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of properties that uniquely identify a given Docker image.
 * 
 */
public final class FingerprintArgs extends com.pulumi.resources.ResourceArgs {

    public static final FingerprintArgs Empty = new FingerprintArgs();

    /**
     * The layer ID of the final layer in the Docker image&#39;s v1 representation.
     * 
     */
    @Import(name="v1Name", required=true)
    private Output<String> v1Name;

    /**
     * @return The layer ID of the final layer in the Docker image&#39;s v1 representation.
     * 
     */
    public Output<String> v1Name() {
        return this.v1Name;
    }

    /**
     * The ordered list of v2 blobs that represent a given image.
     * 
     */
    @Import(name="v2Blob", required=true)
    private Output<List<String>> v2Blob;

    /**
     * @return The ordered list of v2 blobs that represent a given image.
     * 
     */
    public Output<List<String>> v2Blob() {
        return this.v2Blob;
    }

    private FingerprintArgs() {}

    private FingerprintArgs(FingerprintArgs $) {
        this.v1Name = $.v1Name;
        this.v2Blob = $.v2Blob;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FingerprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FingerprintArgs $;

        public Builder() {
            $ = new FingerprintArgs();
        }

        public Builder(FingerprintArgs defaults) {
            $ = new FingerprintArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param v1Name The layer ID of the final layer in the Docker image&#39;s v1 representation.
         * 
         * @return builder
         * 
         */
        public Builder v1Name(Output<String> v1Name) {
            $.v1Name = v1Name;
            return this;
        }

        /**
         * @param v1Name The layer ID of the final layer in the Docker image&#39;s v1 representation.
         * 
         * @return builder
         * 
         */
        public Builder v1Name(String v1Name) {
            return v1Name(Output.of(v1Name));
        }

        /**
         * @param v2Blob The ordered list of v2 blobs that represent a given image.
         * 
         * @return builder
         * 
         */
        public Builder v2Blob(Output<List<String>> v2Blob) {
            $.v2Blob = v2Blob;
            return this;
        }

        /**
         * @param v2Blob The ordered list of v2 blobs that represent a given image.
         * 
         * @return builder
         * 
         */
        public Builder v2Blob(List<String> v2Blob) {
            return v2Blob(Output.of(v2Blob));
        }

        /**
         * @param v2Blob The ordered list of v2 blobs that represent a given image.
         * 
         * @return builder
         * 
         */
        public Builder v2Blob(String... v2Blob) {
            return v2Blob(List.of(v2Blob));
        }

        public FingerprintArgs build() {
            $.v1Name = Objects.requireNonNull($.v1Name, "expected parameter 'v1Name' to be non-null");
            $.v2Blob = Objects.requireNonNull($.v2Blob, "expected parameter 'v2Blob' to be non-null");
            return $;
        }
    }

}
