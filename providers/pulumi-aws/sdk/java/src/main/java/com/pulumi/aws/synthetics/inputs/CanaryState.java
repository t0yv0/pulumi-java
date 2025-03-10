// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics.inputs;

import com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs;
import com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs;
import com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs;
import com.pulumi.aws.synthetics.inputs.CanaryTimelineArgs;
import com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryState extends com.pulumi.resources.ResourceArgs {

    public static final CanaryState Empty = new CanaryState();

    /**
     * Amazon Resource Name (ARN) of the Canary.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Canary.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    @Import(name="artifactConfig")
    private @Nullable Output<CanaryArtifactConfigArgs> artifactConfig;

    /**
     * @return configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    public Optional<Output<CanaryArtifactConfigArgs>> artifactConfig() {
        return Optional.ofNullable(this.artifactConfig);
    }

    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    @Import(name="artifactS3Location")
    private @Nullable Output<String> artifactS3Location;

    /**
     * @return Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    public Optional<Output<String>> artifactS3Location() {
        return Optional.ofNullable(this.artifactS3Location);
    }

    /**
     * ARN of the Lambda function that is used as your canary&#39;s engine.
     * 
     */
    @Import(name="engineArn")
    private @Nullable Output<String> engineArn;

    /**
     * @return ARN of the Lambda function that is used as your canary&#39;s engine.
     * 
     */
    public Optional<Output<String>> engineArn() {
        return Optional.ofNullable(this.engineArn);
    }

    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    @Import(name="executionRoleArn")
    private @Nullable Output<String> executionRoleArn;

    /**
     * @return ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    public Optional<Output<String>> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }

    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @Import(name="failureRetentionPeriod")
    private @Nullable Output<Integer> failureRetentionPeriod;

    /**
     * @return Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    public Optional<Output<Integer>> failureRetentionPeriod() {
        return Optional.ofNullable(this.failureRetentionPeriod);
    }

    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    @Import(name="handler")
    private @Nullable Output<String> handler;

    /**
     * @return Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    public Optional<Output<String>> handler() {
        return Optional.ofNullable(this.handler);
    }

    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration block for individual canary runs. Detailed below.
     * 
     */
    @Import(name="runConfig")
    private @Nullable Output<CanaryRunConfigArgs> runConfig;

    /**
     * @return Configuration block for individual canary runs. Detailed below.
     * 
     */
    public Optional<Output<CanaryRunConfigArgs>> runConfig() {
        return Optional.ofNullable(this.runConfig);
    }

    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<String> runtimeVersion;

    /**
     * @return Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    public Optional<Output<String>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
     * 
     */
    @Import(name="s3Bucket")
    private @Nullable Output<String> s3Bucket;

    /**
     * @return Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
     * 
     */
    public Optional<Output<String>> s3Bucket() {
        return Optional.ofNullable(this.s3Bucket);
    }

    /**
     * S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    @Import(name="s3Key")
    private @Nullable Output<String> s3Key;

    /**
     * @return S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    public Optional<Output<String>> s3Key() {
        return Optional.ofNullable(this.s3Key);
    }

    /**
     * S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    @Import(name="s3Version")
    private @Nullable Output<String> s3Version;

    /**
     * @return S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    public Optional<Output<String>> s3Version() {
        return Optional.ofNullable(this.s3Version);
    }

    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<CanaryScheduleArgs> schedule;

    /**
     * @return Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     */
    public Optional<Output<CanaryScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * ARN of the Lambda layer where Synthetics stores the canary script code.
     * 
     */
    @Import(name="sourceLocationArn")
    private @Nullable Output<String> sourceLocationArn;

    /**
     * @return ARN of the Lambda layer where Synthetics stores the canary script code.
     * 
     */
    public Optional<Output<String>> sourceLocationArn() {
        return Optional.ofNullable(this.sourceLocationArn);
    }

    /**
     * Whether to run or stop the canary.
     * 
     */
    @Import(name="startCanary")
    private @Nullable Output<Boolean> startCanary;

    /**
     * @return Whether to run or stop the canary.
     * 
     */
    public Optional<Output<Boolean>> startCanary() {
        return Optional.ofNullable(this.startCanary);
    }

    /**
     * Canary status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Canary status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @Import(name="successRetentionPeriod")
    private @Nullable Output<Integer> successRetentionPeriod;

    /**
     * @return Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    public Optional<Output<Integer>> successRetentionPeriod() {
        return Optional.ofNullable(this.successRetentionPeriod);
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * 
     */
    @Import(name="timelines")
    private @Nullable Output<List<CanaryTimelineArgs>> timelines;

    /**
     * @return Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * 
     */
    public Optional<Output<List<CanaryTimelineArgs>>> timelines() {
        return Optional.ofNullable(this.timelines);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="vpcConfig")
    private @Nullable Output<CanaryVpcConfigArgs> vpcConfig;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<CanaryVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    @Import(name="zipFile")
    private @Nullable Output<String> zipFile;

    /**
     * @return ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    public Optional<Output<String>> zipFile() {
        return Optional.ofNullable(this.zipFile);
    }

    private CanaryState() {}

    private CanaryState(CanaryState $) {
        this.arn = $.arn;
        this.artifactConfig = $.artifactConfig;
        this.artifactS3Location = $.artifactS3Location;
        this.engineArn = $.engineArn;
        this.executionRoleArn = $.executionRoleArn;
        this.failureRetentionPeriod = $.failureRetentionPeriod;
        this.handler = $.handler;
        this.name = $.name;
        this.runConfig = $.runConfig;
        this.runtimeVersion = $.runtimeVersion;
        this.s3Bucket = $.s3Bucket;
        this.s3Key = $.s3Key;
        this.s3Version = $.s3Version;
        this.schedule = $.schedule;
        this.sourceLocationArn = $.sourceLocationArn;
        this.startCanary = $.startCanary;
        this.status = $.status;
        this.successRetentionPeriod = $.successRetentionPeriod;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.timelines = $.timelines;
        this.vpcConfig = $.vpcConfig;
        this.zipFile = $.zipFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CanaryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CanaryState $;

        public Builder() {
            $ = new CanaryState();
        }

        public Builder(CanaryState defaults) {
            $ = new CanaryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the Canary.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of the Canary.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param artifactConfig configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
         * 
         * @return builder
         * 
         */
        public Builder artifactConfig(@Nullable Output<CanaryArtifactConfigArgs> artifactConfig) {
            $.artifactConfig = artifactConfig;
            return this;
        }

        /**
         * @param artifactConfig configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
         * 
         * @return builder
         * 
         */
        public Builder artifactConfig(CanaryArtifactConfigArgs artifactConfig) {
            return artifactConfig(Output.of(artifactConfig));
        }

        /**
         * @param artifactS3Location Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
         * 
         * @return builder
         * 
         */
        public Builder artifactS3Location(@Nullable Output<String> artifactS3Location) {
            $.artifactS3Location = artifactS3Location;
            return this;
        }

        /**
         * @param artifactS3Location Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
         * 
         * @return builder
         * 
         */
        public Builder artifactS3Location(String artifactS3Location) {
            return artifactS3Location(Output.of(artifactS3Location));
        }

        /**
         * @param engineArn ARN of the Lambda function that is used as your canary&#39;s engine.
         * 
         * @return builder
         * 
         */
        public Builder engineArn(@Nullable Output<String> engineArn) {
            $.engineArn = engineArn;
            return this;
        }

        /**
         * @param engineArn ARN of the Lambda function that is used as your canary&#39;s engine.
         * 
         * @return builder
         * 
         */
        public Builder engineArn(String engineArn) {
            return engineArn(Output.of(engineArn));
        }

        /**
         * @param executionRoleArn ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
         * 
         * @return builder
         * 
         */
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        /**
         * @param executionRoleArn ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
         * 
         * @return builder
         * 
         */
        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        /**
         * @param failureRetentionPeriod Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
         * 
         * @return builder
         * 
         */
        public Builder failureRetentionPeriod(@Nullable Output<Integer> failureRetentionPeriod) {
            $.failureRetentionPeriod = failureRetentionPeriod;
            return this;
        }

        /**
         * @param failureRetentionPeriod Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
         * 
         * @return builder
         * 
         */
        public Builder failureRetentionPeriod(Integer failureRetentionPeriod) {
            return failureRetentionPeriod(Output.of(failureRetentionPeriod));
        }

        /**
         * @param handler Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
         * 
         * @return builder
         * 
         */
        public Builder handler(@Nullable Output<String> handler) {
            $.handler = handler;
            return this;
        }

        /**
         * @param handler Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
         * 
         * @return builder
         * 
         */
        public Builder handler(String handler) {
            return handler(Output.of(handler));
        }

        /**
         * @param name Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param runConfig Configuration block for individual canary runs. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder runConfig(@Nullable Output<CanaryRunConfigArgs> runConfig) {
            $.runConfig = runConfig;
            return this;
        }

        /**
         * @param runConfig Configuration block for individual canary runs. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder runConfig(CanaryRunConfigArgs runConfig) {
            return runConfig(Output.of(runConfig));
        }

        /**
         * @param runtimeVersion Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(@Nullable Output<String> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        /**
         * @param runtimeVersion Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
         * 
         * @return builder
         * 
         */
        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        /**
         * @param s3Bucket Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
         * 
         * @return builder
         * 
         */
        public Builder s3Bucket(@Nullable Output<String> s3Bucket) {
            $.s3Bucket = s3Bucket;
            return this;
        }

        /**
         * @param s3Bucket Full bucket name which is used if your canary script is located in S3. The bucket must already exist. Specify the full bucket name including s3:// as the start of the bucket name. **Conflicts with `zip_file`.**
         * 
         * @return builder
         * 
         */
        public Builder s3Bucket(String s3Bucket) {
            return s3Bucket(Output.of(s3Bucket));
        }

        /**
         * @param s3Key S3 key of your script. **Conflicts with `zip_file`.**
         * 
         * @return builder
         * 
         */
        public Builder s3Key(@Nullable Output<String> s3Key) {
            $.s3Key = s3Key;
            return this;
        }

        /**
         * @param s3Key S3 key of your script. **Conflicts with `zip_file`.**
         * 
         * @return builder
         * 
         */
        public Builder s3Key(String s3Key) {
            return s3Key(Output.of(s3Key));
        }

        /**
         * @param s3Version S3 version ID of your script. **Conflicts with `zip_file`.**
         * 
         * @return builder
         * 
         */
        public Builder s3Version(@Nullable Output<String> s3Version) {
            $.s3Version = s3Version;
            return this;
        }

        /**
         * @param s3Version S3 version ID of your script. **Conflicts with `zip_file`.**
         * 
         * @return builder
         * 
         */
        public Builder s3Version(String s3Version) {
            return s3Version(Output.of(s3Version));
        }

        /**
         * @param schedule Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<CanaryScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(CanaryScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param sourceLocationArn ARN of the Lambda layer where Synthetics stores the canary script code.
         * 
         * @return builder
         * 
         */
        public Builder sourceLocationArn(@Nullable Output<String> sourceLocationArn) {
            $.sourceLocationArn = sourceLocationArn;
            return this;
        }

        /**
         * @param sourceLocationArn ARN of the Lambda layer where Synthetics stores the canary script code.
         * 
         * @return builder
         * 
         */
        public Builder sourceLocationArn(String sourceLocationArn) {
            return sourceLocationArn(Output.of(sourceLocationArn));
        }

        /**
         * @param startCanary Whether to run or stop the canary.
         * 
         * @return builder
         * 
         */
        public Builder startCanary(@Nullable Output<Boolean> startCanary) {
            $.startCanary = startCanary;
            return this;
        }

        /**
         * @param startCanary Whether to run or stop the canary.
         * 
         * @return builder
         * 
         */
        public Builder startCanary(Boolean startCanary) {
            return startCanary(Output.of(startCanary));
        }

        /**
         * @param status Canary status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Canary status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param successRetentionPeriod Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
         * 
         * @return builder
         * 
         */
        public Builder successRetentionPeriod(@Nullable Output<Integer> successRetentionPeriod) {
            $.successRetentionPeriod = successRetentionPeriod;
            return this;
        }

        /**
         * @param successRetentionPeriod Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
         * 
         * @return builder
         * 
         */
        public Builder successRetentionPeriod(Integer successRetentionPeriod) {
            return successRetentionPeriod(Output.of(successRetentionPeriod));
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param timelines Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
         * 
         * @return builder
         * 
         */
        public Builder timelines(@Nullable Output<List<CanaryTimelineArgs>> timelines) {
            $.timelines = timelines;
            return this;
        }

        /**
         * @param timelines Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
         * 
         * @return builder
         * 
         */
        public Builder timelines(List<CanaryTimelineArgs> timelines) {
            return timelines(Output.of(timelines));
        }

        /**
         * @param timelines Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
         * 
         * @return builder
         * 
         */
        public Builder timelines(CanaryTimelineArgs... timelines) {
            return timelines(List.of(timelines));
        }

        /**
         * @param vpcConfig Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfig(@Nullable Output<CanaryVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        /**
         * @param vpcConfig Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfig(CanaryVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        /**
         * @param zipFile ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
         * 
         * @return builder
         * 
         */
        public Builder zipFile(@Nullable Output<String> zipFile) {
            $.zipFile = zipFile;
            return this;
        }

        /**
         * @param zipFile ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 5 MB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
         * 
         * @return builder
         * 
         */
        public Builder zipFile(String zipFile) {
            return zipFile(Output.of(zipFile));
        }

        public CanaryState build() {
            return $;
        }
    }

}
