// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Immutable. The FHIR specification version that this FHIR store supports natively. This field is immutable after store creation. Requests are rejected if they contain FHIR resources of a different version. Version is required for every FHIR store.
     * 
     */
    @EnumType
    public enum FhirStoreVersion {
        /**
         * Users must specify a version on store creation or an error is returned.
         * 
         */
        VersionUnspecified("VERSION_UNSPECIFIED"),
        /**
         * Draft Standard for Trial Use, [Release 2](https://www.hl7.org/fhir/DSTU2)
         * 
         */
        Dstu2("DSTU2"),
        /**
         * Standard for Trial Use, [Release 3](https://www.hl7.org/fhir/STU3)
         * 
         */
        Stu3("STU3"),
        /**
         * [Release 4](https://www.hl7.org/fhir/R4)
         * 
         */
        R4("R4");

        private final String value;

        FhirStoreVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FhirStoreVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
