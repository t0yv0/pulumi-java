// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.outputs;

import com.pulumi.aws.ecr.outputs.RegistryScanningConfigurationRuleRepositoryFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RegistryScanningConfigurationRule {
    /**
     * @return One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
     */
    private final List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters;
    /**
     * @return The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
     */
    private final String scanFrequency;

    @CustomType.Constructor
    private RegistryScanningConfigurationRule(
        @CustomType.Parameter("repositoryFilters") List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters,
        @CustomType.Parameter("scanFrequency") String scanFrequency) {
        this.repositoryFilters = repositoryFilters;
        this.scanFrequency = scanFrequency;
    }

    /**
     * @return One or more repository filter blocks, containing a `filter` (required string filtering repositories, see pattern regex [here](https://docs.aws.amazon.com/AmazonECR/latest/APIReference/API_ScanningRepositoryFilter.html)) and a `filter_type` (required string, currently only `WILDCARD` is supported).
     * 
     */
    public List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters() {
        return this.repositoryFilters;
    }
    /**
     * @return The frequency that scans are performed at for a private registry. Can be `SCAN_ON_PUSH`, `CONTINUOUS_SCAN`, or `MANUAL`.
     * 
     */
    public String scanFrequency() {
        return this.scanFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryScanningConfigurationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters;
        private String scanFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryScanningConfigurationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryFilters = defaults.repositoryFilters;
    	      this.scanFrequency = defaults.scanFrequency;
        }

        public Builder repositoryFilters(List<RegistryScanningConfigurationRuleRepositoryFilter> repositoryFilters) {
            this.repositoryFilters = Objects.requireNonNull(repositoryFilters);
            return this;
        }
        public Builder repositoryFilters(RegistryScanningConfigurationRuleRepositoryFilter... repositoryFilters) {
            return repositoryFilters(List.of(repositoryFilters));
        }
        public Builder scanFrequency(String scanFrequency) {
            this.scanFrequency = Objects.requireNonNull(scanFrequency);
            return this;
        }        public RegistryScanningConfigurationRule build() {
            return new RegistryScanningConfigurationRule(repositoryFilters, scanFrequency);
        }
    }
}
