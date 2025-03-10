// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * See https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html
     * 
     */
    @EnumType
    public enum Runtime {
        DotnetCore2d1("dotnetcore2.1"),
        DotnetCore3d1("dotnetcore3.1"),
        Dotnet6("dotnet6"),
        Go1dx("go1.x"),
        Java8("java8"),
        Java8AL2("java8.al2"),
        Java11("java11"),
        Ruby2d5("ruby2.5"),
        Ruby2d7("ruby2.7"),
        NodeJS10dX("nodejs10.x"),
        NodeJS12dX("nodejs12.x"),
        NodeJS14dX("nodejs14.x"),
        Python2d7("python2.7"),
        Python3d6("python3.6"),
        Python3d7("python3.7"),
        Python3d8("python3.8"),
        Custom("provided"),
        CustomAL2("provided.al2");

        private final String value;

        Runtime(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Runtime[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
