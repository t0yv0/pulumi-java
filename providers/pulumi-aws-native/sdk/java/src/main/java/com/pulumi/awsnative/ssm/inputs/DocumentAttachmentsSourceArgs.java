// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.awsnative.ssm.enums.DocumentAttachmentsSourceKey;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DocumentAttachmentsSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DocumentAttachmentsSourceArgs Empty = new DocumentAttachmentsSourceArgs();

    /**
     * The key of a key-value pair that identifies the location of an attachment to a document.
     * 
     */
    @Import(name="key")
    private @Nullable Output<DocumentAttachmentsSourceKey> key;

    /**
     * @return The key of a key-value pair that identifies the location of an attachment to a document.
     * 
     */
    public Optional<Output<DocumentAttachmentsSourceKey>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * The name of the document attachment file.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the document attachment file.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private DocumentAttachmentsSourceArgs() {}

    private DocumentAttachmentsSourceArgs(DocumentAttachmentsSourceArgs $) {
        this.key = $.key;
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DocumentAttachmentsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DocumentAttachmentsSourceArgs $;

        public Builder() {
            $ = new DocumentAttachmentsSourceArgs();
        }

        public Builder(DocumentAttachmentsSourceArgs defaults) {
            $ = new DocumentAttachmentsSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of a key-value pair that identifies the location of an attachment to a document.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<DocumentAttachmentsSourceKey> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of a key-value pair that identifies the location of an attachment to a document.
         * 
         * @return builder
         * 
         */
        public Builder key(DocumentAttachmentsSourceKey key) {
            return key(Output.of(key));
        }

        /**
         * @param name The name of the document attachment file.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the document attachment file.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public DocumentAttachmentsSourceArgs build() {
            return $;
        }
    }

}
