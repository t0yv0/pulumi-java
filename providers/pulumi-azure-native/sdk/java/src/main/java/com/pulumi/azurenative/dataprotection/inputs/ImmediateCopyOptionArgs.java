// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Immediate copy Option
 * 
 */
public final class ImmediateCopyOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImmediateCopyOptionArgs Empty = new ImmediateCopyOptionArgs();

    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;ImmediateCopyOption&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    /**
     * @return Type of the specific object - used for deserializing
     * Expected value is &#39;ImmediateCopyOption&#39;.
     * 
     */
    public Output<String> objectType() {
        return this.objectType;
    }

    private ImmediateCopyOptionArgs() {}

    private ImmediateCopyOptionArgs(ImmediateCopyOptionArgs $) {
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImmediateCopyOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImmediateCopyOptionArgs $;

        public Builder() {
            $ = new ImmediateCopyOptionArgs();
        }

        public Builder(ImmediateCopyOptionArgs defaults) {
            $ = new ImmediateCopyOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param objectType Type of the specific object - used for deserializing
         * Expected value is &#39;ImmediateCopyOption&#39;.
         * 
         * @return builder
         * 
         */
        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        /**
         * @param objectType Type of the specific object - used for deserializing
         * Expected value is &#39;ImmediateCopyOption&#39;.
         * 
         * @return builder
         * 
         */
        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public ImmediateCopyOptionArgs build() {
            $.objectType = Codegen.stringProp("objectType").output().arg($.objectType).require();
            return $;
        }
    }

}
