// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageInformationResponse {
    /**
     * @return The name of the carrier that is used to ship the import or export drives.
     * 
     */
    private final String carrierName;
    /**
     * @return The number of drives included in the package.
     * 
     */
    private final Double driveCount;
    /**
     * @return The date when the package is shipped.
     * 
     */
    private final String shipDate;
    /**
     * @return The tracking number of the package.
     * 
     */
    private final String trackingNumber;

    @CustomType.Constructor
    private PackageInformationResponse(
        @CustomType.Parameter("carrierName") String carrierName,
        @CustomType.Parameter("driveCount") Double driveCount,
        @CustomType.Parameter("shipDate") String shipDate,
        @CustomType.Parameter("trackingNumber") String trackingNumber) {
        this.carrierName = carrierName;
        this.driveCount = driveCount;
        this.shipDate = shipDate;
        this.trackingNumber = trackingNumber;
    }

    /**
     * @return The name of the carrier that is used to ship the import or export drives.
     * 
     */
    public String carrierName() {
        return this.carrierName;
    }
    /**
     * @return The number of drives included in the package.
     * 
     */
    public Double driveCount() {
        return this.driveCount;
    }
    /**
     * @return The date when the package is shipped.
     * 
     */
    public String shipDate() {
        return this.shipDate;
    }
    /**
     * @return The tracking number of the package.
     * 
     */
    public String trackingNumber() {
        return this.trackingNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierName;
        private Double driveCount;
        private String shipDate;
        private String trackingNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierName = defaults.carrierName;
    	      this.driveCount = defaults.driveCount;
    	      this.shipDate = defaults.shipDate;
    	      this.trackingNumber = defaults.trackingNumber;
        }

        public Builder carrierName(String carrierName) {
            this.carrierName = Objects.requireNonNull(carrierName);
            return this;
        }
        public Builder driveCount(Double driveCount) {
            this.driveCount = Objects.requireNonNull(driveCount);
            return this;
        }
        public Builder shipDate(String shipDate) {
            this.shipDate = Objects.requireNonNull(shipDate);
            return this;
        }
        public Builder trackingNumber(String trackingNumber) {
            this.trackingNumber = Objects.requireNonNull(trackingNumber);
            return this;
        }        public PackageInformationResponse build() {
            return new PackageInformationResponse(carrierName, driveCount, shipDate, trackingNumber);
        }
    }
}
