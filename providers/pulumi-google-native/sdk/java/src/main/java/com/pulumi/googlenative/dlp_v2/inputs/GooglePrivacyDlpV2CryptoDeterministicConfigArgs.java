// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoKeyArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pseudonymization method that generates deterministic encryption for the given input. Outputs a base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC https://tools.ietf.org/html/rfc5297.
 * 
 */
public final class GooglePrivacyDlpV2CryptoDeterministicConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CryptoDeterministicConfigArgs Empty = new GooglePrivacyDlpV2CryptoDeterministicConfigArgs();

    /**
     * A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
     * 
     */
    @Import(name="context")
    private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context;

    /**
     * @return A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2FieldIdArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     * 
     */
    @Import(name="cryptoKey")
    private @Nullable Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey;

    /**
     * @return The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2CryptoKeyArgs>> cryptoKey() {
        return Optional.ofNullable(this.cryptoKey);
    }

    /**
     * The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY_TOKEN_INFO_TYPE(3):abc&#39; This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
     * 
     */
    @Import(name="surrogateInfoType")
    private @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType;

    /**
     * @return The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY_TOKEN_INFO_TYPE(3):abc&#39; This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2InfoTypeArgs>> surrogateInfoType() {
        return Optional.ofNullable(this.surrogateInfoType);
    }

    private GooglePrivacyDlpV2CryptoDeterministicConfigArgs() {}

    private GooglePrivacyDlpV2CryptoDeterministicConfigArgs(GooglePrivacyDlpV2CryptoDeterministicConfigArgs $) {
        this.context = $.context;
        this.cryptoKey = $.cryptoKey;
        this.surrogateInfoType = $.surrogateInfoType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2CryptoDeterministicConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CryptoDeterministicConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2CryptoDeterministicConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2CryptoDeterministicConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2CryptoDeterministicConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context A context may be used for higher security and maintaining referential integrity such that the same identifier in two different contexts will be given a distinct surrogate. The context is appended to plaintext value being encrypted. On decryption the provided context is validated against the value used during encryption. If a context was provided during encryption, same context must be provided during decryption as well. If the context is not set, plaintext would be used as is for encryption. If the context is set but: 1. there is no record present when transforming a given value or 2. the field is not present when transforming a given value, plaintext would be used as is for encryption. Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s.
         * 
         * @return builder
         * 
         */
        public Builder context(GooglePrivacyDlpV2FieldIdArgs context) {
            return context(Output.of(context));
        }

        /**
         * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(@Nullable Output<GooglePrivacyDlpV2CryptoKeyArgs> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * @param cryptoKey The key used by the encryption function. For deterministic encryption using AES-SIV, the provided key is internally expanded to 64 bytes prior to use.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(GooglePrivacyDlpV2CryptoKeyArgs cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        /**
         * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY_TOKEN_INFO_TYPE(3):abc&#39; This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
         * 
         * @return builder
         * 
         */
        public Builder surrogateInfoType(@Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> surrogateInfoType) {
            $.surrogateInfoType = surrogateInfoType;
            return this;
        }

        /**
         * @param surrogateInfoType The custom info type to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom info type followed by the number of characters comprising the surrogate. The following scheme defines the format: {info type name}({surrogate character count}):{surrogate} For example, if the name of custom info type is &#39;MY_TOKEN_INFO_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY_TOKEN_INFO_TYPE(3):abc&#39; This annotation identifies the surrogate when inspecting content using the custom info type &#39;Surrogate&#39;. This facilitates reversal of the surrogate when it occurs in free text. Note: For record transformations where the entire cell in a table is being transformed, surrogates are not mandatory. Surrogates are used to denote the location of the token and are necessary for re-identification in free form text. In order for inspection to work properly, the name of this info type must not occur naturally anywhere in your data; otherwise, inspection may either - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the surrogate and result in an error Therefore, choose your custom info type name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY_TOKEN_TYPE.
         * 
         * @return builder
         * 
         */
        public Builder surrogateInfoType(GooglePrivacyDlpV2InfoTypeArgs surrogateInfoType) {
            return surrogateInfoType(Output.of(surrogateInfoType));
        }

        public GooglePrivacyDlpV2CryptoDeterministicConfigArgs build() {
            return $;
        }
    }

}
