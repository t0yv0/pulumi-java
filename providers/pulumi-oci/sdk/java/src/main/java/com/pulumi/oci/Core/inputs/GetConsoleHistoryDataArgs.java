// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConsoleHistoryDataArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsoleHistoryDataArgs Empty = new GetConsoleHistoryDataArgs();

    /**
     * The OCID of the console history.
     * 
     */
    @Import(name="consoleHistoryId", required=true)
    private String consoleHistoryId;

    /**
     * @return The OCID of the console history.
     * 
     */
    public String consoleHistoryId() {
        return this.consoleHistoryId;
    }

    /**
     * Length of the snapshot data to retrieve. Cannot be less than 10240.
     * 
     */
    @Import(name="length")
    private @Nullable Integer length;

    /**
     * @return Length of the snapshot data to retrieve. Cannot be less than 10240.
     * 
     */
    public Optional<Integer> length() {
        return Optional.ofNullable(this.length);
    }

    /**
     * Offset of the snapshot data to retrieve.
     * 
     */
    @Import(name="offset")
    private @Nullable Integer offset;

    /**
     * @return Offset of the snapshot data to retrieve.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }

    private GetConsoleHistoryDataArgs() {}

    private GetConsoleHistoryDataArgs(GetConsoleHistoryDataArgs $) {
        this.consoleHistoryId = $.consoleHistoryId;
        this.length = $.length;
        this.offset = $.offset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsoleHistoryDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsoleHistoryDataArgs $;

        public Builder() {
            $ = new GetConsoleHistoryDataArgs();
        }

        public Builder(GetConsoleHistoryDataArgs defaults) {
            $ = new GetConsoleHistoryDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consoleHistoryId The OCID of the console history.
         * 
         * @return builder
         * 
         */
        public Builder consoleHistoryId(String consoleHistoryId) {
            $.consoleHistoryId = consoleHistoryId;
            return this;
        }

        /**
         * @param length Length of the snapshot data to retrieve. Cannot be less than 10240.
         * 
         * @return builder
         * 
         */
        public Builder length(@Nullable Integer length) {
            $.length = length;
            return this;
        }

        /**
         * @param offset Offset of the snapshot data to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder offset(@Nullable Integer offset) {
            $.offset = offset;
            return this;
        }

        public GetConsoleHistoryDataArgs build() {
            $.consoleHistoryId = Objects.requireNonNull($.consoleHistoryId, "expected parameter 'consoleHistoryId' to be non-null");
            return $;
        }
    }

}
