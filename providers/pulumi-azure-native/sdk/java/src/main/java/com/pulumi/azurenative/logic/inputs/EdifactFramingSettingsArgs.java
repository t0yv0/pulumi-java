// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.EdifactCharacterSet;
import com.pulumi.azurenative.logic.enums.EdifactDecimalIndicator;
import com.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Edifact agreement framing settings.
 * 
 */
public final class EdifactFramingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdifactFramingSettingsArgs Empty = new EdifactFramingSettingsArgs();

    /**
     * The character encoding.
     * 
     */
    @Import(name="characterEncoding")
    private @Nullable Output<String> characterEncoding;

    /**
     * @return The character encoding.
     * 
     */
    public Optional<Output<String>> characterEncoding() {
        return Optional.ofNullable(this.characterEncoding);
    }

    /**
     * The EDIFACT frame setting characterSet.
     * 
     */
    @Import(name="characterSet", required=true)
    private Output<Either<String,EdifactCharacterSet>> characterSet;

    /**
     * @return The EDIFACT frame setting characterSet.
     * 
     */
    public Output<Either<String,EdifactCharacterSet>> characterSet() {
        return this.characterSet;
    }

    /**
     * The component separator.
     * 
     */
    @Import(name="componentSeparator", required=true)
    private Output<Integer> componentSeparator;

    /**
     * @return The component separator.
     * 
     */
    public Output<Integer> componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @Import(name="dataElementSeparator", required=true)
    private Output<Integer> dataElementSeparator;

    /**
     * @return The data element separator.
     * 
     */
    public Output<Integer> dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The EDIFACT frame setting decimal indicator.
     * 
     */
    @Import(name="decimalPointIndicator", required=true)
    private Output<EdifactDecimalIndicator> decimalPointIndicator;

    /**
     * @return The EDIFACT frame setting decimal indicator.
     * 
     */
    public Output<EdifactDecimalIndicator> decimalPointIndicator() {
        return this.decimalPointIndicator;
    }

    /**
     * The protocol version.
     * 
     */
    @Import(name="protocolVersion", required=true)
    private Output<Integer> protocolVersion;

    /**
     * @return The protocol version.
     * 
     */
    public Output<Integer> protocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The release indicator.
     * 
     */
    @Import(name="releaseIndicator", required=true)
    private Output<Integer> releaseIndicator;

    /**
     * @return The release indicator.
     * 
     */
    public Output<Integer> releaseIndicator() {
        return this.releaseIndicator;
    }

    /**
     * The repetition separator.
     * 
     */
    @Import(name="repetitionSeparator", required=true)
    private Output<Integer> repetitionSeparator;

    /**
     * @return The repetition separator.
     * 
     */
    public Output<Integer> repetitionSeparator() {
        return this.repetitionSeparator;
    }

    /**
     * The segment terminator.
     * 
     */
    @Import(name="segmentTerminator", required=true)
    private Output<Integer> segmentTerminator;

    /**
     * @return The segment terminator.
     * 
     */
    public Output<Integer> segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The EDIFACT frame setting segment terminator suffix.
     * 
     */
    @Import(name="segmentTerminatorSuffix", required=true)
    private Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    /**
     * @return The EDIFACT frame setting segment terminator suffix.
     * 
     */
    public Output<SegmentTerminatorSuffix> segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    /**
     * The service code list directory version.
     * 
     */
    @Import(name="serviceCodeListDirectoryVersion")
    private @Nullable Output<String> serviceCodeListDirectoryVersion;

    /**
     * @return The service code list directory version.
     * 
     */
    public Optional<Output<String>> serviceCodeListDirectoryVersion() {
        return Optional.ofNullable(this.serviceCodeListDirectoryVersion);
    }

    private EdifactFramingSettingsArgs() {}

    private EdifactFramingSettingsArgs(EdifactFramingSettingsArgs $) {
        this.characterEncoding = $.characterEncoding;
        this.characterSet = $.characterSet;
        this.componentSeparator = $.componentSeparator;
        this.dataElementSeparator = $.dataElementSeparator;
        this.decimalPointIndicator = $.decimalPointIndicator;
        this.protocolVersion = $.protocolVersion;
        this.releaseIndicator = $.releaseIndicator;
        this.repetitionSeparator = $.repetitionSeparator;
        this.segmentTerminator = $.segmentTerminator;
        this.segmentTerminatorSuffix = $.segmentTerminatorSuffix;
        this.serviceCodeListDirectoryVersion = $.serviceCodeListDirectoryVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactFramingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactFramingSettingsArgs $;

        public Builder() {
            $ = new EdifactFramingSettingsArgs();
        }

        public Builder(EdifactFramingSettingsArgs defaults) {
            $ = new EdifactFramingSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param characterEncoding The character encoding.
         * 
         * @return builder
         * 
         */
        public Builder characterEncoding(@Nullable Output<String> characterEncoding) {
            $.characterEncoding = characterEncoding;
            return this;
        }

        /**
         * @param characterEncoding The character encoding.
         * 
         * @return builder
         * 
         */
        public Builder characterEncoding(String characterEncoding) {
            return characterEncoding(Output.of(characterEncoding));
        }

        /**
         * @param characterSet The EDIFACT frame setting characterSet.
         * 
         * @return builder
         * 
         */
        public Builder characterSet(Output<Either<String,EdifactCharacterSet>> characterSet) {
            $.characterSet = characterSet;
            return this;
        }

        /**
         * @param characterSet The EDIFACT frame setting characterSet.
         * 
         * @return builder
         * 
         */
        public Builder characterSet(Either<String,EdifactCharacterSet> characterSet) {
            return characterSet(Output.of(characterSet));
        }

        /**
         * @param characterSet The EDIFACT frame setting characterSet.
         * 
         * @return builder
         * 
         */
        public Builder characterSet(String characterSet) {
            return characterSet(Either.ofLeft(characterSet));
        }

        /**
         * @param characterSet The EDIFACT frame setting characterSet.
         * 
         * @return builder
         * 
         */
        public Builder characterSet(EdifactCharacterSet characterSet) {
            return characterSet(Either.ofRight(characterSet));
        }

        /**
         * @param componentSeparator The component separator.
         * 
         * @return builder
         * 
         */
        public Builder componentSeparator(Output<Integer> componentSeparator) {
            $.componentSeparator = componentSeparator;
            return this;
        }

        /**
         * @param componentSeparator The component separator.
         * 
         * @return builder
         * 
         */
        public Builder componentSeparator(Integer componentSeparator) {
            return componentSeparator(Output.of(componentSeparator));
        }

        /**
         * @param dataElementSeparator The data element separator.
         * 
         * @return builder
         * 
         */
        public Builder dataElementSeparator(Output<Integer> dataElementSeparator) {
            $.dataElementSeparator = dataElementSeparator;
            return this;
        }

        /**
         * @param dataElementSeparator The data element separator.
         * 
         * @return builder
         * 
         */
        public Builder dataElementSeparator(Integer dataElementSeparator) {
            return dataElementSeparator(Output.of(dataElementSeparator));
        }

        /**
         * @param decimalPointIndicator The EDIFACT frame setting decimal indicator.
         * 
         * @return builder
         * 
         */
        public Builder decimalPointIndicator(Output<EdifactDecimalIndicator> decimalPointIndicator) {
            $.decimalPointIndicator = decimalPointIndicator;
            return this;
        }

        /**
         * @param decimalPointIndicator The EDIFACT frame setting decimal indicator.
         * 
         * @return builder
         * 
         */
        public Builder decimalPointIndicator(EdifactDecimalIndicator decimalPointIndicator) {
            return decimalPointIndicator(Output.of(decimalPointIndicator));
        }

        /**
         * @param protocolVersion The protocol version.
         * 
         * @return builder
         * 
         */
        public Builder protocolVersion(Output<Integer> protocolVersion) {
            $.protocolVersion = protocolVersion;
            return this;
        }

        /**
         * @param protocolVersion The protocol version.
         * 
         * @return builder
         * 
         */
        public Builder protocolVersion(Integer protocolVersion) {
            return protocolVersion(Output.of(protocolVersion));
        }

        /**
         * @param releaseIndicator The release indicator.
         * 
         * @return builder
         * 
         */
        public Builder releaseIndicator(Output<Integer> releaseIndicator) {
            $.releaseIndicator = releaseIndicator;
            return this;
        }

        /**
         * @param releaseIndicator The release indicator.
         * 
         * @return builder
         * 
         */
        public Builder releaseIndicator(Integer releaseIndicator) {
            return releaseIndicator(Output.of(releaseIndicator));
        }

        /**
         * @param repetitionSeparator The repetition separator.
         * 
         * @return builder
         * 
         */
        public Builder repetitionSeparator(Output<Integer> repetitionSeparator) {
            $.repetitionSeparator = repetitionSeparator;
            return this;
        }

        /**
         * @param repetitionSeparator The repetition separator.
         * 
         * @return builder
         * 
         */
        public Builder repetitionSeparator(Integer repetitionSeparator) {
            return repetitionSeparator(Output.of(repetitionSeparator));
        }

        /**
         * @param segmentTerminator The segment terminator.
         * 
         * @return builder
         * 
         */
        public Builder segmentTerminator(Output<Integer> segmentTerminator) {
            $.segmentTerminator = segmentTerminator;
            return this;
        }

        /**
         * @param segmentTerminator The segment terminator.
         * 
         * @return builder
         * 
         */
        public Builder segmentTerminator(Integer segmentTerminator) {
            return segmentTerminator(Output.of(segmentTerminator));
        }

        /**
         * @param segmentTerminatorSuffix The EDIFACT frame setting segment terminator suffix.
         * 
         * @return builder
         * 
         */
        public Builder segmentTerminatorSuffix(Output<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            $.segmentTerminatorSuffix = segmentTerminatorSuffix;
            return this;
        }

        /**
         * @param segmentTerminatorSuffix The EDIFACT frame setting segment terminator suffix.
         * 
         * @return builder
         * 
         */
        public Builder segmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            return segmentTerminatorSuffix(Output.of(segmentTerminatorSuffix));
        }

        /**
         * @param serviceCodeListDirectoryVersion The service code list directory version.
         * 
         * @return builder
         * 
         */
        public Builder serviceCodeListDirectoryVersion(@Nullable Output<String> serviceCodeListDirectoryVersion) {
            $.serviceCodeListDirectoryVersion = serviceCodeListDirectoryVersion;
            return this;
        }

        /**
         * @param serviceCodeListDirectoryVersion The service code list directory version.
         * 
         * @return builder
         * 
         */
        public Builder serviceCodeListDirectoryVersion(String serviceCodeListDirectoryVersion) {
            return serviceCodeListDirectoryVersion(Output.of(serviceCodeListDirectoryVersion));
        }

        public EdifactFramingSettingsArgs build() {
            $.characterSet = Objects.requireNonNull($.characterSet, "expected parameter 'characterSet' to be non-null");
            $.componentSeparator = Objects.requireNonNull($.componentSeparator, "expected parameter 'componentSeparator' to be non-null");
            $.dataElementSeparator = Objects.requireNonNull($.dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
            $.decimalPointIndicator = Objects.requireNonNull($.decimalPointIndicator, "expected parameter 'decimalPointIndicator' to be non-null");
            $.protocolVersion = Objects.requireNonNull($.protocolVersion, "expected parameter 'protocolVersion' to be non-null");
            $.releaseIndicator = Objects.requireNonNull($.releaseIndicator, "expected parameter 'releaseIndicator' to be non-null");
            $.repetitionSeparator = Objects.requireNonNull($.repetitionSeparator, "expected parameter 'repetitionSeparator' to be non-null");
            $.segmentTerminator = Objects.requireNonNull($.segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
            $.segmentTerminatorSuffix = Objects.requireNonNull($.segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
            return $;
        }
    }

}
