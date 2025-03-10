// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.azurenative.dataprotection.outputs.SourceLifeCycleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureRetentionRuleResponse {
    private final @Nullable Boolean isDefault;
    private final List<SourceLifeCycleResponse> lifecycles;
    private final String name;
    /**
     * @return
     * Expected value is &#39;AzureRetentionRule&#39;.
     * 
     */
    private final String objectType;

    @CustomType.Constructor
    private AzureRetentionRuleResponse(
        @CustomType.Parameter("isDefault") @Nullable Boolean isDefault,
        @CustomType.Parameter("lifecycles") List<SourceLifeCycleResponse> lifecycles,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("objectType") String objectType) {
        this.isDefault = isDefault;
        this.lifecycles = lifecycles;
        this.name = name;
        this.objectType = objectType;
    }

    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    public List<SourceLifeCycleResponse> lifecycles() {
        return this.lifecycles;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return
     * Expected value is &#39;AzureRetentionRule&#39;.
     * 
     */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureRetentionRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isDefault;
        private List<SourceLifeCycleResponse> lifecycles;
        private String name;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureRetentionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isDefault = defaults.isDefault;
    	      this.lifecycles = defaults.lifecycles;
    	      this.name = defaults.name;
    	      this.objectType = defaults.objectType;
        }

        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder lifecycles(List<SourceLifeCycleResponse> lifecycles) {
            this.lifecycles = Objects.requireNonNull(lifecycles);
            return this;
        }
        public Builder lifecycles(SourceLifeCycleResponse... lifecycles) {
            return lifecycles(List.of(lifecycles));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }        public AzureRetentionRuleResponse build() {
            return new AzureRetentionRuleResponse(isDefault, lifecycles, name, objectType);
        }
    }
}
