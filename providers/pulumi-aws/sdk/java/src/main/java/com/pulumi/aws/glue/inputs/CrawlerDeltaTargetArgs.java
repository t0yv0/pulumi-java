// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CrawlerDeltaTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CrawlerDeltaTargetArgs Empty = new CrawlerDeltaTargetArgs();

    /**
     * The name of the connection to use to connect to the Delta table target.
     * 
     */
    @Import(name="connectionName", required=true)
    private Output<String> connectionName;

    /**
     * @return The name of the connection to use to connect to the Delta table target.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }

    /**
     * A list of the Amazon S3 paths to the Delta tables.
     * 
     */
    @Import(name="deltaTables", required=true)
    private Output<List<String>> deltaTables;

    /**
     * @return A list of the Amazon S3 paths to the Delta tables.
     * 
     */
    public Output<List<String>> deltaTables() {
        return this.deltaTables;
    }

    /**
     * Specifies whether to write the manifest files to the Delta table path.
     * 
     */
    @Import(name="writeManifest", required=true)
    private Output<Boolean> writeManifest;

    /**
     * @return Specifies whether to write the manifest files to the Delta table path.
     * 
     */
    public Output<Boolean> writeManifest() {
        return this.writeManifest;
    }

    private CrawlerDeltaTargetArgs() {}

    private CrawlerDeltaTargetArgs(CrawlerDeltaTargetArgs $) {
        this.connectionName = $.connectionName;
        this.deltaTables = $.deltaTables;
        this.writeManifest = $.writeManifest;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CrawlerDeltaTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrawlerDeltaTargetArgs $;

        public Builder() {
            $ = new CrawlerDeltaTargetArgs();
        }

        public Builder(CrawlerDeltaTargetArgs defaults) {
            $ = new CrawlerDeltaTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName The name of the connection to use to connect to the Delta table target.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName The name of the connection to use to connect to the Delta table target.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
         * 
         * @return builder
         * 
         */
        public Builder deltaTables(Output<List<String>> deltaTables) {
            $.deltaTables = deltaTables;
            return this;
        }

        /**
         * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
         * 
         * @return builder
         * 
         */
        public Builder deltaTables(List<String> deltaTables) {
            return deltaTables(Output.of(deltaTables));
        }

        /**
         * @param deltaTables A list of the Amazon S3 paths to the Delta tables.
         * 
         * @return builder
         * 
         */
        public Builder deltaTables(String... deltaTables) {
            return deltaTables(List.of(deltaTables));
        }

        /**
         * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
         * 
         * @return builder
         * 
         */
        public Builder writeManifest(Output<Boolean> writeManifest) {
            $.writeManifest = writeManifest;
            return this;
        }

        /**
         * @param writeManifest Specifies whether to write the manifest files to the Delta table path.
         * 
         * @return builder
         * 
         */
        public Builder writeManifest(Boolean writeManifest) {
            return writeManifest(Output.of(writeManifest));
        }

        public CrawlerDeltaTargetArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.deltaTables = Objects.requireNonNull($.deltaTables, "expected parameter 'deltaTables' to be non-null");
            $.writeManifest = Objects.requireNonNull($.writeManifest, "expected parameter 'writeManifest' to be non-null");
            return $;
        }
    }

}
