/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2020 MinIO, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.minio;

/** Argument class of @see #makeBucket(MakeBucketArgs args). */
public class MakeBucketArgs extends BucketArgs {
  private final boolean objectLock;

  private MakeBucketArgs(Builder builder) {
    super(builder);
    this.objectLock = builder.objectLock;
  }

  /** Returns object lock flag. */
  public boolean objectLock() {
    return objectLock;
  }

  public static Builder builder() {
    return new Builder();
  }

  /** Argument builder of @see #makeBucket(MakeBucketArgs args). */
  public static final class Builder extends BucketArgs.Builder<Builder> {
    private boolean objectLock;

    public Builder() {}

    public Builder objectLock(boolean objectLock) {
      this.objectLock = objectLock;
      return this;
    }

    public MakeBucketArgs build() throws IllegalArgumentException {
      return new MakeBucketArgs(this);
    }
  }
}