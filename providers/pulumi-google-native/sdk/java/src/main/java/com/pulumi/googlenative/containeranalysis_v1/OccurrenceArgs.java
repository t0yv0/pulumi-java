// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1.inputs.AttestationOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.BuildOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.ComplianceOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.DSSEAttestationOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.DeploymentOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.DiscoveryOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.EnvelopeArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.ImageOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.PackageOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeOccurrenceArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.VulnerabilityOccurrenceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OccurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final OccurrenceArgs Empty = new OccurrenceArgs();

    /**
     * Describes an attestation of an artifact.
     * 
     */
    @Import(name="attestation")
    private @Nullable Output<AttestationOccurrenceArgs> attestation;

    /**
     * @return Describes an attestation of an artifact.
     * 
     */
    public Optional<Output<AttestationOccurrenceArgs>> attestation() {
        return Optional.ofNullable(this.attestation);
    }

    /**
     * Describes a verifiable build.
     * 
     */
    @Import(name="build")
    private @Nullable Output<BuildOccurrenceArgs> build;

    /**
     * @return Describes a verifiable build.
     * 
     */
    public Optional<Output<BuildOccurrenceArgs>> build() {
        return Optional.ofNullable(this.build);
    }

    /**
     * Describes a compliance violation on a linked resource.
     * 
     */
    @Import(name="compliance")
    private @Nullable Output<ComplianceOccurrenceArgs> compliance;

    /**
     * @return Describes a compliance violation on a linked resource.
     * 
     */
    public Optional<Output<ComplianceOccurrenceArgs>> compliance() {
        return Optional.ofNullable(this.compliance);
    }

    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    @Import(name="deployment")
    private @Nullable Output<DeploymentOccurrenceArgs> deployment;

    /**
     * @return Describes the deployment of an artifact on a runtime.
     * 
     */
    public Optional<Output<DeploymentOccurrenceArgs>> deployment() {
        return Optional.ofNullable(this.deployment);
    }

    /**
     * Describes when a resource was discovered.
     * 
     */
    @Import(name="discovery")
    private @Nullable Output<DiscoveryOccurrenceArgs> discovery;

    /**
     * @return Describes when a resource was discovered.
     * 
     */
    public Optional<Output<DiscoveryOccurrenceArgs>> discovery() {
        return Optional.ofNullable(this.discovery);
    }

    /**
     * Describes an attestation of an artifact using dsse.
     * 
     */
    @Import(name="dsseAttestation")
    private @Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation;

    /**
     * @return Describes an attestation of an artifact using dsse.
     * 
     */
    public Optional<Output<DSSEAttestationOccurrenceArgs>> dsseAttestation() {
        return Optional.ofNullable(this.dsseAttestation);
    }

    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    @Import(name="envelope")
    private @Nullable Output<EnvelopeArgs> envelope;

    /**
     * @return https://github.com/secure-systems-lab/dsse
     * 
     */
    public Optional<Output<EnvelopeArgs>> envelope() {
        return Optional.ofNullable(this.envelope);
    }

    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    @Import(name="image")
    private @Nullable Output<ImageOccurrenceArgs> image;

    /**
     * @return Describes how this resource derives from the basis in the associated note.
     * 
     */
    public Optional<Output<ImageOccurrenceArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    @Import(name="noteName", required=true)
    private Output<String> noteName;

    /**
     * @return Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
     * 
     */
    public Output<String> noteName() {
        return this.noteName;
    }

    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    @Import(name="package")
    private @Nullable Output<PackageOccurrenceArgs> package_;

    /**
     * @return Describes the installation of a package on the linked resource.
     * 
     */
    public Optional<Output<PackageOccurrenceArgs>> package_() {
        return Optional.ofNullable(this.package_);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A description of actions that can be taken to remedy the note.
     * 
     */
    @Import(name="remediation")
    private @Nullable Output<String> remediation;

    /**
     * @return A description of actions that can be taken to remedy the note.
     * 
     */
    public Optional<Output<String>> remediation() {
        return Optional.ofNullable(this.remediation);
    }

    /**
     * Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
     * 
     */
    @Import(name="resourceUri", required=true)
    private Output<String> resourceUri;

    /**
     * @return Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
     * 
     */
    public Output<String> resourceUri() {
        return this.resourceUri;
    }

    /**
     * Describes an available package upgrade on the linked resource.
     * 
     */
    @Import(name="upgrade")
    private @Nullable Output<UpgradeOccurrenceArgs> upgrade;

    /**
     * @return Describes an available package upgrade on the linked resource.
     * 
     */
    public Optional<Output<UpgradeOccurrenceArgs>> upgrade() {
        return Optional.ofNullable(this.upgrade);
    }

    /**
     * Describes a security vulnerability.
     * 
     */
    @Import(name="vulnerability")
    private @Nullable Output<VulnerabilityOccurrenceArgs> vulnerability;

    /**
     * @return Describes a security vulnerability.
     * 
     */
    public Optional<Output<VulnerabilityOccurrenceArgs>> vulnerability() {
        return Optional.ofNullable(this.vulnerability);
    }

    private OccurrenceArgs() {}

    private OccurrenceArgs(OccurrenceArgs $) {
        this.attestation = $.attestation;
        this.build = $.build;
        this.compliance = $.compliance;
        this.deployment = $.deployment;
        this.discovery = $.discovery;
        this.dsseAttestation = $.dsseAttestation;
        this.envelope = $.envelope;
        this.image = $.image;
        this.noteName = $.noteName;
        this.package_ = $.package_;
        this.project = $.project;
        this.remediation = $.remediation;
        this.resourceUri = $.resourceUri;
        this.upgrade = $.upgrade;
        this.vulnerability = $.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OccurrenceArgs $;

        public Builder() {
            $ = new OccurrenceArgs();
        }

        public Builder(OccurrenceArgs defaults) {
            $ = new OccurrenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attestation Describes an attestation of an artifact.
         * 
         * @return builder
         * 
         */
        public Builder attestation(@Nullable Output<AttestationOccurrenceArgs> attestation) {
            $.attestation = attestation;
            return this;
        }

        /**
         * @param attestation Describes an attestation of an artifact.
         * 
         * @return builder
         * 
         */
        public Builder attestation(AttestationOccurrenceArgs attestation) {
            return attestation(Output.of(attestation));
        }

        /**
         * @param build Describes a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder build(@Nullable Output<BuildOccurrenceArgs> build) {
            $.build = build;
            return this;
        }

        /**
         * @param build Describes a verifiable build.
         * 
         * @return builder
         * 
         */
        public Builder build(BuildOccurrenceArgs build) {
            return build(Output.of(build));
        }

        /**
         * @param compliance Describes a compliance violation on a linked resource.
         * 
         * @return builder
         * 
         */
        public Builder compliance(@Nullable Output<ComplianceOccurrenceArgs> compliance) {
            $.compliance = compliance;
            return this;
        }

        /**
         * @param compliance Describes a compliance violation on a linked resource.
         * 
         * @return builder
         * 
         */
        public Builder compliance(ComplianceOccurrenceArgs compliance) {
            return compliance(Output.of(compliance));
        }

        /**
         * @param deployment Describes the deployment of an artifact on a runtime.
         * 
         * @return builder
         * 
         */
        public Builder deployment(@Nullable Output<DeploymentOccurrenceArgs> deployment) {
            $.deployment = deployment;
            return this;
        }

        /**
         * @param deployment Describes the deployment of an artifact on a runtime.
         * 
         * @return builder
         * 
         */
        public Builder deployment(DeploymentOccurrenceArgs deployment) {
            return deployment(Output.of(deployment));
        }

        /**
         * @param discovery Describes when a resource was discovered.
         * 
         * @return builder
         * 
         */
        public Builder discovery(@Nullable Output<DiscoveryOccurrenceArgs> discovery) {
            $.discovery = discovery;
            return this;
        }

        /**
         * @param discovery Describes when a resource was discovered.
         * 
         * @return builder
         * 
         */
        public Builder discovery(DiscoveryOccurrenceArgs discovery) {
            return discovery(Output.of(discovery));
        }

        /**
         * @param dsseAttestation Describes an attestation of an artifact using dsse.
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(@Nullable Output<DSSEAttestationOccurrenceArgs> dsseAttestation) {
            $.dsseAttestation = dsseAttestation;
            return this;
        }

        /**
         * @param dsseAttestation Describes an attestation of an artifact using dsse.
         * 
         * @return builder
         * 
         */
        public Builder dsseAttestation(DSSEAttestationOccurrenceArgs dsseAttestation) {
            return dsseAttestation(Output.of(dsseAttestation));
        }

        /**
         * @param envelope https://github.com/secure-systems-lab/dsse
         * 
         * @return builder
         * 
         */
        public Builder envelope(@Nullable Output<EnvelopeArgs> envelope) {
            $.envelope = envelope;
            return this;
        }

        /**
         * @param envelope https://github.com/secure-systems-lab/dsse
         * 
         * @return builder
         * 
         */
        public Builder envelope(EnvelopeArgs envelope) {
            return envelope(Output.of(envelope));
        }

        /**
         * @param image Describes how this resource derives from the basis in the associated note.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<ImageOccurrenceArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Describes how this resource derives from the basis in the associated note.
         * 
         * @return builder
         * 
         */
        public Builder image(ImageOccurrenceArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param noteName Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(Output<String> noteName) {
            $.noteName = noteName;
            return this;
        }

        /**
         * @param noteName Immutable. The analysis note associated with this occurrence, in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`. This field can be used as a filter in list requests.
         * 
         * @return builder
         * 
         */
        public Builder noteName(String noteName) {
            return noteName(Output.of(noteName));
        }

        /**
         * @param package_ Describes the installation of a package on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder package_(@Nullable Output<PackageOccurrenceArgs> package_) {
            $.package_ = package_;
            return this;
        }

        /**
         * @param package_ Describes the installation of a package on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder package_(PackageOccurrenceArgs package_) {
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
         * @param remediation A description of actions that can be taken to remedy the note.
         * 
         * @return builder
         * 
         */
        public Builder remediation(@Nullable Output<String> remediation) {
            $.remediation = remediation;
            return this;
        }

        /**
         * @param remediation A description of actions that can be taken to remedy the note.
         * 
         * @return builder
         * 
         */
        public Builder remediation(String remediation) {
            return remediation(Output.of(remediation));
        }

        /**
         * @param resourceUri Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri Immutable. A URI that represents the resource for which the occurrence applies. For example, `https://gcr.io/project/image@sha256:123abc` for a Docker image.
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        /**
         * @param upgrade Describes an available package upgrade on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(@Nullable Output<UpgradeOccurrenceArgs> upgrade) {
            $.upgrade = upgrade;
            return this;
        }

        /**
         * @param upgrade Describes an available package upgrade on the linked resource.
         * 
         * @return builder
         * 
         */
        public Builder upgrade(UpgradeOccurrenceArgs upgrade) {
            return upgrade(Output.of(upgrade));
        }

        /**
         * @param vulnerability Describes a security vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder vulnerability(@Nullable Output<VulnerabilityOccurrenceArgs> vulnerability) {
            $.vulnerability = vulnerability;
            return this;
        }

        /**
         * @param vulnerability Describes a security vulnerability.
         * 
         * @return builder
         * 
         */
        public Builder vulnerability(VulnerabilityOccurrenceArgs vulnerability) {
            return vulnerability(Output.of(vulnerability));
        }

        public OccurrenceArgs build() {
            $.noteName = Objects.requireNonNull($.noteName, "expected parameter 'noteName' to be non-null");
            $.resourceUri = Objects.requireNonNull($.resourceUri, "expected parameter 'resourceUri' to be non-null");
            return $;
        }
    }

}
