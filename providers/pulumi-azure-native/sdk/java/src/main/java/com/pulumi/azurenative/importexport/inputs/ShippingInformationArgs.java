// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about the Microsoft datacenter to which the drives should be shipped.
 * 
 */
public final class ShippingInformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShippingInformationArgs Empty = new ShippingInformationArgs();

    /**
     * The city name to use when returning the drives.
     * 
     */
    @Import(name="city")
    private @Nullable Output<String> city;

    /**
     * @return The city name to use when returning the drives.
     * 
     */
    public Optional<Output<String>> city() {
        return Optional.ofNullable(this.city);
    }

    /**
     * The country or region to use when returning the drives.
     * 
     */
    @Import(name="countryOrRegion")
    private @Nullable Output<String> countryOrRegion;

    /**
     * @return The country or region to use when returning the drives.
     * 
     */
    public Optional<Output<String>> countryOrRegion() {
        return Optional.ofNullable(this.countryOrRegion);
    }

    /**
     * Phone number of the recipient of the returned drives.
     * 
     */
    @Import(name="phone")
    private @Nullable Output<String> phone;

    /**
     * @return Phone number of the recipient of the returned drives.
     * 
     */
    public Optional<Output<String>> phone() {
        return Optional.ofNullable(this.phone);
    }

    /**
     * The postal code to use when returning the drives.
     * 
     */
    @Import(name="postalCode")
    private @Nullable Output<String> postalCode;

    /**
     * @return The postal code to use when returning the drives.
     * 
     */
    public Optional<Output<String>> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }

    /**
     * The name of the recipient who will receive the hard drives when they are returned.
     * 
     */
    @Import(name="recipientName")
    private @Nullable Output<String> recipientName;

    /**
     * @return The name of the recipient who will receive the hard drives when they are returned.
     * 
     */
    public Optional<Output<String>> recipientName() {
        return Optional.ofNullable(this.recipientName);
    }

    /**
     * The state or province to use when returning the drives.
     * 
     */
    @Import(name="stateOrProvince")
    private @Nullable Output<String> stateOrProvince;

    /**
     * @return The state or province to use when returning the drives.
     * 
     */
    public Optional<Output<String>> stateOrProvince() {
        return Optional.ofNullable(this.stateOrProvince);
    }

    /**
     * The first line of the street address to use when returning the drives.
     * 
     */
    @Import(name="streetAddress1")
    private @Nullable Output<String> streetAddress1;

    /**
     * @return The first line of the street address to use when returning the drives.
     * 
     */
    public Optional<Output<String>> streetAddress1() {
        return Optional.ofNullable(this.streetAddress1);
    }

    /**
     * The second line of the street address to use when returning the drives.
     * 
     */
    @Import(name="streetAddress2")
    private @Nullable Output<String> streetAddress2;

    /**
     * @return The second line of the street address to use when returning the drives.
     * 
     */
    public Optional<Output<String>> streetAddress2() {
        return Optional.ofNullable(this.streetAddress2);
    }

    private ShippingInformationArgs() {}

    private ShippingInformationArgs(ShippingInformationArgs $) {
        this.city = $.city;
        this.countryOrRegion = $.countryOrRegion;
        this.phone = $.phone;
        this.postalCode = $.postalCode;
        this.recipientName = $.recipientName;
        this.stateOrProvince = $.stateOrProvince;
        this.streetAddress1 = $.streetAddress1;
        this.streetAddress2 = $.streetAddress2;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShippingInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShippingInformationArgs $;

        public Builder() {
            $ = new ShippingInformationArgs();
        }

        public Builder(ShippingInformationArgs defaults) {
            $ = new ShippingInformationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param city The city name to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder city(@Nullable Output<String> city) {
            $.city = city;
            return this;
        }

        /**
         * @param city The city name to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            return city(Output.of(city));
        }

        /**
         * @param countryOrRegion The country or region to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder countryOrRegion(@Nullable Output<String> countryOrRegion) {
            $.countryOrRegion = countryOrRegion;
            return this;
        }

        /**
         * @param countryOrRegion The country or region to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder countryOrRegion(String countryOrRegion) {
            return countryOrRegion(Output.of(countryOrRegion));
        }

        /**
         * @param phone Phone number of the recipient of the returned drives.
         * 
         * @return builder
         * 
         */
        public Builder phone(@Nullable Output<String> phone) {
            $.phone = phone;
            return this;
        }

        /**
         * @param phone Phone number of the recipient of the returned drives.
         * 
         * @return builder
         * 
         */
        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        /**
         * @param postalCode The postal code to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder postalCode(@Nullable Output<String> postalCode) {
            $.postalCode = postalCode;
            return this;
        }

        /**
         * @param postalCode The postal code to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder postalCode(String postalCode) {
            return postalCode(Output.of(postalCode));
        }

        /**
         * @param recipientName The name of the recipient who will receive the hard drives when they are returned.
         * 
         * @return builder
         * 
         */
        public Builder recipientName(@Nullable Output<String> recipientName) {
            $.recipientName = recipientName;
            return this;
        }

        /**
         * @param recipientName The name of the recipient who will receive the hard drives when they are returned.
         * 
         * @return builder
         * 
         */
        public Builder recipientName(String recipientName) {
            return recipientName(Output.of(recipientName));
        }

        /**
         * @param stateOrProvince The state or province to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder stateOrProvince(@Nullable Output<String> stateOrProvince) {
            $.stateOrProvince = stateOrProvince;
            return this;
        }

        /**
         * @param stateOrProvince The state or province to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder stateOrProvince(String stateOrProvince) {
            return stateOrProvince(Output.of(stateOrProvince));
        }

        /**
         * @param streetAddress1 The first line of the street address to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder streetAddress1(@Nullable Output<String> streetAddress1) {
            $.streetAddress1 = streetAddress1;
            return this;
        }

        /**
         * @param streetAddress1 The first line of the street address to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder streetAddress1(String streetAddress1) {
            return streetAddress1(Output.of(streetAddress1));
        }

        /**
         * @param streetAddress2 The second line of the street address to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder streetAddress2(@Nullable Output<String> streetAddress2) {
            $.streetAddress2 = streetAddress2;
            return this;
        }

        /**
         * @param streetAddress2 The second line of the street address to use when returning the drives.
         * 
         * @return builder
         * 
         */
        public Builder streetAddress2(String streetAddress2) {
            return streetAddress2(Output.of(streetAddress2));
        }

        public ShippingInformationArgs build() {
            return $;
        }
    }

}
