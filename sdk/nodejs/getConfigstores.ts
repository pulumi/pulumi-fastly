// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getConfigstores(opts?: pulumi.InvokeOptions): Promise<GetConfigstoresResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("fastly:index/getConfigstores:getConfigstores", {
    }, opts);
}

/**
 * A collection of values returned by getConfigstores.
 */
export interface GetConfigstoresResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * List of all Config Stores.
     */
    readonly stores: outputs.GetConfigstoresStore[];
}