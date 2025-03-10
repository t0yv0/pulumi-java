// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.binaryauthorization_v1.inputs.AttestorPublicKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An user owned Grafeas note references a Grafeas Attestation.Authority Note created by the user.
 * 
 */
public final class UserOwnedGrafeasNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserOwnedGrafeasNoteArgs Empty = new UserOwnedGrafeasNoteArgs();

    /**
     * The Grafeas resource name of a Attestation.Authority Note, created by the user, in the format: `projects/*{@literal /}notes/*`. This field may not be updated. An attestation by this attestor is stored as a Grafeas Attestation.Authority Occurrence that names a container image and that links to this Note. Grafeas is an external dependency.
     * 
     */
    @Import(name="noteReference", required=true)
    private Output<String> noteReference;

    /**
     * @return The Grafeas resource name of a Attestation.Authority Note, created by the user, in the format: `projects/*{@literal /}notes/*`. This field may not be updated. An attestation by this attestor is stored as a Grafeas Attestation.Authority Occurrence that names a container image and that links to this Note. Grafeas is an external dependency.
     * 
     */
    public Output<String> noteReference() {
        return this.noteReference;
    }

    /**
     * Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
     * 
     */
    @Import(name="publicKeys")
    private @Nullable Output<List<AttestorPublicKeyArgs>> publicKeys;

    /**
     * @return Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
     * 
     */
    public Optional<Output<List<AttestorPublicKeyArgs>>> publicKeys() {
        return Optional.ofNullable(this.publicKeys);
    }

    private UserOwnedGrafeasNoteArgs() {}

    private UserOwnedGrafeasNoteArgs(UserOwnedGrafeasNoteArgs $) {
        this.noteReference = $.noteReference;
        this.publicKeys = $.publicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserOwnedGrafeasNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserOwnedGrafeasNoteArgs $;

        public Builder() {
            $ = new UserOwnedGrafeasNoteArgs();
        }

        public Builder(UserOwnedGrafeasNoteArgs defaults) {
            $ = new UserOwnedGrafeasNoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param noteReference The Grafeas resource name of a Attestation.Authority Note, created by the user, in the format: `projects/*{@literal /}notes/*`. This field may not be updated. An attestation by this attestor is stored as a Grafeas Attestation.Authority Occurrence that names a container image and that links to this Note. Grafeas is an external dependency.
         * 
         * @return builder
         * 
         */
        public Builder noteReference(Output<String> noteReference) {
            $.noteReference = noteReference;
            return this;
        }

        /**
         * @param noteReference The Grafeas resource name of a Attestation.Authority Note, created by the user, in the format: `projects/*{@literal /}notes/*`. This field may not be updated. An attestation by this attestor is stored as a Grafeas Attestation.Authority Occurrence that names a container image and that links to this Note. Grafeas is an external dependency.
         * 
         * @return builder
         * 
         */
        public Builder noteReference(String noteReference) {
            return noteReference(Output.of(noteReference));
        }

        /**
         * @param publicKeys Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(@Nullable Output<List<AttestorPublicKeyArgs>> publicKeys) {
            $.publicKeys = publicKeys;
            return this;
        }

        /**
         * @param publicKeys Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(List<AttestorPublicKeyArgs> publicKeys) {
            return publicKeys(Output.of(publicKeys));
        }

        /**
         * @param publicKeys Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
         * 
         * @return builder
         * 
         */
        public Builder publicKeys(AttestorPublicKeyArgs... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }

        public UserOwnedGrafeasNoteArgs build() {
            $.noteReference = Objects.requireNonNull($.noteReference, "expected parameter 'noteReference' to be non-null");
            return $;
        }
    }

}
