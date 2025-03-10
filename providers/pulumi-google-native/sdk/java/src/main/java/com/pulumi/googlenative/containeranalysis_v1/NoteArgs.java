// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.AttestationNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.BuildNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.ComplianceNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.DSSEAttestationNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.DeploymentNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.DiscoveryNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.ImageNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.PackageNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.RelatedUrlArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeNoteArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.VulnerabilityNoteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final NoteArgs Empty = new NoteArgs();

    /**
     * A note describing an attestation role.
     * 
     */
    @Import(name="attestation")
    private @Nullable Output<AttestationNoteArgs> attestation;

    /**
     * @return A note describing an attestation role.
     * 
     */
    public Optional<Output<AttestationNoteArgs>> attestation() {
        return Optional.ofNullable(this.attestation);
    }

    /**
     * A note describing build provenance for a verifiable build.
     * 
     */
    @Import(name="build")
    private @Nullable Output<BuildNoteArgs> build;

    /**
     * @return A note describing build provenance for a verifiable build.
     * 
     */
    public Optional<Output<BuildNoteArgs>> build() {
        return Optional.ofNullable(this.build);
    }

    /**
     * A note describing a compliance check.
     * 
     */
    @Import(name="compliance")
    private @Nullable Output<ComplianceNoteArgs> compliance;

    /**
     * @return A note describing a compliance check.
     * 
     */
    public Optional<Output<ComplianceNoteArgs>> compliance() {
        return Optional.ofNullable(this.compliance);
    }

    /**
     * A note describing something that can be deployed.
     * 
     */
    @Import(name="deployment")
    private @Nullable Output<DeploymentNoteArgs> deployment;

    /**
     * @return A note describing something that can be deployed.
     * 
     */
    public Optional<Output<DeploymentNoteArgs>> deployment() {
        return Optional.ofNullable(this.deployment);
    }

    /**
     * A note describing the initial analysis of a resource.
     * 
     */
    @Import(name="discovery")
    private @Nullable Output<DiscoveryNoteArgs> discovery;

    /**
     * @return A note describing the initial analysis of a resource.
     * 
     */
    public Optional<Output<DiscoveryNoteArgs>> discovery() {
        return Optional.ofNullable(this.discovery);
    }

    /**
     * A note describing a dsse attestation note.
     * 
     */
    @Import(name="dsseAttestation")
    private @Nullable Output<DSSEAttestationNoteArgs> dsseAttestation;

    /**
     * @return A note describing a dsse attestation note.
     * 
     */
    public Optional<Output<DSSEAttestationNoteArgs>> dsseAttestation() {
        return Optional.ofNullable(this.dsseAttestation);
    }

    /**
     * Time of expiration for this note. Empty if note does not expire.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<String> expirationTime;

    /**
     * @return Time of expiration for this note. Empty if note does not expire.
     * 
     */
    public Optional<Output<String>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * A note describing a base image.
     * 
     */
    @Import(name="image")
    private @Nullable Output<ImageNoteArgs> image;

    /**
     * @return A note describing a base image.
     * 
     */
    public Optional<Output<ImageNoteArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * A detailed description of this note.
     * 
     */
    @Import(name="longDescription")
    private @Nullable Output<String> longDescription;

    /**
     * @return A detailed description of this note.
     * 
     */
    public Optional<Output<String>> longDescription() {
        return Optional.ofNullable(this.longDescription);
    }

    /**
     * Required. The ID to use for this note.
     * 
     */
    @Import(name="noteId", required=true)
    private Output<String> noteId;

    /**
     * @return Required. The ID to use for this note.
     * 
     */
    public Output<String> noteId() {
        return this.noteId;
    }

    /**
     * A note describing a package hosted by various package managers.
     * 
     */
    @Import(name="package")
    private @Nullable Output<PackageNoteArgs> package_;

    /**
     * @return A note describing a package hosted by various package managers.
     * 
     */
    public Optional<Output<PackageNoteArgs>> package_() {
        return Optional.ofNullable(this.package_);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Other notes related to this note.
     * 
     */
    @Import(name="relatedNoteNames")
    private @Nullable Output<List<String>> relatedNoteNames;

    /**
     * @return Other notes related to this note.
     * 
     */
    public Optional<Output<List<String>>> relatedNoteNames() {
        return Optional.ofNullable(this.relatedNoteNames);
    }

    /**
     * URLs associated with this note.
     * 
     */
    @Import(name="relatedUrl")
    private @Nullable Output<List<RelatedUrlArgs>> relatedUrl;

    /**
     * @return URLs associated with this note.
     * 
     */
    public Optional<Output<List<RelatedUrlArgs>>> relatedUrl() {
        return Optional.ofNullable(this.relatedUrl);
    }

    /**
     * A one sentence description of this note.
     * 
     */
    @Import(name="shortDescription")
    private @Nullable Output<String> shortDescription;

    /**
     * @return A one sentence description of this note.
     * 
     */
    public Optional<Output<String>> shortDescription() {
        return Optional.ofNullable(this.shortDescription);
    }

    /**
     * A note describing available package upgrades.
     * 
     */
    @Import(name="upgrade")
    private @Nullable Output<UpgradeNoteArgs> upgrade;

    /**
     * @return A note describing available package upgrades.
     * 
     */
    public Optional<Output<UpgradeNoteArgs>> upgrade() {
        return Optional.ofNullable(this.upgrade);
    }

    /**
     * A note describing a package vulnerability.
     * 
     */
    @Import(name="vulnerability")
    private @Nullable Output<VulnerabilityNoteArgs> vulnerability;

    /**
     * @return A note describing a package vulnerability.
     * 
     */
    public Optional<Output<VulnerabilityNoteArgs>> vulnerability() {
        return Optional.ofNullable(this.vulnerability);
    }

    private NoteArgs() {}

    private NoteArgs(NoteArgs $) {
        this.attestation = $.attestation;
        this.build = $.build;
        this.compliance = $.compliance;
        this.deployment = $.deployment;
        this.discovery = $.discovery;
        this.dsseAttestation = $.dsseAttestation;
        this.expirationTime = $.expirationTime;
        this.image = $.image;
        this.longDescription = $.longDescription;
        this.noteId = $.noteId;
        this.package_ = $.package_;
        this.project = $.project;
        this.relatedNoteNames = $.relatedNoteNames;
        this.relatedUrl = $.relatedUrl;
        this.shortDescription = $.shortDescription;
        this.upgrade = $.upgrade;
        this.vulnerability = $.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NoteArgs $;

        public Builder() {
            $ = new NoteArgs();
        }

        public Builder(NoteArgs defaults) {
            $ = new NoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestation A note describing an attestation role.
         * 
         * @return builder
         * 
         */
        public Builder attestation(@Nullable Output<AttestationNoteArgs> attestation) {
            $.attestation = attestation;
            return this;
        }

        /**
         * @param attestation A note describing an attestation role.
         * 
         * @return builder
         * 
         */
        public Builder attestation(AttestationNoteArgs attestation) {
            return attestation(Output.of(attestation));
        }

        /**
         * @param build A note describing build provenance for a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder build(@Nullable Output<BuildNoteArgs> build) {
            $.build = build;
            return this;
        }

        /**
         * @param build A note describing build provenance for a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder build(BuildNoteArgs build) {
            return build(Output.of(build));
        }

        /**
         * @param compliance A note describing a compliance check.
         * 
         * @return builder
         * 
         */
        public Builder compliance(@Nullable Output<ComplianceNoteArgs> compliance) {
            $.compliance = compliance;
            return this;
        }

        /**
         * @param compliance A note describing a compliance check.
         * 
         * @return builder
         * 
         */
        public Builder compliance(ComplianceNoteArgs compliance) {
            return compliance(Output.of(compliance));
        }

        /**
         * @param deployment A note describing something that can be deployed.
         * 
         * @return builder
         * 
         */
        public Builder deployment(@Nullable Output<DeploymentNoteArgs> deployment) {
            $.deployment = deployment;
            return this;
        }

        /**
         * @param deployment A note describing something that can be deployed.
         * 
         * @return builder
         * 
         */
        public Builder deployment(DeploymentNoteArgs deployment) {
            return deployment(Output.of(deployment));
        }

        /**
         * @param discovery A note describing the initial analysis of a resource.
         * 
         * @return builder
         * 
         */
        public Builder discovery(@Nullable Output<DiscoveryNoteArgs> discovery) {
            $.discovery = discovery;
            return this;
        }

        /**
         * @param discovery A note describing the initial analysis of a resource.
         * 
         * @return builder
         * 
         */
        public Builder discovery(DiscoveryNoteArgs discovery) {
            return discovery(Output.of(discovery));
        }

        /**
         * @param dsseAttestation A note describing a dsse attestation note.
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(@Nullable Output<DSSEAttestationNoteArgs> dsseAttestation) {
            $.dsseAttestation = dsseAttestation;
            return this;
        }

        /**
         * @param dsseAttestation A note describing a dsse attestation note.
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(DSSEAttestationNoteArgs dsseAttestation) {
            return dsseAttestation(Output.of(dsseAttestation));
        }

        /**
         * @param expirationTime Time of expiration for this note. Empty if note does not expire.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime Time of expiration for this note. Empty if note does not expire.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(String expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param image A note describing a base image.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<ImageNoteArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image A note describing a base image.
         * 
         * @return builder
         * 
         */
        public Builder image(ImageNoteArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param longDescription A detailed description of this note.
         * 
         * @return builder
         * 
         */
        public Builder longDescription(@Nullable Output<String> longDescription) {
            $.longDescription = longDescription;
            return this;
        }

        /**
         * @param longDescription A detailed description of this note.
         * 
         * @return builder
         * 
         */
        public Builder longDescription(String longDescription) {
            return longDescription(Output.of(longDescription));
        }

        /**
         * @param noteId Required. The ID to use for this note.
         * 
         * @return builder
         * 
         */
        public Builder noteId(Output<String> noteId) {
            $.noteId = noteId;
            return this;
        }

        /**
         * @param noteId Required. The ID to use for this note.
         * 
         * @return builder
         * 
         */
        public Builder noteId(String noteId) {
            return noteId(Output.of(noteId));
        }

        /**
         * @param package_ A note describing a package hosted by various package managers.
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable Output<PackageNoteArgs> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ A note describing a package hosted by various package managers.
         * 
         * @return builder
         * 
         */
        public Builder package_(PackageNoteArgs package_) {
            return package_(Output.of(package_));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param relatedNoteNames Other notes related to this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedNoteNames(@Nullable Output<List<String>> relatedNoteNames) {
            $.relatedNoteNames = relatedNoteNames;
            return this;
        }

        /**
         * @param relatedNoteNames Other notes related to this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedNoteNames(List<String> relatedNoteNames) {
            return relatedNoteNames(Output.of(relatedNoteNames));
        }

        /**
         * @param relatedNoteNames Other notes related to this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedNoteNames(String... relatedNoteNames) {
            return relatedNoteNames(List.of(relatedNoteNames));
        }

        /**
         * @param relatedUrl URLs associated with this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedUrl(@Nullable Output<List<RelatedUrlArgs>> relatedUrl) {
            $.relatedUrl = relatedUrl;
            return this;
        }

        /**
         * @param relatedUrl URLs associated with this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedUrl(List<RelatedUrlArgs> relatedUrl) {
            return relatedUrl(Output.of(relatedUrl));
        }

        /**
         * @param relatedUrl URLs associated with this note.
         * 
         * @return builder
         * 
         */
        public Builder relatedUrl(RelatedUrlArgs... relatedUrl) {
            return relatedUrl(List.of(relatedUrl));
        }

        /**
         * @param shortDescription A one sentence description of this note.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(@Nullable Output<String> shortDescription) {
            $.shortDescription = shortDescription;
            return this;
        }

        /**
         * @param shortDescription A one sentence description of this note.
         * 
         * @return builder
         * 
         */
        public Builder shortDescription(String shortDescription) {
            return shortDescription(Output.of(shortDescription));
        }

        /**
         * @param upgrade A note describing available package upgrades.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(@Nullable Output<UpgradeNoteArgs> upgrade) {
            $.upgrade = upgrade;
            return this;
        }

        /**
         * @param upgrade A note describing available package upgrades.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(UpgradeNoteArgs upgrade) {
            return upgrade(Output.of(upgrade));
        }

        /**
         * @param vulnerability A note describing a package vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder vulnerability(@Nullable Output<VulnerabilityNoteArgs> vulnerability) {
            $.vulnerability = vulnerability;
            return this;
        }

        /**
         * @param vulnerability A note describing a package vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder vulnerability(VulnerabilityNoteArgs vulnerability) {
            return vulnerability(Output.of(vulnerability));
        }

        public NoteArgs build() {
            $.noteId = Objects.requireNonNull($.noteId, "expected parameter 'noteId' to be non-null");
            return $;
        }
    }

}
