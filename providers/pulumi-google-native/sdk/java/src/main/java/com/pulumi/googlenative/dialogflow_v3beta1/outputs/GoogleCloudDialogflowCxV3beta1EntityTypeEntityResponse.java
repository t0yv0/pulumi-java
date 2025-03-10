// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse {
    /**
     * @return A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
     * 
     */
    private final List<String> synonyms;
    /**
     * @return The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A canonical value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse(
        @CustomType.Parameter("synonyms") List<String> synonyms,
        @CustomType.Parameter("value") String value) {
        this.synonyms = synonyms;
        this.value = value;
    }

    /**
     * @return A collection of value synonyms. For example, if the entity type is *vegetable*, and `value` is *scallions*, a synonym could be *green onions*. For `KIND_LIST` entity types: * This collection must contain exactly one synonym equal to `value`.
     * 
     */
    public List<String> synonyms() {
        return this.synonyms;
    }
    /**
     * @return The primary value associated with this entity entry. For example, if the entity type is *vegetable*, the value could be *scallions*. For `KIND_MAP` entity types: * A canonical value to be used in place of synonyms. For `KIND_LIST` entity types: * A string that can contain references to other entity types (with or without aliases).
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
    	      this.value = defaults.value;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public Builder synonyms(String... synonyms) {
            return synonyms(List.of(synonyms));
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EntityTypeEntityResponse(synonyms, value);
        }
    }
}
