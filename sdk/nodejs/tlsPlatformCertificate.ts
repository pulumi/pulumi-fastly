// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Uploads a TLS certificate to the Fastly Platform TLS service.
 *
 * > Each TLS certificate **must** have its corresponding private key uploaded _prior_ to uploading the certificate. This
 * can be achieved in Pulumi using `dependsOn`
 *
 * ## Example Usage
 *
 * Basic usage with self-signed CA:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fastly from "@pulumi/fastly";
 * import * as tls from "@pulumi/tls";
 *
 * const caKey = new tls.index.PrivateKey("ca_key", {algorithm: "RSA"});
 * const key = new tls.index.PrivateKey("key", {algorithm: "RSA"});
 * const ca = new tls.index.SelfSignedCert("ca", {
 *     keyAlgorithm: caKey.algorithm,
 *     privateKeyPem: caKey.privateKeyPem,
 *     subject: [{
 *         commonName: "Example CA",
 *     }],
 *     isCaCertificate: true,
 *     validityPeriodHours: 360,
 *     allowedUses: [
 *         "cert_signing",
 *         "server_auth",
 *     ],
 * });
 * const example = new tls.index.CertRequest("example", {
 *     keyAlgorithm: key.algorithm,
 *     privateKeyPem: key.privateKeyPem,
 *     subject: [{
 *         commonName: "example.com",
 *     }],
 *     dnsNames: [
 *         "example.com",
 *         "www.example.com",
 *     ],
 * });
 * const cert = new tls.index.LocallySignedCert("cert", {
 *     certRequestPem: example.certRequestPem,
 *     caKeyAlgorithm: caKey.algorithm,
 *     caPrivateKeyPem: caKey.privateKeyPem,
 *     caCertPem: ca.certPem,
 *     validityPeriodHours: 360,
 *     allowedUses: [
 *         "cert_signing",
 *         "server_auth",
 *     ],
 * });
 * const config = fastly.getTlsConfiguration({
 *     tlsService: "PLATFORM",
 * });
 * const keyTlsPrivateKey = new fastly.TlsPrivateKey("key", {
 *     keyPem: key.privateKeyPem,
 *     name: "tf-demo",
 * });
 * const certTlsPlatformCertificate = new fastly.TlsPlatformCertificate("cert", {
 *     certificateBody: cert.certPem,
 *     intermediatesBlob: ca.certPem,
 *     configurationId: config.then(config => config.id),
 *     allowUntrustedRoot: true,
 * }, {
 *     dependsOn: [keyTlsPrivateKey],
 * });
 * ```
 *
 * ## Import
 *
 * A certificate can be imported using its Fastly certificate ID, e.g.
 *
 * ```sh
 * $ pulumi import fastly:index/tlsPlatformCertificate:TlsPlatformCertificate demo xxxxxxxxxxx
 * ```
 */
export class TlsPlatformCertificate extends pulumi.CustomResource {
    /**
     * Get an existing TlsPlatformCertificate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TlsPlatformCertificateState, opts?: pulumi.CustomResourceOptions): TlsPlatformCertificate {
        return new TlsPlatformCertificate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'fastly:index/tlsPlatformCertificate:TlsPlatformCertificate';

    /**
     * Returns true if the given object is an instance of TlsPlatformCertificate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TlsPlatformCertificate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TlsPlatformCertificate.__pulumiType;
    }

    /**
     * Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     */
    public readonly allowUntrustedRoot!: pulumi.Output<boolean | undefined>;
    /**
     * PEM-formatted certificate.
     */
    public readonly certificateBody!: pulumi.Output<string>;
    /**
     * ID of TLS configuration to be used to terminate TLS traffic.
     */
    public readonly configurationId!: pulumi.Output<string>;
    /**
     * Timestamp (GMT) when the certificate was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
     */
    public /*out*/ readonly domains!: pulumi.Output<string[]>;
    /**
     * PEM-formatted certificate chain from the `certificateBody` to its root.
     */
    public readonly intermediatesBlob!: pulumi.Output<string>;
    /**
     * Timestamp (GMT) when the certificate will expire.
     */
    public /*out*/ readonly notAfter!: pulumi.Output<string>;
    /**
     * Timestamp (GMT) when the certificate will become valid.
     */
    public /*out*/ readonly notBefore!: pulumi.Output<string>;
    /**
     * A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     */
    public /*out*/ readonly replace!: pulumi.Output<boolean>;
    /**
     * Timestamp (GMT) when the certificate was last updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a TlsPlatformCertificate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TlsPlatformCertificateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TlsPlatformCertificateArgs | TlsPlatformCertificateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TlsPlatformCertificateState | undefined;
            resourceInputs["allowUntrustedRoot"] = state ? state.allowUntrustedRoot : undefined;
            resourceInputs["certificateBody"] = state ? state.certificateBody : undefined;
            resourceInputs["configurationId"] = state ? state.configurationId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["domains"] = state ? state.domains : undefined;
            resourceInputs["intermediatesBlob"] = state ? state.intermediatesBlob : undefined;
            resourceInputs["notAfter"] = state ? state.notAfter : undefined;
            resourceInputs["notBefore"] = state ? state.notBefore : undefined;
            resourceInputs["replace"] = state ? state.replace : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as TlsPlatformCertificateArgs | undefined;
            if ((!args || args.certificateBody === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateBody'");
            }
            if ((!args || args.configurationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'configurationId'");
            }
            if ((!args || args.intermediatesBlob === undefined) && !opts.urn) {
                throw new Error("Missing required property 'intermediatesBlob'");
            }
            resourceInputs["allowUntrustedRoot"] = args ? args.allowUntrustedRoot : undefined;
            resourceInputs["certificateBody"] = args ? args.certificateBody : undefined;
            resourceInputs["configurationId"] = args ? args.configurationId : undefined;
            resourceInputs["intermediatesBlob"] = args ? args.intermediatesBlob : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["domains"] = undefined /*out*/;
            resourceInputs["notAfter"] = undefined /*out*/;
            resourceInputs["notBefore"] = undefined /*out*/;
            resourceInputs["replace"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TlsPlatformCertificate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TlsPlatformCertificate resources.
 */
export interface TlsPlatformCertificateState {
    /**
     * Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     */
    allowUntrustedRoot?: pulumi.Input<boolean>;
    /**
     * PEM-formatted certificate.
     */
    certificateBody?: pulumi.Input<string>;
    /**
     * ID of TLS configuration to be used to terminate TLS traffic.
     */
    configurationId?: pulumi.Input<string>;
    /**
     * Timestamp (GMT) when the certificate was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * All the domains (including wildcard domains) that are listed in any certificate's Subject Alternative Names (SAN) list.
     */
    domains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * PEM-formatted certificate chain from the `certificateBody` to its root.
     */
    intermediatesBlob?: pulumi.Input<string>;
    /**
     * Timestamp (GMT) when the certificate will expire.
     */
    notAfter?: pulumi.Input<string>;
    /**
     * Timestamp (GMT) when the certificate will become valid.
     */
    notBefore?: pulumi.Input<string>;
    /**
     * A recommendation from Fastly indicating the key associated with this certificate is in need of rotation.
     */
    replace?: pulumi.Input<boolean>;
    /**
     * Timestamp (GMT) when the certificate was last updated.
     */
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TlsPlatformCertificate resource.
 */
export interface TlsPlatformCertificateArgs {
    /**
     * Disable checking whether the root of the certificate chain is trusted. Useful for development purposes to allow use of self-signed CAs. Defaults to false. Write-only on create.
     */
    allowUntrustedRoot?: pulumi.Input<boolean>;
    /**
     * PEM-formatted certificate.
     */
    certificateBody: pulumi.Input<string>;
    /**
     * ID of TLS configuration to be used to terminate TLS traffic.
     */
    configurationId: pulumi.Input<string>;
    /**
     * PEM-formatted certificate chain from the `certificateBody` to its root.
     */
    intermediatesBlob: pulumi.Input<string>;
}
