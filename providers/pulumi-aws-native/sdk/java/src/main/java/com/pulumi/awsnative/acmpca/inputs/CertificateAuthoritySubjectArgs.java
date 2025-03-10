// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.acmpca.inputs;

import com.pulumi.awsnative.acmpca.inputs.CertificateAuthorityCustomAttributeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Structure that contains X.500 distinguished name information for your CA.
 * 
 */
public final class CertificateAuthoritySubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthoritySubjectArgs Empty = new CertificateAuthoritySubjectArgs();

    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    @Import(name="country")
    private @Nullable Output<String> country;

    public Optional<Output<String>> country() {
        return Optional.ofNullable(this.country);
    }

    @Import(name="customAttributes")
    private @Nullable Output<List<CertificateAuthorityCustomAttributeArgs>> customAttributes;

    public Optional<Output<List<CertificateAuthorityCustomAttributeArgs>>> customAttributes() {
        return Optional.ofNullable(this.customAttributes);
    }

    @Import(name="distinguishedNameQualifier")
    private @Nullable Output<String> distinguishedNameQualifier;

    public Optional<Output<String>> distinguishedNameQualifier() {
        return Optional.ofNullable(this.distinguishedNameQualifier);
    }

    @Import(name="generationQualifier")
    private @Nullable Output<String> generationQualifier;

    public Optional<Output<String>> generationQualifier() {
        return Optional.ofNullable(this.generationQualifier);
    }

    @Import(name="givenName")
    private @Nullable Output<String> givenName;

    public Optional<Output<String>> givenName() {
        return Optional.ofNullable(this.givenName);
    }

    @Import(name="initials")
    private @Nullable Output<String> initials;

    public Optional<Output<String>> initials() {
        return Optional.ofNullable(this.initials);
    }

    @Import(name="locality")
    private @Nullable Output<String> locality;

    public Optional<Output<String>> locality() {
        return Optional.ofNullable(this.locality);
    }

    @Import(name="organization")
    private @Nullable Output<String> organization;

    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    @Import(name="organizationalUnit")
    private @Nullable Output<String> organizationalUnit;

    public Optional<Output<String>> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }

    @Import(name="pseudonym")
    private @Nullable Output<String> pseudonym;

    public Optional<Output<String>> pseudonym() {
        return Optional.ofNullable(this.pseudonym);
    }

    @Import(name="serialNumber")
    private @Nullable Output<String> serialNumber;

    public Optional<Output<String>> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }

    @Import(name="state")
    private @Nullable Output<String> state;

    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    @Import(name="surname")
    private @Nullable Output<String> surname;

    public Optional<Output<String>> surname() {
        return Optional.ofNullable(this.surname);
    }

    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private CertificateAuthoritySubjectArgs() {}

    private CertificateAuthoritySubjectArgs(CertificateAuthoritySubjectArgs $) {
        this.commonName = $.commonName;
        this.country = $.country;
        this.customAttributes = $.customAttributes;
        this.distinguishedNameQualifier = $.distinguishedNameQualifier;
        this.generationQualifier = $.generationQualifier;
        this.givenName = $.givenName;
        this.initials = $.initials;
        this.locality = $.locality;
        this.organization = $.organization;
        this.organizationalUnit = $.organizationalUnit;
        this.pseudonym = $.pseudonym;
        this.serialNumber = $.serialNumber;
        this.state = $.state;
        this.surname = $.surname;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthoritySubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthoritySubjectArgs $;

        public Builder() {
            $ = new CertificateAuthoritySubjectArgs();
        }

        public Builder(CertificateAuthoritySubjectArgs defaults) {
            $ = new CertificateAuthoritySubjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        public Builder country(@Nullable Output<String> country) {
            $.country = country;
            return this;
        }

        public Builder country(String country) {
            return country(Output.of(country));
        }

        public Builder customAttributes(@Nullable Output<List<CertificateAuthorityCustomAttributeArgs>> customAttributes) {
            $.customAttributes = customAttributes;
            return this;
        }

        public Builder customAttributes(List<CertificateAuthorityCustomAttributeArgs> customAttributes) {
            return customAttributes(Output.of(customAttributes));
        }

        public Builder customAttributes(CertificateAuthorityCustomAttributeArgs... customAttributes) {
            return customAttributes(List.of(customAttributes));
        }

        public Builder distinguishedNameQualifier(@Nullable Output<String> distinguishedNameQualifier) {
            $.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }

        public Builder distinguishedNameQualifier(String distinguishedNameQualifier) {
            return distinguishedNameQualifier(Output.of(distinguishedNameQualifier));
        }

        public Builder generationQualifier(@Nullable Output<String> generationQualifier) {
            $.generationQualifier = generationQualifier;
            return this;
        }

        public Builder generationQualifier(String generationQualifier) {
            return generationQualifier(Output.of(generationQualifier));
        }

        public Builder givenName(@Nullable Output<String> givenName) {
            $.givenName = givenName;
            return this;
        }

        public Builder givenName(String givenName) {
            return givenName(Output.of(givenName));
        }

        public Builder initials(@Nullable Output<String> initials) {
            $.initials = initials;
            return this;
        }

        public Builder initials(String initials) {
            return initials(Output.of(initials));
        }

        public Builder locality(@Nullable Output<String> locality) {
            $.locality = locality;
            return this;
        }

        public Builder locality(String locality) {
            return locality(Output.of(locality));
        }

        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            $.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder organizationalUnit(String organizationalUnit) {
            return organizationalUnit(Output.of(organizationalUnit));
        }

        public Builder pseudonym(@Nullable Output<String> pseudonym) {
            $.pseudonym = pseudonym;
            return this;
        }

        public Builder pseudonym(String pseudonym) {
            return pseudonym(Output.of(pseudonym));
        }

        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            $.serialNumber = serialNumber;
            return this;
        }

        public Builder serialNumber(String serialNumber) {
            return serialNumber(Output.of(serialNumber));
        }

        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder surname(@Nullable Output<String> surname) {
            $.surname = surname;
            return this;
        }

        public Builder surname(String surname) {
            return surname(Output.of(surname));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public CertificateAuthoritySubjectArgs build() {
            return $;
        }
    }

}
