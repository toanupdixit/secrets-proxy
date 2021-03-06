/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oneops.proxy.keywhiz.model;

import static com.google.common.base.Strings.repeat;

import com.fasterxml.jackson.annotation.*;
import com.google.auto.value.AutoValue;
import com.google.common.base.MoreObjects;

@AutoValue
public abstract class LoginRequest {
  @JsonCreator
  public static LoginRequest from(
      @JsonProperty("username") String username, @JsonProperty("password") char[] password) {
    return new AutoValue_LoginRequest(username, password);
  }

  @JsonProperty
  public abstract String username();

  @SuppressWarnings("mutable")
  @JsonProperty
  public abstract char[] password();

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .add("username", username())
        .add("password", repeat("*", password().length))
        .toString();
  }
}
