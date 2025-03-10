// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBucketArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketArgs Empty = new GetBucketArgs();

    /**
     * The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The Object Storage namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The Object Storage namespace used for the request.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    private GetBucketArgs() {}

    private GetBucketArgs(GetBucketArgs $) {
        this.name = $.name;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBucketArgs $;

        public Builder() {
            $ = new GetBucketArgs();
        }

        public Builder(GetBucketArgs defaults) {
            $ = new GetBucketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespace The Object Storage namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public GetBucketArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
