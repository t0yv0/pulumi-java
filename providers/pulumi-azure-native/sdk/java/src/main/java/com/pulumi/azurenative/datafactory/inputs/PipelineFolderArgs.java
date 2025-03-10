// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
 * 
 */
public final class PipelineFolderArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineFolderArgs Empty = new PipelineFolderArgs();

    /**
     * The name of the folder that this Pipeline is in.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the folder that this Pipeline is in.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private PipelineFolderArgs() {}

    private PipelineFolderArgs(PipelineFolderArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineFolderArgs $;

        public Builder() {
            $ = new PipelineFolderArgs();
        }

        public Builder(PipelineFolderArgs defaults) {
            $ = new PipelineFolderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the folder that this Pipeline is in.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the folder that this Pipeline is in.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PipelineFolderArgs build() {
            return $;
        }
    }

}
