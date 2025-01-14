// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FqdnEndpointsProperties model. */
@Fluent
public final class FqdnEndpointsProperties {
    /*
     * The category property.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The endpoints property.
     */
    @JsonProperty(value = "endpoints")
    private List<FqdnEndpoint> endpoints;

    /**
     * Get the category property: The category property.
     *
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: The category property.
     *
     * @param category the category value to set.
     * @return the FqdnEndpointsProperties object itself.
     */
    public FqdnEndpointsProperties withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints property.
     *
     * @return the endpoints value.
     */
    public List<FqdnEndpoint> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints property.
     *
     * @param endpoints the endpoints value to set.
     * @return the FqdnEndpointsProperties object itself.
     */
    public FqdnEndpointsProperties withEndpoints(List<FqdnEndpoint> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
    }
}
