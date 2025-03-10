// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.LinkedIntegrationRuntimeResponse;
import com.pulumi.azurenative.synapse.outputs.SelfHostedIntegrationRuntimeNodeResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class SelfHostedIntegrationRuntimeStatusResponse {
    /**
     * @return Whether Self-hosted integration runtime auto update has been turned on.
     * 
     */
    private final String autoUpdate;
    /**
     * @return The estimated time when the self-hosted integration runtime will be updated.
     * 
     */
    private final String autoUpdateETA;
    /**
     * @return Object with additional information about integration runtime capabilities.
     * 
     */
    private final Map<String,String> capabilities;
    /**
     * @return The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    private final String createTime;
    /**
     * @return The workspace name which the integration runtime belong to.
     * 
     */
    private final String dataFactoryName;
    /**
     * @return It is used to set the encryption mode for node-node communication channel (when more than 2 self-hosted integration runtime nodes exist).
     * 
     */
    private final String internalChannelEncryption;
    /**
     * @return The latest version on download center.
     * 
     */
    private final String latestVersion;
    /**
     * @return The list of linked integration runtimes that are created to share with this integration runtime.
     * 
     */
    private final @Nullable List<LinkedIntegrationRuntimeResponse> links;
    /**
     * @return The local time zone offset in hours.
     * 
     */
    private final String localTimeZoneOffset;
    /**
     * @return The node communication Channel encryption mode
     * 
     */
    private final String nodeCommunicationChannelEncryptionMode;
    /**
     * @return The list of nodes for this integration runtime.
     * 
     */
    private final @Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes;
    /**
     * @return The version that the integration runtime is going to update to.
     * 
     */
    private final String pushedVersion;
    /**
     * @return The date at which the integration runtime will be scheduled to update, in ISO8601 format.
     * 
     */
    private final String scheduledUpdateDate;
    /**
     * @return The URLs for the services used in integration runtime backend service.
     * 
     */
    private final List<String> serviceUrls;
    /**
     * @return The state of integration runtime.
     * 
     */
    private final String state;
    /**
     * @return The task queue id of the integration runtime.
     * 
     */
    private final String taskQueueId;
    /**
     * @return The type of integration runtime.
     * Expected value is &#39;SelfHosted&#39;.
     * 
     */
    private final String type;
    /**
     * @return The time in the date scheduled by service to update the integration runtime, e.g., PT03H is 3 hours
     * 
     */
    private final String updateDelayOffset;
    /**
     * @return Version of the integration runtime.
     * 
     */
    private final String version;
    /**
     * @return Status of the integration runtime version.
     * 
     */
    private final String versionStatus;

    @CustomType.Constructor
    private SelfHostedIntegrationRuntimeStatusResponse(
        @CustomType.Parameter("autoUpdate") String autoUpdate,
        @CustomType.Parameter("autoUpdateETA") String autoUpdateETA,
        @CustomType.Parameter("capabilities") Map<String,String> capabilities,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("dataFactoryName") String dataFactoryName,
        @CustomType.Parameter("internalChannelEncryption") String internalChannelEncryption,
        @CustomType.Parameter("latestVersion") String latestVersion,
        @CustomType.Parameter("links") @Nullable List<LinkedIntegrationRuntimeResponse> links,
        @CustomType.Parameter("localTimeZoneOffset") String localTimeZoneOffset,
        @CustomType.Parameter("nodeCommunicationChannelEncryptionMode") String nodeCommunicationChannelEncryptionMode,
        @CustomType.Parameter("nodes") @Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes,
        @CustomType.Parameter("pushedVersion") String pushedVersion,
        @CustomType.Parameter("scheduledUpdateDate") String scheduledUpdateDate,
        @CustomType.Parameter("serviceUrls") List<String> serviceUrls,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("taskQueueId") String taskQueueId,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateDelayOffset") String updateDelayOffset,
        @CustomType.Parameter("version") String version,
        @CustomType.Parameter("versionStatus") String versionStatus) {
        this.autoUpdate = autoUpdate;
        this.autoUpdateETA = autoUpdateETA;
        this.capabilities = capabilities;
        this.createTime = createTime;
        this.dataFactoryName = dataFactoryName;
        this.internalChannelEncryption = internalChannelEncryption;
        this.latestVersion = latestVersion;
        this.links = links;
        this.localTimeZoneOffset = localTimeZoneOffset;
        this.nodeCommunicationChannelEncryptionMode = nodeCommunicationChannelEncryptionMode;
        this.nodes = nodes;
        this.pushedVersion = pushedVersion;
        this.scheduledUpdateDate = scheduledUpdateDate;
        this.serviceUrls = serviceUrls;
        this.state = state;
        this.taskQueueId = taskQueueId;
        this.type = type;
        this.updateDelayOffset = updateDelayOffset;
        this.version = version;
        this.versionStatus = versionStatus;
    }

    /**
     * @return Whether Self-hosted integration runtime auto update has been turned on.
     * 
     */
    public String autoUpdate() {
        return this.autoUpdate;
    }
    /**
     * @return The estimated time when the self-hosted integration runtime will be updated.
     * 
     */
    public String autoUpdateETA() {
        return this.autoUpdateETA;
    }
    /**
     * @return Object with additional information about integration runtime capabilities.
     * 
     */
    public Map<String,String> capabilities() {
        return this.capabilities;
    }
    /**
     * @return The time at which the integration runtime was created, in ISO8601 format.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The workspace name which the integration runtime belong to.
     * 
     */
    public String dataFactoryName() {
        return this.dataFactoryName;
    }
    /**
     * @return It is used to set the encryption mode for node-node communication channel (when more than 2 self-hosted integration runtime nodes exist).
     * 
     */
    public String internalChannelEncryption() {
        return this.internalChannelEncryption;
    }
    /**
     * @return The latest version on download center.
     * 
     */
    public String latestVersion() {
        return this.latestVersion;
    }
    /**
     * @return The list of linked integration runtimes that are created to share with this integration runtime.
     * 
     */
    public List<LinkedIntegrationRuntimeResponse> links() {
        return this.links == null ? List.of() : this.links;
    }
    /**
     * @return The local time zone offset in hours.
     * 
     */
    public String localTimeZoneOffset() {
        return this.localTimeZoneOffset;
    }
    /**
     * @return The node communication Channel encryption mode
     * 
     */
    public String nodeCommunicationChannelEncryptionMode() {
        return this.nodeCommunicationChannelEncryptionMode;
    }
    /**
     * @return The list of nodes for this integration runtime.
     * 
     */
    public List<SelfHostedIntegrationRuntimeNodeResponse> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return The version that the integration runtime is going to update to.
     * 
     */
    public String pushedVersion() {
        return this.pushedVersion;
    }
    /**
     * @return The date at which the integration runtime will be scheduled to update, in ISO8601 format.
     * 
     */
    public String scheduledUpdateDate() {
        return this.scheduledUpdateDate;
    }
    /**
     * @return The URLs for the services used in integration runtime backend service.
     * 
     */
    public List<String> serviceUrls() {
        return this.serviceUrls;
    }
    /**
     * @return The state of integration runtime.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The task queue id of the integration runtime.
     * 
     */
    public String taskQueueId() {
        return this.taskQueueId;
    }
    /**
     * @return The type of integration runtime.
     * Expected value is &#39;SelfHosted&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The time in the date scheduled by service to update the integration runtime, e.g., PT03H is 3 hours
     * 
     */
    public String updateDelayOffset() {
        return this.updateDelayOffset;
    }
    /**
     * @return Version of the integration runtime.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return Status of the integration runtime version.
     * 
     */
    public String versionStatus() {
        return this.versionStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelfHostedIntegrationRuntimeStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoUpdate;
        private String autoUpdateETA;
        private Map<String,String> capabilities;
        private String createTime;
        private String dataFactoryName;
        private String internalChannelEncryption;
        private String latestVersion;
        private @Nullable List<LinkedIntegrationRuntimeResponse> links;
        private String localTimeZoneOffset;
        private String nodeCommunicationChannelEncryptionMode;
        private @Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes;
        private String pushedVersion;
        private String scheduledUpdateDate;
        private List<String> serviceUrls;
        private String state;
        private String taskQueueId;
        private String type;
        private String updateDelayOffset;
        private String version;
        private String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SelfHostedIntegrationRuntimeStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpdate = defaults.autoUpdate;
    	      this.autoUpdateETA = defaults.autoUpdateETA;
    	      this.capabilities = defaults.capabilities;
    	      this.createTime = defaults.createTime;
    	      this.dataFactoryName = defaults.dataFactoryName;
    	      this.internalChannelEncryption = defaults.internalChannelEncryption;
    	      this.latestVersion = defaults.latestVersion;
    	      this.links = defaults.links;
    	      this.localTimeZoneOffset = defaults.localTimeZoneOffset;
    	      this.nodeCommunicationChannelEncryptionMode = defaults.nodeCommunicationChannelEncryptionMode;
    	      this.nodes = defaults.nodes;
    	      this.pushedVersion = defaults.pushedVersion;
    	      this.scheduledUpdateDate = defaults.scheduledUpdateDate;
    	      this.serviceUrls = defaults.serviceUrls;
    	      this.state = defaults.state;
    	      this.taskQueueId = defaults.taskQueueId;
    	      this.type = defaults.type;
    	      this.updateDelayOffset = defaults.updateDelayOffset;
    	      this.version = defaults.version;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder autoUpdate(String autoUpdate) {
            this.autoUpdate = Objects.requireNonNull(autoUpdate);
            return this;
        }
        public Builder autoUpdateETA(String autoUpdateETA) {
            this.autoUpdateETA = Objects.requireNonNull(autoUpdateETA);
            return this;
        }
        public Builder capabilities(Map<String,String> capabilities) {
            this.capabilities = Objects.requireNonNull(capabilities);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder dataFactoryName(String dataFactoryName) {
            this.dataFactoryName = Objects.requireNonNull(dataFactoryName);
            return this;
        }
        public Builder internalChannelEncryption(String internalChannelEncryption) {
            this.internalChannelEncryption = Objects.requireNonNull(internalChannelEncryption);
            return this;
        }
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }
        public Builder links(@Nullable List<LinkedIntegrationRuntimeResponse> links) {
            this.links = links;
            return this;
        }
        public Builder links(LinkedIntegrationRuntimeResponse... links) {
            return links(List.of(links));
        }
        public Builder localTimeZoneOffset(String localTimeZoneOffset) {
            this.localTimeZoneOffset = Objects.requireNonNull(localTimeZoneOffset);
            return this;
        }
        public Builder nodeCommunicationChannelEncryptionMode(String nodeCommunicationChannelEncryptionMode) {
            this.nodeCommunicationChannelEncryptionMode = Objects.requireNonNull(nodeCommunicationChannelEncryptionMode);
            return this;
        }
        public Builder nodes(@Nullable List<SelfHostedIntegrationRuntimeNodeResponse> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(SelfHostedIntegrationRuntimeNodeResponse... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder pushedVersion(String pushedVersion) {
            this.pushedVersion = Objects.requireNonNull(pushedVersion);
            return this;
        }
        public Builder scheduledUpdateDate(String scheduledUpdateDate) {
            this.scheduledUpdateDate = Objects.requireNonNull(scheduledUpdateDate);
            return this;
        }
        public Builder serviceUrls(List<String> serviceUrls) {
            this.serviceUrls = Objects.requireNonNull(serviceUrls);
            return this;
        }
        public Builder serviceUrls(String... serviceUrls) {
            return serviceUrls(List.of(serviceUrls));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder taskQueueId(String taskQueueId) {
            this.taskQueueId = Objects.requireNonNull(taskQueueId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateDelayOffset(String updateDelayOffset) {
            this.updateDelayOffset = Objects.requireNonNull(updateDelayOffset);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder versionStatus(String versionStatus) {
            this.versionStatus = Objects.requireNonNull(versionStatus);
            return this;
        }        public SelfHostedIntegrationRuntimeStatusResponse build() {
            return new SelfHostedIntegrationRuntimeStatusResponse(autoUpdate, autoUpdateETA, capabilities, createTime, dataFactoryName, internalChannelEncryption, latestVersion, links, localTimeZoneOffset, nodeCommunicationChannelEncryptionMode, nodes, pushedVersion, scheduledUpdateDate, serviceUrls, state, taskQueueId, type, updateDelayOffset, version, versionStatus);
        }
    }
}
