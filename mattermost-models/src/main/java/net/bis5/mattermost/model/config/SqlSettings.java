/*
 * Copyright (c) 2016-present, Takayuki Maruyama
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 */
package net.bis5.mattermost.model.config;

import java.util.List;

import lombok.Data;

/**
 * SQL settings
 * 
 * @author Takayuki Maruyama
 */
@Data
public class SqlSettings {

	private String driverName;
	private String dataSource;
	private List<String> dataSourceReplicas;
	private List<String> dataSourceSearchReplicas;
	private int maxIdleConns;
	private int maxOpenConns;
	private boolean trace;
	private String atRestEncryptKey;
	/** @since Mattermost Server 3.10 */
	private int queryTimeout;
	/** @since Mattermost Server 5.1 */
	private int connMaxLifetimeMilliseconds;
	/** @since Mattermost Server 5.4 */
	private boolean enablePublicChannelsMaterialization;
}
