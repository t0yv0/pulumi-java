// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.outputs;

import com.pulumi.awsnative.applicationinsights.outputs.ApplicationLogPattern;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ApplicationLogPatternSet {
    /**
     * @return The log patterns of a set.
     * 
     */
    private final List<ApplicationLogPattern> logPatterns;
    /**
     * @return The name of the log pattern set.
     * 
     */
    private final String patternSetName;

    @CustomType.Constructor
    private ApplicationLogPatternSet(
        @CustomType.Parameter("logPatterns") List<ApplicationLogPattern> logPatterns,
        @CustomType.Parameter("patternSetName") String patternSetName) {
        this.logPatterns = logPatterns;
        this.patternSetName = patternSetName;
    }

    /**
     * @return The log patterns of a set.
     * 
     */
    public List<ApplicationLogPattern> logPatterns() {
        return this.logPatterns;
    }
    /**
     * @return The name of the log pattern set.
     * 
     */
    public String patternSetName() {
        return this.patternSetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationLogPatternSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationLogPattern> logPatterns;
        private String patternSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationLogPatternSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logPatterns = defaults.logPatterns;
    	      this.patternSetName = defaults.patternSetName;
        }

        public Builder logPatterns(List<ApplicationLogPattern> logPatterns) {
            this.logPatterns = Objects.requireNonNull(logPatterns);
            return this;
        }
        public Builder logPatterns(ApplicationLogPattern... logPatterns) {
            return logPatterns(List.of(logPatterns));
        }
        public Builder patternSetName(String patternSetName) {
            this.patternSetName = Objects.requireNonNull(patternSetName);
            return this;
        }        public ApplicationLogPatternSet build() {
            return new ApplicationLogPatternSet(logPatterns, patternSetName);
        }
    }
}
