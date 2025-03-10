// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.azurenative.databox.outputs.AccountCredentialDetailsResponse;
import com.pulumi.azurenative.databox.outputs.ApplianceNetworkConfigurationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataBoxSecretResponse {
    /**
     * @return Per account level access credentials.
     * 
     */
    private final List<AccountCredentialDetailsResponse> accountCredentialDetails;
    /**
     * @return Password for out of the box experience on device.
     * 
     */
    private final String devicePassword;
    /**
     * @return Serial number of the assigned device.
     * 
     */
    private final String deviceSerialNumber;
    /**
     * @return The base 64 encoded public key to authenticate with the device
     * 
     */
    private final String encodedValidationCertPubKey;
    /**
     * @return Network configuration of the appliance.
     * 
     */
    private final List<ApplianceNetworkConfigurationResponse> networkConfigurations;

    @CustomType.Constructor
    private DataBoxSecretResponse(
        @CustomType.Parameter("accountCredentialDetails") List<AccountCredentialDetailsResponse> accountCredentialDetails,
        @CustomType.Parameter("devicePassword") String devicePassword,
        @CustomType.Parameter("deviceSerialNumber") String deviceSerialNumber,
        @CustomType.Parameter("encodedValidationCertPubKey") String encodedValidationCertPubKey,
        @CustomType.Parameter("networkConfigurations") List<ApplianceNetworkConfigurationResponse> networkConfigurations) {
        this.accountCredentialDetails = accountCredentialDetails;
        this.devicePassword = devicePassword;
        this.deviceSerialNumber = deviceSerialNumber;
        this.encodedValidationCertPubKey = encodedValidationCertPubKey;
        this.networkConfigurations = networkConfigurations;
    }

    /**
     * @return Per account level access credentials.
     * 
     */
    public List<AccountCredentialDetailsResponse> accountCredentialDetails() {
        return this.accountCredentialDetails;
    }
    /**
     * @return Password for out of the box experience on device.
     * 
     */
    public String devicePassword() {
        return this.devicePassword;
    }
    /**
     * @return Serial number of the assigned device.
     * 
     */
    public String deviceSerialNumber() {
        return this.deviceSerialNumber;
    }
    /**
     * @return The base 64 encoded public key to authenticate with the device
     * 
     */
    public String encodedValidationCertPubKey() {
        return this.encodedValidationCertPubKey;
    }
    /**
     * @return Network configuration of the appliance.
     * 
     */
    public List<ApplianceNetworkConfigurationResponse> networkConfigurations() {
        return this.networkConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxSecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AccountCredentialDetailsResponse> accountCredentialDetails;
        private String devicePassword;
        private String deviceSerialNumber;
        private String encodedValidationCertPubKey;
        private List<ApplianceNetworkConfigurationResponse> networkConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxSecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountCredentialDetails = defaults.accountCredentialDetails;
    	      this.devicePassword = defaults.devicePassword;
    	      this.deviceSerialNumber = defaults.deviceSerialNumber;
    	      this.encodedValidationCertPubKey = defaults.encodedValidationCertPubKey;
    	      this.networkConfigurations = defaults.networkConfigurations;
        }

        public Builder accountCredentialDetails(List<AccountCredentialDetailsResponse> accountCredentialDetails) {
            this.accountCredentialDetails = Objects.requireNonNull(accountCredentialDetails);
            return this;
        }
        public Builder accountCredentialDetails(AccountCredentialDetailsResponse... accountCredentialDetails) {
            return accountCredentialDetails(List.of(accountCredentialDetails));
        }
        public Builder devicePassword(String devicePassword) {
            this.devicePassword = Objects.requireNonNull(devicePassword);
            return this;
        }
        public Builder deviceSerialNumber(String deviceSerialNumber) {
            this.deviceSerialNumber = Objects.requireNonNull(deviceSerialNumber);
            return this;
        }
        public Builder encodedValidationCertPubKey(String encodedValidationCertPubKey) {
            this.encodedValidationCertPubKey = Objects.requireNonNull(encodedValidationCertPubKey);
            return this;
        }
        public Builder networkConfigurations(List<ApplianceNetworkConfigurationResponse> networkConfigurations) {
            this.networkConfigurations = Objects.requireNonNull(networkConfigurations);
            return this;
        }
        public Builder networkConfigurations(ApplianceNetworkConfigurationResponse... networkConfigurations) {
            return networkConfigurations(List.of(networkConfigurations));
        }        public DataBoxSecretResponse build() {
            return new DataBoxSecretResponse(accountCredentialDetails, devicePassword, deviceSerialNumber, encodedValidationCertPubKey, networkConfigurations);
        }
    }
}
