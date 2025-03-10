// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetLinuxFunctionAppSiteConfigAppServiceLog {
    /**
     * @return The amount of disk space used for logs.
     * 
     */
    private final Integer diskQuotaMb;
    /**
     * @return After how many days backups are deleted.
     * 
     */
    private final Integer retentionPeriodDays;

    @CustomType.Constructor
    private GetLinuxFunctionAppSiteConfigAppServiceLog(
        @CustomType.Parameter("diskQuotaMb") Integer diskQuotaMb,
        @CustomType.Parameter("retentionPeriodDays") Integer retentionPeriodDays) {
        this.diskQuotaMb = diskQuotaMb;
        this.retentionPeriodDays = retentionPeriodDays;
    }

    /**
     * @return The amount of disk space used for logs.
     * 
     */
    public Integer diskQuotaMb() {
        return this.diskQuotaMb;
    }
    /**
     * @return After how many days backups are deleted.
     * 
     */
    public Integer retentionPeriodDays() {
        return this.retentionPeriodDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxFunctionAppSiteConfigAppServiceLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskQuotaMb;
        private Integer retentionPeriodDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxFunctionAppSiteConfigAppServiceLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskQuotaMb = defaults.diskQuotaMb;
    	      this.retentionPeriodDays = defaults.retentionPeriodDays;
        }

        public Builder diskQuotaMb(Integer diskQuotaMb) {
            this.diskQuotaMb = Objects.requireNonNull(diskQuotaMb);
            return this;
        }
        public Builder retentionPeriodDays(Integer retentionPeriodDays) {
            this.retentionPeriodDays = Objects.requireNonNull(retentionPeriodDays);
            return this;
        }        public GetLinuxFunctionAppSiteConfigAppServiceLog build() {
            return new GetLinuxFunctionAppSiteConfigAppServiceLog(diskQuotaMb, retentionPeriodDays);
        }
    }
}
