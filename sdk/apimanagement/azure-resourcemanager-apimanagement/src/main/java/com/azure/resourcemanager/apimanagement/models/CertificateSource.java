// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CertificateSource. */
public final class CertificateSource extends ExpandableStringEnum<CertificateSource> {
    /** Static value Managed for CertificateSource. */
    public static final CertificateSource MANAGED = fromString("Managed");

    /** Static value KeyVault for CertificateSource. */
    public static final CertificateSource KEY_VAULT = fromString("KeyVault");

    /** Static value Custom for CertificateSource. */
    public static final CertificateSource CUSTOM = fromString("Custom");

    /** Static value BuiltIn for CertificateSource. */
    public static final CertificateSource BUILT_IN = fromString("BuiltIn");

    /**
     * Creates or finds a CertificateSource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateSource.
     */
    @JsonCreator
    public static CertificateSource fromString(String name) {
        return fromString(name, CertificateSource.class);
    }

    /** @return known CertificateSource values. */
    public static Collection<CertificateSource> values() {
        return values(CertificateSource.class);
    }
}
