// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Inputs
{

    public sealed class Servicev1BigqueryloggingArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of your BigQuery dataset.
        /// </summary>
        [Input("dataset", required: true)]
        public Input<string> Dataset { get; set; } = null!;

        /// <summary>
        /// The email for the service account with write access to your BigQuery dataset. If not provided, this will be pulled from a `FASTLY_BQ_EMAIL` environment variable.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// Apache-style string or VCL variables to use for log formatting.
        /// </summary>
        [Input("format")]
        public Input<string>? Format { get; set; }

        /// <summary>
        /// A unique name to identify this dictionary.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Where in the generated VCL the logging call should be placed.
        /// </summary>
        [Input("placement")]
        public Input<string>? Placement { get; set; }

        /// <summary>
        /// The ID of your GCP project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// The name of the `condition` to apply. If empty, always execute.
        /// </summary>
        [Input("responseCondition")]
        public Input<string>? ResponseCondition { get; set; }

        /// <summary>
        /// The secret key associated with the sservice account that has write access to your BigQuery table. If not provided, this will be pulled from the `FASTLY_BQ_SECRET_KEY` environment variable. Typical format for this is a private key in a string with newlines.
        /// </summary>
        [Input("secretKey")]
        public Input<string>? SecretKey { get; set; }

        /// <summary>
        /// The ID of your BigQuery table.
        /// </summary>
        [Input("table", required: true)]
        public Input<string> Table { get; set; } = null!;

        /// <summary>
        /// Big query table name suffix template. If set will be interpreted as a strftime compatible string and used as the [Template Suffix for your table](https://cloud.google.com/bigquery/streaming-data-into-bigquery#template-tables).
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        public Servicev1BigqueryloggingArgs()
        {
        }
    }
}