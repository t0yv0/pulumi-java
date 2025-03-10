// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.enums.CisBenchmarkSeverity;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A compliance check that is a CIS benchmark.
 * 
 */
public final class CisBenchmarkArgs extends com.pulumi.resources.ResourceArgs {

    public static final CisBenchmarkArgs Empty = new CisBenchmarkArgs();

    /**
     * The profile level of this CIS benchmark check.
     * 
     */
    @Import(name="profileLevel")
    private @Nullable Output<Integer> profileLevel;

    /**
     * @return The profile level of this CIS benchmark check.
     * 
     */
    public Optional<Output<Integer>> profileLevel() {
        return Optional.ofNullable(this.profileLevel);
    }

    /**
     * The severity level of this CIS benchmark check.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<CisBenchmarkSeverity> severity;

    /**
     * @return The severity level of this CIS benchmark check.
     * 
     */
    public Optional<Output<CisBenchmarkSeverity>> severity() {
        return Optional.ofNullable(this.severity);
    }

    private CisBenchmarkArgs() {}

    private CisBenchmarkArgs(CisBenchmarkArgs $) {
        this.profileLevel = $.profileLevel;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CisBenchmarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CisBenchmarkArgs $;

        public Builder() {
            $ = new CisBenchmarkArgs();
        }

        public Builder(CisBenchmarkArgs defaults) {
            $ = new CisBenchmarkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param profileLevel The profile level of this CIS benchmark check.
         * 
         * @return builder
         * 
         */
        public Builder profileLevel(@Nullable Output<Integer> profileLevel) {
            $.profileLevel = profileLevel;
            return this;
        }

        /**
         * @param profileLevel The profile level of this CIS benchmark check.
         * 
         * @return builder
         * 
         */
        public Builder profileLevel(Integer profileLevel) {
            return profileLevel(Output.of(profileLevel));
        }

        /**
         * @param severity The severity level of this CIS benchmark check.
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<CisBenchmarkSeverity> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The severity level of this CIS benchmark check.
         * 
         * @return builder
         * 
         */
        public Builder severity(CisBenchmarkSeverity severity) {
            return severity(Output.of(severity));
        }

        public CisBenchmarkArgs build() {
            return $;
        }
    }

}
