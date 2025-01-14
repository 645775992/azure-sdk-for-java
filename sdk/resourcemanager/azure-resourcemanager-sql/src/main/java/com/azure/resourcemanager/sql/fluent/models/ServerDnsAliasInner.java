// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A server DNS alias. */
@Fluent
public final class ServerDnsAliasInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private ServerDnsAliasProperties innerProperties;

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private ServerDnsAliasProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the azureDnsRecord property: The fully qualified DNS record for alias.
     *
     * @return the azureDnsRecord value.
     */
    public String azureDnsRecord() {
        return this.innerProperties() == null ? null : this.innerProperties().azureDnsRecord();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
