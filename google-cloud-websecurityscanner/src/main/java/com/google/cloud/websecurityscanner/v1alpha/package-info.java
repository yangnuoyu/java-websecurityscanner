/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Web Security Scanner API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================== WebSecurityScannerClient ========================
 *
 * <p>Service Description: Cloud Web Security Scanner Service identifies security vulnerabilities in
 * web applications hosted on Google Cloud Platform. It crawls your application, and attempts to
 * exercise as many user inputs and event handlers as possible.
 *
 * <p>Sample for WebSecurityScannerClient:
 *
 * <pre>
 * <code>
 * try (WebSecurityScannerClient webSecurityScannerClient = WebSecurityScannerClient.create()) {
 *   ScanConfigName name = ScanConfigName.of("[PROJECT]", "[SCAN_CONFIG]");
 *   webSecurityScannerClient.deleteScanConfig(name);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.websecurityscanner.v1alpha;

import javax.annotation.Generated;
