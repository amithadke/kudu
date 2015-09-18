// Copyright (c) 2014, Cloudera, inc.
// Confidential Cloudera Information: Covered by NDA.
package org.kududb.client;

import org.kududb.annotations.InterfaceAudience;
import org.kududb.annotations.InterfaceStability;

@InterfaceAudience.Private
public class CreateTableResponse extends KuduRpcResponse {

  /**
   * @param ellapsedMillis Time in milliseconds since RPC creation to now.
   */
  CreateTableResponse(long ellapsedMillis, String tsUUID) {
    super(ellapsedMillis, tsUUID);
  }
}