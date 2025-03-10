// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceGoogleDriveConfiguration {
    private final @Nullable List<String> excludeMimeTypes;
    private final @Nullable List<String> excludeSharedDrives;
    private final @Nullable List<String> excludeUserAccounts;
    private final @Nullable List<String> exclusionPatterns;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
    private final @Nullable List<String> inclusionPatterns;
    private final String secretArn;

    @CustomType.Constructor
    private DataSourceGoogleDriveConfiguration(
        @CustomType.Parameter("excludeMimeTypes") @Nullable List<String> excludeMimeTypes,
        @CustomType.Parameter("excludeSharedDrives") @Nullable List<String> excludeSharedDrives,
        @CustomType.Parameter("excludeUserAccounts") @Nullable List<String> excludeUserAccounts,
        @CustomType.Parameter("exclusionPatterns") @Nullable List<String> exclusionPatterns,
        @CustomType.Parameter("fieldMappings") @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        @CustomType.Parameter("inclusionPatterns") @Nullable List<String> inclusionPatterns,
        @CustomType.Parameter("secretArn") String secretArn) {
        this.excludeMimeTypes = excludeMimeTypes;
        this.excludeSharedDrives = excludeSharedDrives;
        this.excludeUserAccounts = excludeUserAccounts;
        this.exclusionPatterns = exclusionPatterns;
        this.fieldMappings = fieldMappings;
        this.inclusionPatterns = inclusionPatterns;
        this.secretArn = secretArn;
    }

    public List<String> excludeMimeTypes() {
        return this.excludeMimeTypes == null ? List.of() : this.excludeMimeTypes;
    }
    public List<String> excludeSharedDrives() {
        return this.excludeSharedDrives == null ? List.of() : this.excludeSharedDrives;
    }
    public List<String> excludeUserAccounts() {
        return this.excludeUserAccounts == null ? List.of() : this.excludeUserAccounts;
    }
    public List<String> exclusionPatterns() {
        return this.exclusionPatterns == null ? List.of() : this.exclusionPatterns;
    }
    public List<DataSourceToIndexFieldMapping> fieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }
    public List<String> inclusionPatterns() {
        return this.inclusionPatterns == null ? List.of() : this.inclusionPatterns;
    }
    public String secretArn() {
        return this.secretArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceGoogleDriveConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludeMimeTypes;
        private @Nullable List<String> excludeSharedDrives;
        private @Nullable List<String> excludeUserAccounts;
        private @Nullable List<String> exclusionPatterns;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private @Nullable List<String> inclusionPatterns;
        private String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceGoogleDriveConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeMimeTypes = defaults.excludeMimeTypes;
    	      this.excludeSharedDrives = defaults.excludeSharedDrives;
    	      this.excludeUserAccounts = defaults.excludeUserAccounts;
    	      this.exclusionPatterns = defaults.exclusionPatterns;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.inclusionPatterns = defaults.inclusionPatterns;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder excludeMimeTypes(@Nullable List<String> excludeMimeTypes) {
            this.excludeMimeTypes = excludeMimeTypes;
            return this;
        }
        public Builder excludeMimeTypes(String... excludeMimeTypes) {
            return excludeMimeTypes(List.of(excludeMimeTypes));
        }
        public Builder excludeSharedDrives(@Nullable List<String> excludeSharedDrives) {
            this.excludeSharedDrives = excludeSharedDrives;
            return this;
        }
        public Builder excludeSharedDrives(String... excludeSharedDrives) {
            return excludeSharedDrives(List.of(excludeSharedDrives));
        }
        public Builder excludeUserAccounts(@Nullable List<String> excludeUserAccounts) {
            this.excludeUserAccounts = excludeUserAccounts;
            return this;
        }
        public Builder excludeUserAccounts(String... excludeUserAccounts) {
            return excludeUserAccounts(List.of(excludeUserAccounts));
        }
        public Builder exclusionPatterns(@Nullable List<String> exclusionPatterns) {
            this.exclusionPatterns = exclusionPatterns;
            return this;
        }
        public Builder exclusionPatterns(String... exclusionPatterns) {
            return exclusionPatterns(List.of(exclusionPatterns));
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder inclusionPatterns(@Nullable List<String> inclusionPatterns) {
            this.inclusionPatterns = inclusionPatterns;
            return this;
        }
        public Builder inclusionPatterns(String... inclusionPatterns) {
            return inclusionPatterns(List.of(inclusionPatterns));
        }
        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }        public DataSourceGoogleDriveConfiguration build() {
            return new DataSourceGoogleDriveConfiguration(excludeMimeTypes, excludeSharedDrives, excludeUserAccounts, exclusionPatterns, fieldMappings, inclusionPatterns, secretArn);
        }
    }
}
