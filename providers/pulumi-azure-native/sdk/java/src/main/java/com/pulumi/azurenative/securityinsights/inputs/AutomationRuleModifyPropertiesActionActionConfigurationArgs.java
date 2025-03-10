// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.enums.IncidentClassification;
import com.pulumi.azurenative.securityinsights.enums.IncidentClassificationReason;
import com.pulumi.azurenative.securityinsights.enums.IncidentSeverity;
import com.pulumi.azurenative.securityinsights.enums.IncidentStatus;
import com.pulumi.azurenative.securityinsights.inputs.IncidentLabelArgs;
import com.pulumi.azurenative.securityinsights.inputs.IncidentOwnerInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration of the modify properties automation rule action
 * 
 */
public final class AutomationRuleModifyPropertiesActionActionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleModifyPropertiesActionActionConfigurationArgs Empty = new AutomationRuleModifyPropertiesActionActionConfigurationArgs();

    /**
     * The reason the incident was closed
     * 
     */
    @Import(name="classification")
    private @Nullable Output<Either<String,IncidentClassification>> classification;

    /**
     * @return The reason the incident was closed
     * 
     */
    public Optional<Output<Either<String,IncidentClassification>>> classification() {
        return Optional.ofNullable(this.classification);
    }

    /**
     * Describes the reason the incident was closed
     * 
     */
    @Import(name="classificationComment")
    private @Nullable Output<String> classificationComment;

    /**
     * @return Describes the reason the incident was closed
     * 
     */
    public Optional<Output<String>> classificationComment() {
        return Optional.ofNullable(this.classificationComment);
    }

    /**
     * The classification reason to close the incident with
     * 
     */
    @Import(name="classificationReason")
    private @Nullable Output<Either<String,IncidentClassificationReason>> classificationReason;

    /**
     * @return The classification reason to close the incident with
     * 
     */
    public Optional<Output<Either<String,IncidentClassificationReason>>> classificationReason() {
        return Optional.ofNullable(this.classificationReason);
    }

    /**
     * List of labels to add to the incident
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<IncidentLabelArgs>> labels;

    /**
     * @return List of labels to add to the incident
     * 
     */
    public Optional<Output<List<IncidentLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Describes a user that the incident is assigned to
     * 
     */
    @Import(name="owner")
    private @Nullable Output<IncidentOwnerInfoArgs> owner;

    /**
     * @return Describes a user that the incident is assigned to
     * 
     */
    public Optional<Output<IncidentOwnerInfoArgs>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * The severity of the incident
     * 
     */
    @Import(name="severity")
    private @Nullable Output<Either<String,IncidentSeverity>> severity;

    /**
     * @return The severity of the incident
     * 
     */
    public Optional<Output<Either<String,IncidentSeverity>>> severity() {
        return Optional.ofNullable(this.severity);
    }

    /**
     * The status of the incident
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,IncidentStatus>> status;

    /**
     * @return The status of the incident
     * 
     */
    public Optional<Output<Either<String,IncidentStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private AutomationRuleModifyPropertiesActionActionConfigurationArgs() {}

    private AutomationRuleModifyPropertiesActionActionConfigurationArgs(AutomationRuleModifyPropertiesActionActionConfigurationArgs $) {
        this.classification = $.classification;
        this.classificationComment = $.classificationComment;
        this.classificationReason = $.classificationReason;
        this.labels = $.labels;
        this.owner = $.owner;
        this.severity = $.severity;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleModifyPropertiesActionActionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleModifyPropertiesActionActionConfigurationArgs $;

        public Builder() {
            $ = new AutomationRuleModifyPropertiesActionActionConfigurationArgs();
        }

        public Builder(AutomationRuleModifyPropertiesActionActionConfigurationArgs defaults) {
            $ = new AutomationRuleModifyPropertiesActionActionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param classification The reason the incident was closed
         * 
         * @return builder
         * 
         */
        public Builder classification(@Nullable Output<Either<String,IncidentClassification>> classification) {
            $.classification = classification;
            return this;
        }

        /**
         * @param classification The reason the incident was closed
         * 
         * @return builder
         * 
         */
        public Builder classification(Either<String,IncidentClassification> classification) {
            return classification(Output.of(classification));
        }

        /**
         * @param classification The reason the incident was closed
         * 
         * @return builder
         * 
         */
        public Builder classification(String classification) {
            return classification(Either.ofLeft(classification));
        }

        /**
         * @param classification The reason the incident was closed
         * 
         * @return builder
         * 
         */
        public Builder classification(IncidentClassification classification) {
            return classification(Either.ofRight(classification));
        }

        /**
         * @param classificationComment Describes the reason the incident was closed
         * 
         * @return builder
         * 
         */
        public Builder classificationComment(@Nullable Output<String> classificationComment) {
            $.classificationComment = classificationComment;
            return this;
        }

        /**
         * @param classificationComment Describes the reason the incident was closed
         * 
         * @return builder
         * 
         */
        public Builder classificationComment(String classificationComment) {
            return classificationComment(Output.of(classificationComment));
        }

        /**
         * @param classificationReason The classification reason to close the incident with
         * 
         * @return builder
         * 
         */
        public Builder classificationReason(@Nullable Output<Either<String,IncidentClassificationReason>> classificationReason) {
            $.classificationReason = classificationReason;
            return this;
        }

        /**
         * @param classificationReason The classification reason to close the incident with
         * 
         * @return builder
         * 
         */
        public Builder classificationReason(Either<String,IncidentClassificationReason> classificationReason) {
            return classificationReason(Output.of(classificationReason));
        }

        /**
         * @param classificationReason The classification reason to close the incident with
         * 
         * @return builder
         * 
         */
        public Builder classificationReason(String classificationReason) {
            return classificationReason(Either.ofLeft(classificationReason));
        }

        /**
         * @param classificationReason The classification reason to close the incident with
         * 
         * @return builder
         * 
         */
        public Builder classificationReason(IncidentClassificationReason classificationReason) {
            return classificationReason(Either.ofRight(classificationReason));
        }

        /**
         * @param labels List of labels to add to the incident
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<IncidentLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels List of labels to add to the incident
         * 
         * @return builder
         * 
         */
        public Builder labels(List<IncidentLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels List of labels to add to the incident
         * 
         * @return builder
         * 
         */
        public Builder labels(IncidentLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param owner Describes a user that the incident is assigned to
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<IncidentOwnerInfoArgs> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Describes a user that the incident is assigned to
         * 
         * @return builder
         * 
         */
        public Builder owner(IncidentOwnerInfoArgs owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param severity The severity of the incident
         * 
         * @return builder
         * 
         */
        public Builder severity(@Nullable Output<Either<String,IncidentSeverity>> severity) {
            $.severity = severity;
            return this;
        }

        /**
         * @param severity The severity of the incident
         * 
         * @return builder
         * 
         */
        public Builder severity(Either<String,IncidentSeverity> severity) {
            return severity(Output.of(severity));
        }

        /**
         * @param severity The severity of the incident
         * 
         * @return builder
         * 
         */
        public Builder severity(String severity) {
            return severity(Either.ofLeft(severity));
        }

        /**
         * @param severity The severity of the incident
         * 
         * @return builder
         * 
         */
        public Builder severity(IncidentSeverity severity) {
            return severity(Either.ofRight(severity));
        }

        /**
         * @param status The status of the incident
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,IncidentStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the incident
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,IncidentStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The status of the incident
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The status of the incident
         * 
         * @return builder
         * 
         */
        public Builder status(IncidentStatus status) {
            return status(Either.ofRight(status));
        }

        public AutomationRuleModifyPropertiesActionActionConfigurationArgs build() {
            return $;
        }
    }

}
