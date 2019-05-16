/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to get network configuration diagnostic.
 */
public class NetworkConfigurationDiagnosticParameters {
    /**
     * The ID of the target resource to perform network configuration
     * diagnostic. Valid options are VM, NetworkInterface,
     * VMSS/NetworkInterface and Application Gateway.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * List of traffic queries.
     */
    @JsonProperty(value = "queries", required = true)
    private List<TrafficQuery> queries;

    /**
     * Get the ID of the target resource to perform network configuration diagnostic. Valid options are VM, NetworkInterface, VMSS/NetworkInterface and Application Gateway.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the ID of the target resource to perform network configuration diagnostic. Valid options are VM, NetworkInterface, VMSS/NetworkInterface and Application Gateway.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get list of traffic queries.
     *
     * @return the queries value
     */
    public List<TrafficQuery> queries() {
        return this.queries;
    }

    /**
     * Set list of traffic queries.
     *
     * @param queries the queries value to set
     * @return the NetworkConfigurationDiagnosticParameters object itself.
     */
    public NetworkConfigurationDiagnosticParameters withQueries(List<TrafficQuery> queries) {
        this.queries = queries;
        return this;
    }

}