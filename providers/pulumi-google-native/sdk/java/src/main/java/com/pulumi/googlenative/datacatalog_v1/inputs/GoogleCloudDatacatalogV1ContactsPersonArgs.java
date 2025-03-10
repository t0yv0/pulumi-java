// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A contact person for the entry.
 * 
 */
public final class GoogleCloudDatacatalogV1ContactsPersonArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatacatalogV1ContactsPersonArgs Empty = new GoogleCloudDatacatalogV1ContactsPersonArgs();

    /**
     * Designation of the person, for example, Data Steward.
     * 
     */
    @Import(name="designation")
    private @Nullable Output<String> designation;

    /**
     * @return Designation of the person, for example, Data Steward.
     * 
     */
    public Optional<Output<String>> designation() {
        return Optional.ofNullable(this.designation);
    }

    /**
     * Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    private GoogleCloudDatacatalogV1ContactsPersonArgs() {}

    private GoogleCloudDatacatalogV1ContactsPersonArgs(GoogleCloudDatacatalogV1ContactsPersonArgs $) {
        this.designation = $.designation;
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatacatalogV1ContactsPersonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1ContactsPersonArgs $;

        public Builder() {
            $ = new GoogleCloudDatacatalogV1ContactsPersonArgs();
        }

        public Builder(GoogleCloudDatacatalogV1ContactsPersonArgs defaults) {
            $ = new GoogleCloudDatacatalogV1ContactsPersonArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param designation Designation of the person, for example, Data Steward.
         * 
         * @return builder
         * 
         */
        public Builder designation(@Nullable Output<String> designation) {
            $.designation = designation;
            return this;
        }

        /**
         * @param designation Designation of the person, for example, Data Steward.
         * 
         * @return builder
         * 
         */
        public Builder designation(String designation) {
            return designation(Output.of(designation));
        }

        /**
         * @param email Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public GoogleCloudDatacatalogV1ContactsPersonArgs build() {
            return $;
        }
    }

}
