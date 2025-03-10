// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.CisBenchmarkArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.ComplianceVersionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComplianceNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComplianceNoteArgs Empty = new ComplianceNoteArgs();

    @Import(name="cisBenchmark")
    private @Nullable Output<CisBenchmarkArgs> cisBenchmark;

    public Optional<Output<CisBenchmarkArgs>> cisBenchmark() {
        return Optional.ofNullable(this.cisBenchmark);
    }

    /**
     * A description about this compliance check.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description about this compliance check.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A rationale for the existence of this compliance check.
     * 
     */
    @Import(name="rationale")
    private @Nullable Output<String> rationale;

    /**
     * @return A rationale for the existence of this compliance check.
     * 
     */
    public Optional<Output<String>> rationale() {
        return Optional.ofNullable(this.rationale);
    }

    /**
     * A description of remediation steps if the compliance check fails.
     * 
     */
    @Import(name="remediation")
    private @Nullable Output<String> remediation;

    /**
     * @return A description of remediation steps if the compliance check fails.
     * 
     */
    public Optional<Output<String>> remediation() {
        return Optional.ofNullable(this.remediation);
    }

    /**
     * Serialized scan instructions with a predefined format.
     * 
     */
    @Import(name="scanInstructions")
    private @Nullable Output<String> scanInstructions;

    /**
     * @return Serialized scan instructions with a predefined format.
     * 
     */
    public Optional<Output<String>> scanInstructions() {
        return Optional.ofNullable(this.scanInstructions);
    }

    /**
     * The title that identifies this compliance check.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return The title that identifies this compliance check.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * The OS and config versions the benchmark applies to.
     * 
     */
    @Import(name="version")
    private @Nullable Output<List<ComplianceVersionArgs>> version;

    /**
     * @return The OS and config versions the benchmark applies to.
     * 
     */
    public Optional<Output<List<ComplianceVersionArgs>>> version() {
        return Optional.ofNullable(this.version);
    }

    private ComplianceNoteArgs() {}

    private ComplianceNoteArgs(ComplianceNoteArgs $) {
        this.cisBenchmark = $.cisBenchmark;
        this.description = $.description;
        this.rationale = $.rationale;
        this.remediation = $.remediation;
        this.scanInstructions = $.scanInstructions;
        this.title = $.title;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComplianceNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComplianceNoteArgs $;

        public Builder() {
            $ = new ComplianceNoteArgs();
        }

        public Builder(ComplianceNoteArgs defaults) {
            $ = new ComplianceNoteArgs(Objects.requireNonNull(defaults));
        }

        public Builder cisBenchmark(@Nullable Output<CisBenchmarkArgs> cisBenchmark) {
            $.cisBenchmark = cisBenchmark;
            return this;
        }

        public Builder cisBenchmark(CisBenchmarkArgs cisBenchmark) {
            return cisBenchmark(Output.of(cisBenchmark));
        }

        /**
         * @param description A description about this compliance check.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description about this compliance check.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param rationale A rationale for the existence of this compliance check.
         * 
         * @return builder
         * 
         */
        public Builder rationale(@Nullable Output<String> rationale) {
            $.rationale = rationale;
            return this;
        }

        /**
         * @param rationale A rationale for the existence of this compliance check.
         * 
         * @return builder
         * 
         */
        public Builder rationale(String rationale) {
            return rationale(Output.of(rationale));
        }

        /**
         * @param remediation A description of remediation steps if the compliance check fails.
         * 
         * @return builder
         * 
         */
        public Builder remediation(@Nullable Output<String> remediation) {
            $.remediation = remediation;
            return this;
        }

        /**
         * @param remediation A description of remediation steps if the compliance check fails.
         * 
         * @return builder
         * 
         */
        public Builder remediation(String remediation) {
            return remediation(Output.of(remediation));
        }

        /**
         * @param scanInstructions Serialized scan instructions with a predefined format.
         * 
         * @return builder
         * 
         */
        public Builder scanInstructions(@Nullable Output<String> scanInstructions) {
            $.scanInstructions = scanInstructions;
            return this;
        }

        /**
         * @param scanInstructions Serialized scan instructions with a predefined format.
         * 
         * @return builder
         * 
         */
        public Builder scanInstructions(String scanInstructions) {
            return scanInstructions(Output.of(scanInstructions));
        }

        /**
         * @param title The title that identifies this compliance check.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title that identifies this compliance check.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param version The OS and config versions the benchmark applies to.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<List<ComplianceVersionArgs>> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The OS and config versions the benchmark applies to.
         * 
         * @return builder
         * 
         */
        public Builder version(List<ComplianceVersionArgs> version) {
            return version(Output.of(version));
        }

        /**
         * @param version The OS and config versions the benchmark applies to.
         * 
         * @return builder
         * 
         */
        public Builder version(ComplianceVersionArgs... version) {
            return version(List.of(version));
        }

        public ComplianceNoteArgs build() {
            return $;
        }
    }

}
