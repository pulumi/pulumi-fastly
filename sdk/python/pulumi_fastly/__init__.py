# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
from . import _utilities
import typing
# Export this package's modules as members:
from .alert import *
from .configstore import *
from .configstore_entries import *
from .custom_dashboard import *
from .domain_v1 import *
from .get_configstores import *
from .get_datacenters import *
from .get_dictionaries import *
from .get_fastly_ip_ranges import *
from .get_kvstores import *
from .get_package_hash import *
from .get_secretstores import *
from .get_services import *
from .get_tls_activation import *
from .get_tls_activation_ids import *
from .get_tls_certificate import *
from .get_tls_certificate_ids import *
from .get_tls_configuration import *
from .get_tls_configuration_ids import *
from .get_tls_domain import *
from .get_tls_platform_certificate import *
from .get_tls_platform_certificate_ids import *
from .get_tls_private_key import *
from .get_tls_private_key_ids import *
from .get_tls_subscription import *
from .get_tls_subscription_ids import *
from .get_vcl_snippets import *
from .integration import *
from .kvstore import *
from .object_storage_access_keys import *
from .provider import *
from .secretstore import *
from .service_acl_entries import *
from .service_authorization import *
from .service_compute import *
from .service_dictionary_items import *
from .service_dynamic_snippet_content import *
from .service_vcl import *
from .tls_activation import *
from .tls_certificate import *
from .tls_mutual_authentication import *
from .tls_platform_certificate import *
from .tls_private_key import *
from .tls_subscription import *
from .tls_subscription_validation import *
from .user import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_fastly.config as __config
    config = __config
else:
    config = _utilities.lazy_import('pulumi_fastly.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "fastly",
  "mod": "index/alert",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/alert:Alert": "Alert"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/configstore",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/configstore:Configstore": "Configstore"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/configstoreEntries",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/configstoreEntries:ConfigstoreEntries": "ConfigstoreEntries"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/customDashboard",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/customDashboard:CustomDashboard": "CustomDashboard"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/domainV1",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/domainV1:DomainV1": "DomainV1"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/integration",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/integration:Integration": "Integration"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/kvstore",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/kvstore:Kvstore": "Kvstore"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/objectStorageAccessKeys",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/objectStorageAccessKeys:ObjectStorageAccessKeys": "ObjectStorageAccessKeys"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/secretstore",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/secretstore:Secretstore": "Secretstore"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/serviceACLEntries",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/serviceACLEntries:ServiceACLEntries": "ServiceACLEntries"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/serviceAuthorization",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/serviceAuthorization:ServiceAuthorization": "ServiceAuthorization"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/serviceCompute",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/serviceCompute:ServiceCompute": "ServiceCompute"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/serviceDictionaryItems",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/serviceDictionaryItems:ServiceDictionaryItems": "ServiceDictionaryItems"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/serviceDynamicSnippetContent",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/serviceDynamicSnippetContent:ServiceDynamicSnippetContent": "ServiceDynamicSnippetContent"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/serviceVcl",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/serviceVcl:ServiceVcl": "ServiceVcl"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsActivation",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsActivation:TlsActivation": "TlsActivation"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsCertificate",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsCertificate:TlsCertificate": "TlsCertificate"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsMutualAuthentication",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsMutualAuthentication:TlsMutualAuthentication": "TlsMutualAuthentication"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsPlatformCertificate",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsPlatformCertificate:TlsPlatformCertificate": "TlsPlatformCertificate"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsPrivateKey",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsPrivateKey:TlsPrivateKey": "TlsPrivateKey"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsSubscription",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsSubscription:TlsSubscription": "TlsSubscription"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/tlsSubscriptionValidation",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/tlsSubscriptionValidation:TlsSubscriptionValidation": "TlsSubscriptionValidation"
  }
 },
 {
  "pkg": "fastly",
  "mod": "index/user",
  "fqn": "pulumi_fastly",
  "classes": {
   "fastly:index/user:User": "User"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "fastly",
  "token": "pulumi:providers:fastly",
  "fqn": "pulumi_fastly",
  "class": "Provider"
 }
]
"""
)
