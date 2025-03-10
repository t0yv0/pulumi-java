// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2alphaColorInfoResponse {
    /**
     * @return The standard color families. Strongly recommended to use the following standard color groups: &#34;Red&#34;, &#34;Pink&#34;, &#34;Orange&#34;, &#34;Yellow&#34;, &#34;Purple&#34;, &#34;Green&#34;, &#34;Cyan&#34;, &#34;Blue&#34;, &#34;Brown&#34;, &#34;White&#34;, &#34;Gray&#34;, &#34;Black&#34; and &#34;Mixed&#34;. Normally it is expected to have only 1 color family. May consider using single &#34;Mixed&#34; instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    private final List<String> colorFamilies;
    /**
     * @return The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single &#34;Mixed&#34; instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    private final List<String> colors;

    @CustomType.Constructor
    private GoogleCloudRetailV2alphaColorInfoResponse(
        @CustomType.Parameter("colorFamilies") List<String> colorFamilies,
        @CustomType.Parameter("colors") List<String> colors) {
        this.colorFamilies = colorFamilies;
        this.colors = colors;
    }

    /**
     * @return The standard color families. Strongly recommended to use the following standard color groups: &#34;Red&#34;, &#34;Pink&#34;, &#34;Orange&#34;, &#34;Yellow&#34;, &#34;Purple&#34;, &#34;Green&#34;, &#34;Cyan&#34;, &#34;Blue&#34;, &#34;Brown&#34;, &#34;White&#34;, &#34;Gray&#34;, &#34;Black&#34; and &#34;Mixed&#34;. Normally it is expected to have only 1 color family. May consider using single &#34;Mixed&#34; instead of multiple values. A maximum of 5 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    public List<String> colorFamilies() {
        return this.colorFamilies;
    }
    /**
     * @return The color display names, which may be different from standard color family names, such as the color aliases used in the website frontend. Normally it is expected to have only 1 color. May consider using single &#34;Mixed&#34; instead of multiple values. A maximum of 25 colors are allowed. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
     * 
     */
    public List<String> colors() {
        return this.colors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaColorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> colorFamilies;
        private List<String> colors;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaColorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colorFamilies = defaults.colorFamilies;
    	      this.colors = defaults.colors;
        }

        public Builder colorFamilies(List<String> colorFamilies) {
            this.colorFamilies = Objects.requireNonNull(colorFamilies);
            return this;
        }
        public Builder colorFamilies(String... colorFamilies) {
            return colorFamilies(List.of(colorFamilies));
        }
        public Builder colors(List<String> colors) {
            this.colors = Objects.requireNonNull(colors);
            return this;
        }
        public Builder colors(String... colors) {
            return colors(List.of(colors));
        }        public GoogleCloudRetailV2alphaColorInfoResponse build() {
            return new GoogleCloudRetailV2alphaColorInfoResponse(colorFamilies, colors);
        }
    }
}
