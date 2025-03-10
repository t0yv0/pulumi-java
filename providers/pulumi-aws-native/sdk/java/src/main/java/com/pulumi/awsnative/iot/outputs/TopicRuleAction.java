// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.TopicRuleCloudwatchAlarmAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleCloudwatchLogsAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleCloudwatchMetricAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleDynamoDBAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleDynamoDBv2Action;
import com.pulumi.awsnative.iot.outputs.TopicRuleElasticsearchAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleFirehoseAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleHttpAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleIotAnalyticsAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleIotEventsAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleIotSiteWiseAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleKafkaAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleKinesisAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleLambdaAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleOpenSearchAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleRepublishAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleS3Action;
import com.pulumi.awsnative.iot.outputs.TopicRuleSnsAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleSqsAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleStepFunctionsAction;
import com.pulumi.awsnative.iot.outputs.TopicRuleTimestreamAction;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleAction {
    private final @Nullable TopicRuleCloudwatchAlarmAction cloudwatchAlarm;
    private final @Nullable TopicRuleCloudwatchLogsAction cloudwatchLogs;
    private final @Nullable TopicRuleCloudwatchMetricAction cloudwatchMetric;
    private final @Nullable TopicRuleDynamoDBAction dynamoDB;
    private final @Nullable TopicRuleDynamoDBv2Action dynamoDBv2;
    private final @Nullable TopicRuleElasticsearchAction elasticsearch;
    private final @Nullable TopicRuleFirehoseAction firehose;
    private final @Nullable TopicRuleHttpAction http;
    private final @Nullable TopicRuleIotAnalyticsAction iotAnalytics;
    private final @Nullable TopicRuleIotEventsAction iotEvents;
    private final @Nullable TopicRuleIotSiteWiseAction iotSiteWise;
    private final @Nullable TopicRuleKafkaAction kafka;
    private final @Nullable TopicRuleKinesisAction kinesis;
    private final @Nullable TopicRuleLambdaAction lambda;
    private final @Nullable TopicRuleOpenSearchAction openSearch;
    private final @Nullable TopicRuleRepublishAction republish;
    private final @Nullable TopicRuleS3Action s3;
    private final @Nullable TopicRuleSnsAction sns;
    private final @Nullable TopicRuleSqsAction sqs;
    private final @Nullable TopicRuleStepFunctionsAction stepFunctions;
    private final @Nullable TopicRuleTimestreamAction timestream;

    @CustomType.Constructor
    private TopicRuleAction(
        @CustomType.Parameter("cloudwatchAlarm") @Nullable TopicRuleCloudwatchAlarmAction cloudwatchAlarm,
        @CustomType.Parameter("cloudwatchLogs") @Nullable TopicRuleCloudwatchLogsAction cloudwatchLogs,
        @CustomType.Parameter("cloudwatchMetric") @Nullable TopicRuleCloudwatchMetricAction cloudwatchMetric,
        @CustomType.Parameter("dynamoDB") @Nullable TopicRuleDynamoDBAction dynamoDB,
        @CustomType.Parameter("dynamoDBv2") @Nullable TopicRuleDynamoDBv2Action dynamoDBv2,
        @CustomType.Parameter("elasticsearch") @Nullable TopicRuleElasticsearchAction elasticsearch,
        @CustomType.Parameter("firehose") @Nullable TopicRuleFirehoseAction firehose,
        @CustomType.Parameter("http") @Nullable TopicRuleHttpAction http,
        @CustomType.Parameter("iotAnalytics") @Nullable TopicRuleIotAnalyticsAction iotAnalytics,
        @CustomType.Parameter("iotEvents") @Nullable TopicRuleIotEventsAction iotEvents,
        @CustomType.Parameter("iotSiteWise") @Nullable TopicRuleIotSiteWiseAction iotSiteWise,
        @CustomType.Parameter("kafka") @Nullable TopicRuleKafkaAction kafka,
        @CustomType.Parameter("kinesis") @Nullable TopicRuleKinesisAction kinesis,
        @CustomType.Parameter("lambda") @Nullable TopicRuleLambdaAction lambda,
        @CustomType.Parameter("openSearch") @Nullable TopicRuleOpenSearchAction openSearch,
        @CustomType.Parameter("republish") @Nullable TopicRuleRepublishAction republish,
        @CustomType.Parameter("s3") @Nullable TopicRuleS3Action s3,
        @CustomType.Parameter("sns") @Nullable TopicRuleSnsAction sns,
        @CustomType.Parameter("sqs") @Nullable TopicRuleSqsAction sqs,
        @CustomType.Parameter("stepFunctions") @Nullable TopicRuleStepFunctionsAction stepFunctions,
        @CustomType.Parameter("timestream") @Nullable TopicRuleTimestreamAction timestream) {
        this.cloudwatchAlarm = cloudwatchAlarm;
        this.cloudwatchLogs = cloudwatchLogs;
        this.cloudwatchMetric = cloudwatchMetric;
        this.dynamoDB = dynamoDB;
        this.dynamoDBv2 = dynamoDBv2;
        this.elasticsearch = elasticsearch;
        this.firehose = firehose;
        this.http = http;
        this.iotAnalytics = iotAnalytics;
        this.iotEvents = iotEvents;
        this.iotSiteWise = iotSiteWise;
        this.kafka = kafka;
        this.kinesis = kinesis;
        this.lambda = lambda;
        this.openSearch = openSearch;
        this.republish = republish;
        this.s3 = s3;
        this.sns = sns;
        this.sqs = sqs;
        this.stepFunctions = stepFunctions;
        this.timestream = timestream;
    }

    public Optional<TopicRuleCloudwatchAlarmAction> cloudwatchAlarm() {
        return Optional.ofNullable(this.cloudwatchAlarm);
    }
    public Optional<TopicRuleCloudwatchLogsAction> cloudwatchLogs() {
        return Optional.ofNullable(this.cloudwatchLogs);
    }
    public Optional<TopicRuleCloudwatchMetricAction> cloudwatchMetric() {
        return Optional.ofNullable(this.cloudwatchMetric);
    }
    public Optional<TopicRuleDynamoDBAction> dynamoDB() {
        return Optional.ofNullable(this.dynamoDB);
    }
    public Optional<TopicRuleDynamoDBv2Action> dynamoDBv2() {
        return Optional.ofNullable(this.dynamoDBv2);
    }
    public Optional<TopicRuleElasticsearchAction> elasticsearch() {
        return Optional.ofNullable(this.elasticsearch);
    }
    public Optional<TopicRuleFirehoseAction> firehose() {
        return Optional.ofNullable(this.firehose);
    }
    public Optional<TopicRuleHttpAction> http() {
        return Optional.ofNullable(this.http);
    }
    public Optional<TopicRuleIotAnalyticsAction> iotAnalytics() {
        return Optional.ofNullable(this.iotAnalytics);
    }
    public Optional<TopicRuleIotEventsAction> iotEvents() {
        return Optional.ofNullable(this.iotEvents);
    }
    public Optional<TopicRuleIotSiteWiseAction> iotSiteWise() {
        return Optional.ofNullable(this.iotSiteWise);
    }
    public Optional<TopicRuleKafkaAction> kafka() {
        return Optional.ofNullable(this.kafka);
    }
    public Optional<TopicRuleKinesisAction> kinesis() {
        return Optional.ofNullable(this.kinesis);
    }
    public Optional<TopicRuleLambdaAction> lambda() {
        return Optional.ofNullable(this.lambda);
    }
    public Optional<TopicRuleOpenSearchAction> openSearch() {
        return Optional.ofNullable(this.openSearch);
    }
    public Optional<TopicRuleRepublishAction> republish() {
        return Optional.ofNullable(this.republish);
    }
    public Optional<TopicRuleS3Action> s3() {
        return Optional.ofNullable(this.s3);
    }
    public Optional<TopicRuleSnsAction> sns() {
        return Optional.ofNullable(this.sns);
    }
    public Optional<TopicRuleSqsAction> sqs() {
        return Optional.ofNullable(this.sqs);
    }
    public Optional<TopicRuleStepFunctionsAction> stepFunctions() {
        return Optional.ofNullable(this.stepFunctions);
    }
    public Optional<TopicRuleTimestreamAction> timestream() {
        return Optional.ofNullable(this.timestream);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TopicRuleCloudwatchAlarmAction cloudwatchAlarm;
        private @Nullable TopicRuleCloudwatchLogsAction cloudwatchLogs;
        private @Nullable TopicRuleCloudwatchMetricAction cloudwatchMetric;
        private @Nullable TopicRuleDynamoDBAction dynamoDB;
        private @Nullable TopicRuleDynamoDBv2Action dynamoDBv2;
        private @Nullable TopicRuleElasticsearchAction elasticsearch;
        private @Nullable TopicRuleFirehoseAction firehose;
        private @Nullable TopicRuleHttpAction http;
        private @Nullable TopicRuleIotAnalyticsAction iotAnalytics;
        private @Nullable TopicRuleIotEventsAction iotEvents;
        private @Nullable TopicRuleIotSiteWiseAction iotSiteWise;
        private @Nullable TopicRuleKafkaAction kafka;
        private @Nullable TopicRuleKinesisAction kinesis;
        private @Nullable TopicRuleLambdaAction lambda;
        private @Nullable TopicRuleOpenSearchAction openSearch;
        private @Nullable TopicRuleRepublishAction republish;
        private @Nullable TopicRuleS3Action s3;
        private @Nullable TopicRuleSnsAction sns;
        private @Nullable TopicRuleSqsAction sqs;
        private @Nullable TopicRuleStepFunctionsAction stepFunctions;
        private @Nullable TopicRuleTimestreamAction timestream;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchAlarm = defaults.cloudwatchAlarm;
    	      this.cloudwatchLogs = defaults.cloudwatchLogs;
    	      this.cloudwatchMetric = defaults.cloudwatchMetric;
    	      this.dynamoDB = defaults.dynamoDB;
    	      this.dynamoDBv2 = defaults.dynamoDBv2;
    	      this.elasticsearch = defaults.elasticsearch;
    	      this.firehose = defaults.firehose;
    	      this.http = defaults.http;
    	      this.iotAnalytics = defaults.iotAnalytics;
    	      this.iotEvents = defaults.iotEvents;
    	      this.iotSiteWise = defaults.iotSiteWise;
    	      this.kafka = defaults.kafka;
    	      this.kinesis = defaults.kinesis;
    	      this.lambda = defaults.lambda;
    	      this.openSearch = defaults.openSearch;
    	      this.republish = defaults.republish;
    	      this.s3 = defaults.s3;
    	      this.sns = defaults.sns;
    	      this.sqs = defaults.sqs;
    	      this.stepFunctions = defaults.stepFunctions;
    	      this.timestream = defaults.timestream;
        }

        public Builder cloudwatchAlarm(@Nullable TopicRuleCloudwatchAlarmAction cloudwatchAlarm) {
            this.cloudwatchAlarm = cloudwatchAlarm;
            return this;
        }
        public Builder cloudwatchLogs(@Nullable TopicRuleCloudwatchLogsAction cloudwatchLogs) {
            this.cloudwatchLogs = cloudwatchLogs;
            return this;
        }
        public Builder cloudwatchMetric(@Nullable TopicRuleCloudwatchMetricAction cloudwatchMetric) {
            this.cloudwatchMetric = cloudwatchMetric;
            return this;
        }
        public Builder dynamoDB(@Nullable TopicRuleDynamoDBAction dynamoDB) {
            this.dynamoDB = dynamoDB;
            return this;
        }
        public Builder dynamoDBv2(@Nullable TopicRuleDynamoDBv2Action dynamoDBv2) {
            this.dynamoDBv2 = dynamoDBv2;
            return this;
        }
        public Builder elasticsearch(@Nullable TopicRuleElasticsearchAction elasticsearch) {
            this.elasticsearch = elasticsearch;
            return this;
        }
        public Builder firehose(@Nullable TopicRuleFirehoseAction firehose) {
            this.firehose = firehose;
            return this;
        }
        public Builder http(@Nullable TopicRuleHttpAction http) {
            this.http = http;
            return this;
        }
        public Builder iotAnalytics(@Nullable TopicRuleIotAnalyticsAction iotAnalytics) {
            this.iotAnalytics = iotAnalytics;
            return this;
        }
        public Builder iotEvents(@Nullable TopicRuleIotEventsAction iotEvents) {
            this.iotEvents = iotEvents;
            return this;
        }
        public Builder iotSiteWise(@Nullable TopicRuleIotSiteWiseAction iotSiteWise) {
            this.iotSiteWise = iotSiteWise;
            return this;
        }
        public Builder kafka(@Nullable TopicRuleKafkaAction kafka) {
            this.kafka = kafka;
            return this;
        }
        public Builder kinesis(@Nullable TopicRuleKinesisAction kinesis) {
            this.kinesis = kinesis;
            return this;
        }
        public Builder lambda(@Nullable TopicRuleLambdaAction lambda) {
            this.lambda = lambda;
            return this;
        }
        public Builder openSearch(@Nullable TopicRuleOpenSearchAction openSearch) {
            this.openSearch = openSearch;
            return this;
        }
        public Builder republish(@Nullable TopicRuleRepublishAction republish) {
            this.republish = republish;
            return this;
        }
        public Builder s3(@Nullable TopicRuleS3Action s3) {
            this.s3 = s3;
            return this;
        }
        public Builder sns(@Nullable TopicRuleSnsAction sns) {
            this.sns = sns;
            return this;
        }
        public Builder sqs(@Nullable TopicRuleSqsAction sqs) {
            this.sqs = sqs;
            return this;
        }
        public Builder stepFunctions(@Nullable TopicRuleStepFunctionsAction stepFunctions) {
            this.stepFunctions = stepFunctions;
            return this;
        }
        public Builder timestream(@Nullable TopicRuleTimestreamAction timestream) {
            this.timestream = timestream;
            return this;
        }        public TopicRuleAction build() {
            return new TopicRuleAction(cloudwatchAlarm, cloudwatchLogs, cloudwatchMetric, dynamoDB, dynamoDBv2, elasticsearch, firehose, http, iotAnalytics, iotEvents, iotSiteWise, kafka, kinesis, lambda, openSearch, republish, s3, sns, sqs, stepFunctions, timestream);
        }
    }
}
