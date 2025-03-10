// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.outputs;

import com.pulumi.azurenative.orbital.outputs.ContactProfileLinkChannelResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContactProfileLinkResponse {
    /**
     * @return Contact Profile Link Channel
     * 
     */
    private final List<ContactProfileLinkChannelResponse> channels;
    /**
     * @return Direction (uplink or downlink)
     * 
     */
    private final String direction;
    /**
     * @return Effective Isotropic Radiated Power (EIRP) in dBW.
     * 
     */
    private final @Nullable Double eirpdBW;
    /**
     * @return Gain To Noise Temperature in db/K.
     * 
     */
    private final @Nullable Double gainOverTemperature;
    /**
     * @return polarization. eg (RHCP, LHCP)
     * 
     */
    private final String polarization;

    @CustomType.Constructor
    private ContactProfileLinkResponse(
        @CustomType.Parameter("channels") List<ContactProfileLinkChannelResponse> channels,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("eirpdBW") @Nullable Double eirpdBW,
        @CustomType.Parameter("gainOverTemperature") @Nullable Double gainOverTemperature,
        @CustomType.Parameter("polarization") String polarization) {
        this.channels = channels;
        this.direction = direction;
        this.eirpdBW = eirpdBW;
        this.gainOverTemperature = gainOverTemperature;
        this.polarization = polarization;
    }

    /**
     * @return Contact Profile Link Channel
     * 
     */
    public List<ContactProfileLinkChannelResponse> channels() {
        return this.channels;
    }
    /**
     * @return Direction (uplink or downlink)
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return Effective Isotropic Radiated Power (EIRP) in dBW.
     * 
     */
    public Optional<Double> eirpdBW() {
        return Optional.ofNullable(this.eirpdBW);
    }
    /**
     * @return Gain To Noise Temperature in db/K.
     * 
     */
    public Optional<Double> gainOverTemperature() {
        return Optional.ofNullable(this.gainOverTemperature);
    }
    /**
     * @return polarization. eg (RHCP, LHCP)
     * 
     */
    public String polarization() {
        return this.polarization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactProfileLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ContactProfileLinkChannelResponse> channels;
        private String direction;
        private @Nullable Double eirpdBW;
        private @Nullable Double gainOverTemperature;
        private String polarization;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactProfileLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channels = defaults.channels;
    	      this.direction = defaults.direction;
    	      this.eirpdBW = defaults.eirpdBW;
    	      this.gainOverTemperature = defaults.gainOverTemperature;
    	      this.polarization = defaults.polarization;
        }

        public Builder channels(List<ContactProfileLinkChannelResponse> channels) {
            this.channels = Objects.requireNonNull(channels);
            return this;
        }
        public Builder channels(ContactProfileLinkChannelResponse... channels) {
            return channels(List.of(channels));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder eirpdBW(@Nullable Double eirpdBW) {
            this.eirpdBW = eirpdBW;
            return this;
        }
        public Builder gainOverTemperature(@Nullable Double gainOverTemperature) {
            this.gainOverTemperature = gainOverTemperature;
            return this;
        }
        public Builder polarization(String polarization) {
            this.polarization = Objects.requireNonNull(polarization);
            return this;
        }        public ContactProfileLinkResponse build() {
            return new ContactProfileLinkResponse(channels, direction, eirpdBW, gainOverTemperature, polarization);
        }
    }
}
