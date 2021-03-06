/*
 * Copyright 2018 Comcast Cable Communications Management, LLC
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

package com.comcast.ip4s

object Examples {
  val localhost4: Ipv4Address = ipv4"127.0.0.1"
  val localhost6: Ipv6Address = ipv6"::1"

  val ssmv4: SourceSpecificMulticastJoin[Ipv4Address] =
    SourceSpecificMulticastJoin(localhost4, ssmipv4"232.10.10.10")
  val ssmv4WithPort: MulticastSocketAddress[SourceSpecificMulticastJoin, Ipv4Address] =
    MulticastSocketAddress(ssmv4, port"5555")

  val asmv4: AnySourceMulticastJoin[Ipv4Address] =
    AnySourceMulticastJoin(ssmipv4"232.10.10.10")
  val asmv4WithPort: MulticastSocketAddress[AnySourceMulticastJoin, Ipv4Address] =
    MulticastSocketAddress(asmv4, port"5555")
}
