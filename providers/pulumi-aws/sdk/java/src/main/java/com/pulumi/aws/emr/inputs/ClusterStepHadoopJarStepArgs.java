// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterStepHadoopJarStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterStepHadoopJarStepArgs Empty = new ClusterStepHadoopJarStepArgs();

    /**
     * List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    /**
     * @return List of command line arguments passed to the JAR file&#39;s main function when executed.
     * 
     */
    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Path to a JAR file run during the step.
     * 
     */
    @Import(name="jar", required=true)
    private Output<String> jar;

    /**
     * @return Path to a JAR file run during the step.
     * 
     */
    public Output<String> jar() {
        return this.jar;
    }

    /**
     * Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    @Import(name="mainClass")
    private @Nullable Output<String> mainClass;

    /**
     * @return Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
     * 
     */
    public Optional<Output<String>> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }

    /**
     * Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private ClusterStepHadoopJarStepArgs() {}

    private ClusterStepHadoopJarStepArgs(ClusterStepHadoopJarStepArgs $) {
        this.args = $.args;
        this.jar = $.jar;
        this.mainClass = $.mainClass;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterStepHadoopJarStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterStepHadoopJarStepArgs $;

        public Builder() {
            $ = new ClusterStepHadoopJarStepArgs();
        }

        public Builder(ClusterStepHadoopJarStepArgs defaults) {
            $ = new ClusterStepHadoopJarStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param args List of command line arguments passed to the JAR file&#39;s main function when executed.
         * 
         * @return builder
         * 
         */
        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        /**
         * @param args List of command line arguments passed to the JAR file&#39;s main function when executed.
         * 
         * @return builder
         * 
         */
        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        /**
         * @param args List of command line arguments passed to the JAR file&#39;s main function when executed.
         * 
         * @return builder
         * 
         */
        public Builder args(String... args) {
            return args(List.of(args));
        }

        /**
         * @param jar Path to a JAR file run during the step.
         * 
         * @return builder
         * 
         */
        public Builder jar(Output<String> jar) {
            $.jar = jar;
            return this;
        }

        /**
         * @param jar Path to a JAR file run during the step.
         * 
         * @return builder
         * 
         */
        public Builder jar(String jar) {
            return jar(Output.of(jar));
        }

        /**
         * @param mainClass Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
         * 
         * @return builder
         * 
         */
        public Builder mainClass(@Nullable Output<String> mainClass) {
            $.mainClass = mainClass;
            return this;
        }

        /**
         * @param mainClass Name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
         * 
         * @return builder
         * 
         */
        public Builder mainClass(String mainClass) {
            return mainClass(Output.of(mainClass));
        }

        /**
         * @param properties Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Key-Value map of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public ClusterStepHadoopJarStepArgs build() {
            $.jar = Objects.requireNonNull($.jar, "expected parameter 'jar' to be non-null");
            return $;
        }
    }

}
