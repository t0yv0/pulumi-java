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
 * SAP Table Linked Service.
 * 
 */
public final class SapTableLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SapTableLinkedServiceArgs Empty = new SapTableLinkedServiceArgs();

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
     * Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<Object> clientId;

    /**
     * @return Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> clientId() {
        return Optional.ofNullable(this.clientId);
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
     * Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="language")
    private @Nullable Output<Object> language;

    /**
     * @return Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> language() {
        return Optional.ofNullable(this.language);
    }

    /**
     * The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="logonGroup")
    private @Nullable Output<Object> logonGroup;

    /**
     * @return The Logon Group for the SAP System. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> logonGroup() {
        return Optional.ofNullable(this.logonGroup);
    }

    /**
     * The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="messageServer")
    private @Nullable Output<Object> messageServer;

    /**
     * @return The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> messageServer() {
        return Optional.ofNullable(this.messageServer);
    }

    /**
     * The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="messageServerService")
    private @Nullable Output<Object> messageServerService;

    /**
     * @return The service name or port number of the Message Server. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> messageServerService() {
        return Optional.ofNullable(this.messageServerService);
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
     * Password to access the SAP server where the table is located.
     * 
     */
    @Import(name="password")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password;

    /**
     * @return Password to access the SAP server where the table is located.
     * 
     */
    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="server")
    private @Nullable Output<Object> server;

    /**
     * @return Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> server() {
        return Optional.ofNullable(this.server);
    }

    /**
     * External security product&#39;s library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncLibraryPath")
    private @Nullable Output<Object> sncLibraryPath;

    /**
     * @return External security product&#39;s library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sncLibraryPath() {
        return Optional.ofNullable(this.sncLibraryPath);
    }

    /**
     * SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncMode")
    private @Nullable Output<Object> sncMode;

    /**
     * @return SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sncMode() {
        return Optional.ofNullable(this.sncMode);
    }

    /**
     * Initiator&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncMyName")
    private @Nullable Output<Object> sncMyName;

    /**
     * @return Initiator&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sncMyName() {
        return Optional.ofNullable(this.sncMyName);
    }

    /**
     * Communication partner&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncPartnerName")
    private @Nullable Output<Object> sncPartnerName;

    /**
     * @return Communication partner&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sncPartnerName() {
        return Optional.ofNullable(this.sncPartnerName);
    }

    /**
     * SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sncQop")
    private @Nullable Output<Object> sncQop;

    /**
     * @return SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> sncQop() {
        return Optional.ofNullable(this.sncQop);
    }

    /**
     * SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemId")
    private @Nullable Output<Object> systemId;

    /**
     * @return SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> systemId() {
        return Optional.ofNullable(this.systemId);
    }

    /**
     * System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="systemNumber")
    private @Nullable Output<Object> systemNumber;

    /**
     * @return System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> systemNumber() {
        return Optional.ofNullable(this.systemNumber);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;SapTable&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of linked service.
     * Expected value is &#39;SapTable&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="userName")
    private @Nullable Output<Object> userName;

    /**
     * @return Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> userName() {
        return Optional.ofNullable(this.userName);
    }

    private SapTableLinkedServiceArgs() {}

    private SapTableLinkedServiceArgs(SapTableLinkedServiceArgs $) {
        this.annotations = $.annotations;
        this.clientId = $.clientId;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.language = $.language;
        this.logonGroup = $.logonGroup;
        this.messageServer = $.messageServer;
        this.messageServerService = $.messageServerService;
        this.parameters = $.parameters;
        this.password = $.password;
        this.server = $.server;
        this.sncLibraryPath = $.sncLibraryPath;
        this.sncMode = $.sncMode;
        this.sncMyName = $.sncMyName;
        this.sncPartnerName = $.sncPartnerName;
        this.sncQop = $.sncQop;
        this.systemId = $.systemId;
        this.systemNumber = $.systemNumber;
        this.type = $.type;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SapTableLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapTableLinkedServiceArgs $;

        public Builder() {
            $ = new SapTableLinkedServiceArgs();
        }

        public Builder(SapTableLinkedServiceArgs defaults) {
            $ = new SapTableLinkedServiceArgs(Objects.requireNonNull(defaults));
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
         * @param clientId Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<Object> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client ID of the client on the SAP system where the table is located. (Usually a three-digit decimal number represented as a string) Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder clientId(Object clientId) {
            return clientId(Output.of(clientId));
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
         * @param language Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable Output<Object> language) {
            $.language = language;
            return this;
        }

        /**
         * @param language Language of the SAP system where the table is located. The default value is EN. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder language(Object language) {
            return language(Output.of(language));
        }

        /**
         * @param logonGroup The Logon Group for the SAP System. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder logonGroup(@Nullable Output<Object> logonGroup) {
            $.logonGroup = logonGroup;
            return this;
        }

        /**
         * @param logonGroup The Logon Group for the SAP System. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder logonGroup(Object logonGroup) {
            return logonGroup(Output.of(logonGroup));
        }

        /**
         * @param messageServer The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder messageServer(@Nullable Output<Object> messageServer) {
            $.messageServer = messageServer;
            return this;
        }

        /**
         * @param messageServer The hostname of the SAP Message Server. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder messageServer(Object messageServer) {
            return messageServer(Output.of(messageServer));
        }

        /**
         * @param messageServerService The service name or port number of the Message Server. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder messageServerService(@Nullable Output<Object> messageServerService) {
            $.messageServerService = messageServerService;
            return this;
        }

        /**
         * @param messageServerService The service name or port number of the Message Server. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder messageServerService(Object messageServerService) {
            return messageServerService(Output.of(messageServerService));
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
         * @param password Password to access the SAP server where the table is located.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password to access the SAP server where the table is located.
         * 
         * @return builder
         * 
         */
        public Builder password(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> password) {
            return password(Output.of(password));
        }

        /**
         * @param password Password to access the SAP server where the table is located.
         * 
         * @return builder
         * 
         */
        public Builder password(AzureKeyVaultSecretReferenceArgs password) {
            return password(Either.ofLeft(password));
        }

        /**
         * @param password Password to access the SAP server where the table is located.
         * 
         * @return builder
         * 
         */
        public Builder password(SecureStringArgs password) {
            return password(Either.ofRight(password));
        }

        /**
         * @param server Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder server(@Nullable Output<Object> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server Host name of the SAP instance where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder server(Object server) {
            return server(Output.of(server));
        }

        /**
         * @param sncLibraryPath External security product&#39;s library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncLibraryPath(@Nullable Output<Object> sncLibraryPath) {
            $.sncLibraryPath = sncLibraryPath;
            return this;
        }

        /**
         * @param sncLibraryPath External security product&#39;s library to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncLibraryPath(Object sncLibraryPath) {
            return sncLibraryPath(Output.of(sncLibraryPath));
        }

        /**
         * @param sncMode SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncMode(@Nullable Output<Object> sncMode) {
            $.sncMode = sncMode;
            return this;
        }

        /**
         * @param sncMode SNC activation indicator to access the SAP server where the table is located. Must be either 0 (off) or 1 (on). Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncMode(Object sncMode) {
            return sncMode(Output.of(sncMode));
        }

        /**
         * @param sncMyName Initiator&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncMyName(@Nullable Output<Object> sncMyName) {
            $.sncMyName = sncMyName;
            return this;
        }

        /**
         * @param sncMyName Initiator&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncMyName(Object sncMyName) {
            return sncMyName(Output.of(sncMyName));
        }

        /**
         * @param sncPartnerName Communication partner&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncPartnerName(@Nullable Output<Object> sncPartnerName) {
            $.sncPartnerName = sncPartnerName;
            return this;
        }

        /**
         * @param sncPartnerName Communication partner&#39;s SNC name to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncPartnerName(Object sncPartnerName) {
            return sncPartnerName(Output.of(sncPartnerName));
        }

        /**
         * @param sncQop SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncQop(@Nullable Output<Object> sncQop) {
            $.sncQop = sncQop;
            return this;
        }

        /**
         * @param sncQop SNC Quality of Protection. Allowed value include: 1, 2, 3, 8, 9. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder sncQop(Object sncQop) {
            return sncQop(Output.of(sncQop));
        }

        /**
         * @param systemId SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder systemId(@Nullable Output<Object> systemId) {
            $.systemId = systemId;
            return this;
        }

        /**
         * @param systemId SystemID of the SAP system where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder systemId(Object systemId) {
            return systemId(Output.of(systemId));
        }

        /**
         * @param systemNumber System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder systemNumber(@Nullable Output<Object> systemNumber) {
            $.systemNumber = systemNumber;
            return this;
        }

        /**
         * @param systemNumber System number of the SAP system where the table is located. (Usually a two-digit decimal number represented as a string.) Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder systemNumber(Object systemNumber) {
            return systemNumber(Output.of(systemNumber));
        }

        /**
         * @param type Type of linked service.
         * Expected value is &#39;SapTable&#39;.
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
         * Expected value is &#39;SapTable&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param userName Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(@Nullable Output<Object> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Username to access the SAP server where the table is located. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder userName(Object userName) {
            return userName(Output.of(userName));
        }

        public SapTableLinkedServiceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
