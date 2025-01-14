// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details of the returned POI including information such as the name, phone, url address, and classifications. */
@Fluent
public final class PointOfInterest {
    /*
     * Name of the POI property
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Telephone number property
     */
    @JsonProperty(value = "phone", access = JsonProperty.Access.WRITE_ONLY)
    private String phone;

    /*
     * Website URL property
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * The list of the most specific POI categories
     */
    @JsonProperty(value = "categorySet", access = JsonProperty.Access.WRITE_ONLY)
    private List<PointOfInterestCategorySet> categorySet;

    /*
     * Categories array
     */
    @JsonProperty(value = "categories", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> categories;

    /*
     * Classification array
     */
    @JsonProperty(value = "classifications", access = JsonProperty.Access.WRITE_ONLY)
    private List<Classification> classifications;

    /*
     * Brands array. The name of the brand for the POI being returned.
     */
    @JsonProperty(value = "brands", access = JsonProperty.Access.WRITE_ONLY)
    private List<Brand> brands;

    /*
     * Opening hours for a POI (Points of Interest).
     */
    @JsonProperty(value = "openingHours")
    private OperatingHours operatingHours;

    /**
     * Get the name property: Name of the POI property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the phone property: Telephone number property.
     *
     * @return the phone value.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Get the url property: Website URL property.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the categorySet property: The list of the most specific POI categories.
     *
     * @return the categorySet value.
     */
    public List<PointOfInterestCategorySet> getCategorySet() {
        return this.categorySet;
    }

    /**
     * Get the categories property: Categories array.
     *
     * @return the categories value.
     */
    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * Get the classifications property: Classification array.
     *
     * @return the classifications value.
     */
    public List<Classification> getClassifications() {
        return this.classifications;
    }

    /**
     * Get the brands property: Brands array. The name of the brand for the POI being returned.
     *
     * @return the brands value.
     */
    public List<Brand> getBrands() {
        return this.brands;
    }

    /**
     * Get the operatingHours property: Opening hours for a POI (Points of Interest).
     *
     * @return the operatingHours value.
     */
    public OperatingHours getOperatingHours() {
        return this.operatingHours;
    }

    /**
     * Set the operatingHours property: Opening hours for a POI (Points of Interest).
     *
     * @param operatingHours the operatingHours value to set.
     * @return the PointOfInterest object itself.
     */
    public PointOfInterest setOperatingHours(OperatingHours operatingHours) {
        this.operatingHours = operatingHours;
        return this;
    }
}
