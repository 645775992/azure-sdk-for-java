// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VirtualNetworksInner;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksListResult;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualNetworksListResultTests {
    @Test
    public void testDeserialize() {
        VirtualNetworksListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"vipPool\":[],\"vmipPool\":[],\"dhcpServers\":[],\"dnsServers\":[],\"gateway\":\"fdsd\",\"ipAddressPrefix\":\"kgtdlmkkze\",\"vlanID\":\"l\",\"provisioningState\":\"Accepted\"},\"extendedLocation\":{\"type\":\"sttwvogvbbe\",\"name\":\"cngqqmoakufgmjz\"},\"location\":\"wr\",\"tags\":{\"bminrfdwoyuhhzi\":\"twaenuuzko\",\"zqhof\":\"iefozbhdmsml\",\"ah\":\"rmaequ\"},\"id\":\"icslfaoq\",\"name\":\"piyylhalnswhccsp\",\"type\":\"kaivwit\"}],\"nextLink\":\"cywuggwol\"}")
                .toObject(VirtualNetworksListResult.class);
        Assertions.assertEquals("wr", model.value().get(0).location());
        Assertions.assertEquals("twaenuuzko", model.value().get(0).tags().get("bminrfdwoyuhhzi"));
        Assertions.assertEquals("sttwvogvbbe", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("cngqqmoakufgmjz", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("cywuggwol", model.nextLink());
    }

    @Test
    public void testSerialize() {
        VirtualNetworksListResult model =
            new VirtualNetworksListResult()
                .withValue(
                    Arrays
                        .asList(
                            new VirtualNetworksInner()
                                .withLocation("wr")
                                .withTags(
                                    mapOf("bminrfdwoyuhhzi", "twaenuuzko", "zqhof", "iefozbhdmsml", "ah", "rmaequ"))
                                .withProperties(
                                    new VirtualNetworksProperties()
                                        .withVipPool(Arrays.asList())
                                        .withVmipPool(Arrays.asList()))
                                .withExtendedLocation(
                                    new VirtualNetworksExtendedLocation()
                                        .withType("sttwvogvbbe")
                                        .withName("cngqqmoakufgmjz"))))
                .withNextLink("cywuggwol");
        model = BinaryData.fromObject(model).toObject(VirtualNetworksListResult.class);
        Assertions.assertEquals("wr", model.value().get(0).location());
        Assertions.assertEquals("twaenuuzko", model.value().get(0).tags().get("bminrfdwoyuhhzi"));
        Assertions.assertEquals("sttwvogvbbe", model.value().get(0).extendedLocation().type());
        Assertions.assertEquals("cngqqmoakufgmjz", model.value().get(0).extendedLocation().name());
        Assertions.assertEquals("cywuggwol", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
