# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TlsPrivateKeyArgs', 'TlsPrivateKey']

@pulumi.input_type
class TlsPrivateKeyArgs:
    def __init__(__self__, *,
                 key_pem: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TlsPrivateKey resource.
        :param pulumi.Input[str] key_pem: Private key in PEM format.
        :param pulumi.Input[str] name: Customisable name of the private key.
        """
        pulumi.set(__self__, "key_pem", key_pem)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="keyPem")
    def key_pem(self) -> pulumi.Input[str]:
        """
        Private key in PEM format.
        """
        return pulumi.get(self, "key_pem")

    @key_pem.setter
    def key_pem(self, value: pulumi.Input[str]):
        pulumi.set(self, "key_pem", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Customisable name of the private key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TlsPrivateKeyState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 key_length: Optional[pulumi.Input[int]] = None,
                 key_pem: Optional[pulumi.Input[str]] = None,
                 key_type: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_key_sha1: Optional[pulumi.Input[str]] = None,
                 replace: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering TlsPrivateKey resources.
        :param pulumi.Input[str] created_at: Time-stamp (GMT) when the private key was created.
        :param pulumi.Input[int] key_length: The key length used to generate the private key.
        :param pulumi.Input[str] key_pem: Private key in PEM format.
        :param pulumi.Input[str] key_type: The algorithm used to generate the private key. Must be RSA.
        :param pulumi.Input[str] name: Customisable name of the private key.
        :param pulumi.Input[str] public_key_sha1: Useful for safely identifying the key.
        :param pulumi.Input[bool] replace: Whether Fastly recommends replacing this private key.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if key_length is not None:
            pulumi.set(__self__, "key_length", key_length)
        if key_pem is not None:
            pulumi.set(__self__, "key_pem", key_pem)
        if key_type is not None:
            pulumi.set(__self__, "key_type", key_type)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if public_key_sha1 is not None:
            pulumi.set(__self__, "public_key_sha1", public_key_sha1)
        if replace is not None:
            pulumi.set(__self__, "replace", replace)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        Time-stamp (GMT) when the private key was created.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="keyLength")
    def key_length(self) -> Optional[pulumi.Input[int]]:
        """
        The key length used to generate the private key.
        """
        return pulumi.get(self, "key_length")

    @key_length.setter
    def key_length(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "key_length", value)

    @property
    @pulumi.getter(name="keyPem")
    def key_pem(self) -> Optional[pulumi.Input[str]]:
        """
        Private key in PEM format.
        """
        return pulumi.get(self, "key_pem")

    @key_pem.setter
    def key_pem(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_pem", value)

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> Optional[pulumi.Input[str]]:
        """
        The algorithm used to generate the private key. Must be RSA.
        """
        return pulumi.get(self, "key_type")

    @key_type.setter
    def key_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "key_type", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Customisable name of the private key.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="publicKeySha1")
    def public_key_sha1(self) -> Optional[pulumi.Input[str]]:
        """
        Useful for safely identifying the key.
        """
        return pulumi.get(self, "public_key_sha1")

    @public_key_sha1.setter
    def public_key_sha1(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "public_key_sha1", value)

    @property
    @pulumi.getter
    def replace(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether Fastly recommends replacing this private key.
        """
        return pulumi.get(self, "replace")

    @replace.setter
    def replace(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "replace", value)


class TlsPrivateKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_pem: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Uploads a Custom TLS Private Key to Fastly. This can be combined with a `fastly_tls_custom_certificate` resource to provide a TLS Certificate able to be applied to a Fastly Service.

        The Private Key resource requires a key in PEM format, and a name to identify it.

        ## Import

        A Private Key can be imported using its ID, e.g.

        ```sh
         $ pulumi import fastly:index/tlsPrivateKey:TlsPrivateKey demo xxxxxxxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] key_pem: Private key in PEM format.
        :param pulumi.Input[str] name: Customisable name of the private key.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TlsPrivateKeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Uploads a Custom TLS Private Key to Fastly. This can be combined with a `fastly_tls_custom_certificate` resource to provide a TLS Certificate able to be applied to a Fastly Service.

        The Private Key resource requires a key in PEM format, and a name to identify it.

        ## Import

        A Private Key can be imported using its ID, e.g.

        ```sh
         $ pulumi import fastly:index/tlsPrivateKey:TlsPrivateKey demo xxxxxxxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param TlsPrivateKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TlsPrivateKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 key_pem: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TlsPrivateKeyArgs.__new__(TlsPrivateKeyArgs)

            if key_pem is None and not opts.urn:
                raise TypeError("Missing required property 'key_pem'")
            __props__.__dict__["key_pem"] = key_pem
            __props__.__dict__["name"] = name
            __props__.__dict__["created_at"] = None
            __props__.__dict__["key_length"] = None
            __props__.__dict__["key_type"] = None
            __props__.__dict__["public_key_sha1"] = None
            __props__.__dict__["replace"] = None
        super(TlsPrivateKey, __self__).__init__(
            'fastly:index/tlsPrivateKey:TlsPrivateKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            key_length: Optional[pulumi.Input[int]] = None,
            key_pem: Optional[pulumi.Input[str]] = None,
            key_type: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            public_key_sha1: Optional[pulumi.Input[str]] = None,
            replace: Optional[pulumi.Input[bool]] = None) -> 'TlsPrivateKey':
        """
        Get an existing TlsPrivateKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: Time-stamp (GMT) when the private key was created.
        :param pulumi.Input[int] key_length: The key length used to generate the private key.
        :param pulumi.Input[str] key_pem: Private key in PEM format.
        :param pulumi.Input[str] key_type: The algorithm used to generate the private key. Must be RSA.
        :param pulumi.Input[str] name: Customisable name of the private key.
        :param pulumi.Input[str] public_key_sha1: Useful for safely identifying the key.
        :param pulumi.Input[bool] replace: Whether Fastly recommends replacing this private key.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TlsPrivateKeyState.__new__(_TlsPrivateKeyState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["key_length"] = key_length
        __props__.__dict__["key_pem"] = key_pem
        __props__.__dict__["key_type"] = key_type
        __props__.__dict__["name"] = name
        __props__.__dict__["public_key_sha1"] = public_key_sha1
        __props__.__dict__["replace"] = replace
        return TlsPrivateKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        Time-stamp (GMT) when the private key was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="keyLength")
    def key_length(self) -> pulumi.Output[int]:
        """
        The key length used to generate the private key.
        """
        return pulumi.get(self, "key_length")

    @property
    @pulumi.getter(name="keyPem")
    def key_pem(self) -> pulumi.Output[str]:
        """
        Private key in PEM format.
        """
        return pulumi.get(self, "key_pem")

    @property
    @pulumi.getter(name="keyType")
    def key_type(self) -> pulumi.Output[str]:
        """
        The algorithm used to generate the private key. Must be RSA.
        """
        return pulumi.get(self, "key_type")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Customisable name of the private key.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="publicKeySha1")
    def public_key_sha1(self) -> pulumi.Output[str]:
        """
        Useful for safely identifying the key.
        """
        return pulumi.get(self, "public_key_sha1")

    @property
    @pulumi.getter
    def replace(self) -> pulumi.Output[bool]:
        """
        Whether Fastly recommends replacing this private key.
        """
        return pulumi.get(self, "replace")
