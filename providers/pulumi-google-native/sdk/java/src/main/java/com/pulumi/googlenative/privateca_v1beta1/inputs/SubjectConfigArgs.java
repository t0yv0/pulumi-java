// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1beta1.inputs.SubjectAltNamesArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.SubjectArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * These values are used to create the distinguished name and subject alternative name fields in an X.509 certificate.
 * 
 */
public final class SubjectConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubjectConfigArgs Empty = new SubjectConfigArgs();

    /**
     * Optional. The &#34;common name&#34; of the distinguished name.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    /**
     * @return Optional. The &#34;common name&#34; of the distinguished name.
     * 
     */
    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * Contains distinguished name fields such as the location and organization.
     * 
     */
    @Import(name="subject", required=true)
    private Output<SubjectArgs> subject;

    /**
     * @return Contains distinguished name fields such as the location and organization.
     * 
     */
    public Output<SubjectArgs> subject() {
        return this.subject;
    }

    /**
     * Optional. The subject alternative name fields.
     * 
     */
    @Import(name="subjectAltName")
    private @Nullable Output<SubjectAltNamesArgs> subjectAltName;

    /**
     * @return Optional. The subject alternative name fields.
     * 
     */
    public Optional<Output<SubjectAltNamesArgs>> subjectAltName() {
        return Optional.ofNullable(this.subjectAltName);
    }

    private SubjectConfigArgs() {}

    private SubjectConfigArgs(SubjectConfigArgs $) {
        this.commonName = $.commonName;
        this.subject = $.subject;
        this.subjectAltName = $.subjectAltName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubjectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubjectConfigArgs $;

        public Builder() {
            $ = new SubjectConfigArgs();
        }

        public Builder(SubjectConfigArgs defaults) {
            $ = new SubjectConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonName Optional. The &#34;common name&#34; of the distinguished name.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName Optional. The &#34;common name&#34; of the distinguished name.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param subject Contains distinguished name fields such as the location and organization.
         * 
         * @return builder
         * 
         */
        public Builder subject(Output<SubjectArgs> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject Contains distinguished name fields such as the location and organization.
         * 
         * @return builder
         * 
         */
        public Builder subject(SubjectArgs subject) {
            return subject(Output.of(subject));
        }

        /**
         * @param subjectAltName Optional. The subject alternative name fields.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltName(@Nullable Output<SubjectAltNamesArgs> subjectAltName) {
            $.subjectAltName = subjectAltName;
            return this;
        }

        /**
         * @param subjectAltName Optional. The subject alternative name fields.
         * 
         * @return builder
         * 
         */
        public Builder subjectAltName(SubjectAltNamesArgs subjectAltName) {
            return subjectAltName(Output.of(subjectAltName));
        }

        public SubjectConfigArgs build() {
            $.subject = Objects.requireNonNull($.subject, "expected parameter 'subject' to be non-null");
            return $;
        }
    }

}
