// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class OrchestratedVirtualMachineScaleSetSourceImageReference {
    private final String offer;
    private final String publisher;
    private final String sku;
    private final String version;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetSourceImageReference(
        @CustomType.Parameter("offer") String offer,
        @CustomType.Parameter("publisher") String publisher,
        @CustomType.Parameter("sku") String sku,
        @CustomType.Parameter("version") String version) {
        this.offer = offer;
        this.publisher = publisher;
        this.sku = sku;
        this.version = version;
    }

    public String offer() {
        return this.offer;
    }
    public String publisher() {
        return this.publisher;
    }
    public String sku() {
        return this.sku;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetSourceImageReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String offer;
        private String publisher;
        private String sku;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetSourceImageReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.offer = defaults.offer;
    	      this.publisher = defaults.publisher;
    	      this.sku = defaults.sku;
    	      this.version = defaults.version;
        }

        public Builder offer(String offer) {
            this.offer = Objects.requireNonNull(offer);
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder sku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public OrchestratedVirtualMachineScaleSetSourceImageReference build() {
            return new OrchestratedVirtualMachineScaleSetSourceImageReference(offer, publisher, sku, version);
        }
    }
}
