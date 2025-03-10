// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaResourceHealthArgs;
import com.pulumi.azure.monitoring.inputs.ActivityLogAlertCriteriaServiceHealthArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActivityLogAlertCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActivityLogAlertCriteriaArgs Empty = new ActivityLogAlertCriteriaArgs();

    /**
     * The email address or Azure Active Directory identifier of the user who performed the operation.
     * 
     */
    @Import(name="caller")
    private @Nullable Output<String> caller;

    /**
     * @return The email address or Azure Active Directory identifier of the user who performed the operation.
     * 
     */
    public Optional<Output<String>> caller() {
        return Optional.ofNullable(this.caller);
    }

    /**
     * The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
     * 
     */
    @Import(name="category", required=true)
    private Output<String> category;

    /**
     * @return The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
     * 
     */
    public Output<String> category() {
        return this.category;
    }

    /**
     * The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
     * 
     */
    @Import(name="operationName")
    private @Nullable Output<String> operationName;

    /**
     * @return The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
     * 
     */
    public Optional<Output<String>> operationName() {
        return Optional.ofNullable(this.operationName);
    }

    /**
     * The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence` and `Performance`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    @Import(name="recommendationCategory")
    private @Nullable Output<String> recommendationCategory;

    /**
     * @return The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence` and `Performance`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    public Optional<Output<String>> recommendationCategory() {
        return Optional.ofNullable(this.recommendationCategory);
    }

    /**
     * The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    @Import(name="recommendationImpact")
    private @Nullable Output<String> recommendationImpact;

    /**
     * @return The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
     * 
     */
    public Optional<Output<String>> recommendationImpact() {
        return Optional.ofNullable(this.recommendationImpact);
    }

    /**
     * The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
     * 
     */
    @Import(name="recommendationType")
    private @Nullable Output<String> recommendationType;

    /**
     * @return The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
     * 
     */
    public Optional<Output<String>> recommendationType() {
        return Optional.ofNullable(this.recommendationType);
    }

    /**
     * The name of resource group monitored by the activity log alert.
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return The name of resource group monitored by the activity log alert.
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * A block to define fine grain resource health settings.
     * 
     */
    @Import(name="resourceHealths")
    private @Nullable Output<List<ActivityLogAlertCriteriaResourceHealthArgs>> resourceHealths;

    /**
     * @return A block to define fine grain resource health settings.
     * 
     */
    public Optional<Output<List<ActivityLogAlertCriteriaResourceHealthArgs>>> resourceHealths() {
        return Optional.ofNullable(this.resourceHealths);
    }

    /**
     * The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The name of the resource provider monitored by the activity log alert.
     * 
     */
    @Import(name="resourceProvider")
    private @Nullable Output<String> resourceProvider;

    /**
     * @return The name of the resource provider monitored by the activity log alert.
     * 
     */
    public Optional<Output<String>> resourceProvider() {
        return Optional.ofNullable(this.resourceProvider);
    }

    /**
     * The resource type monitored by the activity log alert.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The resource type monitored by the activity log alert.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * A block to define fine grain service health settings.
     * 
     */
    @Import(name="serviceHealths")
    private @Nullable Output<List<ActivityLogAlertCriteriaServiceHealthArgs>> serviceHealths;

    /**
     * @return A block to define fine grain service health settings.
     * 
     */
    public Optional<Output<List<ActivityLogAlertCriteriaServiceHealthArgs>>> serviceHealths() {
        return Optional.ofNullable(this.serviceHealths);
    }

    /**
     * The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The sub status of the event.
     * 
     */
    @Import(name="subStatus")
    private @Nullable Output<String> subStatus;

    /**
     * @return The sub status of the event.
     * 
     */
    public Optional<Output<String>> subStatus() {
        return Optional.ofNullable(this.subStatus);
    }

    private ActivityLogAlertCriteriaArgs() {}

    private ActivityLogAlertCriteriaArgs(ActivityLogAlertCriteriaArgs $) {
        this.caller = $.caller;
        this.category = $.category;
        this.level = $.level;
        this.operationName = $.operationName;
        this.recommendationCategory = $.recommendationCategory;
        this.recommendationImpact = $.recommendationImpact;
        this.recommendationType = $.recommendationType;
        this.resourceGroup = $.resourceGroup;
        this.resourceHealths = $.resourceHealths;
        this.resourceId = $.resourceId;
        this.resourceProvider = $.resourceProvider;
        this.resourceType = $.resourceType;
        this.serviceHealths = $.serviceHealths;
        this.status = $.status;
        this.subStatus = $.subStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityLogAlertCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityLogAlertCriteriaArgs $;

        public Builder() {
            $ = new ActivityLogAlertCriteriaArgs();
        }

        public Builder(ActivityLogAlertCriteriaArgs defaults) {
            $ = new ActivityLogAlertCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caller The email address or Azure Active Directory identifier of the user who performed the operation.
         * 
         * @return builder
         * 
         */
        public Builder caller(@Nullable Output<String> caller) {
            $.caller = caller;
            return this;
        }

        /**
         * @param caller The email address or Azure Active Directory identifier of the user who performed the operation.
         * 
         * @return builder
         * 
         */
        public Builder caller(String caller) {
            return caller(Output.of(caller));
        }

        /**
         * @param category The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
         * 
         * @return builder
         * 
         */
        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The category of the operation. Possible values are `Administrative`, `Autoscale`, `Policy`, `Recommendation`, `ResourceHealth`, `Security` and `ServiceHealth`.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param level The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The severity level of the event. Possible values are `Verbose`, `Informational`, `Warning`, `Error`, and `Critical`.
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param operationName The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder operationName(@Nullable Output<String> operationName) {
            $.operationName = operationName;
            return this;
        }

        /**
         * @param operationName The Resource Manager Role-Based Access Control operation name. Supported operation should be of the form: `&lt;resourceProvider&gt;/&lt;resourceType&gt;/&lt;operation&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder operationName(String operationName) {
            return operationName(Output.of(operationName));
        }

        /**
         * @param recommendationCategory The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence` and `Performance`. It is only allowed when `category` is `Recommendation`.
         * 
         * @return builder
         * 
         */
        public Builder recommendationCategory(@Nullable Output<String> recommendationCategory) {
            $.recommendationCategory = recommendationCategory;
            return this;
        }

        /**
         * @param recommendationCategory The recommendation category of the event. Possible values are `Cost`, `Reliability`, `OperationalExcellence` and `Performance`. It is only allowed when `category` is `Recommendation`.
         * 
         * @return builder
         * 
         */
        public Builder recommendationCategory(String recommendationCategory) {
            return recommendationCategory(Output.of(recommendationCategory));
        }

        /**
         * @param recommendationImpact The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
         * 
         * @return builder
         * 
         */
        public Builder recommendationImpact(@Nullable Output<String> recommendationImpact) {
            $.recommendationImpact = recommendationImpact;
            return this;
        }

        /**
         * @param recommendationImpact The recommendation impact of the event. Possible values are `High`, `Medium` and `Low`. It is only allowed when `category` is `Recommendation`.
         * 
         * @return builder
         * 
         */
        public Builder recommendationImpact(String recommendationImpact) {
            return recommendationImpact(Output.of(recommendationImpact));
        }

        /**
         * @param recommendationType The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
         * 
         * @return builder
         * 
         */
        public Builder recommendationType(@Nullable Output<String> recommendationType) {
            $.recommendationType = recommendationType;
            return this;
        }

        /**
         * @param recommendationType The recommendation type of the event. It is only allowed when `category` is `Recommendation`.
         * 
         * @return builder
         * 
         */
        public Builder recommendationType(String recommendationType) {
            return recommendationType(Output.of(recommendationType));
        }

        /**
         * @param resourceGroup The name of resource group monitored by the activity log alert.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup The name of resource group monitored by the activity log alert.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param resourceHealths A block to define fine grain resource health settings.
         * 
         * @return builder
         * 
         */
        public Builder resourceHealths(@Nullable Output<List<ActivityLogAlertCriteriaResourceHealthArgs>> resourceHealths) {
            $.resourceHealths = resourceHealths;
            return this;
        }

        /**
         * @param resourceHealths A block to define fine grain resource health settings.
         * 
         * @return builder
         * 
         */
        public Builder resourceHealths(List<ActivityLogAlertCriteriaResourceHealthArgs> resourceHealths) {
            return resourceHealths(Output.of(resourceHealths));
        }

        /**
         * @param resourceHealths A block to define fine grain resource health settings.
         * 
         * @return builder
         * 
         */
        public Builder resourceHealths(ActivityLogAlertCriteriaResourceHealthArgs... resourceHealths) {
            return resourceHealths(List.of(resourceHealths));
        }

        /**
         * @param resourceId The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The specific resource monitored by the activity log alert. It should be within one of the `scopes`.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceProvider The name of the resource provider monitored by the activity log alert.
         * 
         * @return builder
         * 
         */
        public Builder resourceProvider(@Nullable Output<String> resourceProvider) {
            $.resourceProvider = resourceProvider;
            return this;
        }

        /**
         * @param resourceProvider The name of the resource provider monitored by the activity log alert.
         * 
         * @return builder
         * 
         */
        public Builder resourceProvider(String resourceProvider) {
            return resourceProvider(Output.of(resourceProvider));
        }

        /**
         * @param resourceType The resource type monitored by the activity log alert.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The resource type monitored by the activity log alert.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param serviceHealths A block to define fine grain service health settings.
         * 
         * @return builder
         * 
         */
        public Builder serviceHealths(@Nullable Output<List<ActivityLogAlertCriteriaServiceHealthArgs>> serviceHealths) {
            $.serviceHealths = serviceHealths;
            return this;
        }

        /**
         * @param serviceHealths A block to define fine grain service health settings.
         * 
         * @return builder
         * 
         */
        public Builder serviceHealths(List<ActivityLogAlertCriteriaServiceHealthArgs> serviceHealths) {
            return serviceHealths(Output.of(serviceHealths));
        }

        /**
         * @param serviceHealths A block to define fine grain service health settings.
         * 
         * @return builder
         * 
         */
        public Builder serviceHealths(ActivityLogAlertCriteriaServiceHealthArgs... serviceHealths) {
            return serviceHealths(List.of(serviceHealths));
        }

        /**
         * @param status The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the event. For example, `Started`, `Failed`, or `Succeeded`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subStatus The sub status of the event.
         * 
         * @return builder
         * 
         */
        public Builder subStatus(@Nullable Output<String> subStatus) {
            $.subStatus = subStatus;
            return this;
        }

        /**
         * @param subStatus The sub status of the event.
         * 
         * @return builder
         * 
         */
        public Builder subStatus(String subStatus) {
            return subStatus(Output.of(subStatus));
        }

        public ActivityLogAlertCriteriaArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            return $;
        }
    }

}
