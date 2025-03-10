// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStepDeleteStepDetails {
    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    private final @Nullable String name;
    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    private final @Nullable String sourceFileLocation;

    @CustomType.Constructor
    private WorkflowStepDeleteStepDetails(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("sourceFileLocation") @Nullable String sourceFileLocation) {
        this.name = name;
        this.sourceFileLocation = sourceFileLocation;
    }

    /**
     * @return The name of the step, used as an identifier.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Specifies which file to use as input to the workflow step: either the output from the previous step, or the originally uploaded file for the workflow. Enter ${previous.file} to use the previous file as the input. In this case, this workflow step uses the output file from the previous workflow step as input. This is the default value. Enter ${original.file} to use the originally-uploaded file location as input for this step.
     * 
     */
    public Optional<String> sourceFileLocation() {
        return Optional.ofNullable(this.sourceFileLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepDeleteStepDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String sourceFileLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepDeleteStepDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceFileLocation = defaults.sourceFileLocation;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder sourceFileLocation(@Nullable String sourceFileLocation) {
            this.sourceFileLocation = sourceFileLocation;
            return this;
        }        public WorkflowStepDeleteStepDetails build() {
            return new WorkflowStepDeleteStepDetails(name, sourceFileLocation);
        }
    }
}
