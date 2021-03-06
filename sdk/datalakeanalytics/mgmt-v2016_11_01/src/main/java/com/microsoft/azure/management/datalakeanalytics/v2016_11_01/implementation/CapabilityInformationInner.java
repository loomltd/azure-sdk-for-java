/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.implementation;

import java.util.UUID;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.SubscriptionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription-level properties and limits for Data Lake Analytics.
 */
public class CapabilityInformationInner {
    /**
     * The subscription credentials that uniquely identifies the subscription.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID subscriptionId;

    /**
     * The subscription state. Possible values include: 'Registered',
     * 'Suspended', 'Deleted', 'Unregistered', 'Warned'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private SubscriptionState state;

    /**
     * The maximum supported number of accounts under this subscription.
     */
    @JsonProperty(value = "maxAccountCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxAccountCount;

    /**
     * The current number of accounts under this subscription.
     */
    @JsonProperty(value = "accountCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer accountCount;

    /**
     * The Boolean value of true or false to indicate the maintenance state.
     */
    @JsonProperty(value = "migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean migrationState;

    /**
     * Get the subscription credentials that uniquely identifies the subscription.
     *
     * @return the subscriptionId value
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the subscription state. Possible values include: 'Registered', 'Suspended', 'Deleted', 'Unregistered', 'Warned'.
     *
     * @return the state value
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Get the maximum supported number of accounts under this subscription.
     *
     * @return the maxAccountCount value
     */
    public Integer maxAccountCount() {
        return this.maxAccountCount;
    }

    /**
     * Get the current number of accounts under this subscription.
     *
     * @return the accountCount value
     */
    public Integer accountCount() {
        return this.accountCount;
    }

    /**
     * Get the Boolean value of true or false to indicate the maintenance state.
     *
     * @return the migrationState value
     */
    public Boolean migrationState() {
        return this.migrationState;
    }

}
