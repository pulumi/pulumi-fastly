# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['IntegrationArgs', 'Integration']

@pulumi.input_type
class IntegrationArgs:
    def __init__(__self__, *,
                 config: pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]],
                 type: pulumi.Input[builtins.str],
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a Integration resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config: Configuration specific to the integration `type` (see documentation examples).
        :param pulumi.Input[builtins.str] type: Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        :param pulumi.Input[builtins.str] description: User submitted description of the integration.
        :param pulumi.Input[builtins.str] name: User submitted name of the integration.
        """
        pulumi.set(__self__, "config", config)
        pulumi.set(__self__, "type", type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]:
        """
        Configuration specific to the integration `type` (see documentation examples).
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[builtins.str]:
        """
        Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        User submitted description of the integration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        User submitted name of the integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _IntegrationState:
    def __init__(__self__, *,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering Integration resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config: Configuration specific to the integration `type` (see documentation examples).
        :param pulumi.Input[builtins.str] description: User submitted description of the integration.
        :param pulumi.Input[builtins.str] name: User submitted name of the integration.
        :param pulumi.Input[builtins.str] type: Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        """
        if config is not None:
            pulumi.set(__self__, "config", config)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]:
        """
        Configuration specific to the integration `type` (see documentation examples).
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        User submitted description of the integration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        User submitted name of the integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "type", value)


@pulumi.type_token("fastly:index/integration:Integration")
class Integration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_fastly as fastly

        mailinglist_example = fastly.Integration("mailinglist_example",
            name="my mailing list integration",
            description="example mailing list integration",
            type="mailinglist",
            config={
                "address": "incoming-hook@my.domain.com",
            })
        microsoftteams_example = fastly.Integration("microsoftteams_example",
            name="my Microsoft Teams integration",
            description="example Microsoft Teams integration",
            type="microsoftteams",
            config={
                "webhook": "https://m365x012345.webhook.office.com",
            })
        newrelic_example = fastly.Integration("newrelic_example",
            name="my New Relic integration",
            description="example New Relic integration",
            type="newrelic",
            config={
                "account": "XXXXXXX",
                "key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            })
        pagerduty_example = fastly.Integration("pagerduty_example",
            name="my PagerDuty integration",
            description="example PagerDuty integration",
            type="pagerduty",
            config={
                "key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            })
        slack_example = fastly.Integration("slack_example",
            name="my Slack integration",
            description="example Slack integration",
            type="slack",
            config={
                "webhook": "https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXXXXXXXXXXXXXXXXXX",
            })
        webhook_example = fastly.Integration("webhook_example",
            name="my webhook integration",
            description="example webhook integration",
            type="webhook",
            config={
                "webhook": "https://my.domain.com/webhook",
            })
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config: Configuration specific to the integration `type` (see documentation examples).
        :param pulumi.Input[builtins.str] description: User submitted description of the integration.
        :param pulumi.Input[builtins.str] name: User submitted name of the integration.
        :param pulumi.Input[builtins.str] type: Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_fastly as fastly

        mailinglist_example = fastly.Integration("mailinglist_example",
            name="my mailing list integration",
            description="example mailing list integration",
            type="mailinglist",
            config={
                "address": "incoming-hook@my.domain.com",
            })
        microsoftteams_example = fastly.Integration("microsoftteams_example",
            name="my Microsoft Teams integration",
            description="example Microsoft Teams integration",
            type="microsoftteams",
            config={
                "webhook": "https://m365x012345.webhook.office.com",
            })
        newrelic_example = fastly.Integration("newrelic_example",
            name="my New Relic integration",
            description="example New Relic integration",
            type="newrelic",
            config={
                "account": "XXXXXXX",
                "key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            })
        pagerduty_example = fastly.Integration("pagerduty_example",
            name="my PagerDuty integration",
            description="example PagerDuty integration",
            type="pagerduty",
            config={
                "key": "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",
            })
        slack_example = fastly.Integration("slack_example",
            name="my Slack integration",
            description="example Slack integration",
            type="slack",
            config={
                "webhook": "https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXXXXXXXXXXXXXXXXXX",
            })
        webhook_example = fastly.Integration("webhook_example",
            name="my webhook integration",
            description="example webhook integration",
            type="webhook",
            config={
                "webhook": "https://my.domain.com/webhook",
            })
        ```

        :param str resource_name: The name of the resource.
        :param IntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
                 description: Optional[pulumi.Input[builtins.str]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 type: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationArgs.__new__(IntegrationArgs)

            if config is None and not opts.urn:
                raise TypeError("Missing required property 'config'")
            __props__.__dict__["config"] = None if config is None else pulumi.Output.secret(config)
            __props__.__dict__["description"] = description
            __props__.__dict__["name"] = name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["config"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Integration, __self__).__init__(
            'fastly:index/integration:Integration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config: Optional[pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]]] = None,
            description: Optional[pulumi.Input[builtins.str]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            type: Optional[pulumi.Input[builtins.str]] = None) -> 'Integration':
        """
        Get an existing Integration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[builtins.str]]] config: Configuration specific to the integration `type` (see documentation examples).
        :param pulumi.Input[builtins.str] description: User submitted description of the integration.
        :param pulumi.Input[builtins.str] name: User submitted name of the integration.
        :param pulumi.Input[builtins.str] type: Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationState.__new__(_IntegrationState)

        __props__.__dict__["config"] = config
        __props__.__dict__["description"] = description
        __props__.__dict__["name"] = name
        __props__.__dict__["type"] = type
        return Integration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output[Mapping[str, builtins.str]]:
        """
        Configuration specific to the integration `type` (see documentation examples).
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        User submitted description of the integration.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        User submitted name of the integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[builtins.str]:
        """
        Type of the integration. One of: `mailinglist`, `microsoftteams`, `newrelic`, `pagerduty`, `slack`, `webhook`.
        """
        return pulumi.get(self, "type")

