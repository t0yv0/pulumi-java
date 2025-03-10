// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.enums.IndexUserContextPolicy;
import com.pulumi.awsnative.kendra.outputs.IndexCapacityUnitsConfiguration;
import com.pulumi.awsnative.kendra.outputs.IndexDocumentMetadataConfiguration;
import com.pulumi.awsnative.kendra.outputs.IndexTag;
import com.pulumi.awsnative.kendra.outputs.IndexUserTokenConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIndexResult {
    private final @Nullable String arn;
    /**
     * @return Capacity units
     * 
     */
    private final @Nullable IndexCapacityUnitsConfiguration capacityUnits;
    /**
     * @return A description for the index
     * 
     */
    private final @Nullable String description;
    /**
     * @return Document metadata configurations
     * 
     */
    private final @Nullable List<IndexDocumentMetadataConfiguration> documentMetadataConfigurations;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable String roleArn;
    /**
     * @return Tags for labeling the index
     * 
     */
    private final @Nullable List<IndexTag> tags;
    private final @Nullable IndexUserContextPolicy userContextPolicy;
    private final @Nullable List<IndexUserTokenConfiguration> userTokenConfigurations;

    @CustomType.Constructor
    private GetIndexResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("capacityUnits") @Nullable IndexCapacityUnitsConfiguration capacityUnits,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("documentMetadataConfigurations") @Nullable List<IndexDocumentMetadataConfiguration> documentMetadataConfigurations,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("tags") @Nullable List<IndexTag> tags,
        @CustomType.Parameter("userContextPolicy") @Nullable IndexUserContextPolicy userContextPolicy,
        @CustomType.Parameter("userTokenConfigurations") @Nullable List<IndexUserTokenConfiguration> userTokenConfigurations) {
        this.arn = arn;
        this.capacityUnits = capacityUnits;
        this.description = description;
        this.documentMetadataConfigurations = documentMetadataConfigurations;
        this.id = id;
        this.name = name;
        this.roleArn = roleArn;
        this.tags = tags;
        this.userContextPolicy = userContextPolicy;
        this.userTokenConfigurations = userTokenConfigurations;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Capacity units
     * 
     */
    public Optional<IndexCapacityUnitsConfiguration> capacityUnits() {
        return Optional.ofNullable(this.capacityUnits);
    }
    /**
     * @return A description for the index
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Document metadata configurations
     * 
     */
    public List<IndexDocumentMetadataConfiguration> documentMetadataConfigurations() {
        return this.documentMetadataConfigurations == null ? List.of() : this.documentMetadataConfigurations;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * @return Tags for labeling the index
     * 
     */
    public List<IndexTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public Optional<IndexUserContextPolicy> userContextPolicy() {
        return Optional.ofNullable(this.userContextPolicy);
    }
    public List<IndexUserTokenConfiguration> userTokenConfigurations() {
        return this.userTokenConfigurations == null ? List.of() : this.userTokenConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable IndexCapacityUnitsConfiguration capacityUnits;
        private @Nullable String description;
        private @Nullable List<IndexDocumentMetadataConfiguration> documentMetadataConfigurations;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String roleArn;
        private @Nullable List<IndexTag> tags;
        private @Nullable IndexUserContextPolicy userContextPolicy;
        private @Nullable List<IndexUserTokenConfiguration> userTokenConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.capacityUnits = defaults.capacityUnits;
    	      this.description = defaults.description;
    	      this.documentMetadataConfigurations = defaults.documentMetadataConfigurations;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.userContextPolicy = defaults.userContextPolicy;
    	      this.userTokenConfigurations = defaults.userTokenConfigurations;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder capacityUnits(@Nullable IndexCapacityUnitsConfiguration capacityUnits) {
            this.capacityUnits = capacityUnits;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder documentMetadataConfigurations(@Nullable List<IndexDocumentMetadataConfiguration> documentMetadataConfigurations) {
            this.documentMetadataConfigurations = documentMetadataConfigurations;
            return this;
        }
        public Builder documentMetadataConfigurations(IndexDocumentMetadataConfiguration... documentMetadataConfigurations) {
            return documentMetadataConfigurations(List.of(documentMetadataConfigurations));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder tags(@Nullable List<IndexTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(IndexTag... tags) {
            return tags(List.of(tags));
        }
        public Builder userContextPolicy(@Nullable IndexUserContextPolicy userContextPolicy) {
            this.userContextPolicy = userContextPolicy;
            return this;
        }
        public Builder userTokenConfigurations(@Nullable List<IndexUserTokenConfiguration> userTokenConfigurations) {
            this.userTokenConfigurations = userTokenConfigurations;
            return this;
        }
        public Builder userTokenConfigurations(IndexUserTokenConfiguration... userTokenConfigurations) {
            return userTokenConfigurations(List.of(userTokenConfigurations));
        }        public GetIndexResult build() {
            return new GetIndexResult(arn, capacityUnits, description, documentMetadataConfigurations, id, name, roleArn, tags, userContextPolicy, userTokenConfigurations);
        }
    }
}
