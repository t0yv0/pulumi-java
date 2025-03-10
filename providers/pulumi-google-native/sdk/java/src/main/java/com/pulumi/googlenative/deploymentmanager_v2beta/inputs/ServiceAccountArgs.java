// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service Account used as a credential.
 * 
 */
public final class ServiceAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAccountArgs Empty = new ServiceAccountArgs();

    /**
     * The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The IAM service account email address like test@myproject.iam.gserviceaccount.com
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    private ServiceAccountArgs() {}

    private ServiceAccountArgs(ServiceAccountArgs $) {
        this.email = $.email;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAccountArgs $;

        public Builder() {
            $ = new ServiceAccountArgs();
        }

        public Builder(ServiceAccountArgs defaults) {
            $ = new ServiceAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The IAM service account email address like test@myproject.iam.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The IAM service account email address like test@myproject.iam.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        public ServiceAccountArgs build() {
            return $;
        }
    }

}
