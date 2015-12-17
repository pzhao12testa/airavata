/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.appcatalog.computeresource;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

/**
 * Enumeration of Airavata supported Job Submission Mechanisms for High Performance Computing Clusters.
 * 
 * SSH:
 *  Execute remote job submission commands using via secure shell protocol.
 * 
 * GRAM:
 *  Execute remote jobs via Globus GRAM service.
 * 
 * UNICORE:
 *  Execute remote jobs via Unicore services
 * 
 */
public enum JobSubmissionProtocol implements org.apache.thrift.TEnum {
  LOCAL(0),
  SSH(1),
  GLOBUS(2),
  UNICORE(3),
  CLOUD(4),
  SSH_FORK(5),
  LOCAL_FORK(6);

  private final int value;

  private JobSubmissionProtocol(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static JobSubmissionProtocol findByValue(int value) { 
    switch (value) {
      case 0:
        return LOCAL;
      case 1:
        return SSH;
      case 2:
        return GLOBUS;
      case 3:
        return UNICORE;
      case 4:
        return CLOUD;
      case 5:
        return SSH_FORK;
      case 6:
        return LOCAL_FORK;
      default:
        return null;
    }
  }
}