/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2017_09_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OutputType.
 */
public final class OutputType extends ExpandableStringEnum<OutputType> {
    /** Static value model for OutputType. */
    public static final OutputType MODEL = fromString("model");

    /** Static value logs for OutputType. */
    public static final OutputType LOGS = fromString("logs");

    /** Static value summary for OutputType. */
    public static final OutputType SUMMARY = fromString("summary");

    /** Static value custom for OutputType. */
    public static final OutputType CUSTOM = fromString("custom");

    /**
     * Creates or finds a OutputType from its string representation.
     * @param name a name to look for
     * @return the corresponding OutputType
     */
    @JsonCreator
    public static OutputType fromString(String name) {
        return fromString(name, OutputType.class);
    }

    /**
     * @return known OutputType values
     */
    public static Collection<OutputType> values() {
        return values(OutputType.class);
    }
}
