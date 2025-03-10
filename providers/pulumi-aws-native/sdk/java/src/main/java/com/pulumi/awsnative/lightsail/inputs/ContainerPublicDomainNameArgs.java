// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The public domain name to use with the container service, such as example.com and www.example.com.
 * 
 */
public final class ContainerPublicDomainNameArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerPublicDomainNameArgs Empty = new ContainerPublicDomainNameArgs();

    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    @Import(name="domainNames")
    private @Nullable Output<List<String>> domainNames;

    /**
     * @return An object that describes the configuration for the containers of the deployment.
     * 
     */
    public Optional<Output<List<String>>> domainNames() {
        return Optional.ofNullable(this.domainNames);
    }

    private ContainerPublicDomainNameArgs() {}

    private ContainerPublicDomainNameArgs(ContainerPublicDomainNameArgs $) {
        this.certificateName = $.certificateName;
        this.domainNames = $.domainNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerPublicDomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerPublicDomainNameArgs $;

        public Builder() {
            $ = new ContainerPublicDomainNameArgs();
        }

        public Builder(ContainerPublicDomainNameArgs defaults) {
            $ = new ContainerPublicDomainNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param domainNames An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            $.domainNames = domainNames;
            return this;
        }

        /**
         * @param domainNames An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(List<String> domainNames) {
            return domainNames(Output.of(domainNames));
        }

        /**
         * @param domainNames An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }

        public ContainerPublicDomainNameArgs build() {
            return $;
        }
    }

}
