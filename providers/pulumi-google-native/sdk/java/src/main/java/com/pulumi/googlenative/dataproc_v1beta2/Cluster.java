// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dataproc_v1beta2.ClusterArgs;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.ClusterConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.ClusterMetricsResponse;
import com.pulumi.googlenative.dataproc_v1beta2.outputs.ClusterStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a cluster in a project. The returned Operation.metadata will be ClusterOperationMetadata (https://cloud.google.com/dataproc/docs/reference/rpc/google.cloud.dataproc.v1beta2#clusteroperationmetadata).
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dataproc/v1beta2:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output<String> clusterName;

    /**
     * @return The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }
    /**
     * A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
     * 
     */
    @Export(name="clusterUuid", type=String.class, parameters={})
    private Output<String> clusterUuid;

    /**
     * @return A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
     * 
     */
    public Output<String> clusterUuid() {
        return this.clusterUuid;
    }
    /**
     * The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    @Export(name="config", type=ClusterConfigResponse.class, parameters={})
    private Output<ClusterConfigResponse> config;

    /**
     * @return The cluster config. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    public Output<ClusterConfigResponse> config() {
        return this.config;
    }
    /**
     * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    @Export(name="metrics", type=ClusterMetricsResponse.class, parameters={})
    private Output<ClusterMetricsResponse> metrics;

    /**
     * @return Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    public Output<ClusterMetricsResponse> metrics() {
        return this.metrics;
    }
    /**
     * The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Cluster status.
     * 
     */
    @Export(name="status", type=ClusterStatusResponse.class, parameters={})
    private Output<ClusterStatusResponse> status;

    /**
     * @return Cluster status.
     * 
     */
    public Output<ClusterStatusResponse> status() {
        return this.status;
    }
    /**
     * The previous cluster status.
     * 
     */
    @Export(name="statusHistory", type=List.class, parameters={ClusterStatusResponse.class})
    private Output<List<ClusterStatusResponse>> statusHistory;

    /**
     * @return The previous cluster status.
     * 
     */
    public Output<List<ClusterStatusResponse>> statusHistory() {
        return this.statusHistory;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1beta2:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dataproc/v1beta2:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
