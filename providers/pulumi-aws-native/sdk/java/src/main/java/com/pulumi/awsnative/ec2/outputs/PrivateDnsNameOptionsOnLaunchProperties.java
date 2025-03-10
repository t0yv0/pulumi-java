// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateDnsNameOptionsOnLaunchProperties {
    private final @Nullable Boolean enableResourceNameDnsAAAARecord;
    private final @Nullable Boolean enableResourceNameDnsARecord;
    private final @Nullable String hostnameType;

    @CustomType.Constructor
    private PrivateDnsNameOptionsOnLaunchProperties(
        @CustomType.Parameter("enableResourceNameDnsAAAARecord") @Nullable Boolean enableResourceNameDnsAAAARecord,
        @CustomType.Parameter("enableResourceNameDnsARecord") @Nullable Boolean enableResourceNameDnsARecord,
        @CustomType.Parameter("hostnameType") @Nullable String hostnameType) {
        this.enableResourceNameDnsAAAARecord = enableResourceNameDnsAAAARecord;
        this.enableResourceNameDnsARecord = enableResourceNameDnsARecord;
        this.hostnameType = hostnameType;
    }

    public Optional<Boolean> enableResourceNameDnsAAAARecord() {
        return Optional.ofNullable(this.enableResourceNameDnsAAAARecord);
    }
    public Optional<Boolean> enableResourceNameDnsARecord() {
        return Optional.ofNullable(this.enableResourceNameDnsARecord);
    }
    public Optional<String> hostnameType() {
        return Optional.ofNullable(this.hostnameType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateDnsNameOptionsOnLaunchProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableResourceNameDnsAAAARecord;
        private @Nullable Boolean enableResourceNameDnsARecord;
        private @Nullable String hostnameType;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateDnsNameOptionsOnLaunchProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableResourceNameDnsAAAARecord = defaults.enableResourceNameDnsAAAARecord;
    	      this.enableResourceNameDnsARecord = defaults.enableResourceNameDnsARecord;
    	      this.hostnameType = defaults.hostnameType;
        }

        public Builder enableResourceNameDnsAAAARecord(@Nullable Boolean enableResourceNameDnsAAAARecord) {
            this.enableResourceNameDnsAAAARecord = enableResourceNameDnsAAAARecord;
            return this;
        }
        public Builder enableResourceNameDnsARecord(@Nullable Boolean enableResourceNameDnsARecord) {
            this.enableResourceNameDnsARecord = enableResourceNameDnsARecord;
            return this;
        }
        public Builder hostnameType(@Nullable String hostnameType) {
            this.hostnameType = hostnameType;
            return this;
        }        public PrivateDnsNameOptionsOnLaunchProperties build() {
            return new PrivateDnsNameOptionsOnLaunchProperties(enableResourceNameDnsAAAARecord, enableResourceNameDnsARecord, hostnameType);
        }
    }
}
