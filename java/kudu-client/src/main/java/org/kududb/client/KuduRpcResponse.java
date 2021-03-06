// Copyright 2014 Cloudera, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package org.kududb.client;

import org.kududb.annotations.InterfaceAudience;

/**
 * Base class for RPC responses.
 */
@InterfaceAudience.Private
abstract class KuduRpcResponse {
  private final long elapsedMillis;
  private final String tsUUID;

  /**
   * Constructor with information common to all RPCs.
   * @param elapsedMillis Time in milliseconds since RPC creation to now.
   * @param tsUUID A string that contains the UUID of the server that answered the RPC.
   */
  KuduRpcResponse(long elapsedMillis, String tsUUID) {
    this.elapsedMillis = elapsedMillis;
    this.tsUUID = tsUUID;
  }

  /**
   * Get the number of milliseconds elapsed since the RPC was created up to the moment when this
   * response was created.
   * @return Elapsed time in milliseconds.
   */
  public long getElapsedMillis() {
    return elapsedMillis;
  }

  /**
   * Get the identifier of the tablet server that sent the response.
   * @return A string containing a UUID.
   */
  public String getTsUUID() {
    return tsUUID;
  }
}
