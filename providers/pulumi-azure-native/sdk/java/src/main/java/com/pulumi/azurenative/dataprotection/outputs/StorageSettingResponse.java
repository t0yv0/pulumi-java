// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageSettingResponse {
    /**
     * @return Gets or sets the type of the datastore.
     * 
     */
    private final @Nullable String datastoreType;
    /**
     * @return Gets or sets the type.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private StorageSettingResponse(
        @CustomType.Parameter("datastoreType") @Nullable String datastoreType,
        @CustomType.Parameter("type") @Nullable String type) {
        this.datastoreType = datastoreType;
        this.type = type;
    }

    /**
     * @return Gets or sets the type of the datastore.
     * 
     */
    public Optional<String> datastoreType() {
        return Optional.ofNullable(this.datastoreType);
    }
    /**
     * @return Gets or sets the type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreType;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreType = defaults.datastoreType;
    	      this.type = defaults.type;
        }

        public Builder datastoreType(@Nullable String datastoreType) {
            this.datastoreType = datastoreType;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public StorageSettingResponse build() {
            return new StorageSettingResponse(datastoreType, type);
        }
    }
}
