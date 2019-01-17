/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SyncMemberInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2015_05_01_preview.implementation.SqlManager;
import java.util.UUID;

/**
 * Type representing SyncMember.
 */
public interface SyncMember extends HasInner<SyncMemberInner>, Indexable, Refreshable<SyncMember>, Updatable<SyncMember.Update>, HasManager<SqlManager> {
    /**
     * @return the databaseName value.
     */
    String databaseName();

    /**
     * @return the databaseType value.
     */
    SyncMemberDbType databaseType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the password value.
     */
    String password();

    /**
     * @return the serverName value.
     */
    String serverName();

    /**
     * @return the sqlServerDatabaseId value.
     */
    UUID sqlServerDatabaseId();

    /**
     * @return the syncAgentId value.
     */
    String syncAgentId();

    /**
     * @return the syncDirection value.
     */
    SyncDirection syncDirection();

    /**
     * @return the syncState value.
     */
    SyncMemberState syncState();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the userName value.
     */
    String userName();

    /**
     * The entirety of the SyncMember definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSyncGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SyncMember definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SyncMember definition.
         */
        interface Blank extends WithSyncGroup {
        }

        /**
         * The stage of the syncmember definition allowing to specify SyncGroup.
         */
        interface WithSyncGroup {
           /**
            * Specifies resourceGroupName, serverName, databaseName, syncGroupName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param databaseName The name of the database on which the sync group is hosted
            * @param syncGroupName The name of the sync group on which the sync member is hosted
            * @return the next definition stage
            */
            WithCreate withExistingSyncGroup(String resourceGroupName, String serverName, String databaseName, String syncGroupName);
        }

        /**
         * The stage of the syncmember definition allowing to specify DatabaseName.
         */
        interface WithDatabaseName {
            /**
             * Specifies databaseName.
             * @param databaseName Database name of the member database in the sync member
             * @return the next definition stage
             */
            WithCreate withDatabaseName(String databaseName);
        }

        /**
         * The stage of the syncmember definition allowing to specify DatabaseType.
         */
        interface WithDatabaseType {
            /**
             * Specifies databaseType.
             * @param databaseType Database type of the sync member. Possible values include: 'AzureSqlDatabase', 'SqlServerDatabase'
             * @return the next definition stage
             */
            WithCreate withDatabaseType(SyncMemberDbType databaseType);
        }

        /**
         * The stage of the syncmember definition allowing to specify Password.
         */
        interface WithPassword {
            /**
             * Specifies password.
             * @param password Password of the member database in the sync member
             * @return the next definition stage
             */
            WithCreate withPassword(String password);
        }

        /**
         * The stage of the syncmember definition allowing to specify ServerName.
         */
        interface WithServerName {
            /**
             * Specifies serverName.
             * @param serverName Server name of the member database in the sync member
             * @return the next definition stage
             */
            WithCreate withServerName(String serverName);
        }

        /**
         * The stage of the syncmember definition allowing to specify SqlServerDatabaseId.
         */
        interface WithSqlServerDatabaseId {
            /**
             * Specifies sqlServerDatabaseId.
             * @param sqlServerDatabaseId SQL Server database id of the sync member
             * @return the next definition stage
             */
            WithCreate withSqlServerDatabaseId(UUID sqlServerDatabaseId);
        }

        /**
         * The stage of the syncmember definition allowing to specify SyncAgentId.
         */
        interface WithSyncAgentId {
            /**
             * Specifies syncAgentId.
             * @param syncAgentId ARM resource id of the sync agent in the sync member
             * @return the next definition stage
             */
            WithCreate withSyncAgentId(String syncAgentId);
        }

        /**
         * The stage of the syncmember definition allowing to specify SyncDirection.
         */
        interface WithSyncDirection {
            /**
             * Specifies syncDirection.
             * @param syncDirection Sync direction of the sync member. Possible values include: 'Bidirectional', 'OneWayMemberToHub', 'OneWayHubToMember'
             * @return the next definition stage
             */
            WithCreate withSyncDirection(SyncDirection syncDirection);
        }

        /**
         * The stage of the syncmember definition allowing to specify UserName.
         */
        interface WithUserName {
            /**
             * Specifies userName.
             * @param userName User name of the member database in the sync member
             * @return the next definition stage
             */
            WithCreate withUserName(String userName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SyncMember>, DefinitionStages.WithDatabaseName, DefinitionStages.WithDatabaseType, DefinitionStages.WithPassword, DefinitionStages.WithServerName, DefinitionStages.WithSqlServerDatabaseId, DefinitionStages.WithSyncAgentId, DefinitionStages.WithSyncDirection, DefinitionStages.WithUserName {
        }
    }
    /**
     * The template for a SyncMember update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SyncMember>, UpdateStages.WithDatabaseName, UpdateStages.WithDatabaseType, UpdateStages.WithPassword, UpdateStages.WithServerName, UpdateStages.WithSqlServerDatabaseId, UpdateStages.WithSyncAgentId, UpdateStages.WithSyncDirection, UpdateStages.WithUserName {
    }

    /**
     * Grouping of SyncMember update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the syncmember update allowing to specify DatabaseName.
         */
        interface WithDatabaseName {
            /**
             * Specifies databaseName.
             * @param databaseName Database name of the member database in the sync member
             * @return the next update stage
             */
            Update withDatabaseName(String databaseName);
        }

        /**
         * The stage of the syncmember update allowing to specify DatabaseType.
         */
        interface WithDatabaseType {
            /**
             * Specifies databaseType.
             * @param databaseType Database type of the sync member. Possible values include: 'AzureSqlDatabase', 'SqlServerDatabase'
             * @return the next update stage
             */
            Update withDatabaseType(SyncMemberDbType databaseType);
        }

        /**
         * The stage of the syncmember update allowing to specify Password.
         */
        interface WithPassword {
            /**
             * Specifies password.
             * @param password Password of the member database in the sync member
             * @return the next update stage
             */
            Update withPassword(String password);
        }

        /**
         * The stage of the syncmember update allowing to specify ServerName.
         */
        interface WithServerName {
            /**
             * Specifies serverName.
             * @param serverName Server name of the member database in the sync member
             * @return the next update stage
             */
            Update withServerName(String serverName);
        }

        /**
         * The stage of the syncmember update allowing to specify SqlServerDatabaseId.
         */
        interface WithSqlServerDatabaseId {
            /**
             * Specifies sqlServerDatabaseId.
             * @param sqlServerDatabaseId SQL Server database id of the sync member
             * @return the next update stage
             */
            Update withSqlServerDatabaseId(UUID sqlServerDatabaseId);
        }

        /**
         * The stage of the syncmember update allowing to specify SyncAgentId.
         */
        interface WithSyncAgentId {
            /**
             * Specifies syncAgentId.
             * @param syncAgentId ARM resource id of the sync agent in the sync member
             * @return the next update stage
             */
            Update withSyncAgentId(String syncAgentId);
        }

        /**
         * The stage of the syncmember update allowing to specify SyncDirection.
         */
        interface WithSyncDirection {
            /**
             * Specifies syncDirection.
             * @param syncDirection Sync direction of the sync member. Possible values include: 'Bidirectional', 'OneWayMemberToHub', 'OneWayHubToMember'
             * @return the next update stage
             */
            Update withSyncDirection(SyncDirection syncDirection);
        }

        /**
         * The stage of the syncmember update allowing to specify UserName.
         */
        interface WithUserName {
            /**
             * Specifies userName.
             * @param userName User name of the member database in the sync member
             * @return the next update stage
             */
            Update withUserName(String userName);
        }

    }
}