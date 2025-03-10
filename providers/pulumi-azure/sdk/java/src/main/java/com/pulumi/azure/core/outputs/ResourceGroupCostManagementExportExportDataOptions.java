// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceGroupCostManagementExportExportDataOptions {
    /**
     * @return The time frame for pulling data for the query. If custom, then a specific time period must be provided. Possible values include: `WeekToDate`, `MonthToDate`, `BillingMonthToDate`, `TheLastWeek`, `TheLastMonth`, `TheLastBillingMonth`, `Custom`.
     * 
     */
    private final String timeFrame;
    /**
     * @return The type of the query.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ResourceGroupCostManagementExportExportDataOptions(
        @CustomType.Parameter("timeFrame") String timeFrame,
        @CustomType.Parameter("type") String type) {
        this.timeFrame = timeFrame;
        this.type = type;
    }

    /**
     * @return The time frame for pulling data for the query. If custom, then a specific time period must be provided. Possible values include: `WeekToDate`, `MonthToDate`, `BillingMonthToDate`, `TheLastWeek`, `TheLastMonth`, `TheLastBillingMonth`, `Custom`.
     * 
     */
    public String timeFrame() {
        return this.timeFrame;
    }
    /**
     * @return The type of the query.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGroupCostManagementExportExportDataOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String timeFrame;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGroupCostManagementExportExportDataOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeFrame = defaults.timeFrame;
    	      this.type = defaults.type;
        }

        public Builder timeFrame(String timeFrame) {
            this.timeFrame = Objects.requireNonNull(timeFrame);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ResourceGroupCostManagementExportExportDataOptions build() {
            return new ResourceGroupCostManagementExportExportDataOptions(timeFrame, type);
        }
    }
}
