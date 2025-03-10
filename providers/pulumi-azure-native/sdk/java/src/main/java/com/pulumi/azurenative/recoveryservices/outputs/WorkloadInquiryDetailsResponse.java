// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.InquiryValidationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadInquiryDetailsResponse {
    /**
     * @return Inquiry validation such as permissions and other backup validations.
     * 
     */
    private final @Nullable InquiryValidationResponse inquiryValidation;
    /**
     * @return Contains the protectable item Count inside this Container.
     * 
     */
    private final @Nullable Double itemCount;
    /**
     * @return Type of the Workload such as SQL, Oracle etc.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private WorkloadInquiryDetailsResponse(
        @CustomType.Parameter("inquiryValidation") @Nullable InquiryValidationResponse inquiryValidation,
        @CustomType.Parameter("itemCount") @Nullable Double itemCount,
        @CustomType.Parameter("type") @Nullable String type) {
        this.inquiryValidation = inquiryValidation;
        this.itemCount = itemCount;
        this.type = type;
    }

    /**
     * @return Inquiry validation such as permissions and other backup validations.
     * 
     */
    public Optional<InquiryValidationResponse> inquiryValidation() {
        return Optional.ofNullable(this.inquiryValidation);
    }
    /**
     * @return Contains the protectable item Count inside this Container.
     * 
     */
    public Optional<Double> itemCount() {
        return Optional.ofNullable(this.itemCount);
    }
    /**
     * @return Type of the Workload such as SQL, Oracle etc.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadInquiryDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InquiryValidationResponse inquiryValidation;
        private @Nullable Double itemCount;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadInquiryDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inquiryValidation = defaults.inquiryValidation;
    	      this.itemCount = defaults.itemCount;
    	      this.type = defaults.type;
        }

        public Builder inquiryValidation(@Nullable InquiryValidationResponse inquiryValidation) {
            this.inquiryValidation = inquiryValidation;
            return this;
        }
        public Builder itemCount(@Nullable Double itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public WorkloadInquiryDetailsResponse build() {
            return new WorkloadInquiryDetailsResponse(inquiryValidation, itemCount, type);
        }
    }
}
