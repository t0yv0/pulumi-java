// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dynamics AX linked service.
 * 
 */
public final class DynamicsAXLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicsAXLinkedServiceArgs Empty = new DynamicsAXLinkedServiceArgs();

    /**
     * Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="aadResourceId", required=true)
    private Output<Object> aadResourceId;

    /**
     * @return Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> aadResourceId() {
        return this.aadResourceId;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    /**
     * @return List of tags that can be used for describing the linked service.
     * 
     */
    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    /**
     * @return The integration runtime reference.
     * 
     */
    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Linked service description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    /**
     * @return The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    /**
     * @return Parameters for linked service.
     * 
     */
    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Specify the application&#39;s client ID. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId", required=true)
    private Output<Object> servicePrincipalId;

    /**
     * @return Specify the application&#39;s client ID. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Specify the application&#39;s key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalKey", required=true)
    private Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    /**
     * @return Specify the application&#39;s key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant", required=true)
    private Output<Object> tenant;

    /**
     * @return Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
     * 
     */
    public Output<Object> tenant() {
        return this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;DynamicsAX&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;DynamicsAX&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     */
    @Import(name="url", required=true)
    private Output<Object> url;

    /**
     * @return The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
     * 
     */
    public Output<Object> url() {
        return this.url;
    }

    private DynamicsAXLinkedServiceArgs() {}

    private DynamicsAXLinkedServiceArgs(DynamicsAXLinkedServiceArgs $) {
        this.aadResourceId = $.aadResourceId;
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.type = $.type;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicsAXLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicsAXLinkedServiceArgs $;

        public Builder() {
            $ = new DynamicsAXLinkedServiceArgs();
        }

        public Builder(DynamicsAXLinkedServiceArgs defaults) {
            $ = new DynamicsAXLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aadResourceId Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder aadResourceId(Output<Object> aadResourceId) {
            $.aadResourceId = aadResourceId;
            return this;
        }

        /**
         * @param aadResourceId Specify the resource you are requesting authorization. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder aadResourceId(Object aadResourceId) {
            return aadResourceId(Output.of(aadResourceId));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the linked service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        /**
         * @param connectVia The integration runtime reference.
         * 
         * @return builder
         * 
         */
        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Linked service description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        /**
         * @param encryptedCredential The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Parameters for linked service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param servicePrincipalId Specify the application&#39;s client ID. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId Specify the application&#39;s client ID. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalKey Specify the application&#39;s key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey Specify the application&#39;s key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey Specify the application&#39;s key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        /**
         * @param servicePrincipalKey Specify the application&#39;s key. Mark this field as a SecureString to store it securely in Data Factory, or reference a secret stored in Azure Key Vault. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(SecureStringArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        /**
         * @param tenant Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant Specify the tenant information (domain name or tenant ID) under which your application resides. Retrieve it by hovering the mouse in the top-right corner of the Azure portal. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;DynamicsAX&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;DynamicsAX&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param url The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<Object> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url The Dynamics AX (or Dynamics 365 Finance and Operations) instance OData endpoint.
         * 
         * @return builder
         * 
         */
        public Builder url(Object url) {
            return url(Output.of(url));
        }

        public DynamicsAXLinkedServiceArgs build() {
            $.aadResourceId = Objects.requireNonNull($.aadResourceId, "expected parameter 'aadResourceId' to be non-null");
            $.servicePrincipalId = Objects.requireNonNull($.servicePrincipalId, "expected parameter 'servicePrincipalId' to be non-null");
            $.servicePrincipalKey = Objects.requireNonNull($.servicePrincipalKey, "expected parameter 'servicePrincipalKey' to be non-null");
            $.tenant = Objects.requireNonNull($.tenant, "expected parameter 'tenant' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
