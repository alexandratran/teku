/*
 * Copyright ConsenSys Software Inc., 2022
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.teku.spec.datastructures.execution;

import com.google.common.base.MoreObjects;
import java.util.Objects;

public class FallbackData {
  final ExecutionPayload executionPayload;
  final FallbackReason reason;

  public FallbackData(final ExecutionPayload executionPayload, final FallbackReason reason) {
    this.executionPayload = executionPayload;
    this.reason = reason;
  }

  public ExecutionPayload getExecutionPayload() {
    return executionPayload;
  }

  public FallbackReason getReason() {
    return reason;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final FallbackData that = (FallbackData) o;
    return Objects.equals(executionPayload, that.executionPayload) && reason == that.reason;
  }

  @Override
  public int hashCode() {
    return Objects.hash(executionPayload, reason);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("executionPayload", executionPayload)
        .add("reason", reason)
        .toString();
  }
}
