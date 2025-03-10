// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum KeyPermissions {
        All("all"),
        Encrypt("encrypt"),
        Decrypt("decrypt"),
        WrapKey("wrapKey"),
        UnwrapKey("unwrapKey"),
        Sign("sign"),
        Verify("verify"),
        Get("get"),
        List("list"),
        Create("create"),
        Update("update"),
        Import_("import"),
        Delete("delete"),
        Backup("backup"),
        Restore("restore"),
        Recover("recover"),
        Purge("purge");

        private final String value;

        KeyPermissions(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KeyPermissions[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
