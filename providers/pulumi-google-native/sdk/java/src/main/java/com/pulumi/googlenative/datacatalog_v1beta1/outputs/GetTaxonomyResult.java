// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datacatalog_v1beta1.outputs.GoogleCloudDatacatalogV1beta1SystemTimestampsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTaxonomyResult {
    /**
     * @return Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    private final List<String> activatedPolicyTypes;
    /**
     * @return Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    private final String description;
    /**
     * @return User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8. The taxonomy display name must be unique within an organization.
     * 
     */
    private final String displayName;
    /**
     * @return Resource name of this taxonomy, whose format is: &#34;projects/{project_number}/locations/{location_id}/taxonomies/{id}&#34;.
     * 
     */
    private final String name;
    /**
     * @return Number of policy tags contained in this taxonomy.
     * 
     */
    private final Integer policyTagCount;
    /**
     * @return Timestamps about this taxonomy. Only create_time and update_time are used.
     * 
     */
    private final GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps;

    @CustomType.Constructor
    private GetTaxonomyResult(
        @CustomType.Parameter("activatedPolicyTypes") List<String> activatedPolicyTypes,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policyTagCount") Integer policyTagCount,
        @CustomType.Parameter("taxonomyTimestamps") GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps) {
        this.activatedPolicyTypes = activatedPolicyTypes;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.policyTagCount = policyTagCount;
        this.taxonomyTimestamps = taxonomyTimestamps;
    }

    /**
     * @return Optional. A list of policy types that are activated for this taxonomy. If not set, defaults to an empty list.
     * 
     */
    public List<String> activatedPolicyTypes() {
        return this.activatedPolicyTypes;
    }
    /**
     * @return Optional. Description of this taxonomy. It must: contain only unicode characters, tabs, newlines, carriage returns and page breaks; and be at most 2000 bytes long when encoded in UTF-8. If not set, defaults to an empty description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return User defined name of this taxonomy. It must: contain only unicode letters, numbers, underscores, dashes and spaces; not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8. The taxonomy display name must be unique within an organization.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Resource name of this taxonomy, whose format is: &#34;projects/{project_number}/locations/{location_id}/taxonomies/{id}&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of policy tags contained in this taxonomy.
     * 
     */
    public Integer policyTagCount() {
        return this.policyTagCount;
    }
    /**
     * @return Timestamps about this taxonomy. Only create_time and update_time are used.
     * 
     */
    public GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps() {
        return this.taxonomyTimestamps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaxonomyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> activatedPolicyTypes;
        private String description;
        private String displayName;
        private String name;
        private Integer policyTagCount;
        private GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaxonomyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedPolicyTypes = defaults.activatedPolicyTypes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.policyTagCount = defaults.policyTagCount;
    	      this.taxonomyTimestamps = defaults.taxonomyTimestamps;
        }

        public Builder activatedPolicyTypes(List<String> activatedPolicyTypes) {
            this.activatedPolicyTypes = Objects.requireNonNull(activatedPolicyTypes);
            return this;
        }
        public Builder activatedPolicyTypes(String... activatedPolicyTypes) {
            return activatedPolicyTypes(List.of(activatedPolicyTypes));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policyTagCount(Integer policyTagCount) {
            this.policyTagCount = Objects.requireNonNull(policyTagCount);
            return this;
        }
        public Builder taxonomyTimestamps(GoogleCloudDatacatalogV1beta1SystemTimestampsResponse taxonomyTimestamps) {
            this.taxonomyTimestamps = Objects.requireNonNull(taxonomyTimestamps);
            return this;
        }        public GetTaxonomyResult build() {
            return new GetTaxonomyResult(activatedPolicyTypes, description, displayName, name, policyTagCount, taxonomyTimestamps);
        }
    }
}
