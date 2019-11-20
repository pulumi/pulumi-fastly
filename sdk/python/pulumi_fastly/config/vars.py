# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

__config__ = pulumi.Config('fastly')

api_key = __config__.get('apiKey') or utilities.get_env('FASTLY_API_KEY')
"""
Fastly API Key from https://app.fastly.com/#account
"""

base_url = __config__.get('baseUrl') or (utilities.get_env('FASTLY_API_URL') or 'https://api.fastly.com')
"""
Fastly API URL
"""
