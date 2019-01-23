/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.common.utils;

import org.apache.airavata.common.exception.ApplicationSettingsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.sql.Connection;

public class DBInitializer {
    private static final Logger logger = LoggerFactory.getLogger(DBInitializer.class);

    private static final String START_DERBY_ENABLE = "start.derby.server.mode";

    private JDBCConfig jdbcConfig;
    private String initScriptPrefix;
    private String checkTableName;

    public DBInitializer(JDBCConfig jdbcConfig, String initScriptPrefix, String checkTableName) {
        this.jdbcConfig = jdbcConfig;
        this.initScriptPrefix = initScriptPrefix;
        this.checkTableName = checkTableName;
    }

    public static void initializeDB(DBInitConfig dbInitConfig) {

        JDBCConfig jdbcConfig = dbInitConfig.getJDBCConfig();
        DBInitializer dbInitializer = new DBInitializer(jdbcConfig, dbInitConfig.getDBInitScriptPrefix(), dbInitConfig.getCheckTableName());
        dbInitializer.initializeDB();
        dbInitConfig.postInit();
    }

    public void initializeDB() {
        // Create connection
        Connection conn = null;
        try {
            DBUtil dbUtil = new DBUtil(jdbcConfig);
            conn = dbUtil.getConnection();
            if (DatabaseCreator.getDatabaseType(conn) == DatabaseCreator.DatabaseType.derby && isDerbyStartEnabled()) {
                startDerbyInServerMode();
            }
            if (!DatabaseCreator.isDatabaseStructureCreated(checkTableName, conn)) {
                DatabaseCreator.createRegistryDatabase(initScriptPrefix, conn);
                logger.info("New Database created from " + initScriptPrefix + " !!!");
            } else {
                logger.info("Table " + checkTableName + " already exists. Skipping database init script " + initScriptPrefix);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize database for " + initScriptPrefix, e);
        } finally {
            if (conn != null) {
                DBUtil.cleanup(conn);
            }
        }

    }

    private boolean isDerbyStartEnabled(){
        try {
            String s = ServerSettings.getSetting(START_DERBY_ENABLE);
            if("true".equals(s)){
                return true;
            }
        }  catch (ApplicationSettingsException e) {
            logger.error("Unable to read airavata server properties", e.getMessage(), e);
            return false;
        }
        return false;
    }

    private void startDerbyInServerMode() {
        try {
            DerbyUtil.startDerbyInServerMode("0.0.0.0", getPort(jdbcConfig.getURL()), jdbcConfig.getUser(), jdbcConfig.getPassword());
        } catch (Exception e) {
            throw new RuntimeException("Unable to start Derby in server mode", e);
        }
    }

    private int getPort(String jdbcURL){
        try{
            String cleanURI = jdbcURL.substring(5);
            URI uri = URI.create(cleanURI);
            return uri.getPort();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return -1;
        }
    }
}
