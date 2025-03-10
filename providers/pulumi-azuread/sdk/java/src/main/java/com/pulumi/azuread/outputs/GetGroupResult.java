// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.GetGroupDynamicMembership;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    /**
     * @return Indicates whether this group can be assigned to an Azure Active Directory role.
     * 
     */
    private final Boolean assignableToRole;
    /**
     * @return Indicates whether new members added to the group will be auto-subscribed to receive email notifications. Only set for Unified groups.
     * 
     */
    private final Boolean autoSubscribeNewMembers;
    /**
     * @return A list of behaviors for a Microsoft 365 group, such as `AllowOnlyMembersToPost`, `HideGroupInOutlook`, `SubscribeNewGroupMembers` and `WelcomeEmailDisabled`. See [official documentation](https://docs.microsoft.com/en-us/graph/group-set-options) for more details.
     * 
     */
    private final List<String> behaviors;
    /**
     * @return The optional description of the group.
     * 
     */
    private final String description;
    /**
     * @return The display name for the group.
     * 
     */
    private final String displayName;
    /**
     * @return A `dynamic_membership` block as documented below.
     * 
     */
    private final List<GetGroupDynamicMembership> dynamicMemberships;
    /**
     * @return Indicates whether people external to the organization can send messages to the group. Only set for Unified groups.
     * 
     */
    private final Boolean externalSendersAllowed;
    /**
     * @return Indicates whether the group is displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups. Only set for Unified groups.
     * 
     */
    private final Boolean hideFromAddressLists;
    /**
     * @return Indicates whether the group is displayed in Outlook clients, such as Outlook for Windows and Outlook on the web. Only set for Unified groups.
     * 
     */
    private final Boolean hideFromOutlookClients;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The SMTP address for the group.
     * 
     */
    private final String mail;
    /**
     * @return Whether the group is mail-enabled.
     * 
     */
    private final Boolean mailEnabled;
    /**
     * @return The mail alias for the group, unique in the organisation.
     * 
     */
    private final String mailNickname;
    /**
     * @return List of object IDs of the group members.
     * 
     */
    private final List<String> members;
    /**
     * @return The object ID of the group.
     * 
     */
    private final String objectId;
    /**
     * @return The on-premises FQDN, also called dnsDomainName, synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    private final String onpremisesDomainName;
    /**
     * @return The on-premises NetBIOS name, synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    private final String onpremisesNetbiosName;
    /**
     * @return The on-premises SAM account name, synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    private final String onpremisesSamAccountName;
    /**
     * @return The on-premises security identifier (SID), synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    private final String onpremisesSecurityIdentifier;
    /**
     * @return Whether this group is synchronised from an on-premises directory (`true`), no longer synchronised (`false`), or has never been synchronised (`null`).
     * 
     */
    private final Boolean onpremisesSyncEnabled;
    /**
     * @return List of object IDs of the group owners.
     * 
     */
    private final List<String> owners;
    /**
     * @return The preferred language for a Microsoft 365 group, in ISO 639-1 notation.
     * 
     */
    private final String preferredLanguage;
    /**
     * @return A list of provisioning options for a Microsoft 365 group, such as `Team`. See [official documentation](https://docs.microsoft.com/en-us/graph/group-set-options) for details.
     * 
     */
    private final List<String> provisioningOptions;
    /**
     * @return List of email addresses for the group that direct to the same group mailbox.
     * 
     */
    private final List<String> proxyAddresses;
    /**
     * @return Whether the group is a security group.
     * 
     */
    private final Boolean securityEnabled;
    /**
     * @return The colour theme for a Microsoft 365 group. Possible values are `Blue`, `Green`, `Orange`, `Pink`, `Purple`, `Red` or `Teal`. When no theme is set, the value is `null`.
     * 
     */
    private final String theme;
    /**
     * @return A list of group types configured for the group. Supported values are `DynamicMembership`, which denotes a group with dynamic membership, and `Unified`, which specifies a Microsoft 365 group.
     * 
     */
    private final List<String> types;
    /**
     * @return The group join policy and group content visibility. Possible values are `Private`, `Public`, or `Hiddenmembership`. Only Microsoft 365 groups can have `Hiddenmembership` visibility.
     * 
     */
    private final String visibility;

    @CustomType.Constructor
    private GetGroupResult(
        @CustomType.Parameter("assignableToRole") Boolean assignableToRole,
        @CustomType.Parameter("autoSubscribeNewMembers") Boolean autoSubscribeNewMembers,
        @CustomType.Parameter("behaviors") List<String> behaviors,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("dynamicMemberships") List<GetGroupDynamicMembership> dynamicMemberships,
        @CustomType.Parameter("externalSendersAllowed") Boolean externalSendersAllowed,
        @CustomType.Parameter("hideFromAddressLists") Boolean hideFromAddressLists,
        @CustomType.Parameter("hideFromOutlookClients") Boolean hideFromOutlookClients,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mail") String mail,
        @CustomType.Parameter("mailEnabled") Boolean mailEnabled,
        @CustomType.Parameter("mailNickname") String mailNickname,
        @CustomType.Parameter("members") List<String> members,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("onpremisesDomainName") String onpremisesDomainName,
        @CustomType.Parameter("onpremisesNetbiosName") String onpremisesNetbiosName,
        @CustomType.Parameter("onpremisesSamAccountName") String onpremisesSamAccountName,
        @CustomType.Parameter("onpremisesSecurityIdentifier") String onpremisesSecurityIdentifier,
        @CustomType.Parameter("onpremisesSyncEnabled") Boolean onpremisesSyncEnabled,
        @CustomType.Parameter("owners") List<String> owners,
        @CustomType.Parameter("preferredLanguage") String preferredLanguage,
        @CustomType.Parameter("provisioningOptions") List<String> provisioningOptions,
        @CustomType.Parameter("proxyAddresses") List<String> proxyAddresses,
        @CustomType.Parameter("securityEnabled") Boolean securityEnabled,
        @CustomType.Parameter("theme") String theme,
        @CustomType.Parameter("types") List<String> types,
        @CustomType.Parameter("visibility") String visibility) {
        this.assignableToRole = assignableToRole;
        this.autoSubscribeNewMembers = autoSubscribeNewMembers;
        this.behaviors = behaviors;
        this.description = description;
        this.displayName = displayName;
        this.dynamicMemberships = dynamicMemberships;
        this.externalSendersAllowed = externalSendersAllowed;
        this.hideFromAddressLists = hideFromAddressLists;
        this.hideFromOutlookClients = hideFromOutlookClients;
        this.id = id;
        this.mail = mail;
        this.mailEnabled = mailEnabled;
        this.mailNickname = mailNickname;
        this.members = members;
        this.objectId = objectId;
        this.onpremisesDomainName = onpremisesDomainName;
        this.onpremisesNetbiosName = onpremisesNetbiosName;
        this.onpremisesSamAccountName = onpremisesSamAccountName;
        this.onpremisesSecurityIdentifier = onpremisesSecurityIdentifier;
        this.onpremisesSyncEnabled = onpremisesSyncEnabled;
        this.owners = owners;
        this.preferredLanguage = preferredLanguage;
        this.provisioningOptions = provisioningOptions;
        this.proxyAddresses = proxyAddresses;
        this.securityEnabled = securityEnabled;
        this.theme = theme;
        this.types = types;
        this.visibility = visibility;
    }

    /**
     * @return Indicates whether this group can be assigned to an Azure Active Directory role.
     * 
     */
    public Boolean assignableToRole() {
        return this.assignableToRole;
    }
    /**
     * @return Indicates whether new members added to the group will be auto-subscribed to receive email notifications. Only set for Unified groups.
     * 
     */
    public Boolean autoSubscribeNewMembers() {
        return this.autoSubscribeNewMembers;
    }
    /**
     * @return A list of behaviors for a Microsoft 365 group, such as `AllowOnlyMembersToPost`, `HideGroupInOutlook`, `SubscribeNewGroupMembers` and `WelcomeEmailDisabled`. See [official documentation](https://docs.microsoft.com/en-us/graph/group-set-options) for more details.
     * 
     */
    public List<String> behaviors() {
        return this.behaviors;
    }
    /**
     * @return The optional description of the group.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name for the group.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return A `dynamic_membership` block as documented below.
     * 
     */
    public List<GetGroupDynamicMembership> dynamicMemberships() {
        return this.dynamicMemberships;
    }
    /**
     * @return Indicates whether people external to the organization can send messages to the group. Only set for Unified groups.
     * 
     */
    public Boolean externalSendersAllowed() {
        return this.externalSendersAllowed;
    }
    /**
     * @return Indicates whether the group is displayed in certain parts of the Outlook user interface: in the Address Book, in address lists for selecting message recipients, and in the Browse Groups dialog for searching groups. Only set for Unified groups.
     * 
     */
    public Boolean hideFromAddressLists() {
        return this.hideFromAddressLists;
    }
    /**
     * @return Indicates whether the group is displayed in Outlook clients, such as Outlook for Windows and Outlook on the web. Only set for Unified groups.
     * 
     */
    public Boolean hideFromOutlookClients() {
        return this.hideFromOutlookClients;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The SMTP address for the group.
     * 
     */
    public String mail() {
        return this.mail;
    }
    /**
     * @return Whether the group is mail-enabled.
     * 
     */
    public Boolean mailEnabled() {
        return this.mailEnabled;
    }
    /**
     * @return The mail alias for the group, unique in the organisation.
     * 
     */
    public String mailNickname() {
        return this.mailNickname;
    }
    /**
     * @return List of object IDs of the group members.
     * 
     */
    public List<String> members() {
        return this.members;
    }
    /**
     * @return The object ID of the group.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return The on-premises FQDN, also called dnsDomainName, synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    public String onpremisesDomainName() {
        return this.onpremisesDomainName;
    }
    /**
     * @return The on-premises NetBIOS name, synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    public String onpremisesNetbiosName() {
        return this.onpremisesNetbiosName;
    }
    /**
     * @return The on-premises SAM account name, synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    public String onpremisesSamAccountName() {
        return this.onpremisesSamAccountName;
    }
    /**
     * @return The on-premises security identifier (SID), synchronised from the on-premises directory when Azure AD Connect is used.
     * 
     */
    public String onpremisesSecurityIdentifier() {
        return this.onpremisesSecurityIdentifier;
    }
    /**
     * @return Whether this group is synchronised from an on-premises directory (`true`), no longer synchronised (`false`), or has never been synchronised (`null`).
     * 
     */
    public Boolean onpremisesSyncEnabled() {
        return this.onpremisesSyncEnabled;
    }
    /**
     * @return List of object IDs of the group owners.
     * 
     */
    public List<String> owners() {
        return this.owners;
    }
    /**
     * @return The preferred language for a Microsoft 365 group, in ISO 639-1 notation.
     * 
     */
    public String preferredLanguage() {
        return this.preferredLanguage;
    }
    /**
     * @return A list of provisioning options for a Microsoft 365 group, such as `Team`. See [official documentation](https://docs.microsoft.com/en-us/graph/group-set-options) for details.
     * 
     */
    public List<String> provisioningOptions() {
        return this.provisioningOptions;
    }
    /**
     * @return List of email addresses for the group that direct to the same group mailbox.
     * 
     */
    public List<String> proxyAddresses() {
        return this.proxyAddresses;
    }
    /**
     * @return Whether the group is a security group.
     * 
     */
    public Boolean securityEnabled() {
        return this.securityEnabled;
    }
    /**
     * @return The colour theme for a Microsoft 365 group. Possible values are `Blue`, `Green`, `Orange`, `Pink`, `Purple`, `Red` or `Teal`. When no theme is set, the value is `null`.
     * 
     */
    public String theme() {
        return this.theme;
    }
    /**
     * @return A list of group types configured for the group. Supported values are `DynamicMembership`, which denotes a group with dynamic membership, and `Unified`, which specifies a Microsoft 365 group.
     * 
     */
    public List<String> types() {
        return this.types;
    }
    /**
     * @return The group join policy and group content visibility. Possible values are `Private`, `Public`, or `Hiddenmembership`. Only Microsoft 365 groups can have `Hiddenmembership` visibility.
     * 
     */
    public String visibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean assignableToRole;
        private Boolean autoSubscribeNewMembers;
        private List<String> behaviors;
        private String description;
        private String displayName;
        private List<GetGroupDynamicMembership> dynamicMemberships;
        private Boolean externalSendersAllowed;
        private Boolean hideFromAddressLists;
        private Boolean hideFromOutlookClients;
        private String id;
        private String mail;
        private Boolean mailEnabled;
        private String mailNickname;
        private List<String> members;
        private String objectId;
        private String onpremisesDomainName;
        private String onpremisesNetbiosName;
        private String onpremisesSamAccountName;
        private String onpremisesSecurityIdentifier;
        private Boolean onpremisesSyncEnabled;
        private List<String> owners;
        private String preferredLanguage;
        private List<String> provisioningOptions;
        private List<String> proxyAddresses;
        private Boolean securityEnabled;
        private String theme;
        private List<String> types;
        private String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignableToRole = defaults.assignableToRole;
    	      this.autoSubscribeNewMembers = defaults.autoSubscribeNewMembers;
    	      this.behaviors = defaults.behaviors;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.dynamicMemberships = defaults.dynamicMemberships;
    	      this.externalSendersAllowed = defaults.externalSendersAllowed;
    	      this.hideFromAddressLists = defaults.hideFromAddressLists;
    	      this.hideFromOutlookClients = defaults.hideFromOutlookClients;
    	      this.id = defaults.id;
    	      this.mail = defaults.mail;
    	      this.mailEnabled = defaults.mailEnabled;
    	      this.mailNickname = defaults.mailNickname;
    	      this.members = defaults.members;
    	      this.objectId = defaults.objectId;
    	      this.onpremisesDomainName = defaults.onpremisesDomainName;
    	      this.onpremisesNetbiosName = defaults.onpremisesNetbiosName;
    	      this.onpremisesSamAccountName = defaults.onpremisesSamAccountName;
    	      this.onpremisesSecurityIdentifier = defaults.onpremisesSecurityIdentifier;
    	      this.onpremisesSyncEnabled = defaults.onpremisesSyncEnabled;
    	      this.owners = defaults.owners;
    	      this.preferredLanguage = defaults.preferredLanguage;
    	      this.provisioningOptions = defaults.provisioningOptions;
    	      this.proxyAddresses = defaults.proxyAddresses;
    	      this.securityEnabled = defaults.securityEnabled;
    	      this.theme = defaults.theme;
    	      this.types = defaults.types;
    	      this.visibility = defaults.visibility;
        }

        public Builder assignableToRole(Boolean assignableToRole) {
            this.assignableToRole = Objects.requireNonNull(assignableToRole);
            return this;
        }
        public Builder autoSubscribeNewMembers(Boolean autoSubscribeNewMembers) {
            this.autoSubscribeNewMembers = Objects.requireNonNull(autoSubscribeNewMembers);
            return this;
        }
        public Builder behaviors(List<String> behaviors) {
            this.behaviors = Objects.requireNonNull(behaviors);
            return this;
        }
        public Builder behaviors(String... behaviors) {
            return behaviors(List.of(behaviors));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder dynamicMemberships(List<GetGroupDynamicMembership> dynamicMemberships) {
            this.dynamicMemberships = Objects.requireNonNull(dynamicMemberships);
            return this;
        }
        public Builder dynamicMemberships(GetGroupDynamicMembership... dynamicMemberships) {
            return dynamicMemberships(List.of(dynamicMemberships));
        }
        public Builder externalSendersAllowed(Boolean externalSendersAllowed) {
            this.externalSendersAllowed = Objects.requireNonNull(externalSendersAllowed);
            return this;
        }
        public Builder hideFromAddressLists(Boolean hideFromAddressLists) {
            this.hideFromAddressLists = Objects.requireNonNull(hideFromAddressLists);
            return this;
        }
        public Builder hideFromOutlookClients(Boolean hideFromOutlookClients) {
            this.hideFromOutlookClients = Objects.requireNonNull(hideFromOutlookClients);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mail(String mail) {
            this.mail = Objects.requireNonNull(mail);
            return this;
        }
        public Builder mailEnabled(Boolean mailEnabled) {
            this.mailEnabled = Objects.requireNonNull(mailEnabled);
            return this;
        }
        public Builder mailNickname(String mailNickname) {
            this.mailNickname = Objects.requireNonNull(mailNickname);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder onpremisesDomainName(String onpremisesDomainName) {
            this.onpremisesDomainName = Objects.requireNonNull(onpremisesDomainName);
            return this;
        }
        public Builder onpremisesNetbiosName(String onpremisesNetbiosName) {
            this.onpremisesNetbiosName = Objects.requireNonNull(onpremisesNetbiosName);
            return this;
        }
        public Builder onpremisesSamAccountName(String onpremisesSamAccountName) {
            this.onpremisesSamAccountName = Objects.requireNonNull(onpremisesSamAccountName);
            return this;
        }
        public Builder onpremisesSecurityIdentifier(String onpremisesSecurityIdentifier) {
            this.onpremisesSecurityIdentifier = Objects.requireNonNull(onpremisesSecurityIdentifier);
            return this;
        }
        public Builder onpremisesSyncEnabled(Boolean onpremisesSyncEnabled) {
            this.onpremisesSyncEnabled = Objects.requireNonNull(onpremisesSyncEnabled);
            return this;
        }
        public Builder owners(List<String> owners) {
            this.owners = Objects.requireNonNull(owners);
            return this;
        }
        public Builder owners(String... owners) {
            return owners(List.of(owners));
        }
        public Builder preferredLanguage(String preferredLanguage) {
            this.preferredLanguage = Objects.requireNonNull(preferredLanguage);
            return this;
        }
        public Builder provisioningOptions(List<String> provisioningOptions) {
            this.provisioningOptions = Objects.requireNonNull(provisioningOptions);
            return this;
        }
        public Builder provisioningOptions(String... provisioningOptions) {
            return provisioningOptions(List.of(provisioningOptions));
        }
        public Builder proxyAddresses(List<String> proxyAddresses) {
            this.proxyAddresses = Objects.requireNonNull(proxyAddresses);
            return this;
        }
        public Builder proxyAddresses(String... proxyAddresses) {
            return proxyAddresses(List.of(proxyAddresses));
        }
        public Builder securityEnabled(Boolean securityEnabled) {
            this.securityEnabled = Objects.requireNonNull(securityEnabled);
            return this;
        }
        public Builder theme(String theme) {
            this.theme = Objects.requireNonNull(theme);
            return this;
        }
        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }        public GetGroupResult build() {
            return new GetGroupResult(assignableToRole, autoSubscribeNewMembers, behaviors, description, displayName, dynamicMemberships, externalSendersAllowed, hideFromAddressLists, hideFromOutlookClients, id, mail, mailEnabled, mailNickname, members, objectId, onpremisesDomainName, onpremisesNetbiosName, onpremisesSamAccountName, onpremisesSecurityIdentifier, onpremisesSyncEnabled, owners, preferredLanguage, provisioningOptions, proxyAddresses, securityEnabled, theme, types, visibility);
        }
    }
}
