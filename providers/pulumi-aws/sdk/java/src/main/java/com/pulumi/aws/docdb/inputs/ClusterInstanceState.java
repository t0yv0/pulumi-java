// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterInstanceState Empty = new ClusterInstanceState();

    /**
     * Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @Import(name="applyImmediately")
    private @Nullable Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    public Optional<Output<Boolean>> applyImmediately() {
        return Optional.ofNullable(this.applyImmediately);
    }

    /**
     * Amazon Resource Name (ARN) of cluster instance
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster instance
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    @Import(name="autoMinorVersionUpgrade")
    private @Nullable Output<Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    public Optional<Output<Boolean>> autoMinorVersionUpgrade() {
        return Optional.ofNullable(this.autoMinorVersionUpgrade);
    }

    /**
     * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * (Optional) The identifier of the CA certificate for the DB instance.
     * 
     */
    @Import(name="caCertIdentifier")
    private @Nullable Output<String> caCertIdentifier;

    /**
     * @return (Optional) The identifier of the CA certificate for the DB instance.
     * 
     */
    public Optional<Output<String>> caCertIdentifier() {
        return Optional.ofNullable(this.caCertIdentifier);
    }

    /**
     * The identifier of the `aws.docdb.Cluster` in which to launch this instance.
     * 
     */
    @Import(name="clusterIdentifier")
    private @Nullable Output<String> clusterIdentifier;

    /**
     * @return The identifier of the `aws.docdb.Cluster` in which to launch this instance.
     * 
     */
    public Optional<Output<String>> clusterIdentifier() {
        return Optional.ofNullable(this.clusterIdentifier);
    }

    /**
     * The DB subnet group to associate with this DB instance.
     * 
     */
    @Import(name="dbSubnetGroupName")
    private @Nullable Output<String> dbSubnetGroupName;

    /**
     * @return The DB subnet group to associate with this DB instance.
     * 
     */
    public Optional<Output<String>> dbSubnetGroupName() {
        return Optional.ofNullable(this.dbSubnetGroupName);
    }

    /**
     * The region-unique, immutable identifier for the DB instance.
     * 
     */
    @Import(name="dbiResourceId")
    private @Nullable Output<String> dbiResourceId;

    /**
     * @return The region-unique, immutable identifier for the DB instance.
     * 
     */
    public Optional<Output<String>> dbiResourceId() {
        return Optional.ofNullable(this.dbiResourceId);
    }

    /**
     * The DNS address for this instance. May not be writable
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The DNS address for this instance. May not be writable
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * The database engine version
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return The database engine version
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Import(name="identifierPrefix")
    private @Nullable Output<String> identifierPrefix;

    /**
     * @return Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Optional<Output<String>> identifierPrefix() {
        return Optional.ofNullable(this.identifierPrefix);
    }

    /**
     * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
     * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
     * - db.r5.large
     * - db.r5.xlarge
     * - db.r5.2xlarge
     * - db.r5.4xlarge
     * - db.r5.12xlarge
     * - db.r5.24xlarge
     * - db.r4.large
     * - db.r4.xlarge
     * - db.r4.2xlarge
     * - db.r4.4xlarge
     * - db.r4.8xlarge
     * - db.r4.16xlarge
     * - db.t3.medium
     * 
     */
    @Import(name="instanceClass")
    private @Nullable Output<String> instanceClass;

    /**
     * @return The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
     * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
     * - db.r5.large
     * - db.r5.xlarge
     * - db.r5.2xlarge
     * - db.r5.4xlarge
     * - db.r5.12xlarge
     * - db.r5.24xlarge
     * - db.r4.large
     * - db.r4.xlarge
     * - db.r4.2xlarge
     * - db.r4.4xlarge
     * - db.r4.8xlarge
     * - db.r4.16xlarge
     * - db.t3.medium
     * 
     */
    public Optional<Output<String>> instanceClass() {
        return Optional.ofNullable(this.instanceClass);
    }

    /**
     * The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The database port
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The database port
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled.
     * 
     */
    @Import(name="preferredBackupWindow")
    private @Nullable Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled.
     * 
     */
    public Optional<Output<String>> preferredBackupWindow() {
        return Optional.ofNullable(this.preferredBackupWindow);
    }

    /**
     * The window to perform maintenance in.
     * Syntax: &#34;ddd:hh24:mi-ddd:hh24:mi&#34;. Eg: &#34;Mon:00:00-Mon:03:00&#34;.
     * 
     */
    @Import(name="preferredMaintenanceWindow")
    private @Nullable Output<String> preferredMaintenanceWindow;

    /**
     * @return The window to perform maintenance in.
     * Syntax: &#34;ddd:hh24:mi-ddd:hh24:mi&#34;. Eg: &#34;Mon:00:00-Mon:03:00&#34;.
     * 
     */
    public Optional<Output<String>> preferredMaintenanceWindow() {
        return Optional.ofNullable(this.preferredMaintenanceWindow);
    }

    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @Import(name="promotionTier")
    private @Nullable Output<Integer> promotionTier;

    /**
     * @return Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    public Optional<Output<Integer>> promotionTier() {
        return Optional.ofNullable(this.promotionTier);
    }

    @Import(name="publiclyAccessible")
    private @Nullable Output<Boolean> publiclyAccessible;

    public Optional<Output<Boolean>> publiclyAccessible() {
        return Optional.ofNullable(this.publiclyAccessible);
    }

    /**
     * Specifies whether the DB cluster is encrypted.
     * 
     */
    @Import(name="storageEncrypted")
    private @Nullable Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted.
     * 
     */
    public Optional<Output<Boolean>> storageEncrypted() {
        return Optional.ofNullable(this.storageEncrypted);
    }

    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    @Import(name="writer")
    private @Nullable Output<Boolean> writer;

    /**
     * @return Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    public Optional<Output<Boolean>> writer() {
        return Optional.ofNullable(this.writer);
    }

    private ClusterInstanceState() {}

    private ClusterInstanceState(ClusterInstanceState $) {
        this.applyImmediately = $.applyImmediately;
        this.arn = $.arn;
        this.autoMinorVersionUpgrade = $.autoMinorVersionUpgrade;
        this.availabilityZone = $.availabilityZone;
        this.caCertIdentifier = $.caCertIdentifier;
        this.clusterIdentifier = $.clusterIdentifier;
        this.dbSubnetGroupName = $.dbSubnetGroupName;
        this.dbiResourceId = $.dbiResourceId;
        this.endpoint = $.endpoint;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.identifier = $.identifier;
        this.identifierPrefix = $.identifierPrefix;
        this.instanceClass = $.instanceClass;
        this.kmsKeyId = $.kmsKeyId;
        this.port = $.port;
        this.preferredBackupWindow = $.preferredBackupWindow;
        this.preferredMaintenanceWindow = $.preferredMaintenanceWindow;
        this.promotionTier = $.promotionTier;
        this.publiclyAccessible = $.publiclyAccessible;
        this.storageEncrypted = $.storageEncrypted;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.writer = $.writer;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterInstanceState $;

        public Builder() {
            $ = new ClusterInstanceState();
        }

        public Builder(ClusterInstanceState defaults) {
            $ = new ClusterInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyImmediately Specifies whether any database modifications
         * are applied immediately, or during the next maintenance window. Default is`false`.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            $.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * @param applyImmediately Specifies whether any database modifications
         * are applied immediately, or during the next maintenance window. Default is`false`.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(Boolean applyImmediately) {
            return applyImmediately(Output.of(applyImmediately));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of cluster instance
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of cluster instance
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoMinorVersionUpgrade(@Nullable Output<Boolean> autoMinorVersionUpgrade) {
            $.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
         * 
         * @return builder
         * 
         */
        public Builder autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            return autoMinorVersionUpgrade(Output.of(autoMinorVersionUpgrade));
        }

        /**
         * @param availabilityZone The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/documentdb/latest/developerguide/API_CreateDBInstance.html) about the details.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param caCertIdentifier (Optional) The identifier of the CA certificate for the DB instance.
         * 
         * @return builder
         * 
         */
        public Builder caCertIdentifier(@Nullable Output<String> caCertIdentifier) {
            $.caCertIdentifier = caCertIdentifier;
            return this;
        }

        /**
         * @param caCertIdentifier (Optional) The identifier of the CA certificate for the DB instance.
         * 
         * @return builder
         * 
         */
        public Builder caCertIdentifier(String caCertIdentifier) {
            return caCertIdentifier(Output.of(caCertIdentifier));
        }

        /**
         * @param clusterIdentifier The identifier of the `aws.docdb.Cluster` in which to launch this instance.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The identifier of the `aws.docdb.Cluster` in which to launch this instance.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param dbSubnetGroupName The DB subnet group to associate with this DB instance.
         * 
         * @return builder
         * 
         */
        public Builder dbSubnetGroupName(@Nullable Output<String> dbSubnetGroupName) {
            $.dbSubnetGroupName = dbSubnetGroupName;
            return this;
        }

        /**
         * @param dbSubnetGroupName The DB subnet group to associate with this DB instance.
         * 
         * @return builder
         * 
         */
        public Builder dbSubnetGroupName(String dbSubnetGroupName) {
            return dbSubnetGroupName(Output.of(dbSubnetGroupName));
        }

        /**
         * @param dbiResourceId The region-unique, immutable identifier for the DB instance.
         * 
         * @return builder
         * 
         */
        public Builder dbiResourceId(@Nullable Output<String> dbiResourceId) {
            $.dbiResourceId = dbiResourceId;
            return this;
        }

        /**
         * @param dbiResourceId The region-unique, immutable identifier for the DB instance.
         * 
         * @return builder
         * 
         */
        public Builder dbiResourceId(String dbiResourceId) {
            return dbiResourceId(Output.of(dbiResourceId));
        }

        /**
         * @param endpoint The DNS address for this instance. May not be writable
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The DNS address for this instance. May not be writable
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param engine The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion The database engine version
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion The database engine version
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param identifier The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier The identifier for the DocDB instance, if omitted, this provider will assign a random, unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param identifierPrefix Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
         * 
         * @return builder
         * 
         */
        public Builder identifierPrefix(@Nullable Output<String> identifierPrefix) {
            $.identifierPrefix = identifierPrefix;
            return this;
        }

        /**
         * @param identifierPrefix Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
         * 
         * @return builder
         * 
         */
        public Builder identifierPrefix(String identifierPrefix) {
            return identifierPrefix(Output.of(identifierPrefix));
        }

        /**
         * @param instanceClass The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
         * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
         * - db.r5.large
         * - db.r5.xlarge
         * - db.r5.2xlarge
         * - db.r5.4xlarge
         * - db.r5.12xlarge
         * - db.r5.24xlarge
         * - db.r4.large
         * - db.r4.xlarge
         * - db.r4.2xlarge
         * - db.r4.4xlarge
         * - db.r4.8xlarge
         * - db.r4.16xlarge
         * - db.t3.medium
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            $.instanceClass = instanceClass;
            return this;
        }

        /**
         * @param instanceClass The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-cluster-manage-performance.html#db-cluster-manage-scaling-instance). DocDB currently
         * supports the below instance classes. Please see [AWS Documentation](https://docs.aws.amazon.com/documentdb/latest/developerguide/db-instance-classes.html#db-instance-class-specs) for complete details.
         * - db.r5.large
         * - db.r5.xlarge
         * - db.r5.2xlarge
         * - db.r5.4xlarge
         * - db.r5.12xlarge
         * - db.r5.24xlarge
         * - db.r4.large
         * - db.r4.xlarge
         * - db.r4.2xlarge
         * - db.r4.4xlarge
         * - db.r4.8xlarge
         * - db.r4.16xlarge
         * - db.t3.medium
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(String instanceClass) {
            return instanceClass(Output.of(instanceClass));
        }

        /**
         * @param kmsKeyId The ARN for the KMS encryption key if one is set to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId The ARN for the KMS encryption key if one is set to the cluster.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param port The database port
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The database port
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param preferredBackupWindow The daily time range during which automated backups are created if automated backups are enabled.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            $.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        /**
         * @param preferredBackupWindow The daily time range during which automated backups are created if automated backups are enabled.
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupWindow(String preferredBackupWindow) {
            return preferredBackupWindow(Output.of(preferredBackupWindow));
        }

        /**
         * @param preferredMaintenanceWindow The window to perform maintenance in.
         * Syntax: &#34;ddd:hh24:mi-ddd:hh24:mi&#34;. Eg: &#34;Mon:00:00-Mon:03:00&#34;.
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            $.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * @param preferredMaintenanceWindow The window to perform maintenance in.
         * Syntax: &#34;ddd:hh24:mi-ddd:hh24:mi&#34;. Eg: &#34;Mon:00:00-Mon:03:00&#34;.
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            return preferredMaintenanceWindow(Output.of(preferredMaintenanceWindow));
        }

        /**
         * @param promotionTier Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
         * 
         * @return builder
         * 
         */
        public Builder promotionTier(@Nullable Output<Integer> promotionTier) {
            $.promotionTier = promotionTier;
            return this;
        }

        /**
         * @param promotionTier Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
         * 
         * @return builder
         * 
         */
        public Builder promotionTier(Integer promotionTier) {
            return promotionTier(Output.of(promotionTier));
        }

        public Builder publiclyAccessible(@Nullable Output<Boolean> publiclyAccessible) {
            $.publiclyAccessible = publiclyAccessible;
            return this;
        }

        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            return publiclyAccessible(Output.of(publiclyAccessible));
        }

        /**
         * @param storageEncrypted Specifies whether the DB cluster is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            $.storageEncrypted = storageEncrypted;
            return this;
        }

        /**
         * @param storageEncrypted Specifies whether the DB cluster is encrypted.
         * 
         * @return builder
         * 
         */
        public Builder storageEncrypted(Boolean storageEncrypted) {
            return storageEncrypted(Output.of(storageEncrypted));
        }

        /**
         * @param tags A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param writer Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
         * 
         * @return builder
         * 
         */
        public Builder writer(@Nullable Output<Boolean> writer) {
            $.writer = writer;
            return this;
        }

        /**
         * @param writer Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
         * 
         * @return builder
         * 
         */
        public Builder writer(Boolean writer) {
            return writer(Output.of(writer));
        }

        public ClusterInstanceState build() {
            return $;
        }
    }

}
