# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ConfigstoreArgs', 'Configstore']

@pulumi.input_type
class ConfigstoreArgs:
    def __init__(__self__, *,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Configstore resource.
        :param pulumi.Input[bool] force_destroy: Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        :param pulumi.Input[str] name: A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _ConfigstoreState:
    def __init__(__self__, *,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Configstore resources.
        :param pulumi.Input[bool] force_destroy: Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        :param pulumi.Input[str] name: A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Configstore(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a container that lets you store data in key-value pairs that are accessible to Compute@Edge services during request processing.

        In order for a Config Store (`Configstore`) to be accessible to a [Compute@Edge](https://developer.fastly.com/learning/compute/) service you'll first need to define a Compute service (`ServiceCompute`) in your configuration, and then create a link to the Config Store from within the service using the `resource_link` block (shown in the below examples).

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_fastly as fastly

        # IMPORTANT: Deleting a Config Store requires first deleting its resource_link.
        # This requires a two-step `pulumi up` as we can't guarantee deletion order.
        # e.g. resource_link deletion within fastly_service_compute might not finish first.
        example_configstore = fastly.Configstore("exampleConfigstore")
        example_package_hash = fastly.get_package_hash(filename="package.tar.gz")
        example_service_compute = fastly.ServiceCompute("exampleServiceCompute",
            domains=[fastly.ServiceComputeDomainArgs(
                name="demo.example.com",
            )],
            package=fastly.ServiceComputePackageArgs(
                filename="package.tar.gz",
                source_code_hash=example_package_hash.hash,
            ),
            resource_links=[fastly.ServiceComputeResourceLinkArgs(
                name="my_resource_link",
                resource_id=example_configstore.id,
            )],
            force_destroy=True)
        ```

        ## Import

        Fastly Config Stores can be imported using their Store ID, e.g.

        ```sh
         $ pulumi import fastly:index/configstore:Configstore example xxxxxxxxxxxxxxxxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force_destroy: Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        :param pulumi.Input[str] name: A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ConfigstoreArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a container that lets you store data in key-value pairs that are accessible to Compute@Edge services during request processing.

        In order for a Config Store (`Configstore`) to be accessible to a [Compute@Edge](https://developer.fastly.com/learning/compute/) service you'll first need to define a Compute service (`ServiceCompute`) in your configuration, and then create a link to the Config Store from within the service using the `resource_link` block (shown in the below examples).

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_fastly as fastly

        # IMPORTANT: Deleting a Config Store requires first deleting its resource_link.
        # This requires a two-step `pulumi up` as we can't guarantee deletion order.
        # e.g. resource_link deletion within fastly_service_compute might not finish first.
        example_configstore = fastly.Configstore("exampleConfigstore")
        example_package_hash = fastly.get_package_hash(filename="package.tar.gz")
        example_service_compute = fastly.ServiceCompute("exampleServiceCompute",
            domains=[fastly.ServiceComputeDomainArgs(
                name="demo.example.com",
            )],
            package=fastly.ServiceComputePackageArgs(
                filename="package.tar.gz",
                source_code_hash=example_package_hash.hash,
            ),
            resource_links=[fastly.ServiceComputeResourceLinkArgs(
                name="my_resource_link",
                resource_id=example_configstore.id,
            )],
            force_destroy=True)
        ```

        ## Import

        Fastly Config Stores can be imported using their Store ID, e.g.

        ```sh
         $ pulumi import fastly:index/configstore:Configstore example xxxxxxxxxxxxxxxxxxxx
        ```

        :param str resource_name: The name of the resource.
        :param ConfigstoreArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigstoreArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigstoreArgs.__new__(ConfigstoreArgs)

            __props__.__dict__["force_destroy"] = force_destroy
            __props__.__dict__["name"] = name
        super(Configstore, __self__).__init__(
            'fastly:index/configstore:Configstore',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Configstore':
        """
        Get an existing Configstore resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] force_destroy: Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        :param pulumi.Input[str] name: A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigstoreState.__new__(_ConfigstoreState)

        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["name"] = name
        return Configstore(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Allow the Config Store to be deleted, even if it contains entries. Defaults to false.
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        A unique name to identify the Config Store. It is important to note that changing this attribute will delete and recreate the Config Store, and discard the current entries. You MUST first delete the associated resource_link block from your service before modifying this field.
        """
        return pulumi.get(self, "name")
