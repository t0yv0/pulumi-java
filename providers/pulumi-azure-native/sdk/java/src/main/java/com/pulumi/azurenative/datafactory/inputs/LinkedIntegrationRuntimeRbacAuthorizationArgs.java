// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The role based access control (RBAC) authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeRbacAuthorizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedIntegrationRuntimeRbacAuthorizationArgs Empty = new LinkedIntegrationRuntimeRbacAuthorizationArgs();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
     */
    @Import(name="authorizationType", required=true)
    private Output<String> authorizationType;

    /**
     * @return The authorization type for integration runtime sharing.
     * Expected value is &#39;RBAC&#39;.
     * 
     */
    public Output<String> authorizationType() {
        return this.authorizationType;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialReferenceArgs> credential;

    /**
     * @return The credential reference containing authentication information.
     * 
     */
    public Optional<Output<CredentialReferenceArgs>> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * The resource identifier of the integration runtime to be shared.
     * 
     */
    @Import(name="resourceId", required=true)
    private Output<String> resourceId;

    /**
     * @return The resource identifier of the integration runtime to be shared.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    private LinkedIntegrationRuntimeRbacAuthorizationArgs() {}

    private LinkedIntegrationRuntimeRbacAuthorizationArgs(LinkedIntegrationRuntimeRbacAuthorizationArgs $) {
        this.authorizationType = $.authorizationType;
        this.credential = $.credential;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedIntegrationRuntimeRbacAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedIntegrationRuntimeRbacAuthorizationArgs $;

        public Builder() {
            $ = new LinkedIntegrationRuntimeRbacAuthorizationArgs();
        }

        public Builder(LinkedIntegrationRuntimeRbacAuthorizationArgs defaults) {
            $ = new LinkedIntegrationRuntimeRbacAuthorizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationType The authorization type for integration runtime sharing.
         * Expected value is &#39;RBAC&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(Output<String> authorizationType) {
            $.authorizationType = authorizationType;
            return this;
        }

        /**
         * @param authorizationType The authorization type for integration runtime sharing.
         * Expected value is &#39;RBAC&#39;.
         * 
         * @return builder
         * 
         */
        public Builder authorizationType(String authorizationType) {
            return authorizationType(Output.of(authorizationType));
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            $.credential = credential;
            return this;
        }

        /**
         * @param credential The credential reference containing authentication information.
         * 
         * @return builder
         * 
         */
        public Builder credential(CredentialReferenceArgs credential) {
            return credential(Output.of(credential));
        }

        /**
         * @param resourceId The resource identifier of the integration runtime to be shared.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The resource identifier of the integration runtime to be shared.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public LinkedIntegrationRuntimeRbacAuthorizationArgs build() {
            $.authorizationType = Codegen.stringProp("authorizationType").output().arg($.authorizationType).require();
            $.resourceId = Objects.requireNonNull($.resourceId, "expected parameter 'resourceId' to be non-null");
            return $;
        }
    }

}
