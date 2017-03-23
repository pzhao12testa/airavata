/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */


namespace java org.apache.airavata.model.dbevent
namespace php Airavata.Model.Dbevent
namespace py apache.airavata.model.dbevent

enum CrudType {
    CREATE,
    READ,
    UPDATE,
    DELETE
}

enum DBEventType {
    PUBLISHER,
    SUBSCRIBER
}

struct DBEventPublisherContext {
    1:  required CrudType crudType,
    2:  required binary dataModel
}

struct DBEventPublisher {
    1:  required DBEventPublisherContext publisherContext
}

struct DBEventSubscriber {
    1:  required string subscriberService
}

union DBEventMessageContext {
    1:  DBEventPublisher publisher,
    2:  DBEventSubscriber subscriber
}

struct DBEventMessage {
    1:  required DBEventType dbEventType,
    2:  required DBEventMessageContext messageContext,
    3:  required string publisherService
}

