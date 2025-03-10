// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class UptimeCheckConfigMonitoredResource {
    /**
     * @return Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels &#34;project_id&#34;, &#34;instance_id&#34;, and &#34;zone&#34;.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.monitoredResourceDescriptors#MonitoredResourceDescriptor) object. For example, the type of a Compute Engine VM instance is gce_instance. For a list of types, see Monitoring resource types (https://cloud.google.com/monitoring/api/resources) and Logging resource types (https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private UptimeCheckConfigMonitoredResource(
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("type") String type) {
        this.labels = labels;
        this.type = type;
    }

    /**
     * @return Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels &#34;project_id&#34;, &#34;instance_id&#34;, and &#34;zone&#34;.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.monitoredResourceDescriptors#MonitoredResourceDescriptor) object. For example, the type of a Compute Engine VM instance is gce_instance. For a list of types, see Monitoring resource types (https://cloud.google.com/monitoring/api/resources) and Logging resource types (https://cloud.google.com/logging/docs/api/v2/resource-list).
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigMonitoredResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigMonitoredResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.type = defaults.type;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public UptimeCheckConfigMonitoredResource build() {
            return new UptimeCheckConfigMonitoredResource(labels, type);
        }
    }
}
