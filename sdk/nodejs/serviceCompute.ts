// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Fastly Compute@Edge service. Compute@Edge is a computation platform capable of running custom binaries that you compile on your own systems and upload to Fastly. Security and portability is provided by compiling your code to [WebAssembly](https://webassembly.org/), which is ran at the edge using [Lucet](https://github.com/bytecodealliance/lucet), an open-source WebAssembly runtime created by Fastly. A compute service encompasses Domains and Backends.
 *
 * The Service resource requires a domain name that is correctly set up to direct
 * traffic to the Fastly service. See Fastly's guide on [Adding CNAME Records][fastly-cname]
 * on their documentation site for guidance.
 */
export class ServiceCompute extends pulumi.CustomResource {
    /**
     * Get an existing ServiceCompute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceComputeState, opts?: pulumi.CustomResourceOptions): ServiceCompute {
        return new ServiceCompute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'fastly:index/serviceCompute:ServiceCompute';

    /**
     * Returns true if the given object is an instance of ServiceCompute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceCompute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceCompute.__pulumiType;
    }

    /**
     * Conditionally prevents the Service from being activated. The apply step will continue to create a new draft version but will not activate it if this is set to false. Default true.
     */
    public readonly activate!: pulumi.Output<boolean | undefined>;
    /**
     * The currently active version of your Fastly Service.
     */
    public /*out*/ readonly activeVersion!: pulumi.Output<number>;
    /**
     * A set of Backends to service requests from your Domains.
     * Defined below. Backends must be defined in this argument, or defined in the
     * `vcl` argument below
     */
    public readonly backends!: pulumi.Output<outputs.ServiceComputeBackend[] | undefined>;
    /**
     * A BigQuery endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly bigqueryloggings!: pulumi.Output<outputs.ServiceComputeBigquerylogging[] | undefined>;
    /**
     * An Azure Blob Storage endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly blobstorageloggings!: pulumi.Output<outputs.ServiceComputeBlobstoragelogging[] | undefined>;
    public /*out*/ readonly clonedVersion!: pulumi.Output<number>;
    /**
     * An optional comment about the Domain.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The domain of the DigitalOcean Spaces endpoint (default "nyc3.digitaloceanspaces.com").
     */
    public readonly domains!: pulumi.Output<outputs.ServiceComputeDomain[]>;
    /**
     * Services that are active cannot be destroyed. In
     * order to destroy the Service, set `forceDestroy` to `true`. Default `false`.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * A gcs endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly gcsloggings!: pulumi.Output<outputs.ServiceComputeGcslogging[] | undefined>;
    /**
     * Name of a defined `healthcheck` to assign to this backend.
     */
    public readonly healthchecks!: pulumi.Output<outputs.ServiceComputeHealthcheck[] | undefined>;
    /**
     * An HTTPS endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly httpsloggings!: pulumi.Output<outputs.ServiceComputeHttpslogging[] | undefined>;
    /**
     * A logentries endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly logentries!: pulumi.Output<outputs.ServiceComputeLogentry[] | undefined>;
    /**
     * A Rackspace Cloud Files endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingCloudfiles!: pulumi.Output<outputs.ServiceComputeLoggingCloudfile[] | undefined>;
    /**
     * A Datadog endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingDatadogs!: pulumi.Output<outputs.ServiceComputeLoggingDatadog[] | undefined>;
    /**
     * A DigitalOcean Spaces endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingDigitaloceans!: pulumi.Output<outputs.ServiceComputeLoggingDigitalocean[] | undefined>;
    /**
     * An Elasticsearch endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingElasticsearches!: pulumi.Output<outputs.ServiceComputeLoggingElasticsearch[] | undefined>;
    /**
     * An FTP endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingFtps!: pulumi.Output<outputs.ServiceComputeLoggingFtp[] | undefined>;
    /**
     * A Google Cloud Pub/Sub endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingGooglepubsubs!: pulumi.Output<outputs.ServiceComputeLoggingGooglepubsub[] | undefined>;
    /**
     * A Heroku endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingHeroku!: pulumi.Output<outputs.ServiceComputeLoggingHeroku[] | undefined>;
    /**
     * A Honeycomb endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingHoneycombs!: pulumi.Output<outputs.ServiceComputeLoggingHoneycomb[] | undefined>;
    /**
     * A Kafka endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingKafkas!: pulumi.Output<outputs.ServiceComputeLoggingKafka[] | undefined>;
    /**
     * A Loggly endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingLogglies!: pulumi.Output<outputs.ServiceComputeLoggingLoggly[] | undefined>;
    /**
     * A Log Shuttle endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingLogshuttles!: pulumi.Output<outputs.ServiceComputeLoggingLogshuttle[] | undefined>;
    /**
     * A New Relic endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingNewrelics!: pulumi.Output<outputs.ServiceComputeLoggingNewrelic[] | undefined>;
    /**
     * An OpenStack endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingOpenstacks!: pulumi.Output<outputs.ServiceComputeLoggingOpenstack[] | undefined>;
    /**
     * A Scalyr endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingScalyrs!: pulumi.Output<outputs.ServiceComputeLoggingScalyr[] | undefined>;
    /**
     * An SFTP endpoint to send streaming logs to.
     * Defined below.
     */
    public readonly loggingSftps!: pulumi.Output<outputs.ServiceComputeLoggingSftp[] | undefined>;
    /**
     * The unique name of the Rackspace Cloud Files logging endpoint.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A Wasm deployment package to upload. Defined below.
     */
    public readonly package!: pulumi.Output<outputs.ServiceComputePackage>;
    /**
     * A Papertrail endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly papertrails!: pulumi.Output<outputs.ServiceComputePapertrail[] | undefined>;
    /**
     * A set of S3 Buckets to send streaming logs too.
     * Defined below.
     */
    public readonly s3loggings!: pulumi.Output<outputs.ServiceComputeS3logging[] | undefined>;
    /**
     * A Splunk endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly splunks!: pulumi.Output<outputs.ServiceComputeSplunk[] | undefined>;
    /**
     * A Sumologic endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly sumologics!: pulumi.Output<outputs.ServiceComputeSumologic[] | undefined>;
    /**
     * A syslog endpoint to send streaming logs too.
     * Defined below.
     */
    public readonly syslogs!: pulumi.Output<outputs.ServiceComputeSyslog[] | undefined>;
    /**
     * Description field for the version.
     */
    public readonly versionComment!: pulumi.Output<string | undefined>;

    /**
     * Create a ServiceCompute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceComputeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceComputeArgs | ServiceComputeState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ServiceComputeState | undefined;
            inputs["activate"] = state ? state.activate : undefined;
            inputs["activeVersion"] = state ? state.activeVersion : undefined;
            inputs["backends"] = state ? state.backends : undefined;
            inputs["bigqueryloggings"] = state ? state.bigqueryloggings : undefined;
            inputs["blobstorageloggings"] = state ? state.blobstorageloggings : undefined;
            inputs["clonedVersion"] = state ? state.clonedVersion : undefined;
            inputs["comment"] = state ? state.comment : undefined;
            inputs["domains"] = state ? state.domains : undefined;
            inputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            inputs["gcsloggings"] = state ? state.gcsloggings : undefined;
            inputs["healthchecks"] = state ? state.healthchecks : undefined;
            inputs["httpsloggings"] = state ? state.httpsloggings : undefined;
            inputs["logentries"] = state ? state.logentries : undefined;
            inputs["loggingCloudfiles"] = state ? state.loggingCloudfiles : undefined;
            inputs["loggingDatadogs"] = state ? state.loggingDatadogs : undefined;
            inputs["loggingDigitaloceans"] = state ? state.loggingDigitaloceans : undefined;
            inputs["loggingElasticsearches"] = state ? state.loggingElasticsearches : undefined;
            inputs["loggingFtps"] = state ? state.loggingFtps : undefined;
            inputs["loggingGooglepubsubs"] = state ? state.loggingGooglepubsubs : undefined;
            inputs["loggingHeroku"] = state ? state.loggingHeroku : undefined;
            inputs["loggingHoneycombs"] = state ? state.loggingHoneycombs : undefined;
            inputs["loggingKafkas"] = state ? state.loggingKafkas : undefined;
            inputs["loggingLogglies"] = state ? state.loggingLogglies : undefined;
            inputs["loggingLogshuttles"] = state ? state.loggingLogshuttles : undefined;
            inputs["loggingNewrelics"] = state ? state.loggingNewrelics : undefined;
            inputs["loggingOpenstacks"] = state ? state.loggingOpenstacks : undefined;
            inputs["loggingScalyrs"] = state ? state.loggingScalyrs : undefined;
            inputs["loggingSftps"] = state ? state.loggingSftps : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["package"] = state ? state.package : undefined;
            inputs["papertrails"] = state ? state.papertrails : undefined;
            inputs["s3loggings"] = state ? state.s3loggings : undefined;
            inputs["splunks"] = state ? state.splunks : undefined;
            inputs["sumologics"] = state ? state.sumologics : undefined;
            inputs["syslogs"] = state ? state.syslogs : undefined;
            inputs["versionComment"] = state ? state.versionComment : undefined;
        } else {
            const args = argsOrState as ServiceComputeArgs | undefined;
            if (!args || args.domains === undefined) {
                throw new Error("Missing required property 'domains'");
            }
            if (!args || args.package === undefined) {
                throw new Error("Missing required property 'package'");
            }
            inputs["activate"] = args ? args.activate : undefined;
            inputs["backends"] = args ? args.backends : undefined;
            inputs["bigqueryloggings"] = args ? args.bigqueryloggings : undefined;
            inputs["blobstorageloggings"] = args ? args.blobstorageloggings : undefined;
            inputs["comment"] = args ? args.comment : undefined;
            inputs["domains"] = args ? args.domains : undefined;
            inputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            inputs["gcsloggings"] = args ? args.gcsloggings : undefined;
            inputs["healthchecks"] = args ? args.healthchecks : undefined;
            inputs["httpsloggings"] = args ? args.httpsloggings : undefined;
            inputs["logentries"] = args ? args.logentries : undefined;
            inputs["loggingCloudfiles"] = args ? args.loggingCloudfiles : undefined;
            inputs["loggingDatadogs"] = args ? args.loggingDatadogs : undefined;
            inputs["loggingDigitaloceans"] = args ? args.loggingDigitaloceans : undefined;
            inputs["loggingElasticsearches"] = args ? args.loggingElasticsearches : undefined;
            inputs["loggingFtps"] = args ? args.loggingFtps : undefined;
            inputs["loggingGooglepubsubs"] = args ? args.loggingGooglepubsubs : undefined;
            inputs["loggingHeroku"] = args ? args.loggingHeroku : undefined;
            inputs["loggingHoneycombs"] = args ? args.loggingHoneycombs : undefined;
            inputs["loggingKafkas"] = args ? args.loggingKafkas : undefined;
            inputs["loggingLogglies"] = args ? args.loggingLogglies : undefined;
            inputs["loggingLogshuttles"] = args ? args.loggingLogshuttles : undefined;
            inputs["loggingNewrelics"] = args ? args.loggingNewrelics : undefined;
            inputs["loggingOpenstacks"] = args ? args.loggingOpenstacks : undefined;
            inputs["loggingScalyrs"] = args ? args.loggingScalyrs : undefined;
            inputs["loggingSftps"] = args ? args.loggingSftps : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["package"] = args ? args.package : undefined;
            inputs["papertrails"] = args ? args.papertrails : undefined;
            inputs["s3loggings"] = args ? args.s3loggings : undefined;
            inputs["splunks"] = args ? args.splunks : undefined;
            inputs["sumologics"] = args ? args.sumologics : undefined;
            inputs["syslogs"] = args ? args.syslogs : undefined;
            inputs["versionComment"] = args ? args.versionComment : undefined;
            inputs["activeVersion"] = undefined /*out*/;
            inputs["clonedVersion"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ServiceCompute.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceCompute resources.
 */
export interface ServiceComputeState {
    /**
     * Conditionally prevents the Service from being activated. The apply step will continue to create a new draft version but will not activate it if this is set to false. Default true.
     */
    readonly activate?: pulumi.Input<boolean>;
    /**
     * The currently active version of your Fastly Service.
     */
    readonly activeVersion?: pulumi.Input<number>;
    /**
     * A set of Backends to service requests from your Domains.
     * Defined below. Backends must be defined in this argument, or defined in the
     * `vcl` argument below
     */
    readonly backends?: pulumi.Input<pulumi.Input<inputs.ServiceComputeBackend>[]>;
    /**
     * A BigQuery endpoint to send streaming logs too.
     * Defined below.
     */
    readonly bigqueryloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeBigquerylogging>[]>;
    /**
     * An Azure Blob Storage endpoint to send streaming logs too.
     * Defined below.
     */
    readonly blobstorageloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeBlobstoragelogging>[]>;
    readonly clonedVersion?: pulumi.Input<number>;
    /**
     * An optional comment about the Domain.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * The domain of the DigitalOcean Spaces endpoint (default "nyc3.digitaloceanspaces.com").
     */
    readonly domains?: pulumi.Input<pulumi.Input<inputs.ServiceComputeDomain>[]>;
    /**
     * Services that are active cannot be destroyed. In
     * order to destroy the Service, set `forceDestroy` to `true`. Default `false`.
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * A gcs endpoint to send streaming logs too.
     * Defined below.
     */
    readonly gcsloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeGcslogging>[]>;
    /**
     * Name of a defined `healthcheck` to assign to this backend.
     */
    readonly healthchecks?: pulumi.Input<pulumi.Input<inputs.ServiceComputeHealthcheck>[]>;
    /**
     * An HTTPS endpoint to send streaming logs to.
     * Defined below.
     */
    readonly httpsloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeHttpslogging>[]>;
    /**
     * A logentries endpoint to send streaming logs too.
     * Defined below.
     */
    readonly logentries?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLogentry>[]>;
    /**
     * A Rackspace Cloud Files endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingCloudfiles?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingCloudfile>[]>;
    /**
     * A Datadog endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingDatadogs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingDatadog>[]>;
    /**
     * A DigitalOcean Spaces endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingDigitaloceans?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingDigitalocean>[]>;
    /**
     * An Elasticsearch endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingElasticsearches?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingElasticsearch>[]>;
    /**
     * An FTP endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingFtps?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingFtp>[]>;
    /**
     * A Google Cloud Pub/Sub endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingGooglepubsubs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingGooglepubsub>[]>;
    /**
     * A Heroku endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingHeroku?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingHeroku>[]>;
    /**
     * A Honeycomb endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingHoneycombs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingHoneycomb>[]>;
    /**
     * A Kafka endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingKafkas?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingKafka>[]>;
    /**
     * A Loggly endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingLogglies?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingLoggly>[]>;
    /**
     * A Log Shuttle endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingLogshuttles?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingLogshuttle>[]>;
    /**
     * A New Relic endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingNewrelics?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingNewrelic>[]>;
    /**
     * An OpenStack endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingOpenstacks?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingOpenstack>[]>;
    /**
     * A Scalyr endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingScalyrs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingScalyr>[]>;
    /**
     * An SFTP endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingSftps?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingSftp>[]>;
    /**
     * The unique name of the Rackspace Cloud Files logging endpoint.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A Wasm deployment package to upload. Defined below.
     */
    readonly package?: pulumi.Input<inputs.ServiceComputePackage>;
    /**
     * A Papertrail endpoint to send streaming logs too.
     * Defined below.
     */
    readonly papertrails?: pulumi.Input<pulumi.Input<inputs.ServiceComputePapertrail>[]>;
    /**
     * A set of S3 Buckets to send streaming logs too.
     * Defined below.
     */
    readonly s3loggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeS3logging>[]>;
    /**
     * A Splunk endpoint to send streaming logs too.
     * Defined below.
     */
    readonly splunks?: pulumi.Input<pulumi.Input<inputs.ServiceComputeSplunk>[]>;
    /**
     * A Sumologic endpoint to send streaming logs too.
     * Defined below.
     */
    readonly sumologics?: pulumi.Input<pulumi.Input<inputs.ServiceComputeSumologic>[]>;
    /**
     * A syslog endpoint to send streaming logs too.
     * Defined below.
     */
    readonly syslogs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeSyslog>[]>;
    /**
     * Description field for the version.
     */
    readonly versionComment?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceCompute resource.
 */
export interface ServiceComputeArgs {
    /**
     * Conditionally prevents the Service from being activated. The apply step will continue to create a new draft version but will not activate it if this is set to false. Default true.
     */
    readonly activate?: pulumi.Input<boolean>;
    /**
     * A set of Backends to service requests from your Domains.
     * Defined below. Backends must be defined in this argument, or defined in the
     * `vcl` argument below
     */
    readonly backends?: pulumi.Input<pulumi.Input<inputs.ServiceComputeBackend>[]>;
    /**
     * A BigQuery endpoint to send streaming logs too.
     * Defined below.
     */
    readonly bigqueryloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeBigquerylogging>[]>;
    /**
     * An Azure Blob Storage endpoint to send streaming logs too.
     * Defined below.
     */
    readonly blobstorageloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeBlobstoragelogging>[]>;
    /**
     * An optional comment about the Domain.
     */
    readonly comment?: pulumi.Input<string>;
    /**
     * The domain of the DigitalOcean Spaces endpoint (default "nyc3.digitaloceanspaces.com").
     */
    readonly domains: pulumi.Input<pulumi.Input<inputs.ServiceComputeDomain>[]>;
    /**
     * Services that are active cannot be destroyed. In
     * order to destroy the Service, set `forceDestroy` to `true`. Default `false`.
     */
    readonly forceDestroy?: pulumi.Input<boolean>;
    /**
     * A gcs endpoint to send streaming logs too.
     * Defined below.
     */
    readonly gcsloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeGcslogging>[]>;
    /**
     * Name of a defined `healthcheck` to assign to this backend.
     */
    readonly healthchecks?: pulumi.Input<pulumi.Input<inputs.ServiceComputeHealthcheck>[]>;
    /**
     * An HTTPS endpoint to send streaming logs to.
     * Defined below.
     */
    readonly httpsloggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeHttpslogging>[]>;
    /**
     * A logentries endpoint to send streaming logs too.
     * Defined below.
     */
    readonly logentries?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLogentry>[]>;
    /**
     * A Rackspace Cloud Files endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingCloudfiles?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingCloudfile>[]>;
    /**
     * A Datadog endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingDatadogs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingDatadog>[]>;
    /**
     * A DigitalOcean Spaces endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingDigitaloceans?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingDigitalocean>[]>;
    /**
     * An Elasticsearch endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingElasticsearches?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingElasticsearch>[]>;
    /**
     * An FTP endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingFtps?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingFtp>[]>;
    /**
     * A Google Cloud Pub/Sub endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingGooglepubsubs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingGooglepubsub>[]>;
    /**
     * A Heroku endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingHeroku?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingHeroku>[]>;
    /**
     * A Honeycomb endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingHoneycombs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingHoneycomb>[]>;
    /**
     * A Kafka endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingKafkas?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingKafka>[]>;
    /**
     * A Loggly endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingLogglies?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingLoggly>[]>;
    /**
     * A Log Shuttle endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingLogshuttles?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingLogshuttle>[]>;
    /**
     * A New Relic endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingNewrelics?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingNewrelic>[]>;
    /**
     * An OpenStack endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingOpenstacks?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingOpenstack>[]>;
    /**
     * A Scalyr endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingScalyrs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingScalyr>[]>;
    /**
     * An SFTP endpoint to send streaming logs to.
     * Defined below.
     */
    readonly loggingSftps?: pulumi.Input<pulumi.Input<inputs.ServiceComputeLoggingSftp>[]>;
    /**
     * The unique name of the Rackspace Cloud Files logging endpoint.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A Wasm deployment package to upload. Defined below.
     */
    readonly package: pulumi.Input<inputs.ServiceComputePackage>;
    /**
     * A Papertrail endpoint to send streaming logs too.
     * Defined below.
     */
    readonly papertrails?: pulumi.Input<pulumi.Input<inputs.ServiceComputePapertrail>[]>;
    /**
     * A set of S3 Buckets to send streaming logs too.
     * Defined below.
     */
    readonly s3loggings?: pulumi.Input<pulumi.Input<inputs.ServiceComputeS3logging>[]>;
    /**
     * A Splunk endpoint to send streaming logs too.
     * Defined below.
     */
    readonly splunks?: pulumi.Input<pulumi.Input<inputs.ServiceComputeSplunk>[]>;
    /**
     * A Sumologic endpoint to send streaming logs too.
     * Defined below.
     */
    readonly sumologics?: pulumi.Input<pulumi.Input<inputs.ServiceComputeSumologic>[]>;
    /**
     * A syslog endpoint to send streaming logs too.
     * Defined below.
     */
    readonly syslogs?: pulumi.Input<pulumi.Input<inputs.ServiceComputeSyslog>[]>;
    /**
     * Description field for the version.
     */
    readonly versionComment?: pulumi.Input<string>;
}