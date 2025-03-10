// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.outputs;

import com.pulumi.azurenative.costmanagement.outputs.FileDestinationResponse;
import com.pulumi.azurenative.costmanagement.outputs.NotificationPropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.SchedulePropertiesResponse;
import com.pulumi.azurenative.costmanagement.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScheduledActionResult {
    /**
     * @return Scheduled action name.
     * 
     */
    private final String displayName;
    /**
     * @return Resource Etag.
     * 
     */
    private final String eTag;
    /**
     * @return Destination format of the view data.
     * 
     */
    private final @Nullable FileDestinationResponse fileDestination;
    /**
     * @return Resource Id.
     * 
     */
    private final String id;
    /**
     * @return Kind of the scheduled action.
     * 
     */
    private final @Nullable String kind;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Notification properties based on scheduled action kind.
     * 
     */
    private final NotificationPropertiesResponse notification;
    /**
     * @return Schedule of the scheduled action.
     * 
     */
    private final SchedulePropertiesResponse schedule;
    /**
     * @return Cost Management scope like &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    private final @Nullable String scope;
    /**
     * @return Status of the scheduled action.
     * 
     */
    private final String status;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return Cost analysis viewId used for scheduled action. For example, &#39;/providers/Microsoft.CostManagement/views/swaggerExample&#39;
     * 
     */
    private final String viewId;

    @CustomType.Constructor
    private GetScheduledActionResult(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("eTag") String eTag,
        @CustomType.Parameter("fileDestination") @Nullable FileDestinationResponse fileDestination,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notification") NotificationPropertiesResponse notification,
        @CustomType.Parameter("schedule") SchedulePropertiesResponse schedule,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("viewId") String viewId) {
        this.displayName = displayName;
        this.eTag = eTag;
        this.fileDestination = fileDestination;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.notification = notification;
        this.schedule = schedule;
        this.scope = scope;
        this.status = status;
        this.systemData = systemData;
        this.type = type;
        this.viewId = viewId;
    }

    /**
     * @return Scheduled action name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Resource Etag.
     * 
     */
    public String eTag() {
        return this.eTag;
    }
    /**
     * @return Destination format of the view data.
     * 
     */
    public Optional<FileDestinationResponse> fileDestination() {
        return Optional.ofNullable(this.fileDestination);
    }
    /**
     * @return Resource Id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Kind of the scheduled action.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Notification properties based on scheduled action kind.
     * 
     */
    public NotificationPropertiesResponse notification() {
        return this.notification;
    }
    /**
     * @return Schedule of the scheduled action.
     * 
     */
    public SchedulePropertiesResponse schedule() {
        return this.schedule;
    }
    /**
     * @return Cost Management scope like &#39;subscriptions/{subscriptionId}&#39; for subscription scope, &#39;subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}&#39; for resourceGroup scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}&#39; for Billing Account scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}&#39; for Department scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/enrollmentAccounts/{enrollmentAccountId}&#39; for EnrollmentAccount scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}&#39; for BillingProfile scope, &#39;providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}&#39; for InvoiceSection scope, &#39;/providers/Microsoft.CostManagement/externalBillingAccounts/{externalBillingAccountName}&#39; for ExternalBillingAccount scope, and &#39;/providers/Microsoft.CostManagement/externalSubscriptions/{externalSubscriptionName}&#39; for ExternalSubscription scope.
     * 
     */
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * @return Status of the scheduled action.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Cost analysis viewId used for scheduled action. For example, &#39;/providers/Microsoft.CostManagement/views/swaggerExample&#39;
     * 
     */
    public String viewId() {
        return this.viewId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledActionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String eTag;
        private @Nullable FileDestinationResponse fileDestination;
        private String id;
        private @Nullable String kind;
        private String name;
        private NotificationPropertiesResponse notification;
        private SchedulePropertiesResponse schedule;
        private @Nullable String scope;
        private String status;
        private SystemDataResponse systemData;
        private String type;
        private String viewId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledActionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.eTag = defaults.eTag;
    	      this.fileDestination = defaults.fileDestination;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.notification = defaults.notification;
    	      this.schedule = defaults.schedule;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.viewId = defaults.viewId;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder eTag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }
        public Builder fileDestination(@Nullable FileDestinationResponse fileDestination) {
            this.fileDestination = fileDestination;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notification(NotificationPropertiesResponse notification) {
            this.notification = Objects.requireNonNull(notification);
            return this;
        }
        public Builder schedule(SchedulePropertiesResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder viewId(String viewId) {
            this.viewId = Objects.requireNonNull(viewId);
            return this;
        }        public GetScheduledActionResult build() {
            return new GetScheduledActionResult(displayName, eTag, fileDestination, id, kind, name, notification, schedule, scope, status, systemData, type, viewId);
        }
    }
}
