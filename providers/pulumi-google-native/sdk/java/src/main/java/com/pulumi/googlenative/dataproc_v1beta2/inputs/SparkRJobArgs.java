// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) applications on YARN.
 * 
 */
public final class SparkRJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkRJobArgs Empty = new SparkRJobArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    /**
     * @return Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    /**
     * @return Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<LoggingConfigArgs> loggingConfig;

    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public Optional<Output<LoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
    private Output<String> mainRFileUri;

    /**
     * @return The HCFS URI of the main R file to use as the driver. Must be a .R file.
     * 
     */
    public Output<String> mainRFileUri() {
        return this.mainRFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private SparkRJobArgs() {}

    private SparkRJobArgs(SparkRJobArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.loggingConfig = $.loggingConfig;
        this.mainRFileUri = $.mainRFileUri;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkRJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkRJobArgs $;

        public Builder() {
            $ = new SparkRJobArgs();
        }

        public Builder(SparkRJobArgs defaults) {
            $ = new SparkRJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(List<String> archiveUris) {
            return archiveUris(Output.of(archiveUris));
        }

        /**
         * @param archiveUris Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
         * 
         * @return builder
         * 
         */
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(List<String> fileUris) {
            return fileUris(Output.of(fileUris));
        }

        /**
         * @param fileUris Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
         * 
         * @return builder
         * 
         */
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(LoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param mainRFileUri The HCFS URI of the main R file to use as the driver. Must be a .R file.
         * 
         * @return builder
         * 
         */
        public Builder mainRFileUri(Output<String> mainRFileUri) {
            $.mainRFileUri = mainRFileUri;
            return this;
        }

        /**
         * @param mainRFileUri The HCFS URI of the main R file to use as the driver. Must be a .R file.
         * 
         * @return builder
         * 
         */
        public Builder mainRFileUri(String mainRFileUri) {
            return mainRFileUri(Output.of(mainRFileUri));
        }

        /**
         * @param properties Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public SparkRJobArgs build() {
            $.mainRFileUri = Objects.requireNonNull($.mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
            return $;
        }
    }

}
