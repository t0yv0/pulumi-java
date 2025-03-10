// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ObjectStorage.inputs.GetReplicationSourcesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetReplicationSourcesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationSourcesArgs Empty = new GetReplicationSourcesArgs();

    /**
     * The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    @Import(name="bucket", required=true)
    private String bucket;

    /**
     * @return The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    public String bucket() {
        return this.bucket;
    }

    @Import(name="filters")
    private @Nullable List<GetReplicationSourcesFilter> filters;

    public Optional<List<GetReplicationSourcesFilter>> filters() {
        return Optional.ofNullable(this.filters);
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

    private GetReplicationSourcesArgs() {}

    private GetReplicationSourcesArgs(GetReplicationSourcesArgs $) {
        this.bucket = $.bucket;
        this.filters = $.filters;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationSourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationSourcesArgs $;

        public Builder() {
            $ = new GetReplicationSourcesArgs();
        }

        public Builder(GetReplicationSourcesArgs defaults) {
            $ = new GetReplicationSourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder filters(@Nullable List<GetReplicationSourcesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetReplicationSourcesFilter... filters) {
            return filters(List.of(filters));
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

        public GetReplicationSourcesArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
