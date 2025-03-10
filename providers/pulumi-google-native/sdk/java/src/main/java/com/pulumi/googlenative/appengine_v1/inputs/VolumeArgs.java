// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Volumes mounted within the app container. Only applicable in the App Engine flexible environment.
 * 
 */
public final class VolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * Unique name for the volume.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name for the volume.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Volume size in gigabytes.
     * 
     */
    @Import(name="sizeGb")
    private @Nullable Output<Double> sizeGb;

    /**
     * @return Volume size in gigabytes.
     * 
     */
    public Optional<Output<Double>> sizeGb() {
        return Optional.ofNullable(this.sizeGb);
    }

    /**
     * Underlying volume type, e.g. &#39;tmpfs&#39;.
     * 
     */
    @Import(name="volumeType")
    private @Nullable Output<String> volumeType;

    /**
     * @return Underlying volume type, e.g. &#39;tmpfs&#39;.
     * 
     */
    public Optional<Output<String>> volumeType() {
        return Optional.ofNullable(this.volumeType);
    }

    private VolumeArgs() {}

    private VolumeArgs(VolumeArgs $) {
        this.name = $.name;
        this.sizeGb = $.sizeGb;
        this.volumeType = $.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeArgs $;

        public Builder() {
            $ = new VolumeArgs();
        }

        public Builder(VolumeArgs defaults) {
            $ = new VolumeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Unique name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name for the volume.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sizeGb Volume size in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(@Nullable Output<Double> sizeGb) {
            $.sizeGb = sizeGb;
            return this;
        }

        /**
         * @param sizeGb Volume size in gigabytes.
         * 
         * @return builder
         * 
         */
        public Builder sizeGb(Double sizeGb) {
            return sizeGb(Output.of(sizeGb));
        }

        /**
         * @param volumeType Underlying volume type, e.g. &#39;tmpfs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(@Nullable Output<String> volumeType) {
            $.volumeType = volumeType;
            return this;
        }

        /**
         * @param volumeType Underlying volume type, e.g. &#39;tmpfs&#39;.
         * 
         * @return builder
         * 
         */
        public Builder volumeType(String volumeType) {
            return volumeType(Output.of(volumeType));
        }

        public VolumeArgs build() {
            return $;
        }
    }

}
