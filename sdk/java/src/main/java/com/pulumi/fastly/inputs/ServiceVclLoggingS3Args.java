// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceVclLoggingS3Args extends com.pulumi.resources.ResourceArgs {

    public static final ServiceVclLoggingS3Args Empty = new ServiceVclLoggingS3Args();

    /**
     * The AWS [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) to use for objects uploaded to the S3 bucket. Options are: `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`
     * 
     */
    @Import(name="acl")
    private @Nullable Output<String> acl;

    /**
     * @return The AWS [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) to use for objects uploaded to the S3 bucket. Options are: `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`
     * 
     */
    public Optional<Output<String>> acl() {
        return Optional.ofNullable(this.acl);
    }

    /**
     * The name of the bucket in which to store the logs
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the bucket in which to store the logs
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
     * 
     */
    @Import(name="compressionCodec")
    private @Nullable Output<String> compressionCodec;

    /**
     * @return The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
     * 
     */
    public Optional<Output<String>> compressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }

    /**
     * If you created the S3 bucket outside of `us-east-1`, then specify the corresponding bucket endpoint. Example: `s3-us-west-2.amazonaws.com`
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return If you created the S3 bucket outside of `us-east-1`, then specify the corresponding bucket endpoint. Example: `s3-us-west-2.amazonaws.com`
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * Apache-style string or VCL variables to use for log formatting.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Apache-style string or VCL variables to use for log formatting.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2).
     * 
     */
    @Import(name="formatVersion")
    private @Nullable Output<Integer> formatVersion;

    /**
     * @return The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2).
     * 
     */
    public Optional<Output<Integer>> formatVersion() {
        return Optional.ofNullable(this.formatVersion);
    }

    /**
     * Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
     * 
     */
    @Import(name="gzipLevel")
    private @Nullable Output<Integer> gzipLevel;

    /**
     * @return Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
     * 
     */
    public Optional<Output<Integer>> gzipLevel() {
        return Optional.ofNullable(this.gzipLevel);
    }

    /**
     * How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
     * 
     */
    @Import(name="messageType")
    private @Nullable Output<String> messageType;

    /**
     * @return How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
     * 
     */
    public Optional<Output<String>> messageType() {
        return Optional.ofNullable(this.messageType);
    }

    /**
     * The unique name of the S3 logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the S3 logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Path to store the files. Must end with a trailing slash. If this field is left empty, the files will be saved in the bucket&#39;s root path
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to store the files. Must end with a trailing slash. If this field is left empty, the files will be saved in the bucket&#39;s root path
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * How frequently the logs should be transferred, in seconds. Default `3600`
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return How frequently the logs should be transferred, in seconds. Default `3600`
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Where in the generated VCL the logging call should be placed.
     * 
     */
    @Import(name="placement")
    private @Nullable Output<String> placement;

    /**
     * @return Where in the generated VCL the logging call should be placed.
     * 
     */
    public Optional<Output<String>> placement() {
        return Optional.ofNullable(this.placement);
    }

    /**
     * A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    @Import(name="publicKey")
    private @Nullable Output<String> publicKey;

    /**
     * @return A PGP public key that Fastly will use to encrypt your log files before writing them to disk
     * 
     */
    public Optional<Output<String>> publicKey() {
        return Optional.ofNullable(this.publicKey);
    }

    /**
     * The S3 storage class (redundancy level). Should be one of: `standard`, `reduced_redundancy`, `standard_ia`, or `onezone_ia`
     * 
     */
    @Import(name="redundancy")
    private @Nullable Output<String> redundancy;

    /**
     * @return The S3 storage class (redundancy level). Should be one of: `standard`, `reduced_redundancy`, `standard_ia`, or `onezone_ia`
     * 
     */
    public Optional<Output<String>> redundancy() {
        return Optional.ofNullable(this.redundancy);
    }

    /**
     * Name of blockAttributes condition to apply this logging.
     * 
     */
    @Import(name="responseCondition")
    private @Nullable Output<String> responseCondition;

    /**
     * @return Name of blockAttributes condition to apply this logging.
     * 
     */
    public Optional<Output<String>> responseCondition() {
        return Optional.ofNullable(this.responseCondition);
    }

    /**
     * AWS Access Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This key will be not be encrypted. Not required if `iam_role` is provided. You can provide this key via an environment variable, `FASTLY_S3_ACCESS_KEY`
     * 
     */
    @Import(name="s3AccessKey")
    private @Nullable Output<String> s3AccessKey;

    /**
     * @return AWS Access Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This key will be not be encrypted. Not required if `iam_role` is provided. You can provide this key via an environment variable, `FASTLY_S3_ACCESS_KEY`
     * 
     */
    public Optional<Output<String>> s3AccessKey() {
        return Optional.ofNullable(this.s3AccessKey);
    }

    /**
     * The Amazon Resource Name (ARN) for the IAM role granting Fastly access to S3. Not required if `access_key` and `secret_key` are provided. You can provide this value via an environment variable, `FASTLY_S3_IAM_ROLE`
     * 
     */
    @Import(name="s3IamRole")
    private @Nullable Output<String> s3IamRole;

    /**
     * @return The Amazon Resource Name (ARN) for the IAM role granting Fastly access to S3. Not required if `access_key` and `secret_key` are provided. You can provide this value via an environment variable, `FASTLY_S3_IAM_ROLE`
     * 
     */
    public Optional<Output<String>> s3IamRole() {
        return Optional.ofNullable(this.s3IamRole);
    }

    /**
     * AWS Secret Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This secret will be not be encrypted. Not required if `iam_role` is provided. You can provide this secret via an environment variable, `FASTLY_S3_SECRET_KEY`
     * 
     */
    @Import(name="s3SecretKey")
    private @Nullable Output<String> s3SecretKey;

    /**
     * @return AWS Secret Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This secret will be not be encrypted. Not required if `iam_role` is provided. You can provide this secret via an environment variable, `FASTLY_S3_SECRET_KEY`
     * 
     */
    public Optional<Output<String>> s3SecretKey() {
        return Optional.ofNullable(this.s3SecretKey);
    }

    /**
     * Specify what type of server side encryption should be used. Can be either `AES256` or `aws:kms`
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<String> serverSideEncryption;

    /**
     * @return Specify what type of server side encryption should be used. Can be either `AES256` or `aws:kms`
     * 
     */
    public Optional<Output<String>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    /**
     * Optional server-side KMS Key Id. Must be set if server*side*encryption is set to `aws:kms`
     * 
     */
    @Import(name="serverSideEncryptionKmsKeyId")
    private @Nullable Output<String> serverSideEncryptionKmsKeyId;

    /**
     * @return Optional server-side KMS Key Id. Must be set if server*side*encryption is set to `aws:kms`
     * 
     */
    public Optional<Output<String>> serverSideEncryptionKmsKeyId() {
        return Optional.ofNullable(this.serverSideEncryptionKmsKeyId);
    }

    /**
     * The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    @Import(name="timestampFormat")
    private @Nullable Output<String> timestampFormat;

    /**
     * @return The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
     * 
     */
    public Optional<Output<String>> timestampFormat() {
        return Optional.ofNullable(this.timestampFormat);
    }

    private ServiceVclLoggingS3Args() {}

    private ServiceVclLoggingS3Args(ServiceVclLoggingS3Args $) {
        this.acl = $.acl;
        this.bucketName = $.bucketName;
        this.compressionCodec = $.compressionCodec;
        this.domain = $.domain;
        this.format = $.format;
        this.formatVersion = $.formatVersion;
        this.gzipLevel = $.gzipLevel;
        this.messageType = $.messageType;
        this.name = $.name;
        this.path = $.path;
        this.period = $.period;
        this.placement = $.placement;
        this.publicKey = $.publicKey;
        this.redundancy = $.redundancy;
        this.responseCondition = $.responseCondition;
        this.s3AccessKey = $.s3AccessKey;
        this.s3IamRole = $.s3IamRole;
        this.s3SecretKey = $.s3SecretKey;
        this.serverSideEncryption = $.serverSideEncryption;
        this.serverSideEncryptionKmsKeyId = $.serverSideEncryptionKmsKeyId;
        this.timestampFormat = $.timestampFormat;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceVclLoggingS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceVclLoggingS3Args $;

        public Builder() {
            $ = new ServiceVclLoggingS3Args();
        }

        public Builder(ServiceVclLoggingS3Args defaults) {
            $ = new ServiceVclLoggingS3Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param acl The AWS [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) to use for objects uploaded to the S3 bucket. Options are: `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`
         * 
         * @return builder
         * 
         */
        public Builder acl(@Nullable Output<String> acl) {
            $.acl = acl;
            return this;
        }

        /**
         * @param acl The AWS [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl) to use for objects uploaded to the S3 bucket. Options are: `private`, `public-read`, `public-read-write`, `aws-exec-read`, `authenticated-read`, `bucket-owner-read`, `bucket-owner-full-control`
         * 
         * @return builder
         * 
         */
        public Builder acl(String acl) {
            return acl(Output.of(acl));
        }

        /**
         * @param bucketName The name of the bucket in which to store the logs
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the bucket in which to store the logs
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param compressionCodec The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(@Nullable Output<String> compressionCodec) {
            $.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * @param compressionCodec The codec used for compression of your logs. Valid values are zstd, snappy, and gzip. If the specified codec is &#34;gzip&#34;, gzip*level will default to 3. To specify a different level, leave compression*codec blank and explicitly set the level using gzip*level. Specifying both compression*codec and gzip_level in the same API request will result in an error.
         * 
         * @return builder
         * 
         */
        public Builder compressionCodec(String compressionCodec) {
            return compressionCodec(Output.of(compressionCodec));
        }

        /**
         * @param domain If you created the S3 bucket outside of `us-east-1`, then specify the corresponding bucket endpoint. Example: `s3-us-west-2.amazonaws.com`
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain If you created the S3 bucket outside of `us-east-1`, then specify the corresponding bucket endpoint. Example: `s3-us-west-2.amazonaws.com`
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param format Apache-style string or VCL variables to use for log formatting.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Apache-style string or VCL variables to use for log formatting.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2).
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(@Nullable Output<Integer> formatVersion) {
            $.formatVersion = formatVersion;
            return this;
        }

        /**
         * @param formatVersion The version of the custom logging format used for the configured endpoint. Can be either 1 or 2. (Default: 2).
         * 
         * @return builder
         * 
         */
        public Builder formatVersion(Integer formatVersion) {
            return formatVersion(Output.of(formatVersion));
        }

        /**
         * @param gzipLevel Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
         * 
         * @return builder
         * 
         */
        public Builder gzipLevel(@Nullable Output<Integer> gzipLevel) {
            $.gzipLevel = gzipLevel;
            return this;
        }

        /**
         * @param gzipLevel Level of Gzip compression from `0-9`. `0` means no compression. `1` is the fastest and the least compressed version, `9` is the slowest and the most compressed version. Default `0`
         * 
         * @return builder
         * 
         */
        public Builder gzipLevel(Integer gzipLevel) {
            return gzipLevel(Output.of(gzipLevel));
        }

        /**
         * @param messageType How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
         * 
         * @return builder
         * 
         */
        public Builder messageType(@Nullable Output<String> messageType) {
            $.messageType = messageType;
            return this;
        }

        /**
         * @param messageType How the message should be formatted. Can be either `classic`, `loggly`, `logplex` or `blank`. Default is `classic`
         * 
         * @return builder
         * 
         */
        public Builder messageType(String messageType) {
            return messageType(Output.of(messageType));
        }

        /**
         * @param name The unique name of the S3 logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the S3 logging endpoint. It is important to note that changing this attribute will delete and recreate the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param path Path to store the files. Must end with a trailing slash. If this field is left empty, the files will be saved in the bucket&#39;s root path
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to store the files. Must end with a trailing slash. If this field is left empty, the files will be saved in the bucket&#39;s root path
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param period How frequently the logs should be transferred, in seconds. Default `3600`
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period How frequently the logs should be transferred, in seconds. Default `3600`
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed.
         * 
         * @return builder
         * 
         */
        public Builder placement(@Nullable Output<String> placement) {
            $.placement = placement;
            return this;
        }

        /**
         * @param placement Where in the generated VCL the logging call should be placed.
         * 
         * @return builder
         * 
         */
        public Builder placement(String placement) {
            return placement(Output.of(placement));
        }

        /**
         * @param publicKey A PGP public key that Fastly will use to encrypt your log files before writing them to disk
         * 
         * @return builder
         * 
         */
        public Builder publicKey(@Nullable Output<String> publicKey) {
            $.publicKey = publicKey;
            return this;
        }

        /**
         * @param publicKey A PGP public key that Fastly will use to encrypt your log files before writing them to disk
         * 
         * @return builder
         * 
         */
        public Builder publicKey(String publicKey) {
            return publicKey(Output.of(publicKey));
        }

        /**
         * @param redundancy The S3 storage class (redundancy level). Should be one of: `standard`, `reduced_redundancy`, `standard_ia`, or `onezone_ia`
         * 
         * @return builder
         * 
         */
        public Builder redundancy(@Nullable Output<String> redundancy) {
            $.redundancy = redundancy;
            return this;
        }

        /**
         * @param redundancy The S3 storage class (redundancy level). Should be one of: `standard`, `reduced_redundancy`, `standard_ia`, or `onezone_ia`
         * 
         * @return builder
         * 
         */
        public Builder redundancy(String redundancy) {
            return redundancy(Output.of(redundancy));
        }

        /**
         * @param responseCondition Name of blockAttributes condition to apply this logging.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(@Nullable Output<String> responseCondition) {
            $.responseCondition = responseCondition;
            return this;
        }

        /**
         * @param responseCondition Name of blockAttributes condition to apply this logging.
         * 
         * @return builder
         * 
         */
        public Builder responseCondition(String responseCondition) {
            return responseCondition(Output.of(responseCondition));
        }

        /**
         * @param s3AccessKey AWS Access Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This key will be not be encrypted. Not required if `iam_role` is provided. You can provide this key via an environment variable, `FASTLY_S3_ACCESS_KEY`
         * 
         * @return builder
         * 
         */
        public Builder s3AccessKey(@Nullable Output<String> s3AccessKey) {
            $.s3AccessKey = s3AccessKey;
            return this;
        }

        /**
         * @param s3AccessKey AWS Access Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This key will be not be encrypted. Not required if `iam_role` is provided. You can provide this key via an environment variable, `FASTLY_S3_ACCESS_KEY`
         * 
         * @return builder
         * 
         */
        public Builder s3AccessKey(String s3AccessKey) {
            return s3AccessKey(Output.of(s3AccessKey));
        }

        /**
         * @param s3IamRole The Amazon Resource Name (ARN) for the IAM role granting Fastly access to S3. Not required if `access_key` and `secret_key` are provided. You can provide this value via an environment variable, `FASTLY_S3_IAM_ROLE`
         * 
         * @return builder
         * 
         */
        public Builder s3IamRole(@Nullable Output<String> s3IamRole) {
            $.s3IamRole = s3IamRole;
            return this;
        }

        /**
         * @param s3IamRole The Amazon Resource Name (ARN) for the IAM role granting Fastly access to S3. Not required if `access_key` and `secret_key` are provided. You can provide this value via an environment variable, `FASTLY_S3_IAM_ROLE`
         * 
         * @return builder
         * 
         */
        public Builder s3IamRole(String s3IamRole) {
            return s3IamRole(Output.of(s3IamRole));
        }

        /**
         * @param s3SecretKey AWS Secret Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This secret will be not be encrypted. Not required if `iam_role` is provided. You can provide this secret via an environment variable, `FASTLY_S3_SECRET_KEY`
         * 
         * @return builder
         * 
         */
        public Builder s3SecretKey(@Nullable Output<String> s3SecretKey) {
            $.s3SecretKey = s3SecretKey;
            return this;
        }

        /**
         * @param s3SecretKey AWS Secret Key of an account with the required permissions to post logs. It is **strongly** recommended you create a separate IAM user with permissions to only operate on this Bucket. This secret will be not be encrypted. Not required if `iam_role` is provided. You can provide this secret via an environment variable, `FASTLY_S3_SECRET_KEY`
         * 
         * @return builder
         * 
         */
        public Builder s3SecretKey(String s3SecretKey) {
            return s3SecretKey(Output.of(s3SecretKey));
        }

        /**
         * @param serverSideEncryption Specify what type of server side encryption should be used. Can be either `AES256` or `aws:kms`
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(@Nullable Output<String> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * @param serverSideEncryption Specify what type of server side encryption should be used. Can be either `AES256` or `aws:kms`
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(String serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        /**
         * @param serverSideEncryptionKmsKeyId Optional server-side KMS Key Id. Must be set if server*side*encryption is set to `aws:kms`
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionKmsKeyId(@Nullable Output<String> serverSideEncryptionKmsKeyId) {
            $.serverSideEncryptionKmsKeyId = serverSideEncryptionKmsKeyId;
            return this;
        }

        /**
         * @param serverSideEncryptionKmsKeyId Optional server-side KMS Key Id. Must be set if server*side*encryption is set to `aws:kms`
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryptionKmsKeyId(String serverSideEncryptionKmsKeyId) {
            return serverSideEncryptionKmsKeyId(Output.of(serverSideEncryptionKmsKeyId));
        }

        /**
         * @param timestampFormat The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(@Nullable Output<String> timestampFormat) {
            $.timestampFormat = timestampFormat;
            return this;
        }

        /**
         * @param timestampFormat The `strftime` specified timestamp formatting (default `%Y-%m-%dT%H:%M:%S.000`)
         * 
         * @return builder
         * 
         */
        public Builder timestampFormat(String timestampFormat) {
            return timestampFormat(Output.of(timestampFormat));
        }

        public ServiceVclLoggingS3Args build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}