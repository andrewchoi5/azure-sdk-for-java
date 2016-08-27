/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties supplied to CreateOrUpdate redis operation.
 */
public class RedisProperties {
    /**
     * RedisVersion parameter has been deprecated. As such, it is no longer
     * necessary to provide this parameter and any value specified is ignored.
     */
    private String redisVersion;

    /**
     * What sku of redis cache to deploy.
     */
    @JsonProperty(required = true)
    private Sku sku;

    /**
     * All Redis Settings. Few possible keys:
     * rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value
     * etc.
     */
    private Map<String, String> redisConfiguration;

    /**
     * If the value is true, then the non-ssl redis server port (6379) will be
     * enabled.
     */
    private Boolean enableNonSslPort;

    /**
     * tenantSettings.
     */
    private Map<String, String> tenantSettings;

    /**
     * The number of shards to be created on a Premium Cluster Cache.
     */
    private Integer shardCount;

    /**
     * The full resource ID of a subnet in a virtual network to deploy the
     * redis cache in. Example format:
     * /subscriptions/{subid}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1.
     */
    private String subnetId;

    /**
     * Required when deploying a redis cache inside an existing Azure Virtual
     * Network.
     */
    private String staticIP;

    /**
     * Get the redisVersion value.
     *
     * @return the redisVersion value
     */
    public String redisVersion() {
        return this.redisVersion;
    }

    /**
     * Set the redisVersion value.
     *
     * @param redisVersion the redisVersion value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withRedisVersion(String redisVersion) {
        this.redisVersion = redisVersion;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the redisConfiguration value.
     *
     * @return the redisConfiguration value
     */
    public Map<String, String> redisConfiguration() {
        return this.redisConfiguration;
    }

    /**
     * Set the redisConfiguration value.
     *
     * @param redisConfiguration the redisConfiguration value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withRedisConfiguration(Map<String, String> redisConfiguration) {
        this.redisConfiguration = redisConfiguration;
        return this;
    }

    /**
     * Get the enableNonSslPort value.
     *
     * @return the enableNonSslPort value
     */
    public Boolean enableNonSslPort() {
        return this.enableNonSslPort;
    }

    /**
     * Set the enableNonSslPort value.
     *
     * @param enableNonSslPort the enableNonSslPort value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withEnableNonSslPort(Boolean enableNonSslPort) {
        this.enableNonSslPort = enableNonSslPort;
        return this;
    }

    /**
     * Get the tenantSettings value.
     *
     * @return the tenantSettings value
     */
    public Map<String, String> tenantSettings() {
        return this.tenantSettings;
    }

    /**
     * Set the tenantSettings value.
     *
     * @param tenantSettings the tenantSettings value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withTenantSettings(Map<String, String> tenantSettings) {
        this.tenantSettings = tenantSettings;
        return this;
    }

    /**
     * Get the shardCount value.
     *
     * @return the shardCount value
     */
    public Integer shardCount() {
        return this.shardCount;
    }

    /**
     * Set the shardCount value.
     *
     * @param shardCount the shardCount value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }

    /**
     * Get the subnetId value.
     *
     * @return the subnetId value
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId value.
     *
     * @param subnetId the subnetId value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Get the staticIP value.
     *
     * @return the staticIP value
     */
    public String staticIP() {
        return this.staticIP;
    }

    /**
     * Set the staticIP value.
     *
     * @param staticIP the staticIP value to set
     * @return the RedisProperties object itself.
     */
    public RedisProperties withStaticIP(String staticIP) {
        this.staticIP = staticIP;
        return this;
    }

}
