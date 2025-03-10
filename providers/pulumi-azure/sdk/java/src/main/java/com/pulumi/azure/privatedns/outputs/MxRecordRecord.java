// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MxRecordRecord {
    /**
     * @return The FQDN of the exchange to MX record points to.
     * 
     */
    private final String exchange;
    /**
     * @return The preference of the MX record.
     * 
     */
    private final Integer preference;

    @CustomType.Constructor
    private MxRecordRecord(
        @CustomType.Parameter("exchange") String exchange,
        @CustomType.Parameter("preference") Integer preference) {
        this.exchange = exchange;
        this.preference = preference;
    }

    /**
     * @return The FQDN of the exchange to MX record points to.
     * 
     */
    public String exchange() {
        return this.exchange;
    }
    /**
     * @return The preference of the MX record.
     * 
     */
    public Integer preference() {
        return this.preference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MxRecordRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exchange;
        private Integer preference;

        public Builder() {
    	      // Empty
        }

        public Builder(MxRecordRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.preference = defaults.preference;
        }

        public Builder exchange(String exchange) {
            this.exchange = Objects.requireNonNull(exchange);
            return this;
        }
        public Builder preference(Integer preference) {
            this.preference = Objects.requireNonNull(preference);
            return this;
        }        public MxRecordRecord build() {
            return new MxRecordRecord(exchange, preference);
        }
    }
}
