# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'api_key',
    'base_url',
]

__config__ = pulumi.Config('fastly')

api_key = __config__.get('apiKey')
"""
Fastly API Key from https://app.fastly.com/#account
"""

base_url = __config__.get('baseUrl')
"""
Fastly API URL
"""

