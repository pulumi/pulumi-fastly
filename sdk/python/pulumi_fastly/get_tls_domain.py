# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetTlsDomainResult',
    'AwaitableGetTlsDomainResult',
    'get_tls_domain',
]

@pulumi.output_type
class GetTlsDomainResult:
    """
    A collection of values returned by getTlsDomain.
    """
    def __init__(__self__, domain=None, id=None, tls_activation_ids=None, tls_certificate_ids=None, tls_subscription_ids=None):
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if tls_activation_ids and not isinstance(tls_activation_ids, list):
            raise TypeError("Expected argument 'tls_activation_ids' to be a list")
        pulumi.set(__self__, "tls_activation_ids", tls_activation_ids)
        if tls_certificate_ids and not isinstance(tls_certificate_ids, list):
            raise TypeError("Expected argument 'tls_certificate_ids' to be a list")
        pulumi.set(__self__, "tls_certificate_ids", tls_certificate_ids)
        if tls_subscription_ids and not isinstance(tls_subscription_ids, list):
            raise TypeError("Expected argument 'tls_subscription_ids' to be a list")
        pulumi.set(__self__, "tls_subscription_ids", tls_subscription_ids)

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        Domain name to look up activations, certificates and subscriptions for.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="tlsActivationIds")
    def tls_activation_ids(self) -> Sequence[str]:
        """
        IDs of the activations associated with the domain.
        """
        return pulumi.get(self, "tls_activation_ids")

    @property
    @pulumi.getter(name="tlsCertificateIds")
    def tls_certificate_ids(self) -> Sequence[str]:
        """
        IDs of the certificates associated with the domain.
        """
        return pulumi.get(self, "tls_certificate_ids")

    @property
    @pulumi.getter(name="tlsSubscriptionIds")
    def tls_subscription_ids(self) -> Sequence[str]:
        """
        IDs of the subscriptions associated with the domain.
        """
        return pulumi.get(self, "tls_subscription_ids")


class AwaitableGetTlsDomainResult(GetTlsDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTlsDomainResult(
            domain=self.domain,
            id=self.id,
            tls_activation_ids=self.tls_activation_ids,
            tls_certificate_ids=self.tls_certificate_ids,
            tls_subscription_ids=self.tls_subscription_ids)


def get_tls_domain(domain: Optional[str] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTlsDomainResult:
    """
    Use this data source to get the IDs of activations, certificates and subscriptions associated with a domain.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_fastly as fastly

    domain = fastly.get_tls_domain(domain="example.com")
    ```


    :param str domain: Domain name to look up activations, certificates and subscriptions for.
    """
    __args__ = dict()
    __args__['domain'] = domain
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('fastly:index/getTlsDomain:getTlsDomain', __args__, opts=opts, typ=GetTlsDomainResult).value

    return AwaitableGetTlsDomainResult(
        domain=__ret__.domain,
        id=__ret__.id,
        tls_activation_ids=__ret__.tls_activation_ids,
        tls_certificate_ids=__ret__.tls_certificate_ids,
        tls_subscription_ids=__ret__.tls_subscription_ids)