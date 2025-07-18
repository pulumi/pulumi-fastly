// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Fastly.Outputs
{

    [OutputType]
    public sealed class CustomDashboardDashboardItemDataSource
    {
        /// <summary>
        /// Configuration options for the selected data source.
        /// </summary>
        public readonly Outputs.CustomDashboardDashboardItemDataSourceConfig Config;
        /// <summary>
        /// The source of the data to display. One of: `stats.edge`, `stats.domain`, `stats.origin`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private CustomDashboardDashboardItemDataSource(
            Outputs.CustomDashboardDashboardItemDataSourceConfig config,

            string type)
        {
            Config = config;
            Type = type;
        }
    }
}
