// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.outputs;

import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamOrcSerDe;
import com.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamParquetSerDe;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamSerializer {
    private final @Nullable DeliveryStreamOrcSerDe orcSerDe;
    private final @Nullable DeliveryStreamParquetSerDe parquetSerDe;

    @CustomType.Constructor
    private DeliveryStreamSerializer(
        @CustomType.Parameter("orcSerDe") @Nullable DeliveryStreamOrcSerDe orcSerDe,
        @CustomType.Parameter("parquetSerDe") @Nullable DeliveryStreamParquetSerDe parquetSerDe) {
        this.orcSerDe = orcSerDe;
        this.parquetSerDe = parquetSerDe;
    }

    public Optional<DeliveryStreamOrcSerDe> orcSerDe() {
        return Optional.ofNullable(this.orcSerDe);
    }
    public Optional<DeliveryStreamParquetSerDe> parquetSerDe() {
        return Optional.ofNullable(this.parquetSerDe);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamSerializer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamOrcSerDe orcSerDe;
        private @Nullable DeliveryStreamParquetSerDe parquetSerDe;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamSerializer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.orcSerDe = defaults.orcSerDe;
    	      this.parquetSerDe = defaults.parquetSerDe;
        }

        public Builder orcSerDe(@Nullable DeliveryStreamOrcSerDe orcSerDe) {
            this.orcSerDe = orcSerDe;
            return this;
        }
        public Builder parquetSerDe(@Nullable DeliveryStreamParquetSerDe parquetSerDe) {
            this.parquetSerDe = parquetSerDe;
            return this;
        }        public DeliveryStreamSerializer build() {
            return new DeliveryStreamSerializer(orcSerDe, parquetSerDe);
        }
    }
}
