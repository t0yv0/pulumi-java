// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetActionGroupAzureAppPushReceiver {
    /**
     * @return The email address of this receiver.
     * 
     */
    private final String emailAddress;
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetActionGroupAzureAppPushReceiver(
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("name") String name) {
        this.emailAddress = emailAddress;
        this.name = name;
    }

    /**
     * @return The email address of this receiver.
     * 
     */
    public String emailAddress() {
        return this.emailAddress;
    }
    /**
     * @return Specifies the name of the Action Group.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetActionGroupAzureAppPushReceiver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetActionGroupAzureAppPushReceiver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetActionGroupAzureAppPushReceiver build() {
            return new GetActionGroupAzureAppPushReceiver(emailAddress, name);
        }
    }
}
