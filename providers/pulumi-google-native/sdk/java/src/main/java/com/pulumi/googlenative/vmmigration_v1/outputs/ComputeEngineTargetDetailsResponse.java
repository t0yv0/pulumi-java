// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.vmmigration_v1.outputs.AppliedLicenseResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.ComputeSchedulingResponse;
import com.pulumi.googlenative.vmmigration_v1.outputs.NetworkInterfaceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class ComputeEngineTargetDetailsResponse {
    /**
     * @return Additional licenses to assign to the VM.
     * 
     */
    private final List<String> additionalLicenses;
    /**
     * @return The OS license returned from the adaptation module report.
     * 
     */
    private final AppliedLicenseResponse appliedLicense;
    /**
     * @return The VM Boot Option, as set in the source vm.
     * 
     */
    private final String bootOption;
    /**
     * @return Compute instance scheduling information (if empty default is used).
     * 
     */
    private final ComputeSchedulingResponse computeScheduling;
    /**
     * @return The disk type to use in the VM.
     * 
     */
    private final String diskType;
    /**
     * @return A map of labels to associate with the VM.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The license type to use in OS adaptation.
     * 
     */
    private final String licenseType;
    /**
     * @return The machine type to create the VM with.
     * 
     */
    private final String machineType;
    /**
     * @return The machine type series to create the VM with.
     * 
     */
    private final String machineTypeSeries;
    /**
     * @return The metadata key/value pairs to assign to the VM.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return List of NICs connected to this VM.
     * 
     */
    private final List<NetworkInterfaceResponse> networkInterfaces;
    /**
     * @return A map of network tags to associate with the VM.
     * 
     */
    private final List<String> networkTags;
    /**
     * @return The GCP target project ID or project name.
     * 
     */
    private final String project;
    /**
     * @return Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    private final Boolean secureBoot;
    /**
     * @return The service account to associate the VM with.
     * 
     */
    private final String serviceAccount;
    /**
     * @return The name of the VM to create.
     * 
     */
    private final String vmName;
    /**
     * @return The zone in which to create the VM.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private ComputeEngineTargetDetailsResponse(
        @CustomType.Parameter("additionalLicenses") List<String> additionalLicenses,
        @CustomType.Parameter("appliedLicense") AppliedLicenseResponse appliedLicense,
        @CustomType.Parameter("bootOption") String bootOption,
        @CustomType.Parameter("computeScheduling") ComputeSchedulingResponse computeScheduling,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("licenseType") String licenseType,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("machineTypeSeries") String machineTypeSeries,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("networkInterfaces") List<NetworkInterfaceResponse> networkInterfaces,
        @CustomType.Parameter("networkTags") List<String> networkTags,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("secureBoot") Boolean secureBoot,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("vmName") String vmName,
        @CustomType.Parameter("zone") String zone) {
        this.additionalLicenses = additionalLicenses;
        this.appliedLicense = appliedLicense;
        this.bootOption = bootOption;
        this.computeScheduling = computeScheduling;
        this.diskType = diskType;
        this.labels = labels;
        this.licenseType = licenseType;
        this.machineType = machineType;
        this.machineTypeSeries = machineTypeSeries;
        this.metadata = metadata;
        this.networkInterfaces = networkInterfaces;
        this.networkTags = networkTags;
        this.project = project;
        this.secureBoot = secureBoot;
        this.serviceAccount = serviceAccount;
        this.vmName = vmName;
        this.zone = zone;
    }

    /**
     * @return Additional licenses to assign to the VM.
     * 
     */
    public List<String> additionalLicenses() {
        return this.additionalLicenses;
    }
    /**
     * @return The OS license returned from the adaptation module report.
     * 
     */
    public AppliedLicenseResponse appliedLicense() {
        return this.appliedLicense;
    }
    /**
     * @return The VM Boot Option, as set in the source vm.
     * 
     */
    public String bootOption() {
        return this.bootOption;
    }
    /**
     * @return Compute instance scheduling information (if empty default is used).
     * 
     */
    public ComputeSchedulingResponse computeScheduling() {
        return this.computeScheduling;
    }
    /**
     * @return The disk type to use in the VM.
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return A map of labels to associate with the VM.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The license type to use in OS adaptation.
     * 
     */
    public String licenseType() {
        return this.licenseType;
    }
    /**
     * @return The machine type to create the VM with.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return The machine type series to create the VM with.
     * 
     */
    public String machineTypeSeries() {
        return this.machineTypeSeries;
    }
    /**
     * @return The metadata key/value pairs to assign to the VM.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return List of NICs connected to this VM.
     * 
     */
    public List<NetworkInterfaceResponse> networkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * @return A map of network tags to associate with the VM.
     * 
     */
    public List<String> networkTags() {
        return this.networkTags;
    }
    /**
     * @return The GCP target project ID or project name.
     * 
     */
    public String project() {
        return this.project;
    }
    /**
     * @return Defines whether the instance has Secure Boot enabled. This can be set to true only if the vm boot option is EFI.
     * 
     */
    public Boolean secureBoot() {
        return this.secureBoot;
    }
    /**
     * @return The service account to associate the VM with.
     * 
     */
    public String serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * @return The name of the VM to create.
     * 
     */
    public String vmName() {
        return this.vmName;
    }
    /**
     * @return The zone in which to create the VM.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEngineTargetDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> additionalLicenses;
        private AppliedLicenseResponse appliedLicense;
        private String bootOption;
        private ComputeSchedulingResponse computeScheduling;
        private String diskType;
        private Map<String,String> labels;
        private String licenseType;
        private String machineType;
        private String machineTypeSeries;
        private Map<String,String> metadata;
        private List<NetworkInterfaceResponse> networkInterfaces;
        private List<String> networkTags;
        private String project;
        private Boolean secureBoot;
        private String serviceAccount;
        private String vmName;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEngineTargetDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLicenses = defaults.additionalLicenses;
    	      this.appliedLicense = defaults.appliedLicense;
    	      this.bootOption = defaults.bootOption;
    	      this.computeScheduling = defaults.computeScheduling;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.licenseType = defaults.licenseType;
    	      this.machineType = defaults.machineType;
    	      this.machineTypeSeries = defaults.machineTypeSeries;
    	      this.metadata = defaults.metadata;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkTags = defaults.networkTags;
    	      this.project = defaults.project;
    	      this.secureBoot = defaults.secureBoot;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.vmName = defaults.vmName;
    	      this.zone = defaults.zone;
        }

        public Builder additionalLicenses(List<String> additionalLicenses) {
            this.additionalLicenses = Objects.requireNonNull(additionalLicenses);
            return this;
        }
        public Builder additionalLicenses(String... additionalLicenses) {
            return additionalLicenses(List.of(additionalLicenses));
        }
        public Builder appliedLicense(AppliedLicenseResponse appliedLicense) {
            this.appliedLicense = Objects.requireNonNull(appliedLicense);
            return this;
        }
        public Builder bootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }
        public Builder computeScheduling(ComputeSchedulingResponse computeScheduling) {
            this.computeScheduling = Objects.requireNonNull(computeScheduling);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder machineTypeSeries(String machineTypeSeries) {
            this.machineTypeSeries = Objects.requireNonNull(machineTypeSeries);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder networkInterfaces(List<NetworkInterfaceResponse> networkInterfaces) {
            this.networkInterfaces = Objects.requireNonNull(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(NetworkInterfaceResponse... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder secureBoot(Boolean secureBoot) {
            this.secureBoot = Objects.requireNonNull(secureBoot);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder vmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public ComputeEngineTargetDetailsResponse build() {
            return new ComputeEngineTargetDetailsResponse(additionalLicenses, appliedLicense, bootOption, computeScheduling, diskType, labels, licenseType, machineType, machineTypeSeries, metadata, networkInterfaces, networkTags, project, secureBoot, serviceAccount, vmName, zone);
        }
    }
}
