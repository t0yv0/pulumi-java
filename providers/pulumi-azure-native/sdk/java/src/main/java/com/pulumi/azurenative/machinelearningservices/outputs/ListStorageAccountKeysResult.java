// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListStorageAccountKeysResult {
    private final String userStorageKey;

    @CustomType.Constructor
    private ListStorageAccountKeysResult(@CustomType.Parameter("userStorageKey") String userStorageKey) {
        this.userStorageKey = userStorageKey;
    }

    public String userStorageKey() {
        return this.userStorageKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userStorageKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userStorageKey = defaults.userStorageKey;
        }

        public Builder userStorageKey(String userStorageKey) {
            this.userStorageKey = Objects.requireNonNull(userStorageKey);
            return this;
        }        public ListStorageAccountKeysResult build() {
            return new ListStorageAccountKeysResult(userStorageKey);
        }
    }
}
