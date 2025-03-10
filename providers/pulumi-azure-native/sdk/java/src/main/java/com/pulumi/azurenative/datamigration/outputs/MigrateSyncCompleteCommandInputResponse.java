// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MigrateSyncCompleteCommandInputResponse {
    /**
     * @return Time stamp to complete
     * 
     */
    private final @Nullable String commitTimeStamp;
    /**
     * @return Name of database
     * 
     */
    private final String databaseName;

    @CustomType.Constructor
    private MigrateSyncCompleteCommandInputResponse(
        @CustomType.Parameter("commitTimeStamp") @Nullable String commitTimeStamp,
        @CustomType.Parameter("databaseName") String databaseName) {
        this.commitTimeStamp = commitTimeStamp;
        this.databaseName = databaseName;
    }

    /**
     * @return Time stamp to complete
     * 
     */
    public Optional<String> commitTimeStamp() {
        return Optional.ofNullable(this.commitTimeStamp);
    }
    /**
     * @return Name of database
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSyncCompleteCommandInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commitTimeStamp;
        private String databaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSyncCompleteCommandInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitTimeStamp = defaults.commitTimeStamp;
    	      this.databaseName = defaults.databaseName;
        }

        public Builder commitTimeStamp(@Nullable String commitTimeStamp) {
            this.commitTimeStamp = commitTimeStamp;
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }        public MigrateSyncCompleteCommandInputResponse build() {
            return new MigrateSyncCompleteCommandInputResponse(commitTimeStamp, databaseName);
        }
    }
}
