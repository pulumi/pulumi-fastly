# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

apiKey: Optional[str]
"""
Fastly API Key from https://app.fastly.com/#account
"""

baseUrl: Optional[str]
"""
Fastly API URL
"""

forceHttp2: Optional[bool]
"""
Set this to `true` to disable HTTP/1.x fallback mechanism that the underlying Go library will attempt upon connection to
`api.fastly.com:443` by default. This may slightly improve the provider's performance and reduce unnecessary TLS
handshakes. Default: `false`
"""

noAuth: Optional[bool]
"""
Set this to `true` if you only need data source that does not require authentication such as `fastly_ip_ranges`
"""
