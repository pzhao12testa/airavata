/*
 *
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
package org.apache.airavata.registry.core.entities.appcatalog;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * The primary key class for the batch_queue database table.
 * 
 */
public class BatchQueuePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COMPUTE_RESOURCE_ID", insertable=false, updatable=false)
	@Id
	private String computeResourceId;

	@Column(name="QUEUE_NAME")
	@Id
	private String queueName;

	public BatchQueuePK() {
	}

	public String getComputeResourceId() {
		return computeResourceId;
	}

	public void setComputeResourceId(String computeResourceId) {
		this.computeResourceId = computeResourceId;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BatchQueuePK)) {
			return false;
		}
		BatchQueuePK castOther = (BatchQueuePK)other;
		return 
			this.computeResourceId.equals(castOther.computeResourceId)
			&& this.queueName.equals(castOther.queueName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.computeResourceId.hashCode();
		hash = hash * prime + this.queueName.hashCode();
		
		return hash;
	}
}