// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.binaryauthorization.outputs.AttestorAttestationAuthorityNotePublicKey;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AttestorAttestationAuthorityNote {
    /**
     * @return -
     * This field will contain the service account email address that
     * this Attestor will use as the principal when querying Container
     * Analysis. Attestor administrators must grant this service account
     * the IAM role needed to read attestations from the noteReference in
     * Container Analysis (containeranalysis.notes.occurrences.viewer).
     * This email address is fixed for the lifetime of the Attestor, but
     * callers should not make any other assumptions about the service
     * account email; future versions may use an email based on a
     * different naming pattern.
     * 
     */
    private final @Nullable String delegationServiceAccountEmail;
    /**
     * @return The resource name of a ATTESTATION_AUTHORITY Note, created by the
     * user. If the Note is in a different project from the Attestor, it
     * should be specified in the format `projects/*{@literal /}notes/*` (or the legacy
     * `providers/*{@literal /}notes/*`). This field may not be updated.
     * An attestation by this attestor is stored as a Container Analysis
     * ATTESTATION_AUTHORITY Occurrence that names a container image
     * and that links to this Note.
     * 
     */
    private final String noteReference;
    /**
     * @return Public keys that verify attestations signed by this attestor. This
     * field may be updated.
     * If this field is non-empty, one of the specified public keys must
     * verify that an attestation was signed by this attestor for the
     * image specified in the admission request.
     * If this field is empty, this attestor always returns that no valid
     * attestations exist.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<AttestorAttestationAuthorityNotePublicKey> publicKeys;

    @CustomType.Constructor
    private AttestorAttestationAuthorityNote(
        @CustomType.Parameter("delegationServiceAccountEmail") @Nullable String delegationServiceAccountEmail,
        @CustomType.Parameter("noteReference") String noteReference,
        @CustomType.Parameter("publicKeys") @Nullable List<AttestorAttestationAuthorityNotePublicKey> publicKeys) {
        this.delegationServiceAccountEmail = delegationServiceAccountEmail;
        this.noteReference = noteReference;
        this.publicKeys = publicKeys;
    }

    /**
     * @return -
     * This field will contain the service account email address that
     * this Attestor will use as the principal when querying Container
     * Analysis. Attestor administrators must grant this service account
     * the IAM role needed to read attestations from the noteReference in
     * Container Analysis (containeranalysis.notes.occurrences.viewer).
     * This email address is fixed for the lifetime of the Attestor, but
     * callers should not make any other assumptions about the service
     * account email; future versions may use an email based on a
     * different naming pattern.
     * 
     */
    public Optional<String> delegationServiceAccountEmail() {
        return Optional.ofNullable(this.delegationServiceAccountEmail);
    }
    /**
     * @return The resource name of a ATTESTATION_AUTHORITY Note, created by the
     * user. If the Note is in a different project from the Attestor, it
     * should be specified in the format `projects/*{@literal /}notes/*` (or the legacy
     * `providers/*{@literal /}notes/*`). This field may not be updated.
     * An attestation by this attestor is stored as a Container Analysis
     * ATTESTATION_AUTHORITY Occurrence that names a container image
     * and that links to this Note.
     * 
     */
    public String noteReference() {
        return this.noteReference;
    }
    /**
     * @return Public keys that verify attestations signed by this attestor. This
     * field may be updated.
     * If this field is non-empty, one of the specified public keys must
     * verify that an attestation was signed by this attestor for the
     * image specified in the admission request.
     * If this field is empty, this attestor always returns that no valid
     * attestations exist.
     * Structure is documented below.
     * 
     */
    public List<AttestorAttestationAuthorityNotePublicKey> publicKeys() {
        return this.publicKeys == null ? List.of() : this.publicKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestorAttestationAuthorityNote defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delegationServiceAccountEmail;
        private String noteReference;
        private @Nullable List<AttestorAttestationAuthorityNotePublicKey> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestorAttestationAuthorityNote defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegationServiceAccountEmail = defaults.delegationServiceAccountEmail;
    	      this.noteReference = defaults.noteReference;
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder delegationServiceAccountEmail(@Nullable String delegationServiceAccountEmail) {
            this.delegationServiceAccountEmail = delegationServiceAccountEmail;
            return this;
        }
        public Builder noteReference(String noteReference) {
            this.noteReference = Objects.requireNonNull(noteReference);
            return this;
        }
        public Builder publicKeys(@Nullable List<AttestorAttestationAuthorityNotePublicKey> publicKeys) {
            this.publicKeys = publicKeys;
            return this;
        }
        public Builder publicKeys(AttestorAttestationAuthorityNotePublicKey... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public AttestorAttestationAuthorityNote build() {
            return new AttestorAttestationAuthorityNote(delegationServiceAccountEmail, noteReference, publicKeys);
        }
    }
}
