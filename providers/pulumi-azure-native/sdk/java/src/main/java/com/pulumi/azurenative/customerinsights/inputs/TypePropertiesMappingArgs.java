// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.azurenative.customerinsights.enums.LinkTypes;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata for a Link&#39;s property mapping.
 * 
 */
public final class TypePropertiesMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TypePropertiesMappingArgs Empty = new TypePropertiesMappingArgs();

    /**
     * Link type.
     * 
     */
    @Import(name="linkType")
    private @Nullable Output<LinkTypes> linkType;

    /**
     * @return Link type.
     * 
     */
    public Optional<Output<LinkTypes>> linkType() {
        return Optional.ofNullable(this.linkType);
    }

    /**
     *  Property name on the source Entity Type.
     * 
     */
    @Import(name="sourcePropertyName", required=true)
    private Output<String> sourcePropertyName;

    /**
     * @return  Property name on the source Entity Type.
     * 
     */
    public Output<String> sourcePropertyName() {
        return this.sourcePropertyName;
    }

    /**
     * Property name on the target Entity Type.
     * 
     */
    @Import(name="targetPropertyName", required=true)
    private Output<String> targetPropertyName;

    /**
     * @return Property name on the target Entity Type.
     * 
     */
    public Output<String> targetPropertyName() {
        return this.targetPropertyName;
    }

    private TypePropertiesMappingArgs() {}

    private TypePropertiesMappingArgs(TypePropertiesMappingArgs $) {
        this.linkType = $.linkType;
        this.sourcePropertyName = $.sourcePropertyName;
        this.targetPropertyName = $.targetPropertyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TypePropertiesMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TypePropertiesMappingArgs $;

        public Builder() {
            $ = new TypePropertiesMappingArgs();
        }

        public Builder(TypePropertiesMappingArgs defaults) {
            $ = new TypePropertiesMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkType Link type.
         * 
         * @return builder
         * 
         */
        public Builder linkType(@Nullable Output<LinkTypes> linkType) {
            $.linkType = linkType;
            return this;
        }

        /**
         * @param linkType Link type.
         * 
         * @return builder
         * 
         */
        public Builder linkType(LinkTypes linkType) {
            return linkType(Output.of(linkType));
        }

        /**
         * @param sourcePropertyName  Property name on the source Entity Type.
         * 
         * @return builder
         * 
         */
        public Builder sourcePropertyName(Output<String> sourcePropertyName) {
            $.sourcePropertyName = sourcePropertyName;
            return this;
        }

        /**
         * @param sourcePropertyName  Property name on the source Entity Type.
         * 
         * @return builder
         * 
         */
        public Builder sourcePropertyName(String sourcePropertyName) {
            return sourcePropertyName(Output.of(sourcePropertyName));
        }

        /**
         * @param targetPropertyName Property name on the target Entity Type.
         * 
         * @return builder
         * 
         */
        public Builder targetPropertyName(Output<String> targetPropertyName) {
            $.targetPropertyName = targetPropertyName;
            return this;
        }

        /**
         * @param targetPropertyName Property name on the target Entity Type.
         * 
         * @return builder
         * 
         */
        public Builder targetPropertyName(String targetPropertyName) {
            return targetPropertyName(Output.of(targetPropertyName));
        }

        public TypePropertiesMappingArgs build() {
            $.sourcePropertyName = Objects.requireNonNull($.sourcePropertyName, "expected parameter 'sourcePropertyName' to be non-null");
            $.targetPropertyName = Objects.requireNonNull($.targetPropertyName, "expected parameter 'targetPropertyName' to be non-null");
            return $;
        }
    }

}
