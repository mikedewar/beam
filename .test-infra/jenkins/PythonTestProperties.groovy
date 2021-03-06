/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class PythonTestProperties {
  final static String LOWEST_SUPPORTED = '3.6'
  final static String HIGHEST_SUPPORTED = '3.8'
  final static List<String> ESSENTIAL_VERSIONS = [
    LOWEST_SUPPORTED,
    HIGHEST_SUPPORTED
  ]
  final static List<String> CROSS_LANGUAGE_VALIDATES_RUNNER_PYTHON_VERSIONS = ESSENTIAL_VERSIONS
  final static List<String> CROSS_LANGUAGE_VALIDATES_RUNNER_DATAFLOW_USING_JAVA_PYTHON_VERSIONS = ESSENTIAL_VERSIONS
  final static List<String> CROSS_LANGUAGE_VALIDATES_RUNNER_DATAFLOW_USING_SQL_PYTHON_VERSIONS = [HIGHEST_SUPPORTED]
  final static String LOAD_TEST_PYTHON_VERSION = '3.7'
}
