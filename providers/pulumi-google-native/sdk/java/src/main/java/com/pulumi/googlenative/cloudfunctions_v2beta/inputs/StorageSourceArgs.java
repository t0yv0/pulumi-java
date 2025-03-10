// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudfunctions_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Location of the source in an archive file in Google Cloud Storage.
 * 
 */
public final class StorageSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageSourceArgs Empty = new StorageSourceArgs();

    /**
     * Google Cloud Storage bucket containing the source (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return Google Cloud Storage bucket containing the source (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Google Cloud Storage object containing the source. This object must be a gzipped archive file (`.tar.gz`) containing source to build.
     * 
     */
    @Import(name="object")
    private @Nullable Output<String> object;

    /**
     * @return Google Cloud Storage object containing the source. This object must be a gzipped archive file (`.tar.gz`) containing source to build.
     * 
     */
    public Optional<Output<String>> object() {
        return Optional.ofNullable(this.object);
    }

    private StorageSourceArgs() {}

    private StorageSourceArgs(StorageSourceArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageSourceArgs $;

        public Builder() {
            $ = new StorageSourceArgs();
        }

        public Builder(StorageSourceArgs defaults) {
            $ = new StorageSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Google Cloud Storage bucket containing the source (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Google Cloud Storage bucket containing the source (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param generation Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation Google Cloud Storage generation for the object. If the generation is omitted, the latest generation will be used.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param object Google Cloud Storage object containing the source. This object must be a gzipped archive file (`.tar.gz`) containing source to build.
         * 
         * @return builder
         * 
         */
        public Builder object(@Nullable Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Google Cloud Storage object containing the source. This object must be a gzipped archive file (`.tar.gz`) containing source to build.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public StorageSourceArgs build() {
            return $;
        }
    }

}
