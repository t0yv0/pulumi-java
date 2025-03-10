// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ssm.AssociationArgs;
import com.pulumi.awsnative.ssm.enums.AssociationComplianceSeverity;
import com.pulumi.awsnative.ssm.enums.AssociationSyncCompliance;
import com.pulumi.awsnative.ssm.outputs.AssociationInstanceAssociationOutputLocation;
import com.pulumi.awsnative.ssm.outputs.AssociationTarget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The AWS::SSM::Association resource associates an SSM document in AWS Systems Manager with EC2 instances that contain a configuration agent to process the document.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:ssm:Association")
public class Association extends com.pulumi.resources.CustomResource {
    @Export(name="applyOnlyAtCronInterval", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> applyOnlyAtCronInterval;

    public Output<Optional<Boolean>> applyOnlyAtCronInterval() {
        return Codegen.optional(this.applyOnlyAtCronInterval);
    }
    /**
     * Unique identifier of the association.
     * 
     */
    @Export(name="associationId", type=String.class, parameters={})
    private Output<String> associationId;

    /**
     * @return Unique identifier of the association.
     * 
     */
    public Output<String> associationId() {
        return this.associationId;
    }
    /**
     * The name of the association.
     * 
     */
    @Export(name="associationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> associationName;

    /**
     * @return The name of the association.
     * 
     */
    public Output<Optional<String>> associationName() {
        return Codegen.optional(this.associationName);
    }
    @Export(name="automationTargetParameterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> automationTargetParameterName;

    public Output<Optional<String>> automationTargetParameterName() {
        return Codegen.optional(this.automationTargetParameterName);
    }
    @Export(name="calendarNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> calendarNames;

    public Output<Optional<List<String>>> calendarNames() {
        return Codegen.optional(this.calendarNames);
    }
    @Export(name="complianceSeverity", type=AssociationComplianceSeverity.class, parameters={})
    private Output</* @Nullable */ AssociationComplianceSeverity> complianceSeverity;

    public Output<Optional<AssociationComplianceSeverity>> complianceSeverity() {
        return Codegen.optional(this.complianceSeverity);
    }
    /**
     * The version of the SSM document to associate with the target.
     * 
     */
    @Export(name="documentVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> documentVersion;

    /**
     * @return The version of the SSM document to associate with the target.
     * 
     */
    public Output<Optional<String>> documentVersion() {
        return Codegen.optional(this.documentVersion);
    }
    /**
     * The ID of the instance that the SSM document is associated with.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceId;

    /**
     * @return The ID of the instance that the SSM document is associated with.
     * 
     */
    public Output<Optional<String>> instanceId() {
        return Codegen.optional(this.instanceId);
    }
    @Export(name="maxConcurrency", type=String.class, parameters={})
    private Output</* @Nullable */ String> maxConcurrency;

    public Output<Optional<String>> maxConcurrency() {
        return Codegen.optional(this.maxConcurrency);
    }
    @Export(name="maxErrors", type=String.class, parameters={})
    private Output</* @Nullable */ String> maxErrors;

    public Output<Optional<String>> maxErrors() {
        return Codegen.optional(this.maxErrors);
    }
    /**
     * The name of the SSM document.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the SSM document.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="outputLocation", type=AssociationInstanceAssociationOutputLocation.class, parameters={})
    private Output</* @Nullable */ AssociationInstanceAssociationOutputLocation> outputLocation;

    public Output<Optional<AssociationInstanceAssociationOutputLocation>> outputLocation() {
        return Codegen.optional(this.outputLocation);
    }
    /**
     * Parameter values that the SSM document uses at runtime.
     * 
     */
    @Export(name="parameters", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> parameters;

    /**
     * @return Parameter values that the SSM document uses at runtime.
     * 
     */
    public Output<Optional<Object>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A Cron or Rate expression that specifies when the association is applied to the target.
     * 
     */
    @Export(name="scheduleExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> scheduleExpression;

    /**
     * @return A Cron or Rate expression that specifies when the association is applied to the target.
     * 
     */
    public Output<Optional<String>> scheduleExpression() {
        return Codegen.optional(this.scheduleExpression);
    }
    @Export(name="scheduleOffset", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> scheduleOffset;

    public Output<Optional<Integer>> scheduleOffset() {
        return Codegen.optional(this.scheduleOffset);
    }
    @Export(name="syncCompliance", type=AssociationSyncCompliance.class, parameters={})
    private Output</* @Nullable */ AssociationSyncCompliance> syncCompliance;

    public Output<Optional<AssociationSyncCompliance>> syncCompliance() {
        return Codegen.optional(this.syncCompliance);
    }
    /**
     * The targets that the SSM document sends commands to.
     * 
     */
    @Export(name="targets", type=List.class, parameters={AssociationTarget.class})
    private Output</* @Nullable */ List<AssociationTarget>> targets;

    /**
     * @return The targets that the SSM document sends commands to.
     * 
     */
    public Output<Optional<List<AssociationTarget>>> targets() {
        return Codegen.optional(this.targets);
    }
    @Export(name="waitForSuccessTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> waitForSuccessTimeoutSeconds;

    public Output<Optional<Integer>> waitForSuccessTimeoutSeconds() {
        return Codegen.optional(this.waitForSuccessTimeoutSeconds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Association(String name) {
        this(name, AssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Association(String name, @Nullable AssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Association(String name, @Nullable AssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:Association", name, args == null ? AssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Association(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ssm:Association", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Association get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Association(name, id, options);
    }
}
