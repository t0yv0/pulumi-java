// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAttestorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttestorArgs Empty = new GetAttestorArgs();

    @Import(name="attestorId", required=true)
    private String attestorId;

    public String attestorId() {
        return this.attestorId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAttestorArgs() {}

    private GetAttestorArgs(GetAttestorArgs $) {
        this.attestorId = $.attestorId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttestorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttestorArgs $;

        public Builder() {
            $ = new GetAttestorArgs();
        }

        public Builder(GetAttestorArgs defaults) {
            $ = new GetAttestorArgs(Objects.requireNonNull(defaults));
        }

        public Builder attestorId(String attestorId) {
            $.attestorId = attestorId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAttestorArgs build() {
            $.attestorId = Objects.requireNonNull($.attestorId, "expected parameter 'attestorId' to be non-null");
            return $;
        }
    }

}
