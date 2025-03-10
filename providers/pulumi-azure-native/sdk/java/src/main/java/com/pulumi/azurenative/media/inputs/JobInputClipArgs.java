// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.AbsoluteClipTimeArgs;
import com.pulumi.azurenative.media.inputs.FromAllInputFileArgs;
import com.pulumi.azurenative.media.inputs.FromEachInputFileArgs;
import com.pulumi.azurenative.media.inputs.InputFileArgs;
import com.pulumi.azurenative.media.inputs.UtcClipTimeArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents input files for a Job.
 * 
 */
public final class JobInputClipArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobInputClipArgs Empty = new JobInputClipArgs();

    /**
     * Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    @Import(name="end")
    private @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end;

    /**
     * @return Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
     * 
     */
    public Optional<Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    @Import(name="files")
    private @Nullable Output<List<String>> files;

    /**
     * @return List of files. Required for JobInputHttp. Maximum of 4000 characters each.
     * 
     */
    public Optional<Output<List<String>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    @Import(name="inputDefinitions")
    private @Nullable Output<List<Object>> inputDefinitions;

    /**
     * @return Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
     * 
     */
    public Optional<Output<List<Object>>> inputDefinitions() {
        return Optional.ofNullable(this.inputDefinitions);
    }

    /**
     * A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputClip&#39;.
     * 
     */
    @Import(name="odataType", required=true)
    private Output<String> odataType;

    /**
     * @return The discriminator for derived types.
     * Expected value is &#39;#Microsoft.Media.JobInputClip&#39;.
     * 
     */
    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    @Import(name="start")
    private @Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start;

    /**
     * @return Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
     * 
     */
    public Optional<Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>>> start() {
        return Optional.ofNullable(this.start);
    }

    private JobInputClipArgs() {}

    private JobInputClipArgs(JobInputClipArgs $) {
        this.end = $.end;
        this.files = $.files;
        this.inputDefinitions = $.inputDefinitions;
        this.label = $.label;
        this.odataType = $.odataType;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobInputClipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobInputClipArgs $;

        public Builder() {
            $ = new JobInputClipArgs();
        }

        public Builder(JobInputClipArgs defaults) {
            $ = new JobInputClipArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(Either<AbsoluteClipTimeArgs,UtcClipTimeArgs> end) {
            return end(Output.of(end));
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(AbsoluteClipTimeArgs end) {
            return end(Either.ofLeft(end));
        }

        /**
         * @param end Defines a point on the timeline of the input media at which processing will end. Defaults to the end of the input media.
         * 
         * @return builder
         * 
         */
        public Builder end(UtcClipTimeArgs end) {
            return end(Either.ofRight(end));
        }

        /**
         * @param files List of files. Required for JobInputHttp. Maximum of 4000 characters each.
         * 
         * @return builder
         * 
         */
        public Builder files(@Nullable Output<List<String>> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files List of files. Required for JobInputHttp. Maximum of 4000 characters each.
         * 
         * @return builder
         * 
         */
        public Builder files(List<String> files) {
            return files(Output.of(files));
        }

        /**
         * @param files List of files. Required for JobInputHttp. Maximum of 4000 characters each.
         * 
         * @return builder
         * 
         */
        public Builder files(String... files) {
            return files(List.of(files));
        }

        /**
         * @param inputDefinitions Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder inputDefinitions(@Nullable Output<List<Object>> inputDefinitions) {
            $.inputDefinitions = inputDefinitions;
            return this;
        }

        /**
         * @param inputDefinitions Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder inputDefinitions(List<Object> inputDefinitions) {
            return inputDefinitions(Output.of(inputDefinitions));
        }

        /**
         * @param inputDefinitions Defines a list of InputDefinitions. For each InputDefinition, it defines a list of track selections and related metadata.
         * 
         * @return builder
         * 
         */
        public Builder inputDefinitions(Object... inputDefinitions) {
            return inputDefinitions(List.of(inputDefinitions));
        }

        /**
         * @param label A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label A label that is assigned to a JobInputClip, that is used to satisfy a reference used in the Transform. For example, a Transform can be authored so as to take an image file with the label &#39;xyz&#39; and apply it as an overlay onto the input video before it is encoded. When submitting a Job, exactly one of the JobInputs should be the image file, and it should have the label &#39;xyz&#39;.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.JobInputClip&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        /**
         * @param odataType The discriminator for derived types.
         * Expected value is &#39;#Microsoft.Media.JobInputClip&#39;.
         * 
         * @return builder
         * 
         */
        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Either<AbsoluteClipTimeArgs,UtcClipTimeArgs>> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(Either<AbsoluteClipTimeArgs,UtcClipTimeArgs> start) {
            return start(Output.of(start));
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(AbsoluteClipTimeArgs start) {
            return start(Either.ofLeft(start));
        }

        /**
         * @param start Defines a point on the timeline of the input media at which processing will start. Defaults to the beginning of the input media.
         * 
         * @return builder
         * 
         */
        public Builder start(UtcClipTimeArgs start) {
            return start(Either.ofRight(start));
        }

        public JobInputClipArgs build() {
            $.odataType = Codegen.stringProp("odataType").output().arg($.odataType).require();
            return $;
        }
    }

}
