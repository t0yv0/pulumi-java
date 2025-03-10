// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatabaseEncryptionResponse {
    /**
     * @return Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * 
     */
    private final String keyName;
    /**
     * @return Denotes the state of etcd encryption.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private DatabaseEncryptionResponse(
        @CustomType.Parameter("keyName") String keyName,
        @CustomType.Parameter("state") String state) {
        this.keyName = keyName;
        this.state = state;
    }

    /**
     * @return Name of CloudKMS key to use for the encryption of secrets in etcd. Ex. projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return Denotes the state of etcd encryption.
     * 
     */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.state = defaults.state;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public DatabaseEncryptionResponse build() {
            return new DatabaseEncryptionResponse(keyName, state);
        }
    }
}
