// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.privatedns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SRVRecordRecord {
    /**
     * @return The Port the service is listening on.
     * 
     */
    private final Integer port;
    /**
     * @return The priority of the SRV record.
     * 
     */
    private final Integer priority;
    /**
     * @return The FQDN of the service.
     * 
     */
    private final String target;
    /**
     * @return The Weight of the SRV record.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private SRVRecordRecord(
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("weight") Integer weight) {
        this.port = port;
        this.priority = priority;
        this.target = target;
        this.weight = weight;
    }

    /**
     * @return The Port the service is listening on.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The priority of the SRV record.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return The FQDN of the service.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The Weight of the SRV record.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SRVRecordRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private Integer priority;
        private String target;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(SRVRecordRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.target = defaults.target;
    	      this.weight = defaults.weight;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public SRVRecordRecord build() {
            return new SRVRecordRecord(port, priority, target, weight);
        }
    }
}
