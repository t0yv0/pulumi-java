// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.certificatemanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.certificatemanager_v1.enums.CertificateScope;
import com.pulumi.googlenative.certificatemanager_v1.inputs.ManagedCertificateArgs;
import com.pulumi.googlenative.certificatemanager_v1.inputs.SelfManagedCertificateArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * Required. A user-provided name of the certificate.
     * 
     */
    @Import(name="certificateId", required=true)
    private Output<String> certificateId;

    /**
     * @return Required. A user-provided name of the certificate.
     * 
     */
    public Output<String> certificateId() {
        return this.certificateId;
    }

    /**
     * One or more paragraphs of text description of a certificate.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return One or more paragraphs of text description of a certificate.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Set of labels associated with a Certificate.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Set of labels associated with a Certificate.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * If set, contains configuration and state of a managed certificate.
     * 
     */
    @Import(name="managed")
    private @Nullable Output<ManagedCertificateArgs> managed;

    /**
     * @return If set, contains configuration and state of a managed certificate.
     * 
     */
    public Optional<Output<ManagedCertificateArgs>> managed() {
        return Optional.ofNullable(this.managed);
    }

    /**
     * A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Immutable. The scope of the certificate.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<CertificateScope> scope;

    /**
     * @return Immutable. The scope of the certificate.
     * 
     */
    public Optional<Output<CertificateScope>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * If set, defines data of a self-managed certificate.
     * 
     */
    @Import(name="selfManaged")
    private @Nullable Output<SelfManagedCertificateArgs> selfManaged;

    /**
     * @return If set, defines data of a self-managed certificate.
     * 
     */
    public Optional<Output<SelfManagedCertificateArgs>> selfManaged() {
        return Optional.ofNullable(this.selfManaged);
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.certificateId = $.certificateId;
        this.description = $.description;
        this.labels = $.labels;
        this.location = $.location;
        this.managed = $.managed;
        this.name = $.name;
        this.project = $.project;
        this.scope = $.scope;
        this.selfManaged = $.selfManaged;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId Required. A user-provided name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(Output<String> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId Required. A user-provided name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(String certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param description One or more paragraphs of text description of a certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description One or more paragraphs of text description of a certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Set of labels associated with a Certificate.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Set of labels associated with a Certificate.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managed If set, contains configuration and state of a managed certificate.
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<ManagedCertificateArgs> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed If set, contains configuration and state of a managed certificate.
         * 
         * @return builder
         * 
         */
        public Builder managed(ManagedCertificateArgs managed) {
            return managed(Output.of(managed));
        }

        /**
         * @param name A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-defined name of the certificate. Certificate names must be unique globally and match pattern `projects/*{@literal /}locations/*{@literal /}certificates/*`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param scope Immutable. The scope of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<CertificateScope> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Immutable. The scope of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder scope(CertificateScope scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param selfManaged If set, defines data of a self-managed certificate.
         * 
         * @return builder
         * 
         */
        public Builder selfManaged(@Nullable Output<SelfManagedCertificateArgs> selfManaged) {
            $.selfManaged = selfManaged;
            return this;
        }

        /**
         * @param selfManaged If set, defines data of a self-managed certificate.
         * 
         * @return builder
         * 
         */
        public Builder selfManaged(SelfManagedCertificateArgs selfManaged) {
            return selfManaged(Output.of(selfManaged));
        }

        public CertificateArgs build() {
            $.certificateId = Objects.requireNonNull($.certificateId, "expected parameter 'certificateId' to be non-null");
            return $;
        }
    }

}
