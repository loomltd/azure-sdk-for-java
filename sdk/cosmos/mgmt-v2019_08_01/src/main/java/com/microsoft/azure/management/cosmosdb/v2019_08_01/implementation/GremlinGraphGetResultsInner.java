/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_08_01.IndexingPolicy;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ContainerPartitionKey;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.UniqueKeyPolicy;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ConflictResolutionPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2019_08_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB Gremlin graph.
 */
@JsonFlatten
public class GremlinGraphGetResultsInner extends ARMResourceProperties {
    /**
     * Name of the Cosmos DB Gremlin graph.
     */
    @JsonProperty(value = "properties.id", required = true)
    private String gremlinGraphGetResultsId;

    /**
     * The configuration of the indexing policy. By default, the indexing is
     * automatic for all document paths within the graph.
     */
    @JsonProperty(value = "properties.indexingPolicy")
    private IndexingPolicy indexingPolicy;

    /**
     * The configuration of the partition key to be used for partitioning data
     * into multiple partitions.
     */
    @JsonProperty(value = "properties.partitionKey")
    private ContainerPartitionKey partitionKey;

    /**
     * Default time to live.
     */
    @JsonProperty(value = "properties.defaultTtl")
    private Integer defaultTtl;

    /**
     * The unique key policy configuration for specifying uniqueness
     * constraints on documents in the collection in the Azure Cosmos DB
     * service.
     */
    @JsonProperty(value = "properties.uniqueKeyPolicy")
    private UniqueKeyPolicy uniqueKeyPolicy;

    /**
     * The conflict resolution policy for the graph.
     */
    @JsonProperty(value = "properties.conflictResolutionPolicy")
    private ConflictResolutionPolicy conflictResolutionPolicy;

    /**
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "properties._rid", access = JsonProperty.Access.WRITE_ONLY)
    private String _rid;

    /**
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "properties._ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object _ts;

    /**
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "properties._etag", access = JsonProperty.Access.WRITE_ONLY)
    private String _etag;

    /**
     * Get name of the Cosmos DB Gremlin graph.
     *
     * @return the gremlinGraphGetResultsId value
     */
    public String gremlinGraphGetResultsId() {
        return this.gremlinGraphGetResultsId;
    }

    /**
     * Set name of the Cosmos DB Gremlin graph.
     *
     * @param gremlinGraphGetResultsId the gremlinGraphGetResultsId value to set
     * @return the GremlinGraphGetResultsInner object itself.
     */
    public GremlinGraphGetResultsInner withGremlinGraphGetResultsId(String gremlinGraphGetResultsId) {
        this.gremlinGraphGetResultsId = gremlinGraphGetResultsId;
        return this;
    }

    /**
     * Get the configuration of the indexing policy. By default, the indexing is automatic for all document paths within the graph.
     *
     * @return the indexingPolicy value
     */
    public IndexingPolicy indexingPolicy() {
        return this.indexingPolicy;
    }

    /**
     * Set the configuration of the indexing policy. By default, the indexing is automatic for all document paths within the graph.
     *
     * @param indexingPolicy the indexingPolicy value to set
     * @return the GremlinGraphGetResultsInner object itself.
     */
    public GremlinGraphGetResultsInner withIndexingPolicy(IndexingPolicy indexingPolicy) {
        this.indexingPolicy = indexingPolicy;
        return this;
    }

    /**
     * Get the configuration of the partition key to be used for partitioning data into multiple partitions.
     *
     * @return the partitionKey value
     */
    public ContainerPartitionKey partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the configuration of the partition key to be used for partitioning data into multiple partitions.
     *
     * @param partitionKey the partitionKey value to set
     * @return the GremlinGraphGetResultsInner object itself.
     */
    public GremlinGraphGetResultsInner withPartitionKey(ContainerPartitionKey partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get default time to live.
     *
     * @return the defaultTtl value
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }

    /**
     * Set default time to live.
     *
     * @param defaultTtl the defaultTtl value to set
     * @return the GremlinGraphGetResultsInner object itself.
     */
    public GremlinGraphGetResultsInner withDefaultTtl(Integer defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * Get the unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     *
     * @return the uniqueKeyPolicy value
     */
    public UniqueKeyPolicy uniqueKeyPolicy() {
        return this.uniqueKeyPolicy;
    }

    /**
     * Set the unique key policy configuration for specifying uniqueness constraints on documents in the collection in the Azure Cosmos DB service.
     *
     * @param uniqueKeyPolicy the uniqueKeyPolicy value to set
     * @return the GremlinGraphGetResultsInner object itself.
     */
    public GremlinGraphGetResultsInner withUniqueKeyPolicy(UniqueKeyPolicy uniqueKeyPolicy) {
        this.uniqueKeyPolicy = uniqueKeyPolicy;
        return this;
    }

    /**
     * Get the conflict resolution policy for the graph.
     *
     * @return the conflictResolutionPolicy value
     */
    public ConflictResolutionPolicy conflictResolutionPolicy() {
        return this.conflictResolutionPolicy;
    }

    /**
     * Set the conflict resolution policy for the graph.
     *
     * @param conflictResolutionPolicy the conflictResolutionPolicy value to set
     * @return the GremlinGraphGetResultsInner object itself.
     */
    public GremlinGraphGetResultsInner withConflictResolutionPolicy(ConflictResolutionPolicy conflictResolutionPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        return this;
    }

    /**
     * Get a system generated property. A unique identifier.
     *
     * @return the _rid value
     */
    public String _rid() {
        return this._rid;
    }

    /**
     * Get a system generated property that denotes the last updated timestamp of the resource.
     *
     * @return the _ts value
     */
    public Object _ts() {
        return this._ts;
    }

    /**
     * Get a system generated property representing the resource etag required for optimistic concurrency control.
     *
     * @return the _etag value
     */
    public String _etag() {
        return this._etag;
    }

}
