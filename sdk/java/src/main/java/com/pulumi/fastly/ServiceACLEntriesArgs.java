// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.fastly;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.fastly.inputs.ServiceACLEntriesEntryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceACLEntriesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceACLEntriesArgs Empty = new ServiceACLEntriesArgs();

    /**
     * The ID of the ACL that the items belong to
     * 
     */
    @Import(name="aclId", required=true)
    private Output<String> aclId;

    /**
     * @return The ID of the ACL that the items belong to
     * 
     */
    public Output<String> aclId() {
        return this.aclId;
    }

    /**
     * ACL Entries
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<ServiceACLEntriesEntryArgs>> entries;

    /**
     * @return ACL Entries
     * 
     */
    public Optional<Output<List<ServiceACLEntriesEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
    }

    /**
     * Whether to reapply changes if the state of the entries drifts, i.e. if entries are managed externally
     * 
     */
    @Import(name="manageEntries")
    private @Nullable Output<Boolean> manageEntries;

    /**
     * @return Whether to reapply changes if the state of the entries drifts, i.e. if entries are managed externally
     * 
     */
    public Optional<Output<Boolean>> manageEntries() {
        return Optional.ofNullable(this.manageEntries);
    }

    /**
     * The ID of the Service that the ACL belongs to
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The ID of the Service that the ACL belongs to
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private ServiceACLEntriesArgs() {}

    private ServiceACLEntriesArgs(ServiceACLEntriesArgs $) {
        this.aclId = $.aclId;
        this.entries = $.entries;
        this.manageEntries = $.manageEntries;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceACLEntriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceACLEntriesArgs $;

        public Builder() {
            $ = new ServiceACLEntriesArgs();
        }

        public Builder(ServiceACLEntriesArgs defaults) {
            $ = new ServiceACLEntriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclId The ID of the ACL that the items belong to
         * 
         * @return builder
         * 
         */
        public Builder aclId(Output<String> aclId) {
            $.aclId = aclId;
            return this;
        }

        /**
         * @param aclId The ID of the ACL that the items belong to
         * 
         * @return builder
         * 
         */
        public Builder aclId(String aclId) {
            return aclId(Output.of(aclId));
        }

        /**
         * @param entries ACL Entries
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<ServiceACLEntriesEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries ACL Entries
         * 
         * @return builder
         * 
         */
        public Builder entries(List<ServiceACLEntriesEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries ACL Entries
         * 
         * @return builder
         * 
         */
        public Builder entries(ServiceACLEntriesEntryArgs... entries) {
            return entries(List.of(entries));
        }

        /**
         * @param manageEntries Whether to reapply changes if the state of the entries drifts, i.e. if entries are managed externally
         * 
         * @return builder
         * 
         */
        public Builder manageEntries(@Nullable Output<Boolean> manageEntries) {
            $.manageEntries = manageEntries;
            return this;
        }

        /**
         * @param manageEntries Whether to reapply changes if the state of the entries drifts, i.e. if entries are managed externally
         * 
         * @return builder
         * 
         */
        public Builder manageEntries(Boolean manageEntries) {
            return manageEntries(Output.of(manageEntries));
        }

        /**
         * @param serviceId The ID of the Service that the ACL belongs to
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of the Service that the ACL belongs to
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public ServiceACLEntriesArgs build() {
            if ($.aclId == null) {
                throw new MissingRequiredPropertyException("ServiceACLEntriesArgs", "aclId");
            }
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("ServiceACLEntriesArgs", "serviceId");
            }
            return $;
        }
    }

}